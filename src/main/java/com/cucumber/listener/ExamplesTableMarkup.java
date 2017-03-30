package com.cucumber.listener;

import com.aventstack.extentreports.markuputils.Markup;

class ExamplesTableMarkup implements Markup {
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
        sb.append("<thead><tr><th colspan='" + colSpan + "'>Examples</th></tr></thead>");
        boolean tbodyFlag = false;
        for (int row = 0; row < data.length; row++) {
            if (row == 0) {
                sb.append("<thead>");
            } else {
                if (!tbodyFlag) {
                    sb.append("<tbody>");
                    tbodyFlag = true;
                }
            }
            sb.append("<tr>");
            for (int col = 0; col < data[row].length; col++) {
                if (row == 0) {
                    sb.append("<th>" + data[row][col] + "</th>");
                } else {
                    sb.append("<td>" + data[row][col] + "</td>");
                }
            }
            sb.append("</tr>");
            if (row == 0) {
                sb.append("</thead>");
            }
        }
        sb.append("</tbody>");
        sb.append("</table>");
        return sb.toString();
    }

}
