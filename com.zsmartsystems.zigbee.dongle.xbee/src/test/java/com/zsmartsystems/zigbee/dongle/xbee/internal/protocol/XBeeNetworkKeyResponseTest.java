/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.xbee.internal.protocol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author Chris Jackson
 *
 */
public class XBeeNetworkKeyResponseTest extends XBeeFrameBaseTest {
    @Test
    public void test() {
        XBeeNetworkKeyResponse event = new XBeeNetworkKeyResponse();
        event.deserialize(getPacketData("00 05 88 05 4E 4B 00 D9"));
        System.out.println(event);
        assertEquals(0x88, event.getFrameType());
        assertEquals(Integer.valueOf(5), event.getFrameId());
    }
}
