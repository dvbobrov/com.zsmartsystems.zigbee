/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.structure;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the Ember Enumeration <b>EmberLibraryStatus</b>.
 * <p>
 * The presence and status of the Ember library.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public enum EmberLibraryStatus {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     * Library is installed
     */
    EMBER_LIBRARY_PRESENT(0x0080),

    /**
     * Error
     */
    EMBER_LIBRARY_ERROR(0x00FF),

    /**
     * Library is not installed
     */
    EMBER_LIBRARY_IS_STUB(0x0000);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, EmberLibraryStatus> codeMapping;

    private int key;

    static {
        codeMapping = new HashMap<Integer, EmberLibraryStatus>();
        for (EmberLibraryStatus s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    private EmberLibraryStatus(int key) {
        this.key = key;
    }

    /**
     * Lookup function based on the EmberStatus type code. Returns null if the
     * code does not exist.
     *
     * @param code the code to lookup
     * @return enumeration value of the alarm type.
     */
    public static EmberLibraryStatus getEmberLibraryStatus(int code) {
        if (codeMapping.get(code) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(code);
    }

    /**
     * Returns the EZSP protocol defined value for this enumeration.
     *
     * @return the EZSP protocol key
     */
    public int getKey() {
        return key;
    }
}
