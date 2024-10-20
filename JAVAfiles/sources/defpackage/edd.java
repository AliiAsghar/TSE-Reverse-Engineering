package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edd {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public edd(View view) {
        this.d = view;
    }

    private final ViewParent j(int i) {
        if (i != 0) {
            return this.c;
        }
        return this.b;
    }

    private final void k(int i, ViewParent viewParent) {
        if (i != 0) {
            this.c = viewParent;
        } else {
            this.b = viewParent;
        }
    }

    private final int[] l() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public final void a(boolean z) {
        if (this.a) {
            edz.m(this.d);
        }
        this.a = z;
    }

    public final void b(int i) {
        ViewParent j = j(i);
        if (j != null) {
            edz.r(j, this.d, i);
            k(i, null);
        }
    }

    public final boolean c(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (this.a && (viewParent = this.b) != null) {
            return edz.s(viewParent, this.d, f, f2, z);
        }
        return false;
    }

    public final boolean d(float f, float f2) {
        ViewParent viewParent;
        if (this.a && (viewParent = this.b) != null) {
            return edz.t(viewParent, this.d, f, f2);
        }
        return false;
    }

    public final boolean e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent j;
        int i4;
        int i5;
        int i6;
        if (!this.a || (j = j(i3)) == null) {
            return false;
        }
        if (i == 0) {
            if (i2 != 0) {
                i4 = 0;
            } else {
                if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                return false;
            }
        } else {
            i4 = i;
        }
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            iArr2 = null;
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = l();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        edz.o(j, this.d, i4, i2, iArr, i3);
        if (iArr2 != null) {
            this.d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr) {
        return g(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.a || (j = j(i5)) == null) {
            return false;
        }
        if (i == 0) {
            if (i2 == 0) {
                if (i3 == 0) {
                    if (i4 != 0) {
                        i6 = 0;
                        i7 = 0;
                        i8 = 0;
                    } else {
                        if (iArr4 != null) {
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                        }
                        return false;
                    }
                } else {
                    i8 = i3;
                    i6 = 0;
                    i7 = 0;
                }
            } else {
                i7 = i2;
                i8 = i3;
                i6 = 0;
            }
        } else {
            i6 = i;
            i7 = i2;
            i8 = i3;
        }
        if (iArr4 != null) {
            this.d.getLocationInWindow(iArr4);
            i9 = iArr4[0];
            i10 = iArr4[1];
        } else {
            iArr4 = null;
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] l = l();
            l[0] = 0;
            l[1] = 0;
            iArr3 = l;
        } else {
            iArr3 = iArr2;
        }
        edz.p(j, this.d, i6, i7, i8, i4, i5, iArr3);
        if (iArr4 != null) {
            this.d.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i9;
            iArr4[1] = iArr4[1] - i10;
        }
        return true;
    }

    public final boolean h(int i) {
        if (j(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean i(int i, int i2) {
        if (h(i2)) {
            return true;
        }
        if (this.a) {
            View view = this.d;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (edz.u(parent, view, this.d, i, i2)) {
                    k(i2, parent);
                    edz.q(parent, view, this.d, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }
}
