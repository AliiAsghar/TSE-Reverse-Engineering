package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkp extends gko implements gkh {
    public final SQLiteStatement a;

    public gkp(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final void a() {
        this.a.executeUpdateDelete();
    }
}
