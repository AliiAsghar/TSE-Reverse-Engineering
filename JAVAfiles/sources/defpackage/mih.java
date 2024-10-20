package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mih implements acil {
    private final /* synthetic */ int a;

    public /* synthetic */ mih(int i) {
        this.a = i;
    }

    @Override // defpackage.acil
    public final void d(Exception exc) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    alwo alwoVar = abeu.a;
                    if (exc instanceof abra) {
                        alwl alwlVar = (alwl) ((alwl) abeu.a.i()).g(exc);
                        alwlVar.X(ydl.M, "SyncDataToWearableAppHandler");
                        abra abraVar = (abra) exc;
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 352, "SyncDataToWearableAppHandler.java")).D("Failed to sync phone config to data client with ApiException[status=%s, connectionResult=%s]", abeu.k(abraVar), abeu.j(abraVar));
                        return;
                    }
                    return;
                }
                if ((exc instanceof abra) && ((abra) exc).a() == 17) {
                    return;
                }
                ((alvg) ((alvg) ((alvg) mij.a.i()).g(exc)).h("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/AppInstallCobaltLogger", "logUnexpectedFailure", 77, "AppInstallCobaltLogger.java")).t("Failed to log to Cobalt in GMS Core: %s", exc);
                return;
            }
            xyo e = kot.a.e();
            e.H("Failed to upload the bug report");
            e.r(exc);
            return;
        }
        if ((exc instanceof abra) && ((abra) exc).a() == 17) {
            return;
        }
        ((alvg) ((alvg) ((alvg) mii.a.i()).g(exc)).h("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/ActiveUserActionCobaltLogger", "logUnexpectedFailure", 158, "ActiveUserActionCobaltLogger.java")).t("Failed to log to Cobalt in GMS Core: %s", exc);
    }
}
