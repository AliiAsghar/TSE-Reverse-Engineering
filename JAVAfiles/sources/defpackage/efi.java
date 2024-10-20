package defpackage;

import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class efi extends efh {
    private eaq c;

    public efi(efo efoVar, WindowInsets windowInsets) {
        super(efoVar, windowInsets);
        this.c = null;
    }

    @Override // defpackage.efm
    public final eaq m() {
        if (this.c == null) {
            WindowInsets windowInsets = this.a;
            this.c = eaq.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.c;
    }

    @Override // defpackage.efm
    public efo n() {
        return efo.o(this.a.consumeStableInsets());
    }

    @Override // defpackage.efm
    public efo o() {
        return efo.o(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.efm
    public void p(eaq eaqVar) {
        this.c = eaqVar;
    }

    @Override // defpackage.efm
    public boolean q() {
        return this.a.isConsumed();
    }
}
