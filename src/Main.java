import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.add(new Movie("The Shawshank Redemption", 1994, 142, "Frank Darabont"));
        movieCollection.add(new Movie("The Godfather", 1972, 175, "Francis Ford Coppola"));
        movieCollection.add(new Movie("The Dark Knight", 2008, 152, "Christopher Nolan"));
        movieCollection.add(new Movie("The Godfather II", 1974, 202, "Francisco Ford Coppola"));
        movieCollection.add(new Movie("12 Angry man", 1957, 96, "Sidney Lumet"));

        for (int i=0; i<5; i++){
            String title;
            int year;
            int duration;
            String director;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the title of movie: ");
            title = scanner.nextLine();

            System.out.print("Enter the year: ");
            year = scanner.nextInt();

            System.out.print("Duration: ");
            duration = scanner.nextInt();
            scanner.nextLine();  // clears buffer

            System.out.print("Directed by: ");
            director = scanner.nextLine();

            movieCollection.add(new Movie(title, year, duration, director));
        }


        movieCollection.print();
        System.out.println("-------------");
        movieCollection.printOne(3);
        System.out.println("-------------");
        movieCollection.sortByYear();
        movieCollection.print();
        System.out.println("-------------");
        Movie findMovie = movieCollection.find("The Shawshank Redemption");
        System.out.println(findMovie);
        System.out.println("-------------");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Collection.txt"));
            for(var movie:movieCollection.getMovies()){
                bufferedWriter.append(String.format("Title: %s, Duration: %d, Year: %d, Director: %s%n",
                        movie.getTitle(),
                        movie.getDuration(),
                        movie.getYear(),
                        movie.getDirector()));
            }
            bufferedWriter.close();

            File fileReader = new File("Collection.txt");
            Scanner fileScanner = new Scanner(fileReader);
            while (fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
        }
        catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }


    }
}
