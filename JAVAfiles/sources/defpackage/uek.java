package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.util.Optional;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uek implements uco {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin");
    public static final utz b = uuh.l(uuh.b, "transaction_watchdog_limit_ms", 5000);
    public static final Object c = new Object();
    public final xnv d;
    public final aneo e;
    public anem f;
    public boolean g;
    private final apwt h;
    private final oct i;

    public uek(aneo aneoVar, oct octVar, xnv xnvVar, apwt apwtVar) {
        this.e = aneoVar;
        this.i = octVar;
        this.d = xnvVar;
        this.h = apwtVar;
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        int ordinal = udeVar.b.ordinal();
        if (ordinal != 6) {
            if (ordinal == 8) {
                synchronized (c) {
                    if (this.g) {
                        this.g = false;
                        this.f.cancel(false);
                    }
                }
                return null;
            }
            return null;
        }
        Optional optional = (Optional) this.h.b();
        if (!optional.isEmpty()) {
            return new vgj(this, optional, 1);
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ((ansy) ((nlp) this.i).a.b()).e("bugle.report_long_transactions");
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
