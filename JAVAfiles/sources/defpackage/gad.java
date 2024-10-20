package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gad {
    public int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public gad(byte[] bArr) {
        this.d = new fqr();
        this.e = new euf(new byte[65025], 0);
        this.b = -1;
    }

    private final int c(int i) {
        int i2;
        int i3 = 0;
        this.a = 0;
        do {
            int i4 = this.a;
            int i5 = i + i4;
            fqr fqrVar = (fqr) this.d;
            if (i5 >= fqrVar.c) {
                break;
            }
            this.a = i4 + 1;
            i2 = fqrVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    public final List a() {
        if (!this.c) {
            return arnv.a;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = this.e;
        ?? r2 = this.d;
        gba c = ((pa) obj).c();
        if (!r2.isEmpty()) {
            ?? r1 = this.d;
            gbg gbgVar = gbg.a;
            arrayList.add(new gbg(gbb.REFRESH, aqjn.ax(r1), this.a, this.b, c));
        } else {
            arrayList.add(new gbh(c));
        }
        return arrayList;
    }

    public final boolean b(flv flvVar) {
        boolean z;
        dzg.d(true);
        if (this.c) {
            this.c = false;
            ((euf) this.e).F(0);
        }
        while (!this.c) {
            int i = this.b;
            if (i < 0) {
                if (!((fqr) this.d).c(flvVar) || !((fqr) this.d).b(flvVar, true)) {
                    return false;
                }
                fqr fqrVar = (fqr) this.d;
                int i2 = fqrVar.d;
                if ((fqrVar.a & 1) == 1 && ((euf) this.e).c == 0) {
                    i2 += c(0);
                    i = this.a;
                } else {
                    i = 0;
                }
                if (!eef.k(flvVar, i2)) {
                    return false;
                }
                this.b = i;
            }
            int c = c(i);
            int i3 = this.b + this.a;
            if (c > 0) {
                euf eufVar = (euf) this.e;
                eufVar.D(eufVar.c + c);
                euf eufVar2 = (euf) this.e;
                if (!eef.j(flvVar, eufVar2.a, eufVar2.c, c)) {
                    return false;
                }
                euf eufVar3 = (euf) this.e;
                eufVar3.I(eufVar3.c + c);
                if (((fqr) this.d).f[i3 - 1] != 255) {
                    z = true;
                } else {
                    z = false;
                }
                this.c = z;
            }
            if (i3 == ((fqr) this.d).c) {
                i3 = -1;
            }
            this.b = i3;
        }
        return true;
    }

    public gad() {
        this.d = new arnr();
        this.e = new pa((byte[]) null);
    }
}
