package api;

import io.restassured.http.ContentType;
import models.resource.Root;
import models.resource.RootSingle;

import static io.restassured.RestAssured.given;

public class ApiResource {
    public Root getListResource() {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .get("api/unknown")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(Root.class);
    }

    public RootSingle getSingleResource(int id) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .get("api/unknown/" + id)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(RootSingle.class);
    }

    public RootSingle getNonexistentResource() {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .get("api/unknown/23")
                .then()
                .statusCode(404)
                .log().all()
                .extract().response().as(RootSingle.class);
    }
}
