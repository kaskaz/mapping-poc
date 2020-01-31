package mapping.dozer;

import mapping.ModelMapper;
import models.StructureA;
import models.StructureB;
import org.junit.Assert;
import org.junit.Test;

public class DozerDownstreamModelMapperBtoATest {
    @Test
    public void test() {
        StructureB b = new StructureB();
        b.setVar1("Nuno");
        b.setVar2(true);
        b.setVar3(100);

        ModelMapper<StructureB, StructureA> mapper = new DozerDownstreamModelMapperBtoA();
        StructureA a = mapper.map(b);

        Assert.assertEquals(a.getParam1(), b.getVar1());
        Assert.assertEquals(a.getParam2(), b.getVar2());
        Assert.assertEquals(a.getParam3(), b.getVar3());
    }
}
