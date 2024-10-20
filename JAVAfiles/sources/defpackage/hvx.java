package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvx implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    public final /* synthetic */ hvy b;

    public hvx(hvy hvyVar, View view) {
        this.a = view;
        this.b = hvyVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        hyv.j(new faq(this, this.a, (ViewTreeObserver.OnDrawListener) this, 17));
    }
}
