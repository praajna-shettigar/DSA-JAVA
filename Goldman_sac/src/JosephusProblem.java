//There are n people standing in a circle waiting to be elected.
// the counting out begins at some point in the circle in a fixed direction.
// In each step, a certain number of people are skipped and the next person is eliminated.
// The eliminated proceeds aroun the circle( which is becoming smaller and smaller as the eliminated people are removed),
// until the last person remains, who is elected given the total number of persons n and a number k which is indicates
// tat k-1 persons are skipped ad kth person is eleminated from the cirecle. the task is to choose the place in the initial cirle so that you are selected
public class JosephusProblem {
    public static int josephus(int n, int k) {
        if (n == 1)
            return 0; // Base case: The last remaining person is at index 0 (0-based)

        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 7; // Number of people
        int k = 3; // Every 3rd person is eliminated

        int safePosition = josephus(n, k) + 1; // Convert 0-based to 1-based index
        System.out.println("The safest position to stand is: " + safePosition);
    }
}
