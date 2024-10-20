package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rps implements rpi {
    public static final rps a = new rps();
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/CombinedConversationsWriterWorkflowSteps");

    private rps() {
    }

    @Override // defpackage.rpi
    public final int a() {
        return rpz.a.a();
    }

    @Override // defpackage.rpi
    public final void b(agpc agpcVar) {
        rpz.a.b(null);
        rpx.a.b(null);
        rpu.a.b(null);
        rpw.a.b(null);
    }

    @Override // defpackage.rpi
    public final void c() {
        int v;
        rpz.a.c();
        v = vom.v(rpy.a, 5);
        alvw d = b.d();
        d.X(alwp.a, "BugleBackup");
        ((alvg) d.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/CombinedConversationsWriterWorkflowSteps", "findAndMarkDuplicates", 87, "BatchedConversationsRestoreTableWriter.kt")).r("[conversations] found %d duplicate non-RCS-Group conversations by participants.", v);
        rpx.a.c();
        rpu.a.c();
        rpw.a.c();
    }

    @Override // defpackage.rpi
    public final void d() {
        rpz.a.d();
        rpx.a.d();
        rpu.a.d();
        rpw.a.d();
    }

    @Override // defpackage.rpi
    public final void f() {
        rpz.a.f();
        rpx.a.f();
        rpu.a.f();
        rpw.a.f();
    }

    @Override // defpackage.rpi
    public final void g(int i, agpj agpjVar) {
        rpz.a.g(i, null);
        rko a2 = rkq.a();
        jat jatVar = rkq.e;
        Object obj = jatVar.d;
        agmh agmhVar = (agmh) obj;
        rpx.a.g(i, rpk.a(a2, agmhVar, (agmh) jatVar.c, rpk.a, rpk.f));
        rko a3 = rkq.a();
        jat jatVar2 = rkq.e;
        Object obj2 = jatVar2.d;
        agmh agmhVar2 = (agmh) obj2;
        rpu.a.g(i, rpk.a(a3, agmhVar2, (agmh) jatVar2.c, rpk.a, rpk.e));
        rkx rkxVar = new rkx(rkz.a);
        qya qyaVar = rkz.e;
        Object obj3 = qyaVar.c;
        agmh agmhVar3 = (agmh) obj3;
        rpw.a.g(i, rpk.a(rkxVar, agmhVar3, (agmh) qyaVar.a, rpk.a, rpk.h));
    }

    @Override // defpackage.rpi
    public final /* synthetic */ void e() {
    }
}
