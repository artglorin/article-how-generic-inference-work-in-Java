package main.java.artglorin.generic;

import java.util.function.Consumer;

public class TheProblem {
  
  public static void main(String[] args) {
    class RunnableType {
      
      <T extends Runnable> T get() {
        return (T) (Runnable) () -> {};
      }
      
    }
    Consumer<String> stringConsumer = (string) -> {};
    stringConsumer.accept(new RunnableType().get());
  }
  
}
