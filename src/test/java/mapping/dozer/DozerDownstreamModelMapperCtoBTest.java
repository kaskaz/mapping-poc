package mapping.dozer;

import models.StructureB;
import models.StructureC;
import org.junit.Assert;
import org.junit.Test;

public class DozerDownstreamModelMapperCtoBTest {
    @Test
    public void test() {
        StructureC c = new StructureC();
        c.setVar1(123);
        c.setVar2("true");
        c.setVar3(true);

        DozerModelMapper<StructureC,StructureB> mapper = new DozerDownstreamModelMapperCtoB();
        StructureB b = mapper.map(c);

        Assert.assertEquals("123", b.getVar1());
        Assert.assertEquals(true, b.getVar2());
        Assert.assertEquals(1, b.getVar3().longValue());
    }
}
