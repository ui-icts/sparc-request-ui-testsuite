package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object username_admin
     
    /**
     * <p></p>
     */
    public static Object password_admin
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object url_fulfilment
     
    /**
     * <p></p>
     */
    public static Object pid
     
    /**
     * <p></p>
     */
    public static Object project_title
     
    /**
     * <p></p>
     */
    public static Object password_filepath
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['username' : '', 'password' : '', 'username_admin' : '', 'password_admin' : '', 'url' : '', 'url_fulfilment' : '', 'pid' : '', 'project_title' : '', 'password_filepath' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        username = selectedVariables['username']
        password = selectedVariables['password']
        username_admin = selectedVariables['username_admin']
        password_admin = selectedVariables['password_admin']
        url = selectedVariables['url']
        url_fulfilment = selectedVariables['url_fulfilment']
        pid = selectedVariables['pid']
        project_title = selectedVariables['project_title']
        password_filepath = selectedVariables['password_filepath']
        
    }
}
