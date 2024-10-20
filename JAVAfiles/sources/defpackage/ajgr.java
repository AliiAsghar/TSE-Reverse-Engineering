package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajgr implements ajhc {
    final /* synthetic */ ExtendedFloatingActionButton a;
    private final /* synthetic */ int b;

    public ajgr(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        this.b = i;
        this.a = extendedFloatingActionButton;
    }

    @Override // defpackage.ajhc
    public final int a() {
        if (this.b != 0) {
            return this.a.l();
        }
        return this.a.getMeasuredHeight();
    }

    @Override // defpackage.ajhc
    public final int b() {
        if (this.b != 0) {
            return this.a.k();
        }
        return this.a.q;
    }

    @Override // defpackage.ajhc
    public final int c() {
        if (this.b != 0) {
            return this.a.k();
        }
        return this.a.p;
    }

    @Override // defpackage.ajhc
    public final int d() {
        if (this.b != 0) {
            return this.a.l();
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        int measuredWidth = extendedFloatingActionButton.getMeasuredWidth();
        int k = extendedFloatingActionButton.k();
        int i = measuredWidth - (k + k);
        ExtendedFloatingActionButton extendedFloatingActionButton2 = this.a;
        return i + extendedFloatingActionButton2.p + extendedFloatingActionButton2.q;
    }

    @Override // defpackage.ajhc
    public final ViewGroup.LayoutParams e() {
        if (this.b != 0) {
            return new ViewGroup.LayoutParams(d(), a());
        }
        return new ViewGroup.LayoutParams(-2, -2);
    }
}
