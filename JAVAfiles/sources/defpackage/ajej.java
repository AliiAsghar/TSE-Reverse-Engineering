package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajej extends ajec {
    private final Boolean a;
    private final efo b;
    private Window c;
    private boolean d;

    public ajej(View view, efo efoVar) {
        ColorStateList c;
        Integer num;
        this.b = efoVar;
        ajkm ajkmVar = BottomSheetBehavior.N(view).d;
        if (ajkmVar != null) {
            c = ajkmVar.A();
        } else {
            c = edz.c(view);
        }
        if (c == null) {
            ColorStateList d = ajgl.d(view.getBackground());
            if (d != null) {
                num = Integer.valueOf(d.getDefaultColor());
            } else {
                num = null;
            }
            if (num != null) {
                this.a = Boolean.valueOf(ahnz.k(num.intValue()));
                return;
            } else {
                this.a = null;
                return;
            }
        }
        this.a = Boolean.valueOf(ahnz.k(c.getDefaultColor()));
    }

    private final void e(View view) {
        boolean booleanValue;
        if (view.getTop() < this.b.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                if (bool == null) {
                    booleanValue = this.d;
                } else {
                    booleanValue = bool.booleanValue();
                }
                ajgk.f(window, booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), this.b.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                ajgk.f(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.ajec
    public final void a(View view) {
        e(view);
    }

    @Override // defpackage.ajec
    public final void b(View view, int i) {
        e(view);
    }

    @Override // defpackage.ajec
    public final void c(View view) {
        e(view);
    }

    public final void d(Window window) {
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                this.d = new efu(window, window.getDecorView()).c();
            }
        }
    }
}
