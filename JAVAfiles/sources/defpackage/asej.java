package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asej implements arwl {
    private final /* synthetic */ arvv a;

    public asej(arvv arvvVar) {
        this.a = arvvVar;
    }

    @Override // defpackage.arxm
    public final boolean A() {
        return this.a.A();
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) arhi.k(this.a, r, arqvVar);
    }

    @Override // defpackage.arpg, defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        return (E) arhi.l(this.a, arphVar);
    }

    @Override // defpackage.arpg
    public final arph<?> getKey() {
        return arxm.c;
    }

    @Override // defpackage.arxm
    public final arvt ho(arxw arxwVar) {
        return this.a.ho(arxwVar);
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        return arhi.m(this.a, arphVar);
    }

    @Override // defpackage.arwl
    public final Object n(arpe arpeVar) {
        return this.a.hk(arpeVar);
    }

    @Override // defpackage.arwl
    public final Object o() {
        return this.a.F();
    }

    @Override // defpackage.arwl
    public final asqe p() {
        throw null;
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        return arhi.n(this.a, arpiVar);
    }

    @Override // defpackage.arxm
    public final Object q(arpe arpeVar) {
        return this.a.q(arpeVar);
    }

    @Override // defpackage.arxm
    public final CancellationException r() {
        return this.a.r();
    }

    @Override // defpackage.arxm
    public final arwu s(arqr arqrVar) {
        return this.a.s(arqrVar);
    }

    @Override // defpackage.arxm
    public final arwu t(boolean z, boolean z2, arqr arqrVar) {
        return this.a.t(z, z2, arqrVar);
    }

    @Override // defpackage.arxm
    public final void v(CancellationException cancellationException) {
        this.a.v(cancellationException);
    }

    @Override // defpackage.arxm
    public final boolean x() {
        return this.a.x();
    }

    @Override // defpackage.arxm
    public final boolean y() {
        return this.a.y();
    }

    @Override // defpackage.arxm
    public final boolean z() {
        return this.a.z();
    }
}
