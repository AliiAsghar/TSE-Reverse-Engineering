package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.Layout$TextInclusionStrategy;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhu implements die {
    public final dpg a;
    public final djx b;
    public final CharSequence c;
    public final List d;
    private final int e;
    private final int f;
    private final long g;

    /* compiled from: PG */
    /* renamed from: dhu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<RectF, RectF, Boolean> {
        final /* synthetic */ div a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(div divVar) {
            super(2);
            this.a = divVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Boolean.valueOf(this.a.a(clv.e((RectF) obj), clv.e((RectF) obj2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030d  */
    /* JADX WARN: Type inference failed for: r0v56, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r28v0, types: [dhu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dhu(defpackage.dpg r29, int r30, int r31, long r32) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhu.<init>(dpg, int, int, long):void");
    }

    static /* synthetic */ djx l(dhu dhuVar, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return dhuVar.o(i, i2, truncateAt, i3, i4, i5, i6, i7, dhuVar.c);
    }

    private final djx o(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        dpg dpgVar = this.a;
        return new djx(charSequence, f(), i(), i, truncateAt, dpgVar.g, dpf.a(dpgVar.a), i3, i5, i6, i7, i4, i2, dpgVar.e);
    }

    private final void p(ckr ckrVar) {
        Canvas a = cjx.a(ckrVar);
        if (k()) {
            a.save();
            a.clipRect(brg.a, brg.a, f(), b());
        }
        djx djxVar = this.b;
        if (a.getClipBounds(djxVar.j)) {
            int i = djxVar.g;
            if (i != 0) {
                a.translate(brg.a, i);
            }
            djw djwVar = djz.a;
            djwVar.a = a;
            djxVar.e.draw(djwVar);
            int i2 = djxVar.g;
            if (i2 != 0) {
                a.translate(brg.a, -i2);
            }
        }
        if (k()) {
            a.restore();
        }
    }

    @Override // defpackage.die
    public final float a() {
        return e(0);
    }

    @Override // defpackage.die
    public final float b() {
        return this.b.g();
    }

    @Override // defpackage.die
    public final float c(int i, boolean z) {
        float e;
        if (z) {
            e = this.b.e(i, false);
            return e;
        }
        return this.b.f(i, false);
    }

    @Override // defpackage.die
    public final float d() {
        return e(g() - 1);
    }

    public final float e(int i) {
        return this.b.b(i);
    }

    @Override // defpackage.die
    public final float f() {
        return dqs.b(this.g);
    }

    @Override // defpackage.die
    public final int g() {
        return this.b.f;
    }

    @Override // defpackage.die
    public final long h(cjp cjpVar, int i, div divVar) {
        dhu dhuVar;
        boolean z;
        dkf dkeVar;
        int i2;
        int i3;
        char c;
        char c2;
        int[] iArr;
        SegmentFinder graphemeClusterSegmentFinder;
        RectF c3 = clv.c(cjpVar);
        if (a.bA(i, 0) || !a.bA(i, 1)) {
            dhuVar = this;
            z = false;
        } else {
            dhuVar = this;
            z = true;
        }
        djx djxVar = dhuVar.b;
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(divVar);
        if (Build.VERSION.SDK_INT >= 34) {
            if (z) {
                graphemeClusterSegmentFinder = new dkb(new dkh(djxVar.q(), djxVar.p()));
            } else {
                graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(djxVar.q(), djxVar.a);
            }
            iArr = djxVar.e.getRangeForRect(c3, graphemeClusterSegmentFinder, new Layout$TextInclusionStrategy() { // from class: djj
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) arqv.this.a(rectF, rectF2)).booleanValue();
                }
            });
            c2 = 0;
            c = 1;
        } else {
            Layout layout = djxVar.e;
            djo o = djxVar.o();
            if (z) {
                dkeVar = new dkh(djxVar.q(), djxVar.p());
            } else {
                CharSequence q = djxVar.q();
                TextPaint textPaint = djxVar.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    dkeVar = new dkd(q, textPaint);
                } else {
                    dkeVar = new dke(q);
                }
            }
            int lineForVertical = layout.getLineForVertical((int) c3.top);
            if (c3.top <= djxVar.c(lineForVertical) || (lineForVertical = lineForVertical + 1) < djxVar.f) {
                int i4 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) c3.bottom);
                if (lineForVertical2 == 0) {
                    if (c3.bottom >= djxVar.d(0)) {
                        i2 = 0;
                    }
                } else {
                    i2 = lineForVertical2;
                }
                int i5 = i2;
                dkf dkfVar = dkeVar;
                int a = djy.a(djxVar, layout, o, i4, c3, dkeVar, anonymousClass1, true);
                while (true) {
                    i3 = i4;
                    if (a != -1 || i3 >= i5) {
                        break;
                    }
                    i4 = i3 + 1;
                    a = djy.a(djxVar, layout, o, i4, c3, dkfVar, anonymousClass1, true);
                }
                if (a == -1) {
                    c = 1;
                    iArr = null;
                } else {
                    int i6 = i3;
                    int i7 = a;
                    int a2 = djy.a(djxVar, layout, o, i5, c3, dkfVar, anonymousClass1, false);
                    int i8 = i5;
                    while (a2 == -1) {
                        int i9 = i6;
                        if (i9 >= i8) {
                            break;
                        }
                        int i10 = i8 - 1;
                        a2 = djy.a(djxVar, layout, o, i10, c3, dkfVar, anonymousClass1, false);
                        i6 = i9;
                        i8 = i10;
                    }
                    if (a2 == -1) {
                        iArr = null;
                        c = 1;
                    } else {
                        c = 1;
                        c2 = 0;
                        iArr = new int[]{dkfVar.f(i7 + 1), dkfVar.b(a2 - 1)};
                    }
                }
                c2 = 0;
            }
            c2 = 0;
            c = 1;
            iArr = null;
        }
        if (iArr == null) {
            return djc.a;
        }
        long a3 = djd.a(iArr[c2], iArr[c]);
        long j = djc.a;
        return a3;
    }

    public final dpi i() {
        return this.a.c;
    }

    @Override // defpackage.die
    public final dqh j(int i) {
        if (this.b.r(i)) {
            return dqh.b;
        }
        return dqh.a;
    }

    @Override // defpackage.die
    public final boolean k() {
        return this.b.d;
    }

    @Override // defpackage.die
    public final void m(ckr ckrVar, long j, cma cmaVar, dqj dqjVar, cnz cnzVar) {
        int i = i().a;
        dpi i2 = i();
        i2.c(j);
        i2.e(cmaVar);
        i2.f(dqjVar);
        i2.d(cnzVar);
        i2.a(3);
        p(ckrVar);
        i().a(i);
    }

    @Override // defpackage.die
    public final void n(ckr ckrVar, cko ckoVar, float f, cma cmaVar, dqj dqjVar, cnz cnzVar) {
        int i = i().a;
        dpi i2 = i();
        float f2 = f();
        float b = b();
        i2.b(ckoVar, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), f);
        i2.e(cmaVar);
        i2.f(dqjVar);
        i2.d(cnzVar);
        i2.a(3);
        p(ckrVar);
        i().a(i);
    }
}
