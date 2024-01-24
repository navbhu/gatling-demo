package com.example.gatling.scenario;

import com.example.gatling.api.Auth;
import static io.gatling.javaapi.core.CoreDsl.constantConcurrentUsers;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import io.gatling.javaapi.core.PopulationBuilder;
import java.time.Duration;

public class UserScenario {
    // Signup
    // Verify
    // Login
    // Create task
    // List tasks
    // Update task
    // Delete task(s)

    public static PopulationBuilder getUserScenario() {
        return scenario("Task").exec(Auth.signup()).injectClosed(constantConcurrentUsers(10).during(Duration.ofSeconds(10)));
    }
}
