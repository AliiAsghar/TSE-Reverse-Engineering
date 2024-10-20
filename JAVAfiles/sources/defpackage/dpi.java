package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpi extends TextPaint {
    public int a;
    private clp b;
    private dqj c;
    private cma d;
    private cko e;
    private cas f;
    private cjt g;
    private cnz h;

    /* compiled from: PG */
    /* renamed from: dpi$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Shader> {
        final /* synthetic */ cko a;
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cko ckoVar, long j) {
            super(0);
            this.a = ckoVar;
            this.b = j;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return ((clz) this.a).b(this.b);
        }
    }

    public dpi(float f) {
        super(1);
        this.density = f;
        this.c = dqj.a;
        this.a = 3;
        this.d = cma.a;
    }

    private final clp g() {
        clp clpVar = this.b;
        if (clpVar != null) {
            return clpVar;
        }
        ckc ckcVar = new ckc(this);
        this.b = ckcVar;
        return ckcVar;
    }

    private final void h() {
        this.f = null;
        this.e = null;
        this.g = null;
        setShader(null);
    }

    public final void a(int i) {
        if (a.bA(i, this.a)) {
            return;
        }
        g().j(i);
        this.a = i;
    }

    public final void b(cko ckoVar, long j, float f) {
        cjt cjtVar;
        if (ckoVar == null) {
            h();
            return;
        }
        Shader shader = null;
        if ((!d.F(this.e, ckoVar) || (cjtVar = this.g) == null || !a.bB(cjtVar.a, j)) && j != 9205357640488583168L) {
            this.e = ckoVar;
            this.g = new cjt(j);
            this.f = new bxd(new AnonymousClass1(ckoVar, j), null);
        }
        clp g = g();
        cas casVar = this.f;
        if (casVar != null) {
            shader = (Shader) casVar.a();
        }
        g.n(shader);
        dpj.a(this, f);
    }

    public final void c(long j) {
        if (j != 16) {
            setColor(ckw.b(j));
            h();
        }
    }

    public final void d(cnz cnzVar) {
        if (cnzVar != null && !d.F(this.h, cnzVar)) {
            this.h = cnzVar;
            if (d.F(cnzVar, coc.a)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (cnzVar instanceof cod) {
                g().s(1);
                cod codVar = (cod) cnzVar;
                g().r(codVar.a);
                g().q(codVar.b);
                g().p(codVar.d);
                g().o(codVar.c);
                g().t();
            }
        }
    }

    public final void e(cma cmaVar) {
        if (cmaVar != null && !d.F(this.d, cmaVar)) {
            this.d = cmaVar;
            if (d.F(cmaVar, cma.a)) {
                clearShadowLayer();
            } else {
                cma cmaVar2 = this.d;
                setShadowLayer(dpx.a(cmaVar2.d), Float.intBitsToFloat((int) (cmaVar2.c >> 32)), Float.intBitsToFloat((int) (this.d.c & 4294967295L)), ckw.b(this.d.b));
            }
        }
    }

    public final void f(dqj dqjVar) {
        if (dqjVar != null && !d.F(this.c, dqjVar)) {
            this.c = dqjVar;
            setUnderlineText(dqjVar.a(dqj.b));
            setStrikeThruText(this.c.a(dqj.c));
        }
    }
}
