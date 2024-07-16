package com.snakeweber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Main app = new Main();
        app.run();
    }

    private void run() {
        Map<Character, String> encounterMap = new HashMap<>();
        fillEncounterMap(encounterMap);
        Scanner userInput = new Scanner(System.in);
        String playerName;
        System.out.println("MissingNo glitch encounter calculator");
        do {
            System.out.println("Enter your trainer name (use 1 for PK, 2 for MN, 3 for ♂, 4 for ×, and 5 for ♀:");
            playerName = userInput.nextLine();
        }
        while (playerName.length() >7 || playerName.isEmpty());
        String[] encounterList = new String[5];
        char currentChar = ' ';
        for (int i = 0; i < encounterList.length; i++) {
            if(playerName.length() >= (2 * i) + 3) {
                currentChar = playerName.charAt((2 * i) + 2);
                if(encounterMap.containsKey(currentChar)) {
                    encounterList[i] = encounterMap.get(currentChar);
                }
            }
            else {
                encounterList[i] = "'M (00)";
            }
        }
        PrintEncounterData(playerName, encounterList);
    }

    public void fillEncounterMap(Map<Character, String> encounterMap) {
        encounterMap.put('A', "Golduck");
        encounterMap.put('B', "Hypno");
        encounterMap.put('C', "Golbat");
        encounterMap.put('D', "Mewtwo");
        encounterMap.put('E', "Snorlax");
        encounterMap.put('F', "Magikarp");
        encounterMap.put('G', "MissingNo");
        encounterMap.put('H', "MissingNo");
        encounterMap.put('I', "Muk");
        encounterMap.put('J', "MissingNo");
        encounterMap.put('K', "Kingler");
        encounterMap.put('L', "Cloyster");
        encounterMap.put('M', "MissingNo");
        encounterMap.put('N', "Electrode");
        encounterMap.put('O', "Clefable");
        encounterMap.put('P', "Weezing");
        encounterMap.put('Q', "Persian");
        encounterMap.put('R', "Marowak");
        encounterMap.put('S', "MissingNo");
        encounterMap.put('T', "Haunter");
        encounterMap.put('U', "Abra");
        encounterMap.put('V', "Alakazam");
        encounterMap.put('W', "Pidgeotto");
        encounterMap.put('X', "Pidgeot");
        encounterMap.put('Y', "Starmie");
        encounterMap.put('Z', "Bulbasaur");
        encounterMap.put('(', "Venusaur");
        encounterMap.put(')', "Tentacruel");
        encounterMap.put(':', "MissingNo");
        encounterMap.put(';', "Goldeen");
        encounterMap.put('[', "Seaking");
        encounterMap.put(']', "MissingNo");
        encounterMap.put('a', "MissingNo");
        encounterMap.put('b', "MissingNo");
        encounterMap.put('c', "MissingNo");
        encounterMap.put('d', "Ponyta");
        encounterMap.put('e', "Rapidash");
        encounterMap.put('f', "Rattata");
        encounterMap.put('g', "Raticate");
        encounterMap.put('h', "Nidorino");
        encounterMap.put('i', "Nidorina");
        encounterMap.put('j', "Geodude");
        encounterMap.put('k', "Porygon");
        encounterMap.put('l', "Aerodactyl");
        encounterMap.put('m', "MissingNo");
        encounterMap.put('n', "Magnemite");
        encounterMap.put('o', "MissingNo");
        encounterMap.put('p', "MissingNo");
        encounterMap.put('q', "Charmander");
        encounterMap.put('r', "Squirtle");
        encounterMap.put('s', "Charmeleon");
        encounterMap.put('t', "Wartortle");
        encounterMap.put('u', "Charizard");
        encounterMap.put('v', "MissingNo");
        encounterMap.put('w', "MissingNo");
        encounterMap.put('x', "MissingNo");
        encounterMap.put('y', "MissingNo");
        encounterMap.put('z', "Oddish");
        encounterMap.put('1', "Rival Blue");
        encounterMap.put('2', "Pokemon Prof.");
        encounterMap.put('-', "Chief");
        encounterMap.put('?', "Rocket");
        encounterMap.put('!', "Cooltrainer");
        encounterMap.put('3', "Blaine");
        encounterMap.put('4', "Gentleman");
        encounterMap.put('.', "Rival Blue");
        encounterMap.put('/', "Champion Blue");
        encounterMap.put(',', "Lorelei");
        encounterMap.put('5', "Channeler");
    }

    public void PrintEncounterData(String playerName, String[] encounters) {
        System.out.println("*************************************");
        System.out.println("ENCOUNTER TABLE FOR " + playerName);
        System.out.println("1. " + encounters[0]);
        System.out.println("2. " + encounters[1]);
        System.out.println("3. " + encounters[2]);
        System.out.println("4. " + encounters[3]);
        System.out.println("5. " + encounters[4]);
        System.out.println("*************************************");
    }
}