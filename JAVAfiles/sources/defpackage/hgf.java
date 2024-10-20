package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.android.vcard.VCardBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgf extends hfw {
    private hcw A;
    private hcw B;
    private hcw C;
    private hcw D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final uj p;
    private final List q;
    private final hdl r;
    private final hbl s;
    private final hbb t;
    private hcw u;
    private hcw v;
    private hcw w;
    private hcw x;
    private hcw y;
    private hcw z;

    public hgf(hbl hblVar, hfz hfzVar) {
        super(hblVar, hfzVar);
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new hgd(null);
        this.n = new hgd();
        this.o = new HashMap();
        this.p = new uj();
        this.q = new ArrayList();
        this.s = hblVar;
        this.t = hfzVar.b;
        hdl a = hfzVar.p.a();
        this.r = a;
        a.h(this);
        i(a);
        gpx gpxVar = hfzVar.x;
        if (gpxVar != null && (obj4 = gpxVar.b) != null) {
            hcw a2 = ((het) obj4).a();
            this.u = a2;
            a2.h(this);
            i(this.u);
        }
        if (gpxVar != null && (obj3 = gpxVar.a) != null) {
            hcw a3 = ((het) obj3).a();
            this.w = a3;
            a3.h(this);
            i(this.w);
        }
        if (gpxVar != null && (obj2 = gpxVar.d) != null) {
            hcw a4 = ((heu) obj2).a();
            this.y = a4;
            a4.h(this);
            i(this.y);
        }
        if (gpxVar != null && (obj = gpxVar.c) != null) {
            hcw a5 = ((heu) obj).a();
            this.A = a5;
            a5.h(this);
            i(this.A);
        }
    }

    private final hge s(int i) {
        for (int size = this.q.size(); size < i; size++) {
            this.q.add(new hge());
        }
        return (hge) this.q.get(i - 1);
    }

    private static final void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == brg.a) {
                return;
            }
            canvas.drawText(str, 0, str.length(), brg.a, brg.a, paint);
        }
    }

    private static final void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == brg.a) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private static final List v(String str) {
        return Arrays.asList(str.replaceAll(VCardBuilder.VCARD_END_OF_LINE, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private static final void w(Canvas canvas, hem hemVar, int i, float f) {
        float f2;
        float f3;
        PointF pointF = hemVar.k;
        PointF pointF2 = hemVar.l;
        float a = hid.a();
        float f4 = brg.a;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (hemVar.e * a) + pointF.y;
        }
        float f5 = i * hemVar.e * a;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = hemVar.m;
        int i3 = i2 - 1;
        if (i2 != 0) {
            float f6 = f5 + f2;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        return;
                    }
                    canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f6);
                    return;
                }
                canvas.translate((f3 + f4) - f, f6);
                return;
            }
            canvas.translate(f3, f6);
            return;
        }
        throw null;
    }

    private final List x(String str, float f, ibp ibpVar, float f2, float f3, boolean z) {
        int i;
        float measureText;
        int i2 = 0;
        float f4 = brg.a;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        float f5 = brg.a;
        int i5 = 0;
        float f6 = brg.a;
        while (i2 < str.length()) {
            int i6 = i2 + 1;
            char charAt = str.charAt(i2);
            if (z) {
                hen henVar = (hen) vn.a(this.t.e, hen.a(charAt, (String) ibpVar.b, (String) ibpVar.c));
                if (henVar != null) {
                    measureText = (((float) henVar.b) * f2 * hid.a()) + f3;
                    i = i2;
                } else {
                    i2 = i6;
                }
            } else {
                i = i2;
                measureText = this.m.measureText(str.substring(i, i6)) + f3;
            }
            if (charAt == ' ') {
                z2 = true;
                f6 = measureText;
            } else {
                if (z2) {
                    f5 = measureText;
                    i5 = i;
                } else {
                    f5 += measureText;
                }
                z2 = false;
            }
            f4 += measureText;
            if (f > brg.a && f4 >= f && charAt != ' ') {
                i3++;
                hge s = s(i3);
                if (i5 == i4) {
                    s.a(str.substring(i4, i).trim(), (f4 - measureText) - ((r10.length() - r8.length()) * f6));
                    f4 = measureText;
                    f5 = f4;
                    i4 = i;
                    i5 = i4;
                } else {
                    s.a(str.substring(i4, i5 - 1).trim(), ((f4 - f5) - ((r3.length() - r4.length()) * f6)) - f6);
                    f4 = f5;
                    i4 = i5;
                }
            }
            i2 = i6;
        }
        if (f4 > brg.a) {
            i3++;
            s(i3).a(str.substring(i4), f4);
        }
        return this.q.subList(0, i3);
    }

    @Override // defpackage.hfw, defpackage.hep
    public final void a(Object obj, hig higVar) {
        super.a(obj, higVar);
        if (obj == hbq.a) {
            hcw hcwVar = this.v;
            if (hcwVar != null) {
                k(hcwVar);
            }
            if (higVar == null) {
                this.v = null;
                return;
            }
            hdn hdnVar = new hdn(higVar);
            this.v = hdnVar;
            hdnVar.h(this);
            i(this.v);
            return;
        }
        if (obj == hbq.b) {
            hcw hcwVar2 = this.x;
            if (hcwVar2 != null) {
                k(hcwVar2);
            }
            if (higVar == null) {
                this.x = null;
                return;
            }
            hdn hdnVar2 = new hdn(higVar);
            this.x = hdnVar2;
            hdnVar2.h(this);
            i(this.x);
            return;
        }
        if (obj == hbq.s) {
            hcw hcwVar3 = this.z;
            if (hcwVar3 != null) {
                k(hcwVar3);
            }
            if (higVar == null) {
                this.z = null;
                return;
            }
            hdn hdnVar3 = new hdn(higVar);
            this.z = hdnVar3;
            hdnVar3.h(this);
            i(this.z);
            return;
        }
        if (obj == hbq.t) {
            hcw hcwVar4 = this.B;
            if (hcwVar4 != null) {
                k(hcwVar4);
            }
            if (higVar == null) {
                this.B = null;
                return;
            }
            hdn hdnVar4 = new hdn(higVar);
            this.B = hdnVar4;
            hdnVar4.h(this);
            i(this.B);
            return;
        }
        if (obj == hbq.F) {
            hcw hcwVar5 = this.C;
            if (hcwVar5 != null) {
                k(hcwVar5);
            }
            if (higVar == null) {
                this.C = null;
                return;
            }
            hdn hdnVar5 = new hdn(higVar);
            this.C = hdnVar5;
            hdnVar5.h(this);
            i(this.C);
            return;
        }
        if (obj == hbq.M) {
            hcw hcwVar6 = this.D;
            if (hcwVar6 != null) {
                k(hcwVar6);
            }
            if (higVar == null) {
                this.D = null;
                return;
            }
            hdn hdnVar6 = new hdn(higVar);
            this.D = hdnVar6;
            hdnVar6.h(this);
            i(this.D);
            return;
        }
        if (obj == hbq.O) {
            this.r.d = new hdk(new hif(), higVar, new hem());
        }
    }

    @Override // defpackage.hfw, defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(brg.a, brg.a, this.t.h.width(), this.t.h.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0377  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.hfw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r24, android.graphics.Matrix r25, int r26) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgf.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
