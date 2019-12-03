package task1.converters;

public class ConvertTenToTwo implements ConvertStrategy {
    @Override
    public String Convert(int from) {
        StringBuilder result = new StringBuilder();
        if (from == 0)
            return "0";
        while(from > 0) {
            result.append(from % 2);
            from /= 2;
        }
        result.reverse();

        return result.toString();
    }
}
