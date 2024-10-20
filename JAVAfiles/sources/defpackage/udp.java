package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udp implements uco {
    public static final xze a = xze.g("BugleDatabase", "DatabaseWrapperCursorHandler");
    public static final alhr b = albo.D(new ubz(3));
    public static final alhr c = albo.D(new ubz(4));
    public static final utz d = uuh.q(150089955);
    public final armf e;

    public udp(armf armfVar) {
        this.e = armfVar;
    }

    @Override // defpackage.uco
    public final Cursor a(Cursor cursor, ude udeVar) {
        return new udo(this, cursor);
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final /* synthetic */ Closeable l(ude udeVar) {
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ((Boolean) d.e()).booleanValue();
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }
}
