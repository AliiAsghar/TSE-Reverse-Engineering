package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class efp extends eec {
    protected final Window a;

    public efp(Window window) {
        this.a = window;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i) {
        this.a.clearFlags(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        this.a.addFlags(Integer.MIN_VALUE);
    }
}
