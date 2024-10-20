package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class efk extends efj {
    private eaq c;
    private eaq f;
    private eaq g;

    public efk(efo efoVar, WindowInsets windowInsets) {
        super(efoVar, windowInsets);
        this.c = null;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.efh, defpackage.efm
    public efo e(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.a.inset(i, i2, i3, i4);
        return efo.o(inset);
    }

    @Override // defpackage.efm
    public eaq t() {
        Insets mandatorySystemGestureInsets;
        if (this.f == null) {
            mandatorySystemGestureInsets = this.a.getMandatorySystemGestureInsets();
            this.f = eaq.e(mandatorySystemGestureInsets);
        }
        return this.f;
    }

    @Override // defpackage.efm
    public eaq u() {
        Insets systemGestureInsets;
        if (this.c == null) {
            systemGestureInsets = this.a.getSystemGestureInsets();
            this.c = eaq.e(systemGestureInsets);
        }
        return this.c;
    }

    @Override // defpackage.efm
    public eaq v() {
        Insets tappableElementInsets;
        if (this.g == null) {
            tappableElementInsets = this.a.getTappableElementInsets();
            this.g = eaq.e(tappableElementInsets);
        }
        return this.g;
    }

    @Override // defpackage.efi, defpackage.efm
    public void p(eaq eaqVar) {
    }
}
