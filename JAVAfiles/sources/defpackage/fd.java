package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fd extends ees {
    final /* synthetic */ fo a;

    public fd(fo foVar) {
        this.a = foVar;
    }

    @Override // defpackage.ees, defpackage.eer
    public final void a() {
        this.a.s.setAlpha(1.0f);
        this.a.N.g(null);
        this.a.N = null;
    }

    @Override // defpackage.ees, defpackage.eer
    public final void b() {
        this.a.s.setVisibility(0);
        if (this.a.s.getParent() instanceof View) {
            edx.c((View) this.a.s.getParent());
        }
    }
}
