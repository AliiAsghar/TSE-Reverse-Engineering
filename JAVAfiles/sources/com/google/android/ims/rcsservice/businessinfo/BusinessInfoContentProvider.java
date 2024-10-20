package com.google.android.ims.rcsservice.businessinfo;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.abis;
import defpackage.adtw;
import defpackage.advr;
import defpackage.adwi;
import defpackage.uhi;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BusinessInfoContentProvider extends uhi<BusinessInfoContentProviderInternal> {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class BusinessInfoContentProviderInternal extends ContentProvider {
        public static final String AUTHORITY = "com.google.android.rcs.client.businessinfo";
        public static final int BUSINESS_INFO_CODE = 10;
        public static final int BUSINESS_INFO_PROPERTIES_CODE = 20;
        private static final String BUSINESS_INFO_PROPERTIES_QUERY = "businessinfoproperties";
        private static final String BUSINESS_INFO_QUERY = "businessinfo";
        private static final String CONTENT_AUTHORITY = "content://com.google.android.rcs.client.businessinfo/";
        public static final String CSAPK_AUTHORITY = "com.google.android.ims.rcs.client.businessinfo";
        private static final String CSAPK_CONTENT_AUTHORITY = "content://com.google.android.ims.rcs.client.businessinfo/";
        private static final UriMatcher uriMatcher;
        private BusinessInfoDatabase businessInfoDatabase;
        private static final Uri BUSINESS_INFO_URI = Uri.parse("content://com.google.android.rcs.client.businessinfo/businessinfo");
        private static final Uri BUSINESS_INFO_PROPERTIES_URI = Uri.parse("content://com.google.android.rcs.client.businessinfo/businessinfoproperties");
        private static final Uri CSAPK_BUSINESS_INFO_URI = Uri.parse("content://com.google.android.ims.rcs.client.businessinfo/businessinfo");
        private static final Uri CSAPK_BUSINESS_INFO_PROPERTIES_URI = Uri.parse("content://com.google.android.ims.rcs.client.businessinfo/businessinfoproperties");

        static {
            UriMatcher uriMatcher2 = new UriMatcher(-1);
            uriMatcher = uriMatcher2;
            uriMatcher2.addURI(AUTHORITY, "businessinfo/*", 10);
            uriMatcher2.addURI(AUTHORITY, "businessinfoproperties/*", 20);
            uriMatcher2.addURI(CSAPK_AUTHORITY, "businessinfo/*", 10);
            uriMatcher2.addURI(CSAPK_AUTHORITY, "businessinfoproperties/*", 20);
        }

        public static Uri buildBusinessInfoPropertiesUri(String str, Context context) {
            if (adwi.k(context)) {
                advr.k("Building CS business info properties URI for botId: %s", advr.a(str));
                return CSAPK_BUSINESS_INFO_PROPERTIES_URI.buildUpon().appendPath(str).build();
            }
            advr.k("Building AM business info properties URI for botId: %s", advr.a(str));
            return BUSINESS_INFO_PROPERTIES_URI.buildUpon().appendPath(str).build();
        }

        public static Uri buildBusinessInfoUri(String str, Context context) {
            if (adwi.k(context)) {
                advr.k("Building CS business info URI for botId: %s", advr.a(str));
                return CSAPK_BUSINESS_INFO_URI.buildUpon().appendPath(str).build();
            }
            advr.k("Building AM business info URI for botId: %s", advr.a(str));
            return BUSINESS_INFO_URI.buildUpon().appendPath(str).build();
        }

        public static UriMatcher getUriMatcher() {
            return uriMatcher;
        }

        public static void grantBugleAccessToBusinessMedia(BusinessInfoDatabase businessInfoDatabase, Context context, String str, int i) {
            String localMediaPath = businessInfoDatabase.getLocalMediaPath(str, i);
            if (!TextUtils.isEmpty(localMediaPath)) {
                context.grantUriPermission("com.google.android.apps.messaging", Uri.parse(localMediaPath), 67);
            }
        }

        public static void notifyBusinessInfoChanged(Context context, String str) {
            advr.k("Notifying business info changed for botId %s", advr.a(str));
            context.getContentResolver().notifyChange(buildBusinessInfoUri(str, context), null);
        }

        public static void notifyBusinessInfoPropertiesChanged(Context context, String str) {
            advr.k("Notifying business info properties changed for botId %s", advr.a(str));
            context.getContentResolver().notifyChange(buildBusinessInfoPropertiesUri(str, context), null);
        }

        @Override // android.content.ContentProvider
        public int delete(Uri uri, String str, String[] strArr) {
            throw new IllegalArgumentException("Delete not supported: ".concat(String.valueOf(String.valueOf(uri))));
        }

        @Override // android.content.ContentProvider
        public String getType(Uri uri) {
            return null;
        }

        @Override // android.content.ContentProvider
        public Uri insert(Uri uri, ContentValues contentValues) {
            throw new IllegalArgumentException("Insert not supported: ".concat(String.valueOf(String.valueOf(uri))));
        }

        @Override // android.content.ContentProvider
        public boolean onCreate() {
            Context context = getContext();
            context.getClass();
            abis.b(context);
            this.businessInfoDatabase = BusinessInfoDatabase.getInstance(context);
            return true;
        }

        @Override // android.content.ContentProvider
        public ParcelFileDescriptor openFile(Uri uri, String str) {
            throw new IllegalArgumentException("openFile not supported: ".concat(String.valueOf(String.valueOf(uri))));
        }

        @Override // android.content.ContentProvider
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            Cursor cursor;
            Context context = getContext();
            context.getClass();
            int callingUid = Binder.getCallingUid();
            int i = adtw.a;
            try {
                adtw.d(context, callingUid);
                BusinessInfoDatabase businessInfoDatabase = this.businessInfoDatabase;
                businessInfoDatabase.getClass();
                SQLiteDatabase readableDatabase = businessInfoDatabase.getReadableDatabase();
                int match = uriMatcher.match(uri);
                if (match != 10) {
                    if (match != 20) {
                        xyl.c("Unknown BusinessInfoContentProvider query URI ".concat(String.valueOf(String.valueOf(uri))));
                        return null;
                    }
                    cursor = readableDatabase.query(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.TABLE_NAME, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.DEFAULT_PROJECTION, BusinessInfoDatabase.BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{uri.getPathSegments().get(1)}, null, null, null);
                } else {
                    String str3 = uri.getPathSegments().get(1);
                    Cursor query = readableDatabase.query(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.VIEW_NAME, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.DEFAULT_PROJECTION, BusinessInfoDatabase.BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str3}, null, null, null);
                    grantBugleAccessToBusinessMedia(businessInfoDatabase, context, str3, 0);
                    grantBugleAccessToBusinessMedia(businessInfoDatabase, context, str3, 1);
                    grantBugleAccessToBusinessMedia(businessInfoDatabase, context, str3, 2);
                    cursor = query;
                }
                cursor.setNotificationUri(context.getContentResolver(), uri);
                return cursor;
            } catch (RemoteException unused) {
                advr.q("Calling package is not whitelisted.", new Object[0]);
                return null;
            }
        }

        @Override // android.content.ContentProvider
        public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new IllegalArgumentException("Update not supported: ".concat(String.valueOf(String.valueOf(uri))));
        }
    }

    public BusinessInfoContentProvider() {
        super(BusinessInfoContentProviderInternal.class);
    }
}
