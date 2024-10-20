package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aonb implements aies {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final aona b;
    private final algw c;

    public aonb(aona aonaVar, algw algwVar) {
        this.b = aonaVar;
        this.c = algwVar;
    }

    @Override // defpackage.aies
    public final void a() {
        boolean isIsolated;
        isIsolated = Process.isIsolated();
        if (!isIsolated && !a.getAndSet(true)) {
            akrh e = aktp.e("AndroidLoggerConfig");
            try {
                aona aonaVar = this.b;
                Object obj = ((alha) this.c).a;
                if (alyb.a.compareAndSet(false, true)) {
                    if (a.bE(alyf.d, aonaVar)) {
                        alyf.e();
                        alyg.a.b.set(obj);
                        e.close();
                        return;
                    }
                    throw new IllegalStateException("Logger backends can only be configured once.");
                }
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
