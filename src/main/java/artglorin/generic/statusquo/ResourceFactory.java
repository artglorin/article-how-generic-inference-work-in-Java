package main.java.artglorin.generic.statusquo;

import java.net.URI;
import java.util.Objects;

class ResourceFactory {
  


  <T extends Resource> T createResource(URI resource) {
    Objects.requireNonNull(resource, "resource");
    if ("file".equalsIgnoreCase(resource.getScheme())) {
      return (T) new FileResource();
    }
    throw new IllegalArgumentException(
        "Unsupported resource type '" + resource.getScheme() + "'."
    );
  }
}
