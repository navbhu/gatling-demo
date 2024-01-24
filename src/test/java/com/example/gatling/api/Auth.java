package com.example.gatling.api;

import io.gatling.core.json.Json;
import io.gatling.javaapi.core.ChainBuilder;
import static io.gatling.javaapi.core.CoreDsl.StringBody;
import static io.gatling.javaapi.core.CoreDsl.exec;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;
import java.util.Map;

public class Auth {

    public static ChainBuilder signup() {
        return exec(http("User signup")
                .post("http://localhost:9191/auth/signup")
                .body(StringBody(Json.stringify(Map.of("email",
                        "asc@awd.com",  "emailReentered", "asc@awd.com",
                "password", "string"), true))).asJson()
                .check(status().is(200)));
    }
}
