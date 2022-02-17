package builder;

public class Main {
    public static void main(String[] args) {
        QueryBuilder builder = new OracleQueryBuilder();
        builder.setCommand("select")
                .setParam("*")
                .addTable("students")
                .addCondition("ocena>xd");

        Query query = builder.getQuery();
        System.out.println(query);
    }
}
