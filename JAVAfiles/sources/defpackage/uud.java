package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uud extends utx {
    private final AtomicReference e;

    public uud(ahtp ahtpVar, Object obj) {
        super(ahtpVar, obj);
        this.e = new AtomicReference();
    }

    @Override // defpackage.utx, defpackage.akfb
    public final /* bridge */ /* synthetic */ Object c() {
        return c();
    }

    @Override // defpackage.utx
    public final Object h() {
        Object obj;
        synchronized (this.b) {
            Object g = g();
            a.bE(this.e, g);
            a.bE(this.d, g);
            obj = this.d.get();
            obj.getClass();
        }
        return obj;
    }

    @Override // defpackage.utx
    /* renamed from: i */
    public final String c() {
        return this.b.d();
    }

    @Override // defpackage.utx, defpackage.uuf
    public final String j() {
        return this.b.d();
    }

    @Override // defpackage.utx, defpackage.uuf
    public final void k(Object obj) {
        this.d.set(obj);
    }

    @Override // defpackage.utx, defpackage.uuf
    public final void l() {
    }
}
