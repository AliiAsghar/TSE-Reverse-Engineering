package defpackage;

import defpackage.cfq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bta implements dtm {
    private final long a;
    private final dqv b;
    private final int c;
    private final arqv d;
    private final bth e;
    private final bth f;
    private final bth g;
    private final bth h;
    private final bti i;
    private final bti j;
    private final bti k;
    private final bti l;
    private final bti m;

    public bta(long j, dqv dqvVar, int i, arqv arqvVar) {
        this.a = j;
        this.b = dqvVar;
        this.c = i;
        this.d = arqvVar;
        int eo = dqvVar.eo(dqz.a(j));
        int i2 = cfq.a;
        cfq.b bVar = cfq.a.m;
        this.e = new bsj(bVar, bVar, eo);
        cfq.b bVar2 = cfq.a.o;
        this.f = new bsj(bVar2, bVar2, eo);
        cfq cfqVar = cfo.a;
        this.g = new buc(cfo.c);
        this.h = new buc(cfo.d);
        int eo2 = dqvVar.eo(dqz.b(j));
        cfq.c cVar = cfq.a.j;
        cfq.c cVar2 = cfq.a.l;
        this.i = new bsk(cVar, cVar2, eo2);
        this.j = new bsk(cVar2, cVar, eo2);
        this.k = new bsk(cfq.a.k, cVar, eo2);
        this.l = new bud(cVar, i);
        this.m = new bud(cVar2, i);
    }

    @Override // defpackage.dtm
    public final long a(drg drgVar, long j, drk drkVar, long j2) {
        bth bthVar;
        int i;
        bti btiVar;
        bth[] bthVarArr = new bth[3];
        int i2 = 0;
        bthVarArr[0] = this.e;
        bthVarArr[1] = this.f;
        if (dre.a(drgVar.c()) < dri.b(j) / 2) {
            bthVar = this.g;
        } else {
            bthVar = this.h;
        }
        bthVarArr[2] = bthVar;
        List B = aqjn.B(bthVarArr);
        int size = B.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                i = ((bth) B.get(i3)).a(drgVar, j, dri.b(j2), drkVar);
                if (i3 == aqjn.z(B)) {
                    break;
                }
                if (i >= 0) {
                    if (dri.b(j2) + i <= dri.b(j)) {
                        break;
                    }
                }
                i3++;
            } else {
                i = 0;
                break;
            }
        }
        bti[] btiVarArr = new bti[4];
        btiVarArr[0] = this.i;
        btiVarArr[1] = this.j;
        btiVarArr[2] = this.k;
        if (dre.b(drgVar.c()) < dri.a(j) / 2) {
            btiVar = this.l;
        } else {
            btiVar = this.m;
        }
        btiVarArr[3] = btiVar;
        List B2 = aqjn.B(btiVarArr);
        int size2 = B2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            int a = ((bti) B2.get(i4)).a(drgVar, j, dri.a(j2));
            if (i4 != aqjn.z(B2)) {
                int i5 = this.c;
                if (a >= i5) {
                    if (dri.a(j2) + a <= dri.a(j) - i5) {
                    }
                }
            }
            i2 = a;
            break;
        }
        long a2 = drf.a(i, i2);
        this.d.a(drgVar, drh.a(a2, j2));
        return a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bta)) {
            return false;
        }
        bta btaVar = (bta) obj;
        if (a.bB(this.a, btaVar.a) && d.F(this.b, btaVar.b) && this.c == btaVar.c && d.F(this.d, btaVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((a.A(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) dqz.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
