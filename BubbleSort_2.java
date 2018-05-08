// Der Bubble-Sort-Algorithmus auf String-Matrix
// A1: Wiederhole in einer Schleife entsprechend der Anzahl der
//        Array-Elemente den Schritt A2.
// A2: Vergleiche schrittweise in einer Schleife alle Array-Element-Nachbarn
//        und
// A3: bringe diese Array-Nachbar-Elemente ggf. in die richtige Reihenfolge
package zzBubbleSort_2;
/**
 * This class is an example for hand crafted bubbleSort-Algorithm
 * applicable for Sting matrixes
 * @author Prof. J. Anton Illik
 * @version 1.0
 */
public class BubbleSort_2 {
	// Das String-Array mySavedPerson = Puffer zum Sortieren: die gerettete Matrix-Zeile
	static String [] mySavedPerson = new String[]
			   {"Herr", "Hans","Mustermann","182"}; 
	
    // Die String-Matrix myPersons, die sortiert werden soll
	static String [][] myPersons = 
			new String[][] 	{{"Herr","Hans","Adamson","172"},
		                                 {"Frau","Anna","Krause","170"},
		                                 {"Frau","Berta","Brause","171"},
		                                 {"Herr","Fritz","Fratz","172"},
		                                 {"Herr","Hugo","Matz","172"},		
		                                 {"Frau","Mad","Chick","172"},
		                                 {"Frau","Sue","Leika","172"} };
		
		// Symbolische Konstanten als Array-Inidzes                                 
		final static int ANREDE = 0;
		final static int VORNAME = 1;
		final static int NACHNAME = 2;
		final static int GROESSE = 3;
/**
 * This is the test driver main() for bubbleSort(String[][],int).
 * It prints out unsorted String array.
 * Then bubbleSort(String[][],int) the String array; Sortierkriterium ist Index int
 * At last prints out bubbleSorted String array.
 * @param args not used
 */
		public static void main(String[] args) {
			System.out.println("mySavedPerson= "+mySavedPerson[0]
					+" "+mySavedPerson[1]+" "+mySavedPerson[2]
				    +" "+mySavedPerson[3]);
			// wir geben die zu sortierende String-Matrix aus
			System.out.println("\nHier die unsortierte String-Matrix:");
			for(int zeile = 0; zeile < myPersons.length;zeile++) {
				//			System.out.println("Zeile: "+zeile);
				System.out.print(myPersons[zeile][ANREDE]+" ");
				System.out.print(myPersons[zeile][VORNAME]+" ");
				System.out.print(myPersons[zeile][NACHNAME]+" ");
				System.out.println(myPersons[zeile][GROESSE]+" ");
			}

			System.out.println("\nJetzt wird die String-Matrix ");
			System.out.println("sortiert mit bubbleSort()!");
			bubbleSort(myPersons,2); // 2 = Spalte mit Sortierkriterium

			System.out.println("\nHier die Ausgabe des sortierten Arrays:");
			// print out sorted String-Matrix
			for(int zeile = 0; zeile < myPersons.length;zeile++) {
				//  System.out.println("Zeile: "+zeile);
				System.out.print(myPersons[zeile][ANREDE]+" ");
				System.out.print(myPersons[zeile][VORNAME]+" ");
				System.out.print(myPersons[zeile][NACHNAME]+" ");
				System.out.println(myPersons[zeile][GROESSE]+" ");
			}
		}
        /**
         * bubbleSort(String[][],int)  implements bubbleSort-Algorithm 
         * for String matrixes
         * @param myMatrix String matrix to be sorted
         * @param sortcrit sorting critera 
         *                 field index containg sorting criteria
         */
		public static void bubbleSort(String myMatrix[][], int sortcrit) {
			int vr = 0; //vr = Vergleichsresultat
			for (int zeile1=0; zeile1 < myMatrix.length; zeile1++) { // A1                 
				for(int zeile2=0;zeile2 < myMatrix.length;zeile2++) {   // A2
					if((vr = ((myMatrix[zeile1][sortcrit]).compareTo(myMatrix[zeile2][sortcrit]))) < 0) { // A3
						mySavedPerson[ANREDE]=myMatrix[zeile2][ANREDE];
						mySavedPerson[VORNAME]=myMatrix[zeile2][VORNAME];
						mySavedPerson[NACHNAME]=myMatrix[zeile2][NACHNAME];
						mySavedPerson[GROESSE]=myMatrix[zeile2][GROESSE];
						
						myMatrix[zeile2][ANREDE]=myMatrix[zeile1][ANREDE];
						myMatrix[zeile2][VORNAME]=myMatrix[zeile1][VORNAME];
						myMatrix[zeile2][NACHNAME]=myMatrix[zeile1][NACHNAME];
						myMatrix[zeile2][GROESSE]=myMatrix[zeile1][GROESSE];
						
						myMatrix[zeile1][ANREDE]=mySavedPerson[ANREDE];
						myMatrix[zeile1][VORNAME]=mySavedPerson[VORNAME];
						myMatrix[zeile1][NACHNAME]=mySavedPerson[NACHNAME];
						myMatrix[zeile1][GROESSE]=mySavedPerson[GROESSE];
					}
				}				
			}
		}
}
