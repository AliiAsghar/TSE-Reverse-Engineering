package defpackage;

import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmt extends gmv {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint.Cap h;
    Paint.Join i;
    float j;
    arrt k;
    arrt l;

    public gmt() {
        this.b = brg.a;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = brg.a;
        this.f = 1.0f;
        this.g = brg.a;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
    }

    @Override // defpackage.gvf
    public final boolean e() {
        if (!this.l.n() && !this.k.n()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gvf
    public final boolean f(int[] iArr) {
        return this.k.o(iArr) | this.l.o(iArr);
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.a;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.a;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.a = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.a = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public gmt(gmt gmtVar) {
        super(gmtVar);
        this.b = brg.a;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = brg.a;
        this.f = 1.0f;
        this.g = brg.a;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = gmtVar.a;
        this.a = null;
        this.k = gmtVar.k;
        this.b = gmtVar.b;
        this.c = gmtVar.c;
        this.l = gmtVar.l;
        this.o = gmtVar.o;
        this.d = gmtVar.d;
        this.e = gmtVar.e;
        this.f = gmtVar.f;
        this.g = gmtVar.g;
        this.h = gmtVar.h;
        this.i = gmtVar.i;
        this.j = gmtVar.j;
    }
}
