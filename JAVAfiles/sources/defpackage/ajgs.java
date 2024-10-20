package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajgs implements ajhc {
    final /* synthetic */ ajhc a;
    final /* synthetic */ ExtendedFloatingActionButton b;

    public ajgs(ExtendedFloatingActionButton extendedFloatingActionButton, ajhc ajhcVar) {
        this.a = ajhcVar;
        this.b = extendedFloatingActionButton;
    }

    @Override // defpackage.ajhc
    public final int a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        int i = extendedFloatingActionButton.v;
        if (i == -1) {
            if (!(extendedFloatingActionButton.getParent() instanceof View)) {
                return this.a.a();
            }
            View view = (View) this.b.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height == -2) {
                return this.a.a();
            }
            int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
            int i2 = 0;
            if ((this.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams()) != null) {
                i2 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            return (view.getHeight() - i2) - paddingTop;
        }
        if (i != 0 && i != -2) {
            return i;
        }
        return this.a.a();
    }

    @Override // defpackage.ajhc
    public final int b() {
        return this.b.q;
    }

    @Override // defpackage.ajhc
    public final int c() {
        return this.b.p;
    }

    @Override // defpackage.ajhc
    public final int d() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!(this.b.getParent() instanceof View)) {
            return this.a.d();
        }
        View view = (View) this.b.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return this.a.d();
        }
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        int i = 0;
        if ((this.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams()) != null) {
            i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i) - paddingLeft;
    }

    @Override // defpackage.ajhc
    public final ViewGroup.LayoutParams e() {
        int i = this.b.v;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }
}
