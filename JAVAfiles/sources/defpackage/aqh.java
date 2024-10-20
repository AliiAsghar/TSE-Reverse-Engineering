package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqh {
    public final int a;
    public final aqf[] b;
    public final int c;
    public final int d;
    private final aqo e;
    private final List f;
    private final int g;

    public aqh(int i, aqf[] aqfVarArr, aqo aqoVar, List list, int i2) {
        this.a = i;
        this.b = aqfVarArr;
        this.e = aqoVar;
        this.f = list;
        this.g = i2;
        int i3 = 0;
        for (aqf aqfVar : aqfVarArr) {
            i3 = Math.max(i3, aqfVar.e);
        }
        this.c = i3;
        this.d = arrn.r(i3 + this.g, 0);
    }

    public final aqf[] a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            aqf[] aqfVarArr = this.b;
            if (i4 < aqfVarArr.length) {
                aqf aqfVar = aqfVarArr[i4];
                long j = ((apc) this.f.get(i5)).a;
                aqfVar.r(i, this.e.b[i6], i2, i3, this.a, i6);
                i6++;
                i4++;
                i5++;
            } else {
                return aqfVarArr;
            }
        }
    }
}
