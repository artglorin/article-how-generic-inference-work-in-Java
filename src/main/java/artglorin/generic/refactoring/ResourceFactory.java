package main.java.artglorin.generic.refactoring;

import java.net.URI;
import java.util.Objects;

@SuppressWarnings("unchecked")
class ResourceFactory {
  
  <T extends Resource> T createResource(URI resource) {
    Objects.requireNonNull(resource, "resource");
    if ("file".equalsIgnoreCase(resource.getScheme())) {
      return (T) new FileResource();
    }
    throw new IllegalArgumentException("Unsupported resource type '" + resource.getScheme() + "'.");
  }
  
}
