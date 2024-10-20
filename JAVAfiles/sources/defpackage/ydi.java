package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ydi implements ydj {
    private final /* synthetic */ int a;

    @Override // defpackage.ydj
    public final Object a(Cursor cursor, int i) {
        if (this.a != 0) {
            return Long.valueOf(cursor.getLong(i));
        }
        return cursor.getString(i);
    }
}
