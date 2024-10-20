package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class leh extends lei {
    public final /* synthetic */ lek a;
    private final ListenableFuture c;

    public leh(lek lekVar, String str, int i, int i2, int i3) {
        this.a = lekVar;
        yks yksVar = (yks) lekVar.h.b();
        akul e = akul.g(akul.g(agkx.f(((aibx) yksVar.d.b()).b(aibl.b(str, yksVar.b).W()))).i(new xdg(13), yksVar.c).e(Throwable.class, new yeb(16), yksVar.c)).i(akto.d(new ryd(yksVar, i, i2, 2)), yksVar.c).e(Throwable.class, new yeb(17), yksVar.c);
        this.c = e;
        andy agvwVar = new agvw(this, str, i3, 1);
        albo.bR(e, ((Boolean) lekVar.g.b()).booleanValue() ? agvwVar : qjc.a(agvwVar), lekVar.f);
    }

    @Override // defpackage.lei
    public final void a() {
        super.a();
        this.c.cancel(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
