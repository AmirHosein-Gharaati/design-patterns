package com.mycompany.patterns.facade;

import com.mycompany.patterns.facade.model.Product;
import com.mycompany.patterns.facade.model.ReportData;
import com.mycompany.patterns.facade.reporter.CsvReporter;
import com.mycompany.patterns.facade.reporter.ExcelReporter;
import com.mycompany.patterns.facade.reporter.Reporter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> badProducts = List.of(
                new Product(1L, "One", 100),
                new Product(2L, "Two", 200),
                new Product(3L, "Three", 300)
        );
        ReportData reportData = new ReportData(badProducts);

        Reporter csvReporter = new CsvReporter();
        Reporter excelReporter = new ExcelReporter();

        ReportFacade facade = new ReportFacade(excelReporter, csvReporter);

        facade.generateCsvReport(reportData);
        facade.generateExcelReport(reportData);
    }
}
