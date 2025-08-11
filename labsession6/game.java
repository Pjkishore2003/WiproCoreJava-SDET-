package Games;

class Game {
    String gameName;
    String gameId;
    String gameType;

    void setGameData(String name, String id, String type) {
        gameName = name;
        gameId = id;
        gameType = type;
    }

    void displayGameData() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Game ID: " + gameId);
        System.out.println("Game Type: " + gameType);
    }
}
