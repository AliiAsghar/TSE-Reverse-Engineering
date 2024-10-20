package defpackage;

import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eft extends efs {
    public eft(Window window) {
        super(window);
    }

    @Override // defpackage.efs, defpackage.eec
    public final boolean e() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        if ((systemBarsAppearance & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.efs, defpackage.eec
    public final boolean f() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    public eft(WindowInsetsController windowInsetsController) {
        super(windowInsetsController);
    }
}
