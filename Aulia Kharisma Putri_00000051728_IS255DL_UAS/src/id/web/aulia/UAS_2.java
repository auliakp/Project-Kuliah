package id.web.aulia;

import java.util.Scanner;

public class UAS_2 {

	 public static String[] doInsertionSort(String[]arrDiurutkan) {
	  int putaran, index;
	  String temp;
	  int panjangArr = arrDiurutkan.length;
	  for (putaran = 1; putaran < panjangArr; putaran++) {
	   temp = arrDiurutkan[putaran];
	   index = putaran - 1;
	   while (index >= 0 && temp.compareToIgnoreCase(arrDiurutkan[index])<0){
	    arrDiurutkan [index + 1] = arrDiurutkan [index];
	    index = index - 1;
	   }
	   arrDiurutkan[index + 1] = temp;
	  }
	  return arrDiurutkan;
	  }
	 public static int cariBinary (String [] arrData, String keyDicari) {
	  String[] arrDataUrut = doInsertionSort(arrData);
	  int mid, low, high, putaran;
	  low= 0;
	  putaran = 0;
	  high = (arrDataUrut.length) - 1;
	  while (low <= high) {
	   mid = (low + high) / 2;
	   if (arrDataUrut[mid].equalsIgnoreCase(keyDicari)) {
	    return putaran;
	   } else if (arrDataUrut[mid].compareToIgnoreCase (keyDicari)>0) {
	    high = mid - 1;
	    putaran++;
	   } else {
	    low = mid + 1;
	    putaran++;
	    
	   }
	  }
	  return -1;
	}
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Scanner scan = new Scanner (System.in);
	  
	  System.out.println("================Menu Searching================");
	  System.out.print("Kalimat : ");
	  String kalimat = scan.nextLine();
	   
	  String []arai = kalimat.split("\\s+");
	  System.out.print("Kata : ");
	  String StringDicari = scan.nextLine();
	  System.out.println();
	  int putaranBinary = cariBinary(arai, StringDicari);
	  if (putaranBinary >= 0) {
	   System.out.printf("Kata '%s' ditemukan\n",StringDicari);
	  }  else System.out.printf("Kata '%s' tidak ditemukan\n",StringDicari);
	  System.out.println("==============================================");
	 }

	}	 	