package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wkh implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wkh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v98, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v79, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v98, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r4v21, types: [msh, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        String str;
        xdr d;
        akul c;
        String str2;
        anix anixVar;
        akul c2;
        anjg anjgVar;
        String str3;
        akul c3;
        akul c4;
        akul c5;
        int i = 11;
        int i2 = 12;
        int i3 = 10;
        int i4 = 3;
        int i5 = 15;
        int i6 = 8;
        int i7 = 20;
        int i8 = 7;
        int i9 = 1;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    Object obj2 = this.b;
                    Object obj3 = this.a;
                    ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "revokeGoogleToSConsentIfNeeded", 1680, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: schedule RevokeGoogleConsentTask");
                    wkk wkkVar = (wkk) obj3;
                    ((wjr) wkkVar.e.b()).k(true, (amww) obj2);
                    mar a = ((mbb) ((vyv) wkkVar.r.b()).a.b()).a();
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.REVOKE_CONSENT_EVENT;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    aozy createBuilder = amxw.a.createBuilder();
                    amxy amxyVar = amxy.a;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amxw amxwVar = (amxw) createBuilder.b;
                    amxyVar.getClass();
                    amxwVar.c = amxyVar;
                    amxwVar.b = 1;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amxw amxwVar2 = (amxw) createBuilder.s();
                    amxwVar2.getClass();
                    amfrVar2.bx = amxwVar2;
                    amfrVar2.h |= 512;
                    a.a(amfqVar, mbt.LOG_SPEC_REVOKE_CONSENT_EVENTS);
                } else {
                    ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "revokeGoogleToSConsentIfNeeded", 1686, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Did not schedule RevokeGoogleConsentTask");
                }
                return aktp.ag(null);
            case 1:
                Integer num = (Integer) obj;
                wjo wjoVar = (wjo) this.a;
                return ((whj) wjoVar.c.b()).h((String) this.b, num.intValue() + 1).h(new whg(num, i3), wjoVar.d);
            case 2:
                qzt qztVar = (qzt) obj;
                if (qztVar == null) {
                    return aktp.ag(null);
                }
                Object obj4 = this.b;
                String O = qztVar.d.O();
                woe woeVar = (woe) obj4;
                qzw qzwVar = woeVar.d;
                int i10 = qztVar.g;
                msh t = qzwVar.z.t(O, i10);
                GroupInfo groupInfo = qztVar.f;
                if (groupInfo != null) {
                    str = groupInfo.d;
                } else {
                    str = null;
                }
                vqm vqmVar = qzwVar.d;
                Object obj5 = this.a;
                long j = qztVar.e;
                MessageCoreData messageCoreData = qztVar.a;
                return vqmVar.h(messageCoreData, j, t, str, i10).h(new mmq(messageCoreData, qztVar, 19, bArr), qzwVar.u).i(new wkh(obj4, obj5, i4, bArr), woeVar.f).h(new whg(obj4, i7), woeVar.e);
            case 3:
                qzu qzuVar = (qzu) obj;
                qzuVar.getClass();
                Object obj6 = this.a;
                MessageCoreData messageCoreData2 = qzuVar.a;
                MessageIdType B = messageCoreData2.B();
                rbg rbgVar = new rbg(obj6, i9);
                qzw qzwVar2 = ((woe) this.b).d;
                return aktp.ai(rbgVar, qzwVar2.w).i(new qdl(qzwVar2, B, i2), qzwVar2.u).h(new mmq(messageCoreData2, qzuVar, i7, bArr), qzwVar2.u);
            case 4:
                Optional optional = (Optional) obj;
                boolean isPresent = optional.isPresent();
                ?? r4 = this.a;
                Object obj7 = this.b;
                if (isPresent) {
                    xdl xdlVar = (xdl) obj7;
                    if (((pto) optional.get()).f(xdlVar.e.f()) && !psv.a(((pto) optional.get()).a()).f()) {
                        return xdlVar.a(r4);
                    }
                }
                if (optional.isPresent()) {
                    xdl xdlVar2 = (xdl) obj7;
                    if (((pto) optional.get()).f(xdlVar2.e.f())) {
                        xdlVar2.a(r4).h(new whh(obj7, r4, i), xdlVar2.d).e(psx.class, new xdh(i4), xdlVar2.d).k(qiu.b(), xdlVar2.d);
                    }
                    return aktp.ag((pto) optional.get());
                }
                return ((xdl) obj7).a(r4);
            case 5:
                pto ptoVar = (pto) obj;
                ptz a2 = ptoVar.a();
                Instant b = ptoVar.b();
                pvm pvmVar = new pvm();
                pvmVar.i(a2);
                pvmVar.h(b);
                pto g = pvmVar.g();
                Object obj8 = this.a;
                xdl xdlVar3 = (xdl) this.b;
                xds xdsVar = xdlVar3.c;
                synchronized (xdsVar.b) {
                    xdr xdrVar = (xdr) ((LruCache) xdsVar.b.get()).get(obj8);
                    if (xdrVar != null) {
                        xou xouVar = new xou(xdrVar);
                        xouVar.f(g);
                        d = xouVar.d();
                    } else {
                        xou a3 = xdr.a();
                        a3.f(g);
                        d = a3.d();
                    }
                    ((LruCache) xdsVar.b.get()).put(obj8, d);
                }
                return aktp.ah(new vri(obj8, a2, b, 10, (int[]) null), xdsVar.c).h(new wxv(ptoVar, i), xdlVar3.d);
            case 6:
                ?? r2 = this.a;
                xdl xdlVar4 = (xdl) this.b;
                return xdlVar4.c.a(r2).i(new vwx(xdlVar4, (psy) obj, (msh) r2, i6), xdlVar4.d);
            case 7:
                return ((xdn) this.b).e((qei) this.a, (pto) obj);
            case 8:
                pvj pvjVar = (pvj) obj;
                boolean equals = pvj.NOT_RCS.equals(pvjVar);
                Object obj9 = this.a;
                Object obj10 = this.b;
                if (equals) {
                    ((alwl) ((alwl) xdn.a.g()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getOnlineStatus", 180, "TachygramNetworkCapabilitiesProvider.java")).q("Online status NOT_RCS returned from TachygramUserTransport. Invalidating cached capabilities, if there are any.");
                    xdn xdnVar = (xdn) obj10;
                    return xdnVar.e((qei) obj9, pto.e(xdnVar.c.f())).h(new wxv(pvjVar, 14), andi.a);
                }
                if (pvj.ONLINE.equals(pvjVar)) {
                    xdn xdnVar2 = (xdn) obj10;
                    qiu.e(xdnVar2.b((qei) obj9).i(new wkh(obj10, obj9, i8, bArr), xdnVar2.b));
                }
                return aktp.ag(pvjVar);
            case 9:
                anji anjiVar = (anji) obj;
                Object obj11 = this.a;
                qei qeiVar = ((qec) obj11).f;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                xfh xfhVar = (xfh) this.b;
                return xfhVar.a.a(qeiVar).i(new wkh(anjiVar, obj11, i3, bArr), xfhVar.b);
            case 10:
                znj znjVar = (znj) obj;
                Stream map = Collection.EL.stream(((qec) this.a).d).map(new wki(new xei(), i7));
                int i11 = alog.d;
                alog alogVar = (alog) map.collect(alls.a);
                Object obj12 = this.b;
                obj12.getClass();
                alogVar.getClass();
                c = qjh.c(znjVar.b, arpj.a, arwf.a, new wiu(znjVar, (anji) obj12, alogVar, (arpe) null, 7));
                return c;
            case 11:
                Object obj13 = this.a;
                znj znjVar2 = (znj) obj;
                anjm az = albo.az();
                qen qenVar = (qen) obj13;
                if ((2 & qenVar.b) != 0) {
                    str2 = qenVar.d;
                } else {
                    str2 = "";
                }
                Object obj14 = this.b;
                az.d(str2);
                xem xemVar = (xem) obj14;
                if (xemVar.a.a()) {
                    qfd qfdVar = qenVar.i;
                    if (qfdVar == null) {
                        qfdVar = qfd.a;
                    }
                    qfdVar.getClass();
                    aros arosVar = new aros();
                    if ((qfdVar.b & 1) != 0) {
                        if (true != qfdVar.c) {
                            str3 = "0";
                        } else {
                            str3 = "1";
                        }
                        arosVar.put("is_upgrade_from_mms_group", str3);
                    }
                    az.c(arosVar.e());
                }
                if (xemVar.b.a()) {
                    if ((4 & qenVar.b) != 0) {
                        anjgVar = new anjg(qenVar.e);
                    } else {
                        anjgVar = anjg.a;
                    }
                    az.b(anjgVar);
                }
                anjh anjhVar = new anjh(null);
                aozy cJ = yyb.cJ();
                asku askuVar = asku.GROUP_ID;
                if (!cJ.b.isMutable()) {
                    cJ.u();
                }
                aqfn aqfnVar = (aqfn) cJ.b;
                aqfn aqfnVar2 = aqfn.a;
                aqfnVar.b = askuVar.a();
                String str4 = qenVar.c;
                if (!cJ.b.isMutable()) {
                    cJ.u();
                }
                aqfn aqfnVar3 = (aqfn) cJ.b;
                str4.getClass();
                aqfnVar3.c = str4;
                anjhVar.b((aqfn) cJ.s());
                anji a4 = anjhVar.a();
                anjn a5 = az.a();
                alob alobVar = new alob();
                alobVar.j(qenVar.g);
                qei qeiVar2 = qenVar.f;
                if (qeiVar2 == null) {
                    qeiVar2 = qei.a;
                }
                alobVar.h(qeiVar2);
                alog alogVar2 = (alog) Collection.EL.stream(alobVar.g()).map(new xeo(new xei(), i9)).collect(alls.a);
                alogVar2.getClass();
                alpr alprVar = new alpr();
                alprVar.j(alogVar2);
                if (xemVar.b.a() && (qenVar.b & 64) != 0) {
                    qgr qgrVar = qenVar.j;
                    if (qgrVar == null) {
                        qgrVar = qgr.a;
                    }
                    anixVar = new anix(qgrVar.c);
                } else {
                    i5 = 7;
                    anixVar = null;
                }
                alpt g2 = alprVar.g();
                if (((~i5) & 8) != 0) {
                    anixVar = null;
                }
                c2 = qjh.c(znjVar2.b, arpj.a, arwf.a, new wwh(znjVar2, new anjb(a4, a5, g2, anixVar), (arpe) null, 7));
                return c2;
            case 12:
                xeq xeqVar = (xeq) this.b;
                anji anjiVar2 = (anji) obj;
                xgj xgjVar = (xgj) xeqVar.c.b();
                qei qeiVar3 = ((qgt) this.a).e;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                return xgjVar.a(qeiVar3).i(new wgb(anjiVar2, i5), xeqVar.b);
            case 13:
                qeg qegVar = (qeg) obj;
                qef qefVar = qef.OK;
                qef b2 = qef.b(qegVar.c);
                if (b2 == null) {
                    b2 = qef.UNKNOWN_STATUS;
                }
                if (!qefVar.equals(b2)) {
                    return aktp.ag(qegVar);
                }
                anjj anjjVar = (anjj) this.b;
                aozb aozbVar = anjjVar.a.a.e;
                if (aozb.b.equals(aozbVar)) {
                    alwl alwlVar = (alwl) xew.a.g();
                    alwlVar.X(ydl.I, anjjVar.a.a.c);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupHandlerChapiAdapter", "storeRoutingInfoToken", 315, "TachygramGroupHandlerChapiAdapter.java")).q("Added to an incoming tachygram group with a missing routing info token.");
                    return aktp.ag(qegVar);
                }
                xew xewVar = (xew) this.a;
                return ((xep) xewVar.c.b()).c(anjjVar.a.a.c, aozbVar).h(new xeu(qegVar, i9), xewVar.d);
            case 14:
                xfg xfgVar = (xfg) obj;
                alvw i12 = xfa.a.i();
                i12.X(alwp.a, "BugleTachygram");
                alvg alvgVar = (alvg) ((alvg) i12).g(xfgVar);
                ?? r3 = this.b;
                aqds aqdsVar = (aqds) r3;
                alvgVar.X(ydl.e, aqdsVar.c);
                alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 113, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                ahld ahldVar = new ahld(xfgVar.a);
                aqdr b3 = aqdr.b(aqdsVar.d);
                if (b3 == null) {
                    b3 = aqdr.UNRECOGNIZED;
                }
                alvgVar2.D("Tachygram could not process incoming InboxMessage. Failed with TachygramProcessingException. isPermanent: %s. messageType: %s.", ahldVar, new ahlg(b3));
                if (!xfgVar.a) {
                    Object obj15 = this.a;
                    alvw g3 = xfa.a.g();
                    g3.X(alwp.a, "BugleTachygram");
                    alvg alvgVar3 = (alvg) g3;
                    alvgVar3.X(ydl.e, aqdsVar.c);
                    ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "scheduleRetry", 161, "TachygramOneToManyInboxMessageHandlerAdapter.java")).q("Scheduling retry for incoming message.");
                    xfa xfaVar = (xfa) obj15;
                    return ((uof) xfaVar.c.a.b()).b(upk.a("tachygram_inbox_message_retry", r3)).i(new xdg(i8), xfaVar.b).h(new xdh(i6), andi.a).h(new xdh(9), andi.a);
                }
                return aktp.ag(true);
            case 15:
                znj znjVar3 = (znj) obj;
                Stream map2 = Collection.EL.stream(((qfy) this.a).d).map(new xeo(new xei(), i2));
                int i13 = alog.d;
                alog alogVar3 = (alog) map2.collect(alls.a);
                Object obj16 = this.b;
                obj16.getClass();
                alogVar3.getClass();
                c3 = qjh.c(znjVar3.b, arpj.a, arwf.a, new wiu(znjVar3, (anji) obj16, alogVar3, (arpe) null, 8, (byte[]) null));
                return c3;
            case 16:
                anji anjiVar3 = (anji) obj;
                Object obj17 = this.a;
                qei qeiVar4 = ((qfy) obj17).f;
                if (qeiVar4 == null) {
                    qeiVar4 = qei.a;
                }
                xfh xfhVar2 = (xfh) this.b;
                return xfhVar2.a.a(qeiVar4).i(new wkh(anjiVar3, obj17, i5, bArr), xfhVar2.b);
            case 17:
                znj znjVar4 = (znj) obj;
                Object obj18 = this.a;
                obj18.getClass();
                Object obj19 = this.b;
                obj19.getClass();
                c4 = qjh.c(znjVar4.b, arpj.a, arwf.a, new wiu(znjVar4, (anja) obj18, (anjw) obj19, (arpe) null, 10));
                return c4;
            case 18:
                qeg qegVar2 = (qeg) obj;
                qef b4 = qef.b(qegVar2.c);
                if (b4 == null) {
                    b4 = qef.UNKNOWN_STATUS;
                }
                alwl alwlVar2 = (alwl) xfo.c.g();
                alvz alvzVar = qas.b;
                qef b5 = qef.b(qegVar2.c);
                if (b5 == null) {
                    b5 = qef.UNKNOWN_STATUS;
                }
                Object obj20 = this.b;
                Object obj21 = this.a;
                alwlVar2.X(alvzVar, b5);
                alwlVar2.X(ydl.e, ((anjw) obj20).a);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramTransportMessageHandlerChapiAdapter", "processIncomingChatApiResult", 159, "TachygramTransportMessageHandlerChapiAdapter.java")).q("IncomingChatApi has finished processing the message");
                int ordinal = b4.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    throw new IllegalStateException("Unreachable code after ChatApiResult status switch");
                                }
                            } else {
                                return aktp.af(new xfg("IncomingChatApi returned a transient error.", false));
                            }
                        } else {
                            if (((olb) ((xfo) obj21).j.b()).a()) {
                                alvw i14 = xfo.d.i();
                                i14.X(alwp.a, "BugleTachygram");
                                ((alvg) ((alvg) i14).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramTransportMessageHandlerChapiAdapter", "processIncomingChatApiResult", 175, "TachygramTransportMessageHandlerChapiAdapter.java")).q("IncomingChatApi returned PENDING status.");
                            }
                            throw new IllegalStateException("IncomingChatApi returned an unexpected status: " + b4.f);
                        }
                    }
                    return aktp.ag(null);
                }
                if (((olb) ((xfo) obj21).j.b()).a()) {
                    alvw i15 = xfo.d.i();
                    i15.X(alwp.a, "BugleTachygram");
                    ((alvg) ((alvg) i15).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramTransportMessageHandlerChapiAdapter", "processIncomingChatApiResult", 181, "TachygramTransportMessageHandlerChapiAdapter.java")).q("IncomingChatApi returned an unexpected status.");
                }
                throw new IllegalStateException("IncomingChatApi returned an unexpected status: " + b4.f);
            case 19:
                xeg xegVar = (xeg) obj;
                algf algfVar = xfo.a;
                Object obj22 = this.a;
                obj22.getClass();
                c5 = qjh.c(xegVar.a, arpj.a, arwf.a, new wiu(xegVar, (anji) this.b, (qei) obj22, (arpe) null, 5));
                return c5;
            default:
                xfo xfoVar = (xfo) this.a;
                return ((wpp) xfoVar.e.b()).h((aqfn) this.b).i(new wgb((xec) obj, i7), xfoVar.f);
        }
    }

    public /* synthetic */ wkh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
