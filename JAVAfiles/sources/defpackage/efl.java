package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class efl extends efk {
    static final efo c;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        c = efo.o(windowInsets);
    }

    public efl(efo efoVar, WindowInsets windowInsets) {
        super(efoVar, windowInsets);
    }

    @Override // defpackage.efh, defpackage.efm
    public eaq a(int i) {
        Insets insets;
        insets = this.a.getInsets(efn.a(i));
        return eaq.e(insets);
    }

    @Override // defpackage.efh, defpackage.efm
    public eaq c(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.a.getInsetsIgnoringVisibility(efn.a(i));
        return eaq.e(insetsIgnoringVisibility);
    }

    @Override // defpackage.efh, defpackage.efm
    public boolean l(int i) {
        boolean isVisible;
        isVisible = this.a.isVisible(efn.a(i));
        return isVisible;
    }

    @Override // defpackage.efh, defpackage.efm
    public final void f(View view) {
    }
}
