package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class pri implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pri(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v127, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        qey qeyVar;
        qey qeyVar2;
        akul e;
        qez qezVar;
        qez qezVar2;
        int i = 4;
        int i2 = 7;
        int i3 = 3;
        byte[] bArr = null;
        int i4 = 2;
        int i5 = 1;
        switch (this.c) {
            case 0:
                pyg pygVar = (pyg) obj;
                xze xzeVar = prk.a;
                int b = pygVar.b();
                ?? r3 = this.b;
                Object obj2 = this.a;
                if (b == 1) {
                    xyo c = prk.a.c();
                    c.H("Download succeeded for ".concat((String) obj2));
                    c.L("url", r3);
                    c.q();
                    return aktp.ag(pygVar.c());
                }
                xyo e2 = prk.a.e();
                e2.H("File transfer download failed for ".concat((String) obj2));
                e2.L("url", r3);
                e2.z("failureReason", pygVar.a());
                e2.q();
                return xpt.a("File transfer download failed");
            case 1:
                Throwable th = (Throwable) obj;
                boolean z = th instanceof prr;
                Object obj3 = this.b;
                Object obj4 = this.a;
                if (z) {
                    return ((prk) obj4).f((prr) th, (prl) obj3);
                }
                prk.a.r("Business Info retrieval error with unknown reason", th);
                return ((prk) obj4).f(new prr("Error reason unknown", 1), (prl) obj3);
            case 2:
                xyo e3 = prk.a.e();
                e3.H("Download failed for ".concat((String) this.a));
                e3.z("url", this.b);
                e3.q();
                return aktp.af((Throwable) obj);
            case 3:
                alog alogVar = (alog) obj;
                int size = alogVar.size();
                Object obj5 = this.b;
                if (size > 1) {
                    alvw i6 = prq.a.i();
                    i6.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i6).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 233, "RbmBusinessInfoJsonRetriever.java")).D("Multiple bots (%s) for short code: %s", Collection.EL.stream(alogVar).map(new prj(i4)).collect(alls.b), obj5);
                }
                Object obj6 = this.a;
                Optional findFirst = Collection.EL.stream(alogVar).findFirst();
                String str = (String) findFirst.map(new prj(i4)).orElse(null);
                String str2 = (String) findFirst.map(new prj(i3)).orElse(null);
                akul g = akul.g(d.m(new gst(obj6, (String) obj5, (Object) str2, i4)));
                Boolean bool = (Boolean) prq.d.e();
                boolean booleanValue = bool.booleanValue();
                if (booleanValue) {
                    g = g.j(((Integer) prq.c.e()).intValue(), TimeUnit.MILLISECONDS, ((prq) obj6).h);
                }
                ((prq) obj6).n = booleanValue;
                alvw g2 = prq.a.g();
                g2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever", "processRbmShortCodeQueryResult", 264, "RbmBusinessInfoJsonRetriever.java")).K("Short code HTTP: %s, id: %s, v: %s (w/timeout: %s)", obj5, str, str2, bool);
                return g;
            case 4:
                Optional optional = (Optional) obj;
                Object obj7 = this.b;
                if (optional != null && optional.isPresent()) {
                    psd psdVar = (psd) this.a;
                    return ((ree) psdVar.d.b()).a((Bundle) optional.get()).q().h(new ndd(obj7, 15), psdVar.b);
                }
                xyo e4 = psd.a.e();
                qdk qdkVar = (qdk) obj7;
                e4.g(rve.a(qdkVar.a.g));
                e4.f(qdkVar.a.h);
                e4.H("RBM suggestions could not be processed. Discarding..");
                e4.q();
                return aktp.ag(pwh.FAIL_NO_RETRY);
            case 5:
                if (!psy.NOT_RCS.equals((psy) obj)) {
                    ?? r1 = this.a;
                    ptb ptbVar = (ptb) this.b;
                    return ptbVar.b.b(r1).h(new psf(i), ptbVar.c);
                }
                return aktp.ag(null);
            case 6:
                Optional optional2 = (Optional) obj;
                if (optional2.isPresent() && ((psv) optional2.get()).g()) {
                    return aktp.ag(psy.ONLINE);
                }
                return ((ptb) this.b).b.c(this.a);
            case 7:
                Optional optional3 = (Optional) obj;
                ((alwl) pul.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilities", 61, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: getCapabilities result capabilitiesOptional %s", optional3);
                Object obj8 = this.a;
                return (ListenableFuture) optional3.filter(new ncc(((pul) obj8).d, 6)).map(new prj(15)).orElseGet(new mau(obj8, this.b, 10, bArr));
            case 8:
                pto ptoVar = (pto) obj;
                ((alwl) pul.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 83, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: finish getCapabilitiesFromDelegate return delegateCapabilities %s", ptoVar);
                pul pulVar = (pul) this.a;
                return pulVar.b.d((qei) this.b, ptoVar).h(new ndd(ptoVar, 19), pulVar.e);
            case 9:
                Map map = (Map) obj;
                Stream stream = Collection.EL.stream(map.entrySet());
                Object obj9 = this.a;
                int i7 = 17;
                Map map2 = (Map) stream.filter(new ncc(obj9, i2)).collect(Collectors.toMap(new prj(16), new prj(i7), new mcb(i3), new nfz(13)));
                ((alwl) pul.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilities", 125, "CachedCapabilitiesProvider.java")).u("CachedCapabilitiesProvider: getBatchCapabilities retrieved valid capabilities for %d of %d requested users", map2.size(), map.size());
                HashSet J = alzz.J(this.b);
                J.removeAll(map2.keySet());
                if (J.isEmpty()) {
                    return aktp.ag(map2);
                }
                ((alwl) pul.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 148, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: start getBatchCapabilitiesFromDelegate for %d chatEndpoints", J.size());
                pul pulVar2 = (pul) obj9;
                return pulVar2.c.a(J).i(new prf(obj9, i4), pulVar2.e).h(new psf(8), pulVar2.e).h(new ndd(map2, i7), pulVar2.e);
            case 10:
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                boolean z2 = imsCapabilities.c;
                Object obj10 = this.b;
                Object obj11 = this.a;
                if (z2) {
                    return ((pur) obj11).d((qei) obj10, imsCapabilities).h(new psf(10), andi.a);
                }
                int i8 = imsCapabilities.g;
                if (i8 != 404) {
                    if (i8 != 408 && i8 != 480) {
                        if (i8 != 604) {
                            pur.a.l(a.cb(i8, "[Dual Registraion] Received response code: ", " when trying to retrieve online status."));
                            return aktp.ag(pvj.NOT_RCS);
                        }
                    } else {
                        return aktp.ag(pvj.OFFLINE);
                    }
                }
                return ((pur) obj11).d((qei) obj10, imsCapabilities).h(new psf(11), andi.a);
            case 11:
                Object obj12 = this.a;
                pus pusVar = (pus) obj12;
                pto ptoVar2 = (pto) obj;
                if (pusVar.c.a(ptoVar2)) {
                    ((alwl) pus.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 96, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: valid getCapabilities %s", ptoVar2);
                    return aktp.ag(null);
                }
                Object obj13 = this.b;
                ((alwl) pus.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 100, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: not valid capabilities %s", ptoVar2);
                qei qeiVar = (qei) obj13;
                ((alwl) pus.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 102, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: start backgroundProvider.getCapabilities for chatEndpoint %s", yyb.bh(qeiVar.d));
                return pusVar.b.b(qeiVar).i(new mhv(obj12, ptoVar2, obj13, 15, (byte[]) null), pusVar.d);
            case 12:
                ((alwl) ((alwl) ((alwl) puv.a.i()).g((psx) obj)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getCapabilities", 53, "RcsCapabilitiesProviderExceptionHandler.java")).q("Capabilities failed with an exception from the downstream provider.");
                return ((puv) this.a).b.b((qei) this.b);
            case 13:
                ((alwl) ((alwl) ((alwl) puv.a.i()).g((psx) obj)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getBatchCapabilities", 72, "RcsCapabilitiesProviderExceptionHandler.java")).q("Capabilities failed with an exception from the downstream provider.");
                return ((puv) this.a).b.a(this.b);
            case 14:
                return ((pvd) this.a).d((qei) this.b, (pto) obj);
            case 15:
                psx psxVar = (psx) obj;
                int i9 = psxVar.b;
                if (i9 != 3 && i9 != 4) {
                    if (i9 != 7) {
                        return aktp.af(psxVar);
                    }
                    Object obj14 = this.b;
                    pvd pvdVar = (pvd) this.a;
                    return pvdVar.d((qei) obj14, pto.e(pvdVar.e.f())).h(new psf(14), andi.a);
                }
                return aktp.ag(pvj.OFFLINE);
            case 16:
                Object obj15 = this.b;
                Object obj16 = this.a;
                return aktp.ai(new hbd(obj16, obj15, (qei) obj, 18, (byte[]) null), ((qcb) obj16).c);
            case 17:
                pwh pwhVar = (pwh) obj;
                if (pwhVar != pwh.SUCCESS) {
                    mbl mblVar = (mbl) ((qco) this.a).e.b();
                    if (pwhVar == pwh.FAIL_RETRY) {
                        i4 = 1;
                    }
                    mblVar.e("Bugle.Rcs.ChatApi.Failure.ProcessSendChatMessageResponse.Count", i4);
                }
                return this.b;
            case 18:
                Object obj17 = this.b;
                final qfq qfqVar = (qfq) obj17;
                int i10 = qfqVar.b;
                int k = qkq.k(i10);
                if (k != 0) {
                    int i11 = k - 1;
                    final qcu qcuVar = (qcu) this.a;
                    qcb qcbVar = qcuVar.d;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            if (i10 == 2) {
                                qezVar = (qez) qfqVar.c;
                            } else {
                                qezVar = qez.b;
                            }
                            qei qeiVar2 = qezVar.k;
                            if (qeiVar2 == null) {
                                qeiVar2 = qei.a;
                            }
                            if (qfqVar.b == 2) {
                                qezVar2 = (qez) qfqVar.c;
                            } else {
                                qezVar2 = qez.b;
                            }
                            e = qcbVar.e(qeiVar2, qezVar2.d);
                        } else {
                            throw new IllegalArgumentException("No notification set in IncomingGroupChatNotificationRequest");
                        }
                    } else {
                        if (i10 == 1) {
                            qeyVar = (qey) qfqVar.c;
                        } else {
                            qeyVar = qey.c;
                        }
                        qei qeiVar3 = qeyVar.q;
                        if (qeiVar3 == null) {
                            qeiVar3 = qei.a;
                        }
                        if (qfqVar.b == 1) {
                            qeyVar2 = (qey) qfqVar.c;
                        } else {
                            qeyVar2 = qey.c;
                        }
                        e = qcbVar.e(qeiVar3, qeyVar2.e);
                    }
                    return e.i(new ancs() { // from class: qct
                        @Override // defpackage.ancs
                        public final ListenableFuture a(Object obj18) {
                            qey qeyVar3;
                            akul j;
                            qez qezVar3;
                            qez qezVar4;
                            String str3;
                            akul i12;
                            final qcu qcuVar2 = qcu.this;
                            final qfq qfqVar2 = qfqVar;
                            qbs qbsVar = (qbs) obj18;
                            if (qbsVar == null) {
                                int i13 = qfqVar2.b;
                                if (qkq.k(i13) == 2) {
                                    final qcb qcbVar2 = qcuVar2.d;
                                    if (i13 == 2) {
                                        qezVar4 = (qez) qfqVar2.c;
                                    } else {
                                        qezVar4 = qez.b;
                                    }
                                    qei qeiVar4 = qezVar4.k;
                                    if (qeiVar4 == null) {
                                        qeiVar4 = qei.a;
                                    }
                                    apax<qff> apaxVar = qezVar4.g;
                                    alob alobVar = new alob();
                                    for (qff qffVar : apaxVar) {
                                        qfe b2 = qfe.b(qffVar.d);
                                        if (b2 == null) {
                                            b2 = qfe.UNKNOWN_STATE;
                                        }
                                        if (!b2.equals(qfe.JOINED)) {
                                            qfe b3 = qfe.b(qffVar.d);
                                            if (b3 == null) {
                                                b3 = qfe.UNKNOWN_STATE;
                                            }
                                            if (!b3.equals(qfe.PENDING)) {
                                                qfe b4 = qfe.b(qffVar.d);
                                                if (b4 == null) {
                                                    b4 = qfe.UNKNOWN_STATE;
                                                }
                                                if (!b4.equals(qfe.UNKNOWN_STATE)) {
                                                    alvw d = qcb.a.d();
                                                    d.X(alwp.a, "BugleGroupManagement");
                                                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getParticipantDataListFromGroupParticipantList", 565, "IncomingRcsGroupNotificationConversationGetter.java")).q("Server participant list contains a user not in the JOINED, PENDING or UNKNOWN state. Ignoring participant for creating conversation.");
                                                }
                                            }
                                        }
                                        qei qeiVar5 = qffVar.c;
                                        if (qeiVar5 == null) {
                                            qeiVar5 = qei.a;
                                        }
                                        alobVar.h(rxn.b(qeiVar5.d));
                                    }
                                    final alog g3 = alobVar.g();
                                    if (!qcbVar2.g(qezVar4) && !qcbVar2.h()) {
                                        i12 = qcbVar2.d(qezVar4, g3, qeiVar4);
                                    } else {
                                        final boolean g4 = qcbVar2.g(qezVar4);
                                        final boolean h = qcbVar2.h();
                                        alvw g5 = qcb.a.g();
                                        g5.X(alwp.a, "BugleGroupManagement");
                                        alvg alvgVar = (alvg) ((alvg) g5).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "tryToUpgradeExistingMmsGroup", 365, "IncomingRcsGroupNotificationConversationGetter.java");
                                        if (true != g4) {
                                            str3 = "Searching MMS group to upgrade because implicit upgrade is enabled.";
                                        } else {
                                            str3 = "Searching MMS group to upgrade because group notification was explicitly flagged.";
                                        }
                                        alvgVar.q(str3);
                                        final qez qezVar5 = qezVar4;
                                        final qei qeiVar6 = qeiVar4;
                                        i12 = ((qpj) qcbVar2.f.b()).h((alog) Collection.EL.stream(g3).distinct().map(new qbb(14)).filter(new ncc(qeiVar4.d, 14)).collect(alls.a)).i(new ancs() { // from class: qbz
                                            /* JADX WARN: Type inference failed for: r1v18, types: [arwe, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r6v3, types: [armf, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
                                            @Override // defpackage.ancs
                                            public final ListenableFuture a(Object obj19) {
                                                final boolean z3;
                                                akul c2;
                                                Optional optional4 = (Optional) obj19;
                                                boolean isEmpty = optional4.isEmpty();
                                                final qcb qcbVar3 = qcb.this;
                                                boolean z4 = g4;
                                                if (!isEmpty && tvu.f(((smr) optional4.get()).h())) {
                                                    final boolean z5 = h;
                                                    final ConversationIdType x = ((smr) optional4.get()).x();
                                                    if (z4) {
                                                        ((vco) qcbVar3.j.b()).k(x);
                                                        z3 = true;
                                                    } else {
                                                        if (z5) {
                                                            vco vcoVar = (vco) qcbVar3.j.b();
                                                            x.getClass();
                                                            aozy createBuilder = amst.b.createBuilder();
                                                            createBuilder.getClass();
                                                            aktp.bm(((lzz) vcoVar.a.b()).a(x), createBuilder);
                                                            aktp.bn(3, createBuilder);
                                                            aktp.bp(2, createBuilder);
                                                            aktp.bo(3, createBuilder);
                                                            vcoVar.j(aktp.bl(createBuilder));
                                                        }
                                                        z3 = false;
                                                    }
                                                    qez qezVar6 = qezVar5;
                                                    final String str4 = qezVar6.d;
                                                    qei qeiVar7 = qezVar6.e;
                                                    if (qeiVar7 == null) {
                                                        qeiVar7 = qei.a;
                                                    }
                                                    String str5 = qeiVar7.d;
                                                    qfj qfjVar = qezVar6.h;
                                                    if (qfjVar == null) {
                                                        qfjVar = qfj.a;
                                                    }
                                                    alog alogVar2 = g3;
                                                    qei qeiVar8 = qeiVar6;
                                                    msk mskVar = qcbVar3.m;
                                                    String str6 = qfjVar.c;
                                                    msh b5 = mskVar.b(qeiVar8);
                                                    SelfIdentityId g6 = qcbVar3.b(qeiVar8, (smr) optional4.get()).g();
                                                    vtm c3 = qcbVar3.c(qezVar6);
                                                    zap zapVar = (zap) qcbVar3.i.b();
                                                    x.getClass();
                                                    str4.getClass();
                                                    str5.getClass();
                                                    alogVar2.getClass();
                                                    c2 = qjh.c(zapVar.e, arpj.a, arwf.a, new vvo(zapVar, x, str4, str5, c3, str6, b5, g6, alogVar2, null));
                                                    return c2.h(new algk() { // from class: qca
                                                        /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
                                                        /* JADX WARN: Type inference failed for: r4v5, types: [armf, java.lang.Object] */
                                                        @Override // defpackage.algk
                                                        public final Object apply(Object obj20) {
                                                            boolean booleanValue2 = ((Boolean) obj20).booleanValue();
                                                            ConversationIdType conversationIdType = x;
                                                            String str7 = str4;
                                                            if (!booleanValue2) {
                                                                alvw i14 = qcb.a.i();
                                                                i14.X(alwp.a, "BugleGroupManagement");
                                                                alvg alvgVar2 = (alvg) i14;
                                                                alvgVar2.X(ydl.p, conversationIdType);
                                                                alvgVar2.X(ydl.I, str7);
                                                                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "tryToUpgradeExistingMmsGroup", 440, "IncomingRcsGroupNotificationConversationGetter.java")).q("Upgrade of MMS group to RCS failed.");
                                                                return null;
                                                            }
                                                            boolean z6 = z3;
                                                            qcb qcbVar4 = qcb.this;
                                                            alvw g7 = qcb.a.g();
                                                            g7.X(alwp.a, "BugleGroupManagement");
                                                            alvg alvgVar3 = (alvg) g7;
                                                            alvgVar3.X(ydl.p, conversationIdType);
                                                            alvgVar3.X(ydl.I, str7);
                                                            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "tryToUpgradeExistingMmsGroup", 447, "IncomingRcsGroupNotificationConversationGetter.java")).q("Upgrade of MMS group to RCS was successful.");
                                                            if (z6) {
                                                                vco vcoVar2 = (vco) qcbVar4.j.b();
                                                                conversationIdType.getClass();
                                                                aozy createBuilder2 = amst.b.createBuilder();
                                                                createBuilder2.getClass();
                                                                aktp.bm(((lzz) vcoVar2.a.b()).a(conversationIdType), createBuilder2);
                                                                aktp.bn(4, createBuilder2);
                                                                aktp.bp(3, createBuilder2);
                                                                aktp.bo(3, createBuilder2);
                                                                vcoVar2.j(aktp.bl(createBuilder2));
                                                            } else if (z5) {
                                                                vco vcoVar3 = (vco) qcbVar4.j.b();
                                                                conversationIdType.getClass();
                                                                aozy createBuilder3 = amst.b.createBuilder();
                                                                createBuilder3.getClass();
                                                                aktp.bm(((lzz) vcoVar3.a.b()).a(conversationIdType), createBuilder3);
                                                                aktp.bn(4, createBuilder3);
                                                                aktp.bp(2, createBuilder3);
                                                                aktp.bo(3, createBuilder3);
                                                                vcoVar3.j(aktp.bl(createBuilder3));
                                                            }
                                                            Stream map3 = Collection.EL.stream(qcbVar4.n).map(new ptm(conversationIdType, 20));
                                                            int i15 = alog.d;
                                                            aktp.ad((alog) map3.collect(alls.a)).k(qiu.b(), qcbVar4.c);
                                                            return conversationIdType;
                                                        }
                                                    }, qcbVar3.c);
                                                }
                                                alvw g7 = qcb.a.g();
                                                g7.X(alwp.a, "BugleGroupManagement");
                                                ((alvg) ((alvg) g7).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "tryToUpgradeExistingMmsGroup", 379, "IncomingRcsGroupNotificationConversationGetter.java")).q("No MMS conversation found to upgrade, creating new RCS group instead.");
                                                if (z4) {
                                                    ConversationIdType conversationIdType = (ConversationIdType) optional4.map(new qbb(18)).orElse(ruy.a);
                                                    ((vco) qcbVar3.j.b()).k(conversationIdType);
                                                    vco vcoVar2 = (vco) qcbVar3.j.b();
                                                    conversationIdType.getClass();
                                                    aozy createBuilder2 = amst.b.createBuilder();
                                                    createBuilder2.getClass();
                                                    aktp.bm(((lzz) vcoVar2.a.b()).a(conversationIdType), createBuilder2);
                                                    aktp.bn(5, createBuilder2);
                                                    aktp.bp(3, createBuilder2);
                                                    aktp.bo(3, createBuilder2);
                                                    if (!createBuilder2.b.isMutable()) {
                                                        createBuilder2.u();
                                                    }
                                                    amst amstVar = (amst) createBuilder2.b;
                                                    amstVar.j = 1;
                                                    amstVar.c |= 32;
                                                    vcoVar2.j(aktp.bl(createBuilder2));
                                                }
                                                return aktp.ag(null);
                                            }
                                        }, qcbVar2.d).i(new mmc(qcbVar2, qezVar4, g3, qeiVar4, 3), qcbVar2.b);
                                    }
                                    return i12.h(new kxr(qcbVar2, apaxVar, qeiVar4, 16), qcbVar2.d).h(new algk() { // from class: qcs
                                        /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
                                        @Override // defpackage.algk
                                        public final Object apply(Object obj19) {
                                            qez qezVar6;
                                            qff qffVar2;
                                            upm b5;
                                            long epochMilli;
                                            tss tssVar;
                                            qez qezVar7;
                                            qbs qbsVar2 = (qbs) obj19;
                                            if (qbsVar2 == null) {
                                                return upm.e();
                                            }
                                            qfq qfqVar3 = qfqVar2;
                                            if (qfqVar3.b == 2) {
                                                qezVar6 = (qez) qfqVar3.c;
                                            } else {
                                                qezVar6 = qez.b;
                                            }
                                            qcu qcuVar3 = qcu.this;
                                            int i14 = 16;
                                            if (qbsVar2.e) {
                                                b5 = upm.b();
                                            } else {
                                                Iterator<E> it = qezVar6.g.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        qffVar2 = (qff) it.next();
                                                        qei qeiVar7 = qbsVar2.j;
                                                        qei qeiVar8 = qffVar2.c;
                                                        if (qeiVar8 == null) {
                                                            qeiVar8 = qei.a;
                                                        }
                                                        if (qeiVar7.equals(qeiVar8)) {
                                                            break;
                                                        }
                                                    } else {
                                                        qffVar2 = null;
                                                        break;
                                                    }
                                                }
                                                if (qffVar2 == null) {
                                                    b5 = upm.d();
                                                } else {
                                                    qfm qfmVar = qfm.a;
                                                    qfm qfmVar2 = qffVar2.e;
                                                    if (qfmVar2 == null) {
                                                        qfmVar2 = qfmVar;
                                                    }
                                                    boolean equals = qfmVar.equals(qfmVar2);
                                                    int i15 = 15;
                                                    if (!equals) {
                                                        qfm qfmVar3 = qffVar2.e;
                                                        if (qfmVar3 == null) {
                                                            qfmVar3 = qfm.a;
                                                        }
                                                        alvw m = qcu.a.m();
                                                        m.X(ydl.o, qbsVar2.a.toString());
                                                        m.X(ydl.I, qbsVar2.f);
                                                        ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupChatNotificationRequestHandler", "insertNewConversationParticipantTombstoneWithReferrer", 399, "IncomingGroupChatNotificationRequestHandler.java")).q("New incoming RCS group conversation with referrer.");
                                                        Stream filter = Collection.EL.stream(qcu.k(qezVar6)).filter(new ncc(qfmVar3, 15));
                                                        int i16 = alog.d;
                                                        List list = (List) Collection.EL.stream((alog) filter.collect(alls.a)).map(new mut(qcuVar3, qbsVar2, i14)).collect(alls.a);
                                                        qei qeiVar9 = qfmVar3.c;
                                                        if (qeiVar9 == null) {
                                                            qeiVar9 = qei.a;
                                                        }
                                                        ParticipantsTable.BindData j2 = qcuVar3.j(qeiVar9, qbsVar2);
                                                        ujv ujvVar = (ujv) qcuVar3.h.b();
                                                        ConversationIdType conversationIdType = qbsVar2.a;
                                                        qwm qwmVar = qbsVar2.n;
                                                        Optional empty = Optional.empty();
                                                        if ((qfmVar3.b & 2) != 0) {
                                                            apct apctVar = qfmVar3.d;
                                                            if (apctVar == null) {
                                                                apctVar = apct.a;
                                                            }
                                                            epochMilli = apds.a(apctVar);
                                                        } else {
                                                            epochMilli = qcuVar3.i.f().toEpochMilli();
                                                        }
                                                        ujvVar.h(empty, conversationIdType, qwmVar, j2, list, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, epochMilli, -1L);
                                                    } else {
                                                        alvw m2 = qcu.a.m();
                                                        m2.X(ydl.o, qbsVar2.a.toString());
                                                        m2.X(ydl.I, qbsVar2.f);
                                                        ((alwl) m2.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupChatNotificationRequestHandler", "insertNewConversationParticipantTombstoneNoReferrer", 365, "IncomingGroupChatNotificationRequestHandler.java")).q("New incoming RCS group conversation without referrer.");
                                                        Stream map3 = Collection.EL.stream(qcu.k(qezVar6)).map(new mut(qcuVar3, qbsVar2, i15));
                                                        int i17 = alog.d;
                                                        for (ParticipantsTable.BindData bindData : (List) map3.collect(alls.a)) {
                                                            ((ujv) qcuVar3.h.b()).h(Optional.empty(), qbsVar2.a, qbsVar2.n, bindData, new ArrayList(alog.r(bindData)), BasePaymentResult.ERROR_REQUEST_FAILED, qcuVar3.i.f().toEpochMilli(), -1L);
                                                        }
                                                    }
                                                    b5 = upm.b();
                                                }
                                            }
                                            iew iewVar = (iew) qcuVar3.j.b();
                                            if (((okg) qcuVar3.l.b()).a()) {
                                                Stream filter2 = Collection.EL.stream(qezVar6.g).map(new qcq(2)).filter(new ncc(((xtj) qcuVar3.k.b()).e(), 16));
                                                int i18 = alog.d;
                                                alog alogVar2 = (alog) filter2.collect(alls.a);
                                                aozy createBuilder = tss.a.createBuilder();
                                                String a = qbsVar2.a.a();
                                                if (!createBuilder.b.isMutable()) {
                                                    createBuilder.u();
                                                }
                                                apag apagVar = createBuilder.b;
                                                a.getClass();
                                                ((tss) apagVar).b = a;
                                                if (!apagVar.isMutable()) {
                                                    createBuilder.u();
                                                }
                                                tss tssVar2 = (tss) createBuilder.b;
                                                tssVar2.a();
                                                aoyj.addAll(alogVar2, tssVar2.c);
                                                tssVar = (tss) createBuilder.s();
                                            } else {
                                                aozy createBuilder2 = tss.a.createBuilder();
                                                String a2 = qbsVar2.a.a();
                                                if (!createBuilder2.b.isMutable()) {
                                                    createBuilder2.u();
                                                }
                                                tss tssVar3 = (tss) createBuilder2.b;
                                                a2.getClass();
                                                tssVar3.b = a2;
                                                tssVar = (tss) createBuilder2.s();
                                            }
                                            ((uof) iewVar.a.b()).a(upk.a("update_conversation_encryption_status", tssVar));
                                            vth vthVar = (vth) qcuVar3.m.b();
                                            if (qfqVar3.b == 2) {
                                                qezVar7 = (qez) qfqVar3.c;
                                            } else {
                                                qezVar7 = qez.b;
                                            }
                                            vthVar.b(qezVar7, qbsVar2, aplo.GROUP_FULL_STATE_NOTIFICATION);
                                            return b5;
                                        }
                                    }, qcuVar2.c);
                                }
                                alwl alwlVar = (alwl) qcu.a.i();
                                alwlVar.X(ydl.I, qcu.l(qfqVar2));
                                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupChatNotificationRequestHandler", "createNewGroup", 222, "IncomingGroupChatNotificationRequestHandler.java")).q("Received group event for nonexistent group");
                                return aktp.ag(upm.d());
                            }
                            int k2 = qkq.k(qfqVar2.b);
                            byte[] bArr2 = null;
                            if (k2 != 0) {
                                int i14 = k2 - 1;
                                if (i14 != 0) {
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            throw new IllegalArgumentException("No case handled in getGroupConversationMetadata");
                                        }
                                        throw new IllegalArgumentException("No notification set in IncomingGroupChatNotificationRequest");
                                    }
                                    qya qyaVar = (qya) qcuVar2.e.b();
                                    if (qfqVar2.b == 2) {
                                        qezVar3 = (qez) qfqVar2.c;
                                    } else {
                                        qezVar3 = qez.b;
                                    }
                                    j = qyaVar.j(qezVar3, qbsVar);
                                } else {
                                    qya qyaVar2 = (qya) qcuVar2.f.b();
                                    if (qfqVar2.b == 1) {
                                        qeyVar3 = (qey) qfqVar2.c;
                                    } else {
                                        qeyVar3 = qey.c;
                                    }
                                    j = qyaVar2.j(qeyVar3, qbsVar);
                                }
                                return j.i(new pri(qcuVar2, qbsVar, 19, bArr2), qcuVar2.b).h(new kxr(qcuVar2, qfqVar2, qbsVar, 18, (char[]) null), qcuVar2.c);
                            }
                            throw null;
                        }
                    }, qcuVar.b).e(qcl.class, new puy(obj17, i2), qcuVar.b);
                }
                throw null;
            case 19:
                qfl qflVar = (qfl) obj;
                qbu qbuVar = (qbu) ((qcu) this.b).g.b();
                qbp qbpVar = qbuVar.c;
                ConversationIdType conversationIdType = ((qbs) this.a).a;
                char[] cArr = null;
                return qbpVar.a(conversationIdType, qflVar).i(new mhv(qbuVar, conversationIdType, qflVar, 19, cArr), qbuVar.g).i(new mhv(qbuVar, conversationIdType, qflVar, 20, cArr), qbuVar.g).i(new qbt(qbuVar, conversationIdType, qflVar, i5), qbuVar.g).i(new qbt(qbuVar, conversationIdType, qflVar, 0), qbuVar.g).i(new qbt(qbuVar, conversationIdType, qflVar, i4), qbuVar.g).i(new qbt(qbuVar, conversationIdType, qflVar, i3), qbuVar.g).e(qcc.class, new puy(conversationIdType, 5), qbuVar.g);
            default:
                upm upmVar = (upm) obj;
                upmVar.getClass();
                if (upmVar.a) {
                    return ((qcy) this.a).a.a((qfp) this.b).h(new psf(20), andi.a);
                }
                return aktp.ag(upmVar);
        }
    }

    public /* synthetic */ pri(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
