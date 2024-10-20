package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class puy implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ puy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        long j;
        switch (this.b) {
            case 0:
                alok alokVar = new alok();
                alokVar.l((Map) obj);
                alokVar.l(this.a);
                return alokVar.b();
            case 1:
                psx psxVar = (psx) obj;
                alwl alwlVar = (alwl) ((alwl) ((alwl) pus.a.i()).g(psxVar)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 135, "RcsCapabilitiesBackgroundUpdater.java");
                qei qeiVar = (qei) this.a;
                alwlVar.J("Background capability fetch for endpoint %s failed. Error Code '%d'. Retryable '%b'.", yyb.bh(qeiVar.d), Integer.valueOf(psxVar.b), Boolean.valueOf(psxVar.a));
                ((alwl) pus.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 141, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: failed backgroundProvider.getCapabilities for chatEndpoint %s", yyb.bh(qeiVar.d));
                return null;
            case 2:
                pxn pxnVar = (pxn) obj;
                int b = pxnVar.b();
                Object obj2 = this.a;
                if (b == 2) {
                    pwr a = pxnVar.a();
                    alwl alwlVar2 = (alwl) pwz.a.i();
                    pww pwwVar = (pww) obj2;
                    alwlVar2.X(xod.a, pwwVar.a.c);
                    alwlVar2.X(xod.i, "SetupState");
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$SetupState", "enter", 155, "InProgressFileTransfer.java")).q("Failure during setting up the UrlRequest.");
                    pwz pwzVar = pwwVar.a;
                    pwzVar.a(pwzVar.h, new pwj(a));
                } else {
                    pww pwwVar2 = (pww) obj2;
                    pwz pwzVar2 = pwwVar2.a;
                    qdq qdqVar = new qdq(obj2, null);
                    pyd pydVar = pwzVar2.j;
                    if (pydVar.a) {
                        j = pydVar.b.length();
                    } else {
                        j = 0;
                    }
                    long j2 = j;
                    pxf a2 = ((pxg) pydVar.h.b.b()).a(pydVar.g, new pyf(pydVar.c, pydVar.d, j2, pydVar.e, xoo.a(), qdqVar, pydVar.f));
                    if (pydVar.a) {
                        a2.b(String.format(Locale.US, "bytes=%d-", Long.valueOf(j2)));
                    }
                    a2.c(pxnVar.c());
                    pwz pwzVar3 = pwwVar2.a;
                    pwzVar3.a(pwzVar3.g, new pwi(a2.a()));
                }
                return null;
            case 3:
                alwo alwoVar = qan.a;
                if (!((Boolean) obj).booleanValue()) {
                    ?? r1 = this.a;
                    alwl alwlVar3 = (alwl) qan.a.i();
                    alwlVar3.X(ydl.o, r1.z().toString());
                    alwlVar3.X(ydl.a, String.valueOf(r1.B().a));
                    alwlVar3.X(ydl.e, r1.E().b);
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/retry/NoRetryStrategy", "execute", 93, "NoRetryStrategy.java")).q("Couldn't refresh the failure notification for file transfer.");
                }
                return null;
            case 4:
                ((qap) this.a).b.ifPresent(new qab(2));
                return null;
            case 5:
                alwl alwlVar4 = (alwl) ((alwl) qbu.a.i()).g((qcc) obj);
                alwlVar4.X(ydl.p, this.a);
                ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupMetadataActuator", "apply", 114, "GroupMetadataActuator.java")).q("Failed to retrieve GroupConversationMetadata while processing metadata update");
                return upm.d();
            case 6:
                aozy createBuilder = qfl.a.createBuilder();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    createBuilder.w((qfl) it.next());
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj3 = this.a;
                qfl qflVar = (qfl) createBuilder.b;
                obj3.getClass();
                qflVar.b = 1 | qflVar.b;
                qflVar.c = (String) obj3;
                return (qfl) createBuilder.s();
            case 7:
                Object obj4 = this.a;
                alwl alwlVar5 = (alwl) ((alwl) qcu.a.i()).g((qcl) obj);
                alwlVar5.X(ydl.I, qcu.l((qfq) obj4));
                ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupChatNotificationRequestHandler", "process", 178, "IncomingGroupChatNotificationRequestHandler.java")).q("Failed to retrieve self MSISDN");
                return upm.e();
            case 8:
                qhi qhiVar = (qhi) obj;
                Object obj5 = this.a;
                if (qhiVar == qhi.d || qhiVar == qhi.b) {
                    aozy builder = ((apag) obj5).toBuilder();
                    qef qefVar = qef.FAILED_PERMANENTLY;
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    qeg qegVar = (qeg) builder.b;
                    qegVar.c = qefVar.f;
                    qegVar.b |= 1;
                    return (qeg) builder.s();
                }
                return obj5;
            case 9:
                alwl alwlVar6 = (alwl) qdn.a.g();
                qdn qdnVar = (qdn) this.a;
                alwlVar6.X(ydl.f, rve.a(qdnVar.b.a.g));
                alwlVar6.X(ydl.p, ruy.b(qdnVar.b.a.h));
                ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 259, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for BasicTextMessage from Persistent Work Queue.");
                qdnVar.i.a(pwh.SUCCESS);
                return pwh.SUCCESS;
            case 10:
                ((qdn) this.a).i.a(pwh.FAIL_RETRY);
                return pwh.FAIL_RETRY;
            case 11:
                ((alwl) ((alwl) ((alwl) qdn.a.i()).g((vnn) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 275, "UnencryptedIncomingChatMessageVisitor.java")).q("Received GeminiParticipantsLookupException. Retying.");
                ((qdn) this.a).i.a(pwh.FAIL_RETRY);
                return pwh.FAIL_RETRY;
            case 12:
                alwl alwlVar7 = (alwl) qdn.a.g();
                qdn qdnVar2 = (qdn) this.a;
                alwlVar7.X(ydl.e, qdnVar2.b.a.g);
                alwlVar7.X(ydl.p, ruy.b(qdnVar2.b.a.h));
                ((alwl) alwlVar7.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 309, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Location Information from Persistent Work Queue.");
                qdnVar2.i.a(pwh.SUCCESS);
                return pwh.SUCCESS;
            case 13:
                ((qdn) this.a).i.a(pwh.FAIL_RETRY);
                return pwh.FAIL_RETRY;
            case 14:
                alwl alwlVar8 = (alwl) qdn.a.g();
                qdn qdnVar3 = (qdn) this.a;
                alwlVar8.X(ydl.f, rve.a(qdnVar3.b.a.g));
                alwlVar8.X(ydl.p, ruy.b(qdnVar3.b.a.h));
                ((alwl) alwlVar8.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitIncomingRbmMessage", 586, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for incoming RBM message from Persistent Work Queue.");
                qdnVar3.i.a(pwh.SUCCESS);
                return pwh.SUCCESS;
            case 15:
                ((alwl) ((alwl) ((alwl) qdn.a.i()).g((vnn) obj)).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 345, "UnencryptedIncomingChatMessageVisitor.java")).q("Received GeminiParticipantsLookupException. Retying.");
                ((qdn) this.a).i.a(pwh.FAIL_RETRY);
                return pwh.FAIL_RETRY;
            case 16:
                alwl alwlVar9 = (alwl) qdn.a.g();
                qdn qdnVar4 = (qdn) this.a;
                alwlVar9.X(ydl.f, rve.a(qdnVar4.b.a.g));
                alwlVar9.X(ydl.p, ruy.b(qdnVar4.b.a.h));
                ((alwl) alwlVar9.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitProtoMessage", 617, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for Proto Message from Persistent Work Queue.");
                qdnVar4.i.a(pwh.SUCCESS);
                return pwh.SUCCESS;
            case 17:
                xze xzeVar = qif.a;
                aozy builder2 = ((qid) obj).toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                Object obj6 = this.a;
                qid qidVar = (qid) builder2.b;
                qidVar.l = ((qic) obj6).h;
                qidVar.b |= 16384;
                return (qid) builder2.s();
            case 18:
                xze xzeVar2 = qif.a;
                aozy builder3 = ((qid) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                Object obj7 = this.a;
                qid qidVar2 = (qid) builder3.b;
                obj7.getClass();
                qidVar2.o = (apct) obj7;
                qidVar2.c |= 32;
                return (qid) builder3.s();
            case 19:
                xze xzeVar3 = qif.a;
                aozy builder4 = ((qid) obj).toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                Object obj8 = this.a;
                qid qidVar3 = (qid) builder4.b;
                qidVar3.c |= 128;
                qidVar3.q = (String) obj8;
                return (qid) builder4.s();
            default:
                xze xzeVar4 = qif.a;
                aozy builder5 = ((qid) obj).toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                Object obj9 = this.a;
                qid qidVar4 = (qid) builder5.b;
                qidVar4.j = ((qic) obj9).h;
                qidVar4.b |= 256;
                return (qid) builder5.s();
        }
    }
}
