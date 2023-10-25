public class Movie {
    Movie(){}

    Movie(String title, int year, int duration, String director){
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.director = director;
    }
    @Override
    public String toString(){
        return String.format("Title: %s Year: %d Duration: %d (minutes) Directed by: %s",
                title,
                year,
                duration,
                director);
    }
    private String title;
    private int year;
    private int duration;
    private String director;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

