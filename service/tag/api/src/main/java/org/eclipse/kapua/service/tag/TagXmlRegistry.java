/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.tag;

import org.eclipse.kapua.locator.KapuaLocator;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class TagXmlRegistry {

    private static final KapuaLocator LOCATOR = KapuaLocator.getInstance();
    private static final TagFactory TAG_FACTORY = LOCATOR.getFactory(TagFactory.class);

    /**
     * Creates a new tag instance
     *
     * @return
     */
    public Tag newTag() {
        return TAG_FACTORY.newEntity(null);
    }

    /**
     * Creates a new tag creator instance
     *
     * @return
     */
    public TagCreator newTagCreator() {
        return TAG_FACTORY.newCreator(null, null);
    }

    /**
     * Creates a new tag creator instance
     *
     * @return
     */
    public TagListResult newTagListResult() {
        return TAG_FACTORY.newListResult();
    }

    public TagQuery newQuery() {
        return TAG_FACTORY.newQuery(null);
    }
}
