package main.java.artglorin.generic.solution.container;

import java.net.URI;
import java.util.Objects;

class ResourceFactory {
  
  <T extends Resource> Container<T> createResource(URI resource) {
    Objects.requireNonNull(resource, "resource");
    if ("file".equalsIgnoreCase(resource.getScheme())) {
      return new Container<>((T) new FileResource());
    }
    throw new IllegalArgumentException("Unsupported resource type '" + resource.getScheme() + "'.");
  }
  
}
