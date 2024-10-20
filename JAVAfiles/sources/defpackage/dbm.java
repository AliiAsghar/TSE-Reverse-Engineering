package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbm implements bxh {
    final /* synthetic */ Context a;
    final /* synthetic */ dbo b;

    public dbm(Context context, dbo dboVar) {
        this.a = context;
        this.b = dboVar;
    }

    @Override // defpackage.bxh
    public final void a() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
