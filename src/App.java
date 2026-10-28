/**
* PRACTICE QUIZ 4: Playlist Builder
*
* You are building a playlist of songs. You will create an ArrayList for Strings,
* read song titles from the user, and then work with the playlist. Each level
* builds on the one before it.
*
* B Level:
* Read song titles from the user and add them to the ArrayList. Stop reading when
* the user enters an empty line (just presses Enter). Then print how many songs
* there are and the first and last song, in this format:
*     Songs: 4
*     First: Golden Hour
*     Last: Blinding Lights
* You may assume at least one song is entered.
*
* B+ Level:
* Complete B. Then print "Reversed:" followed by the playlist from last song to
* first song, one per line. Next, print "Search for?" and read a title. If it is on
* the playlist, print its song number (song numbers start at 1, not 0; if it is on
* the list more than once, use the first one). If not, print that it was not found:
*     Yellow is song #3
*     Hello is not on the playlist
*
* A- Level:
* Complete B and B+. Now let the user remove songs. Repeatedly print
* "Remove which song?" and read a title, until the user enters an empty line:
*   - If the song is on the playlist, remove it and print "Removed <title>"
*   - Otherwise print "<title> is not on the playlist" and keep going
* When the user is finished, print "Final playlist:" and then call a method you
* write below main:
*     public static void printPlaylist(ArrayList<String> songs)
* It prints each song with its number, one per line, like "1. Golden Hour".
*
* ---------------- Sample run 1 (complete A- program) ----------------
* Golden Hour
* Levitating
* Yellow
* Blinding Lights
*
* Songs: 4
* First: Golden Hour
* Last: Blinding Lights
* Reversed:
* Blinding Lights
* Yellow
* Levitating
* Golden Hour
* Search for?
* Yellow
* Yellow is song #3
* Remove which song?
* Levitating
* Removed Levitating
* Remove which song?
* Hello
* Hello is not on the playlist
* Remove which song?
*
* Final playlist:
* 1. Golden Hour
* 2. Yellow
* 3. Blinding Lights
*
* ---------------- Sample run 2 (complete A- program) ----------------
* Thunderstruck
* Clocks
*
* Songs: 2
* First: Thunderstruck
* Last: Clocks
* Reversed:
* Clocks
* Thunderstruck
* Search for?
* Hey Jude
* Hey Jude is not on the playlist
* Remove which song?
* Thunderstruck
* Removed Thunderstruck
* Remove which song?
* Clocks
* Removed Clocks
* Remove which song?
*
* Final playlist:
*/

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
    }
}
