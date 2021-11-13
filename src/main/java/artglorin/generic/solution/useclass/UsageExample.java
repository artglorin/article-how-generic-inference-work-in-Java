package main.java.artglorin.generic.solution.useclass;

import java.net.URI;
import java.util.List;

public class UsageExample {
  
  public static void main(String[] args) {
    System.out.printf("%n=========%nReport%n%s%n=========%n",
                      new ReportService().createReport(new ResourceFactory().createResource(
                          URI.create("file://test.txt"),
                          FileResource.class
                      ))
    );
    System.out.printf("%n=========%nReport%n%s%n=========%n",
                      new ReportService().createReport(List.of(new ResourceFactory().createResource(
                          URI.create("file://test.txt"),
                          FileResource.class
                      )))
    );
  }
  
}
