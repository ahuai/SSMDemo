package org.lanqiao.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by LiuYuanhuai on 2017/9/6.
 */
public class LogAOP {
    Logger logger=Logger.getLogger(LogAOP.class);

    //要记录的日志内容
    String strLog=null;

    //前置通知
    public void somethingBefore(JoinPoint joinPoint){
        System.out.println("进入了前置通知");
        strLog="log Begining method: "
                 +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    //后置通知
    public void somethingAfter(JoinPoint joinPoint){
        System.out.println("进入了后置通知");
        strLog="log After method: "
                +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }

    /**
     * 环绕通知:包围一个连接点的通知,可以在方法的调用前后完成自定义的行为,也可以选择不执行
     * 类似web中Servlet规范中的Filter的doFilter方法
     * @param proceedingJoinPoint 当前进程中的连接点
     * @return
     * @throws Throwable
     */
    public Object somethingAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("进入了环绕通知");
        Long start=System.currentTimeMillis();
        Object retVal=proceedingJoinPoint.proceed();
        Long end=System.currentTimeMillis();
        System.out.println("该方法执行了:"+(end-start)+" ms");
        return retVal;
    }
}
