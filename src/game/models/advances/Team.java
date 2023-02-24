package game.models.advances;

public enum Team {
    TOMMYS_TROTTER(new String[]{"Percy", "Ginger", "Basil", "Jones", "Smith", "Dem", "Monty", "Nobby"}, "Green","Tommy's Trotters" ),
    GARLIC_GRUNTS(new String[]{"Cochon", "Le Cont", "Porc", "Glouton", "Goinfer", "Sanglier", "M.Chien", "Gerard"}, "Blue","Garlic Grunts"),
    SOW_A_KRAUTS(new String[]{ "Schnitzel", "Herr Kut", "Wolfie", "Lederhos", "Herman", "Schwein", "Herr Raid", "Herr Dry"}, "Gray","Sow-A-Krauts" ),
    UNCLE_HAM_HOGS(new String[]{"Chucky", "Bobby-Joe", "Keanu", "Bobby-Jim", "Sly", "John-Boy", "Abraham", "Joey-Bob" }, "Light-Blue", "Uncle Ham's Hogs"),
    PIGGYSTROIKA(new String[]{"Duski", "Huski", "Rimski", "Mule", "Jetski", "Snowski", "Muski", "Yehudi"}, "Red", "Piggystroika"),
    SUSHI_SWINE(new String[]{"Sushi", "Kendo", "Shogun", "Raw Fish", "Kempo", "Tenko", "Feng Shui", "Ninja"}, "Yellow", "Sushi Swine"),
    MARDY_PIGS(new String[]{"Ade", "Fil", "Simon", "Jake", "Andy", "Ricki", "Philip", "Mark", "Ben", "Badders", "Izzy", "Jim", "John", "Tapper", "Sweety", "Dolly", "Paul", "Shorty", "Martin", "James", "Test" }, "Purple","Mardy Pigs");

    String[] possiblePigNames;
    final String color;
    final String teamName;


    Team(String[] possiblePigNames, String color, String gameTeamName) {
        this.possiblePigNames = possiblePigNames;
        this.color = color;
        this.teamName = gameTeamName;
    }
}
