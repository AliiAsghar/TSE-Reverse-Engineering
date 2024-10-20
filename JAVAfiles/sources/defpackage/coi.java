package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import defpackage.cnr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coi implements cog {
    private static final AtomicBoolean a = new AtomicBoolean(true);
    private final cks b;
    private final cnr c;
    private final RenderNode d;
    private long e;
    private Matrix f;
    private boolean g;
    private long h;
    private int i;
    private float j;
    private boolean k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private float s;
    private float t;
    private float u;
    private float v;
    private boolean w;
    private boolean x;
    private boolean y;
    private clx z;

    public coi(View view, cks cksVar, cnr cnrVar) {
        this.b = cksVar;
        this.c = cnrVar;
        RenderNode create = RenderNode.create("Compose", view);
        this.d = create;
        this.e = 0L;
        this.h = 0L;
        if (a.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                create.setAmbientShadowColor(create.getAmbientShadowColor());
                create.setSpotShadowColor(create.getSpotShadowColor());
            }
            L();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        N(0);
        this.i = 0;
        this.j = 1.0f;
        this.l = 1.0f;
        this.m = 1.0f;
        long j = cku.a;
        this.q = j;
        this.r = j;
        this.v = 8.0f;
    }

    private final void M() {
        boolean z;
        boolean z2 = this.w;
        boolean z3 = true;
        if (z2 && !this.g) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 || !this.g) {
            z3 = false;
        }
        if (z != this.x) {
            this.x = z;
            this.d.setClipToBounds(z);
        }
        if (z3 != this.y) {
            this.y = z3;
            this.d.setClipToOutline(z3);
        }
    }

    private final void N(int i) {
        RenderNode renderNode = this.d;
        if (!a.bA(i, 1)) {
            if (a.bA(i, 2)) {
                renderNode.setLayerType(0);
                renderNode.setLayerPaint((Paint) null);
                renderNode.setHasOverlappingRendering(false);
                return;
            } else {
                renderNode.setLayerType(0);
                renderNode.setLayerPaint((Paint) null);
                renderNode.setHasOverlappingRendering(true);
                return;
            }
        }
        renderNode.setLayerType(2);
        renderNode.setLayerPaint((Paint) null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // defpackage.cog
    public final void A(clx clxVar) {
        this.z = clxVar;
    }

    @Override // defpackage.cog
    public final void B(float f) {
        this.s = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.cog
    public final void C(float f) {
        this.t = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.cog
    public final void D(float f) {
        this.u = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.cog
    public final void E(float f) {
        this.l = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.cog
    public final void F(float f) {
        this.m = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.cog
    public final void G(float f) {
        this.p = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.cog
    public final void H(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            this.d.setSpotShadowColor(ckw.b(j));
        }
    }

    @Override // defpackage.cog
    public final void I(float f) {
        this.n = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.cog
    public final void J(float f) {
        this.o = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.cog
    public final boolean K() {
        return this.d.isValid();
    }

    public final void L() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.cog
    public final float a() {
        return this.j;
    }

    @Override // defpackage.cog
    public final float b() {
        return this.v;
    }

    @Override // defpackage.cog
    public final float c() {
        return this.s;
    }

    @Override // defpackage.cog
    public final float d() {
        return this.t;
    }

    @Override // defpackage.cog
    public final float e() {
        return this.u;
    }

    @Override // defpackage.cog
    public final float f() {
        return this.l;
    }

    @Override // defpackage.cog
    public final float g() {
        return this.m;
    }

    @Override // defpackage.cog
    public final float h() {
        return this.p;
    }

    @Override // defpackage.cog
    public final float i() {
        return this.n;
    }

    @Override // defpackage.cog
    public final float j() {
        return this.o;
    }

    @Override // defpackage.cog
    public final int k() {
        return this.i;
    }

    @Override // defpackage.cog
    public final long l() {
        return this.q;
    }

    @Override // defpackage.cog
    public final long m() {
        return this.r;
    }

    @Override // defpackage.cog
    public final Matrix n() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.cog
    public final clx o() {
        return this.z;
    }

    @Override // defpackage.cog
    public final void p() {
        L();
    }

    @Override // defpackage.cog
    public final void q(ckr ckrVar) {
        DisplayListCanvas a2 = cjx.a(ckrVar);
        a2.getClass();
        a2.drawRenderNode(this.d);
    }

    @Override // defpackage.cog
    public final void r(dqv dqvVar, drk drkVar, cof cofVar, arqr arqrVar) {
        DisplayListCanvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.h >> 32)), Math.max((int) (this.e & 4294967295L), (int) (4294967295L & this.h)));
        try {
            cks cksVar = this.b;
            cjw cjwVar = cksVar.a;
            Canvas canvas = cjwVar.a;
            cjwVar.a = start;
            cnr cnrVar = this.c;
            long c = drj.c(this.e);
            dqv c2 = cnrVar.b.c();
            drk d = cnrVar.b.d();
            ckr b = cnrVar.b.b();
            long a2 = cnrVar.b.a();
            cnu cnuVar = cnrVar.b;
            cof cofVar2 = ((cnr.AnonymousClass1) cnuVar).b;
            cnuVar.f(dqvVar);
            cnuVar.g(drkVar);
            cnuVar.e(cjwVar);
            cnuVar.h(c);
            ((cnr.AnonymousClass1) cnuVar).b = cofVar;
            cjwVar.l();
            try {
                arqrVar.a(cnrVar);
                cjwVar.j();
                cnu cnuVar2 = cnrVar.b;
                cnuVar2.f(c2);
                cnuVar2.g(d);
                cnuVar2.e(b);
                cnuVar2.h(a2);
                ((cnr.AnonymousClass1) cnuVar2).b = cofVar2;
                cksVar.a.a = canvas;
            } catch (Throwable th) {
                cjwVar.j();
                cnu cnuVar3 = cnrVar.b;
                cnuVar3.f(c2);
                cnuVar3.g(d);
                cnuVar3.e(b);
                cnuVar3.h(a2);
                ((cnr.AnonymousClass1) cnuVar3).b = cofVar2;
                throw th;
            }
        } finally {
            this.d.end(start);
        }
    }

    @Override // defpackage.cog
    public final void s(float f) {
        this.j = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.cog
    public final void t(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            this.d.setAmbientShadowColor(ckw.b(j));
        }
    }

    @Override // defpackage.cog
    public final void u(float f) {
        this.v = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.cog
    public final void v(boolean z) {
        this.w = z;
        M();
    }

    @Override // defpackage.cog
    public final void w(int i) {
        this.i = i;
        if (!a.bA(i, 1) && a.bA(3, 3)) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // defpackage.cog
    public final void x(Outline outline, long j) {
        boolean z;
        this.h = j;
        this.d.setOutline(outline);
        if (outline != null) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        M();
    }

    @Override // defpackage.cog
    public final void y(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.k = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.k = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.cog
    public final void z(int i, int i2, long j) {
        int i3 = (int) (4294967295L & j);
        int i4 = (int) (j >> 32);
        this.d.setLeftTopRightBottom(i, i2, i + i4, i2 + i3);
        if (!a.bB(this.e, j)) {
            if (this.k) {
                this.d.setPivotX(i4 / 2.0f);
                this.d.setPivotY(i3 / 2.0f);
            }
            this.e = j;
        }
    }
}
