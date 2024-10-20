package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fe extends ees {
    final /* synthetic */ ff a;

    public fe(ff ffVar) {
        this.a = ffVar;
    }

    @Override // defpackage.ees, defpackage.eer
    public final void a() {
        this.a.a.s.setVisibility(8);
        fo foVar = this.a.a;
        PopupWindow popupWindow = foVar.t;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (foVar.s.getParent() instanceof View) {
            edx.c((View) this.a.a.s.getParent());
        }
        this.a.a.s.i();
        this.a.a.N.g(null);
        fo foVar2 = this.a.a;
        foVar2.N = null;
        edx.c(foVar2.x);
    }
}
