package com.example.asmdemo;




/**
 * Created by zjy on 2019-05-05
 * 只是为了方便使用asm生成添加字节码的代码
 */
public class Test {

    public void handle() {
        String methodName=new Throwable().getStackTrace()[1].getMethodName();
        System.out.println(methodName);
        TimeManager.addStartTime(methodName, System.nanoTime());
        TimeManager.addEndTime(methodName, System.nanoTime());
        TimeManager.calcuteTime(methodName);
    }
}
