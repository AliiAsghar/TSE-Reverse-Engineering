package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akoy implements akcq {
    public final anen a;
    public final aogy b;
    private final akoi c;
    private final akov d;
    private final boolean e;

    public akoy(akoi akoiVar, aogy aogyVar, akov akovVar, anen anenVar, boolean z) {
        this.c = akoiVar;
        this.b = aogyVar;
        this.d = akovVar;
        this.a = anenVar;
        this.e = z;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        if (!this.e) {
            return albo.bI(new gsw());
        }
        if (this.d instanceof akpb) {
            return ancj.f(this.c.b(), akto.a(new akdg(9)), andi.a);
        }
        return ancj.g(this.c.a(), akto.d(new akoz((Object) this, workerParameters, 1)), this.a);
    }
}
