package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aixe {
    public final SQLiteDatabase a;
    public final Executor b;
    public volatile boolean c = false;
    public final asqc d;
    private final Executor e;

    public aixe(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, asqc asqcVar) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.e = executor2;
        this.d = asqcVar;
    }

    public final ListenableFuture a(aixs aixsVar) {
        b();
        akrl akrlVar = akrk.a;
        agrk agrkVar = new agrk(this.a);
        akrh f = aktp.f("Transaction", akrlVar);
        try {
            anel anelVar = new anel(akto.k(new aixc(this, aixsVar, agrkVar)));
            this.e.execute(anelVar);
            anelVar.c(new ahnu(anelVar, agrkVar, 16), andi.a);
            f.b(anelVar);
            f.close();
            return anelVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (!this.c) {
        } else {
            throw new IllegalStateException("Already closed");
        }
    }
}
