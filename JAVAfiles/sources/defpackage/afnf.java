package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afnf implements agva {
    public final Context a;
    public final afxz b;
    private final arml c;

    public afnf(Context context, afxz afxzVar) {
        context.getClass();
        this.a = context;
        this.b = afxzVar;
        this.c = armd.a(new afjm(this, 11));
    }

    private final agva f() {
        Object a = this.c.a();
        a.getClass();
        return (agva) a;
    }

    @Override // defpackage.agva
    public final aguz a() {
        return f().a();
    }

    @Override // defpackage.agvb
    public final ListenableFuture b() {
        return f().b();
    }

    @Override // defpackage.agvb
    public final String c(String str) {
        return f().c(str);
    }

    @Override // defpackage.agvb
    public final boolean d(String str) {
        return f().d(str);
    }

    @Override // defpackage.agvb
    public final int e() {
        return f().e();
    }
}
