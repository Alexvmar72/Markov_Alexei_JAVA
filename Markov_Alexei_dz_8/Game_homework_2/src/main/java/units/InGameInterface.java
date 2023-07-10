package units;

import java.util.ArrayList;

public interface InGameInterface {
    void step(ArrayList<BaseUnit> units);
    String getInfo();
}
