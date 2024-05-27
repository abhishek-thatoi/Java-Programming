package begin.Exception;

class out_of_stock extends Exception{

    out_of_stock(String s){
        super(s);
    }
}

class pr_user_def {
    static void check(int order) throws out_of_stock{
        if(order>=7)
            throw new out_of_stock("not available");
        else
            System.out.println("order accepted");

    }

    public static void main(String[] args) {
        try{
            check(9);
        }catch(Exception x){
            System.out.println("exception occured:"+ x);
        }

        System.out.println("you did it");
    }
}