package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddq implements dck {
    private static boolean a = true;
    private final dai b;
    private final RenderNode c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    public ddq(dai daiVar) {
        this.b = daiVar;
        RenderNode create = RenderNode.create("Compose", daiVar);
        this.c = create;
        if (a) {
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
            M();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            a = false;
        }
    }

    private final void M() {
        this.c.discardDisplayList();
    }

    @Override // defpackage.dck
    public final void A(float f) {
        this.c.setRotationY(f);
    }

    @Override // defpackage.dck
    public final void B(float f) {
        this.c.setRotation(f);
    }

    @Override // defpackage.dck
    public final void C(float f) {
        this.c.setScaleX(f);
    }

    @Override // defpackage.dck
    public final void D(float f) {
        this.c.setScaleY(f);
    }

    @Override // defpackage.dck
    public final void E(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.c.setSpotShadowColor(i);
        }
    }

    @Override // defpackage.dck
    public final void F(float f) {
        this.c.setTranslationX(f);
    }

    @Override // defpackage.dck
    public final void G(float f) {
        this.c.setTranslationY(f);
    }

    @Override // defpackage.dck
    public final boolean H() {
        return this.h;
    }

    @Override // defpackage.dck
    public final boolean I() {
        return this.c.getClipToOutline();
    }

    @Override // defpackage.dck
    public final boolean J() {
        return this.c.isValid();
    }

    @Override // defpackage.dck
    public final boolean K(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        return this.c.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.dck
    public final void L() {
        this.c.setHasOverlappingRendering(true);
    }

    @Override // defpackage.dck
    public final float a() {
        return this.c.getAlpha();
    }

    @Override // defpackage.dck
    public final float b() {
        return this.c.getElevation();
    }

    @Override // defpackage.dck
    public final int c() {
        return this.g;
    }

    @Override // defpackage.dck
    public final int d() {
        return this.g - this.e;
    }

    @Override // defpackage.dck
    public final int e() {
        return this.d;
    }

    @Override // defpackage.dck
    public final int f() {
        return this.f;
    }

    @Override // defpackage.dck
    public final int g() {
        return this.e;
    }

    @Override // defpackage.dck
    public final int h() {
        return this.f - this.d;
    }

    @Override // defpackage.dck
    public final void i() {
        M();
    }

    @Override // defpackage.dck
    public final void j(Canvas canvas) {
        canvas.getClass();
        ((DisplayListCanvas) canvas).drawRenderNode(this.c);
    }

    @Override // defpackage.dck
    public final void k(Matrix matrix) {
        this.c.getMatrix(matrix);
    }

    @Override // defpackage.dck
    public final void l(int i) {
        this.d += i;
        this.f += i;
        this.c.offsetLeftAndRight(i);
    }

    @Override // defpackage.dck
    public final void m(int i) {
        this.e += i;
        this.g += i;
        this.c.offsetTopAndBottom(i);
    }

    @Override // defpackage.dck
    public final void n(cks cksVar, clr clrVar, arqr arqrVar) {
        DisplayListCanvas start = this.c.start(h(), d());
        cjw cjwVar = cksVar.a;
        Canvas canvas = cjwVar.a;
        cjwVar.a = start;
        if (clrVar != null) {
            cjwVar.l();
            cjwVar.r(clrVar);
        }
        arqrVar.a(cjwVar);
        if (clrVar != null) {
            cjwVar.j();
        }
        cksVar.a.a = canvas;
        this.c.end(start);
    }

    @Override // defpackage.dck
    public final void o(float f) {
        this.c.setAlpha(f);
    }

    @Override // defpackage.dck
    public final void p(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.c.setAmbientShadowColor(i);
        }
    }

    @Override // defpackage.dck
    public final void q(float f) {
        this.c.setCameraDistance(-f);
    }

    @Override // defpackage.dck
    public final void r(boolean z) {
        this.h = z;
        this.c.setClipToBounds(z);
    }

    @Override // defpackage.dck
    public final void s(boolean z) {
        this.c.setClipToOutline(z);
    }

    @Override // defpackage.dck
    public final void t(int i) {
        if (!a.bA(i, 1)) {
            if (a.bA(i, 2)) {
                this.c.setLayerType(0);
                this.c.setHasOverlappingRendering(false);
                return;
            } else {
                this.c.setLayerType(0);
                this.c.setHasOverlappingRendering(true);
                return;
            }
        }
        this.c.setLayerType(2);
        this.c.setHasOverlappingRendering(true);
    }

    @Override // defpackage.dck
    public final void u(float f) {
        this.c.setElevation(f);
    }

    @Override // defpackage.dck
    public final void v(Outline outline) {
        this.c.setOutline(outline);
    }

    @Override // defpackage.dck
    public final void w(float f) {
        this.c.setPivotX(f);
    }

    @Override // defpackage.dck
    public final void x(float f) {
        this.c.setPivotY(f);
    }

    @Override // defpackage.dck
    public final void z(float f) {
        this.c.setRotationX(f);
    }

    @Override // defpackage.dck
    public final void y(clx clxVar) {
    }
}
