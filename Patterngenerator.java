//  Class author:  rima k
//  Date created:  11/11
//  General description: a brief summary of what this particular class does.


public class Patterngenerator{
    //made a while loop that adds two stars when the i is less than rows
    public static void stars(int rows){
        String star = "*";
        int i =0;
        while(i < rows){
            System.out.println(star);
            star+="**";
            i++;
        }
    }


public static void triangle(int rows){
    int i = 1;
    while(i <= rows){//goes from 1 to rows
        int x = 1;
        while(x<=i){// as many times as the row number you are on
            x ++;
            System.out.print(i);        
        }
        i++;
        System.out.println();
    }

    /*
     * 1
     * 22
     * 333
     * 4444
     */

}

public static void odds(int start){
    //makes a loop that prints out only odd numbers  as man y times as the number it is
    for (int i = start; i>0; i-=2){
        for(int x = i; x>0; x--){
        System.out.print(i);
        }
    System.out.println();
    }
}


public static void eo(int maxE){
    // prints out e then o each likne and has the number of times its printed correspond to the line its on
    String letter = "E";
    if(maxE%2==0){
        letter = "O";
    }

    for(int zero = 1; zero <= maxE; zero++){
            for(int i =0; i<zero; i++){
            System.out.print(letter);
            }
            System.out.println();
            if (letter.equals("E")){
                letter = "0";
            }
            else{
                letter = "E";}
        }
        for(int zero = maxE; zero >= 0; zero--){
            for(int i =0; i<zero; i++){
            System.out.print(letter);
            }
            System.out.println();
            if (letter.equals("E")){
                letter = "0";
            }
            else{
                letter = "E";}
        }
    System.out.println();   
    }


public static void pyramid(int rows){
    //prints out numbers in numerical order but itn a pyramid shape each line adds space to create that shape
    int i = rows;
    int num = 1;
    String space = " ";
    while (i>0){
        for(int x = 0; x < i*2 -1; x++){
            System.out.print(num);
        }
        num++;
        i--;
        System.out.println();
        System.out.print(space);
        space += " ";
       
    }
}

public static void main(String [] args){
    stars(5);
    triangle(5);
    odds(5);
    eo(5);
    pyramid(5);
}
}