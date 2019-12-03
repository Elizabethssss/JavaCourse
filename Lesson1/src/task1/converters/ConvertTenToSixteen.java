package task1.converters;

public class ConvertTenToSixteen implements ConvertStrategy {
    @Override
    public String Convert(int from) {
        StringBuilder result = new StringBuilder();
        if (from == 0)
            return "0";
        while(from > 0) {
            if(from % 16 == 10)
                result.append("a");
            else if(from % 16 == 11)
                result.append("b");
            else if(from % 16 == 12)
                result.append("c");
            else if(from % 16 == 13)
                result.append("d");
            else if(from % 16 == 14)
                result.append("e");
            else if(from % 16 == 15)
                result.append("f");
            else
                result.append(from % 16);
            from /= 16;
        }
        result.reverse();

        return result.toString();
    }
}
