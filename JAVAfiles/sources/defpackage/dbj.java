package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbj implements bxh {
    final /* synthetic */ Context a;
    final /* synthetic */ dbl b;

    public dbj(Context context, dbl dblVar) {
        this.a = context;
        this.b = dblVar;
    }

    @Override // defpackage.bxh
    public final void a() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
