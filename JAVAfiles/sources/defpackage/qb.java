package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qb implements View.OnClickListener {
    final hx a;
    final /* synthetic */ qd b;

    public qb(qd qdVar) {
        this.b = qdVar;
        this.a = new hx(qdVar.a.getContext(), qdVar.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qd qdVar = this.b;
        Window.Callback callback = qdVar.e;
        if (callback != null && qdVar.f) {
            callback.onMenuItemSelected(0, this.a);
        }
    }
}
