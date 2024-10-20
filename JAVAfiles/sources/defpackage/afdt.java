package defpackage;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdt implements Cursor {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/attachments/resolver/MetadataCursor");
    private static final Instant c;
    private static final Instant d;
    public final Cursor b;

    static {
        Instant plus = Instant.EPOCH.plus(Duration.ofDays(1825L));
        plus.getClass();
        c = plus;
        Instant plus2 = Instant.EPOCH.plus(Duration.ofDays(23725L));
        plus2.getClass();
        d = plus2;
    }

    public afdt(Cursor cursor) {
        this.b = cursor;
    }

    private static final Instant f(long j) {
        Instant instant = null;
        try {
            Instant instant2 = c;
            long epochSecond = instant2.getEpochSecond();
            Instant instant3 = d;
            if (j < instant3.getEpochSecond() && epochSecond <= j) {
                instant = Instant.ofEpochSecond(j);
            } else {
                long epochMilli = instant2.toEpochMilli();
                if (j < instant3.toEpochMilli() && epochMilli <= j) {
                    instant = Instant.ofEpochMilli(j);
                } else {
                    long epochMilli2 = instant2.toEpochMilli() * 1000;
                    if (j < instant3.toEpochMilli() * 1000 && epochMilli2 <= j) {
                        instant = Instant.ofEpochMilli(j / 1000);
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
            ((alvg) a.h().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursor", "getCorrectedValueAsInstant", 102, "MetadataCursor.kt")).s("Error parsing timestamp to Instant. Unable to infer unit of time of {%d}.", j);
        }
        return instant;
    }

    public final Size a() {
        Integer bt;
        if (Build.VERSION.SDK_INT >= 29 && (bt = aeke.bt(this.b, "width")) != null) {
            Cursor cursor = this.b;
            int intValue = bt.intValue();
            Integer bt2 = aeke.bt(cursor, "height");
            if (bt2 != null) {
                Size size = new Size(intValue, bt2.intValue());
                Integer bt3 = aeke.bt(this.b, "orientation");
                if (bt3 != null) {
                    return aeke.bq(size, bt3.intValue());
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final Duration b() {
        String bv;
        if (Build.VERSION.SDK_INT >= 29 && (bv = aeke.bv(this.b, "duration")) != null) {
            return Duration.ofMillis(Long.parseLong(bv));
        }
        return null;
    }

    public final Instant c() {
        Instant instant;
        Instant instant2;
        Long bu = aeke.bu(this.b, "date_added");
        if (bu == null || (instant = f(bu.longValue())) == null) {
            instant = Instant.EPOCH;
            instant.getClass();
        }
        Long bu2 = aeke.bu(this.b, "date_modified");
        if (bu2 == null || (instant2 = f(bu2.longValue())) == null) {
            instant2 = Instant.EPOCH;
            instant2.getClass();
        }
        instant.getClass();
        instant2.getClass();
        if (instant.compareTo(instant2) < 0) {
            instant = instant2;
        }
        if (instant.compareTo(Instant.EPOCH) <= 0) {
            instant = null;
        }
        if (instant == null) {
            ((alvg) a.i().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursor", "dateModified", 39, "MetadataCursor.kt")).q("Unable to obtain modified date from Content Resolver");
        }
        return instant;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.b.copyStringToBuffer(i, charArrayBuffer);
    }

    public final Long d() {
        Long bu = aeke.bu(this.b, "_size");
        if (bu == null) {
            ((alvg) a.i().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursor", "sizeBytes", 77, "MetadataCursor.kt")).q("Unable to obtain size in bytes from Content Resolver");
        }
        return bu;
    }

    @Override // android.database.Cursor
    @armg
    public final void deactivate() {
        this.b.deactivate();
    }

    public final String e() {
        return aeke.bv(this.b, "mime_type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afdt) && d.F(this.b, ((afdt) obj).b)) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        return this.b.getBlob(i);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.b.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.b.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.b.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return this.b.getColumnName(i);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.b.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return this.b.getCount();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        return this.b.getDouble(i);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.b.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        return this.b.getFloat(i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        return this.b.getInt(i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        return this.b.getLong(i);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.b.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.b.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        return this.b.getShort(i);
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        return this.b.getString(i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.b.getType(i);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.b.getWantsAllOnMoveCalls();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.b.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.b.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.b.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.b.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.b.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.b.isNull(i);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return this.b.move(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.b.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.b.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.b.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        return this.b.moveToPosition(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.b.moveToPrevious();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.b.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    @armg
    public final boolean requery() {
        return this.b.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.b.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.b.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.b.setNotificationUri(contentResolver, uri);
    }

    public final String toString() {
        return "MetadataCursor(cursor=" + this.b + ")";
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.b.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.unregisterDataSetObserver(dataSetObserver);
    }
}
