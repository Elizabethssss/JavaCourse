package task1.converters;

public class ConvertTenToEight implements ConvertStrategy {
    @Override
    public String Convert(int from) {
        StringBuilder result = new StringBuilder();
        if (from == 0)
            return "0";
        while(from > 0) {
            result.append(from % 8);
            from /= 8;
        }
        result.reverse();

        return result.toString();
    }
}
