interface M{
public void Method1();
public void Method2();
}
class AIN  implements M{
    public void Method1(){
        System.out.println("This is method 1");
    }
    public void Method2(){
        System.out.println("This is method 2");
    }

}
 class program {
   public static void main(String[] args) {
    AIN a=new AIN();
    a.Method1();
    a.Method2();
   } 
}