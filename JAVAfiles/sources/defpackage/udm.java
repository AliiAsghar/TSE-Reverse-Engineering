package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udm implements uco {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin");
    public final Semaphore a = new Semaphore(4, true);
    public final ThreadLocal b;
    private final ofc d;
    private final xnv e;

    public udm(ofc ofcVar, xnv xnvVar) {
        int i = tyr.a;
        this.b = new ThreadLocal() { // from class: udl
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ Object initialValue() {
                return a.bz();
            }
        };
        this.d = ofcVar;
        this.e = xnvVar;
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        int ordinal = udeVar.b.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 6) {
                if (ordinal == 8) {
                    return new ucz(this, 4);
                }
                return null;
            }
            return new ucz(this, 3);
        }
        if (!((Boolean) this.b.get()).booleanValue()) {
            xnv xnvVar = this.e;
            Semaphore semaphore = this.a;
            long a = xnvVar.a();
            semaphore.acquireUninterruptibly();
            long a2 = this.e.a() - a;
            if (a2 > 5000) {
                if (xyp.h()) {
                    ((alvg) ((alvg) c.g()).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 84, "ReadLockPlugin.java")).s("took > 5000 (%d ms) to acquire readLock", a2);
                } else {
                    ((alvg) ((alvg) c.i()).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 86, "ReadLockPlugin.java")).s("took > 5000 (%d ms) to acquire readLock", a2);
                }
            }
            return new ucz(this, 5);
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ((ansy) ((nnd) this.d).a.b()).e("bugle.enable_read_lock_plugin");
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
