package com.core.bootfirst.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 *
 * @author：Cozer
 * @date：Created in 2021/12/6 17:56
 */
public class ReviewNoApprove implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        //可以发送消息给某人
        System.out.println("不通过，userId是：" + delegateExecution.getVariable("userId"));
    }
}