package main;


import java.util.*;

public class Liste {

    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(80);
        list.add(80);

        //list.clear();

        if (list.isEmpty()){
            System.out.println("Lista je prazna");
        }else {
            System.out.println("Lista nije prazna: " + list);
        }

        List<String> strings = new ArrayList<>(Arrays.asList("prvi","drugi", "treci"));
        //System.out.println(strings);


        List linkedList = new LinkedList();

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet(list);
        System.out.println(set1);

    }


    //Napraviti apstraktnu klasu Radnik
    //Napraviti Main klasu za ispis
    //Sub klase: radnik po satu, radnik po danu, radnik fiksno
    //polja: ime, prezime, jmbg, ziro racun, plata
    //napraviti metod isplatiPlatu() koji ce da ispisuje podatke radnika i obracun za svakog radnika posebno
    //u Main klasi podatke za svaki objekat puniti preko Scanner klase


    /*
    Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
- Napraviti klasu koja sadrzi Main metodu i u njoj napraviti minimum 4 studenta cije podatke treba uneti preko scanner-a: ime prezime i ocena.
- Ocene treba da budu 5,6,7 i 9.
- Kreirati dve liste.
- Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
- Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
- Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
- Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.
     */




}
