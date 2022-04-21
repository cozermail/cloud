package com.core.bootfirst.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 *
 * @author：Cozer
 * @date：Created in 2021/12/6 17:49
 */
public class ReviewApprove implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        //可以发送消息给某人
        System.out.println("通过，userId是：" + delegateExecution.getVariable("userId"));
    }
}