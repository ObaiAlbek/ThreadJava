# 🧵 ThreadJava

Dieses Repository enthält verschiedene **Übungen zu Threads in Java**.  
Das Ziel des Projekts ist es, die **Konzepte der Nebenläufigkeit (Concurrency)**, **Thread-Erzeugung**, **Synchronisation**, **Deadlocks** und **Thread-Sicherheit** praktisch zu verstehen und umzusetzen.

---

## 📁 Projektstruktur

```

ThreadJava/
├── Deadlock.java              # Beispiel für Deadlocks und wie sie entstehen
├── Main.java                  # Hauptklasse zum Starten der Thread-Beispiele
├── MyRunnable.java            # Implementierung von Threads über das Runnable-Interface
├── Runner4.java               # Beispiel mit mehreren Threads und Synchronisation
├── ThreadBeispiel.java        # Einfaches Beispiel zur Thread-Erzeugung
├── Thread-Sicherheit.pdf      # Theorie und Zusammenfassung zu Thread-Sicherheit
└── README.md                  # Diese Datei

````

---

## 🧠 Lernziele

- Verständnis von **Threads** und **Nebenläufigkeit** in Java  
- Unterschied zwischen `Thread`-Klasse und `Runnable`-Interface  
- Steuerung von Threads mit `start()`, `join()`, `sleep()` und `interrupt()`  
- **Synchronisation** zur Vermeidung von Datenkonflikten  
- Erkennen und Vermeiden von **Deadlocks**  
- Grundlagen der **Thread-Sicherheit**  

---

## ⚙️ Themenübersicht

### 🔹 1. Thread-Erzeugung
**Dateien:** `MyRunnable.java`, `ThreadBeispiel.java`  
Beispiele für die zwei Standardmethoden zur Thread-Erstellung:
```java
// Variante 1: Thread-Klasse erweitern
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread läuft...");
    }
}

// Variante 2: Runnable-Interface implementieren
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable läuft...");
    }
}
````

---

### 🔹 2. Thread-Steuerung

**Datei:** `Runner4.java`
Demonstriert Methoden wie:

* `start()` – Startet den Thread
* `sleep(ms)` – Pausiert einen Thread
* `join()` – Wartet auf das Ende eines anderen Threads
* `isAlive()` – Prüft, ob ein Thread noch läuft

---

### 🔹 3. Synchronisation und Thread-Sicherheit

**Dateien:** `Runner4.java`, `Thread-Sicherheit.pdf`
Erklärt die Nutzung von:

* `synchronized` Methoden und Blöcken
* `volatile` Variablen
* Zugriffsschutz auf gemeinsame Ressourcen

Beispiel:

```java
public synchronized void increment() {
    counter++;
}
```

---

### 🔹 4. Deadlocks

**Datei:** `Deadlock.java`
Zeigt, wie ein **Deadlock (Verklemmung)** entsteht, wenn mehrere Threads sich gegenseitig blockieren.

```java
synchronized (lock1) {
    Thread.sleep(100);
    synchronized (lock2) {
        // Deadlock möglich
    }
}
```

**Lernziel:** Vermeiden solcher Situationen durch konsistente Sperr-Reihenfolge oder `ReentrantLock`.

---

## ▶️ Ausführung

Kompiliere und starte die Hauptklasse (z. B. `Main.java`) über die Konsole:

```bash
javac *.java
java Main
```

Oder führe sie in einer IDE wie **IntelliJ IDEA**, **Eclipse** oder **VS Code** aus.

---

## 💡 Beispielausgabe (MyRunnable.java)

```text
Thread 1 läuft...
Thread 2 läuft...
Thread 3 läuft...
Alle Threads beendet.
```
## 🧑‍💻 Autor

**Obai Albek**
Student der Informatik – TH Mannheim
GitHub: [ObaiAlbek](https://github.com/ObaiAlbek)

