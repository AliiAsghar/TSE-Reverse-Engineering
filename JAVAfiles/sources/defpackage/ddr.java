package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddr implements dck {
    private final RenderNode a = new RenderNode("Compose");

    @Override // defpackage.dck
    public final void A(float f) {
        this.a.setRotationY(f);
    }

    @Override // defpackage.dck
    public final void B(float f) {
        this.a.setRotationZ(f);
    }

    @Override // defpackage.dck
    public final void C(float f) {
        this.a.setScaleX(f);
    }

    @Override // defpackage.dck
    public final void D(float f) {
        this.a.setScaleY(f);
    }

    @Override // defpackage.dck
    public final void E(int i) {
        this.a.setSpotShadowColor(i);
    }

    @Override // defpackage.dck
    public final void F(float f) {
        this.a.setTranslationX(f);
    }

    @Override // defpackage.dck
    public final void G(float f) {
        this.a.setTranslationY(f);
    }

    @Override // defpackage.dck
    public final boolean H() {
        boolean clipToBounds;
        clipToBounds = this.a.getClipToBounds();
        return clipToBounds;
    }

    @Override // defpackage.dck
    public final boolean I() {
        boolean clipToOutline;
        clipToOutline = this.a.getClipToOutline();
        return clipToOutline;
    }

    @Override // defpackage.dck
    public final boolean J() {
        boolean hasDisplayList;
        hasDisplayList = this.a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.dck
    public final boolean K(int i, int i2, int i3, int i4) {
        boolean position;
        position = this.a.setPosition(i, i2, i3, i4);
        return position;
    }

    @Override // defpackage.dck
    public final void L() {
        this.a.setHasOverlappingRendering(true);
    }

    @Override // defpackage.dck
    public final float a() {
        float alpha;
        alpha = this.a.getAlpha();
        return alpha;
    }

    @Override // defpackage.dck
    public final float b() {
        float elevation;
        elevation = this.a.getElevation();
        return elevation;
    }

    @Override // defpackage.dck
    public final int c() {
        int bottom;
        bottom = this.a.getBottom();
        return bottom;
    }

    @Override // defpackage.dck
    public final int d() {
        int height;
        height = this.a.getHeight();
        return height;
    }

    @Override // defpackage.dck
    public final int e() {
        int left;
        left = this.a.getLeft();
        return left;
    }

    @Override // defpackage.dck
    public final int f() {
        int right;
        right = this.a.getRight();
        return right;
    }

    @Override // defpackage.dck
    public final int g() {
        int top;
        top = this.a.getTop();
        return top;
    }

    @Override // defpackage.dck
    public final int h() {
        int width;
        width = this.a.getWidth();
        return width;
    }

    @Override // defpackage.dck
    public final void i() {
        this.a.discardDisplayList();
    }

    @Override // defpackage.dck
    public final void j(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // defpackage.dck
    public final void k(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // defpackage.dck
    public final void l(int i) {
        this.a.offsetLeftAndRight(i);
    }

    @Override // defpackage.dck
    public final void m(int i) {
        this.a.offsetTopAndBottom(i);
    }

    @Override // defpackage.dck
    public final void n(cks cksVar, clr clrVar, arqr arqrVar) {
        RecordingCanvas beginRecording;
        RenderNode renderNode = this.a;
        cjw cjwVar = cksVar.a;
        beginRecording = renderNode.beginRecording();
        Canvas canvas = cjwVar.a;
        cjwVar.a = beginRecording;
        if (clrVar != null) {
            cjwVar.l();
            cjwVar.r(clrVar);
        }
        arqrVar.a(cjwVar);
        if (clrVar != null) {
            cjwVar.j();
        }
        cksVar.a.a = canvas;
        this.a.endRecording();
    }

    @Override // defpackage.dck
    public final void o(float f) {
        this.a.setAlpha(f);
    }

    @Override // defpackage.dck
    public final void p(int i) {
        this.a.setAmbientShadowColor(i);
    }

    @Override // defpackage.dck
    public final void q(float f) {
        this.a.setCameraDistance(f);
    }

    @Override // defpackage.dck
    public final void r(boolean z) {
        this.a.setClipToBounds(z);
    }

    @Override // defpackage.dck
    public final void s(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // defpackage.dck
    public final void t(int i) {
        RenderNode renderNode = this.a;
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

    @Override // defpackage.dck
    public final void u(float f) {
        this.a.setElevation(f);
    }

    @Override // defpackage.dck
    public final void v(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // defpackage.dck
    public final void w(float f) {
        this.a.setPivotX(f);
    }

    @Override // defpackage.dck
    public final void x(float f) {
        this.a.setPivotY(f);
    }

    @Override // defpackage.dck
    public final void y(clx clxVar) {
        RenderEffect renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = this.a;
            if (clxVar != null) {
                renderEffect = clxVar.b();
            } else {
                renderEffect = null;
            }
            renderNode.setRenderEffect(renderEffect);
        }
    }

    @Override // defpackage.dck
    public final void z(float f) {
        this.a.setRotationX(f);
    }
}
