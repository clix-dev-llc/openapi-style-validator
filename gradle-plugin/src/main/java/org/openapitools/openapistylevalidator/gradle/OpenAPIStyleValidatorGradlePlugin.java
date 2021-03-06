package org.openapitools.openapistylevalidator.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class OpenAPIStyleValidatorGradlePlugin implements Plugin<Project> {

    public void apply(Project project) {
        project.getTasks().register("openAPIStyleValidator", OpenAPIStyleValidatorTask.class);
    }
}
