/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2020 virtualcitySYSTEMS GmbH
 * https://www.virtualcitysystems.de/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class TargetProperty extends FeatureProperty<AbstractCityObject> implements ADEModelObject {

    public TargetProperty() {
    }

    public TargetProperty(AbstractCityObject cityObject) {
        super(cityObject);
    }

    public TargetProperty(String href) {
        super(href);
    }

    public AbstractCityObject getCityObject() {
        return super.getObject();
    }

    public boolean isSetCityObject() {
        return super.isSetObject();
    }

    public void setCityObject(AbstractCityObject cityObject) {
        super.setObject(cityObject);
    }

    public void unsetCityObject() {
        super.unsetObject();
    }

    @Override
    public Class<AbstractCityObject> getAssociableClass() {
        return AbstractCityObject.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TargetProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TargetProperty copy = (target == null) ? new TargetProperty() : (TargetProperty) target;
        return super.copyTo(copy, copyBuilder);
    }
}
