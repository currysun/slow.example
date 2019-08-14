import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/workspace/WebGUI/features/baidu.feature"},
        plugin = {"json:E:/workspace/WebGUI/target/cucumber-parallel/1.json"},
        monochrome = true,
        tags = {},
        glue = {"fast.common.glue"})
public class Parallel01IT {
}
