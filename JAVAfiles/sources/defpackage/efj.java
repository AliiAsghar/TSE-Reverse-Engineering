package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class efj extends efi {
    public efj(efo efoVar, WindowInsets windowInsets) {
        super(efoVar, windowInsets);
    }

    @Override // defpackage.efh, defpackage.efm
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efj)) {
            return false;
        }
        efj efjVar = (efj) obj;
        if (Objects.equals(this.a, efjVar.a) && Objects.equals(this.b, efjVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.efm
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.efm
    public ecy r() {
        DisplayCutout displayCutout;
        displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ecy(displayCutout);
    }

    @Override // defpackage.efm
    public efo s() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.a.consumeDisplayCutout();
        return efo.o(consumeDisplayCutout);
    }
}
