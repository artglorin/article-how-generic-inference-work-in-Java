package main.java.artglorin.typeinference;

import java.net.URI;
import java.util.Objects;

class ResourceFactory {
  
  Resource createResource(URI resource) {
    Objects.requireNonNull(resource, "resource");
    if ("file".equalsIgnoreCase(resource.getScheme())) {
      return new FileResource();
    }
    throw new IllegalArgumentException("Unsupported resource type '" + resource.getScheme() + "'.");
  }
  
}
