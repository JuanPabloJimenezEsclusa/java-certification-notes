package com.baeldung.modules.main;

import java.util.ServiceLoader;
import com.baeldung.modules.hello.HelloModulesImpl;
import com.baeldung.modules.hello.HelloInterface;

public class MainApp {
    public static void main(String[] args) {
      HelloModulesImpl.doSomething();
      HelloInterface.doInterfaceSomething();

      Iterable<HelloInterface> services = ServiceLoader.load(HelloInterface.class);
      HelloInterface service = services.iterator().next();
      service.sayHello();
    }
}
