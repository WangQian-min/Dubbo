package com.wq.service;


import com.alibaba.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements ProviderService {


    public String SayHello(String word) {
        return word;
    }
}
