# Greenfoot Befehle

## Actor Befehle

```Actor``` muss bei folgenden Befehlen immer durch ```this``` (wenn man den Actor, dem das Skript gehört ansprechen will) oder den Namen eines anderen Actors ersetzt werden.

### Actor bewegen
```java
Actor.move(int schritte);
```

### Actor drehen
```java
Actor.turn(int gradZahl);
```

### Randberührung prüfen
```java
Actor.isAtEdge();
```

## Welt Befehle

```World``` muss bei folgenden Befehlen immer durch ```this``` (wenn man sich in der Welt-Klasse befindet) oder den Namen einer anderen Welt ersetzt werden.

### Actor zur Welt hinzufügen
```java
World.addObject(Actor actor, int xKoordinate, int yKoordinate);
```

## Greenfoot Befehle

### Tastatureingaben auslesen
```java
Greenfoot.isKeyDown(String taste);
```