package chap6;

class s8 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(100);

        // System.out.println("private指定のインスタンス変数へのアクセス：" + emp.id); コンパイルエラー
        System.out.println("public指定のメソッドへのアクセス：" + emp.getId());
    }
}

class Employee {
    private int id;

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
