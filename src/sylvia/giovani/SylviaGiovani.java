
package sylvia.giovani;

import java.util.Scanner;

public class SylviaGiovani {

    public static void main(String[] args) {
        System.out.println("Tiara amanda");
        System.out.println("2209010075");
        System.out.println("Operator Penugasan111");
        System.out.println("====================");
        Scanner userInput = new Scanner (System.in);
        System.out.println("Gunakan angka untuk memilih opsi");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pengkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa bagi");
        
        System.out.print("input:");
        int input = userInput.nextInt();
        
    if (input == 1){
        System.out.println("Penambahan");
        System.out.println("Masukan angka 1");
        int nilais = userInput.nextInt();
        System.out.println("Masukan angka 2");
        int nilaiz = userInput.nextInt();
        
        int Hasil = nilais+nilaiz;
        System.out.println("Hasil adalah:" + Hasil);
    }   else{
        System.out.println("masukan nilai yang benar");
    }
    
    
    if (input == 2){
        System.out.println("Pengurangan");
        System.out.println("Masukan angka 1");
        int nilais = userInput.nextInt();
        System.out.println("Masukan angka 2");
        int nilaiz = userInput.nextInt();
        
        int Hasil = nilais-nilaiz;
        System.out.println("Hasil adalah:" + Hasil);
    }
        
    if (input == 3){
        System.out.println("Perkalian");
        System.out.println("Masukan angka 1");
        int nilais = userInput.nextInt();
        System.out.println("Masukan angka 2");
        int nilaiz = userInput.nextInt();
        
        int Hasil = nilais*nilaiz;
        System.out.println("Hasil adalah:" + Hasil);
    }
    
    if (input == 4){
        System.out.println("Pembagian");
        System.out.println("Masukan angka 1");
        int nilais = userInput.nextInt();
        System.out.println("Masukan angka 2");
        int nilaiz = userInput.nextInt();
        
        int Hasil = nilais/nilaiz;
        System.out.println("Hasil adalah:" + Hasil);
    
        
    }
    if (input == 5){
        System.out.println("Sisa bagi");
        System.out.println("Masukan angka 1");
        int nilais = userInput.nextInt();
        System.out.println("Masukan angka 2");
        int nilaiz = userInput.nextInt();
        
        int Hasil = nilais%nilaiz;
        System.out.println("Hasil adalah:" + Hasil);
    }
    
    
    
    
    
        System.out.println(" Operator Pembanding ");
        System.out.println("=====================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        int angkas = scanner.nextInt();

        System.out.print("Masukkan angka 2: ");
        int angkaz = scanner.nextInt();

        
        boolean Lebih_besar = (angkas > angkaz);
        boolean Lebih_kecil = (angkas < angkaz);
        boolean Sama_dengan = (angkas == angkaz);
        boolean Tidak_sama_dengan = (angkas != angkaz);
        boolean Lebih_besar_sama_dengan = (angkas >= angkaz);
        boolean LEbih_kecil_sama_dengan = (angkas <= angkaz);
        

        
        System.out.println(angkas + " > " + angkaz + " adalah " + Lebih_besar);
        System.out.println(angkas + " < " + angkaz + " adalah " + Lebih_kecil);
        System.out.println(angkas + " == " + angkaz + " adalah " + Sama_dengan);
        System.out.println(angkas + " != " + angkaz + " adalah " + Tidak_sama_dengan);
        System.out.println(angkas + " >= " + angkaz + " adalah " + Lebih_besar_sama_dengan);
        System.out.println(angkas + " <= " + angkaz + " adalah " + LEbih_kecil_sama_dengan);

        
        
 
        System.out.println(" Operator Bitwise ");
        System.out.println("==================");
        
        
        Scanner baru = new Scanner(System.in);

        System.out.print("Masukkan angka 1 (bilangan bulat): ");
        int angka = scanner.nextInt();

        System.out.print("Masukkan angka 2 (bilangan bulat): ");
        int angkak = scanner.nextInt();

        
        int And = angkas & angkaz;
        int Or = angkas | angkaz;
        int Xor = angkas ^ angkaz;
        int Negatif_kembali = ~angkas;
        int Negatif_kembali2 = ~angkaz;
        int Left_shift = angkas << angkaz;
        int Right_shift = angkas >> angkaz;
        int Right_shift_unsigned = angkas >>> angkaz;


        
        System.out.println(angkas + " & " + angkaz + " = " + And);
        System.out.println(angkas + " | " + angkaz + " = " + Or);
        System.out.println(angkas + " ^ " + angkaz + " = " + Xor);
        System.out.println("~" + angkas + " = " + Negatif_kembali);
        System.out.println("~" + angkaz + " = " + Negatif_kembali2);
        System.out.println(angkas + " << " + angkaz + " = " + Left_shift);
        System.out.println(angkas + " >> " + angkaz + " = " + Right_shift);
        System.out.println(angkas + " >>> " + angkaz + " = " + Right_shift_unsigned);



        
        scanner.close();
    }
    
}
