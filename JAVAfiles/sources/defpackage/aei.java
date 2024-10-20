package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aei extends ddb implements chn {
    private final ade a;
    private final ael b;
    private RenderNode c;

    public aei(ade adeVar, ael aelVar) {
        this.a = adeVar;
        this.b = aelVar;
    }

    private final RenderNode e() {
        RenderNode renderNode = this.c;
        if (renderNode == null) {
            RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
            this.c = renderNode2;
            return renderNode2;
        }
        return renderNode;
    }

    private static final boolean f(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == brg.a) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private static final boolean g(EdgeEffect edgeEffect, Canvas canvas) {
        return f(180.0f, edgeEffect, canvas);
    }

    private static final boolean h(EdgeEffect edgeEffect, Canvas canvas) {
        return f(270.0f, edgeEffect, canvas);
    }

    private static final boolean i(EdgeEffect edgeEffect, Canvas canvas) {
        return f(90.0f, edgeEffect, canvas);
    }

    private static final boolean j(EdgeEffect edgeEffect, Canvas canvas) {
        return f(brg.a, edgeEffect, canvas);
    }

    @Override // defpackage.cga
    public final /* synthetic */ cga a(cga cgaVar) {
        return cfz.a(this, cgaVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
        return cgb.a(this, obj, arqvVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ boolean c(arqr arqrVar) {
        return cgb.b(this, arqrVar);
    }

    @Override // defpackage.chn
    public final void d(cnt cntVar) {
        boolean z;
        boolean z2;
        RecordingCanvas beginRecording;
        boolean z3;
        float f;
        boolean z4;
        this.a.f(cntVar.o());
        if (cjt.f(cntVar.o())) {
            cntVar.p();
            return;
        }
        this.a.b.a();
        cga cgaVar = aed.a;
        float em = cntVar.em(30.0f);
        Canvas a = cjx.a(cntVar.q().b());
        ael aelVar = this.b;
        if (!aelVar.r() && !aelVar.s() && !aelVar.i() && !aelVar.j()) {
            z = false;
        } else {
            z = true;
        }
        ael aelVar2 = this.b;
        if (!aelVar2.l() && !aelVar2.m() && !aelVar2.o() && !aelVar2.p()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && z2) {
            e().setPosition(0, 0, a.getWidth(), a.getHeight());
        } else if (z) {
            RenderNode e = e();
            int width = a.getWidth();
            int g = arsk.g(em);
            e.setPosition(0, 0, width + g + g, a.getHeight());
        } else if (z2) {
            RenderNode e2 = e();
            int width2 = a.getWidth();
            int height = a.getHeight();
            int g2 = arsk.g(em);
            e2.setPosition(0, 0, width2, height + g2 + g2);
        } else {
            cntVar.p();
            return;
        }
        beginRecording = e().beginRecording();
        if (aelVar.m()) {
            EdgeEffect d = aelVar.d();
            i(d, beginRecording);
            d.finish();
        }
        if (aelVar.l()) {
            EdgeEffect c = aelVar.c();
            z3 = h(c, beginRecording);
            if (aelVar.n()) {
                aej.c(aelVar.d(), aej.a(c), 1.0f - Float.intBitsToFloat((int) (this.a.b() & 4294967295L)));
            }
        } else {
            z3 = false;
        }
        if (aelVar.s()) {
            EdgeEffect h = aelVar.h();
            g(h, beginRecording);
            h.finish();
        }
        if (aelVar.r()) {
            EdgeEffect g3 = aelVar.g();
            if (!j(g3, beginRecording) && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (aelVar.t()) {
                aej.c(aelVar.h(), aej.a(g3), Float.intBitsToFloat((int) (this.a.b() >> 32)));
            }
        }
        if (aelVar.p()) {
            EdgeEffect f2 = aelVar.f();
            h(f2, beginRecording);
            f2.finish();
        }
        if (aelVar.o()) {
            EdgeEffect e3 = aelVar.e();
            if (!i(e3, beginRecording) && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (aelVar.q()) {
                aej.c(aelVar.f(), aej.a(e3), Float.intBitsToFloat((int) (this.a.b() & 4294967295L)));
            }
        }
        if (aelVar.j()) {
            EdgeEffect b = aelVar.b();
            j(b, beginRecording);
            b.finish();
        }
        if (aelVar.i()) {
            EdgeEffect a2 = aelVar.a();
            if (!g(a2, beginRecording) && !z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (aelVar.k()) {
                aej.c(aelVar.b(), aej.a(a2), 1.0f - Float.intBitsToFloat((int) (this.a.b() >> 32)));
            }
            z3 = z4;
        }
        if (z3) {
            this.a.e();
        }
        float f3 = brg.a;
        if (true != z2) {
            f = em;
        } else {
            f = 0.0f;
        }
        if (true != z) {
            f3 = em;
        }
        drk r = cntVar.r();
        ckr c2 = cjx.c(beginRecording);
        long o = cntVar.o();
        dqv c3 = cntVar.q().c();
        drk d2 = cntVar.q().d();
        ckr b2 = cntVar.q().b();
        long a3 = cntVar.q().a();
        cof cofVar = ((cnr.AnonymousClass1) cntVar.q()).b;
        cnu q = cntVar.q();
        q.f(cntVar);
        q.g(r);
        q.e(c2);
        q.h(o);
        ((cnr.AnonymousClass1) q).b = null;
        c2.l();
        try {
            ((cnr.AnonymousClass1) cntVar.q()).a.e(f, f3);
            try {
                cntVar.p();
                float f4 = -f3;
                float f5 = -f;
                ((cnr.AnonymousClass1) cntVar.q()).a.e(f5, f4);
                c2.j();
                cnu q2 = cntVar.q();
                q2.f(c3);
                q2.g(d2);
                q2.e(b2);
                q2.h(a3);
                ((cnr.AnonymousClass1) q2).b = cofVar;
                e().endRecording();
                int save = a.save();
                a.translate(f5, f4);
                a.drawRenderNode(e());
                a.restoreToCount(save);
            } catch (Throwable th) {
                ((cnr.AnonymousClass1) cntVar.q()).a.e(-f, -f3);
                throw th;
            }
        } catch (Throwable th2) {
            c2.j();
            cnu q3 = cntVar.q();
            q3.f(c3);
            q3.g(d2);
            q3.e(b2);
            q3.h(a3);
            ((cnr.AnonymousClass1) q3).b = cofVar;
            throw th2;
        }
    }
}
