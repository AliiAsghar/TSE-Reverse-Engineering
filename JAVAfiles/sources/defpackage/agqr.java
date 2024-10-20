package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqr {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (a.compareAndSet(false, true)) {
            aozs a2 = aozs.a();
            aozs aozsVar = arkx.a;
            a2.getClass();
            arkx.a = a2;
        }
    }
}
