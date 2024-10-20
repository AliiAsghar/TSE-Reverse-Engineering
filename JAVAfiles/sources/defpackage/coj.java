package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.Build;
import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coj implements cog {
    private final cks a;
    private final cnr b;
    private final RenderNode c;
    private long d;
    private Matrix e;
    private boolean f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private long m;
    private long n;
    private float o;
    private float p;
    private float q;
    private float r;
    private boolean s;
    private boolean t;
    private boolean u;
    private clx v;
    private int w;

    public coj(cks cksVar, cnr cnrVar) {
        this.a = cksVar;
        this.b = cnrVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.c = renderNode;
        this.d = 0L;
        renderNode.setClipToBounds(false);
        M(renderNode, 0);
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        long j = cku.a;
        this.m = j;
        this.n = j;
        this.r = 8.0f;
        this.w = 0;
    }

    private final void L() {
        boolean z;
        boolean z2 = this.s;
        boolean z3 = true;
        if (z2 && !this.f) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 || !this.f) {
            z3 = false;
        }
        if (z != this.t) {
            this.t = z;
            this.c.setClipToBounds(z);
        }
        if (z3 != this.u) {
            this.u = z3;
            this.c.setClipToOutline(z3);
        }
    }

    private static final void M(RenderNode renderNode, int i) {
        if (!a.bA(i, 1)) {
            if (a.bA(i, 2)) {
                renderNode.setUseCompositingLayer(false, null);
                renderNode.setHasOverlappingRendering(false);
                return;
            } else {
                renderNode.setUseCompositingLayer(false, null);
                renderNode.setHasOverlappingRendering(true);
                return;
            }
        }
        renderNode.setUseCompositingLayer(true, null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // defpackage.cog
    public final void A(clx clxVar) {
        RenderEffect renderEffect;
        this.v = clxVar;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = this.c;
            if (clxVar != null) {
                renderEffect = clxVar.b();
            } else {
                renderEffect = null;
            }
            renderNode.setRenderEffect(renderEffect);
        }
    }

    @Override // defpackage.cog
    public final void B(float f) {
        this.o = f;
        this.c.setRotationX(f);
    }

    @Override // defpackage.cog
    public final void C(float f) {
        this.p = f;
        this.c.setRotationY(f);
    }

    @Override // defpackage.cog
    public final void D(float f) {
        this.q = f;
        this.c.setRotationZ(f);
    }

    @Override // defpackage.cog
    public final void E(float f) {
        this.h = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.cog
    public final void F(float f) {
        this.i = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.cog
    public final void G(float f) {
        this.l = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.cog
    public final void H(long j) {
        this.n = j;
        this.c.setSpotShadowColor(ckw.b(j));
    }

    @Override // defpackage.cog
    public final void I(float f) {
        this.j = f;
        this.c.setTranslationX(f);
    }

    @Override // defpackage.cog
    public final void J(float f) {
        this.k = f;
        this.c.setTranslationY(f);
    }

    @Override // defpackage.cog
    public final boolean K() {
        boolean hasDisplayList;
        hasDisplayList = this.c.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.cog
    public final float a() {
        return this.g;
    }

    @Override // defpackage.cog
    public final float b() {
        return this.r;
    }

    @Override // defpackage.cog
    public final float c() {
        return this.o;
    }

    @Override // defpackage.cog
    public final float d() {
        return this.p;
    }

    @Override // defpackage.cog
    public final float e() {
        return this.q;
    }

    @Override // defpackage.cog
    public final float f() {
        return this.h;
    }

    @Override // defpackage.cog
    public final float g() {
        return this.i;
    }

    @Override // defpackage.cog
    public final float h() {
        return this.l;
    }

    @Override // defpackage.cog
    public final float i() {
        return this.j;
    }

    @Override // defpackage.cog
    public final float j() {
        return this.k;
    }

    @Override // defpackage.cog
    public final int k() {
        return this.w;
    }

    @Override // defpackage.cog
    public final long l() {
        return this.m;
    }

    @Override // defpackage.cog
    public final long m() {
        return this.n;
    }

    @Override // defpackage.cog
    public final Matrix n() {
        Matrix matrix = this.e;
        if (matrix == null) {
            matrix = new Matrix();
            this.e = matrix;
        }
        this.c.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.cog
    public final clx o() {
        return this.v;
    }

    @Override // defpackage.cog
    public final void p() {
        this.c.discardDisplayList();
    }

    @Override // defpackage.cog
    public final void q(ckr ckrVar) {
        cjx.a(ckrVar).drawRenderNode(this.c);
    }

    @Override // defpackage.cog
    public final void r(dqv dqvVar, drk drkVar, cof cofVar, arqr arqrVar) {
        RecordingCanvas beginRecording;
        beginRecording = this.c.beginRecording();
        try {
            cks cksVar = this.a;
            cjw cjwVar = cksVar.a;
            Canvas canvas = cjwVar.a;
            cjwVar.a = beginRecording;
            cnu cnuVar = this.b.b;
            cnuVar.f(dqvVar);
            cnuVar.g(drkVar);
            ((cnr.AnonymousClass1) cnuVar).b = cofVar;
            cnuVar.h(this.d);
            cnuVar.e(cjwVar);
            arqrVar.a(this.b);
            cksVar.a.a = canvas;
        } finally {
            this.c.endRecording();
        }
    }

    @Override // defpackage.cog
    public final void s(float f) {
        this.g = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.cog
    public final void t(long j) {
        this.m = j;
        this.c.setAmbientShadowColor(ckw.b(j));
    }

    @Override // defpackage.cog
    public final void u(float f) {
        this.r = f;
        this.c.setCameraDistance(f);
    }

    @Override // defpackage.cog
    public final void v(boolean z) {
        this.s = z;
        L();
    }

    @Override // defpackage.cog
    public final void w(int i) {
        this.w = i;
        if (!a.bA(i, 1) && a.bA(3, 3) && this.v == null) {
            M(this.c, i);
        } else {
            M(this.c, 1);
        }
    }

    @Override // defpackage.cog
    public final void x(Outline outline, long j) {
        boolean z;
        this.c.setOutline(outline);
        if (outline != null) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        L();
    }

    @Override // defpackage.cog
    public final void y(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            this.c.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.c.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            this.c.resetPivot();
        }
    }

    @Override // defpackage.cog
    public final void z(int i, int i2, long j) {
        this.c.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.d = drj.c(j);
    }
}
