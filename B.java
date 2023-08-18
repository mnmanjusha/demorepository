class B{
public static void main(String args[]){
   try{
      new B().go();
  }
   catch(Exception e){ System.out.println("Exception"); }

}

 void go(){
      go();
}
}
