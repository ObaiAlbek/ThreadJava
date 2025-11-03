package Thread;
/* 
 * - Jedes Thread-Objekt besitzt eine eindeutige (ID) und einen eigenen (Namen)
 * 		Diese können über die Methoden getId() und getName() abgerufen werden
 * - Jeder Thread besitzt eine Priorität zwischen 1 und 10 (Priority).
 * - Ein Thread mit höherer Priorität wird bevorzugt ausgeführt.
 * 		Ändere die Priority nur, wenn ein Thread wichtiger ist.
 * - Standardmäßig hat jeder neu erstellte Thread eine Priority von 5,
 * 		 um eine faire parallele Ausführung zu gewährleisten.
 * 
 * - Unterschied zwischen den Methoden run() und start(): 
 *   . run(): Direkter Aufruf also Das bedeutet, dass kein neuer Thread gestartet wird. 
 *   		  Kein Multithreading: Da kein neuer Thread gestartet wird, findet keine parallele Ausführung statt.
 *   
 *   .start(): Neuen Thread starten: Der Aufruf der start()-Methode bewirkt, dass ein neuer Thread erzeugt wird, 
 *   			und der Code innerhalb der run()-Methode wird in diesem neuen Thread ausgeführt
 *   			.Multithreading: Die start()-Methode führt tatsächlich zu Multithreading, 
 *   			weil sie den neuen Thread in den "Runnable" Zustand versetzt und schließlich die run()-Methode in diesem separaten Thread ausgeführt wird.
 *   
 *   
 */
public class ThreadBeispiel {
	
	public static void main(String[] args) {
		
		// Erstellen eines Threads mit einem benutzerdefinierten Namen
        Thread myThread = new Thread(() -> {
            System.out.println("Dieser Thread läuft");
        }, "MeinThread");

        // Starten des Threads
        myThread.run();
        myThread.start();

        // Abrufen der eindeutigen Thread-ID und des Thread-Namens
        System.out.println("Thread-ID: " + myThread.getId());
        System.out.println("Thread-Name: " + myThread.getName());
    }
}


