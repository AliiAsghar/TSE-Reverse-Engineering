package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ki {
    public pu a;
    private final View b;
    private pu e;
    private pu f;
    private int d = -1;
    private final km c = km.d();

    public ki(View view) {
        this.b = view;
    }

    public final void a() {
        Drawable background = this.b.getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new pu();
                }
                pu puVar = this.f;
                puVar.a = null;
                puVar.d = false;
                puVar.b = null;
                puVar.c = false;
                ColorStateList c = edz.c(this.b);
                if (c != null) {
                    puVar.d = true;
                    puVar.a = c;
                }
                PorterDuff.Mode d = edz.d(this.b);
                if (d != null) {
                    puVar.c = true;
                    puVar.b = d;
                }
                if (puVar.d || puVar.c) {
                    or.g(background, puVar, this.b.getDrawableState());
                    return;
                }
            }
            pu puVar2 = this.a;
            if (puVar2 != null) {
                or.g(background, puVar2, this.b.getDrawableState());
                return;
            }
            pu puVar3 = this.e;
            if (puVar3 != null) {
                or.g(background, puVar3, this.b.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        ktk A = ktk.A(this.b.getContext(), attributeSet, gc.B, i, 0);
        Object obj = A.b;
        View view = this.b;
        eek.m(view, view.getContext(), gc.B, attributeSet, (TypedArray) obj, i, 0);
        try {
            if (A.v(0)) {
                this.d = A.n(0, -1);
                ColorStateList a = this.c.a(this.b.getContext(), this.d);
                if (a != null) {
                    d(a);
                }
            }
            if (A.v(1)) {
                edz.h(this.b, A.o(1));
            }
            if (A.v(2)) {
                edz.i(this.b, a.u(A.k(2, -1), null));
            }
        } finally {
            A.t();
        }
    }

    public final void c(int i) {
        ColorStateList colorStateList;
        this.d = i;
        km kmVar = this.c;
        if (kmVar != null) {
            colorStateList = kmVar.a(this.b.getContext(), i);
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new pu();
            }
            pu puVar = this.e;
            puVar.a = colorStateList;
            puVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
