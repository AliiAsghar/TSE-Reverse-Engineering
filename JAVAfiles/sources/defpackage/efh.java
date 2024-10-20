package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class efh extends efm {
    private static boolean c = false;
    private static Method f;
    private static Class g;
    private static Field h;
    private static Field i;
    final WindowInsets a;
    eaq b;
    private eaq[] j;
    private eaq k;
    private efo l;

    public efh(efo efoVar, WindowInsets windowInsets) {
        super(efoVar);
        this.k = null;
        this.a = windowInsets;
    }

    private eaq w(int i2, boolean z) {
        eaq eaqVar = eaq.a;
        for (int i3 = 1; i3 <= 256; i3 += i3) {
            if ((i2 & i3) != 0) {
                eaqVar = eaq.b(eaqVar, b(i3, z));
            }
        }
        return eaqVar;
    }

    private eaq x() {
        efo efoVar = this.l;
        if (efoVar != null) {
            return efoVar.h();
        }
        return eaq.a;
    }

    private eaq y(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!c) {
                z();
            }
            Method method = f;
            if (method != null && g != null && h != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) h.get(i.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return eaq.c(rect);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void z() {
        try {
            f = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            g = cls;
            h = cls.getDeclaredField("mVisibleInsets");
            i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            h.setAccessible(true);
            i.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
        }
        c = true;
    }

    @Override // defpackage.efm
    public eaq a(int i2) {
        return w(i2, false);
    }

    protected eaq b(int i2, boolean z) {
        eaq eaqVar;
        ecy r;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i2 != 1) {
            eaq eaqVar2 = null;
            if (i2 != 2) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 != 64) {
                                if (i2 == 128) {
                                    efo efoVar = this.l;
                                    if (efoVar != null) {
                                        r = efoVar.j();
                                    } else {
                                        r = r();
                                    }
                                    if (r != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i3 = r.a.getSafeInsetLeft();
                                        } else {
                                            i3 = 0;
                                        }
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i4 = r.a.getSafeInsetTop();
                                        } else {
                                            i4 = 0;
                                        }
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i5 = r.a.getSafeInsetRight();
                                        } else {
                                            i5 = 0;
                                        }
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i6 = r.a.getSafeInsetBottom();
                                        }
                                        return eaq.d(i3, i4, i5, i6);
                                    }
                                }
                            } else {
                                return v();
                            }
                        } else {
                            return t();
                        }
                    } else {
                        return u();
                    }
                } else {
                    eaq[] eaqVarArr = this.j;
                    if (eaqVarArr != null) {
                        eaqVar2 = eaqVarArr[eeb.b(8)];
                    }
                    if (eaqVar2 != null) {
                        return eaqVar2;
                    }
                    eaq d = d();
                    eaq x = x();
                    int i7 = d.e;
                    if (i7 > x.e || ((eaqVar = this.b) != null && !eaqVar.equals(eaq.a) && (i7 = this.b.e) > x.e)) {
                        return eaq.d(0, 0, 0, i7);
                    }
                }
                return eaq.a;
            }
            if (z) {
                eaq x2 = x();
                eaq m = m();
                return eaq.d(Math.max(x2.b, m.b), 0, Math.max(x2.d, m.d), Math.max(x2.e, m.e));
            }
            eaq d2 = d();
            efo efoVar2 = this.l;
            if (efoVar2 != null) {
                eaqVar2 = efoVar2.h();
            }
            int i8 = d2.e;
            if (eaqVar2 != null) {
                i8 = Math.min(i8, eaqVar2.e);
            }
            return eaq.d(d2.b, 0, d2.d, i8);
        }
        if (z) {
            return eaq.d(0, Math.max(x().c, d().c), 0, 0);
        }
        return eaq.d(0, d().c, 0, 0);
    }

    @Override // defpackage.efm
    public eaq c(int i2) {
        return w(i2, true);
    }

    @Override // defpackage.efm
    public final eaq d() {
        if (this.k == null) {
            WindowInsets windowInsets = this.a;
            this.k = eaq.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.k;
    }

    @Override // defpackage.efm
    public efo e(int i2, int i3, int i4, int i5) {
        efg efdVar;
        efo o = efo.o(this.a);
        if (Build.VERSION.SDK_INT >= 30) {
            efdVar = new eff(o);
        } else if (Build.VERSION.SDK_INT >= 29) {
            efdVar = new efe(o);
        } else {
            efdVar = new efd(o);
        }
        efdVar.c(efo.i(d(), i2, i3, i4, i5));
        efdVar.b(efo.i(m(), i2, i3, i4, i5));
        return efdVar.a();
    }

    @Override // defpackage.efm
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.b, ((efh) obj).b);
    }

    @Override // defpackage.efm
    public void f(View view) {
        eaq y = y(view);
        if (y == null) {
            y = eaq.a;
        }
        h(y);
    }

    @Override // defpackage.efm
    public void g(eaq[] eaqVarArr) {
        this.j = eaqVarArr;
    }

    public void h(eaq eaqVar) {
        this.b = eaqVar;
    }

    @Override // defpackage.efm
    public void i(efo efoVar) {
        this.l = efoVar;
    }

    @Override // defpackage.efm
    public boolean j() {
        return this.a.isRound();
    }

    protected boolean k(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        if (b(i2, false).equals(eaq.a)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.efm
    public boolean l(int i2) {
        for (int i3 = 1; i3 <= 256; i3 += i3) {
            if ((i2 & i3) != 0 && !k(i3)) {
                return false;
            }
        }
        return true;
    }
}
