package basics;

public class loop {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }

        int i=1;
        while(i<=5){
            System.out.println("Hello World");
            i++;
        }

        String fruits[]={"Apple","Mango","Orange","Banana"};
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
