package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_run_testrail_tc_id
     
    /**
     * <p></p>
     */
    public static Object G_run_testrail_tc_status
     
    /**
     * <p></p>
     */
    public static Object G_testrail_run_id
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            G_run_testrail_tc_id = selectedVariables['G_run_testrail_tc_id']
            G_run_testrail_tc_status = selectedVariables['G_run_testrail_tc_status']
            G_testrail_run_id = selectedVariables['G_testrail_run_id']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
