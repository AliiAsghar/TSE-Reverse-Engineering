package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uue implements uuf {
    private final Supplier a;
    private utx b;

    public uue(Supplier supplier) {
        this.a = supplier;
    }

    private final utx a() {
        utx utxVar;
        Object obj;
        synchronized (this.a) {
            if (this.b == null) {
                obj = this.a.get();
                ahtp ahtpVar = (ahtp) obj;
                this.b = new utx(ahtpVar, ahtpVar.c());
            }
            utxVar = this.b;
            utxVar.getClass();
        }
        return utxVar;
    }

    @Override // defpackage.uuf
    public final Object e() {
        return a().e();
    }

    @Override // defpackage.uuf
    public final Object f() {
        return a().c;
    }

    @Override // defpackage.uuf
    public final String j() {
        return a().j();
    }

    @Override // defpackage.uuf
    public final void k(Object obj) {
        throw null;
    }

    @Override // defpackage.uuf
    public final void l() {
        synchronized (this.a) {
            if (this.b != null) {
                a().l();
            }
        }
    }

    @Override // defpackage.uuf
    public final void m() {
        throw null;
    }
}
