package id.web.aulia;

import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class UAS_1 {

			  private static Formatter output;
			  public static void tukar(int[]myArr, int index) {
			   int arrPertama = myArr[index];
			   int arrKedua = myArr[index-1];
			   myArr[index]= arrKedua;
			   myArr[index-1]= arrPertama;
			  }
			  public static void tukarS(String []myArr, int index) {
			   String arrPertama = myArr[index];
			   String arrKedua = myArr[index-1];
			   myArr[index]= arrKedua;
			   myArr[index-1]= arrPertama;
			  }
			  public static void bubblesortaz( String [] nama, int[] nilai) {
			   String temp;
			   int temp1, temp2,temp3;
			   int panjangArr= nama.length;
			   for (int j = 0; j < panjangArr; j++) {
			          for (int i = j + 1; i < panjangArr; i++) {
			        for(int putaran=1; putaran<panjangArr;putaran++) {
			        for(int index = panjangArr - 1;index >= putaran;index-- ) {
			     if (nama[i].compareToIgnoreCase(nama[j]) < 0) {
			      temp=nama[j];
			      nama[j]=nama[i];
			      nama[i]=temp;
			      
			      temp1 = nilai[j];
			      nilai[j] = nilai[i];
			      nilai[i] = temp1;
			      }
			        }
			       }
			          }
			    }
			  }
			  public static void bubblesortza(String [] nama, int[] nilai) {
			   String temp;
			   int temp1,temp2,temp3;
			   int panjangArr= nama.length;
			   for (int j = 0; j < panjangArr; j++) {
			          for (int i = j + 1; i < panjangArr; i++) {
			     if (nama[i].compareToIgnoreCase(nama[j]) > 0) {
			      
			      temp=nama[j];
			      nama[j]=nama[i];
			      nama[i]=temp;
			      
			      temp1 = nilai[j];
			      nilai[j] = nilai[i];
			      nilai[i] = temp1;
			      
			     
			       }
			     }
			       }
			          
			    }
			  
			  public static void doBubbleSortA(String [] nama, int[] nilai) {
			   int panjangArr = nilai.length;
			   for(int putaran=1; putaran<panjangArr;putaran++) {
			    for(int index = panjangArr - 1;index >= putaran;index-- ) {
			    if (nilai[index-1] > nilai[index]) {
			     tukar(nilai,index);
			     tukarS(nama,index);
			    } else {
			     System.out.println();
			    }
			    }
			   }
			   System.out.println();
			  }
			  public static void doBubbleSortD(String [] nama, int[] nilai) {
			   int panjangArr = nilai.length;
			   for(int putaran=1; putaran<panjangArr;putaran++) {
			    for(int index = panjangArr - 1;index >= putaran;index-- ) {
			    if (nilai[index-1] < nilai[index]) {
			     tukar(nilai,index);
			     tukarS(nama,index);
			     
			    } else {
			     System.out.println();
			    }
			    }
			   }
			   System.out.println();
			  }

			  public static void main(String[] args) {
			   Scanner input = new Scanner(System.in);
			   System.out.printf("Input banyak data: ");
			   int x = input.nextInt();
			   int f=1;
			   int [] nilai = new int[x];
			   String [] nama = new String[x];
			   for(int y=0;y<x;y++) {
			    System.out.printf("Input nama ke- %d: ",f);
			    nama[y]= input.next();
			    System.out.printf("Input nilai ke- %d: ",f);
			    nilai[y]= input.nextInt();
			    f=f+1;
			   }
			   System.out.printf("\nMenu: ");
			   System.out.printf("\n1. Sort berdasarkan nama A-Z ");
			   System.out.printf("\n2. Sort berdasarkan nama Z-A ");
			   System.out.printf("\n3. Sort berdasarkan nilai (ASC)");
			   System.out.printf("\n4. Sort berdasarkan nilai (DESC)");
			   System.out.print("\nPilihan: ");
			   int m= input.nextInt();
			   switch(m) {
			    case 1: 
			     bubblesortaz(nama,nilai);
			     bukaFile1();
			     create(nama,nilai,x);
			     break;
			    case 2:
			     bubblesortza(nama,nilai);
			     bukaFile1();
			     create(nama,nilai,x);
			     break;
			    case 3:
			     doBubbleSortA(nama,nilai);
			     bukaFile1();
			     create(nama,nilai,x);
			     break;
			    case 4:
			     doBubbleSortD(nama,nilai);
			     bukaFile1();
			     create(nama,nilai,x);
			     break;
			    
			    
			  }
			  }
			  public static void bukaFile1() {
			   try {
			    output= new Formatter("uasSorted.txt");
			   }catch(SecurityException except1) {
			    System.err.println("Anda tidak boleh"+ "menulis ke file ini");
			    System.exit(1);
			   }catch(FileNotFoundException except2) {
			    System.err.println("File tidak ditemukan");
			    System.exit(1);
			   }
			  }
			   public static void create(String nama[], int nilai[], int d){
			    try (Formatter file = new Formatter("uasSorted.txt")) {
			     int o = 1;
			     String separator = System.getProperty("line.separator");
			     file.format("Nilai Mata Kuliah Algoritma%s",separator);
			     file.format("========================%s",separator);
			     for(int i=0;i<d;i++) {
			     file.format("%d. %s %d%s",o, nama[i],nilai[i], separator);
			     o=o+1;
			      }
			     }
			    
			     catch(FileNotFoundException ex){
			       System.out.println("File Tidak Ditemukan"); 
			     }
			   }
}
			   