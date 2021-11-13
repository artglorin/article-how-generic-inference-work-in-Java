package main.java.artglorin.generic;

import java.util.function.Consumer;

public class IntellijIdeaInspectionExample {
  
  public static void main(String[] args) {
    Consumer<String> stringConsumer = (string) -> {};
    Consumer<Exception> exceptionConsumer = (object) -> {};
    class TypeInference {
      
      <T extends Runnable> T getT() {
        return (T) (Runnable) () -> {};
      }
      
    }
    var typeInference = new TypeInference();
    String string = typeInference.getT(); // should be error
    
    Exception exception = typeInference.getT(); // should be warning
    
    stringConsumer.accept(typeInference.getT()); // should be error
    exceptionConsumer.accept(typeInference.getT()); // should be warning
  }
  
}
