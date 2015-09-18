package sample;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String args[]) {

		// Create the target instance
		ServiceOne serviceOne = new ServiceOneBean();

		// Create the proxy
		ServiceOne proxy = (ServiceOne) Proxy.newProxyInstance(ServiceOne.class.getClassLoader(),
				serviceOne.getClass().getInterfaces(), new LogExecutionTimeProxy(serviceOne));

		// Invoke the target instance method through the proxy
		String result = proxy.sayHello();

		System.out.println("Result: " + result);

	}
}
