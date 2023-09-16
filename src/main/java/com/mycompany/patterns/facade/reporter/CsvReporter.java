package com.mycompany.patterns.facade.reporter;

import com.mycompany.patterns.facade.model.ReportData;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CsvReporter implements Reporter {
    @Override
    public void generateReport(ReportData rejectedProducts) {
        System.out.println("Generating report in CSV format");
    }
}
