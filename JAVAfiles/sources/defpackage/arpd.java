package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpd implements Serializable, arpi {
    private final arpi a;
    private final arpg b;

    public arpd(arpi arpiVar, arpg arpgVar) {
        arpiVar.getClass();
        this.a = arpiVar;
        this.b = arpgVar;
    }

    private final int a() {
        int i = 2;
        arpd arpdVar = this;
        while (true) {
            arpi arpiVar = arpdVar.a;
            if (arpiVar instanceof arpd) {
                arpdVar = (arpd) arpiVar;
            } else {
                arpdVar = null;
            }
            if (arpdVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(arpg arpgVar) {
        return d.F(get(arpgVar.getKey()), arpgVar);
    }

    private final Object writeReplace() {
        int a = a();
        arpi[] arpiVarArr = new arpi[a];
        arrz arrzVar = new arrz();
        fold(arnb.a, new aezg(arpiVarArr, arrzVar, 20, null));
        if (arrzVar.a == a) {
            return new arpc(arpiVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof arpd) {
            arpd arpdVar = (arpd) obj;
            if (arpdVar.a() == a()) {
                arpd arpdVar2 = this;
                while (true) {
                    if (!arpdVar.b(arpdVar2.b)) {
                        break;
                    }
                    arpi arpiVar = arpdVar2.a;
                    if (arpiVar instanceof arpd) {
                        arpdVar2 = (arpd) arpiVar;
                    } else if (arpdVar.b((arpg) arpiVar)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.arpi
    public final <R> R fold(R r, arqv<? super R, ? super arpg, ? extends R> arqvVar) {
        return (R) arqvVar.a(this.a.fold(r, arqvVar), this.b);
    }

    @Override // defpackage.arpi
    public final <E extends arpg> E get(arph<E> arphVar) {
        arphVar.getClass();
        arpd arpdVar = this;
        while (true) {
            E e = (E) arpdVar.b.get(arphVar);
            if (e != null) {
                return e;
            }
            arpi arpiVar = arpdVar.a;
            if (arpiVar instanceof arpd) {
                arpdVar = (arpd) arpiVar;
            } else {
                return (E) arpiVar.get(arphVar);
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.arpi
    public final arpi minusKey(arph<?> arphVar) {
        arphVar.getClass();
        if (this.b.get(arphVar) != null) {
            return this.a;
        }
        arpi minusKey = this.a.minusKey(arphVar);
        if (minusKey != this.a) {
            if (minusKey == arpj.a) {
                return this.b;
            }
            return new arpd(minusKey, this.b);
        }
        return this;
    }

    @Override // defpackage.arpi
    public final arpi plus(arpi arpiVar) {
        return arrj.p(this, arpiVar);
    }

    public final String toString() {
        return "[" + fold("", afup.o) + "]";
    }
}
