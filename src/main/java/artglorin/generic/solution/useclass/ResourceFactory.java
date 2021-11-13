package main.java.artglorin.generic.solution.useclass;

import java.net.URI;
import java.util.Objects;

class ResourceFactory {
  
  <T extends Resource> T createResource(
      URI resource,
      Class<T> type
  ) {
    Objects.requireNonNull(resource, "resource");
    if ("file".equalsIgnoreCase(resource.getScheme()) && FileResource.class == type) {
      return type.cast(new FileResource());
    }
    throw new IllegalArgumentException("Unsupported resource type '" + resource.getScheme() + "'.");
  }
  
}
