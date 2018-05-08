// Kurzbeschreibung Bubble-Sort-Algorithmus
// A1: Wiederhole in einer Schleife entsprechend der Anzahl der
//        Array-Elemente den Schritt A2.
// A2: Vergleiche schrittweise in einer Schleife alle Array-Element-Nachbarn
//        ob der linke Nachbar kleiner ist wie der rechte Nachbar und
// A3: bringe diese Array-Nachbar-Elemente ggf. in die richtige Reihenfolge

package zzBubbleSort_1;

public class BubbleSort_1 {
	// where we want to go:
	// Puffer zum Erfassen der Personendaten
	// static String [] myNewPerson = new String[4]; 

	// Puffer für die gesammelten Personendaten
	// static String [][] myPersons = new String[10][4];
/**
 * Die main()-Funktion ist der Testtreiber
 * 	      der Testtreiber erzeugt ein Test-Array
 *       (hier der Einfachheit-halber statisch initialisiert; siehe Zeile 30)
 *       Das Test-Array wir auf der Console ausgegeben
 *       Dann wird die bubbleSort()-Methode aufgerufen und das Test-Array
 *       als Parameter übergeben. Siehe Zeile 37
 *        Danach wird das sortierte Test-Array wieder auf der Console ausgegeben.
 * @param args - not used
 */
	public static void main(String[] args) {

		// where we start - a simple int Array to bubblesort()
		int [] folge = new int [] {6,5,3,100,1,8,7,2,4,200}; //Elemente durcheinander
		System.out.println("\nHier das unsortierte Array:");
		// print out unsorted array
		for(int i=0; i<folge.length;i++)
			System.out.print(folge[i]+", ");

		System.out.println("\nJetzt wird sortiert mit bubbleSort()!");
		bubbleSort(folge);
		
		System.out.println("\nHier die Ausgabe des sortierten Arrays:");
		// print out sorted array
		for(int i=0; i<folge.length;i++)
			System.out.print(folge[i]+", ");
	}
	
/**
 * Bubble-Sort-Algorithmus für eindimensionales int-Array
 * @param folge das eindimensionales int-Array als Übergabeparameter
 * Parameterübergabe als call-by-reference, das bedeuted die Methode bubbleSort()
 * arbeitet direkt auf dem Original-int-Array; eine Ergebnisrückgabe wird damit
 * nicht notwendig (wissen Sie aus dem ersten Semester PROG1!)
 */
	public static void bubbleSort(int folge[]) {
		int tmp; // Puffervariable für int

		for (int i=0; i<folge.length; i++)          // A1
			for(int j=0;j<folge.length - 1;j++)   // A2
				if(folge[j+1] < folge[j])                // A3
				{
					tmp = folge[j+1];
					folge[j+1]=folge[j];
					folge[j]= tmp;
				}
	
	}
}
