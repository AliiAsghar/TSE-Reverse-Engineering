package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arpa implements arpg {
    private final arph<?> key;

    public arpa(arph<?> arphVar) {
        arphVar.getClass();
        this.key = arphVar;
    }

    @Override // defpackage.arpi
    public <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) arhi.k(this, r, arqvVar);
    }

    @Override // defpackage.arpg, defpackage.arpi
    public <E extends arpg> E get(arph<E> arphVar) {
        return (E) arhi.l(this, arphVar);
    }

    @Override // defpackage.arpg
    public arph<?> getKey() {
        return this.key;
    }

    @Override // defpackage.arpi
    public arpi minusKey(arph<?> arphVar) {
        return arhi.m(this, arphVar);
    }

    @Override // defpackage.arpi
    public arpi plus(arpi arpiVar) {
        return arhi.n(this, arpiVar);
    }
}
