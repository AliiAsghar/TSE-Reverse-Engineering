package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jp extends it {
    final /* synthetic */ jq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(jq jqVar, Context context, ij ijVar, View view) {
        super(context, ijVar, view, true);
        this.d = jqVar;
        this.b = 8388613;
        e(jqVar.l);
    }

    @Override // defpackage.it
    public final void c() {
        ij ijVar = this.d.c;
        if (ijVar != null) {
            ijVar.close();
        }
        this.d.i = null;
        super.c();
    }
}
