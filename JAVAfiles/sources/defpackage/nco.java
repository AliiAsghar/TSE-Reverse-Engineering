package defpackage;

import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nco implements ncq, yfx {
    public final Object a = new Object();
    public final AtomicReference b = new AtomicReference(Optional.empty());
    public final anen c;
    public final ncq d;
    public final yyt e;
    private yga f;

    public nco(wfh wfhVar, anen anenVar, ncq ncqVar) {
        this.e = wfhVar.Y(this);
        this.c = anenVar;
        this.d = ncqVar;
        d.t(!(ncqVar instanceof nco), "The underlying ObservableSupplier is already a LiveCache!");
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.e.w(new kzq(ncpVar, 20), "LiveCache::register", "LiveCache::callback", "LiveCache::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        Optional map = ((Optional) this.b.get()).map(new ncy(1));
        ncq ncqVar = this.d;
        ncqVar.getClass();
        return (akul) map.orElseGet(new ijm(ncqVar, 15));
    }

    @Override // defpackage.ncq
    public final Object c() {
        Optional optional = (Optional) this.b.get();
        if (optional.isPresent() && ((akbj) optional.get()).e()) {
            try {
                return albo.bQ(((akbj) optional.get()).c());
            } catch (ExecutionException unused) {
            }
        }
        return this.d.c();
    }

    @Override // defpackage.yfx
    public final void fs() {
        synchronized (this.a) {
            this.f = this.d.a(new mlq(this, 12));
            AtomicReference atomicReference = this.b;
            Optional empty = Optional.empty();
            ncq ncqVar = this.d;
            ncqVar.getClass();
            albo.U(a.bC(atomicReference, empty, Optional.of(new akbj(new ikm(ncqVar, 10), this.c))), "Unexpected initializing future found!");
        }
    }

    @Override // defpackage.yfx
    public final void ft() {
        synchronized (this.a) {
            albo.U(((Optional) this.b.getAndSet(Optional.empty())).isPresent(), "Unexpectedly missing initializing future!");
        }
        yga ygaVar = this.f;
        ygaVar.getClass();
        ygaVar.a();
        this.f = null;
    }
}
