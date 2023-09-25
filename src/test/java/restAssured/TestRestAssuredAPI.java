package restAssured;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.json.JSONArray;
import org.json.JSONObject;

//REST Assured is a popular Java library for simplifying and automating the testing of RESTful web services and APIs.
// It provides a domain specific language (DSL) that allows developers to write readable and expressive tests for RESTful APIs.
// REST Assured is often used in conjunction with testing frameworks like TestNG.RESTful API (Representational State Transfer API) is an architectural style for designing networked applications, particularly web services, that adhere to specific constraints and principles.RESTful APIs are designed to be simple, scalable, and stateless, making them well-suited for distributed systems and the World Wide Web.HTTP Methods: RESTful APIs use standard HTTP methods to perform actions on resources. The most commonly used HTTP methods are:
//GET: Retrieve data from the server (safe and idempotent).
//POST: Create a new resource on the server.
//PUT: Update an existing resource or create one if it doesn't exist (idempotent).
//DELETE: Remove a resource from the server (idempotent).
//Stateless: Each request from a client to the server must contain all the information necessary to understand and process the request. The server should not rely on any previous client requests or store client state.Representation: Resources can have multiple representations, such as JSON, XML, HTML, or others. Clients can request a specific representation using content negotiation (e.g., specifying the desired media type in the request header).RESTful APIs are widely used for building web services because of their simplicity and compatibility with the HTTP protocol. They are commonly used in web and mobile applications to retrieve, create, update, and delete data from servers.


//Successful (2xx):
//200 - OK: The request was successful, and the server has returned the requested data.
//201 - Created: The request has been fulfilled, and a new resource has been created as a result.
//204 - No Content: The request was successful, but there is no additional information to send back in the response body.
//Redirection (3xx):
//301 - Moved Permanently: The requested resource has permanently moved to a different URL, and the client should update its reference.
//302 - Found (Temporary Redirect): The requested resource temporarily resides under a different URL.
//304 - Not Modified: The client's cached copy of the resource is still valid; there is no need to transfer the resource again.
//Client Error (4xx):
//400 - Bad Request: The server could not understand the request due to invalid syntax or other client-side errors.
//401 - Unauthorized: Authentication is required to access the requested resource.
//403 - Forbidden: The client does not have permission to access the requested resource.
//404 - Not Found: The requested resource could not be found on the server.
//405 - Method Not Allowed: The HTTP method used in the request is not allowed for the requested resource.
//Server Error (5xx):
//500 - Internal Server Error: An unexpected server error occurred while processing the request.
//502 - Bad Gateway: The server, while acting as a gateway or proxy, received an invalid response from an upstream server.
//503 - Service Unavailable: The server is temporarily unable to handle the request due to maintenance or overloading.
//504 - Gateway Timeout: The server, while acting as a gateway or proxy, did not receive a timely response from an upstream server.

//SOAP is often used in enterprise-level applications, financial systems, and scenarios where strict security and reliability are essential.
//REST is commonly used for web APIs, mobile applications, public web services, and scenarios where simplicity and scalability are important.

public class TestRestAssuredAPI {
private String token = "2d3f043b90010b2ab13d8cac974888fa3296299b4762c87733ca4a07df5ed456";
private String baseURI = "https://gorest.co.in/public/v2";
private int userID = 5178397;

    @BeforeTest
    public void setUp(){
        RestAssured.baseURI = baseURI;
    }
    @Test(enabled = false)
    public void testGetRequest(){
        Response response = RestAssured.given()
                .when()
                .get("/users");

        int statusCode = response.getStatusCode();
        System.out.println("status: "+ statusCode);

        Assert.assertEquals(statusCode,200);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);

        JSONArray jsonArray = new JSONArray(responseBody);
        for (int i = 0; i < jsonArray.length();i++){
            JSONObject user = jsonArray.getJSONObject(i);
            Assert.assertTrue(user.has("id"));
            Assert.assertTrue(user.has("name"));
            Assert.assertTrue(user.has("email"));
            Assert.assertTrue(user.has("gender"));
            Assert.assertTrue(user.has("status"));
        }


    }

    @Test(enabled = false)
    public void testPostRequest(){
        RequestSpecification request  = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");

        String requestBody = "{"
                + "\"name\": \"Patrick\","
                + "\"email\": \"P@example.com\","
                + "\"gender\": \"male\","
                + "\"status\": \"active\""
                + "}";

        Response response = request.body(requestBody).post("/users");
        int statusCode = response.getStatusCode();
        System.out.println("status: "+ statusCode);
        Assert.assertEquals(statusCode,201);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);
        int newUserId = response.jsonPath().getInt("data.id");
        System.out.println("New User With Id: "+ newUserId);
    }
    @Test(enabled=false)
    public void testPutRequest(){

        RequestSpecification request  = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");

        String requestBody = "{"
                + "\"name\": \"Some Name\","
                + "\"email\": \"updateuser@example.com\","
                + "\"gender\": \"male\","
                + "\"status\": \"active\""
                + "}";

        Response response = request.body(requestBody).put("/users/" + userID);

        int statusCode = response.getStatusCode();
        System.out.println("status: "+ statusCode);
        Assert.assertEquals(statusCode,200);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);
    }

    @Test(enabled=true)
    public void testDeleteRequest(){

        Response response = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .when()
                .delete("/users/" + userID);

        int statusCode = response.getStatusCode();
        System.out.println("Response Status: " + statusCode);

    }

}