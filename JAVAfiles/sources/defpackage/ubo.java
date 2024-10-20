package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ubo implements uco {
    static final utz a = uuh.q(173707567);
    public static final xze b = xze.g("BugleDatabase", "DatabaseCloseChecker");
    public final AtomicBoolean c = new AtomicBoolean(false);

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        albo.X(!this.c.get(), "database is already closed %s", udeVar.b);
        if (udeVar.b.ordinal() != 15) {
            return new ahuf(new ttg(this, 19), 1);
        }
        this.c.set(true);
        xyo e = b.e();
        e.H("Bugle database has started to close.  New database operations will fail.");
        e.q();
        return new ubx(1);
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
