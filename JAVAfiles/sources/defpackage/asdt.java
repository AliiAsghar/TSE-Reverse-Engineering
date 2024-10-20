package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asdt implements arpi {
    public final Throwable a;
    private final /* synthetic */ arpi b;

    public asdt(Throwable th, arpi arpiVar) {
        this.b = arpiVar;
        this.a = th;
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) this.b.fold(r, arqvVar);
    }

    @Override // defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        return (E) this.b.get(arphVar);
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        return this.b.minusKey(arphVar);
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        return this.b.plus(arpiVar);
    }
}
