package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grz {
    public Executor a;
    public arpi b;
    public gto c;
    public Executor d;
    public gth e;
    public ecd f;
    public String g;
    public int i;
    public int h = 4;
    public int j = Integer.MAX_VALUE;

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, dtq dtqVar, arqg arqgVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            dtqVar.b(arqgVar.a());
        } catch (Throwable th) {
            dtqVar.d(th);
        }
    }

    public final void b(Executor executor) {
        executor.getClass();
        this.a = executor;
    }

    public final void c(Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    public final void d(gto gtoVar) {
        gtoVar.getClass();
        this.c = gtoVar;
    }
}
