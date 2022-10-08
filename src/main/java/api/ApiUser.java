package api;

import io.restassured.http.ContentType;
import models.user.Root;
import models.user.RootDelayedResponse;
import models.user.RootListUsers;

import static io.restassured.RestAssured.given;

public class ApiUser {
    public Root getUser(int id) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .get("api/users/" + id)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(Root.class);
    }

    public RootListUsers getListOfUsers() {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .get("api/users?page=2")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(RootListUsers.class);
    }

    public Root getNonexistentUser() {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .get("api/users/23")
                .then()
                .statusCode(404)
                .log().all()
                .extract().response().as(Root.class);
    }

    public RootDelayedResponse getDelayedResponse() {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .get("api/users?delay=3")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(RootDelayedResponse.class);
    }
}
