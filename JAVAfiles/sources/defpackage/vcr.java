package defpackage;

import android.net.TrafficStats;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vcr implements Callable {
    private final /* synthetic */ int a;

    public /* synthetic */ vcr(int i) {
        this.a = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        switch (this.a) {
            case 0:
                return atow.x();
            case 2:
                int i = vdr.c;
            case 1:
                return null;
            case 7:
                alwo alwoVar = NotificationsReceiver.a;
            case 3:
            case 4:
            case 5:
            case 6:
                return null;
            case 8:
                alwo alwoVar2 = NotificationsReceiver.a;
                return null;
            case 9:
                ArrayList arrayList = new ArrayList();
                List<acpp> G = acpq.E().G();
                StringBuilder sb = new StringBuilder();
                for (acpp acppVar : G) {
                    sb.append(System.lineSeparator());
                    sb.append(acppVar.b());
                    sb.append("=");
                    sb.append(acppVar.a());
                }
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "RcsFlags"));
                return arrayList;
            case 10:
                alwo alwoVar3 = vtr.a;
                snf e = sni.e();
                e.w("getConversationIdsThatRequireMigration");
                e.h(new vrx(12));
                e.q();
                alog f = e.b().f();
                ((alwl) vtr.a.m().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "getConversationIdsThatRequireMigration", 169, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).r("Attempting RCS group identifiers Telephony data batch migration. Conversations needed to migrate: %d", ((alsx) f).c);
                return f;
            case 11:
                return (String) acpq.E().a().a();
            case 12:
                ((alwl) vyt.a.m().h("com/google/android/apps/messaging/shared/rcs/messaging/LatencyInjector", "delayFuture", 63, "LatencyInjector.java")).q("Reverse sonic complete");
                return null;
            case 13:
                xze xzeVar = DefaultSmsPackageChangedReceiver.a;
                return null;
            case 14:
                alwo alwoVar4 = xha.a;
                return null;
            case 15:
                return upm.b();
            case 16:
                alvi alviVar = yav.d;
                try {
                    try {
                        Socket socket = new Socket();
                        try {
                            TrafficStats.setThreadStatsTag(8960);
                            socket.connect(new InetSocketAddress("8.8.8.8", 53), 1500);
                            socket.close();
                            TrafficStats.clearThreadStatsTag();
                            z = true;
                        } catch (Throwable th) {
                            try {
                                socket.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        alvw d = yav.d.d();
                        d.X(alwp.a, "BugleConnectivity");
                        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isGoogleDnsAvailable", 712, "ConnectivityUtilImpl.java")).q("Cannot connect to Google DNS");
                        TrafficStats.clearThreadStatsTag();
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } catch (Throwable th3) {
                    TrafficStats.clearThreadStatsTag();
                    throw th3;
                }
            case 17:
                return yuu.g();
            case 18:
                return a.bz();
            case 19:
                xze xzeVar2 = aalt.c;
                return null;
            default:
                tpp tppVar = new tpp(tps.a);
                tppVar.w("showToastForVerifiedSmsEligibility");
                return Integer.valueOf(tppVar.b().i());
        }
    }
}
