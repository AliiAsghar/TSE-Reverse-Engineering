package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akco {
    public final Cursor a;

    public /* synthetic */ akco(Cursor cursor) {
        this.a = cursor;
    }

    public static final int a(Cursor cursor, String str) {
        return cursor.getColumnIndex(str);
    }

    public static final String b(Cursor cursor, int i) {
        String string = cursor.getString(i);
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof akco) && d.F(this.a, ((akco) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReadOnlyCursor(cursor=" + this.a + ")";
    }
}
