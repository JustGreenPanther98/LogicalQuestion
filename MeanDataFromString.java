//Considering string to be 
//"townname : Jan 13.5,Feb 14.5, and so on upto Dec \n townname2 : Jan 35.1 Feb 317.1 upto Dec ....and so on"
public class MeanDataFromString{
    public static double mean(String town, String strng) {
        if (town.isEmpty() || strng.isEmpty()) return -1;
        String townData = findTown(town, strng);
        if (townData.isEmpty()) return -1;

        double[] values = extractMonthlyData(townData);
        double sum = 0;
        for (double val : values) {
            sum += val;
        }
        return sum / values.length;
    }

    public static double variance(String town, String strng) {
        if (town.isEmpty() || strng.isEmpty()) return -1;
        String townData = findTown(town, strng);
        if (townData.isEmpty()) return -1;

        double[] values = extractMonthlyData(townData);
        double avg = mean(town, strng);
        double sumSq = 0;
        for (double val : values) {
            sumSq += Math.pow(val - avg, 2);
        }
        return sumSq / values.length;
    }

    private static String findTown(String town, String strng) {
        String[] lines = strng.split("\n");
        for (String line : lines) {
            if (line.startsWith(town + ":")) {
                return line;
            }
        }
        return "";
    }

    private static double[] extractMonthlyData(String townData) {
        String[] monthly = townData.substring(townData.indexOf(":") + 1).split(",");
        double[] values = new double[monthly.length];
        for (int i = 0; i < monthly.length; i++) {
            values[i] = Double.valueOf(monthly[i].split(" ")[1]);
        }
        return values;
    }
}
