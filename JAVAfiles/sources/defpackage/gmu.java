package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmu extends gvf {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public gmu() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = brg.a;
        this.d = brg.a;
        this.e = brg.a;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = brg.a;
        this.i = brg.a;
        this.j = new Matrix();
        this.m = null;
    }

    public final void d() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, brg.a, brg.a);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    @Override // defpackage.gvf
    public final boolean e() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((gvf) this.b.get(i)).e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gvf
    public final boolean f(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.b.size(); i++) {
            z |= ((gvf) this.b.get(i)).f(iArr);
        }
        return z;
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            d();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            d();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            d();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            d();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            d();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            d();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            d();
        }
    }

    public gmu(gmu gmuVar, tm tmVar) {
        gmv gmsVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = brg.a;
        this.d = brg.a;
        this.e = brg.a;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = brg.a;
        this.i = brg.a;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = gmuVar.c;
        this.d = gmuVar.d;
        this.e = gmuVar.e;
        this.f = gmuVar.f;
        this.g = gmuVar.g;
        this.h = gmuVar.h;
        this.i = gmuVar.i;
        int[] iArr = gmuVar.l;
        this.l = null;
        String str = gmuVar.m;
        this.m = str;
        int i = gmuVar.k;
        this.k = 0;
        if (str != null) {
            tmVar.put(str, this);
        }
        matrix.set(gmuVar.j);
        ArrayList arrayList = gmuVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof gmu) {
                this.b.add(new gmu((gmu) obj, tmVar));
            } else {
                if (obj instanceof gmt) {
                    gmsVar = new gmt((gmt) obj);
                } else if (obj instanceof gms) {
                    gmsVar = new gms((gms) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(gmsVar);
                Object obj2 = gmsVar.n;
                if (obj2 != null) {
                    tmVar.put(obj2, gmsVar);
                }
            }
        }
    }
}
