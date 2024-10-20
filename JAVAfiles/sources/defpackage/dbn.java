package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbn extends arrp implements arqr<bxi, bxh> {
    final /* synthetic */ Context a;
    final /* synthetic */ dbo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbn(Context context, dbo dboVar) {
        super(1);
        this.a = context;
        this.b = dboVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        this.a.getApplicationContext().registerComponentCallbacks(this.b);
        return new dbm(this.a, this.b);
    }
}
