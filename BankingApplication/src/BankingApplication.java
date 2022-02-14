import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("MG Code","MG00001");

        obj.showMenu();
    }
}

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }
    void deposit(int amount){
        if(amount!=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount!=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Depósito: " + previousTransaction);
        }
        else if (previousTransaction< 0){
            System.out.println("Saque: " + Math.abs(previousTransaction));
        }
        else{
            System.out.println("Nenhuma ocorrência");
        }
    }
    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bemvindo " + customerName);
        System.out.println("Nº Conta " + customerId);
        System.out.println("\n");

        System.out.println("A: Saldo");
        System.out.println("B: Depósito");
        System.out.println("C: Saque");
        System.out.println("D: Extrato");
        System.out.println("E: Sair");

        do{
            System.out.println("=*=*=*=*=*=*=*=*=*=**=*=*=*=*=**=*=*=*=*=**=*=*=**=*=*");
            System.out.println("Digite a opção: ");
            System.out.println("=*=*=*=*=*=*=*=*=*=**=*=*=*=*=**=*=*=*=*=**=*=*=**=*=*");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("===============================================");
                    System.out.println("Saldo = " + balance);
                    System.out.println("===============================================");
                    System.out.println("\n");
                    break;


                case 'B':
                    System.out.println("===============================================");
                    System.out.println("Valor do Depósito:  " );
                    System.out.println("===============================================");

                    int amount = scanner.nextInt();
                    deposit(amount);

                    System.out.println("\n");
                    break;

                    case 'C':
                    System.out.println("===============================================");
                    System.out.println("Valor do saque: " );
                    System.out.println("===============================================");

                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                    case 'D':
                    System.out.println("===============================================");
                    getPreviousTransaction();
                    System.out.println("===============================================");
                    System.out.println("\n");
                    break;

                case'E':
                    System.out.println("===============================================");
                    break;

                default:
                    System.out.println("Opção Inválida! Favor digitar uma opção válida...");
                    break;
            }
        }
            while(option != 'E') ;
                System.out.println("Obridado(a) por usar nossos serviços...");  ;

        }

    }

