package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahca {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final anau c;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        b = currentTimeMillis;
        SystemClock.elapsedRealtime();
        aozy createBuilder = anau.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anau.b((anau) createBuilder.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anau.a((anau) createBuilder.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anau anauVar = (anau) createBuilder.b;
        anauVar.b |= 1;
        anauVar.c = currentTimeMillis;
        c = (anau) createBuilder.s();
    }

    public static anat a() {
        aozy createBuilder = anat.a.createBuilder();
        long andIncrement = a.getAndIncrement();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        anat anatVar = (anat) apagVar;
        anatVar.b |= 2;
        anatVar.d = andIncrement;
        anau anauVar = c;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        anat anatVar2 = (anat) createBuilder.b;
        anauVar.getClass();
        anatVar2.c = anauVar;
        anatVar2.b |= 1;
        return (anat) createBuilder.s();
    }
}
