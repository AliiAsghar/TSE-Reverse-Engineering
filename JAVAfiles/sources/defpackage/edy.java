package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class edy implements View.OnApplyWindowInsetsListener {
    efo a = null;
    final /* synthetic */ View b;
    final /* synthetic */ edh c;

    public edy(View view, edh edhVar) {
        this.b = view;
        this.c = edhVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        efo p = efo.p(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            edz.g(windowInsets, this.b);
            if (p.equals(this.a)) {
                return this.c.ez(view, p).e();
            }
        }
        this.a = p;
        efo ez = this.c.ez(view, p);
        if (Build.VERSION.SDK_INT >= 30) {
            return ez.e();
        }
        edx.c(view);
        return ez.e();
    }
}
