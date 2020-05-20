package mapping.dozer;

import mapping.ModelMapper;
import models.StructureA;
import models.StructureD;
import models.StructureE;
import org.junit.Test;

import java.util.Arrays;

public class DozerUpstreamModelMapperDtoETest {
    @Test
    public void test() {

        StructureA a1 = new StructureA();
        a1.setParam1("123");
        a1.setParam2(true);
        a1.setParam3(1);

        StructureA a2 = new StructureA();
        a2.setParam1("234");
        a2.setParam2(false);
        a2.setParam3(1);

        StructureD d = new StructureD();
        d.setVar1("name");
        d.setStructureAS(Arrays.asList(a1,a2));

        ModelMapper<StructureD, StructureE> mapper = new DozerUpstreamModelMapperDtoE();
        StructureE e = mapper.map(d);
/*
        new DozerUpstreamModelMapperAtoB()
                .map(a);

        Assert.assertEquals(a.getParam1(), b.getVar1());
        Assert.assertEquals(a.getParam2(), b.getVar2());
        Assert.assertEquals(a.getParam3(), b.getVar3());

 */
    }
}
