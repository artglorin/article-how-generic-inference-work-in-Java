package main.java.artglorin.typeinference;

import java.net.URI;

public class TypeInference {
  
  private static final ResourceFactory factory = new ResourceFactory();
  private static final ReportService reportService = new ReportService();
  private static final URI uri = URI.create("file://text.txt");
  
  private static void validate() {
    
    var resource = factory.createResource(uri);
    
  }
  
}
