package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnn {
    public int a;
    public final Object b;

    public asnn() {
        this.b = new int[10];
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final asmq a() {
        if (b()) {
            ?? r0 = this.b;
            int i = this.a;
            this.a = i + 1;
            return (asmq) r0.get(i);
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final boolean b() {
        if (this.a < this.b.size()) {
            return true;
        }
        return false;
    }

    public final int c(int i) {
        return ((int[]) this.b)[i];
    }

    public final int d() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final boolean e(int i) {
        if (((1 << i) & this.a) != 0) {
            return true;
        }
        return false;
    }

    public final void f(int i, int i2) {
        if (i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        ((int[]) this.b)[i] = i2;
    }

    public final void g() {
        if (((ImageView) this.b).getDrawable() != null) {
            ((ImageView) this.b).getDrawable().setLevel(this.a);
        }
    }

    public final void h() {
        Drawable drawable = ((ImageView) this.b).getDrawable();
        if (drawable != null) {
            md.b(drawable);
        }
    }

    public final void i(AttributeSet attributeSet, int i) {
        int n;
        ktk A = ktk.A(((ImageView) this.b).getContext(), attributeSet, gc.g, i, 0);
        Object obj = A.b;
        Object obj2 = this.b;
        eek.m((View) obj2, ((ImageView) obj2).getContext(), gc.g, attributeSet, (TypedArray) obj, i, 0);
        try {
            Drawable drawable = ((ImageView) this.b).getDrawable();
            if (drawable == null && (n = A.n(1, -1)) != -1 && (drawable = d.f(((ImageView) this.b).getContext(), n)) != null) {
                ((ImageView) this.b).setImageDrawable(drawable);
            }
            if (drawable != null) {
                md.b(drawable);
            }
            if (A.v(2)) {
                ((ImageView) this.b).setImageTintList(A.o(2));
            }
            if (A.v(3)) {
                ((ImageView) this.b).setImageTintMode(a.u(A.k(3, -1), null));
            }
        } finally {
            A.t();
        }
    }

    public final void j(Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void k(int i) {
        if (i != 0) {
            Drawable f = d.f(((ImageView) this.b).getContext(), i);
            if (f != null) {
                md.b(f);
            }
            ((ImageView) this.b).setImageDrawable(f);
        } else {
            ((ImageView) this.b).setImageDrawable(null);
        }
        h();
    }

    public final boolean l() {
        if (((ImageView) this.b).getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public final Object m() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void n(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public asnn(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public asnn(fvg fvgVar) {
        this.b = fvgVar;
        this.a = -1;
    }

    public asnn(List list) {
        this.b = list;
    }

    public asnn(byte[] bArr, byte[] bArr2) {
        this.b = new Object[256];
    }

    public asnn(byte[] bArr) {
        this.b = new SparseArray();
        this.a = -1;
    }
}
