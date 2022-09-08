package com.filipidulac.projekat;

import java.util.ArrayList;
import java.util.List;

public class ListaPitanja {

    private static List<Pitanja> zastavePitanja(){
        final List<Pitanja> pitanja = new ArrayList<>();

        final Pitanja pitanje1=new Pitanja("Jedina zastava na svetu koja nije četvrtastog oblika je zastava:", "Nigerije", "Nemačke", "Nepala", "Namibije", "Nepala", "", 1);
        final Pitanja pitanje2=new Pitanja("Sivi ždral sa podignutom nogom zauzima centralni deo na zastavi:", "Urugvaja", "Ugande", "Ukrajine", "Uzbekistana", "Ugande", "",3);
        final Pitanja pitanje3=new Pitanja("Zemlja koja na svojoj zastavi ima oružje, zajedno sa natpisom koji je temelj islamskog verovanja je:", "Saudijska Arabija", "Sirija", "Maroko", "Kongo", "Saudijska Arabija", "",2);
        final Pitanja pitanje4=new Pitanja("Zastava na kojoj je prikazan objekat pod nazivom Angor Vat, pripada državi:", "Keniji", "Kataru", "Kanadi", "Kambodži", "Kambodži", "",2);
        final Pitanja pitanje5=new Pitanja("Pored kalašnjikova, na ovoj zastavi se nalaze i motika i knjiga, ukrštene zajedno. Zastava pripada državi:", "Maliju", "Mongoliji", "Mozambiku", "Madagaskaru", "Mozambiku", "",3);
        final Pitanja pitanje6=new Pitanja("Prva zemlja koja je na nacionalnu zastavu stavila zmaja je:", "Butan", "Vels", "Malta", "Egipat", "Butan", "",1);
        final Pitanja pitanje7=new Pitanja("Sunce sa 40 sunčevih zraka zauzima centralni deo na zastavi:", "Kameruna", "Urugvaja", "Kirgistana", "Argentine", "Kirgistana", "",3);
        final Pitanja pitanje8=new Pitanja("Na zastavi ove zemlje pored tri boje u pozadini, u centralnom delu se nalazi štit pod nazivom Masaji štit. Koja je država u pitanju?", "Kongo", "Kenija", "Etiopija", "Alžir", "Kenija", "",1);
        final Pitanja pitanje9=new Pitanja("Koliko zvezdica se nalazi na zastavi Kine:", "3", "4", "5", "6", "5", "",1);
        final Pitanja pitanje10=new Pitanja("Na zastavi koje zemlje se nalazi drvo kedar?", "Liban", "Liberija", "Libija", "Iran", "Liban", "",2);

        pitanja.add(pitanje1);
        pitanja.add(pitanje2);
        pitanja.add(pitanje3);
        pitanja.add(pitanje4);
        pitanja.add(pitanje5);
        pitanja.add(pitanje6);
        pitanja.add(pitanje7);
        pitanja.add(pitanje8);
        pitanja.add(pitanje9);
        pitanja.add(pitanje10);

        return pitanja;

    }

    private static List<Pitanja> gradoviPitanja(){
        final List<Pitanja> pitanja = new ArrayList<>();

        final Pitanja pitanje1=new Pitanja("Kako se zove glavni grad Islanda?", "Riga", "Rejkjavik", "Rabat", "Roterdam", "Rejkjavik", "",1);
        final Pitanja pitanje2=new Pitanja("Kako se zove glavni grad Moldavije?", "Kijev", "Kairo", "Kišinjev", "Kabul", "Kišinjev", "",2);
        final Pitanja pitanje3=new Pitanja("Kako se zove glavni grad Poljske?", "Varšava", "Velington", "Vašington", "Vaduc", "Varšava", "",1);
        final Pitanja pitanje4=new Pitanja("Kako se zove glavni grad Urugvaja?", "Montevideo", "Sao Paolo", "Buenos Ajres", "Karakas", "Montevideo", "",2);
        final Pitanja pitanje5=new Pitanja("Kako se zove glavni grad Belgije?", "Amsterdam", "Beč", "Brisel", "Berlin", "Brisel", "",1);
        final Pitanja pitanje6=new Pitanja("Kako se zove glavni grad Argentine?", "Bogota", "Rio de Žaneiro", "Bisau", "Buenos Ajres", "Buenos Ajres", "",1);
        final Pitanja pitanje7=new Pitanja("Kako se zove glavni grad Australije?", "Melburn", "Kanbera", "Sidnej", "Pert", "Kanbera", "",3);
        final Pitanja pitanje8=new Pitanja("Kako se zove glavni grad UAE?", "Dubai", "Damask", "Abu Dabi", "Bagdad", "Abu Dabi", "",2);
        final Pitanja pitanje9=new Pitanja("Kako se zove glavni grad Švedske?", "Stokholm", "Oslo", "Helsinki", "Riga", "Stokholm", "",1);
        final Pitanja pitanje10=new Pitanja("Kako se zove glavni grad Estonije?", "Kijev", "Viljnus", "Talin", "Minsk", "Talin", "",2);

        pitanja.add(pitanje1);
        pitanja.add(pitanje2);
        pitanja.add(pitanje3);
        pitanja.add(pitanje4);
        pitanja.add(pitanje5);
        pitanja.add(pitanje6);
        pitanja.add(pitanje7);
        pitanja.add(pitanje8);
        pitanja.add(pitanje9);
        pitanja.add(pitanje10);

        return pitanja;

    }

    private static List<Pitanja> stanovnistvoPitanja(){
        final List<Pitanja> pitanja = new ArrayList<>();

        final Pitanja pitanje1=new Pitanja("Ostrvska država sa najvećim brojem stanovnika je:", "Haiti", "Filipini", "Fidži", "Madagaskar", "Filipini", "",3);
        final Pitanja pitanje2=new Pitanja("Sredozemna država sa najvećim brojem stanovnika je:", "Turska", "Grčka", "Italija", "Alžir", "Turska", "",2);
        final Pitanja pitanje3=new Pitanja("Najnaseljenija zemlja Balkanskog poluostrva je:", "Srbija", "Severna Makedonija", "Bugarska", "Grčka", "Grčka", "",1);
        final Pitanja pitanje4=new Pitanja("Koja od ponuđenih država ima najveći broj stanovnika:", "Kina", "Kolumbija", "Kenija", "Kostarika", "Kina", "",1);
        final Pitanja pitanje5=new Pitanja("Najmnogoljudnija država u Evropi je:", "Nemačka", "Francuska", "Italija", "Rusija", "Rusija", "",2);
        final Pitanja pitanje6=new Pitanja("4. država na svetu po broju stanovnika je:", "Nigerija", "Indija", "Indonezija", "Brazil", "Indonezija", "",3);
        final Pitanja pitanje7=new Pitanja("Sa 214.028.302 stanovnika, ova država je najmnogoljudnija afrička država:", "Etiopija", "Nigerija", "Egipat", "Južnoafrička republika", "Nigerija", "",2);
        final Pitanja pitanje8=new Pitanja("Prema zvaničnim podacima azijska zemlja sa najmanjim brojem stanovnika je:", "Kuvajt", "Katar", "Maldivi", "Bahrein", "Maldivi", "",3);
        final Pitanja pitanje9=new Pitanja("Koja od ovih malih država po je najnaseljenija:", "San Marino", "Monako", "Vatikan", "Lihteštajn", "Lihteštajn", "",2);
        final Pitanja pitanje10=new Pitanja("Najgušće naseljena država na svetu je:", "Monako", "Maldivi", "Singapur", "Bahrein", "Monako", "",3);

        pitanja.add(pitanje1);
        pitanja.add(pitanje2);
        pitanja.add(pitanje3);
        pitanja.add(pitanje4);
        pitanja.add(pitanje5);
        pitanja.add(pitanje6);
        pitanja.add(pitanje7);
        pitanja.add(pitanje8);
        pitanja.add(pitanje9);
        pitanja.add(pitanje10);

        return pitanja;

    }

    private static List<Pitanja> cudaPitanja(){
        final List<Pitanja> pitanja = new ArrayList<>();

        final Pitanja pitanje1=new Pitanja("U kojoj državi se nalazi Tadž Mahal?", "Indoneziji", "Indiji", "Iranu", "Izraelu", "Indiji", "",1);
        final Pitanja pitanje2=new Pitanja("Čuveni grad drevnih Asteka, Čičen Ica nalazi se u:", "Peru", "Venecueli", "Boliviji", "Meksiku", "Meksiku", "",2);
        final Pitanja pitanje3=new Pitanja("Jedno od sedam svetskih čuda starog sveta, Faros u Aleksandriji, nalazio se na teriroriji koje današnje države?", "Egipta", "Tunisa", "Alžira", "Libije", "Egipta", "",1);
        final Pitanja pitanje4=new Pitanja("Čuvena crkva Sagrada Familia se nalazi u kom španskom gradu", "Valensija", "Barselona", "Madrid", "Bilbao", "Barselona", "",1);
        final Pitanja pitanje5=new Pitanja("Sveti grad Inka Maču Pikču nalazi se na teritoriji:", "Čilea", "Venecuele", "Perua", "Urugvaja", "Perua", "",3);
        final Pitanja pitanje6=new Pitanja("Crkva svetog Vasilija ukrašava Crveni trg koji se nalazi u:", "Moskvi", "Kazanju", "Kijevu", "Minsku", "Moskvi", "",1);
        final Pitanja pitanje7=new Pitanja("Viseći vrtovi u Vavilonu danas bi se nalazili u:", "Iranu", "Iraku", "Izraelu", "Indoneziji", "Iraku", "",3);
        final Pitanja pitanje8=new Pitanja("Kip slobode prestavlja simbol kog američkog grada?", "Čikaga", "Los Anđelesa", "Njujorka", "Vašingtona", "Njujorka", "",1);
        final Pitanja pitanje9=new Pitanja("Statua Hrista Spasitelja nalazi se u", "Sao Paulu", "Rio de Žaneiru", "Braziliji", "Montevideu", "Rio de Žaneiru", "",2);
        final Pitanja pitanje10=new Pitanja("Od sedam svetskih čuda starog sveta najstarije je?", "Piramide u Gizi", "Kolos sa Rodosa", "Statua Zevsa u Olimpiji", "Mauzolej u Halikarnasu", "Piramide u Gizi", "",2);

        pitanja.add(pitanje1);
        pitanja.add(pitanje2);
        pitanja.add(pitanje3);
        pitanja.add(pitanje4);
        pitanja.add(pitanje5);
        pitanja.add(pitanje6);
        pitanja.add(pitanje7);
        pitanja.add(pitanje8);
        pitanja.add(pitanje9);
        pitanja.add(pitanje10);

        return pitanja;
    }

    public  static List<Pitanja> vratiPitanja(String selectedTopicName) {
        switch (selectedTopicName){
            case "Zastave": return zastavePitanja();
            case "Glavni gradovi": return gradoviPitanja();
            case "Stanovnistvo": return stanovnistvoPitanja();
            default: return cudaPitanja();
        }
    }
}
