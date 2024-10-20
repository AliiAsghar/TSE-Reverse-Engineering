package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qob implements akcq {
    public static final alwo a = alwo.o("BugleContacts");
    public final qnu b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final aogy f;
    private final arwe g;

    public qob(arwe arweVar, qnu qnuVar, armf armfVar, aogy aogyVar, armf armfVar2, armf armfVar3) {
        arweVar.getClass();
        qnuVar.getClass();
        armfVar.getClass();
        aogyVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.g = arweVar;
        this.b = qnuVar;
        this.c = armfVar;
        this.f = aogyVar;
        this.d = armfVar2;
        this.e = armfVar3;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final /* bridge */ /* synthetic */ ListenableFuture b(WorkerParameters workerParameters) {
        akul c;
        workerParameters.getClass();
        c = qjh.c(this.g, arpj.a, arwf.a, new iqi(this, workerParameters, (arpe) null, 16));
        return c;
    }
}
