package com.varela.rpc.filter;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.*;
import com.alibaba.dubbo.rpc.filter.AccessLogFilter;

/**
 * Created by Lance.
 * Date: 2017-01-16
 * Time: 15:07
 * 验证
 */
public class AuthorityFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(AccessLogFilter.class);


    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        /**
         * TODO 服务方 消费方判断
         *
         RpcContext.getContext().isConsumerSide();
         RpcContext.getContext().isProviderSide();
         */

        //获取调用方IP地址
        String clientIp = RpcContext.getContext().getRemoteHost();
        logger.debug("访问ip为:" + clientIp);

        //获取当前服务配置信息
        String application = RpcContext.getContext().getUrl().getParameter("application");


        return invoker.invoke(invocation);
    }
}
