package com.varela.rpc.impl;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.beust.jcommander.internal.Lists;

import java.util.Collection;
import java.util.List;

/**
 * Created by Lance.
 * Date: 2017-02-06
 * Time: 11:22
 * TODO 注册被序列化类 要让Kryo和FST完全发挥出高性能，最好将那些需要被序列化的类注册到dubbo系统中
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {
    public Collection<Class> getSerializableClasses() {
        List<Class> list = Lists.newLinkedList();
        return list;
    }
}
