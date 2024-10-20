package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akrr {
    public final int[] a;
    public final akrp b;
    public akrp c;
    public int d;
    public int e;
    public int f;

    public akrr(int[] iArr) {
        this.a = iArr;
        akrp akrpVar = new akrp(-1, -1);
        this.b = akrpVar;
        this.c = akrpVar;
    }

    private final void d(akrp akrpVar, StringBuilder sb) {
        for (akrp akrpVar2 : akrpVar.d.values()) {
            sb.append("  ");
            sb.append(akrpVar);
            sb.append(" -> ");
            sb.append(akrpVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, akrpVar2.a, Math.min(iArr.length, akrpVar2.b + 1))));
            sb.append("\"]\n");
            d(akrpVar2, sb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        akrp akrpVar = this.c.c;
        if (akrpVar != null) {
            this.c = akrpVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.e != 0) {
            akrp akrpVar = (akrp) this.c.d.get(Integer.valueOf(this.a[this.d]));
            while (true) {
                int i = (akrpVar.b - akrpVar.a) + 1;
                int i2 = this.e;
                if (i <= i2) {
                    int i3 = this.d + i;
                    this.d = i3;
                    this.c = akrpVar;
                    int i4 = i2 - i;
                    this.e = i4;
                    if (i4 > 0) {
                        akrpVar = (akrp) akrpVar.d.get(Integer.valueOf(this.a[i3]));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int min = Math.min(this.a.length, i2);
            if (min - i == Math.min(this.a.length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    int[] iArr = this.a;
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
