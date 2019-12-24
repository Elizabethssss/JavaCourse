package task3;

public class EnumExample extends MyEnum<EnumExample> {

    public final static EnumExample MONDAY = new EnumExample(1, "MONDAY");
    public final static EnumExample TUESDAY = new EnumExample(2, "TUESDAY");
    public final static EnumExample WEDNESDAY = new EnumExample(3, "WEDNESDAY");
    public final static EnumExample THURSDAY = new EnumExample(4, "THURSDAY");
    public final static EnumExample FRIDAY = new EnumExample(5, "FRIDAY");
    public final static EnumExample SATURDAY = new EnumExample(6, "SATURDAY");
    public final static EnumExample SUNDAY = new EnumExample(7, "SUNDAY");

    public EnumExample(int ordinal, String name) {
        super(ordinal, name);
    }

    public static EnumExample[] values() {
        return new EnumExample[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    }

    public static EnumExample valueOf(String name) {
        for(EnumExample example : values())
            if(example.getName().equals(name))
                return example;
        return null;
    }

}
