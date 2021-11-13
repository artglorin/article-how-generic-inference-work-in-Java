package main.java.artglorin.generic.solution.rawusage;

import java.net.URI;
import java.util.List;

public class UsageExample {
  
  public static void main(String[] args) {
    System.out.printf(
        "%n=========%nReport%n%s%n=========%n",
        new ReportService().createReport((List<? extends Resource>) new ResourceFactory().createResource(
            URI.create("file://test.txt")))
    );
  }
  
}
