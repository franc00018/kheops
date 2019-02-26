/*
 * This file is generated by jOOQ.
 */
package online.kheops.auth_server.generated.tables.records;


import online.kheops.auth_server.generated.tables.AlbumUser;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlbumUserRecord extends UpdatableRecordImpl<AlbumUserRecord> implements Record7<Long, Long, Long, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = -1970909370;

    /**
     * Setter for <code>public.album_user.pk</code>.
     */
    public void setPk(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.album_user.pk</code>.
     */
    public Long getPk() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.album_user.album_fk</code>.
     */
    public void setAlbumFk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.album_user.album_fk</code>.
     */
    public Long getAlbumFk() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.album_user.user_fk</code>.
     */
    public void setUserFk(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.album_user.user_fk</code>.
     */
    public Long getUserFk() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.album_user.admin</code>.
     */
    public void setAdmin(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.album_user.admin</code>.
     */
    public Boolean getAdmin() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.album_user.new_series_notifications</code>.
     */
    public void setNewSeriesNotifications(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.album_user.new_series_notifications</code>.
     */
    public Boolean getNewSeriesNotifications() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.album_user.new_comment_notifications</code>.
     */
    public void setNewCommentNotifications(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.album_user.new_comment_notifications</code>.
     */
    public Boolean getNewCommentNotifications() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.album_user.favorite</code>.
     */
    public void setFavorite(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.album_user.favorite</code>.
     */
    public Boolean getFavorite() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AlbumUser.ALBUM_USER.PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return AlbumUser.ALBUM_USER.ALBUM_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return AlbumUser.ALBUM_USER.USER_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return AlbumUser.ALBUM_USER.ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return AlbumUser.ALBUM_USER.NEW_SERIES_NOTIFICATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return AlbumUser.ALBUM_USER.NEW_COMMENT_NOTIFICATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return AlbumUser.ALBUM_USER.FAVORITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getAlbumFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getUserFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getNewSeriesNotifications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getNewCommentNotifications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getFavorite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getAlbumFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getUserFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getNewSeriesNotifications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getNewCommentNotifications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getFavorite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlbumUserRecord value1(Long value) {
        setPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlbumUserRecord value2(Long value) {
        setAlbumFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlbumUserRecord value3(Long value) {
        setUserFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlbumUserRecord value4(Boolean value) {
        setAdmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlbumUserRecord value5(Boolean value) {
        setNewSeriesNotifications(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlbumUserRecord value6(Boolean value) {
        setNewCommentNotifications(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlbumUserRecord value7(Boolean value) {
        setFavorite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlbumUserRecord values(Long value1, Long value2, Long value3, Boolean value4, Boolean value5, Boolean value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AlbumUserRecord
     */
    public AlbumUserRecord() {
        super(AlbumUser.ALBUM_USER);
    }

    /**
     * Create a detached, initialised AlbumUserRecord
     */
    public AlbumUserRecord(Long pk, Long albumFk, Long userFk, Boolean admin, Boolean newSeriesNotifications, Boolean newCommentNotifications, Boolean favorite) {
        super(AlbumUser.ALBUM_USER);

        set(0, pk);
        set(1, albumFk);
        set(2, userFk);
        set(3, admin);
        set(4, newSeriesNotifications);
        set(5, newCommentNotifications);
        set(6, favorite);
    }
}
