package defpackage;

import android.database.Cursor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ych implements Closeable {
    public final Cursor a;
    private final ycg b;

    public ych() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Cursor cursor = this.a;
        if (cursor != null) {
            cursor.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ych) {
            ych ychVar = (ych) obj;
            if (this.b.equals(ychVar.b)) {
                Cursor cursor = this.a;
                Cursor cursor2 = ychVar.a;
                if (cursor != null ? cursor.equals(cursor2) : cursor2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() ^ 1000003;
        Cursor cursor = this.a;
        if (cursor == null) {
            hashCode = 0;
        } else {
            hashCode = cursor.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        Cursor cursor = this.a;
        return "ContactsDirectoryFilterResult{directory=" + this.b.toString() + ", filterCursor=" + String.valueOf(cursor) + "}";
    }

    public ych(ycg ycgVar, Cursor cursor) {
        if (ycgVar == null) {
            throw new NullPointerException("Null directory");
        }
        this.b = ycgVar;
        this.a = cursor;
    }
}
