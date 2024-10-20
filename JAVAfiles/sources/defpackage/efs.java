package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class efs extends eec {
    final WindowInsetsController a;
    protected Window b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public efs(android.view.Window r2) {
        /*
            r1 = this;
            android.view.WindowInsetsController r0 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r2)
            r1.<init>(r0)
            r1.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efs.<init>(android.view.Window):void");
    }

    @Override // defpackage.eec
    public final void c(boolean z) {
        if (z) {
            if (this.b != null) {
                i(16);
            }
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            if (this.b != null) {
                j(16);
            }
            this.a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.eec
    public final void d(boolean z) {
        if (z) {
            if (this.b != null) {
                i(8192);
            }
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            if (this.b != null) {
                j(8192);
            }
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.eec
    public boolean e() {
        int systemBarsAppearance;
        this.a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        if ((systemBarsAppearance & 16) == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.eec
    public boolean f() {
        int systemBarsAppearance;
        this.a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) == 0) {
            return false;
        }
        return true;
    }

    protected final void i(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void j(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public efs(WindowInsetsController windowInsetsController) {
        new vl();
        this.a = windowInsetsController;
    }
}
