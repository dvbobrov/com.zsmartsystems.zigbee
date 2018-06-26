/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameResponse;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberCertificate283k1Data;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberStatus;

/**
 * Class to implement the Ember EZSP command <b>getCertificate283k1</b>.
 * <p>
 * Retrieves the 283k1 certificate installed on the NCP.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGetCertificate283k1Response extends EzspFrameResponse {
    public static final int FRAME_ID = 0xEC;

    /**
     * The result of the CBKE operation.
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     */
    private EmberStatus status;

    /**
     * The locally installed certificate.
     * <p>
     * EZSP type is <i>EmberCertificate283k1Data</i> - Java type is {@link EmberCertificate283k1Data}
     */
    private EmberCertificate283k1Data localCert;

    /**
     * Response and Handler constructor
     */
    public EzspGetCertificate283k1Response(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        status = deserializer.deserializeEmberStatus();
        localCert = deserializer.deserializeEmberCertificate283k1Data();
    }

    /**
     * The result of the CBKE operation.
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     *
     * @return the current status as {@link EmberStatus}
     */
    public EmberStatus getStatus() {
        return status;
    }

    /**
     * The result of the CBKE operation.
     *
     * @param status the status to set as {@link EmberStatus}
     */
    public void setStatus(EmberStatus status) {
        this.status = status;
    }

    /**
     * The locally installed certificate.
     * <p>
     * EZSP type is <i>EmberCertificate283k1Data</i> - Java type is {@link EmberCertificate283k1Data}
     *
     * @return the current localCert as {@link EmberCertificate283k1Data}
     */
    public EmberCertificate283k1Data getLocalCert() {
        return localCert;
    }

    /**
     * The locally installed certificate.
     *
     * @param localCert the localCert to set as {@link EmberCertificate283k1Data}
     */
    public void setLocalCert(EmberCertificate283k1Data localCert) {
        this.localCert = localCert;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(84);
        builder.append("EzspGetCertificate283k1Response [status=");
        builder.append(status);
        builder.append(", localCert=");
        builder.append(localCert);
        builder.append(']');
        return builder.toString();
    }
}
