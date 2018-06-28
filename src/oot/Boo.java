
package oot;


public class Boo extends Foo implements Sout{
    public Boo (String name){
        super(name);
    }
    public void printMin(int num){
        int min = num%10,count = 0;
        
        while(num>0){
            if(min>num%10)
                min = num%10;
            num /= 10;
            count++;
        }
        System.out.print(getName() + " prints the same with min digit = ");
        while(count>0){
            System.out.print(min);
            count--;
        }
        System.out.println();
    }
    public void multiply(String[]str){
        System.out.print(getName() + " prints multiply = ");
        
        for(int i = 0; i < str.length; i++){
            String[]t;
            int total = 1;
            t = str[i].split(":");
            for(int j = 0; j < t.length; j++){
                total = total * Integer.valueOf(t[j]);
            }
        System.out.print(" " + total);
        }
    }
}
