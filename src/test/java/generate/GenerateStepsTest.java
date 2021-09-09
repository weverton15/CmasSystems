package generate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.TreeMap;

import static utils.Contants.*;

class GenerateStepsTest {

    private String stepOneResult = "1 2 CMAS 4 systems CMAS 7 8 CMAS systems 11 CMAS 13 14 CMASsystems 16 17 CMAS 19 systems";
    private String stepTwoResult = "1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems";

    @Test
    void testGenerateStepOne() {
        var stepOne = GenerateSteps.generateStepOne(20);
        Assertions.assertEquals(stepOne, stepOneResult);
    }

    @Test
    void testGenerateStepTwo() {
        var stepTwo = GenerateSteps.generateStepTwo(20);
        Assertions.assertEquals(stepTwo, stepTwoResult);
    }

    @Test
    void testGenerateStepThree() {
        var stepThree = GenerateSteps.generateStepThree(20);

        //AssertOne
        Assertions.assertEquals(stepThree.get(0), stepTwoResult);

        //AssertTwo
        var expected = new TreeMap() {{
            put(CMASSYSTEMS, 1);
            put(CMAS, 4);
            put(SYSTEMS, 3);
            put(GOOD, 2);
            put(INTEGERS, 10);
        }};
        Assertions.assertEquals(stepThree.get(1).toString(), expected.toString());
    }
}
