import Models.Movie;
import Models.Seat;
import Models.Ticket;
import Models.User;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> genres = new ArrayList<>();
        genres.add("Disney");
        genres.add("Artistic");
        genres.add("Drama");
        genres.add("Thriller");
        genres.add("Action");
        genres.add("Comedy");
        genres.add("Romantic");
        genres.add("Emotional");

        ArrayList<String> Rupanzel = new ArrayList<>();
        Rupanzel.add(genres.get(0));
        Rupanzel.add(genres.get(2));
        Rupanzel.add(genres.get(4));
        Rupanzel.add(genres.get(6));
        Rupanzel.add(genres.get(1));

        ArrayList<String> The Box = new ArrayList<>();
        The Box.add(genres.get(2));
        The Box.add(genres.get(5));
        The Box.add(genres.get(4));
        The Box.add(genres.get(7));

        ArrayList<String> Bird Box = new ArrayList<>();
        Bird Box.add(genres.get(1));
        Bird Box.add(genres.get(2));
        Bird Box.add(genres.get(3));
        Bird Box.add(genres.get(4));
        Bird Box.add(genres.get(7));

        Movie mv1 = new Movie(true, true, Rupanzel, "Rupanzel: The story of long hair", "XY ZY", "13:00 PM", 550, 350);
        Movie mv2 = new Movie(true, true, The Box, "The Box", "Ab Cd", "19:30 PM", 750, 500);
        Movie mv3 = new Movie(true, true, Bird Box, "Bird Box: A message", "Selmon Bhei", "16:15 PM", 550, 300);


        mv1.getMovieDetail();
        for (String singleRupanzel: Rupanzel){
            System.out.println("-"+singleRupanzel);
        }

        mv2.getMovieDetail();
        for (String singleThe Box: The Box){
            System.out.println("-"+singleThe Box);
        }

        mv3.getMovieDetail();
        for (String singleBird Box: Bird Box){
            System.out.println("-"+singleBird Box);
        }

        System.out.println("\n\n-----------------------Movies And Showtime-----------------------");
        mv1.getMovies();
        mv2.getMovies();
        mv3.getMovies();

        System.out.println("\n\n-----------------------Specific Showtime-----------------------");
        mv1.getSpecificMovie("14:00 PM");

        User usr1 = new User("Saphal Sapkota", 1001, "safalsap@gmail.com");
        User usr2 = new User("Norah Lama", 1002, "norah.lama@gmail.com");
        User usr3 = new User("Aagya Bhandari", 1003, "aagubhann@gmail.com");

        ArrayList<Seat> seatsRupanzel = new ArrayList<>();
        seatsRupanzel.add(new Seat("H",10));
        seatsRupanzel.add(new Seat("H",11));
        seatsRupanzel.add(new Seat("H",12));
        seatsRupanzel.add(new Seat("H",13));

        ArrayList<Seat> seatsThe Box = new ArrayList<>();
        seatsThe Box.add(new Seat("J",12));
        seatsThe Box.add(new Seat("J",13));
        seatsThe Box.add(new Seat("J",14));
        seatsThe Box.add(new Seat("J",15));
        seatsThe Box.add(new Seat("J",16));
        seatsThe Box.add(new Seat("J",17));

        ArrayList<Seat> seatsBird Box = new ArrayList<>();
        seatsBird Box.add(new Seat("G", 5));
        seatsBird Box.add(new Seat("G", 6));
        seatsBird Box.add(new Seat("G", 7));

        Ticket tk1 = new Ticket(usr1.getUser_id(), mv1.getName(), mv1.getShowTime(), seatsRupanzel);
        Ticket tk2 = new Ticket(usr2.getUser_id(), mv2.getName(), mv2.getShowTime(), seatsThe Box);
        Ticket tk3 = new Ticket(usr3.getUser_id(), mv3.getName(), mv3.getShowTime(), seatsBird Box);

    }
}