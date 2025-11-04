
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        System.out.println("Olá mundo");
service ps = new service();
Learn lg = new Learn();
genericos <product> gen = new genericos<>();

        Scanner sc = new Scanner(System.in);
List<product> list = new ArrayList<>();
      
String path = "C:\\Users\\GCWF\\OneDrive - PETROBRAS\\Documentos\\x.txt";

try(BufferedReader br = new BufferedReader(new FileReader(path))) {
    String line = br.readLine();
    while(line != null){
String fields[] = line.split(",");
list.add(new product(fields[0], Double.parseDouble(fields[1])));   
        line = br.readLine();
    }
Integer x = calculationservice.max(list);
System.out.println("MAX");
System.out.println(x);
}catch(Exception e){
    System.out.println("Error: " + e.getMessage());

}

        System.out.println("How many values");
        int n = sc.nextInt();



        for (int i = 0; i < n; i++) {
            System.out.println("Enter a value");
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
            System.out.println("First value: " + ps.first());

    System.out.println("How many items to add?");
    int m = sc.nextInt();

    for(int i=0; i<m; i++){
        System.out.println("Enter an item:");
        String item = sc.next();
        lg.addItem(item);
    }
lg.mostraritens();
lg.firstItem();

System.out.println("Quantos elementos adicionar?");
int p = sc.nextInt();

for(int i=0; i<p;i++){
    System.out.println("Digite o elemento");
    int elemento = sc.nextInt();
    gen.addElemento(String.valueOf(elemento));
}
gen.mostrar();
System.out.println("Primeiro elemento: " + gen.primeiroElemento());



sc.close();
    }

    }
