package com.mycompany.patterns.facade.reporter;

import com.mycompany.patterns.facade.model.ReportData;

public interface Reporter {
    void generateReport(ReportData rejectedProducts);
}
