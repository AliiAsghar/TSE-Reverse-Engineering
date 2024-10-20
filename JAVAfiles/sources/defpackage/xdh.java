package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xdh implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ xdh(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((aqfg) obj).b;
            case 1:
                return ((aqfg) obj).b;
            case 2:
                alwo alwoVar = xdl.a;
                psv a = psv.a(((pto) obj).a());
                alwl alwlVar = (alwl) xdl.a.g();
                alwlVar.X(ptc.a, a);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/capabilities/RcsContactsTachygramAdapter", "getCapabilitiesInternal", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "RcsContactsTachygramAdapter.java")).q("getCapabilities() returning capabilities.");
                return a;
            case 3:
                ((alwl) ((alwl) ((alwl) xdl.a.i()).g((psx) obj)).h("com/google/android/apps/messaging/shared/tachygram/capabilities/RcsContactsTachygramAdapter", "fireCapabilitiesRefreshInBackground", 305, "RcsContactsTachygramAdapter.java")).q("Failed to fetch RCS capabilities from user transport in background.");
                return null;
            case 4:
                return Optional.ofNullable((ConversationIdType) obj);
            case 5:
                Optional optional = (Optional) obj;
                alwo alwoVar2 = xep.a;
                if (optional.isEmpty()) {
                    ((alwl) ((alwl) xep.a.i()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConversationBindData", 254, "TachygramDatabaseOperations.java")).q("Cannot fetch ConversationsTable.BindData because conversation ID lookup failed.");
                    return Optional.empty();
                }
                smr smrVar = (smr) sni.g((ConversationIdType) optional.get(), new xdo(7));
                if (smrVar == null) {
                    alwl alwlVar2 = (alwl) xep.a.i();
                    alwlVar2.X(ydl.o, ((ConversationIdType) optional.get()).toString());
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConversationBindData", 266, "TachygramDatabaseOperations.java")).q("Could not get Conversation.BindData for an existing conversation.");
                    return Optional.empty();
                }
                return Optional.of(smrVar);
            case 6:
                alwo alwoVar3 = xep.a;
                return ((Optional) obj).flatMap(new xdo(6));
            case 7:
                xew.c((qeg) obj, "handleSelfAddedToGroup");
                return null;
            case 8:
                return null;
            case 9:
                return true;
            case 10:
                alwo alwoVar4 = xff.a;
                return pwh.FAIL_RETRY;
            case 11:
                return qlm.p((pwh) obj);
            case 12:
                psv psvVar = (psv) obj;
                if (psvVar.e()) {
                    ((alwl) ((alwl) xfl.a.i()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupportedAsync", 462, "TachygramSendMessageWorkHandler.java")).q("Unable to determine whether message revocation is supported because there is no cached capabilities for the remote party.");
                    return false;
                }
                boolean j = psvVar.j();
                alwl alwlVar3 = (alwl) ((alwl) xfl.a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "revocationSupportedAsync", 468, "TachygramSendMessageWorkHandler.java");
                Boolean valueOf = Boolean.valueOf(j);
                alwlVar3.t("Is message revocation supported based on remote party's capabilities: %b", valueOf);
                return valueOf;
            case 13:
                return ((anjv) obj).a();
            case 14:
                return (qei) ((Optional) obj).get();
            case 15:
                qei qeiVar = (qei) obj;
                algf algfVar = xfo.a;
                qeiVar.getClass();
                return qeiVar;
            case 16:
                return true;
            case 17:
                return true;
            case 18:
                ((alwl) ((alwl) ((alwl) xfw.a.i()).g((vbc) obj)).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "enableTransport", 139, "TachygramLifecycleManager.java")).q("Failed to enable Tachygram for invalid phone number");
                return false;
            case 19:
                ((alwl) ((alwl) ((alwl) xfw.a.i()).g((aqwb) obj)).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 242, "TachygramLifecycleManager.java")).q("Failed to fetch messages during Tachygram setup");
                return null;
            default:
                return Boolean.valueOf(xfw.a((vee) obj));
        }
    }
}
