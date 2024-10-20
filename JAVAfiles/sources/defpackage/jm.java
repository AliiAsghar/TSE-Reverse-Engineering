package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jm extends it {
    final /* synthetic */ jq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(jq jqVar, Context context, jc jcVar, View view) {
        super(context, jcVar, view, false);
        this.d = jqVar;
        if (!jcVar.l.o()) {
            View view2 = jqVar.g;
            this.a = view2 == null ? (View) jqVar.f : view2;
        }
        e(jqVar.l);
    }

    @Override // defpackage.it
    public final void c() {
        this.d.j = null;
        super.c();
    }
}
