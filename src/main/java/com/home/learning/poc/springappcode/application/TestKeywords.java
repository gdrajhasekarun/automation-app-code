package com.home.learning.poc.springappcode.application;

import com.home.learning.poc.springlib.testdata.TestDataProvider;

public class TestKeywords {

    TestDataProvider testDataProvider;

    public TestKeywords(TestDataProvider testDataProvider) {
        this.testDataProvider = testDataProvider;
    }

    public void enterMemberDetails() {
        System.out.println(this.testDataProvider.getData("sheet1", "MemberId"));
        System.out.println(this.testDataProvider.getData("sheet1", "MemberName"));
    }
}
