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
        String clientIp = RpcContext.getContext().getRemoteHost();
        logger.debug("访问ip为:" + clientIp);
        return invoker.invoke(invocation);
    }
}
