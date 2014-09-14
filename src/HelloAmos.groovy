/**
 * Created by amosli on 14-9-14.
 */
class HelloAmos {

    public static void main(args) {
        println("hello amosli !!");

        String name = "amosli";
        println(name);

        //定义变量的方式可以为def，即不指定类型，类似于js中的var
        def address = "shanghai";
        println(address);
        println(address.class);//class java.lang.String

        def age = 25;
        println(age.class);//class java.lang.Integer

        repeat("time");

        loop("hello,amos!", 2);
        loop("hello!", 3);
        loop("default loop");
    }

    static def repeat(val) {
        //指定i的值为int类型
        for (int i = 0; i < 5; i++) {
            println(i + " " + val);
        }

        //不指定i的值的具体类型
        for (def i = 0; i < 5; i++) {
            println(i + " " + val);
        }

        //用in来进行循环，这里本例是从1到5
        for (i in 1..5) {
            println(i + " " + val);
        }

        //用in来进行循环，这里本例是从1到4
        for (i in 1..<5) {
            println(i + " " + val);
        }

    }

    static def loop(val, loop = 5) {
        for (i in 0..<loop) {
            println(val + "  " + i + "/" + loop);
        }
    }

}
