package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;
import org.citygml4j.model.gml.measures.Length;

public class WidthProperty extends ADEGenericApplicationProperty<Length> {

    public WidthProperty() {
        super();
    }

    public WidthProperty(Length value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WidthProperty(), copyBuilder);
    }
}