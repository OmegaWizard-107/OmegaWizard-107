public class Golfer implements Comparable {
    private String firstName;
    private String lastName;
    private int score; // golfer’s score so far this round, more negative is better
    private int holesCompleted; // number of holes golfer has completed so far this round

    // constructor that takes in four parameters to initialize the fields of this object
    public Golfer(String newFirstName, String newLastName, int newScore, int newHolesCompleted) {
        firstName = newFirstName;
        lastName = newLastName;
        score = newScore;
        holesCompleted = newHolesCompleted;
    }

    // returns a String of the form:
    // `lastName`, `firstName`: `score` with `holesCompleted` holes completed
    public String toString() {
        return lastName + ", " + firstName + ": " + score + " with " + holesCompleted + " holes completed";
    }

    @Override
    public int compareTo(Golfer other) {
        if (this.score != other.score) {
            return Integer.compare(this.score, other.score); // lower score first
        }
        if (this.holesCompleted != other.holesCompleted) {
            return Integer.compare(other.holesCompleted, this.holesCompleted); // higher holes first
        }
        int lastCmp = this.lastName.compareToIgnoreCase(other.lastName);
        if (lastCmp != 0) {
            return lastCmp;
        }
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}
