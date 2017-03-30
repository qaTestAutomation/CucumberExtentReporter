package com.cucumber.listener;

import com.aventstack.extentreports.markuputils.Markup;

public class StepDataTableMarkup implements Markup {
    private String[][] data;

    public void setData(String[][] data) {
        this.data = data;
    }

    public String[][] getData() {
        return data;
    }

    @Override
    public String getMarkup() {
        String colSpan = String.valueOf(data[0].length);
        StringBuilder sb = new StringBuilder();
        sb.append("<table class='bordered centered striped'>");
        sb.append("<thead><tr><th colspan='" + colSpan + "'>Data Table</th></tr></thead>");
        boolean tbodyFlag = false;
        for (int row = 0; row < data.length; row++) {
            if (!tbodyFlag) {
                sb.append("<tbody>");
                tbodyFlag = true;
            }
            sb.append("<tr>");
            for (int col = 0; col < data[row].length; col++) {
                sb.append("<td>" + data[row][col] + "</td>");
            }
            sb.append("</tr>");
        }
        sb.append("</tbody>");
        sb.append("</table>");
        return sb.toString();
    }
}
