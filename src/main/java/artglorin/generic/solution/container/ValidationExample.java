package main.java.artglorin.generic.solution.container;

import java.net.URI;
import java.util.List;

public class ValidationExample {
  
  private static final ResourceFactory factory = new ResourceFactory();
  private static final ReportService reportService = new ReportService();
  private static final URI uri = URI.create("file://text.txt");
  
  private static void validate() {
    // should be compile time error
    String assignToString = factory.createResource(uri)
                                   .get();
    
    // should be compile time error
    String castToString = (String) factory.createResource(uri)
                                          .get();
    
    // should be OK
    FileResource assignToCorrectClass = factory.createResource(uri)
                                               .get();
    
    // fix
    FileResource assignToCorrectClassWithTix =
        factory.<FileResource>createResource(
                                                          uri)
                                                      .get();
    
    // should be OK
    var castToCorrectClass = (FileResource) factory.createResource(uri)
                                                   .get();
    
    // should be compile time warning
    Exception assignToIncorrectClass = factory.createResource(uri)
                                              .get();
    
    // should be compile time warning
    var castToIncorrectClass = (Exception) factory.createResource(uri)
                                                  .get();
    
    // should be compile time error
    reportService.createReport(factory.createResource(uri)
                                      .get());
    
    // OOPS we can do incorrect cast
    reportService.createReport((List<Resource>) factory.createResource(uri)
                                                       .get());
    
    // should be OK
    reportService.createReport(List.of(factory.createResource(uri)
                                              .get()));
  }
  
}
