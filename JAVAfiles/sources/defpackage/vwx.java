package defpackage;

import android.app.PendingIntent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vwx implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vwx(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v171, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v138, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v75, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [arwe, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul e;
        boolean z;
        boolean f;
        akul c;
        anjp a;
        int i = 14;
        int i2 = 20;
        int i3 = 6;
        int i4 = 11;
        int i5 = 3;
        boolean z2 = false;
        boolean z3 = false;
        int i6 = 2;
        int i7 = 1;
        xdu xduVar = 0;
        xduVar = 0;
        switch (this.d) {
            case 0:
                qfz qfzVar = (qfz) obj;
                qeg qegVar = qfzVar.c;
                if (qegVar == null) {
                    qegVar = qeg.a;
                }
                qef b = qef.b(qegVar.c);
                if (b == null) {
                    b = qef.UNKNOWN_STATUS;
                }
                Object obj2 = this.b;
                if (!b.equals(qef.PENDING) && !b.equals(qef.OK)) {
                    Object obj3 = this.c;
                    Object obj4 = this.a;
                    alwl alwlVar = (alwl) vwy.a.d();
                    smr smrVar = (smr) obj2;
                    alwlVar.X(ydl.p, smrVar.x());
                    alwlVar.X(ydl.I, smrVar.V());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "removeUserFromValidRcsGroupConversation", 159, "RemoveMembersFromRcsConversationHandler.java")).q("Users not successfully queued to be removed from RCS group conversation.");
                    vti vtiVar = (vti) ((vwy) obj4).e.b();
                    qgr qgrVar = ((vwz) obj3).f;
                    if (qgrVar == null) {
                        qgrVar = qgr.a;
                    }
                    qgr qgrVar2 = qgrVar;
                    qeg qegVar2 = qfzVar.c;
                    if (qegVar2 == null) {
                        qegVar2 = qeg.a;
                    }
                    qgrVar2.getClass();
                    vti.n(vtiVar, 19, 3, null, qgrVar2, null, vtiVar.k(3, qegVar2), 16);
                    return aktp.ag(upm.d());
                }
                alwl alwlVar2 = (alwl) vwy.a.d();
                smr smrVar2 = (smr) obj2;
                alwlVar2.X(ydl.p, smrVar2.x());
                alwlVar2.X(ydl.I, smrVar2.V());
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "removeUserFromValidRcsGroupConversation", 151, "RemoveMembersFromRcsConversationHandler.java")).q("Users successfully queued to be removed from RCS group conversation.");
                return aktp.ag(upm.b());
            case 1:
                vus vusVar = (vus) obj;
                Object obj5 = this.b;
                Object obj6 = this.a;
                if (vusVar == vus.TIMEOUT) {
                    vuo vuoVar = ((vuv) obj6).i;
                    e = vuoVar.a((ConversationIdType) obj5).i(new vek(vuoVar, i4), vuoVar.e).e(Exception.class, new vsw(i3), vuoVar.e);
                } else {
                    ?? r4 = this.c;
                    vuv vuvVar = (vuv) obj6;
                    vuo vuoVar2 = vuvVar.i;
                    e = vuoVar2.a((ConversationIdType) obj5).i(new vei(vuoVar2, vusVar.ordinal(), Duration.between(r4, vuvVar.c.f()), i6), vuoVar2.e).e(Exception.class, new vsw(7), vuoVar2.e);
                }
                return e.h(new vuu(vusVar, 0), ((vuv) obj6).e);
            case 2:
                smr smrVar3 = (smr) obj;
                if (smrVar3 == null) {
                    Object obj7 = this.b;
                    alwl alwlVar3 = (alwl) vwy.a.i();
                    alwlVar3.X(ydl.o, ((ConversationIdType) obj7).toString());
                    alwlVar3.X(ydl.I, null);
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/rcs/groups/participants/RemoveMembersFromRcsConversationHandler", "processPendingWorkItemAsync", 124, "RemoveMembersFromRcsConversationHandler.java")).q("Conversation is null when attempting to remove users from RCS group conversation.");
                    return aktp.ag(upm.d());
                }
                Object obj8 = this.c;
                Object obj9 = this.a;
                vwy vwyVar = (vwy) obj9;
                if (((okf) vwyVar.k.b()).a()) {
                    if (1 != (((vwz) obj8).b & 1)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    d.s(z);
                }
                vwz vwzVar = (vwz) obj8;
                String str = vwzVar.e;
                qei qeiVar = vwzVar.d;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                qei qeiVar2 = qeiVar;
                qgr qgrVar3 = vwzVar.f;
                if (qgrVar3 == null) {
                    qgrVar3 = qgr.a;
                }
                if (!albo.ah(smrVar3.V())) {
                    if (!albo.ah(smrVar3.U())) {
                        String V = smrVar3.V();
                        V.getClass();
                        String U = smrVar3.U();
                        U.getClass();
                        akul i8 = aktp.ai(new vmb(obj9, str, i), vwyVar.b).i(new tua(vwyVar, qgrVar3, smrVar3, str, V, ((hgj) vwyVar.g.b()).o(V, U), qeiVar2, 3), vwyVar.b).i(new vwx(obj9, smrVar3, obj8, false ? 1 : 0), vwyVar.c);
                        i8.k(new ydv(new vrw(i3), new vxb(obj9, obj8, i7, xduVar), 0), vwyVar.c);
                        return i8;
                    }
                    ((vti) vwyVar.e.b()).i(qgrVar3, amwx.CHAT_API_INVALID_CONFERENCE_URI);
                    throw new IllegalStateException("No RCS conference ID found for the conversation.");
                }
                ((vti) vwyVar.e.b()).i(qgrVar3, amwx.CHAT_API_INVALID_CONVERSATION_ID);
                throw new IllegalStateException("No RCS group ID found for the conversation.");
            case 3:
                Object obj10 = this.a;
                vxz vxzVar = (vxz) obj10;
                wyl wylVar = (wyl) vxzVar.k.b();
                Object obj11 = this.b;
                rve rveVar = (rve) obj11;
                wylVar.c(rveVar, 2);
                if (((Event) this.c).h == 50035) {
                    MessageIdType messageIdType = rvc.a;
                    ((alvg) ((alvg) vxz.b.d()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 346, "RcsDeliveryReportProcessor.java")).t("Setting delivered status in status tracker using rcsMessageId only for rcsMessageId: %s", obj11);
                    if (((uqg) vxzVar.l.b()).e(rveVar, 2)) {
                        ((alvg) ((alvg) vxz.b.d()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 359, "RcsDeliveryReportProcessor.java")).q("Successfully updated status in status tracker to delivered; now notifying UI.");
                        akrh e2 = aktp.e("RcsDeliveryReportProcessor::onMessageStatusChanging");
                        try {
                            ((vxz) obj10).m.g(new vxb(messageIdType, obj11, i5, xduVar));
                            e2.close();
                        } finally {
                        }
                    } else {
                        ((alvg) ((alvg) vxz.b.d()).h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "updateStatusInUiWithoutDb", 366, "RcsDeliveryReportProcessor.java")).q("Status in status tracker was unchanged.");
                    }
                }
                return ((wyl) vxzVar.k.b()).b(rveVar);
            case 4:
                Stream map = Collection.EL.stream((List) obj).filter(new wjl(3)).map(new wga(9));
                int i9 = alog.d;
                alog alogVar = (alog) map.collect(alls.a);
                alob alobVar = (alob) this.a;
                alobVar.j(alogVar);
                alog g = alobVar.g();
                Object obj12 = this.b;
                tqg tqgVar = tqg.RCS_STILL_SENDING;
                wjn wjnVar = (wjn) obj12;
                uwd uwdVar = wjnVar.f;
                return ((uwc) uwdVar.d.b()).b(g, tqgVar).h(new uvz(g, tqgVar, i6, xduVar), uwdVar.c).e(Throwable.class, new uvz(g, tqgVar, i5, xduVar), uwdVar.c).h(new whh(this.c, g, 5, xduVar), wjnVar.d);
            case 5:
                String str2 = (String) obj;
                ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaignIfNeeded", 938, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, lastReprovisionCampaignId = %s", str2);
                wkk wkkVar = (wkk) this.b;
                vrn vrnVar = (vrn) ((xyt) wkkVar.f.b()).a();
                String str3 = (String) this.a;
                if (vrnVar.w(new adiw(str3)) == amwt.AVAILABLE) {
                    Object obj13 = this.c;
                    String str4 = (String) obj13;
                    if (str4.equals("Default")) {
                        wkkVar.j.l(str3, str4);
                        wkkVar.q();
                    } else if (str4.startsWith("Rollback")) {
                        if (str2.equals("Default")) {
                            wkkVar.q();
                        } else if (str2.startsWith("Rollback")) {
                            if (!str2.equals(obj13)) {
                                wkkVar.j.l(str3, str4);
                            }
                            wkkVar.q();
                        } else {
                            wkkVar.o(str3, str4);
                        }
                    } else if (!str2.equals(obj13)) {
                        wkkVar.o(str3, str4);
                    } else {
                        wkkVar.q();
                    }
                } else {
                    ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaignIfNeeded", 942, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, skipping ReprovisionCampaign since RCS is not available");
                    wkkVar.q();
                }
                return aktp.ag(str2);
            case 6:
                Boolean bool = (Boolean) obj;
                Object obj14 = this.b;
                wkk wkkVar2 = (wkk) obj14;
                boolean a2 = ((okr) wkkVar2.q.b()).a();
                Object obj15 = this.a;
                if (a2 && ((Boolean) aczv.s().a.ar.a()).booleanValue()) {
                    return aktp.ai(new wkf(obj14, false ? 1 : 0), wkkVar2.g).i(new led(obj15, bool.booleanValue(), 8), wkkVar2.g);
                }
                boolean booleanValue = bool.booleanValue();
                if (aczv.x() && aczv.X()) {
                    f = wkkVar2.o.c((String) this.c).n;
                } else {
                    f = actx.f();
                }
                if (obj15 == amwt.DISABLED_FROM_PREFERENCES && f && booleanValue) {
                    return aktp.ag(true);
                }
                ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "checkSettingsRedesignedSingleSimScheduleRevokeGoogleConsentTask", 1764, "RcsProvisioningTriggerImpl.java")).J("RcsProvisioningTrigger: Should not schedule Revoke Google Consent Task because availability=%s, isGoogleTos=%s, isToggleStateUserDisabled=%s", obj15, Boolean.valueOf(f), bool);
                return aktp.ag(false);
            case 7:
                String e3 = rve.e(this.b.E());
                ajqm ajqmVar = new ajqm(null);
                ajqmVar.b("tel:".concat(String.valueOf((String) obj)));
                LocationInformation locationInformation = (LocationInformation) this.c;
                ajqmVar.f(locationInformation.d);
                ajqmVar.g(locationInformation.c);
                ajqmVar.h(locationInformation.e);
                ajqmVar.c(Instant.ofEpochMilli(locationInformation.f));
                ajqmVar.e(locationInformation.a);
                ajqmVar.d(e3);
                Object obj16 = this.a;
                xaf xafVar = (xaf) obj16;
                ajqmVar.i(xafVar.e.f());
                try {
                    return aktp.ag((qej) xafVar.d.fu(((xaf) obj16).c.b(com.google.android.rcs.client.messaging.data.LocationInformation.class).b(ajqmVar.a())));
                } catch (ajsh e4) {
                    throw new wyz(e4);
                }
            case 8:
                Optional optional = (Optional) obj;
                boolean isPresent = optional.isPresent();
                Object obj17 = this.a;
                if (isPresent) {
                    ?? r2 = this.b;
                    Object obj18 = this.c;
                    boolean f2 = psv.a(((pto) optional.get()).a()).f();
                    int ordinal = ((psy) obj17).ordinal();
                    if (ordinal != 1 && ordinal != 2) {
                        if (ordinal == 3 && f2) {
                            xdl xdlVar = (xdl) obj18;
                            return xdlVar.c.b(r2).h(new wxv(obj17, 13), xdlVar.d);
                        }
                    } else if (!f2) {
                        xdl xdlVar2 = (xdl) obj18;
                        return xdlVar2.c.b(r2).h(new wxv(obj17, 12), xdlVar2.d);
                    }
                }
                return aktp.ag(obj17);
            case 9:
                return ((xem) this.a).c((qen) this.b, (anjj) this.c);
            case 10:
                Object obj19 = this.a;
                xeq xeqVar = (xeq) obj19;
                qco qcoVar = (qco) xeqVar.a.b();
                Object obj20 = this.b;
                return qcoVar.j(xeq.c(((qgt) obj20).d, qef.OK)).i(new vwx(obj19, this.c, obj20, 11, (char[]) null), xeqVar.b);
            case 11:
                qeg qegVar3 = (qeg) obj;
                qei qeiVar3 = ((qgt) this.b).e;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                xeq xeqVar2 = (xeq) this.a;
                return xeqVar2.d.I((anjj) this.c, qeiVar3).h(new wxv(qegVar3, i2), xeqVar2.b);
            case 12:
                return ((xff) this.b).e(this.c, ((aniv) this.a).a);
            case 13:
                return ((xff) this.b).e(this.c, ((aniv) this.a).a);
            case 14:
                return ((xff) this.b).e(this.c, ((aniv) this.a).a);
            case 15:
                anjw anjwVar = (anjw) obj;
                boolean booleanValue2 = ((Boolean) ((utz) yig.Q.get()).e()).booleanValue();
                Object obj21 = this.b;
                Object obj22 = this.a;
                if (booleanValue2 || ((Boolean) ((utz) yig.U.get()).e()).booleanValue()) {
                    xfk xfkVar = (xfk) obj22;
                    if (((Optional) ((apxx) xfkVar.d).a).isPresent()) {
                        xduVar = ((xdv) ((Optional) ((apxx) xfkVar.d).a).get()).a();
                    }
                }
                akrh e5 = aktp.e("TachygramSendMessage::getTransport_v2");
                try {
                    akul d = ((xfk) obj22).a.d((qei) obj21, xduVar);
                    e5.b(d);
                    Object obj23 = this.c;
                    e5.close();
                    return d.i(new wkh(obj23, anjwVar, 17), ((xfk) obj22).c);
                } finally {
                }
            case 16:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                Object obj24 = this.a;
                Object obj25 = this.c;
                if (!booleanValue3) {
                    xfo xfoVar = (xfo) obj24;
                    return ((wpp) xfoVar.e.b()).h((aqfn) obj25).h(new xdh(i), xfoVar.f);
                }
                Object obj26 = this.b;
                anjh anjhVar = new anjh(null);
                anjhVar.b((aqfn) obj25);
                anji a3 = anjhVar.a();
                xfo xfoVar2 = (xfo) obj24;
                xgj xgjVar = xfoVar2.i;
                obj26.getClass();
                c = qjh.c(xgjVar.g, arpj.a, arwf.a, new xgk(xgjVar, (qei) obj26, (arpe) null, 1));
                xed xedVar = xfoVar2.h;
                xedVar.getClass();
                return c.h(new xeu(xedVar, i4), xfoVar2.f).i(new wkh(a3, obj26, 19, xduVar), xfoVar2.f).i(new wkh(obj24, obj25, i2), xfoVar2.f);
            case 17:
                znj znjVar = (znj) obj;
                boolean a4 = ((ppa) ((xfq) this.a).c.b()).a();
                Object obj27 = this.b;
                if (a4) {
                    qgw qgwVar = (qgw) obj27;
                    int i10 = qgwVar.b;
                    if ((i10 & 2) != 0 || (i10 & 32) != 0) {
                        z3 = true;
                    }
                    albo.T(z3);
                    anjo anjoVar = new anjo(null);
                    if ((qgwVar.b & 2) != 0) {
                        anjoVar.b(qgwVar.d);
                    }
                    if ((qgwVar.b & 32) != 0) {
                        anjoVar.a = Optional.of(new anjg(qgwVar.h));
                        anjoVar.c = (byte) (anjoVar.c | 2);
                    }
                    if ((qgwVar.b & 16) != 0) {
                        qgr qgrVar4 = qgwVar.g;
                        if (qgrVar4 == null) {
                            qgrVar4 = qgr.a;
                        }
                        anjoVar.b = new anix(qgrVar4.c);
                        anjoVar.c = (byte) (anjoVar.c | 4);
                    }
                    a = anjoVar.a();
                } else {
                    qgw qgwVar2 = (qgw) obj27;
                    if ((qgwVar2.b & 2) != 0) {
                        z2 = true;
                    }
                    albo.T(z2);
                    anjo anjoVar2 = new anjo(null);
                    anjoVar2.b(qgwVar2.d);
                    a = anjoVar2.a();
                }
                anjp anjpVar = a;
                Object obj28 = this.c;
                obj28.getClass();
                return qjh.j(znjVar.b, new wiu(znjVar, (anji) obj28, anjpVar, (arpe) null, 9));
            case 18:
                MessageIdType messageIdType2 = (MessageIdType) obj;
                if (messageIdType2.b()) {
                    return aktp.ag(null);
                }
                Object obj29 = this.b;
                Object obj30 = this.c;
                Object obj31 = this.a;
                alvw n = xoi.a.n();
                n.X(xod.a, obj30);
                n.X(ydl.b, messageIdType2);
                ((alwl) n.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 78, "FileTransferProgressCallbackHandler.java")).q("Transfer progress is being updated.");
                return ((xoi) obj31).c.a(messageIdType2, (xog) obj29);
            case 19:
                Throwable th = (Throwable) obj;
                try {
                    ((xpp) this.b).a((String) this.c, (FileOutputStream) this.a);
                } catch (IOException e6) {
                    th.addSuppressed(e6);
                }
                return aktp.af(th);
            default:
                String str5 = (String) obj;
                if (str5 == null) {
                    return xpt.a("Failed to resume the download. No message data found.");
                }
                ?? r22 = this.a;
                pwc pwcVar = new pwc();
                xow xowVar = (xow) albo.bQ(r22);
                xowVar.getClass();
                FileInformation fileInformation = (FileInformation) pwcVar.fu(xowVar.h());
                aozy createBuilder = xqn.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj32 = this.c;
                Object obj33 = this.b;
                ((xqn) createBuilder.b).b = str5;
                aozb byteString = ((xqn) createBuilder.s()).toByteString();
                fileInformation.getClass();
                xqb xqbVar = (xqb) obj33;
                PendingIntent c2 = aipr.c(xqbVar.e, xqb.d(fileInformation, byteString), xqbVar.e(byteString), 1107296256, 3);
                c2.getClass();
                arbj arbjVar = new arbj();
                arbjVar.af(c2);
                arbjVar.ae(fileInformation);
                arbjVar.ad((String) obj32);
                return aktp.ag(arbjVar.ac());
        }
    }

    public /* synthetic */ vwx(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vwx(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ vwx(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ vwx(xdl xdlVar, psy psyVar, msh mshVar, int i) {
        this.d = i;
        this.c = xdlVar;
        this.a = psyVar;
        this.b = mshVar;
    }
}
