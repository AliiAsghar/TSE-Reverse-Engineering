package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hca implements hcb, hcj, hcr, hep {
    public final List a;
    private final Matrix b;
    private final Path c;
    private final RectF d;
    private final String e;
    private final boolean f;
    private final hbl g;
    private List h;
    private hdm i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hca(defpackage.hbl r8, defpackage.hfw r9, defpackage.hfr r10, defpackage.hbb r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.List r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            hfh r6 = (defpackage.hfh) r6
            hbz r6 = r6.a(r8, r11, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List r10 = r10.b
        L2b:
            int r11 = r10.size()
            if (r1 >= r11) goto L42
            java.lang.Object r11 = r10.get(r1)
            hfh r11 = (defpackage.hfh) r11
            boolean r0 = r11 instanceof defpackage.hfd
            if (r0 == 0) goto L3f
            hfd r11 = (defpackage.hfd) r11
            r6 = r11
            goto L44
        L3f:
            int r1 = r1 + 1
            goto L2b
        L42:
            r10 = 0
            r6 = r10
        L44:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hca.<init>(hbl, hfw, hfr, hbb):void");
    }

    @Override // defpackage.hep
    public final void a(Object obj, hig higVar) {
        hdm hdmVar = this.i;
        if (hdmVar != null) {
            hdmVar.e(obj, higVar);
        }
    }

    @Override // defpackage.hcb
    public final void b(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        if (!this.f) {
            this.b.set(matrix);
            hdm hdmVar = this.i;
            if (hdmVar != null) {
                this.b.preConcat(hdmVar.a());
                hcw hcwVar = this.i.e;
                if (hcwVar == null) {
                    intValue = 100;
                } else {
                    intValue = ((Integer) hcwVar.e()).intValue();
                }
                i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
            }
            int size = this.a.size();
            while (true) {
                size--;
                if (size >= 0) {
                    Object obj = this.a.get(size);
                    if (obj instanceof hcb) {
                        ((hcb) obj).b(canvas, this.b, i);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.b.set(matrix);
        hdm hdmVar = this.i;
        if (hdmVar != null) {
            this.b.preConcat(hdmVar.a());
        }
        this.d.set(brg.a, brg.a, brg.a, brg.a);
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                hbz hbzVar = (hbz) this.a.get(size);
                if (hbzVar instanceof hcb) {
                    ((hcb) hbzVar).c(this.d, this.b, z);
                    rectF.union(this.d);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.hcr
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.hep
    public final void e(heo heoVar, int i, List list, heo heoVar2) {
        if (heoVar.e(this.e, i) || "__container".equals(this.e)) {
            if (!"__container".equals(this.e)) {
                heoVar2 = heoVar2.b(this.e);
                if (heoVar.d(this.e, i)) {
                    list.add(heoVar2.c(this));
                }
            }
            if (heoVar.f(this.e, i)) {
                int a = i + heoVar.a(this.e, i);
                for (int i2 = 0; i2 < this.a.size(); i2++) {
                    hbz hbzVar = (hbz) this.a.get(i2);
                    if (hbzVar instanceof hep) {
                        ((hep) hbzVar).e(heoVar, a, list, heoVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.a.size());
        arrayList.addAll(list);
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                hbz hbzVar = (hbz) this.a.get(size);
                hbzVar.f(arrayList, this.a.subList(0, size));
                arrayList.add(hbzVar);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.hbz
    public final String g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Matrix h() {
        hdm hdmVar = this.i;
        if (hdmVar != null) {
            return hdmVar.a();
        }
        this.b.reset();
        return this.b;
    }

    @Override // defpackage.hcj
    public final Path i() {
        this.b.reset();
        hdm hdmVar = this.i;
        if (hdmVar != null) {
            this.b.set(hdmVar.a());
        }
        this.c.reset();
        if (!this.f) {
            int size = this.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                hbz hbzVar = (hbz) this.a.get(size);
                if (hbzVar instanceof hcj) {
                    this.c.addPath(((hcj) hbzVar).i(), this.b);
                }
            }
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.a.size(); i++) {
                hbz hbzVar = (hbz) this.a.get(i);
                if (hbzVar instanceof hcj) {
                    this.h.add((hcj) hbzVar);
                }
            }
        }
        return this.h;
    }

    public hca(hbl hblVar, hfw hfwVar, String str, boolean z, List list, hfd hfdVar) {
        new hbx();
        new RectF();
        this.b = new Matrix();
        this.c = new Path();
        this.d = new RectF();
        this.e = str;
        this.g = hblVar;
        this.f = z;
        this.a = list;
        if (hfdVar != null) {
            hdm hdmVar = new hdm(hfdVar);
            this.i = hdmVar;
            hdmVar.c(hfwVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            hbz hbzVar = (hbz) list.get(size);
            if (hbzVar instanceof hcg) {
                arrayList.add((hcg) hbzVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((hcg) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }
}
