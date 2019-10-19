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
 * Get Log Record Response value object class.
 * <p>
 * Cluster: <b>Door Lock</b>. Command ID 0x04 is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Door Lock cluster.
 * <p>
 * Returns the specified log record. If an invalid log entry ID was requested, it is set to 0 and
 * the most recent log entry will be returned.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-10-19T15:02:05Z")
public class GetLogRecordResponse extends ZclCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0101;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x04;

    /**
     * Log Entry ID command message field.
     */
    private Integer logEntryId;

    /**
     * Timestamp command message field.
     */
    private Integer timestamp;

    /**
     * Event Type command message field.
     */
    private Integer eventType;

    /**
     * Source command message field.
     */
    private Integer source;

    /**
     * Event ID or Alarm Code command message field.
     */
    private Integer eventIdOrAlarmCode;

    /**
     * User ID command message field.
     */
    private Integer userId;

    /**
     * PIN command message field.
     */
    private String pin;

    /**
     * Default constructor.
     */
    public GetLogRecordResponse() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    /**
     * Gets Log Entry ID.
     *
     * @return the Log Entry ID
     */
    public Integer getLogEntryId() {
        return logEntryId;
    }

    /**
     * Sets Log Entry ID.
     *
     * @param logEntryId the Log Entry ID
     */
    public void setLogEntryId(final Integer logEntryId) {
        this.logEntryId = logEntryId;
    }

    /**
     * Gets Timestamp.
     *
     * @return the Timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * Sets Timestamp.
     *
     * @param timestamp the Timestamp
     */
    public void setTimestamp(final Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Gets Event Type.
     *
     * @return the Event Type
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * Sets Event Type.
     *
     * @param eventType the Event Type
     */
    public void setEventType(final Integer eventType) {
        this.eventType = eventType;
    }

    /**
     * Gets Source.
     *
     * @return the Source
     */
    public Integer getSource() {
        return source;
    }

    /**
     * Sets Source.
     *
     * @param source the Source
     */
    public void setSource(final Integer source) {
        this.source = source;
    }

    /**
     * Gets Event ID or Alarm Code.
     *
     * @return the Event ID or Alarm Code
     */
    public Integer getEventIdOrAlarmCode() {
        return eventIdOrAlarmCode;
    }

    /**
     * Sets Event ID or Alarm Code.
     *
     * @param eventIdOrAlarmCode the Event ID or Alarm Code
     */
    public void setEventIdOrAlarmCode(final Integer eventIdOrAlarmCode) {
        this.eventIdOrAlarmCode = eventIdOrAlarmCode;
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
    public String getPin() {
        return pin;
    }

    /**
     * Sets PIN.
     *
     * @param pin the PIN
     */
    public void setPin(final String pin) {
        this.pin = pin;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(logEntryId, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(timestamp, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(eventType, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(source, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(eventIdOrAlarmCode, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(userId, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(pin, ZclDataType.CHARACTER_STRING);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        logEntryId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        timestamp = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        eventType = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        source = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        eventIdOrAlarmCode = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        userId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        pin = (String) deserializer.deserialize(ZclDataType.CHARACTER_STRING);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(224);
        builder.append("GetLogRecordResponse [");
        builder.append(super.toString());
        builder.append(", logEntryId=");
        builder.append(logEntryId);
        builder.append(", timestamp=");
        builder.append(timestamp);
        builder.append(", eventType=");
        builder.append(eventType);
        builder.append(", source=");
        builder.append(source);
        builder.append(", eventIdOrAlarmCode=");
        builder.append(eventIdOrAlarmCode);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", pin=");
        builder.append(pin);
        builder.append(']');
        return builder.toString();
    }

}
