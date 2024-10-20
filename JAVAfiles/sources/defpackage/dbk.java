package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbk extends arrp implements arqr<bxi, bxh> {
    final /* synthetic */ Context a;
    final /* synthetic */ dbl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbk(Context context, dbl dblVar) {
        super(1);
        this.a = context;
        this.b = dblVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        this.a.getApplicationContext().registerComponentCallbacks(this.b);
        return new dbj(this.a, this.b);
    }
}
