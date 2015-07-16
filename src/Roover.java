/**
 * Created by varshapa on 16/07/15.
 */
import java.util.Scanner;
public class Roover {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int initX=sc.nextInt();
        int initY=sc.nextInt();
        String dir=sc.next();
        char c=dir.charAt(0);

        String move=sc.next();
        int n=move.length();
        char[] movec = new char[10];


        for(int j=0;j<n;j++)
        {
            movec[j]=move.charAt(j);
        }
        int i=0;
        while(n>0) {

           // System.out.println("i is"+i);
          //  System.out.println("n is"+n);
            if (c == 'N') {
                if (movec[i] == 'L') {
                    c = 'W';
                    //System.out.println("c is W now");
                } else if (movec[i] == 'R') {
                   // System.out.println("c is now E");
                    c = 'E';
                } else if (movec[i] == 'M') {
                   // System.out.println("y incremented");
                    initY++;
                }

            } else if (c == 'S') {
                if (movec[i] == 'L') {
                    c = 'E';
                } else if (movec[i] == 'R') {
                    c = 'W';
                } else if (movec[i] == 'M') {
                    initY--;
                }

            } else if (c == 'E') {
                if (movec[i] == 'L') {
                    c = 'N';
                } else if (movec[i] == 'R') {
                    c = 'S';
                } else if (movec[i] == 'M') {
                    initX++;
                }
            }
            else if(c== 'W')
            {
                if (movec[i] == 'L') {
                   // System.out.println("This is getting wxwcuted");
                    c = 'S';
                } else if (movec[i] == 'R') {
                    c = 'N';
                } else if (movec[i] == 'M') {
                    initX--;
                }
            }
            i++;
            n--;

        }
        //}


        //createRoover a=new createRoover(initX,initY,c,movec);
        System.out.println(initX);
        System.out.println(initY);
        System.out.println(c);
        System.out.println(move);





    }
}
