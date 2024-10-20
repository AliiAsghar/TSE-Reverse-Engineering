package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cok implements cog {
    private static final Canvas a = new Canvas() { // from class: cok.1
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    };
    private final con b;
    private final cks c;
    private final com d;
    private final Resources e;
    private final Rect f;
    private int g;
    private int h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private float n;
    private boolean o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private long u;
    private long v;
    private float w;
    private float x;
    private float y;
    private clx z;

    public /* synthetic */ cok(con conVar) {
        cks cksVar = new cks();
        cnr cnrVar = new cnr();
        this.b = conVar;
        this.c = cksVar;
        com comVar = new com(conVar, cksVar, cnrVar);
        this.d = comVar;
        this.e = conVar.getResources();
        this.f = new Rect();
        conVar.addView(comVar);
        comVar.setClipBounds(null);
        this.i = 0L;
        View.generateViewId();
        this.m = 0;
        this.n = 1.0f;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = cku.a;
        this.u = j;
        this.v = j;
    }

    private final void M(int i) {
        boolean z = true;
        if (a.bA(i, 1)) {
            this.d.setLayerType(2, null);
        } else if (a.bA(i, 2)) {
            this.d.setLayerType(0, null);
            z = false;
        } else {
            this.d.setLayerType(0, null);
        }
        com comVar = this.d;
        if (comVar.c != z) {
            comVar.c = z;
            comVar.invalidate();
        }
    }

    @Override // defpackage.cog
    public final void A(clx clxVar) {
        RenderEffect renderEffect;
        this.z = clxVar;
        if (Build.VERSION.SDK_INT >= 31) {
            com comVar = this.d;
            if (clxVar != null) {
                renderEffect = clxVar.b();
            } else {
                renderEffect = null;
            }
            comVar.setRenderEffect(renderEffect);
        }
    }

    @Override // defpackage.cog
    public final void B(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.cog
    public final void C(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.cog
    public final void D(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.cog
    public final void E(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.cog
    public final void F(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.cog
    public final void G(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.cog
    public final void H(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.d.setOutlineSpotShadowColor(ckw.b(j));
        }
    }

    @Override // defpackage.cog
    public final void I(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.cog
    public final void J(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.cog
    public final /* synthetic */ boolean K() {
        return true;
    }

    public final boolean L() {
        if (!this.l && !this.d.getClipToOutline()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cog
    public final float a() {
        return this.n;
    }

    @Override // defpackage.cog
    public final float b() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.cog
    public final float c() {
        return this.w;
    }

    @Override // defpackage.cog
    public final float d() {
        return this.x;
    }

    @Override // defpackage.cog
    public final float e() {
        return this.y;
    }

    @Override // defpackage.cog
    public final float f() {
        return this.p;
    }

    @Override // defpackage.cog
    public final float g() {
        return this.q;
    }

    @Override // defpackage.cog
    public final float h() {
        return this.t;
    }

    @Override // defpackage.cog
    public final float i() {
        return this.r;
    }

    @Override // defpackage.cog
    public final float j() {
        return this.s;
    }

    @Override // defpackage.cog
    public final int k() {
        return this.m;
    }

    @Override // defpackage.cog
    public final long l() {
        return this.u;
    }

    @Override // defpackage.cog
    public final long m() {
        return this.v;
    }

    @Override // defpackage.cog
    public final Matrix n() {
        return this.d.getMatrix();
    }

    @Override // defpackage.cog
    public final clx o() {
        return this.z;
    }

    @Override // defpackage.cog
    public final void p() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.cog
    public final void q(ckr ckrVar) {
        if (this.j) {
            com comVar = this.d;
            Rect rect = null;
            if (L() && !this.k) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.d.getWidth();
                rect.bottom = this.d.getHeight();
            }
            comVar.setClipBounds(rect);
        }
        if (cjx.a(ckrVar).isHardwareAccelerated()) {
            con conVar = this.b;
            com comVar2 = this.d;
            conVar.a(ckrVar, comVar2, comVar2.getDrawingTime());
        }
    }

    @Override // defpackage.cog
    public final void r(dqv dqvVar, drk drkVar, cof cofVar, arqr arqrVar) {
        if (this.d.getParent() == null) {
            this.b.addView(this.d);
        }
        com comVar = this.d;
        comVar.d = dqvVar;
        comVar.e = drkVar;
        comVar.f = arqrVar;
        comVar.g = cofVar;
        if (comVar.isAttachedToWindow()) {
            this.d.setVisibility(4);
            this.d.setVisibility(0);
            try {
                cks cksVar = this.c;
                Canvas canvas = a;
                cjw cjwVar = cksVar.a;
                Canvas canvas2 = cjwVar.a;
                cjwVar.a = canvas;
                con conVar = this.b;
                com comVar2 = this.d;
                conVar.a(cjwVar, comVar2, comVar2.getDrawingTime());
                cksVar.a.a = canvas2;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // defpackage.cog
    public final void s(float f) {
        this.n = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.cog
    public final void t(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            this.d.setOutlineAmbientShadowColor(ckw.b(j));
        }
    }

    @Override // defpackage.cog
    public final void u(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.cog
    public final void v(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z && !this.k) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.j = true;
        com comVar = this.d;
        if (!z || !this.k) {
            z3 = false;
        }
        comVar.setClipToOutline(z3);
    }

    @Override // defpackage.cog
    public final void w(int i) {
        this.m = i;
        if (!a.bA(i, 1) && a.bA(3, 3)) {
            M(i);
        } else {
            M(1);
        }
    }

    @Override // defpackage.cog
    public final void x(Outline outline, long j) {
        com comVar = this.d;
        comVar.b = outline;
        comVar.invalidateOutline();
        boolean z = false;
        if (L() && outline != null) {
            this.d.setClipToOutline(true);
            if (this.l) {
                this.l = false;
                this.j = true;
            }
        }
        if (outline != null) {
            z = true;
        }
        this.k = z;
    }

    @Override // defpackage.cog
    public final void y(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            if (Build.VERSION.SDK_INT < 28) {
                this.o = true;
                this.d.setPivotX(((int) (this.i >> 32)) / 2.0f);
                this.d.setPivotY(((int) (4294967295L & this.i)) / 2.0f);
                return;
            }
            this.d.resetPivot();
            return;
        }
        this.o = false;
        this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // defpackage.cog
    public final void z(int i, int i2, long j) {
        if (!a.bB(this.i, j)) {
            if (L()) {
                this.j = true;
            }
            int i3 = (int) (j >> 32);
            int i4 = (int) (4294967295L & j);
            this.d.layout(i, i2, i + i3, i2 + i4);
            this.i = j;
            if (this.o) {
                this.d.setPivotX(i3 / 2.0f);
                this.d.setPivotY(i4 / 2.0f);
            }
        } else {
            int i5 = this.g;
            if (i5 != i) {
                this.d.offsetLeftAndRight(i - i5);
            }
            int i6 = this.h;
            if (i6 != i2) {
                this.d.offsetTopAndBottom(i2 - i6);
            }
        }
        this.g = i;
        this.h = i2;
    }
}
