package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import j$.util.Optional;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udx implements uco {
    static final uuf a = uuh.q(157142040);
    public static final /* synthetic */ int b = 0;
    private final armf c;
    private final Optional d;

    public udx(armf armfVar, Optional optional) {
        this.c = armfVar;
        this.d = optional;
    }

    @Override // defpackage.uco
    public final int e(Exception exc, int i, ude udeVar) {
        if (!((Boolean) a.e()).booleanValue() || !(exc instanceof SQLiteFullException)) {
            return 1;
        }
        ((mbl) this.c.b()).c("Bugle.Datamodel.DatabaseStorageExhausted.Counts");
        ((mbl) this.c.b()).a();
        this.d.ifPresent(new swb(20));
        System.exit(0);
        throw new IllegalStateException("unreachable");
    }

    @Override // defpackage.uco
    public final /* synthetic */ Closeable l(ude udeVar) {
        return null;
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
