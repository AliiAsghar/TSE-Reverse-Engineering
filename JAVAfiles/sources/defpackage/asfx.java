package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asfx extends arxe implements Executor {
    public static final asfx a = new asfx();
    private static final arwb b;

    static {
        arwb arwbVar = asgd.a;
        int y = arro.y("kotlinx.coroutines.io.parallelism", arrn.r(64, asfo.a), 0, 0, 12);
        arro.C(y);
        if (y < asgc.d) {
            arro.C(y);
            arwbVar = new asfa(arwbVar, y);
        }
        b = arwbVar;
    }

    private asfx() {
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        b.a(arpiVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(arpj.a, runnable);
    }

    @Override // defpackage.arwb
    public final void h(arpi arpiVar, Runnable runnable) {
        b.h(arpiVar, runnable);
    }

    @Override // defpackage.arwb
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.arxe
    public final Executor g() {
        return this;
    }
}
