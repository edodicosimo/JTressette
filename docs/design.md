# JTresette

Progetto finale per il corso di Metodologie di Programmazione

## Architettura
Il progetto segue il pattern di architettura MVC (model, view, controller).

## Tech stack
- Java 25
- JavaFX
- Maven
- Git

## Specifiche richieste
1. Gestione del profilo utente
    - nickname
    - avatar, 
    - partite giocate, vinte e perse, 
    - livello (potrei fare che ogni tot vittorie si aumenta di livello)
2. Gestione di una partita completa con un giocatore umano contro 1, 2 o 3 giocatori artificiali
    - giocatori artificiali
    - scelta di quanti giocatori per partita
3. Riproduzione di audio sample (si veda appendice AudioManager.Java)
4. Animazioni ed effetti speciali (anche se limitati) 

## Design Pattern 
- Strategy pattern per l'AI degli avversari
- Observer per l'aggiornamento dell'UI