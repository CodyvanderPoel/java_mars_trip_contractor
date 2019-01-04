
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Ticket {
    public static String randomCompany() {
        Integer randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);


        ArrayList<String> spacelines = new ArrayList<String>();
        spacelines.add("SpaceX");
        spacelines.add("Virgin Galactics");
        spacelines.add("Space Adventures");
        
        spacelines.spliterator();

        return spacelines.get(randomNum);
        
        // if (randomNum.equals(0)) {
        // return "Space Adventures";
        // } else if (randomNum.equals(1)) {
        // return "Virgin Galactics";
        // } else if (randomNum.equals(2)) {
        // return "SpaceX";
        // } else {
        // return null;
        // }
    }

    public static String randomTripType() {
        Integer randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        if (randomNum.equals(0)) {
            return "Round";
        } else if (randomNum.equals(1)) {
            return "One-Way";
        } else {
            return null;
        }
    }

    public static Integer randomTotalDays(Integer speed) {
        Integer seconds_per_day = 24 * 60 * 60;
        Integer total_seconds = 62100000 / speed;
        Integer days = total_seconds / seconds_per_day;
        return days;

    }

    public static String ticketBuilder() {
        String company = randomCompany();
        String trip = randomTripType();
        if (trip.equals("Round")) {
            Integer speed = ThreadLocalRandom.current().nextInt(16, 30 + 1);
            Integer days = randomTotalDays(speed);
            Integer price = (speed + 20);
            return String.format("%-17s %-4s %-12s $%-5s", company, days * 2, trip, price * 2);
        } else {
            Integer speed = ThreadLocalRandom.current().nextInt(16, 30 + 1);
            String days = Integer.toString(randomTotalDays(speed));
            String price = Integer.toString(speed + 20);
            return String.format("%-17s %-4s %-12s $%-5s", company, days, trip, price);
        }

    }
}
