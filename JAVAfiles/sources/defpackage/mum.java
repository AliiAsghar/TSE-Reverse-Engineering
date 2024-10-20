package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mum implements mjl {
    public final List a = new ArrayList();
    private final nfw b;
    private final mjp c;
    private final AtomicReference d;

    public mum(nfw nfwVar, mix mixVar, mjp mjpVar) {
        this.b = nfwVar;
        this.c = mjpVar;
        this.d = new AtomicReference(mixVar);
    }

    @Override // defpackage.mjm
    public final mix a() {
        return (mix) this.d.get();
    }

    @Override // defpackage.mjm
    public final mjp b() {
        return this.c;
    }

    @Override // defpackage.mjl
    public final nfw c() {
        return this.b;
    }

    @Override // defpackage.mje
    public final /* synthetic */ int d() {
        return 2;
    }

    public final void e(mix mixVar) {
        alog<ndk> aZ;
        mix a = a();
        if (a.a(mixVar) && a.bC(this.d, a, mixVar)) {
            synchronized (this.a) {
                aZ = alzz.aZ(this.a);
            }
            for (ndk ndkVar : aZ) {
                ((arzk) ndkVar.a).c(ndkVar.b);
            }
            if (mixVar.b()) {
                synchronized (this.a) {
                    this.a.clear();
                }
            }
        }
    }
}
