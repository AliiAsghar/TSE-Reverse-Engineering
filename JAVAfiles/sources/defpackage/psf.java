package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class psf implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ psf(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                Optional optional = (Optional) obj;
                xze xzeVar = psh.a;
                if (optional.isEmpty()) {
                    return false;
                }
                xyo c = psh.a.c();
                c.z("chatbot_directory_url", optional.get());
                c.q();
                return true;
            case 3:
                psj.a.r("Could not save Verified SMS token", (Throwable) obj);
                return false;
            case 4:
                alwo alwoVar = ptb.a;
                return null;
            case 5:
                alwo alwoVar2 = ptb.a;
                return null;
            case 6:
                ((alwl) ((alwl) ((alwl) ptb.a.i()).g((psx) obj)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/RcsContactsCacheRefresher", "refreshCapabilitiesForMessageProtocolAndCacheMismatch", 158, "RcsContactsCacheRefresher.java")).q("Failed to refresh capabilities");
                return null;
            case 7:
                alwo alwoVar3 = pth.a;
                if (!((Boolean) obj).booleanValue()) {
                    ((alwl) ((alwl) pth.a.i()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 80, "RcsCapabilitiesDatabaseCachingSource.java")).q("Did not put capabilities into the database cache.");
                }
                return null;
            case 8:
                Map map = (Map) obj;
                ((alwl) pul.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 167, "CachedCapabilitiesProvider.java")).q("CachedCapabilitiesProvider: finished inserting batch of capabilities into the cache");
                return map;
            case 9:
                pto ptoVar = (pto) obj;
                ((alwl) pul.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 95, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: finish inserting capabilities into the cache %s", ptoVar);
                return ptoVar;
            case 10:
                xze xzeVar2 = pur.a;
                return pvj.ONLINE;
            case 11:
                xze xzeVar3 = pur.a;
                return pvj.NOT_RCS;
            case 12:
                psx psxVar = (psx) obj;
                ((alwl) ((alwl) ((alwl) pus.a.i()).g(psxVar)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getBatchCapabilities", 186, "RcsCapabilitiesBackgroundUpdater.java")).x("Batched background capability fetch failed. Error Code '%d'. Retryable '%b'.", psxVar.b, psxVar.a);
                return null;
            case 13:
                return pvj.ONLINE;
            case 14:
                return pvj.NOT_RCS;
            case 15:
                return upm.b();
            case 16:
                upm upmVar = (upm) obj;
                if (!upmVar.a && !upmVar.b) {
                    aozy createBuilder = qeg.a.createBuilder();
                    qef qefVar = qef.FAILED_PERMANENTLY;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    qeg qegVar = (qeg) apagVar;
                    qegVar.c = qefVar.f;
                    qegVar.b |= 1;
                    qee qeeVar = qee.UNKNOWN_CAUSE;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    qeg qegVar2 = (qeg) createBuilder.b;
                    qegVar2.d = qeeVar.p;
                    qegVar2.b |= 2;
                    return (qeg) createBuilder.s();
                }
                aozy createBuilder2 = qeg.a.createBuilder();
                qef qefVar2 = qef.OK;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qeg qegVar3 = (qeg) createBuilder2.b;
                qegVar3.c = qefVar2.f;
                qegVar3.b |= 1;
                return (qeg) createBuilder2.s();
            case 17:
                return qlm.p((pwh) obj);
            case 18:
                int ordinal = ((pwh) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            alvw i = qco.a.i();
                            i.X(alwp.a, "BugleDataModel");
                            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 505, "IncomingChatApiImpl.java")).q("Failed to process incoming message permanently");
                            aozy createBuilder3 = qeg.a.createBuilder();
                            qef qefVar3 = qef.FAILED_PERMANENTLY;
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            apag apagVar2 = createBuilder3.b;
                            qeg qegVar4 = (qeg) apagVar2;
                            qegVar4.c = qefVar3.f;
                            qegVar4.b |= 1;
                            qee qeeVar2 = qee.UNKNOWN_CAUSE;
                            if (!apagVar2.isMutable()) {
                                createBuilder3.u();
                            }
                            qeg qegVar5 = (qeg) createBuilder3.b;
                            qegVar5.d = qeeVar2.p;
                            qegVar5.b |= 2;
                            return (qeg) createBuilder3.s();
                        }
                        throw new IllegalArgumentException("Unsupported WorkQueueResultType");
                    }
                    alvw i2 = qco.a.i();
                    i2.X(alwp.a, "BugleDataModel");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 512, "IncomingChatApiImpl.java")).q("Failed to process incoming message transiently");
                    aozy createBuilder4 = qeg.a.createBuilder();
                    qef qefVar4 = qef.FAILED_TRANSIENTLY;
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    apag apagVar3 = createBuilder4.b;
                    qeg qegVar6 = (qeg) apagVar3;
                    qegVar6.c = qefVar4.f;
                    qegVar6.b |= 1;
                    qee qeeVar3 = qee.UNKNOWN_CAUSE;
                    if (!apagVar3.isMutable()) {
                        createBuilder4.u();
                    }
                    qeg qegVar7 = (qeg) createBuilder4.b;
                    qegVar7.d = qeeVar3.p;
                    qegVar7.b |= 2;
                    return (qeg) createBuilder4.s();
                }
                alvw g = qco.a.g();
                g.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 502, "IncomingChatApiImpl.java")).q("Successfully processed incoming message");
                aozy createBuilder5 = qeg.a.createBuilder();
                qef qefVar5 = qef.OK;
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                qeg qegVar8 = (qeg) createBuilder5.b;
                qegVar8.c = qefVar5.f;
                qegVar8.b |= 1;
                return (qeg) createBuilder5.s();
            case 19:
                return qlm.p((pwh) obj);
            default:
                return qlm.p((pwh) obj);
        }
    }
}
