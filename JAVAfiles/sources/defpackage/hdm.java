package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdm {
    public hcw a;
    public hcw b;
    public hcw c;
    public hcw d;
    public hcw e;
    public hda f;
    public hda g;
    public hcw h;
    public hcw i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public hdm(hfd hfdVar) {
        hcw a;
        hcw a2;
        hcw a3;
        hcw a4;
        hcw a5;
        hcw a6;
        hex hexVar = hfdVar.a;
        if (hexVar == null) {
            a = null;
        } else {
            a = hexVar.a();
        }
        this.a = a;
        hfe hfeVar = hfdVar.b;
        if (hfeVar == null) {
            a2 = null;
        } else {
            a2 = hfeVar.a();
        }
        this.b = a2;
        hez hezVar = hfdVar.c;
        if (hezVar == null) {
            a3 = null;
        } else {
            a3 = hezVar.a();
        }
        this.c = a3;
        heu heuVar = hfdVar.d;
        if (heuVar == null) {
            a4 = null;
        } else {
            a4 = heuVar.a();
        }
        this.d = a4;
        heu heuVar2 = hfdVar.f;
        if (heuVar2 == null) {
            a5 = null;
        } else {
            a5 = heuVar2.a();
        }
        hda hdaVar = (hda) a5;
        this.f = hdaVar;
        if (hdaVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        heu heuVar3 = hfdVar.g;
        if (heuVar3 == null) {
            a6 = null;
        } else {
            a6 = heuVar3.a();
        }
        this.g = (hda) a6;
        hew hewVar = hfdVar.e;
        if (hewVar != null) {
            this.e = hewVar.a();
        }
        heu heuVar4 = hfdVar.h;
        if (heuVar4 != null) {
            this.h = heuVar4.a();
        } else {
            this.h = null;
        }
        heu heuVar5 = hfdVar.i;
        if (heuVar5 != null) {
            this.i = heuVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        PointF pointF;
        float cos;
        float sin;
        float k;
        PointF pointF2;
        this.j.reset();
        hcw hcwVar = this.b;
        if (hcwVar != null && (pointF2 = (PointF) hcwVar.e()) != null && (pointF2.x != brg.a || pointF2.y != brg.a)) {
            this.j.preTranslate(pointF2.x, pointF2.y);
        }
        hcw hcwVar2 = this.d;
        if (hcwVar2 != null) {
            if (hcwVar2 instanceof hdn) {
                k = ((Float) hcwVar2.e()).floatValue();
            } else {
                k = ((hda) hcwVar2).k();
            }
            if (k != brg.a) {
                this.j.preRotate(k);
            }
        }
        if (this.f != null) {
            if (this.g == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r3.k()) + 90.0f));
            }
            if (this.g == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r5.k()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r0.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.k.setValues(fArr);
            f();
            float[] fArr2 = this.n;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.l.setValues(fArr2);
            f();
            float[] fArr3 = this.n;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.m.setValues(fArr3);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        hcw hcwVar3 = this.c;
        if (hcwVar3 != null) {
            hih hihVar = (hih) hcwVar3.e();
            float f2 = hihVar.a;
            if (f2 != 1.0f || hihVar.b != 1.0f) {
                this.j.preScale(f2, hihVar.b);
            }
        }
        hcw hcwVar4 = this.a;
        if (hcwVar4 != null && (((pointF = (PointF) hcwVar4.e()) != null && pointF.x != brg.a) || pointF.y != brg.a)) {
            this.j.preTranslate(-pointF.x, -pointF.y);
        }
        return this.j;
    }

    public final Matrix b(float f) {
        PointF pointF;
        hih hihVar;
        float f2;
        hcw hcwVar = this.b;
        PointF pointF2 = null;
        if (hcwVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) hcwVar.e();
        }
        hcw hcwVar2 = this.c;
        if (hcwVar2 == null) {
            hihVar = null;
        } else {
            hihVar = (hih) hcwVar2.e();
        }
        this.j.reset();
        if (pointF != null) {
            this.j.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (hihVar != null) {
            double d = f;
            this.j.preScale((float) Math.pow(hihVar.a, d), (float) Math.pow(hihVar.b, d));
        }
        hcw hcwVar3 = this.d;
        if (hcwVar3 != null) {
            float floatValue = ((Float) hcwVar3.e()).floatValue();
            hcw hcwVar4 = this.a;
            if (hcwVar4 != null) {
                pointF2 = (PointF) hcwVar4.e();
            }
            Matrix matrix = this.j;
            float f3 = floatValue * f;
            float f4 = brg.a;
            if (pointF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.j;
    }

    public final void c(hfw hfwVar) {
        hfwVar.i(this.e);
        hfwVar.i(this.h);
        hfwVar.i(this.i);
        hfwVar.i(this.a);
        hfwVar.i(this.b);
        hfwVar.i(this.c);
        hfwVar.i(this.d);
        hfwVar.i(this.f);
        hfwVar.i(this.g);
    }

    public final void d(hcr hcrVar) {
        hcw hcwVar = this.e;
        if (hcwVar != null) {
            hcwVar.h(hcrVar);
        }
        hcw hcwVar2 = this.h;
        if (hcwVar2 != null) {
            hcwVar2.h(hcrVar);
        }
        hcw hcwVar3 = this.i;
        if (hcwVar3 != null) {
            hcwVar3.h(hcrVar);
        }
        hcw hcwVar4 = this.a;
        if (hcwVar4 != null) {
            hcwVar4.h(hcrVar);
        }
        hcw hcwVar5 = this.b;
        if (hcwVar5 != null) {
            hcwVar5.h(hcrVar);
        }
        hcw hcwVar6 = this.c;
        if (hcwVar6 != null) {
            hcwVar6.h(hcrVar);
        }
        hcw hcwVar7 = this.d;
        if (hcwVar7 != null) {
            hcwVar7.h(hcrVar);
        }
        hda hdaVar = this.f;
        if (hdaVar != null) {
            hdaVar.h(hcrVar);
        }
        hda hdaVar2 = this.g;
        if (hdaVar2 != null) {
            hdaVar2.h(hcrVar);
        }
    }

    public final boolean e(Object obj, hig higVar) {
        if (obj == hbq.f) {
            hcw hcwVar = this.a;
            if (hcwVar == null) {
                this.a = new hdn(higVar, new PointF());
                return true;
            }
            hcwVar.d = higVar;
            return true;
        }
        if (obj == hbq.g) {
            hcw hcwVar2 = this.b;
            if (hcwVar2 == null) {
                this.b = new hdn(higVar, new PointF());
                return true;
            }
            hcwVar2.d = higVar;
            return true;
        }
        if (obj == hbq.h) {
            hcw hcwVar3 = this.b;
            if (hcwVar3 instanceof hdj) {
                hdj hdjVar = (hdj) hcwVar3;
                hig higVar2 = hdjVar.e;
                hdjVar.e = higVar;
                return true;
            }
        }
        if (obj == hbq.i) {
            hcw hcwVar4 = this.b;
            if (hcwVar4 instanceof hdj) {
                hdj hdjVar2 = (hdj) hcwVar4;
                hig higVar3 = hdjVar2.f;
                hdjVar2.f = higVar;
                return true;
            }
        }
        if (obj == hbq.o) {
            hcw hcwVar5 = this.c;
            if (hcwVar5 == null) {
                this.c = new hdn(higVar, new hih());
                return true;
            }
            hcwVar5.d = higVar;
            return true;
        }
        if (obj == hbq.p) {
            hcw hcwVar6 = this.d;
            if (hcwVar6 == null) {
                this.d = new hdn(higVar, Float.valueOf(brg.a));
                return true;
            }
            hcwVar6.d = higVar;
            return true;
        }
        if (obj == hbq.c) {
            hcw hcwVar7 = this.e;
            if (hcwVar7 == null) {
                this.e = new hdn(higVar, 100);
                return true;
            }
            hcwVar7.d = higVar;
            return true;
        }
        if (obj == hbq.C) {
            hcw hcwVar8 = this.h;
            if (hcwVar8 == null) {
                this.h = new hdn(higVar, Float.valueOf(100.0f));
                return true;
            }
            hcwVar8.d = higVar;
            return true;
        }
        if (obj == hbq.D) {
            hcw hcwVar9 = this.i;
            if (hcwVar9 == null) {
                this.i = new hdn(higVar, Float.valueOf(100.0f));
                return true;
            }
            hcwVar9.d = higVar;
            return true;
        }
        if (obj == hbq.q) {
            if (this.f == null) {
                this.f = new hda(Collections.singletonList(new hie(Float.valueOf(brg.a))));
            }
            this.f.d = higVar;
            return true;
        }
        if (obj == hbq.r) {
            if (this.g == null) {
                this.g = new hda(Collections.singletonList(new hie(Float.valueOf(brg.a))));
            }
            this.g.d = higVar;
            return true;
        }
        return false;
    }
}
