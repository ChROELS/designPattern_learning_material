package com.example.adapterDesignMe;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class rulerTest {
    @Test
    public void useInchRuler(){
        RulerInch ruler = new RulerInch(2);
        Assertions.assertNotNull(ruler);
        ruler.getInchLength();
    }
    @Test
    public void useCentimeterRuler(){
        CentimeterMeasurable ruler = new RulerCentimeterAdaptee(2);
        ruler.getInCentimeter();
    }
    @Test
    public void measureInInch(){
        RulerAdaptor adaptor = new RulerAdaptor(new RulerCentimeterAdaptee(2));
        Assertions.assertNotNull(adaptor);
        adaptor.getInchLength();
    }
    @Test
    public void measureInCentimeter(){
        RulerAdaptor adaptor = new RulerAdaptor(new RulerInch(2));
        Assertions.assertNotNull(adaptor);
        adaptor.getInCentimeter();
    }

}
