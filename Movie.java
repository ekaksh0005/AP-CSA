public class Movie {
    private String title;
    private String genre;
    private int rating;

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public boolean isFamilyFriendly() {
        if (genre.equals("Animation") && rating >= 6) {
            return true;
        } else {
            return false;
        }
    }

    public void upgradeRating() {
        if (rating > 1) {
            rating += 1; 
        }
    }
}