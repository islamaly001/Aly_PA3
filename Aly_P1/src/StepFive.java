import java.util.*;
class StepFive{
    static Scanner sc=new Scanner(System.in);
    static Random rm=new Random();
    static int count=0, cor=0, incor=0;
    public static void main(String[] args) {
        int ln=1;
        int n1=4, n2=2;
        float num1, num2, num3, num4;
        if (ln>=1&&ln<=4)
        {
            System.out.println("Arithmetic problem to study");
            System.out.println("Enter Level number ");
            ln=sc.nextInt();

            if(ln==1)
            {
                System.out.println(" addition problems only");
                int add=n1+n2;

                while(true){
                    System.out.println("How much "+n1+" plus "+n2+"?");
                    num1=sc.nextInt();
                    if(num1==add){
                        cor++;
                        correct();
                        break;
                    }
                    else{
                        incor++;
                        incorrect();
                        break;
                    }
                }
            }
            if (ln==2)

            {
                System.out.println(" multiplication ");
                int mult=n1*n2;
                while(true){
                    System.out.println("How much "+n1+" multiply by "+n2+"?");
                    num2=sc.nextInt();
                    if(num2==mult){
                        cor++;
                        correct();
                        break;
                    }
                    else{
                        incor++;
                        incorrect();
                        break;
                    }
                }}
            if (ln==3)

            {
                System.out.println(" subtraction problems only");
                int sub=n1-n2;
                while(true){
                    System.out.println("How much "+n1+" subtract from "+n2+"?");
                    num3=sc.nextInt();
                    if(num3==sub){
                        cor++;
                        correct();
                        break;
                    }
                    else{
                        incor++;
                        incorrect();
                        break;
                    }
                }}

            if (ln==4)

            {
                System.out.println(" division problems only");
                int dev=n1/n2;
                while(true){
                    System.out.println("How much "+n1+" divide by "+n2+"?");
                    num4=sc.nextInt();
                    if(num4==dev){
                        cor++;
                        correct();
                        break;
                    }
                    else{
                        incor++;
                        incorrect();
                        break;
                    }
                }}}//end of if statement if (ln>=1&&ln<=4)


        else
        {
            System.out.println("Choose the level numbers between 1 and 4");

        }
    }//end of the main program


    //multiplication end
    static void correct(){
        int c1=rm.nextInt(4);
        switch(c1){
            case 0: System.out.println("Very Good !");
                break;
            case 1: System.out.println("Excellent !");
                break;
            case 2: System.out.println("Nice Work !");
                break;
            case 3: System.out.println("Keep up the good work !");
                break;
        }
    }
    static void incorrect(){
        int c2=rm.nextInt(4);
        switch(c2){
            case 0: System.out.println("No, please try again !");
                break;
            case 1: System.out.println("wrong, try once more !");
                break;
            case 2: System.out.println("Don't give up !");
                break;
            case 3: System.out.println("No, keep trying!");
                break;
        }
    }}
