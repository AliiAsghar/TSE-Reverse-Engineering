package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajlh extends ajld {
    public ajlh(View view) {
        e(view);
    }

    private void e(View view) {
        view.setOutlineProvider(new ajlg(this));
    }

    @Override // defpackage.ajld
    public final void a(View view) {
        view.setClipToOutline(!this.a);
        if (this.a) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // defpackage.ajld
    public final boolean d() {
        return this.a;
    }
}
