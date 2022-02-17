package builder;

public class OracleQueryBuilder implements QueryBuilder {
    private Query query = new OracleQuery();

    @Override
    public QueryBuilder setCommand(String command) {
        query.addQueryElement(command);
        return this;
    }

    @Override
    public QueryBuilder setParam(String param) {
        query.addQueryElement(param);
        return this;
    }

    @Override
    public QueryBuilder addTable(String table) {
        query.addQueryElement(table);
        return this;
    }

    @Override
    public QueryBuilder addCondition(String condition) {
        query.addQueryElement(condition);
        return this;
    }

    @Override
    public Query getQuery() {
        return query;
    }
}
