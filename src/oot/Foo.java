
package oot;

public class Foo {
    private String name;
    
    public Foo(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void printMin(int num){
        int min = num%10;
        
        while(num>0){
            if(min>num%10)
                min = num%10;
            num /= 10;
        }
        System.out.println(name + " prints min digit = " + min);
    }
}
