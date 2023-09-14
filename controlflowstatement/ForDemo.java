package controlflowstatement;

public class ForDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int m = sc.nextInt();

        //Simple loop
//        for (int i = 10; i >= 1; i--) {//i = i +1
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i);
//        }


//Enhanced for loop : - Traverse in froward direction only[Faster than other for loops]

//        int arr [] = new int[5];
//        arr[0] =10;
//        arr[1] =20;
//        arr[2] =60;
//        arr[3] =50;
//        arr[4] =40;
//
//        for (int i:arr) {
//            System.out.println(i);
//        }


            //Rectangle
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //Right angled triangle
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Inverted Right angled triangle
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Number right-angled triangle
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
   }
}
