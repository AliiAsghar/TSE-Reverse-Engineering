package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qle implements akcq {
    public static final alwo a = alwo.o("BugleContacts");
    public final armf b;
    private final arwe c;

    public qle(arwe arweVar, armf armfVar) {
        arweVar.getClass();
        this.c = arweVar;
        this.b = armfVar;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        akul c;
        ((alwl) a.g()).q("Starting periodic contacts import.");
        c = qjh.c(this.c, arpj.a, arwf.a, new mwv(this, (arpe) null, 10));
        return c;
    }
}
