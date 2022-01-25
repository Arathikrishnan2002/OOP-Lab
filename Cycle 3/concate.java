class concate
{ 
  public static void main(String args[])
   {
   concate Obj=new concate();
   Obj.consum("3"+"8");
   Obj.consum("Good"+" "+"Morning");
   }
  void consum(int x)
  {
   System.out.println("Concated number:" +x);
  }
  void consum(String x)
   {
    System.out.println("Concated String=" +x);
   }
}
