import java.util.*;

public class NMeetingProblem {
    // Inner class to represent a meeting with start and end times
    static class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    // Comparator class to sort meetings by their end time
    static class MeetingComparator implements Comparator<Meeting> {
        @Override
        public int compare(Meeting o1, Meeting o2) {
            return Integer.compare(o1.end, o2.end);  // Simplified comparison
        }
    }

    // Function to find the maximum number of meetings
    public int maxMeeting(int n, int start[], int end[]) {
        List<Meeting> meetings = new ArrayList<>();

        // Populate the meetings list
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }

        // Sort the meetings by their end time
        Collections.sort(meetings, new MeetingComparator());

        int count = 1;  // The first meeting is always selected
        int limit = meetings.get(0).end;  // End time of the first meeting

        // Iterate through the sorted meetings starting from the second meeting
        for (int i = 1; i < n; i++) {  // Start from index 1
            if (meetings.get(i).start > limit) {
                count++;
                limit = meetings.get(i).end;  // Update the end time to the current meeting's end time
            }
        }

        return count;
    }

    // Main method to test the code
    public static void main(String[] args) {
        NMeetingProblem solution = new NMeetingProblem();
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;

        int maxMeetings = solution.maxMeeting(n, start, end);
        System.out.println("Maximum number of meetings: " + maxMeetings);  // Output should be 4
    }
}
