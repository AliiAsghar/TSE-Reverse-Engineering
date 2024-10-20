package defpackage;

import defpackage.aqq;
import defpackage.ara;
import defpackage.dqs;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aqi {
    private final aqo a;
    private final int b;
    private final int c;
    private final aqg d;
    private final aqq e;

    public aqi(aqo aqoVar, int i, int i2, aqg aqgVar, aqq aqqVar) {
        this.a = aqoVar;
        this.b = i;
        this.c = i2;
        this.d = aqgVar;
        this.e = aqqVar;
    }

    public abstract aqh a(int i, aqf[] aqfVarArr, List list, int i2);

    public final int b(int i) {
        aqq aqqVar = this.e;
        int i2 = aqqVar.h;
        atb atbVar = aqqVar.a.b;
        aqq.b bVar = aqq.b.a;
        ara.a a = atbVar.a(i);
        ((aph) a.c).a.a(bVar, Integer.valueOf(i - a.a));
        return 1;
    }

    public final long c(int i, int i2) {
        return dqs.a.d(arrn.r(this.a.a[i], 0));
    }

    public final aqh d(int i) {
        int i2;
        aqq.c c = this.e.c(i);
        int size = c.b.size();
        if (size != 0) {
            if (c.a + size == this.b) {
                i2 = 0;
            } else {
                i2 = this.c;
            }
        } else {
            size = 0;
            i2 = 0;
        }
        aqf[] aqfVarArr = new aqf[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long j = ((apc) c.b.get(i4)).a;
            aqf c2 = this.d.c(c.a + i4, c(i3, 1), i3, 1, i2);
            i3++;
            aqfVarArr[i4] = c2;
        }
        return a(i, aqfVarArr, c.b, i2);
    }
}
