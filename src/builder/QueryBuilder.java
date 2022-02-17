package builder;

public interface QueryBuilder {

    QueryBuilder setCommand(String command);
    QueryBuilder setParam(String param);
    QueryBuilder addTable(String table);
    QueryBuilder addCondition(String condition);

    Query getQuery();
}
