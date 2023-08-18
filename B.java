class B{
public static void main(String args[]){
   try{
      new B().go();
      System.out.println("Modified Line");
  }
   catch(Exception e){ System.out.println("Exception"); }

}

 void go(){
      go();
}
}
