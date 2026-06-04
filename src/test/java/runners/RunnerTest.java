// ===============================
// RunnerTest.java
// ===============================

package runners;

import static io.cucumber.junit.platform.engine.Constants.*;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME,value = "steps,hooks")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report.html")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME,value = "@test")
public class RunnerTest {
}