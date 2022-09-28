package in.google.ipl;

public class Teams {
    public static void main(String[] args) {
        String teamA= "CSK";
       // String teamB = "MI";
        //String teamC = "RCB";

        System.out.println(teamA);
        System.out.println(teamA.length());
        int value= Add(45,4);
        System.out.println(value);



        String s1="\n\nSARMILA PRADHAN";
        System.out.println(s1.length());

        String str2=new String("Jyoti");
        System.out.println("Object is : "+str2);
    }
    public static int Add(int a, int b)
    {
        int result= a+b;
        return result;
    }
}

