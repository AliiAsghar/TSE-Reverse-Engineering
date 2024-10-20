package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpj implements Serializable, arpi {
    public static final arpj a = new arpj();
    private static final long serialVersionUID = 0;

    private arpj() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        arphVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        arphVar.getClass();
        return this;
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        arpiVar.getClass();
        return arpiVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return r;
    }
}
