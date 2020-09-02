package com.song.springboot.orderover.demo;

/**
 * @Author Jeremy
 * @Description //TODO
 * @Date 2020-08-31 11:33
 **/
public class TestRef {
    public Obj aobj = new Obj();
    private int aint = 0;
    public Obj getAobj(){
        return aobj;
    }
    public int getAint(){
        return aint;
    }
    public void changeObj(Obj inObj){
        inObj.serStr("change value");
    }
    public void changInt(int i){
        i = 1;
    }

    public static void main(String[] args) {
        TestRef otest = new TestRef();
        System.out.println("**********引用类型*****************");
        System.out.println("调用changeObj前 = [" + otest.getAobj() + "]");
        otest.changeObj(otest.getAobj());
        System.out.println("调用changeObj后 = [" + otest.getAobj() + "]");

        System.out.println("***********基本数据类型****************");
        System.out.println("调用changeObj前 = [" + otest.getAint() + "]");
        otest.changInt(otest.getAint());
        System.out.println("调用changeObj后 = [" + otest.getAint() + "]");
    }


    /*
     结果:
     调用changeObj前 = [default value]
     调用changeObj后 = [change value]
     调用changeObj前 = [0]
     调用changeObj后 = [0]
     */
}
