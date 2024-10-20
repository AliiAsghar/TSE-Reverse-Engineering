package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alvb extends alwe {
    public static final alvt a = new aluz();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.alwe
    public final void a() {
        this.b.set(Math.max(-this.b.get(), 0L));
    }
}
