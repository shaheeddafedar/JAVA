package Executor_Service;

import java.util.concurrent.Callable;

public class Thread105 implements  Callable<Integer>{
int num;
int fact=1;
public Thread105(int num) {
    this.num = num;
}

    public Integer call(){
        if (num<0) {
            System.out.println("NO negative Number");
        } else if(num==1 || num==0) {
            System.out.println(1);
        }
        for (int i = 2; i <=num; i++) {
            fact*=i;
        }
        return fact;
    }
}


