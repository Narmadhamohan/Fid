#include <stdio.h>
#include <stdbool.h>  // Include for boolean type

int main() {
    // Player-related variables with primary data types
    char player_name[50] = "Shantanu";      // String to hold the player's name


    unsigned int player_age = 25;           // Unsigned int for player's age
    float player_height = 6.2f;              // Float to hold the player's height in feet
    double player_innings = 6.213; 
    int player_score = 3500;       // Unsigned int for player's score
    bool is_active = true;                  // Boolean type for player's active status (true/false)
    
    char player_initial = 'J';              // Char for player's initial
    short player_rank = 5;                  // Short for player’s rank (small range)

    const int MAX_LIMIT = 10;
//    MAX_LIMIT = 20;


    // Display player information
    printf("Player Name: %s\n", player_name);
    printf("Player Age: %u\n", player_age);
    printf("Player Height: %.3f feet\n", player_height);
    printf("Player Innings: %lf\n", player_innings);


    printf("Player Score: %u\n", player_score);
    printf("Player Initial: %c\n", player_initial);
    printf("Player Rank: %d\n", player_rank);
    printf("Is Player Active: %s\n", is_active ? "Yes" : "No");

        printf("Player MAX_LIMIT: %d\n", MAX_LIMIT);


    return 0;
}
