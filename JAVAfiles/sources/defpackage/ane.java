package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ane implements bxh {
    final /* synthetic */ anf a;
    final /* synthetic */ View b;

    public ane(anf anfVar, View view) {
        this.a = anfVar;
        this.b = view;
    }

    @Override // defpackage.bxh
    public final void a() {
        anf anfVar = this.a;
        int i = anfVar.i - 1;
        anfVar.i = i;
        if (i == 0) {
            View view = this.b;
            edz.k(view, null);
            mka.i(view, null);
            view.removeOnAttachStateChangeListener(anfVar.j);
        }
    }
}
