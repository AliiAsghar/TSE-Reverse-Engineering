package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efo {
    public static final efo a;
    public final efm b;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = efl.c;
        } else {
            a = efm.d;
        }
    }

    private efo(WindowInsets windowInsets) {
        this.b = Build.VERSION.SDK_INT >= 30 ? new efl(this, windowInsets) : Build.VERSION.SDK_INT >= 29 ? new efk(this, windowInsets) : Build.VERSION.SDK_INT >= 28 ? new efj(this, windowInsets) : new efi(this, windowInsets);
    }

    public static eaq i(eaq eaqVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, eaqVar.b - i);
        int max2 = Math.max(0, eaqVar.c - i2);
        int max3 = Math.max(0, eaqVar.d - i3);
        int max4 = Math.max(0, eaqVar.e - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return eaqVar;
        }
        return eaq.d(max, max2, max3, max4);
    }

    public static efo o(WindowInsets windowInsets) {
        return p(windowInsets, null);
    }

    public static efo p(WindowInsets windowInsets, View view) {
        dye.i(windowInsets);
        efo efoVar = new efo(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            efoVar.s(eea.a(view));
            efoVar.q(view.getRootView());
        }
        return efoVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        efm efmVar = this.b;
        if (efmVar instanceof efh) {
            return ((efh) efmVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efo)) {
            return false;
        }
        return Objects.equals(this.b, ((efo) obj).b);
    }

    public final eaq f(int i) {
        return this.b.a(i);
    }

    public final eaq g(int i) {
        return this.b.c(i);
    }

    @Deprecated
    public final eaq h() {
        return this.b.m();
    }

    public final int hashCode() {
        efm efmVar = this.b;
        if (efmVar == null) {
            return 0;
        }
        return efmVar.hashCode();
    }

    public final ecy j() {
        return this.b.r();
    }

    @Deprecated
    public final efo k() {
        return this.b.s();
    }

    @Deprecated
    public final efo l() {
        return this.b.n();
    }

    @Deprecated
    public final efo m() {
        return this.b.o();
    }

    public final efo n(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(View view) {
        this.b.f(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(eaq[] eaqVarArr) {
        this.b.g(eaqVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(efo efoVar) {
        this.b.i(efoVar);
    }

    public final boolean t() {
        return this.b.q();
    }

    public efo() {
        this.b = new efm(this);
    }
}
