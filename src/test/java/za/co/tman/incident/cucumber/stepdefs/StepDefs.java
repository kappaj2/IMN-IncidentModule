package za.co.tman.incident.cucumber.stepdefs;

import za.co.tman.incident.IncidentmoduleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IncidentmoduleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
