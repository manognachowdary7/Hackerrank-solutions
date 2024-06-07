

    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = (H>0 && B>0);
    static{
        if(!flag){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
    



