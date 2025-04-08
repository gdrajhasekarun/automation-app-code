package com.home.learning.poc.springappcode.teststeps;

import com.home.learning.poc.springlib.annotation.TestSteps;
import com.home.learning.poc.springappcode.application.Keywords;
import com.home.learning.poc.springappcode.application.TestKeywords;
import com.home.learning.poc.springlib.testdata.TestDataProvider;

public class Steps {


    TestDataProvider testDataProvider;
    public Steps(TestDataProvider testDataProvider){
        this.testDataProvider = testDataProvider;
    }

    @TestSteps("login to Application")
    public void loginToApplication() {
        System.out.println("Logged in");
        new Keywords(this.testDataProvider).loginTest();
        new TestKeywords(this.testDataProvider).enterMemberDetails();
    }


}
