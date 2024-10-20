package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akpa implements akcq {
    public static final alvi a = alvi.m("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker");
    public static final akcv b = new akcv(1, TimeUnit.DAYS);
    public final akov c;
    public final anen d;
    public final agrk e;
    public final aogy f;
    private final akoi g;
    private final boolean h;

    public akpa(akoi akoiVar, aogy aogyVar, akov akovVar, anen anenVar, agrk agrkVar, boolean z) {
        this.g = akoiVar;
        this.f = aogyVar;
        this.c = akovVar;
        this.d = anenVar;
        this.e = agrkVar;
        this.h = z;
    }

    public static String d(algw algwVar) {
        return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker".concat("");
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        if (!this.h) {
            return c(workerParameters);
        }
        if (this.c instanceof akpc) {
            return ancd.f(aktp.Y(aktp.Z(this.g.b(), new akoz((Object) this, workerParameters, 2), this.d), new akdg(10), andi.a), Throwable.class, akto.a(new akdg(11)), andi.a);
        }
        return aktp.Z(this.g.a(), akto.d(new akoz((Object) this, workerParameters, 3)), this.d);
    }

    public final ListenableFuture c(WorkerParameters workerParameters) {
        Set set = workerParameters.c;
        return akec.f(aktp.Z(this.f.s((String) alzz.ay(set.iterator(), new evp(17))), new akoz((Object) this, workerParameters, 0), this.d), new agug(12), andi.a);
    }
}
