package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uef implements uco {
    static final uuf a = uuh.q(172089041);
    public final xnv b;
    public final mbl c;

    public uef(xnv xnvVar, mbl mblVar) {
        this.b = xnvVar;
        this.c = mblVar;
    }

    @Override // defpackage.uco
    public final int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        return new uee(this, udeVar);
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
