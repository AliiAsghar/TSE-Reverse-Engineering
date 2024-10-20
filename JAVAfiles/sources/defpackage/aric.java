package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aric implements aryk<aqsm> {
    public static final akty a = new akty();
    private final aqsm b;

    public aric(aqsm aqsmVar) {
        this.b = aqsmVar;
    }

    @Override // defpackage.aryk
    public final /* bridge */ /* synthetic */ Object a(arpi arpiVar) {
        arpiVar.getClass();
        aqsm a2 = this.b.a();
        a2.getClass();
        return a2;
    }

    @Override // defpackage.aryk
    public final /* bridge */ /* synthetic */ void b(arpi arpiVar, Object obj) {
        aqsm aqsmVar = (aqsm) obj;
        arpiVar.getClass();
        aqsmVar.getClass();
        this.b.f(aqsmVar);
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) arhi.k(this, r, arqvVar);
    }

    @Override // defpackage.arpg, defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        return (E) arhi.l(this, arphVar);
    }

    @Override // defpackage.arpg
    public final arph<aric> getKey() {
        return a;
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        return arhi.m(this, arphVar);
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        return arhi.n(this, arpiVar);
    }
}
