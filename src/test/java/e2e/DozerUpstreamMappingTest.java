package e2e;

import mapping.ModelMapper;
import mapping.dozer.DozerModelMapper;
import mapping.dozer.DozerUpstreamModelMapperAtoB;
import mapping.dozer.DozerUpstreamModelMapperBtoC;
import models.StructureA;
import models.StructureB;
import models.StructureC;
import org.junit.Assert;
import org.junit.Test;

public class DozerUpstreamMappingTest {

    @Test
    public void test() {

        StructureA a = new StructureA();
        a.setParam1("123");
        a.setParam2(true);
        a.setParam3(1);

        ModelMapper<StructureA, StructureB> mapperAtoB = new DozerUpstreamModelMapperAtoB();
        StructureB b = mapperAtoB.map(a);

        DozerModelMapper<StructureB,StructureC> mapperBtoC = new DozerUpstreamModelMapperBtoC();
        StructureC c = mapperBtoC.map(b);

        Assert.assertEquals(123, c.getVar1().longValue());
        Assert.assertEquals("true", c.getVar2());
        Assert.assertEquals(true, c.getVar3());

    }
}
