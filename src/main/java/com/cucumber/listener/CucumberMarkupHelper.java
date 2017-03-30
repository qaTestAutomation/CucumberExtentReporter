package com.cucumber.listener;

import com.aventstack.extentreports.markuputils.Markup;

public class CucumberMarkupHelper {

    private CucumberMarkupHelper() {
        // Defeat instantiation
    }

    public static Markup createExampleTable(String[][] data) {
        ExamplesTableMarkup t = new ExamplesTableMarkup();
        t.setData(data);
        return t;
    }

    public static Markup createStepDataTable(String[][] data) {
        StepDataTableMarkup t = new StepDataTableMarkup();
        t.setData(data);
        return t;
    }

}
