package main.java.artglorin.generic.refactoring;

import java.util.List;
import java.util.stream.Collectors;

class ReportService {
  
  String createReport(List<? extends Resource> resources) {
    return resources.stream()
                    .map(it -> it.getClass()
                                 .getSimpleName())
                    .collect(Collectors.joining(","));
  }
  
}
