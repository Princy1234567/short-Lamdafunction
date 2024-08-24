public class Lamda{
interface FuncInter1{
int operation(int a, int b);
}
private int operate(int a, int b,FuncInter1 fobj){
return fobj.operation(a,b);
}
public static void main(String[]args){
FuncInter1 add=(int x,int y)-> x+y;
FuncInter1 multiply=(int x,int y)-> x*y;
FuncInter1 sub=(int x,int y)-> x-y;
FuncInter1 divide=(int x,int y)-> x/y;
Lamda L=new Lamda();
System.out.println("Addition is:"+L.operate(10,20)add);
System.out.println("Subtraction is:"+L.operate(90,40)sub);
System.out.println("Multiplication is:"+L.operate(10,20)multiply);
System.out.println("Division is:"+L.operate(20,5)divide);
}
}
