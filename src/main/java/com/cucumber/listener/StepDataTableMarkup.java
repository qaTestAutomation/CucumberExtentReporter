package com.cucumber.listener;

import com.aventstack.extentreports.markuputils.Markup;

/**
 * Creates a step data table in the report
 */
class StepDataTableMarkup implements Markup {
    private String[][] data;

    /**
     * Sets the data required for the table creation
     *
     * @param data The data in a String array format
     */
    public void setData(String[][] data) {
        this.data = data;
    }

    /**
     * Gets the data to be displayed in the table
     *
     * @return The data in a String array format
     */
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
