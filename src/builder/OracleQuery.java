package builder;

import java.util.ArrayList;
import java.util.List;

public class OracleQuery implements Query {
    private List<String> queryElements = new ArrayList<>();

    @Override
    public void addQueryElement(String element) {
        if(element != null) {
            queryElements.add(element);
        }
    }

    @Override
    public String toString() {
        return "OracleQuery{" +
                "queryElements=" + queryElements +
                '}';
    }
}
