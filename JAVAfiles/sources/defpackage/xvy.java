package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvy {
    private ViewStub a;
    private View b;
    private final xvx c;
    private int d;
    private final int e;

    public xvy(View view, int i, int i2) {
        this(view, i, i2, (xvx) null);
    }

    public static View c(Class cls, LayoutInflater layoutInflater, View view, int i, int i2, int i3) {
        boolean z;
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        viewStub.getClass();
        viewStub.setLayoutResource(i2);
        viewStub.setLayoutInflater(layoutInflater);
        viewStub.setInflatedId(i3);
        View inflate = viewStub.inflate();
        inflate.getClass();
        if (inflate.getId() == i3) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        albo.T(cls.isInstance(inflate));
        View view2 = (View) cls.cast(inflate);
        view2.getClass();
        return view2;
    }

    public final int a() {
        View view = this.b;
        if (view != null) {
            return view.getVisibility();
        }
        return 8;
    }

    public final View b() {
        ViewStub viewStub;
        if (this.b == null && (viewStub = this.a) != null) {
            if (viewStub.getParent() != null) {
                View inflate = this.a.inflate();
                this.b = inflate;
                xvx xvxVar = this.c;
                if (xvxVar != null) {
                    xvxVar.a(inflate);
                }
            }
            this.a = null;
        }
        return this.b;
    }

    public final void d(Consumer consumer) {
        View view = this.b;
        if (view == null) {
            return;
        }
        consumer.accept(view);
    }

    public final void e() {
        View view;
        g(8);
        if (this.a == null && (view = this.b) != null && this.d != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ViewStub viewStub = new ViewStub(viewGroup.getContext(), this.d);
                viewStub.setInflatedId(view.getId());
                int i = this.e;
                if (i != -1) {
                    viewStub.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(view);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                viewGroup.removeViewInLayout(view);
                if (layoutParams == null) {
                    viewGroup.addView(viewStub, indexOfChild);
                } else {
                    viewGroup.addView(viewStub, indexOfChild, layoutParams);
                }
                this.a = viewStub;
                this.b = null;
            }
        }
    }

    public final void f(int i) {
        this.d = i;
        ViewStub viewStub = this.a;
        if (viewStub != null) {
            viewStub.setLayoutResource(i);
        }
    }

    public final void g(int i) {
        View b;
        if ((this.b != null || i != 8) && (b = b()) != null) {
            b.setVisibility(i);
        }
    }

    public final boolean h() {
        if (this.a == null && this.b == null) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        if (this.a == null && this.b != null) {
            return true;
        }
        return false;
    }

    public xvy(View view, int i, int i2, int i3) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        this.a = viewStub;
        this.d = i3;
        this.c = null;
        if (viewStub == null) {
            this.b = view.findViewById(i2);
            this.d = 0;
            this.e = -1;
        } else {
            viewStub.setLayoutResource(i3);
            this.e = i;
        }
    }

    public xvy(View view, int i, int i2, xvx xvxVar) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        this.a = viewStub;
        if (viewStub == null) {
            this.b = view.findViewById(i2);
            this.d = 0;
            this.e = -1;
        } else {
            this.d = viewStub.getLayoutResource();
            this.e = i;
        }
        this.c = xvxVar;
    }
}
