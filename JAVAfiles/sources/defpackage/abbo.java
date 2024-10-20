package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbo extends oc {
    private final armf d;
    private ech e;
    private int h;
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private boolean i = true;

    public abbo(armf armfVar) {
        this.d = armfVar;
    }

    @Override // defpackage.oc
    public final oo b(int i) {
        this.e.getClass();
        if (this.i) {
            ((laj) this.d.b()).a(laj.c);
            this.i = false;
        }
        if (this.h == i) {
            oo ooVar = (oo) this.e.a();
            if (ooVar != null) {
                this.f.incrementAndGet();
                return ooVar;
            }
            this.g.incrementAndGet();
        }
        return super.b(i);
    }

    @Override // defpackage.oc
    public final void e(oo ooVar) {
        ech echVar = this.e;
        echVar.getClass();
        if (this.h == ooVar.f && echVar.b(ooVar)) {
            return;
        }
        super.e(ooVar);
    }

    public final void h(int i, int i2) {
        this.e = new ech(i);
        this.h = i2;
    }
}
