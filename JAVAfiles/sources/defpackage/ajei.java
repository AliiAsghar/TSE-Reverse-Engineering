package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajei extends ajec {
    final /* synthetic */ ajek a;

    public ajei(ajek ajekVar) {
        this.a = ajekVar;
    }

    @Override // defpackage.ajec
    public final void b(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }

    @Override // defpackage.ajec
    public final void c(View view) {
    }
}
