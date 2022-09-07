package mementoExpl.smartApp;

import java.util.ArrayList;
import java.util.List;

public class Smart_App {

    private double version;
    private List<Double> versionList= new ArrayList<>();

    public void setVersionList(List<Double> versionList) {
        this.versionList = versionList;
    }

    public List<Double> getVersionList() {
        return versionList;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "smart_app{" +
                "version=" + version +
                '}';
    }
}
