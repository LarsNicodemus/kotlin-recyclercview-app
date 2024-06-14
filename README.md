# Helden und Bösewichte

Ein Marvel-Fanklub ist auf dich zugekommen und möchte eine App haben, in der die Helden und Bösewichte aus dem Marvel-Universum angezeigt werden sollen. 
Zum Testen hast du bereits Daten von 30 verschiedenen Charakteren gegeben. Diese findest du in der Klasse "Datasource". Sieh dir auch die zugrundliegende Datenstruktur (Klasse) eines einzelnen Charakters an! 

## Aufgabe 1 - Die RecyclerView

Du wurdest gebeten, eine RecyclerView zu implementieren, welche die 30 gegebenen Charaktere anzeigen soll. **Dabei wurde explizit gefordert, dass es für Superhelden und Bösewichte verschiedenen Item-Layouts geben soll.** Diese können, wie du bereits weißt, anhand des ViewTypes unterschieden werden. Lege die beiden Item-Layouts an und implementiere die nötigen Funktionalitäten des Adapters!

Hier ist ein *Beispiel* wie die App aussehen könnte:


<p align="center">
    <img src=img/img1.png width="25%">
</p>

## Aufgabe 2 - Sortierung

Außerdem möchte dein/e Auftraggeber/in, dass man die Einträge der RecyclerView auch sortieren kann. Es soll möglich sein wie in Aufgabe 1 alle Charaktere gemischt anzuzeigen, aber eben auch entweder nur Helden oder nur Bösewichte:

<p align="center">
    <img src=img/img2.png width="25%">
  <img src=img/img3.png width="25%">
</p>

<details>
<summary>Tipps zu Aufgabe 2</summary>

Die Anforderung der Sortier-Funktion kann auf verschiedene Arten gelöst werden:
  1. Es ist möglich, dem bereits vorhandenem Adapter eine neue Liste (Dataset) zuzuweisen. Dafür bietet es sich an, eine eigene Funktion innerhalb der Adapters zu schreiben, welche die neue Liste als Parameter erhält und dann das bereits vorhandene Dataset überschreibt. Anschließend muss noch der Befehl "notifyDataSetChanged()" aufgerufen werden, um dem Adapter mitzuteilen, dass es eine Veränderung am Datensatz gab und der Inhalt neu geladen werden muss.
  2. Es ist auch möglich, einfach einen neuen Adapter mit einer neuen (gefilterten) Liste an Items zu erstellen und der RecyclerView einfach diesen neuen Adapter zuzuweisen.
</details>
