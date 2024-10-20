package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajkr {
    public static final ajkg a = new ajko(0.5f);
    public final ajkg b;
    public final ajkg c;
    public final ajkg d;
    public final ajkg e;
    public final ajki f;
    public final ajki g;
    public final ajki h;
    public final ajki i;
    public final ajki j;
    public final ajki k;
    public final ajki l;
    public final ajki m;

    public ajkr() {
        this.j = new ajkp();
        this.k = new ajkp();
        this.l = new ajkp();
        this.m = new ajkp();
        this.b = new ajkd(brg.a);
        this.c = new ajkd(brg.a);
        this.d = new ajkd(brg.a);
        this.e = new ajkd(brg.a);
        this.f = new ajki();
        this.g = new ajki();
        this.h = new ajki();
        this.i = new ajki();
    }

    public static ajkg a(TypedArray typedArray, int i, ajkg ajkgVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            if (peekValue.type == 5) {
                return new ajkd(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (peekValue.type == 6) {
                return new ajko(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ajkgVar;
    }

    public static akct f(Context context, int i, int i2, ajkg ajkgVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ajkn.b);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            ajkg a2 = a(obtainStyledAttributes, 5, ajkgVar);
            ajkg a3 = a(obtainStyledAttributes, 8, a2);
            ajkg a4 = a(obtainStyledAttributes, 9, a2);
            ajkg a5 = a(obtainStyledAttributes, 7, a2);
            ajkg a6 = a(obtainStyledAttributes, 6, a2);
            akct akctVar = new akct((char[]) null);
            akctVar.n(ajgl.s(i4));
            akctVar.d = a3;
            akctVar.o(ajgl.s(i5));
            akctVar.k = a4;
            akctVar.m(ajgl.s(i6));
            akctVar.f = a5;
            akctVar.l(ajgl.s(i7));
            akctVar.b = a6;
            return akctVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static akct g(Context context, AttributeSet attributeSet, int i, int i2, ajkg ajkgVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajkn.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return f(context, resourceId, resourceId2, ajkgVar);
    }

    public static akct h(Context context, AttributeSet attributeSet, int i, int i2) {
        return g(context, attributeSet, i, i2, new ajkd(brg.a));
    }

    public final ajkr b(float f) {
        akct akctVar = new akct(this);
        akctVar.k(f);
        return new ajkr(akctVar);
    }

    public final ajkr c(ajkq ajkqVar) {
        akct akctVar = new akct(this);
        akctVar.d = ajkqVar.a(this.b);
        akctVar.k = ajkqVar.a(this.c);
        akctVar.b = ajkqVar.a(this.e);
        akctVar.f = ajkqVar.a(this.d);
        return new ajkr(akctVar);
    }

    public final boolean d() {
        if ((this.k instanceof ajkp) && (this.j instanceof ajkp) && (this.l instanceof ajkp) && (this.m instanceof ajkp)) {
            return true;
        }
        return false;
    }

    public final boolean e(RectF rectF) {
        boolean z;
        boolean z2;
        if (this.i.getClass().equals(ajki.class) && this.g.getClass().equals(ajki.class) && this.f.getClass().equals(ajki.class) && this.h.getClass().equals(ajki.class)) {
            z = true;
        } else {
            z = false;
        }
        float a2 = this.b.a(rectF);
        if (this.c.a(rectF) == a2 && this.e.a(rectF) == a2 && this.d.a(rectF) == a2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2 && d()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        ajkg ajkgVar = this.e;
        ajkg ajkgVar2 = this.d;
        ajkg ajkgVar3 = this.c;
        return "[" + String.valueOf(this.b) + ", " + String.valueOf(ajkgVar3) + ", " + String.valueOf(ajkgVar2) + ", " + String.valueOf(ajkgVar) + "]";
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ajkg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [ajkg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ajkg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ajkg, java.lang.Object] */
    public ajkr(akct akctVar) {
        this.j = (ajki) akctVar.e;
        this.k = (ajki) akctVar.g;
        this.l = (ajki) akctVar.c;
        this.m = (ajki) akctVar.j;
        this.b = akctVar.d;
        this.c = akctVar.k;
        this.d = akctVar.f;
        this.e = akctVar.b;
        this.f = (ajki) akctVar.a;
        this.g = (ajki) akctVar.i;
        this.h = (ajki) akctVar.l;
        this.i = (ajki) akctVar.h;
    }
}
