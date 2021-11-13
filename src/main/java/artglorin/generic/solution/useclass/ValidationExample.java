package main.java.artglorin.generic.solution.useclass;

import java.net.URI;
import java.util.List;

public class ValidationExample {
  
  private static final ResourceFactory factory = new ResourceFactory();
  private static final ReportService reportService = new ReportService();
  private static final URI uri = URI.create("file://text.txt");
  
  private static void validate() {
    // should be compile time error
    String assignToString = factory.createResource(uri, String.class);
    
    // should be compile time error
    String castToString = (String) factory.createResource(uri, String.class);
    
    // should be OK
    FileResource assignToCorrectClass = factory.createResource(uri,
                                                               FileResource.class
    );
    
    // should be OK
    var castToCorrectClass = (FileResource) factory.createResource(uri,
                                                                   FileResource.class
    );
    
    // should be compile time warning
    Exception assignToIncorrectClass = factory.createResource(uri,
                                                              Exception.class
    );
    
    // should be compile time warning
    var castToIncorrectClass = (Exception) factory.createResource(uri,
                                                                  Exception.class
    );
    
    // should be compile time error
    reportService.createReport(factory.createResource(uri, Resource.class));
    
    // should be OK
    reportService.createReport(List.of(factory.createResource(uri,
                                                              Resource.class
    )));
  }
  
}
