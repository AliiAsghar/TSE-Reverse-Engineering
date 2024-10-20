package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmw {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final gmu d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final tm l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public gmw() {
        this.o = new Matrix();
        this.e = brg.a;
        this.f = brg.a;
        this.g = brg.a;
        this.h = brg.a;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new tm();
        this.d = new gmu();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(gmu gmuVar, Matrix matrix, Canvas canvas, int i, int i2) {
        float f;
        Path.FillType fillType;
        Path.FillType fillType2;
        gmuVar.a.set(matrix);
        gmuVar.a.preConcat(gmuVar.j);
        canvas.save();
        for (int i3 = 0; i3 < gmuVar.b.size(); i3++) {
            gvf gvfVar = (gvf) gmuVar.b.get(i3);
            if (gvfVar instanceof gmu) {
                a((gmu) gvfVar, gmuVar.a, canvas, i, i2);
            } else if (gvfVar instanceof gmv) {
                gmv gmvVar = (gmv) gvfVar;
                float f2 = i / this.g;
                float f3 = i2 / this.h;
                float min = Math.min(f2, f3);
                Matrix matrix2 = gmuVar.a;
                this.o.set(matrix2);
                this.o.postScale(f2, f3);
                float[] fArr = {brg.a, 1.0f, 1.0f, brg.a};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[0], fArr[1]);
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = fArr[0];
                float f5 = fArr[1];
                float f6 = fArr[2];
                float f7 = f4 * fArr[3];
                float f8 = f5 * f6;
                float max = Math.max(hypot, hypot2);
                if (max > brg.a) {
                    f = Math.abs(f7 - f8) / max;
                } else {
                    f = 0.0f;
                }
                if (f != brg.a) {
                    Path path = this.m;
                    path.reset();
                    eas[] easVarArr = gmvVar.m;
                    if (easVarArr != null) {
                        dyw.b(easVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (gmvVar.d()) {
                        Path path3 = this.n;
                        if (gmvVar.o == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path3.setFillType(fillType2);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        gmt gmtVar = (gmt) gmvVar;
                        float f9 = gmtVar.e;
                        if (f9 != brg.a || gmtVar.f != 1.0f) {
                            float f10 = gmtVar.g;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (gmtVar.f + f10) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path2.reset();
                            if (f13 > f14) {
                                this.p.getSegment(f13, length, path2, true);
                                this.p.getSegment(brg.a, f14, path2, true);
                            } else {
                                this.p.getSegment(f13, f14, path2, true);
                            }
                            path2.rLineTo(brg.a, brg.a);
                        }
                        this.n.addPath(path2, this.o);
                        if (gmtVar.l.p()) {
                            arrt arrtVar = gmtVar.l;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (arrtVar.m()) {
                                Shader shader = (Shader) arrtVar.b;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(gmtVar.d * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(gmz.a(arrtVar.a, gmtVar.d));
                            }
                            paint2.setColorFilter(null);
                            Path path4 = this.n;
                            if (gmtVar.o == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path4.setFillType(fillType);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (gmtVar.k.p()) {
                            arrt arrtVar2 = gmtVar.k;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = gmtVar.i;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = gmtVar.h;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(gmtVar.j);
                            if (arrtVar2.m()) {
                                Shader shader2 = (Shader) arrtVar2.b;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(gmtVar.c * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(gmz.a(arrtVar2.a, gmtVar.c));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(gmtVar.b * f * min);
                            canvas.drawPath(this.n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public gmw(gmw gmwVar) {
        this.o = new Matrix();
        this.e = brg.a;
        this.f = brg.a;
        this.g = brg.a;
        this.h = brg.a;
        this.i = 255;
        this.j = null;
        this.k = null;
        tm tmVar = new tm();
        this.l = tmVar;
        this.d = new gmu(gmwVar.d, tmVar);
        this.m = new Path(gmwVar.m);
        this.n = new Path(gmwVar.n);
        this.e = gmwVar.e;
        this.f = gmwVar.f;
        this.g = gmwVar.g;
        this.h = gmwVar.h;
        int i = gmwVar.q;
        this.q = 0;
        this.i = gmwVar.i;
        this.j = gmwVar.j;
        String str = gmwVar.j;
        if (str != null) {
            tmVar.put(str, this);
        }
        this.k = gmwVar.k;
    }
}
