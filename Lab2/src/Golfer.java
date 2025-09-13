/**
 * Golfer class that keps track of the golfers First and Last name, their score, and how many holes they completed
 * Has the ability to sort golfers by first their score, then their holes completed, then by name.
 */

public class Golfer implements Comparable<Golfer> {
    private String firstName;
    private String lastName;
    private int score; // golfer’s score so far this round, more negative is better
    private int holesCompleted; // number of holes golfer has completed so far this round


    /**
     * Constructor that takes in four parameters to initialize the fields of this object
     * @param firstName first name of the golfer
     * @param lastName last name of the golfer
     * @param score golfer’s score so far this round, more negative is better
     * @param holesCompleted number of holes golfer has completed so far this round
     */
    public Golfer(String newFirstName, String newLastName, int newScore, int newHolesCompleted) {
        firstName = newFirstName;
        lastName = newLastName;
        score = newScore;
        holesCompleted = newHolesCompleted;
    }

    /** 
     * returns a String of the form:
     * `lastName`, `firstName`: `score` with `holesCompleted` holes completed
    */ 
    public String toString() {
        return lastName + ", " + firstName + ": " + score + " with " + holesCompleted + " holes completed";
    }

    /**
     * Sorts golfers in the order of:
     * More negative score
     * More holes completed
     * Last name alphabetically
     * First name alphabetically
     */

    @Override
    public int compareTo(Golfer other) {
        if (this.score != other.score) {
            return Integer.compare(this.score, other.score); // sorts by score (more negative comes first)
        }
        if (this.holesCompleted != other.holesCompleted) { 
            return Integer.compare(other.holesCompleted, this.holesCompleted); // sorts by the number of holes completed (higher comes first)
        }
        if (this.lastName.compareToIgnoreCase(other.lastName) != 0) {
            return this.lastName.compareToIgnoreCase(other.lastName); // sorts lexicographically by last name (ignoring case)
        }
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}
