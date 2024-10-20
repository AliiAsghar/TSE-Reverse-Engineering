package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arpc implements Serializable {
    private static final long serialVersionUID = 0;
    private final arpi[] a;

    public arpc(arpi[] arpiVarArr) {
        this.a = arpiVarArr;
    }

    private final Object readResolve() {
        arpi arpiVar = arpj.a;
        int i = 0;
        while (true) {
            arpi[] arpiVarArr = this.a;
            if (i < arpiVarArr.length) {
                arpiVar = arpiVar.plus(arpiVarArr[i]);
                i++;
            } else {
                return arpiVar;
            }
        }
    }
}
