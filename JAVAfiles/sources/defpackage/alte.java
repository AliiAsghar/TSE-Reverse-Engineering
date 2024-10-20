package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alte implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public alte(alsj alsjVar) {
        alpl alplVar = (alpl) alsjVar;
        int size = alplVar.j().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (alsk alskVar : alplVar.j()) {
            this.a[i] = alskVar.a;
            this.b[i] = alskVar.a();
            i++;
        }
    }

    Object readResolve() {
        alpi alpiVar = new alpi(this.a.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i < objArr.length) {
                alpiVar.d(objArr[i], this.b[i]);
                i++;
            } else {
                return alpiVar.a();
            }
        }
    }
}
