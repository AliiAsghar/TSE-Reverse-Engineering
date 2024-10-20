package defpackage;

import android.webkit.URLUtil;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.app.UncaughtExceptionReceiver;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ndd implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ndd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [msh, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        String str;
        ngh nghVar;
        aozy createBuilder;
        qwm qwmVar = null;
        boolean z = false;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                return ((ndi) this.a).k((alog) obj);
            case 1:
                alog alogVar = (alog) obj;
                if (alogVar.isEmpty()) {
                    return altc.a;
                }
                alok alokVar = new alok();
                int size = alogVar.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = this.a;
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) alogVar.get(i);
                    ndi ndiVar = (ndi) obj2;
                    msh q = ndiVar.c.q(bindData);
                    alokVar.h(q, ndiVar.g.a(bindData, q));
                }
                return alokVar.b();
            case 2:
                return ((ndi) this.a).l((alog) obj);
            case 3:
                return (ResolvedRecipient) ((alor) obj).get(this.a);
            case 4:
                pvj pvjVar = (pvj) obj;
                ?? r0 = this.a;
                alwl alwlVar = (alwl) nep.a.g();
                alwlVar.X(ydl.C, nep.b(r0));
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 52, "ChatApiRcsRecipientOnlineProvider.java")).t("Recipient Online Status: %s.", pvjVar);
                if (pvjVar == pvj.ONLINE) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 5:
                ?? r02 = this.a;
                alwl alwlVar2 = (alwl) nep.a.i();
                alwlVar2.X(ydl.C, nep.b(r02));
                ((alwl) ((alwl) alwlVar2.g((Exception) obj)).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 63, "ChatApiRcsRecipientOnlineProvider.java")).q("Recipient Online Status: Failed.");
                return false;
            case 6:
                qry qryVar = (qry) obj;
                alwl alwlVar3 = (alwl) nes.a.g();
                nes nesVar = (nes) this.a;
                alwlVar3.X(ydl.C, nesVar.d());
                alwl alwlVar4 = (alwl) alwlVar3.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 114, "ProviderRcsCapabilitiesSupplier.java");
                if (nesVar.c == 1) {
                    str = "Network RCS Capabilities retrieved: %s.";
                } else {
                    str = "Storage RCS Capabilities retrieved: %s.";
                }
                alwlVar4.t(str, qryVar);
                return lga.aa(qryVar);
            case 7:
                alwl alwlVar5 = (alwl) ney.b.g();
                alwlVar5.X(ydl.C, ((ney) this.a).d());
                ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/RcsContactsRcsCapabilitiesSupplier", "getAsync", 112, "RcsContactsRcsCapabilitiesSupplier.java")).q("Service RCS Capabilities retrieved.");
                return lga.Z((psv) obj);
            case 8:
                alog<ParticipantsTable.BindData> alogVar2 = (alog) obj;
                alogVar2.getClass();
                lig ligVar = ((nfu) this.a).e;
                akrh e = aktp.e("SelfIdentityRepository#getSelfIdentitiesFromParticipants");
                try {
                    ArrayList arrayList = new ArrayList(aqjn.J(alogVar2, 10));
                    for (ParticipantsTable.BindData bindData2 : alogVar2) {
                        Optional.empty();
                        arrayList.add(ligVar.h(bindData2));
                    }
                    alog aZ = alzz.aZ(arrayList);
                    armd.i(e, null);
                    return aZ;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        armd.i(e, th);
                        throw th2;
                    }
                }
            case 9:
                nfv nfvVar = ((nfu) this.a).b;
                nfvVar.b.i((alog) obj);
                alob alobVar = new alob();
                alog e2 = nfvVar.b.e();
                int i2 = ((alsx) e2).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    qwm qwmVar2 = (qwm) e2.get(i3);
                    if (qwmVar2.e() == -1) {
                        qwmVar = qwmVar2;
                    } else {
                        alobVar.h(nfvVar.a(qwmVar2));
                    }
                }
                alog g = alobVar.g();
                xyo a = nfv.a.a();
                a.K("ActiveSubscriptions", g);
                if (qwmVar != null) {
                    z = true;
                }
                a.A("defaultActiveSelfSub exists", z);
                a.q();
                if (g.isEmpty() && qwmVar != null) {
                    xyo e3 = nfv.a.e();
                    e3.H("Found the active dummy sub with subId = -1, but didn't find the actual default sms sub.");
                    e3.q();
                    return alog.r(nfvVar.a(qwmVar));
                }
                xyo a2 = nfv.a.a();
                a2.H("SelfIdentitiesTracker getActiveSelfIdentities:");
                a2.z("selfIdentityList", g);
                a2.q();
                return g;
            case 10:
                amwt amwtVar = ((adjl) obj).a;
                int ordinal = amwtVar.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 7) {
                        if (ordinal != 23) {
                            nghVar = ngh.b;
                        }
                    } else {
                        nghVar = ngh.a;
                    }
                    Object obj3 = this.a;
                    alwl alwlVar6 = (alwl) ngk.b.g();
                    alwlVar6.X(ydl.t, Integer.valueOf(((ngk) obj3).d));
                    alwlVar6.X(ydl.N, amwtVar.toString());
                    ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier", "convertRcsAvailability", 110, "SubscriptionRcsAvailabilitySupplier.java")).t("Rcs is %s for SelfIdentity.", nghVar);
                    return nghVar;
                }
                nghVar = ngh.c;
                Object obj32 = this.a;
                alwl alwlVar62 = (alwl) ngk.b.g();
                alwlVar62.X(ydl.t, Integer.valueOf(((ngk) obj32).d));
                alwlVar62.X(ydl.N, amwtVar.toString());
                ((alwl) alwlVar62.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier", "convertRcsAvailability", 110, "SubscriptionRcsAvailabilitySupplier.java")).t("Rcs is %s for SelfIdentity.", nghVar);
                return nghVar;
            case 11:
                RuntimeException runtimeException = (RuntimeException) obj;
                Object obj4 = this.a;
                if (!(obj4 instanceof CancellationException)) {
                    alvw i4 = UncaughtExceptionReceiver.c.i();
                    i4.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i4).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 153, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Second Exception while processing %s in uncaught exception handler. Giving up.", obj4);
                }
                return null;
            case 12:
                alvw i5 = prk.b.i();
                i5.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoDownloadHelper", "retrieveBusinessInfoMetadata", 357, "RbmBusinessInfoDownloadHelper.java")).t("Retrieving business info metadata failed. bot id: %s", this.a);
                return prk.a();
            case 13:
                upm upmVar = (upm) obj;
                ((prk) this.a).p.n("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return upmVar;
            case 14:
                upm upmVar2 = (upm) obj;
                ((prk) this.a).p.n("Bugle.Rbm.ChatbotDirectory.BotInfoDownloadLatency");
                return upmVar2;
            case 15:
                xyo c = psd.a.c();
                qdk qdkVar = (qdk) this.a;
                c.g(rve.a(qdkVar.a.g));
                c.f(qdkVar.a.h);
                c.H("Completed action for incoming RBM suggestions from Persistent Work Queue.");
                c.q();
                return pwh.SUCCESS;
            case 16:
                pse pseVar = (pse) obj;
                if ((pseVar.b & 1) != 0) {
                    psg psgVar = pseVar.c;
                    if (psgVar == null) {
                        psgVar = psg.a;
                    }
                    createBuilder = psgVar.toBuilder();
                } else {
                    createBuilder = psg.a.createBuilder();
                }
                Object obj5 = this.a;
                aozy builder = pseVar.toBuilder();
                String ag = albo.ag((String) obj5);
                if (true != URLUtil.isHttpsUrl(ag)) {
                    ag = "";
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((psg) createBuilder.b).b = ag;
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                pse pseVar2 = (pse) builder.b;
                psg psgVar2 = (psg) createBuilder.s();
                psgVar2.getClass();
                pseVar2.c = psgVar2;
                pseVar2.b |= 1;
                return (pse) builder.s();
            case 17:
                Map map = (Map) obj;
                alwo alwoVar = pul.a;
                map.putAll(this.a);
                return map;
            case 18:
                alwo alwoVar2 = pul.a;
                return this.a;
            case 19:
                alwo alwoVar3 = pul.a;
                return this.a;
            default:
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                ((alwl) pur.b.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 121, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: forceRefresh return imsCapabilities.getSupportedServiceIdList %s", imsCapabilities.i);
                pvm pvmVar = new pvm();
                pvmVar.i(puc.a(imsCapabilities.i));
                pvmVar.h(((pur) this.a).e.f());
                return pvmVar.g();
        }
    }
}
