import java.time.LocalDate;

class FormatDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 7, 17);

        // Output must be 17 July 2017
        System.out.println(String.format("%1$td %1$tB %1$tY", date));
    }
}


