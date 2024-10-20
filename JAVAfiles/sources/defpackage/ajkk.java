package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajkk extends Drawable.ConstantState {
    public ajkr a;
    public ajgm b;
    ColorFilter c;
    ColorStateList d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    PorterDuff.Mode h;
    public Rect i;
    float j;
    public float k;
    float l;
    int m;
    public float n;
    float o;
    float p;
    int q;
    int r;
    int s;
    int t;
    boolean u;
    Paint.Style v;
    aksr w;

    public ajkk(ajkk ajkkVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = brg.a;
        this.o = brg.a;
        this.p = brg.a;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = ajkkVar.a;
        this.w = ajkkVar.w;
        this.b = ajkkVar.b;
        this.l = ajkkVar.l;
        this.c = ajkkVar.c;
        this.d = ajkkVar.d;
        this.e = ajkkVar.e;
        this.h = ajkkVar.h;
        this.g = ajkkVar.g;
        this.m = ajkkVar.m;
        this.j = ajkkVar.j;
        this.s = ajkkVar.s;
        int i = ajkkVar.q;
        this.q = 0;
        boolean z = ajkkVar.u;
        this.u = false;
        this.k = ajkkVar.k;
        this.n = ajkkVar.n;
        this.o = ajkkVar.o;
        float f = ajkkVar.p;
        this.p = brg.a;
        this.r = ajkkVar.r;
        int i2 = ajkkVar.t;
        this.t = 0;
        ColorStateList colorStateList = ajkkVar.f;
        this.f = null;
        this.v = ajkkVar.v;
        Rect rect = ajkkVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        ajkm ajkmVar = new ajkm(this);
        ajkmVar.s = true;
        ajkmVar.t = true;
        return ajkmVar;
    }

    public ajkk(ajkr ajkrVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = brg.a;
        this.o = brg.a;
        this.p = brg.a;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = ajkrVar;
        this.b = null;
    }
}
