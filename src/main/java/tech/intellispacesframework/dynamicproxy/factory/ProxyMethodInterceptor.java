package tech.intellispacesframework.dynamicproxy.factory;

import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.implementation.bind.annotation.This;
import tech.intellispacesframework.dynamicproxy.proxy.contract.MethodHandler;

public class ProxyMethodInterceptor {
  private final MethodHandler handler;

  ProxyMethodInterceptor(MethodHandler handler) {
    this.handler = handler;
  }

  @RuntimeType
  public Object intercept(@This Object object, @AllArguments Object[] arguments) throws Exception {
    return handler.handle(object, arguments);
  }
}
