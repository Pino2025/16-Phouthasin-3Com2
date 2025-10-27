public class Example {
    // ฟังก์ชันแบบ void
    void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.sayHello();  // เรียกใช้งานได้ แต่ไม่มีค่ากลับ
    }
}
