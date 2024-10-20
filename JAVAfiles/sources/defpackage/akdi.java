package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdi implements akcq {
    public static final alvi a = alvi.m("com/google/apps/tiktok/contrib/work/impl/WipeoutWorker");
    public final Executor b;
    public final aogy d;
    private final ansy h;
    private final andy e = new adoa(2);
    private final andy f = new adoa(3);
    public final andy c = new adoa(4);
    private final andy g = new adoa(5);

    public akdi(ansy ansyVar, Executor executor, aogy aogyVar) {
        this.h = ansyVar;
        this.b = executor;
        this.d = aogyVar;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, akda] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        ListenableFuture f = this.d.b.f(ico.L("tiktok_account_work"));
        ansy ansyVar = (ansy) this.h.a;
        int i = 15;
        ListenableFuture Y = aktp.Y(((ahiy) ansyVar.a).y(), new ajwz(i), ansyVar.b);
        ListenableFuture m = aktp.as(f, Y).m(new ahes(Y, f, i), this.b);
        aktp.aa(m, this.e, this.b);
        ListenableFuture Y2 = aktp.Y(m, new ajyn(this, 17), this.b);
        aktp.aa(Y2, this.f, this.b);
        ListenableFuture Z = aktp.Z(Y2, new ajzp(this, 7), this.b);
        aktp.aa(Z, this.g, this.b);
        return aktp.as(Y2, Z).m(new agug(9), this.b);
    }
}
