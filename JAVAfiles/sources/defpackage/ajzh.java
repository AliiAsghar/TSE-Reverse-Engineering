package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzh implements akfb {
    private final ajzk a;
    private final ansy b;

    public ajzh(ansy ansyVar, ajzk ajzkVar) {
        this.b = ansyVar;
        this.a = ajzkVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.akfb
    public final andc a() {
        ansy ansyVar = (ansy) this.b.a;
        Object obj = ansyVar.a;
        ListenableFuture d = this.a.d();
        ListenableFuture Y = aktp.Y(((ahiy) obj).y(), new ajwz(14), ansyVar.b);
        return new andc(albo.bY(d, Y).a(akto.k(new ahes(d, Y, 11)), andi.a));
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        return this.a.a();
    }

    @Override // defpackage.akfb
    public final Object c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
