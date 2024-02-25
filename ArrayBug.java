class ArrayBug{
  public static void main(String[] args){
    String[] name ={"桜井","田原","中川","鈴木","小林"};
    for(var a :name)
      System.out.println(a);
    /*
    name[0] = "桜井";
    name[1] ="田原";
    name[2] ="中川";
    name[3] ="鈴木";
    name[4] ="小林";
    
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);

     */
  }
}
