package com.example.gatling.simulation;

import com.example.gatling.scenario.UserScenario;
import static io.gatling.javaapi.core.CoreDsl.constantConcurrentUsers;
import io.gatling.javaapi.core.Simulation;
import static io.gatling.javaapi.http.HttpDsl.http;
import java.time.Duration;

public class TaskSimulation extends Simulation {

    {
       setUp(UserScenario.getUserScenario()).protocols(http.baseUrl("http://localhost:9191")
               .disableFollowRedirect()
               .disableAutoReferer()
               .acceptHeader("application/json")
               .acceptEncodingHeader("gzip, deflate")
               .acceptLanguageHeader("de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7,es;q=0.6")
               .originHeader("http://localhost:9191")
               .shareConnections());
    }
}
