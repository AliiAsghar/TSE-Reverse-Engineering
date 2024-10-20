package defpackage;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDiskIOException;
import android.net.Uri;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udo implements Cursor {
    public final Cursor a;
    final /* synthetic */ udp b;

    public udo(udp udpVar, Cursor cursor) {
        this.b = udpVar;
        this.a = cursor;
    }

    private final Object a(alhr alhrVar) {
        int i;
        SQLiteDiskIOException sQLiteDiskIOException = null;
        int i2 = 0;
        while (true) {
            try {
                Object obj = alhrVar.get();
                if (i2 > 0) {
                    ((mbl) this.b.e.b()).e("Bugle.Datamodel.CursorDiskIOExceptionRecovery.Counts", i2);
                }
                return obj;
            } catch (SQLiteDiskIOException e) {
                if (sQLiteDiskIOException != null) {
                    e.addSuppressed(sQLiteDiskIOException);
                }
                udp.a.r("got SQLiteDiskIOException", e);
                if (i2 == 0) {
                    ((mbl) this.b.e.b()).c("Bugle.Datamodel.CursorDiskIOException.Counts");
                    i = 0;
                    i2 = 0;
                } else {
                    i = i2;
                }
                if (i2 < ((Integer) ((utz) udp.b.get()).e()).intValue()) {
                    albo.bz(((Long) ((utz) udp.c.get()).e()).longValue(), TimeUnit.MILLISECONDS);
                    i2 = i + 1;
                    sQLiteDiskIOException = e;
                } else {
                    throw new IllegalStateException("unable to perform cursor operation", e);
                }
            }
        }
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.a.copyStringToBuffer(i, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public final void deactivate() {
        throw new IllegalStateException("deactivate is deprecated");
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.a.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.a.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.a.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return ((Integer) a(new udn(this, 3))).intValue();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.a.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.a.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return ((Integer) a(new udn(this, 0))).intValue();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        return this.a.getShort(i);
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        return this.a.getString(i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.a.getType(i);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.a.getWantsAllOnMoveCalls();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return ((Boolean) a(new udn(this, 1))).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return ((Boolean) a(new udn(this, 4))).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return ((Boolean) a(new tor(this, 18))).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return ((Boolean) a(new tor(this, 19))).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return this.a.move(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return ((Boolean) a(new udn(this, 2))).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return ((Boolean) a(new tor(this, 20))).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.a.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        return ((Boolean) a(new mso(this, i, 3))).booleanValue();
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.a.moveToPrevious();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.a.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        throw new IllegalStateException("requery is deprecated");
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.a.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.a.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.a.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.unregisterDataSetObserver(dataSetObserver);
    }
}
