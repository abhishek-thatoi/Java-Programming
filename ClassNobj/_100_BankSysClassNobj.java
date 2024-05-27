package Java_rev.ClassNobj;


class bank_acc{
    int Acc_no;
    String Customer_Name;
    double Amount;
    void insert(int acc, String n, double amt){
        Acc_no=acc;
        Customer_Name=n;
        Amount=amt;
    }

    void deposite(double amt){
        Amount=Amount+amt;
    }

    double withdrawal(double amt){
        Amount=Amount-amt;
        return Amount;
    }

    void display(){
        System.out.print("Account number: "+Acc_no+"\n"+"Customer Name: "+Customer_Name+"\n"+"Balance: "+Amount+"\n\n");
    }
}

public class _100_BankSysClassNobj {
    public static void main(String[] args) {
        bank_acc A1= new bank_acc(), A2= new bank_acc();
        A1.insert(1001, "akshay",5981.40);
        A2.insert(1003, "vishesh", 833.1);
        A1.display();
        A2.display();

        A2.deposite(241.20);
        A1.Amount=A1.withdrawal(241.20);

        A1.display();
        A2.display();
    }

    
}