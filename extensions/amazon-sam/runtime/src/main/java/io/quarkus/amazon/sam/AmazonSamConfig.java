package io.quarkus.amazon.sam;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "amazon-sam", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class AmazonSamConfig {

    /**
     * The template file to create or update
     */
    @ConfigItem(name = "sam-template", defaultValue = "template.yaml")
    public String template;

    /**
     * Indicates if we are in debug mode.
     */
    @ConfigItem(defaultValue = "false")
    public boolean debug;

    /**
     * Indicates if we are in debug mode.
     */
    @ConfigItem(defaultValue = "false")
    public boolean updateConfig;

    /**
     * The name of the SAM resource
     */
    @ConfigItem(name = "resource-name")
    public String resourceName;

    @Override
    public String toString() {
        return "AmazonSamConfig{" +
                "debug=" + debug +
                ", resourceName='" + resourceName + '\'' +
                ", template='" + template + '\'' +
                '}';
    }
}