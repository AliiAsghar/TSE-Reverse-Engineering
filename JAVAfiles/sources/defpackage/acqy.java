package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqy extends SQLiteOpenHelper implements acqr, acqq {
    public static final ContentValues a;
    public final actx b;
    private final aegu c;

    static {
        ContentValues contentValues = new ContentValues(1);
        a = contentValues;
        contentValues.put("deleted", (Integer) 1);
    }

    public acqy(Context context, aegu aeguVar) {
        super(context, "subscribers.db", (SQLiteDatabase.CursorFactory) null, 18);
        this.b = new actx();
        this.c = aeguVar;
    }

    public static void j(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str));
    }

    private static final String m(String str) {
        return a.bW(str, "SELECT COUNT(DISTINCT contactId) FROM (SELECT contactId FROM Subscribers WHERE (", ") GROUP BY number)");
    }

    @Override // defpackage.acqq
    public final int a(long j) {
        SQLiteStatement compileStatement = getReadableDatabase().compileStatement(m("number NOT NULL AND ((date < ? AND state = 2) OR state != 2) AND deleted = 0"));
        compileStatement.bindString(1, String.valueOf(this.c.f().toEpochMilli() - j));
        return (int) compileStatement.simpleQueryForLong();
    }

    @Override // defpackage.acqq
    public final int b() {
        try {
            return (int) getReadableDatabase().compileStatement(m("number NOT NULL AND date=0 AND deleted = 0")).simpleQueryForLong();
        } catch (SQLiteException e) {
            advr.i(e, "Error getting number of untried entries", new Object[0]);
            return 0;
        }
    }

    @Override // defpackage.acqq
    public final Cursor c(long j) {
        return g("number NOT NULL AND ((date < ? AND state = 2) OR state != 2) AND deleted = 0", new String[]{String.valueOf(this.c.f().toEpochMilli() - j)});
    }

    @Override // defpackage.acqq
    public final Cursor d() {
        return g("number NOT NULL AND date=0 AND deleted = 0", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.acqq
    public final boolean e(final String str, int i, adpo adpoVar) {
        Cursor cursor;
        boolean z;
        int i2;
        byte b;
        int i3;
        if (str != null) {
            String c = advq.PHONE_NUMBER.c(str);
            Integer valueOf = Integer.valueOf(i);
            advr.o("Updating state for %s to %s with capabilities: %s", c, valueOf, adpoVar);
            final String[] strArr = {str};
            String[] strArr2 = {"capabilities"};
            try {
                final SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    cursor = writableDatabase.query("Subscribers", strArr2, "number = ? ", strArr, null, null, null);
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                }
                try {
                    if (cursor.moveToFirst()) {
                        i2 = cursor.getInt(0);
                        z = true;
                    } else {
                        z = false;
                        i2 = 0;
                    }
                    agkx.aj(cursor);
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put("state", valueOf);
                    contentValues.put("date", agkx.W());
                    if (i == 1) {
                        contentValues.put("capabilities", (Integer) 0);
                    }
                    if (adpoVar != null) {
                        contentValues.put("lastActive", Long.valueOf(adpoVar.e));
                        contentValues.put("isOnline", Integer.valueOf(adpoVar.c ? 1 : 0));
                        contentValues.put("responseCode", Integer.valueOf(adpoVar.g));
                        boolean u = adpoVar.u();
                        boolean D = adpoVar.D();
                        if (!adpoVar.G() && !adpoVar.I()) {
                            b = false;
                        } else {
                            b = true;
                        }
                        boolean I = adpoVar.I();
                        boolean C = adpoVar.C();
                        boolean B = adpoVar.B();
                        boolean E = adpoVar.E();
                        boolean K = adpoVar.K();
                        if (u) {
                            i3 = acuc.STICKERS.a(0);
                        } else {
                            i3 = 0;
                        }
                        if (D) {
                            i3 = acuc.LOCATION_PUSH.a(i3);
                        }
                        if (b != false) {
                            i3 = acuc.IP_CALL.a(i3);
                        }
                        if (I) {
                            i3 = acuc.IP_VIDEO_CALL_ONLY.a(i3);
                        }
                        if (C && i == 2 && (adpoVar.c || adpoVar.C())) {
                            i3 = acuc.HTTP_FT.a(i3);
                        }
                        if (B) {
                            i3 = acuc.FILE_TRANSFER_VIA_SMS.a(i3);
                        }
                        if (E) {
                            i3 = acuc.LOCATION_VIA_SMS.a(i3);
                        }
                        if (K) {
                            i3 = acuc.UP_2_0.a(i3);
                        }
                        int i4 = i3 | i2;
                        if (i4 != i2) {
                            contentValues.put("capabilities", Integer.valueOf(i4));
                        }
                    }
                    final boolean z2 = z;
                    if (((Integer) actx.c(writableDatabase, new alhr() { // from class: acqs
                        public final /* synthetic */ String d = "number = ? ";

                        @Override // defpackage.alhr
                        public final Object get() {
                            int i5;
                            ContentValues contentValues2 = acqy.a;
                            boolean z3 = z2;
                            SQLiteDatabase sQLiteDatabase = writableDatabase;
                            ContentValues contentValues3 = contentValues;
                            if (z3) {
                                return Integer.valueOf(sQLiteDatabase.update("Subscribers", contentValues3, this.d, strArr));
                            }
                            contentValues3.put("number", str);
                            if (sQLiteDatabase.insert("Subscribers", null, contentValues3) != -1) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                            return Integer.valueOf(i5);
                        }
                    }).orElse(0)).intValue() <= 0) {
                        return false;
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    agkx.aj(cursor);
                    throw th;
                }
            } catch (SQLiteException unused) {
                return false;
            }
        }
        throw new InvalidParameterException("Number must not be null");
    }

    @Override // defpackage.acqr
    public final acud f(String str) {
        int i;
        long j;
        int i2;
        boolean z;
        int i3;
        if (str != null) {
            Cursor query = getReadableDatabase().query("Subscribers", (String[]) acqt.a.toArray(new String[0]), "number=?", new String[]{str}, null, null, null);
            do {
                try {
                    if (query.moveToNext()) {
                        i = query.getInt(0);
                        j = query.getLong(2);
                        i2 = query.getInt(1);
                        if (query.getInt(3) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i3 = query.getInt(4);
                    } else {
                        agkx.aj(query);
                        return acud.a;
                    }
                } finally {
                    agkx.aj(query);
                }
            } while (i == 0);
            return new acud(i, j, i2, z, i3);
        }
        throw new InvalidParameterException("Number must not be null");
    }

    public final Cursor g(String str, String[] strArr) {
        return getReadableDatabase().query("Subscribers", (String[]) acqx.a.toArray(new String[0]), str, strArr, "number", null, "contactId");
    }

    public final acqv h(String str) {
        Cursor query = getReadableDatabase().query("Subscribers", (String[]) acqw.a.toArray(new String[0]), "number=?", new String[]{str}, null, null, "contactId ASC LIMIT 1");
        acqv acqvVar = new acqv();
        try {
            if (query.moveToFirst()) {
                acqvVar.b = query.getLong(0);
                acqvVar.a = query.getString(1);
            }
            if (query != null) {
                query.close();
            }
            return acqvVar;
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final void i() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            contentValues.put("capabilities", (Integer) 0);
            contentValues.put("lastActive", (Integer) 0);
            contentValues.put("isOnline", (Integer) 0);
            contentValues.put("responseCode", (Integer) 0);
            actx.d(writableDatabase, new acaj(writableDatabase, contentValues, 15));
        } catch (SQLiteException unused) {
        }
    }

    public final boolean k(String str, int i, adpo adpoVar) {
        if (TextUtils.isEmpty(str)) {
            advr.c("Ignoring IMS state update for empty MSISDN", new Object[0]);
            return false;
        }
        if (e(str, i, adpoVar)) {
            return true;
        }
        advr.o("Updating last checked date only for %s", advq.PHONE_NUMBER.c(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("date", Long.valueOf(this.c.f().toEpochMilli()));
        String[] strArr = {str};
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            actx.c(writableDatabase, new tdw(writableDatabase, contentValues, strArr, 18, (char[]) null));
        } catch (SQLiteException unused) {
        }
        return false;
    }

    public final boolean l(String str) {
        return k(str, 2, null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Subscribers ( _id INTEGER PRIMARY KEY AUTOINCREMENT, phoneId BIGINT NOT NULL DEFAULT 0, contactId BIGINT NOT NULL DEFAULT 0, number TEXT, nativeNumber TEXT, state INTEGER NOT NULL, capabilities INTEGER NOT NULL DEFAULT 0, dataVersion INTEGER, date LONG NOT NULL,lastActive LONG,isOnline INTEGER,responseCode INTEGER,Availability TEXT, FreeText TEXT, FavouriteLink TEXT, Timestamp TEXT, PortraitIconLink TEXT, PortraitIconLinkEtag TEXT, Location TEXT, LocationLatitude REAL NOT NULL DEFAULT 0, LocationLongitude REAL NOT NULL DEFAULT 0, LocationRadius REAL NOT NULL DEFAULT 0, SharingState INTEGER NOT NULL DEFAULT 0, SharingFeatures TEXT, DisplayName TEXT, deleted INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PresenceContent ( _id INTEGER PRIMARY KEY AUTOINCREMENT, Url TEXT NOT NULL, Etag TEXT NOT NULL, Description TEXT, ContentType TEXT, Size INTEGER NOT NULL DEFAULT 0, Data BLOB);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        advr.k("Update %s database from version: %d to %d", "subscribers.db", Integer.valueOf(i), Integer.valueOf(i2));
        actx.d(sQLiteDatabase, new wob(this, i, sQLiteDatabase, 7, (byte[]) null));
    }
}
