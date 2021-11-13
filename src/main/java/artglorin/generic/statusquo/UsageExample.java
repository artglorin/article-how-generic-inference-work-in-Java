package main.java.artglorin.generic.statusquo;

import java.net.URI;
import java.util.List;

public class UsageExample {
  
  public static void main(String[] args) {
        var uri = URI.create("file://test.txt");
        var factory = new ResourceFactory();
        FileResource fileResource = factory.createResource(uri);

        // do something with fileResource

        var resources = List.<Resource>of(fileResource);
        var report = new ReportService().createReport(resources);
        System.out.printf("%n=========%nReport%n%s%n=========%n", report);
    
  }
  
}
