package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exc implements exy {
    public final eqp a;
    public final ezc b;
    public EGLContext c;
    public EGLDisplay d;
    public EGLSurface e;
    public final ktk g;
    private final exx h;
    private boolean j;
    private eqd m;
    private final qdq o;
    private int n = -1;
    private final SparseArray i = new SparseArray();
    public final anna f = new anna(false, 1);
    private final euc k = new euc(1);
    private final euc l = new euc(1);

    public exc(Context context, eqp eqpVar, ExecutorService executorService, qdq qdqVar, exx exxVar) {
        this.o = qdqVar;
        this.h = exxVar;
        this.a = eqpVar;
        this.g = new ktk(context);
        int i = 1;
        boolean z = executorService == null;
        if (z) {
            executorService = eul.P("Effect:DefaultVideoCompositor:GlThread");
        } else {
            dzg.g(executorService);
        }
        ezc ezcVar = new ezc(executorService, z, new exg(qdqVar, i));
        this.b = ezcVar;
        ezcVar.d(new ewt(this, 4));
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Queue] */
    private final synchronized alog g() {
        if (this.f.j() != 0) {
            for (int i = 0; i < this.i.size(); i++) {
                if (((apvo) this.i.valueAt(i)).b.isEmpty()) {
                    int i2 = alog.d;
                    return alsx.a;
                }
            }
            alob alobVar = new alob();
            asnl asnlVar = (asnl) ((apvo) this.i.get(this.n)).b.element();
            alobVar.h(asnlVar);
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                if (this.i.keyAt(i3) != this.n) {
                    apvo apvoVar = (apvo) this.i.valueAt(i3);
                    if (apvoVar.b.size() == 1 && !apvoVar.a) {
                        int i4 = alog.d;
                        return alsx.a;
                    }
                    Iterator it = apvoVar.b.iterator();
                    asnl asnlVar2 = null;
                    long j = Long.MAX_VALUE;
                    while (it.hasNext()) {
                        asnl asnlVar3 = (asnl) it.next();
                        long j2 = asnlVar3.a;
                        long abs = Math.abs(j2 - asnlVar.a);
                        if (abs < j) {
                            asnlVar2 = asnlVar3;
                        }
                        if (abs < j) {
                            j = abs;
                        }
                        if (j2 > asnlVar.a || (!it.hasNext() && apvoVar.a)) {
                            dzg.g(asnlVar2);
                            alobVar.h(asnlVar2);
                            break;
                        }
                    }
                }
            }
            alog g = alobVar.g();
            if (((alsx) g).c != this.i.size()) {
                return alsx.a;
            }
            return g;
        }
        int i5 = alog.d;
        return alsx.a;
    }

    private final synchronized void h() {
        for (int i = 0; i < this.i.size(); i++) {
            if (this.i.keyAt(i) != this.n) {
                i((apvo) this.i.valueAt(i));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Iterable] */
    private final synchronized void i(apvo apvoVar) {
        final long j;
        apvo apvoVar2 = (apvo) this.i.get(this.n);
        if (apvoVar2.b.isEmpty() && apvoVar2.a) {
            j(apvoVar, apvoVar.b.size());
            return;
        }
        asnl asnlVar = (asnl) apvoVar2.b.peek();
        if (asnlVar != null) {
            j = asnlVar.a;
        } else {
            j = -9223372036854775807L;
        }
        j(apvoVar, Math.max(alzz.aI(alzz.aK(apvoVar.b, new algy() { // from class: exb
            @Override // defpackage.algy
            public final boolean a(Object obj) {
                if (((asnl) obj).a <= j) {
                    return true;
                }
                return false;
            }
        })) - 1, 0));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Queue] */
    private final synchronized void j(apvo apvoVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            asnl asnlVar = (asnl) apvoVar.b.remove();
            Object obj = asnlVar.b;
            ((exo) obj).f.d(new exf(obj, asnlVar.a, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void a() {
        alog g = g();
        if (!g.isEmpty()) {
            asnl asnlVar = (asnl) g.get(this.n);
            alob alobVar = new alob();
            int i = 0;
            for (int i2 = 0; i2 < ((alsx) g).c; i2++) {
                Object obj = ((asnl) g.get(i2)).d;
                alobVar.h(new eug(((eqq) obj).d, ((eqq) obj).e));
            }
            eug eugVar = (eug) alobVar.g().get(0);
            this.f.m(this.a, eugVar.b, eugVar.c);
            anna annaVar = this.f;
            long j = asnlVar.a;
            euc eucVar = this.k;
            eqq k = annaVar.k();
            eucVar.c(j);
            ktk ktkVar = this.g;
            if (ktkVar.c == null) {
                try {
                    ktkVar.c = new etr((Context) ktkVar.a, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                    Object obj2 = ktkVar.c;
                    int[] iArr = ett.a;
                    ((etr) obj2).k(new float[]{-1.0f, -1.0f, brg.a, 1.0f, 1.0f, -1.0f, brg.a, 1.0f, -1.0f, 1.0f, brg.a, 1.0f, 1.0f, 1.0f, brg.a, 1.0f});
                    ((etr) ktkVar.c).g("uTexTransformationMatrix", ett.z());
                } catch (IOException e) {
                    throw new esh(e);
                }
            }
            ett.u(k.c, k.d, k.e);
            ((eyl) ktkVar.b).j = new eug(k.d, k.e);
            ett.o();
            Object obj3 = ktkVar.c;
            dzg.g(obj3);
            ((etr) obj3).j();
            int i3 = 3042;
            GLES20.glEnable(3042);
            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            ett.m();
            int i4 = ((alsx) g).c - 1;
            while (i4 >= 0) {
                asnl asnlVar2 = (asnl) g.get(i4);
                Object obj4 = ktkVar.c;
                dzg.g(obj4);
                Object obj5 = asnlVar2.d;
                ((etr) obj4).i("uTexSampler", ((eqq) obj5).b, i);
                Object obj6 = ktkVar.b;
                eug eugVar2 = new eug(((eqq) obj5).d, ((eqq) obj5).e);
                Object obj7 = asnlVar2.c;
                ett.w(((eyl) obj6).b);
                ett.w(((eyl) obj6).a);
                ett.w(((eyl) obj6).e);
                ett.w(((eyl) obj6).c);
                ett.w(((eyl) obj6).d);
                ett.w(((eyl) obj6).f);
                ett.w(((eyl) obj6).g);
                ett.w(((eyl) obj6).h);
                ett.w(((eyl) obj6).i);
                Object obj8 = ((kkc) obj7).c;
                alog alogVar = g;
                Matrix.translateM(((eyl) obj6).a, i, ((Float) ((Pair) obj8).first).floatValue(), ((Float) ((Pair) obj8).second).floatValue(), brg.a);
                dzg.h(((eyl) obj6).j);
                Matrix.scaleM(((eyl) obj6).b, 0, eugVar2.b / ((eyl) obj6).j.b, eugVar2.c / r10.c, 1.0f);
                Object obj9 = ((kkc) obj7).a;
                Matrix.scaleM(((eyl) obj6).c, 0, ((Float) ((Pair) obj9).first).floatValue(), ((Float) ((Pair) obj9).second).floatValue(), 1.0f);
                Matrix.invertM(((eyl) obj6).d, 0, ((eyl) obj6).c, 0);
                Object obj10 = ((kkc) obj7).b;
                Matrix.translateM(((eyl) obj6).e, 0, -((Float) ((Pair) obj10).first).floatValue(), -((Float) ((Pair) obj10).second).floatValue(), brg.a);
                Matrix.rotateM(((eyl) obj6).f, 0, brg.a, brg.a, brg.a, 1.0f);
                Matrix.scaleM(((eyl) obj6).g, 0, eugVar2.c / eugVar2.b, 1.0f, 1.0f);
                Matrix.invertM(((eyl) obj6).h, 0, ((eyl) obj6).g, 0);
                float[] fArr = ((eyl) obj6).a;
                float[] fArr2 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
                float[] fArr3 = ((eyl) obj6).b;
                float[] fArr4 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr4, 0, fArr4, 0, fArr3, 0);
                float[] fArr5 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr5, 0, fArr5, 0, ((eyl) obj6).c, 0);
                float[] fArr6 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr6, 0, fArr6, 0, ((eyl) obj6).e, 0);
                float[] fArr7 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr7, 0, fArr7, 0, ((eyl) obj6).d, 0);
                float[] fArr8 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr8, 0, fArr8, 0, ((eyl) obj6).g, 0);
                float[] fArr9 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, ((eyl) obj6).f, 0);
                float[] fArr10 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr10, 0, fArr10, 0, ((eyl) obj6).h, 0);
                float[] fArr11 = ((eyl) obj6).i;
                Matrix.multiplyMM(fArr11, 0, fArr11, 0, ((eyl) obj6).c, 0);
                ((etr) obj4).g("uTransformationMatrix", ((eyl) obj6).i);
                Object obj11 = asnlVar2.c;
                ((etr) obj4).f("uAlphaScale", 1.0f);
                ((etr) obj4).d();
                GLES20.glDrawArrays(5, 0, 4);
                ett.m();
                i4--;
                i = 0;
                g = alogVar;
                i3 = 3042;
            }
            GLES20.glDisable(i3);
            ett.m();
            this.l.c(ett.e());
            eyk eykVar = ((eye) this.h).a;
            dzg.h(eykVar.j);
            dzg.d(!eykVar.m);
            int i5 = ewx.a;
            eykVar.h.add(new aboh(k, j));
            eykVar.i.put(k.b, new aboh(this, j));
            if (!eykVar.k) {
                esk eskVar = eykVar.j;
                dzg.g(eskVar);
                eskVar.c(3, eykVar.e, new eqo(eykVar.b, k.d, k.e, 1.0f, 0L));
                eykVar.k = true;
            } else {
                eykVar.b();
            }
            apvo apvoVar = (apvo) this.i.get(this.n);
            j(apvoVar, 1);
            h();
            if (this.j && apvoVar.b.isEmpty()) {
                this.o.J();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void b(int i, exy exyVar, eqq eqqVar, eqd eqdVar, long j) {
        dzg.d(eul.S(this.i, i));
        apvo apvoVar = (apvo) this.i.get(i);
        dzg.d(!apvoVar.a);
        if (this.m == null) {
            this.m = eqdVar;
        }
        dzg.e(this.m.equals(eqdVar), "Mixing different ColorInfos is not supported.");
        Float valueOf = Float.valueOf(brg.a);
        Pair create = Pair.create(valueOf, valueOf);
        Pair create2 = Pair.create(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        apvoVar.b.add(new asnl(exyVar, eqqVar, j, new kkc(create, create2, Pair.create(valueOf2, valueOf2))));
        if (i == this.n) {
            h();
        } else {
            i(apvoVar);
        }
        this.b.d(new ewt(this, 6));
    }

    public final synchronized void c(int i) {
        dzg.d(!eul.S(this.i, i));
        this.i.put(i, new apvo(null, null));
        if (this.n == -1) {
            this.n = i;
        }
    }

    public final synchronized void d() {
        dzg.d(this.j);
        try {
            this.b.c(new ewt(this, 5));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    public final synchronized void e(long j) {
        while (true) {
            anna annaVar = this.f;
            if (annaVar.j() >= annaVar.a || this.k.a() > j) {
                break;
            }
            this.f.o();
            this.k.b();
            ett.p(this.l.b());
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void f(int i) {
        boolean z;
        dzg.d(eul.S(this.i, i));
        boolean z2 = false;
        if (this.n != -1) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        ((apvo) this.i.get(i)).a = true;
        int i2 = 0;
        while (true) {
            if (i2 < this.i.size()) {
                if (!((apvo) this.i.valueAt(i2)).a) {
                    break;
                } else {
                    i2++;
                }
            } else {
                z2 = true;
                break;
            }
        }
        this.j = z2;
        if (((apvo) this.i.get(this.n)).b.isEmpty()) {
            if (i == this.n) {
                h();
            }
            if (z2) {
                this.o.J();
                return;
            }
        }
        if (i != this.n && ((apvo) this.i.get(i)).b.size() == 1) {
            this.b.d(new ewt(this, 6));
        }
    }
}
