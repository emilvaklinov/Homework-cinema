public enum BookGenre {
    THRILLER("Rising the adrenalin."),
    CRIME("Stories for murders."),
    ROMANTIC("Love stories."),
    COMEDY("Fun stories."),
    FANTASY("Magics and feritails.");

    private final String description;

    BookGenre(String description){
        this.description = description;
    }
}