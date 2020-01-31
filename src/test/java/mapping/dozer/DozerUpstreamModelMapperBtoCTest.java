package mapping.dozer;

import models.StructureB;
import models.StructureC;
import org.junit.Assert;
import org.junit.Test;

public class DozerUpstreamModelMapperBtoCTest {
    @Test
    public void test() {
        StructureB b = new StructureB();
        b.setVar1("123");
        b.setVar2(true);
        b.setVar3(1);

        DozerModelMapper<StructureB,StructureC> mapper = new DozerUpstreamModelMapperBtoC();
        StructureC c = mapper.map(b);

        Assert.assertEquals(123, c.getVar1().longValue());
        Assert.assertEquals("true", c.getVar2());
        Assert.assertEquals(true, c.getVar3());
    }
}
