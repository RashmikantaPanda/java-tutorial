package com.self.practice.AccessModifier;

 class ClassA {
    private String name;
    public String addr;
    protected long mob;

     private long getMob() {
         return mob;
     }

     public void setMob(long mob) {
         this.mob = mob;
     }

     public String getName() {
        return name;
    }
    public void SetName(String name){
        this.name=name;
    }
}
public class AccessModifierEx2{
     public static void main(String args[]){
         ClassA obj1=new ClassA();
         obj1.SetName("Rashmikanta Panda");
         System.out.println("Name is : "+ obj1.getName());
         obj1.addr="Kendrapara";
         System.out.println("Address is : "+obj1.addr);
         obj1.setMob(9437);
//         System.out.println("Mob is : "+obj1.getMob());
         System.out.println("Mob is : "+obj1.mob);

     }
}


