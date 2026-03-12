class room
{
  int area,lenght,breadth;
  public void setdata (int l,int b)
  { 
     lenght=l;
     breadth=b;
  }
  public void calculatearea()
  {
    area=lenght*breadth;
    System.out.print("area is  "+area);
  }
}
 class mainroom
 {
   public static void main(String a[])
   {
    room r1=new room();
    r1.setdata(2,4);
    r1.calculatearea();
   }
}
   
















  























