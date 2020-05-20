package mapping.dozer;

import mapping.ModelMapper;
import models.StructureA;
import models.StructureB;
import org.junit.Assert;
import org.junit.Test;

public class DozerUpstreamModelMapperAtoBTest {
    @Test
    public void test() {
        StructureA a = new StructureA();
        a.setParam1("Nuno");
        a.setParam2(true);
        a.setParam3(100);

        ModelMapper<StructureA, StructureB> mapper = new DozerUpstreamModelMapperAtoB();
        StructureB b = mapper.map(a);

        new DozerUpstreamModelMapperAtoB()
            .map(a);

        Assert.assertEquals(a.getParam1(), b.getVar1());
        Assert.assertEquals(a.getParam2(), b.getVar2());
        Assert.assertEquals(a.getParam3(), b.getVar3());
    }
}
