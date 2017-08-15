package com.baron.api.provider;

import com.baron.common.annotation.SpiderProvider;
import com.baron.common.model.Proxy;

import java.util.List;

public interface ProxyProvider extends BaseProvider {
    Proxy getProxy();
    List<Proxy> getProxies(int num);
}