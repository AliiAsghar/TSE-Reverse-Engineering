package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzu implements kkl {
    public final mbl a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    private final arwe d;

    public jzu(mbl mblVar, arwe arweVar) {
        mblVar.getClass();
        arweVar.getClass();
        this.a = mblVar;
        this.d = arweVar;
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        qjh.l(this.d, null, new aamx(this.b.get(), this, this.c.get(), (arpe) null, 1), 3);
    }
}
