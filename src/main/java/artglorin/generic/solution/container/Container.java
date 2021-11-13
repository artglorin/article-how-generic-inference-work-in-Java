package main.java.artglorin.generic.solution.container;

import java.util.Objects;

public final class Container<T> {
  
  private final T value;
  
  public Container(T value) {this.value = value;}
  
  @Override
  public String toString() {
    return "Container{" + "value=" + value + '}';
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Container))
      return false;
    
    Container<?> container = (Container<?>) o;
    
    return Objects.equals(value, container.value);
  }
  
  @Override
  public int hashCode() {
    return value != null ? value.hashCode() : 0;
  }
  
  public T get() {
    return value;
  }
  
}
