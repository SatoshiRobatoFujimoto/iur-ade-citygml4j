package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class NoteProperty extends ADEGenericApplicationProperty<String> {

    public NoteProperty() {
        super();
    }

    public NoteProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new NoteProperty(), copyBuilder);
    }
}