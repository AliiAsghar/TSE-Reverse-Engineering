package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ageg extends aged {
    private final arml j;

    public ageg(Context context, adwo adwoVar, da daVar, agdq agdqVar, agak agakVar) {
        super(context, adwoVar, daVar, agdqVar, agakVar);
        this.j = armd.a(new agef(agdqVar, 0));
    }

    private final PopupWindow n() {
        return (PopupWindow) this.j.a();
    }

    @Override // defpackage.aged
    public final void e() {
        super.e();
        n().dismiss();
    }

    @Override // defpackage.aged
    public final void i(int i, boolean z) {
        super.i(i, z);
        n().setHeight(i);
    }

    @Override // defpackage.aged
    public final void k(int i, int i2) {
        super.k(i, i2);
        n().setHeight(i2);
        ViewGroup.LayoutParams layoutParams = n().getContentView().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new WindowManager.LayoutParams();
        }
        layoutParams.width = -1;
        layoutParams.height = i2;
        n().getContentView().setLayoutParams(layoutParams);
        n().showAtLocation(this.c.c, 80, 0, i);
    }
}
