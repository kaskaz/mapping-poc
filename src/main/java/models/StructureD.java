package models;

import org.dozer.Mapping;

import java.util.List;

public class StructureD {

    @Mapping("var1")
    private String var1;
    @Mapping("structureBS")
    private List<StructureA> structureAS;

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public List<StructureA> getStructureAS() {
        return structureAS;
    }

    public void setStructureAS(List<StructureA> structureAS) {
        this.structureAS = structureAS;
    }
}
