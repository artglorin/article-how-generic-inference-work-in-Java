package main.java.artglorin.generic.solution.useclasses;

import java.util.ArrayList;
import java.util.stream.Collectors;

@SuppressWarnings("all")
class ReportService {
  
  String createReport(ArrayList<? extends Resource> resources) {
    return resources.stream()
                    .map(it -> it.getClass()
                                 .getSimpleName())
                    .collect(Collectors.joining(","));
  }
  
}
