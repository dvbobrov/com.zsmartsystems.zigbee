/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.doorlock;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Operating Event Notification value object class.
 * <p>
 * Cluster: <b>Door Lock</b>. Command ID 0x20 is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Door Lock cluster.
 * <p>
 * The door lock server sends out operation event notification when the event is triggered by
 * the various event sources. The specific operation event will only be sent out if the
 * associated bitmask is enabled in the various attributes in the Event Masks Attribute Set.
 * <p>
 * All events are optional.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-10-19T15:02:05Z")
public class OperatingEventNotification extends ZclCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0101;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x20;

    /**
     * Operation Event Source command message field.
     */
    private Integer operationEventSource;

    /**
     * Operation Event Code command message field.
     */
    private Integer operationEventCode;

    /**
     * User ID command message field.
     */
    private Integer userId;

    /**
     * PIN command message field.
     */
    private Integer pin;

    /**
     * ZigBeeLocalDateTime command message field.
     */
    private Integer zigbeelocaldatetime;

    /**
     * Data command message field.
     */
    private String data;

    /**
     * Default constructor.
     */
    public OperatingEventNotification() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    /**
     * Gets Operation Event Source.
     *
     * @return the Operation Event Source
     */
    public Integer getOperationEventSource() {
        return operationEventSource;
    }

    /**
     * Sets Operation Event Source.
     *
     * @param operationEventSource the Operation Event Source
     */
    public void setOperationEventSource(final Integer operationEventSource) {
        this.operationEventSource = operationEventSource;
    }

    /**
     * Gets Operation Event Code.
     *
     * @return the Operation Event Code
     */
    public Integer getOperationEventCode() {
        return operationEventCode;
    }

    /**
     * Sets Operation Event Code.
     *
     * @param operationEventCode the Operation Event Code
     */
    public void setOperationEventCode(final Integer operationEventCode) {
        this.operationEventCode = operationEventCode;
    }

    /**
     * Gets User ID.
     *
     * @return the User ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets User ID.
     *
     * @param userId the User ID
     */
    public void setUserId(final Integer userId) {
        this.userId = userId;
    }

    /**
     * Gets PIN.
     *
     * @return the PIN
     */
    public Integer getPin() {
        return pin;
    }

    /**
     * Sets PIN.
     *
     * @param pin the PIN
     */
    public void setPin(final Integer pin) {
        this.pin = pin;
    }

    /**
     * Gets ZigBeeLocalDateTime.
     *
     * @return the ZigBeeLocalDateTime
     */
    public Integer getZigbeelocaldatetime() {
        return zigbeelocaldatetime;
    }

    /**
     * Sets ZigBeeLocalDateTime.
     *
     * @param zigbeelocaldatetime the ZigBeeLocalDateTime
     */
    public void setZigbeelocaldatetime(final Integer zigbeelocaldatetime) {
        this.zigbeelocaldatetime = zigbeelocaldatetime;
    }

    /**
     * Gets Data.
     *
     * @return the Data
     */
    public String getData() {
        return data;
    }

    /**
     * Sets Data.
     *
     * @param data the Data
     */
    public void setData(final String data) {
        this.data = data;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(operationEventSource, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(operationEventCode, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(userId, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(pin, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(zigbeelocaldatetime, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(data, ZclDataType.CHARACTER_STRING);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        operationEventSource = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        operationEventCode = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        userId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        pin = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        zigbeelocaldatetime = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        data = (String) deserializer.deserialize(ZclDataType.CHARACTER_STRING);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(219);
        builder.append("OperatingEventNotification [");
        builder.append(super.toString());
        builder.append(", operationEventSource=");
        builder.append(operationEventSource);
        builder.append(", operationEventCode=");
        builder.append(operationEventCode);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", pin=");
        builder.append(pin);
        builder.append(", zigbeelocaldatetime=");
        builder.append(zigbeelocaldatetime);
        builder.append(", data=");
        builder.append(data);
        builder.append(']');
        return builder.toString();
    }

}
