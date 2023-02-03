package com.hotelreservation.section4.lecture20;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteBookingTests extends BaseTest6 {

    @Test
    public void deleteBookingTest() {
        Response response = given(spec)
                .contentType(ContentType.JSON)
                .header("Cookie", "token=" + createToken())
                .when()
                .delete("/booking/" + createBookingId());

        response
                .then()
                .statusCode(201);
    }

}
