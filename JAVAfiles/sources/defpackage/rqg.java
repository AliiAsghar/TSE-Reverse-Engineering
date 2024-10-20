package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqg implements rjy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl");
    public static final asgm f = new asgm();
    public final rkb b;
    public final armf c;
    public final armf d;
    public final armf e;
    private final arwe g;
    private final lrf h;
    private final ibi i;
    private final uie j;

    public rqg(ibi ibiVar, lrf lrfVar, uie uieVar, rkb rkbVar, armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar) {
        rkbVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.i = ibiVar;
        this.h = lrfVar;
        this.j = uieVar;
        this.b = rkbVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.g = arweVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    @Override // defpackage.rjy
    public final Object a(File file, rpl rplVar, arpe arpeVar) {
        ahjj ahjjVar = new ahjj((armf) this.i.a, (byte[]) null);
        lrf lrfVar = this.h;
        arwe arweVar = (arwe) lrfVar.a.b();
        arweVar.getClass();
        rpq rpqVar = new rpq(lrfVar.b, lrfVar.c, arweVar);
        uie uieVar = this.j;
        qya qyaVar = (qya) uieVar.a.b();
        qyaVar.getClass();
        lrf lrfVar2 = new lrf((armf) uieVar.b, qyaVar, rplVar);
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl", "restoreFromBackupDatabase", 60, "DatabaseRestorerImpl.kt")).q("Starting restoreFromBackupDatabase");
        Object q = arro.q(this.g.b(), new rqf(this, file, ahjjVar, rpqVar, lrfVar2, null), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final void b() {
        rkb rkbVar = this.b;
        rkb.f(rkbVar.b(), rkbVar.a(), "backupDb");
    }
}
