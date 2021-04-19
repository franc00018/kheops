/*
 * This file is generated by jOOQ.
 */
package online.kheops.auth_server.generated.tables.records;


import java.time.LocalDateTime;

import online.kheops.auth_server.generated.tables.Albums;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlbumsRecord extends UpdatableRecordImpl<AlbumsRecord> implements Record12<Long, String, String, String, LocalDateTime, LocalDateTime, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = -634426587;

    /**
     * Setter for <code>public.albums.pk</code>.
     */
    public void setPk(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.albums.pk</code>.
     */
    public Long getPk() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.albums.id</code>.
     */
    public void setId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.albums.id</code>.
     */
    public String getId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.albums.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.albums.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.albums.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.albums.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.albums.created_time</code>.
     */
    public void setCreatedTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.albums.created_time</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.albums.last_event_time</code>.
     */
    public void setLastEventTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.albums.last_event_time</code>.
     */
    public LocalDateTime getLastEventTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.albums.add_user_permission</code>.
     */
    public void setAddUserPermission(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.albums.add_user_permission</code>.
     */
    public Boolean getAddUserPermission() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.albums.download_series_permission</code>.
     */
    public void setDownloadSeriesPermission(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.albums.download_series_permission</code>.
     */
    public Boolean getDownloadSeriesPermission() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.albums.send_series_permission</code>.
     */
    public void setSendSeriesPermission(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.albums.send_series_permission</code>.
     */
    public Boolean getSendSeriesPermission() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.albums.delete_series_permission</code>.
     */
    public void setDeleteSeriesPermission(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.albums.delete_series_permission</code>.
     */
    public Boolean getDeleteSeriesPermission() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.albums.add_series_permission</code>.
     */
    public void setAddSeriesPermission(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.albums.add_series_permission</code>.
     */
    public Boolean getAddSeriesPermission() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.albums.write_comments_permission</code>.
     */
    public void setWriteCommentsPermission(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.albums.write_comments_permission</code>.
     */
    public Boolean getWriteCommentsPermission() {
        return (Boolean) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, String, String, LocalDateTime, LocalDateTime, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, String, String, String, LocalDateTime, LocalDateTime, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Albums.ALBUMS.PK;
    }

    @Override
    public Field<String> field2() {
        return Albums.ALBUMS.ID;
    }

    @Override
    public Field<String> field3() {
        return Albums.ALBUMS.NAME;
    }

    @Override
    public Field<String> field4() {
        return Albums.ALBUMS.DESCRIPTION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Albums.ALBUMS.CREATED_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Albums.ALBUMS.LAST_EVENT_TIME;
    }

    @Override
    public Field<Boolean> field7() {
        return Albums.ALBUMS.ADD_USER_PERMISSION;
    }

    @Override
    public Field<Boolean> field8() {
        return Albums.ALBUMS.DOWNLOAD_SERIES_PERMISSION;
    }

    @Override
    public Field<Boolean> field9() {
        return Albums.ALBUMS.SEND_SERIES_PERMISSION;
    }

    @Override
    public Field<Boolean> field10() {
        return Albums.ALBUMS.DELETE_SERIES_PERMISSION;
    }

    @Override
    public Field<Boolean> field11() {
        return Albums.ALBUMS.ADD_SERIES_PERMISSION;
    }

    @Override
    public Field<Boolean> field12() {
        return Albums.ALBUMS.WRITE_COMMENTS_PERMISSION;
    }

    @Override
    public Long component1() {
        return getPk();
    }

    @Override
    public String component2() {
        return getId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime component6() {
        return getLastEventTime();
    }

    @Override
    public Boolean component7() {
        return getAddUserPermission();
    }

    @Override
    public Boolean component8() {
        return getDownloadSeriesPermission();
    }

    @Override
    public Boolean component9() {
        return getSendSeriesPermission();
    }

    @Override
    public Boolean component10() {
        return getDeleteSeriesPermission();
    }

    @Override
    public Boolean component11() {
        return getAddSeriesPermission();
    }

    @Override
    public Boolean component12() {
        return getWriteCommentsPermission();
    }

    @Override
    public Long value1() {
        return getPk();
    }

    @Override
    public String value2() {
        return getId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime value6() {
        return getLastEventTime();
    }

    @Override
    public Boolean value7() {
        return getAddUserPermission();
    }

    @Override
    public Boolean value8() {
        return getDownloadSeriesPermission();
    }

    @Override
    public Boolean value9() {
        return getSendSeriesPermission();
    }

    @Override
    public Boolean value10() {
        return getDeleteSeriesPermission();
    }

    @Override
    public Boolean value11() {
        return getAddSeriesPermission();
    }

    @Override
    public Boolean value12() {
        return getWriteCommentsPermission();
    }

    @Override
    public AlbumsRecord value1(Long value) {
        setPk(value);
        return this;
    }

    @Override
    public AlbumsRecord value2(String value) {
        setId(value);
        return this;
    }

    @Override
    public AlbumsRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public AlbumsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public AlbumsRecord value5(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    @Override
    public AlbumsRecord value6(LocalDateTime value) {
        setLastEventTime(value);
        return this;
    }

    @Override
    public AlbumsRecord value7(Boolean value) {
        setAddUserPermission(value);
        return this;
    }

    @Override
    public AlbumsRecord value8(Boolean value) {
        setDownloadSeriesPermission(value);
        return this;
    }

    @Override
    public AlbumsRecord value9(Boolean value) {
        setSendSeriesPermission(value);
        return this;
    }

    @Override
    public AlbumsRecord value10(Boolean value) {
        setDeleteSeriesPermission(value);
        return this;
    }

    @Override
    public AlbumsRecord value11(Boolean value) {
        setAddSeriesPermission(value);
        return this;
    }

    @Override
    public AlbumsRecord value12(Boolean value) {
        setWriteCommentsPermission(value);
        return this;
    }

    @Override
    public AlbumsRecord values(Long value1, String value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6, Boolean value7, Boolean value8, Boolean value9, Boolean value10, Boolean value11, Boolean value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AlbumsRecord
     */
    public AlbumsRecord() {
        super(Albums.ALBUMS);
    }

    /**
     * Create a detached, initialised AlbumsRecord
     */
    public AlbumsRecord(Long pk, String id, String name, String description, LocalDateTime createdTime, LocalDateTime lastEventTime, Boolean addUserPermission, Boolean downloadSeriesPermission, Boolean sendSeriesPermission, Boolean deleteSeriesPermission, Boolean addSeriesPermission, Boolean writeCommentsPermission) {
        super(Albums.ALBUMS);

        set(0, pk);
        set(1, id);
        set(2, name);
        set(3, description);
        set(4, createdTime);
        set(5, lastEventTime);
        set(6, addUserPermission);
        set(7, downloadSeriesPermission);
        set(8, sendSeriesPermission);
        set(9, deleteSeriesPermission);
        set(10, addSeriesPermission);
        set(11, writeCommentsPermission);
    }
}
