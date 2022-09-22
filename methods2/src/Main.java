public class Main {
    public static void main(String[] args) {
        String message = "today weather is good";
        String newMessage= giveCity();
        System.out.println(newMessage);
        int num = sum(5,7);
        System.out.println(num);
        int total = sum2(1,3,2,4);
        System.out.println(total);
    }


    public static void add(){
        System.out.println("added");
    }


    public static void del(){
        System.out.println("deleted");
    }


    public static void update(){
        System.out.println("updated");
    }

    public static int sum(int num1,int num2){
        return num1+num2;
    }

    public static int sum2(int... nums){
        int total = 0;
        for(int num:nums){
            total+=num;
        }
        return total;
    }

    public static String giveCity(){
        return "ankara";
    }
}


//void operasyonlar işlem yapar emiri yerine getirir