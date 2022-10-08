package chap6;

class s6 {
    public static void main(String[] args) {
        // System.out.println(Test.instanceVal); コンパイルエラー
        System.out.println(Test.staticVal);

        // Test.methodA(); コンパイルエラー
        Test.methodB();

        System.out.println("---------------------");

        Test t = new Test();

        System.out.println(t.instanceVal);
        System.out.println(t.staticVal);

        t.methodA();
        t.methodB();
    }
}

class Test {
    int instanceVal = 100;
    static int staticVal = 200;

    void methodA() {
        System.out.println("methodA():" + instanceVal);
    }

    static void methodB() {
        System.out.println("methodB():" + staticVal);
    }
}
