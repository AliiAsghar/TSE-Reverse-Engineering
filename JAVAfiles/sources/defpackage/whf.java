package defpackage;

import com.google.android.apps.messaging.shared.receiver.IncomingRcsEventReceiver;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class whf implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ whf(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((whc) obj).o);
            case 1:
                xze xzeVar = whj.a;
                return alog.n(((whc) obj).p);
            case 2:
                xze xzeVar2 = whj.a;
                return null;
            case 3:
                xze xzeVar3 = whj.a;
                return null;
            case 4:
                xze xzeVar4 = whj.a;
                return null;
            case 5:
                xze xzeVar5 = whj.a;
                whm whmVar = ((whc) obj).f;
                if (whmVar == null) {
                    whmVar = whm.a;
                }
                return uhy.b(whmVar);
            case 6:
                xze xzeVar6 = whj.a;
                return null;
            case 7:
                xze xzeVar7 = whj.a;
                return null;
            case 8:
                xze xzeVar8 = whj.a;
                return null;
            case 9:
                xze xzeVar9 = whj.a;
                return null;
            case 10:
                return ((whc) obj).e;
            case 11:
                xze xzeVar10 = whj.a;
                return null;
            case 12:
                xze xzeVar11 = whj.a;
                return null;
            case 13:
                xze xzeVar12 = whj.a;
                return null;
            case 14:
                ((alvg) ((alvg) wjy.b.d()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningWorkManagerScheduler", "cancelAllRevokeGoogleToSConsentTasks", 459, "RcsProvisioningWorkManagerScheduler.java")).q("cancelRevokeGoogleToSConsentTask, for RevokeGoogleToSConsentWorker.revoke_google_tos_consent_user_disabled tag");
                return null;
            case 15:
                wka.b.l("revokeConsent successfully");
                return new gsw();
            case 16:
                wka.b.r("revokeConsent failed", (Exception) obj);
                return new gsv();
            case 17:
                xze xzeVar13 = IncomingRcsEventReceiver.a;
                return null;
            case 18:
                xze xzeVar14 = IncomingRcsEventReceiver.a;
                return null;
            case 19:
                xze xzeVar15 = RestoreReceiver.a;
                return null;
            default:
                return true;
        }
    }
}
