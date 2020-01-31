package models;

import org.dozer.Mapping;

public class StructureA {

    @Mapping("var1")
    private String param1;
    @Mapping("var2")
    private Boolean param2;
    @Mapping("var3")
    private Integer param3;

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public Boolean getParam2() {
        return param2;
    }

    public void setParam2(Boolean param2) {
        this.param2 = param2;
    }

    public Integer getParam3() {
        return param3;
    }

    public void setParam3(Integer param3) {
        this.param3 = param3;
    }
}
