package com.android.vcard;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Entity;
import android.content.EntityIterator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import defpackage.a;
import defpackage.albo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardComposer {
    private static final boolean DEBUG = false;
    public static final String FAILURE_REASON_FAILED_TO_GET_DATABASE_INFO = "Failed to get database information";
    public static final String FAILURE_REASON_NOT_INITIALIZED = "The vCard composer object is not correctly initialized";
    public static final String FAILURE_REASON_NO_ENTRY = "There's no exportable in the database";
    public static final String FAILURE_REASON_UNSUPPORTED_URI = "The Uri vCard composer received is not supported by the composer.";
    private static final String LOG_TAG = "VCardComposer";
    public static final String NO_ERROR = "No error";
    private static final String SHIFT_JIS = "SHIFT_JIS";
    private static final String UTF_8 = "UTF-8";
    private static final String[] sContactsProjection;
    private static final Map<Integer, String> sImMap;
    private final String mCharset;
    private final ContentResolver mContentResolver;
    private Uri mContentUriForRawContactsEntity;
    private Cursor mCursor;
    private boolean mCursorSuppliedFromOutside;
    private String mErrorReason;
    private boolean mFirstVCardEmittedInDoCoMoCase;
    private int mIdColumn;
    private boolean mInitDone;
    private final boolean mIsDoCoMo;
    private VCardPhoneNumberTranslationCallback mPhoneTranslationCallback;
    private RawContactEntitlesInfoCallback mRawContactEntitlesInfoCallback;
    private boolean mTerminateCalled;
    private final int mVCardType;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class RawContactEntitlesInfo {
        public final long contactId;
        public final Uri rawContactEntitlesUri;

        public RawContactEntitlesInfo(Uri uri, long j) {
            this.rawContactEntitlesUri = uri;
            this.contactId = j;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface RawContactEntitlesInfoCallback {
        RawContactEntitlesInfo getRawContactEntitlesInfo(long j);
    }

    static {
        HashMap hashMap = new HashMap();
        sImMap = hashMap;
        hashMap.put(0, VCardConstants.PROPERTY_X_AIM);
        hashMap.put(1, VCardConstants.PROPERTY_X_MSN);
        hashMap.put(2, VCardConstants.PROPERTY_X_YAHOO);
        hashMap.put(6, VCardConstants.PROPERTY_X_ICQ);
        hashMap.put(7, VCardConstants.PROPERTY_X_JABBER);
        hashMap.put(3, VCardConstants.PROPERTY_X_SKYPE_USERNAME);
        sContactsProjection = new String[]{"_id"};
    }

    public VCardComposer(Context context) {
        this(context, -1073741824, null, true);
    }

    private void closeCursorIfAppropriate() {
        Cursor cursor;
        if (!this.mCursorSuppliedFromOutside && (cursor = this.mCursor) != null) {
            try {
                cursor.close();
            } catch (SQLiteException e) {
                Log.e(LOG_TAG, "SQLiteException on Cursor#close(): ".concat(String.valueOf(e.getMessage())));
            }
            this.mCursor = null;
        }
    }

    private String createOneEntryInternal(long j, Method method) {
        EntityIterator entityIterator;
        HashMap hashMap = new HashMap();
        EntityIterator entityIterator2 = null;
        try {
            Uri uri = this.mContentUriForRawContactsEntity;
            RawContactEntitlesInfoCallback rawContactEntitlesInfoCallback = this.mRawContactEntitlesInfoCallback;
            if (rawContactEntitlesInfoCallback != null) {
                RawContactEntitlesInfo rawContactEntitlesInfo = rawContactEntitlesInfoCallback.getRawContactEntitlesInfo(j);
                uri = rawContactEntitlesInfo.rawContactEntitlesUri;
                j = rawContactEntitlesInfo.contactId;
            }
            Uri uri2 = uri;
            String[] strArr = {String.valueOf(j)};
            if (method != null) {
                try {
                    try {
                        entityIterator = (EntityIterator) method.invoke(null, this.mContentResolver, uri2, "contact_id=?", strArr, null);
                    } catch (IllegalAccessException e) {
                        Log.e(LOG_TAG, "IllegalAccessException has been thrown: " + e.getMessage());
                    } catch (InvocationTargetException e2) {
                        Log.e(LOG_TAG, "InvocationTargetException has been thrown: ", e2);
                        throw new RuntimeException("InvocationTargetException has been thrown");
                    }
                } catch (IllegalArgumentException e3) {
                    Log.e(LOG_TAG, "IllegalArgumentException has been thrown: " + e3.getMessage());
                }
            } else {
                entityIterator = ContactsContract.RawContacts.newEntityIterator(this.mContentResolver.query(uri2, null, "contact_id=?", strArr, null));
            }
            entityIterator2 = entityIterator;
            if (entityIterator2 == null) {
                Log.e(LOG_TAG, "EntityIterator is null");
                return "";
            }
            if (!entityIterator2.hasNext()) {
                Log.w(LOG_TAG, a.ck(j, "Data does not exist. contactId: "));
                entityIterator2.close();
                return "";
            }
            while (entityIterator2.hasNext()) {
                Iterator<Entity.NamedContentValues> it = ((Entity) entityIterator2.next()).getSubValues().iterator();
                while (it.hasNext()) {
                    ContentValues contentValues = it.next().values;
                    String asString = contentValues.getAsString("mimetype");
                    if (asString != null) {
                        List<ContentValues> list = hashMap.get(asString);
                        if (list == null) {
                            list = new ArrayList<>();
                            hashMap.put(asString, list);
                        }
                        list.add(contentValues);
                    }
                }
            }
            entityIterator2.close();
            return buildVCard(hashMap);
        } catch (Throwable th) {
            if (0 != 0) {
                entityIterator2.close();
            }
            throw th;
        }
    }

    private boolean initInterCursorCreationPart(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.mCursorSuppliedFromOutside = DEBUG;
        Cursor query = this.mContentResolver.query(uri, strArr, str, strArr2, str2);
        this.mCursor = query;
        if (query == null) {
            Log.e(LOG_TAG, String.format("Cursor became null unexpectedly", new Object[0]));
            this.mErrorReason = FAILURE_REASON_FAILED_TO_GET_DATABASE_INFO;
            return DEBUG;
        }
        return true;
    }

    private boolean initInterFirstPart(Uri uri) {
        if (uri == null) {
            uri = ContactsContract.RawContactsEntity.CONTENT_URI;
        }
        this.mContentUriForRawContactsEntity = uri;
        if (this.mInitDone) {
            Log.e(LOG_TAG, "init() is already called");
            return DEBUG;
        }
        return true;
    }

    private boolean initInterLastPart() {
        this.mInitDone = true;
        this.mTerminateCalled = DEBUG;
        return true;
    }

    private boolean initInterMainPart() {
        if (this.mCursor.getCount() != 0 && this.mCursor.moveToFirst()) {
            int columnIndex = this.mCursor.getColumnIndex("contact_id");
            this.mIdColumn = columnIndex;
            if (columnIndex < 0) {
                columnIndex = this.mCursor.getColumnIndex("_id");
                this.mIdColumn = columnIndex;
            }
            if (columnIndex < 0) {
                return DEBUG;
            }
            return true;
        }
        closeCursorIfAppropriate();
        return DEBUG;
    }

    public String buildVCard(Map<String, List<ContentValues>> map) {
        if (map == null) {
            Log.e(LOG_TAG, "The given map is null. Ignore and return empty String");
            return "";
        }
        VCardBuilder vCardBuilder = new VCardBuilder(this.mVCardType, this.mCharset);
        vCardBuilder.appendNameProperties(map.get("vnd.android.cursor.item/name"));
        vCardBuilder.appendNickNames(map.get("vnd.android.cursor.item/nickname"));
        vCardBuilder.appendPhones(map.get("vnd.android.cursor.item/phone_v2"), this.mPhoneTranslationCallback);
        vCardBuilder.appendEmails(map.get("vnd.android.cursor.item/email_v2"));
        vCardBuilder.appendPostals(map.get("vnd.android.cursor.item/postal-address_v2"));
        vCardBuilder.appendOrganizations(map.get("vnd.android.cursor.item/organization"));
        vCardBuilder.appendWebsites(map.get("vnd.android.cursor.item/website"));
        if ((this.mVCardType & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) == 0) {
            vCardBuilder.appendPhotos(map.get("vnd.android.cursor.item/photo"));
        }
        vCardBuilder.appendNotes(map.get("vnd.android.cursor.item/note"));
        vCardBuilder.appendEvents(map.get("vnd.android.cursor.item/contact_event"));
        vCardBuilder.appendIms(map.get("vnd.android.cursor.item/im"));
        vCardBuilder.appendSipAddresses(map.get("vnd.android.cursor.item/sip_address"));
        vCardBuilder.appendRelation(map.get("vnd.android.cursor.item/relation"));
        return vCardBuilder.toString();
    }

    public String createOneEntry() {
        return createOneEntry(null);
    }

    protected void finalize() {
        try {
            if (!this.mTerminateCalled) {
                Log.e(LOG_TAG, "finalized() is called before terminate() being called");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        Cursor cursor = this.mCursor;
        if (cursor == null) {
            Log.w(LOG_TAG, "This object is not ready yet.");
            return 0;
        }
        return cursor.getCount();
    }

    public String getErrorReason() {
        return this.mErrorReason;
    }

    public boolean init() {
        return init(null, null);
    }

    public boolean initWithCallback(Cursor cursor, RawContactEntitlesInfoCallback rawContactEntitlesInfoCallback) {
        if (initInterFirstPart(null)) {
            this.mCursorSuppliedFromOutside = true;
            this.mCursor = cursor;
            this.mRawContactEntitlesInfoCallback = rawContactEntitlesInfoCallback;
            if (initInterMainPart()) {
                initInterLastPart();
                return true;
            }
            return DEBUG;
        }
        return DEBUG;
    }

    @Deprecated
    public boolean initWithRawContactsEntityUri(Uri uri) {
        return init(ContactsContract.Contacts.CONTENT_URI, sContactsProjection, null, null, null, uri);
    }

    public boolean isAfterLast() {
        Cursor cursor = this.mCursor;
        if (cursor == null) {
            Log.w(LOG_TAG, "This object is not ready yet.");
            return DEBUG;
        }
        return cursor.isAfterLast();
    }

    public void setPhoneNumberTranslationCallback(VCardPhoneNumberTranslationCallback vCardPhoneNumberTranslationCallback) {
        this.mPhoneTranslationCallback = vCardPhoneNumberTranslationCallback;
    }

    public void terminate() {
        closeCursorIfAppropriate();
        this.mTerminateCalled = true;
    }

    public VCardComposer(Context context, int i) {
        this(context, i, null, true);
    }

    public String createOneEntry(Method method) {
        if (this.mIsDoCoMo && !this.mFirstVCardEmittedInDoCoMoCase) {
            this.mFirstVCardEmittedInDoCoMoCase = true;
        }
        String createOneEntryInternal = createOneEntryInternal(this.mCursor.getLong(this.mIdColumn), method);
        if (!this.mCursor.moveToNext()) {
            Log.e(LOG_TAG, "Cursor#moveToNext() returned false");
        }
        return createOneEntryInternal;
    }

    public boolean init(Cursor cursor) {
        return initWithCallback(cursor, null);
    }

    public VCardComposer(Context context, int i, String str) {
        this(context, i, str, true);
    }

    public boolean init(Uri uri, String str, String[] strArr, String str2) {
        return init(uri, sContactsProjection, str, strArr, str2, null);
    }

    public VCardComposer(Context context, int i, String str, boolean z) {
        this(context, context.getContentResolver(), i, str, z);
    }

    public boolean init(Uri uri, String str, String[] strArr, String str2, Uri uri2) {
        return init(uri, sContactsProjection, str, strArr, str2, uri2);
    }

    public VCardComposer(Context context, int i, boolean z) {
        this(context, i, null, z);
    }

    public boolean init(Uri uri, String[] strArr, String str, String[] strArr2, String str2, Uri uri2) {
        if (!"com.android.contacts".equals(uri.getAuthority())) {
            this.mErrorReason = FAILURE_REASON_UNSUPPORTED_URI;
            return DEBUG;
        }
        if (!initInterFirstPart(uri2) || !initInterCursorCreationPart(uri, strArr, str, strArr2, str2) || !initInterMainPart()) {
            return DEBUG;
        }
        initInterLastPart();
        return true;
    }

    public VCardComposer(Context context, ContentResolver contentResolver, int i, String str, boolean z) {
        this.mErrorReason = NO_ERROR;
        boolean z2 = true;
        this.mTerminateCalled = true;
        this.mVCardType = i;
        this.mContentResolver = contentResolver;
        boolean isDoCoMo = VCardConfig.isDoCoMo(i);
        this.mIsDoCoMo = isDoCoMo;
        str = true == TextUtils.isEmpty(str) ? "UTF-8" : str;
        if (VCardConfig.isVersion30(i) && albo.ar("UTF-8", str)) {
            z2 = DEBUG;
        }
        if (!isDoCoMo && !z2) {
            if (TextUtils.isEmpty(str)) {
                this.mCharset = "UTF-8";
            } else {
                this.mCharset = str;
            }
        } else if (albo.ar(SHIFT_JIS, str)) {
            this.mCharset = str;
        } else if (TextUtils.isEmpty(str)) {
            this.mCharset = SHIFT_JIS;
        } else {
            this.mCharset = str;
        }
        Log.d(LOG_TAG, "Use the charset \"" + this.mCharset + "\"");
    }

    public boolean init(String str, String[] strArr) {
        return init(ContactsContract.Contacts.CONTENT_URI, sContactsProjection, str, strArr, null, null);
    }
}
