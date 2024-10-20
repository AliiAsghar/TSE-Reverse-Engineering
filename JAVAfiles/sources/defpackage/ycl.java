package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycl {
    public final armf a;
    public volatile SparseArray b;
    private final armf c;

    public ycl(armf armfVar, armf armfVar2) {
        this.a = armfVar;
        this.c = armfVar2;
    }

    public final int[] a(int i) {
        Integer[] numArr;
        int[] H = ((yjy) this.c.b()).h(i).H();
        SparseArray sparseArray = this.b;
        if (sparseArray != null && ((yyt) this.a.b()).z() && (numArr = (Integer[]) sparseArray.get(i)) != null) {
            return new int[]{numArr[0].intValue(), numArr[1].intValue()};
        }
        return H;
    }
}
