package main.java.artglorin.generic.solution.sealedinterfaces;

import java.net.URI;

public class UsageExample {
  
  public static void main(String[] args) {
    System.out.printf(
        "%n=========%nReport%n%s%n=========%n",
        new ReportService().createReport(new ResourceFactory().createResource(
            URI.create("file://test.txt")))
    );
  }
  
}
