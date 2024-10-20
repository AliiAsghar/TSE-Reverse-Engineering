package defpackage;

import com.google.android.apps.messaging.backup.BugleBackupAgent;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jab implements ancs {
    private final /* synthetic */ int a;

    public /* synthetic */ jab(int i) {
        this.a = i;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = 1;
        switch (this.a) {
            case 0:
                return ((unz) obj).a();
            case 1:
                alvw i2 = BugleBackupAgent.a.i();
                i2.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) ((alvg) i2).g((aqwb) obj)).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setCmsD2dTimestamp", 429, "BugleBackupAgent.java")).q("Failed to get timestamp, Will fall back to dailyRetrievedCmsD2dTimestamp if possible");
                return aktp.ag(apds.b);
            case 2:
                return ((vbq) obj).s();
            case 3:
                acng acngVar = (acng) obj;
                lse.b.r("Error forceNetworkExchange from UceProvider for isOnline().", acngVar);
                return aktp.af(new psx("Unable to refresh capabilities from the uce provider", acngVar));
            case 4:
                acng acngVar2 = (acng) obj;
                xyo e = lse.b.e();
                e.H("Error getting capabilities from UceProvider for getCapabilities(): ");
                e.H(acngVar2.getMessage());
                e.r(acngVar2);
                return aktp.af(new psx("Unable to get capabilities from the uce provider", acngVar2));
            case 5:
                return ((unz) obj).a();
            case 6:
                return aktp.ag(mfc.a((mfb) obj));
            case 7:
                return ((unz) obj).a();
            case 8:
                boolean noneMatch = Collection.EL.stream((List) obj).noneMatch(new mmd(i));
                alwl alwlVar = (alwl) ((alwl) mmg.a.g()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "getOrCreateConversation", 269, "DefaultConversationRepository.java");
                Boolean valueOf = Boolean.valueOf(noneMatch);
                alwlVar.t("Verified cached RCS availability for the participants, isGroupRcs = %b.", valueOf);
                return aktp.ag(valueOf);
            case 9:
                return aktp.af(new psx("RetryingFuture failed to fetch RCS capabilities for batch.", ((amdk) obj).getCause()));
            case 10:
                return aktp.af(new psx("RetryingFuture failed to fetch RCS capabilities.", ((amdk) obj).getCause()));
            case 11:
                return ((unz) obj).b();
            case 12:
                return ((Action) obj).e();
            case 13:
                return aktp.ag(false);
            case 14:
                return ((rvl) obj).a();
            case 15:
                return ((rvl) obj).b();
            case 16:
                return ((vel) obj).b.h().h(new vdx(20), andi.a);
            case 17:
                return ((vel) obj).e();
            case 18:
                Throwable th = (Throwable) obj;
                tvt.a.r("Failed to download registration IDs.", th);
                if (!((Boolean) tvt.b.e()).booleanValue()) {
                    return aktp.ag(new gsu());
                }
                return aktp.af(th);
            case 19:
                return ((vel) obj).i(vec.SUFFICIENT_PREKEYS);
            default:
                upy a = uqb.a();
                a.w("getUnscheduledItemsBatch");
                a.d(new uol((java.util.Collection) obj, 7));
                a.c((upu[]) DesugarArrays.stream(uqb.c.l).filter(new trt(12)).toArray(new mlo(12)));
                a.e(new atkn(uqb.c.a, (byte[]) null));
                a.u(100);
                upx b = a.b();
                return akul.g(b.u(new adpp(b, 6)));
        }
    }
}
