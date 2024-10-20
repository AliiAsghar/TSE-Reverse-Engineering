package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alwh extends alwe {
    public static final alvt a = new alwf();
    public static final ThreadLocal b = new alwg();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.alwe
    public final void a() {
        this.e.decrementAndGet();
    }
}
