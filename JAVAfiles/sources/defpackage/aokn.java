package defpackage;

import android.content.pm.PackageManager;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokn extends aqww {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ alpt b;
    final /* synthetic */ abqq c;

    public aokn(PackageManager packageManager, alpt alptVar, abqq abqqVar) {
        this.a = packageManager;
        this.b = alptVar;
        this.c = abqqVar;
    }

    @Override // defpackage.aqww
    public final Status a(int i) {
        String[] packagesForUid = this.a.getPackagesForUid(i);
        if (packagesForUid != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= packagesForUid.length) {
                    break;
                }
                if (this.b.contains(packagesForUid[i2])) {
                    if (this.c.d(i)) {
                        return Status.b;
                    }
                } else {
                    i2++;
                }
            }
        }
        return Status.h.withDescription("Rejected by (1st-party only Allowlist) security policy");
    }
}
