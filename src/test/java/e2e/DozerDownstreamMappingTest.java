package e2e;

import mapping.ModelMapper;
import mapping.dozer.*;
import models.StructureA;
import models.StructureB;
import models.StructureC;
import org.junit.Assert;
import org.junit.Test;

public class DozerDownstreamMappingTest {
    @Test
    public void test() {

        StructureC c = new StructureC();
        c.setVar1(123);
        c.setVar2("true");
        c.setVar3(true);

        ModelMapper<StructureC, StructureB> mapperCtoB = new DozerDownstreamModelMapperCtoB();
        StructureB b = mapperCtoB.map(c);

        DozerModelMapper<StructureB, StructureA> mapperBtoA = new DozerDownstreamModelMapperBtoA();
        StructureA a = mapperBtoA.map(b);

        Assert.assertEquals("123", a.getParam1());
        Assert.assertEquals(true, a.getParam2());
        Assert.assertEquals(1, a.getParam3().longValue());

    }

}
