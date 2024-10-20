package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajfj {
    public final ajfi a;
    public final List b;
    public final List c;
    public final float d;
    public final float e;
    private final float[] f;
    private final float[] g;

    public ajfj(ajfi ajfiVar, List list, List list2) {
        this.a = ajfiVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        float f = ((ajfi) list.get(list.size() - 1)).b().a - ajfiVar.b().a;
        this.d = f;
        float f2 = ajfiVar.d().a - ((ajfi) list2.get(list2.size() - 1)).d().a;
        this.e = f2;
        this.f = g(f, list, true);
        this.g = g(f2, list2, false);
    }

    public static ajfi d(ajfi ajfiVar, int i, int i2, float f, int i3, int i4, float f2) {
        boolean z;
        ArrayList arrayList = new ArrayList(ajfiVar.c);
        arrayList.add(i2, (ajfh) arrayList.remove(i));
        ajfg ajfgVar = new ajfg(ajfiVar.a, f2);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ajfh ajfhVar = (ajfh) arrayList.get(i5);
            float f3 = ajfhVar.d;
            float f4 = f + (f3 / 2.0f);
            if (i5 >= i3 && i5 <= i4) {
                z = true;
            } else {
                z = false;
            }
            ajfgVar.g(f4, ajfhVar.c, f3, z, ajfhVar.e, ajfhVar.f);
            f += ajfhVar.d;
        }
        return ajfgVar.b();
    }

    public static ajfi e(ajfi ajfiVar, float f, float f2) {
        return d(ajfiVar, 0, 0, f, ajfiVar.d, ajfiVar.e, f2);
    }

    public static ajfi f(ajfi ajfiVar, float f, float f2, boolean z, float f3) {
        float f4;
        boolean z2;
        float f5;
        float f6;
        int i;
        boolean z3;
        ArrayList arrayList = new ArrayList(ajfiVar.c);
        ajfg ajfgVar = new ajfg(ajfiVar.a, f2);
        Iterator it = ajfiVar.c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((ajfh) it.next()).e) {
                i2++;
            }
        }
        float size = f / (ajfiVar.c.size() - i2);
        boolean z4 = true;
        if (true != z) {
            f4 = 0.0f;
        } else {
            f4 = f;
        }
        float f7 = f4;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            ajfh ajfhVar = (ajfh) arrayList.get(i3);
            if (ajfhVar.e) {
                ajfgVar.g(ajfhVar.b, ajfhVar.c, ajfhVar.d, false, true, ajfhVar.f);
                i = i3;
                z3 = z4;
            } else {
                if (i3 >= ajfiVar.d && i3 <= ajfiVar.e) {
                    z2 = z4;
                } else {
                    z2 = false;
                }
                float f8 = ajfhVar.d - size;
                float a = ajff.a(f8, ajfiVar.a, f3);
                float f9 = f7 + (f8 / 2.0f);
                float abs = Math.abs(f9 - ajfhVar.b);
                float f10 = ajfhVar.f;
                if (z4 != z) {
                    f5 = 0.0f;
                } else {
                    f5 = abs;
                }
                if (z4 == z) {
                    f6 = 0.0f;
                } else {
                    f6 = abs;
                }
                i = i3;
                float f11 = f5;
                z3 = z4;
                ajfgVar.d(f9, a, f8, z2, false, f10, f11, f6);
                f7 += f8;
            }
            i3 = i + 1;
            z4 = z3;
        }
        return ajfgVar.b();
    }

    private static float[] g(float f, List list, boolean z) {
        float f2;
        float f3;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i = 1; i < size; i++) {
            int i2 = i - 1;
            ajfi ajfiVar = (ajfi) list.get(i2);
            ajfi ajfiVar2 = (ajfi) list.get(i);
            if (z) {
                f2 = ajfiVar2.b().a - ajfiVar.b().a;
            } else {
                f2 = ajfiVar.d().a - ajfiVar2.d().a;
            }
            float f4 = f2 / f;
            if (i == size - 1) {
                f3 = 1.0f;
            } else {
                f3 = fArr[i2] + f4;
            }
            fArr[i] = f3;
        }
        return fArr;
    }

    public final ajfi a() {
        return (ajfi) this.c.get(this.c.size() - 1);
    }

    public final ajfi b(float f, float f2, float f3) {
        float a;
        List list;
        float[] fArr;
        float[] fArr2;
        float f4 = c().a().g;
        float f5 = a().a().h;
        float f6 = this.d;
        float f7 = f6 + f2;
        if (f6 == f4) {
            f7 += f4;
        }
        float f8 = this.e;
        float f9 = f3 - f8;
        if (f8 == f5) {
            f9 -= f5;
        }
        if (f < f7) {
            a = ajdd.a(1.0f, brg.a, f2, f7, f);
            list = this.b;
            fArr = this.f;
        } else if (f > f9) {
            a = ajdd.a(brg.a, 1.0f, f9, f3, f);
            list = this.c;
            fArr = this.g;
        } else {
            return this.a;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i < size) {
                float f11 = fArr[i];
                if (a <= f11) {
                    fArr2 = new float[]{ajdd.a(brg.a, 1.0f, f10, f11, a), i - 1, i};
                    break;
                }
                i++;
                f10 = f11;
            } else {
                fArr2 = new float[]{brg.a, brg.a, brg.a};
                break;
            }
        }
        ajfi ajfiVar = (ajfi) list.get((int) fArr2[1]);
        ajfi ajfiVar2 = (ajfi) list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        if (ajfiVar.a == ajfiVar2.a) {
            List list2 = ajfiVar.c;
            List list3 = ajfiVar2.c;
            if (list2.size() == list3.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < ajfiVar.c.size(); i2++) {
                    ajfh ajfhVar = (ajfh) list2.get(i2);
                    ajfh ajfhVar2 = (ajfh) list3.get(i2);
                    float f13 = ajfhVar.a;
                    float f14 = ((ajfhVar2.a - f13) * f12) + f13;
                    float f15 = ajfhVar.b;
                    float f16 = ((ajfhVar2.b - f15) * f12) + f15;
                    float f17 = ajfhVar.c;
                    float f18 = ((ajfhVar2.c - f17) * f12) + f17;
                    float f19 = ajfhVar.d;
                    arrayList.add(new ajfh(f14, f16, f18, f19 + ((ajfhVar2.d - f19) * f12), false, brg.a, brg.a, brg.a));
                }
                return new ajfi(ajfiVar.a, arrayList, ajdd.b(ajfiVar.d, ajfiVar2.d, f12), ajdd.b(ajfiVar.e, ajfiVar2.e, f12));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    public final ajfi c() {
        return (ajfi) this.b.get(this.b.size() - 1);
    }
}
