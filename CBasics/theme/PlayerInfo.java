public class PlayerInfo {
    public static void main(String[] args) {
        // Player-related variables with primary data types
        String playerName = "Shantanu";      // String to hold the player's name
        int playerAge = 25;                  // Int for player's age
        double playerHeight = 6.2;           // Double for player's height
        int playerScore = 3500;              // Int for player's score
        boolean isActive = true;             // Boolean for player's active status
        char playerInitial = 'J';            // Char for player's initial
        short playerRank = 5;                // Short for player's rank
        long playerId = 123456789L;          // Long for large player ID

        // Display player information
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Age: " + playerAge);
        System.out.println("Player Height: " + playerHeight + " feet");
        System.out.println("Player Score: " + playerScore);
        System.out.println("Player Initial: " + playerInitial);
        System.out.println("Player Rank: " + playerRank);
        System.out.println("Player ID: " + playerId);
        System.out.println("Is Player Active: " + (isActive ? "Yes" : "No"));
    }
}
