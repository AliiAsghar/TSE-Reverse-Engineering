package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sq extends ss {
    public static final Executor a = new sp(0);
    public static final Executor b = new sp(2);
    private static volatile sq d;
    public final ss c;
    private final ss e;

    private sq() {
        sr srVar = new sr();
        this.e = srVar;
        this.c = srVar;
    }

    public static sq a() {
        if (d == null) {
            synchronized (sq.class) {
                if (d == null) {
                    d = new sq();
                }
            }
        }
        return d;
    }

    @Override // defpackage.ss
    public final void b(Runnable runnable) {
        ss ssVar = this.c;
        sr srVar = (sr) ssVar;
        if (srVar.c == null) {
            synchronized (srVar.a) {
                if (((sr) ssVar).c == null) {
                    ((sr) ssVar).c = sr.a(Looper.getMainLooper());
                }
            }
        }
        srVar.c.post(runnable);
    }
}
