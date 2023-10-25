import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> movies = new ArrayList<>();
    private int count;
    public int getCount(){
        return count;
    }

    public void add(Movie movie){
        movies.add(movie);
        count = movies.size();
    }
    public void print(){
        for (Movie movie: movies){
            System.out.println("Movie: "+ movie);
        }
    }
    public void printOne(int i){
        System.out.println("Movie: "+ movies.get(i));
    }

    public Movie find(String title){
        for (Movie movie: movies){
            if (movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }
    public void sortByYear(){
        for (int i = 0; i<count-1;i++){
            for(int j = i+1; j<count; j++){
                if (movies.get(i).getYear() < movies.get(j).getYear()){
                    Movie temp = movies.get(i);
                    movies.set(i, movies.get(j));
                    movies.set(j, temp);
                }
            }
        }
    }
    public ArrayList<Movie> getMovies(){
        return movies;
    }
}
