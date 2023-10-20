public class Music {
    public String band;
    public String[] members;
    public int albums;
    public int year;
    public String description;
    public String style;
    private String studio;

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public static String getDescription(String band, String members, int albums, int year, String description, String style){
        return System.out.printf("Band: %s \nMembers: %s \nAlbums: %d \nYear: %d \nDescription: \n%s Style: %s ",
                band,
                members,
                albums,
                year,
                description,
                style).toString();

    }
    public static void getTitle(String band){
        System.out.println(band);
    }
}
