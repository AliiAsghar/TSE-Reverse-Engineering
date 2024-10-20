package defpackage;

import android.net.Uri;
import android.telephony.ims.RcsContactPresenceTuple;
import android.telephony.ims.RcsContactUceCapability;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.GetOrCreateConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.businessinfo.json.CombinedBusinessInfoAndVerifierInfoJson;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class prf implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ prf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v170, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v175, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v180, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [pss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [armf, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        pre a;
        ptz a2;
        alog alogVar;
        Object obj2;
        akul h;
        int i = 13;
        int i2 = 11;
        int i3 = 10;
        int i4 = 18;
        int i5 = 2;
        int i6 = 9;
        int i7 = 8;
        int i8 = 0;
        qgr qgrVar = null;
        int i9 = 1;
        switch (this.b) {
            case 0:
                pro proVar = (pro) obj;
                if (proVar.a != 200) {
                    return aktp.ag(prk.a());
                }
                Object obj3 = this.a;
                prk.a.p(proVar.a());
                String str = (String) obj3;
                prk.a.o("Attempting to parse json for ".concat(str));
                try {
                    CombinedBusinessInfoAndVerifierInfoJson combinedBusinessInfoAndVerifierInfoJson = (CombinedBusinessInfoAndVerifierInfoJson) prk.c.i(proVar.a(), CombinedBusinessInfoAndVerifierInfoJson.class);
                    prk.a.o("Done parsing json for " + ((String) obj3));
                    if (combinedBusinessInfoAndVerifierInfoJson == null) {
                        prk.a.m("Received null json object when parsing info for " + ((String) obj3));
                        a = prk.a();
                    } else {
                        boolean verified = combinedBusinessInfoAndVerifierInfoJson.getVerified();
                        String ag = albo.ag(combinedBusinessInfoAndVerifierInfoJson.getColour());
                        String ag2 = albo.ag(combinedBusinessInfoAndVerifierInfoJson.getName());
                        aozy createBuilder = pre.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar = createBuilder.b;
                        ((pre) apagVar).b = true;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar2 = createBuilder.b;
                        ((pre) apagVar2).c = verified;
                        if (!apagVar2.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar3 = createBuilder.b;
                        ((pre) apagVar3).d = ag;
                        if (!apagVar3.isMutable()) {
                            createBuilder.u();
                        }
                        ((pre) createBuilder.b).e = ag2;
                        a = (pre) createBuilder.s();
                    }
                } catch (aook e) {
                    prk.a.m("Unable to parse business info due to invalid JSON for botId " + str + ": " + e.getMessage());
                    a = prk.a();
                }
                return aktp.ag(a);
            case 1:
                Object obj4 = this.a;
                return aktp.ai(new mzn(obj4, (Uri) obj, i7), ((nhm) obj4).b);
            case 2:
                Map map = (Map) obj;
                ((alwl) pul.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 155, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: getCapabilitiesFromDelegate returned delegateCapabilities for %d chatEndpoints", map.size());
                pul pulVar = (pul) this.a;
                return pulVar.b.c(map).h(new ndd(map, i4), pulVar.e);
            case 3:
                Map map2 = (Map) obj;
                Stream stream = Collection.EL.stream(map2.entrySet());
                Object obj5 = this.a;
                alor alorVar = (alor) stream.filter(new ncc(obj5, i7)).collect(alor.t());
                if (alorVar.isEmpty()) {
                    return aktp.ag(null);
                }
                ((alwl) pus.a.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "fetchCapabilitiesInBackgroundIfInvalid", 209, "RcsCapabilitiesBackgroundUpdater.java")).u("RcsCapabilitiesBackgroundUpdater: %d of %d capabilities in batch are invalid. Starting backgroundProvider.getBatchCapabilities", alorVar.size(), map2.size());
                pus pusVar = (pus) obj5;
                return pusVar.b.a(alorVar.keySet()).i(new mhv(obj5, alorVar, map2, 16), pusVar.d);
            case 4:
                RcsContactUceCapability rcsContactUceCapability = (RcsContactUceCapability) obj;
                pvd pvdVar = (pvd) this.a;
                Instant f = pvdVar.e.f();
                int capabilityMechanism = rcsContactUceCapability.getCapabilityMechanism();
                puc pucVar = pvdVar.c;
                if (capabilityMechanism == 1) {
                    List<RcsContactPresenceTuple> capabilityTuples = rcsContactUceCapability.getCapabilityTuples();
                    HashSet hashSet = new HashSet();
                    for (RcsContactPresenceTuple rcsContactPresenceTuple : capabilityTuples) {
                        if (rcsContactPresenceTuple == null) {
                            ((alwl) ((alwl) puc.a.i()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/converter/RcsCapabilitiesConverter", "convertTupleListToRcsCapabilities", 73, "RcsCapabilitiesConverter.java")).q("[SR] Received a null presence capabilities tuple.");
                        } else if (!"closed".equals(rcsContactPresenceTuple.getStatus())) {
                            pvm pvmVar = new pvm();
                            pvmVar.e(rcsContactPresenceTuple.getServiceId());
                            pvmVar.f(rcsContactPresenceTuple.getServiceVersion());
                            pub d = pvmVar.d();
                            alor alorVar2 = (alor) pucVar.c.a.get();
                            if (alorVar2.containsKey(d)) {
                                alogVar = (alog) alorVar2.get(d);
                            } else {
                                int i10 = alog.d;
                                alogVar = alsx.a;
                            }
                            hashSet.addAll(alogVar);
                            RcsContactPresenceTuple.ServiceCapabilities serviceCapabilities = rcsContactPresenceTuple.getServiceCapabilities();
                            if (serviceCapabilities != null && d.equals(pud.m) && serviceCapabilities.isVideoCapable()) {
                                hashSet.add("video");
                            }
                        }
                    }
                    if (!hashSet.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp")) {
                        hashSet.remove("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session.group");
                    }
                    a2 = puc.a(pucVar.b.a(hashSet));
                } else {
                    a2 = puc.a(pucVar.b.a(rcsContactUceCapability.getFeatureTags()));
                }
                pvm pvmVar2 = new pvm();
                pvmVar2.i(a2);
                pvmVar2.h(f);
                return aktp.ag(pvmVar2.g());
            case 5:
                return ((qan) this.a).c.e();
            case 6:
                return this.a.b((qen) obj);
            case 7:
                try {
                    return aktp.ag(((psq) ((qcb) this.a).g.b()).a((String) obj, false));
                } catch (IllegalArgumentException e2) {
                    return aktp.af(new qcl(e2));
                }
            case 8:
                Throwable th = (Throwable) obj;
                qiu.g(th, (RuntimeException) this.a, new qcq(i3));
                return aktp.af(th);
            case 9:
                Optional optional = (Optional) obj;
                if (optional.isPresent() && ((Integer) optional.get()).intValue() >= 6) {
                    qqx qqxVar = (qqx) this.a;
                    qqxVar.d = (Integer) optional.get();
                    obj2 = qqxVar.b.get();
                    return ((wul) obj2).j(new qlf(optional, i3)).h(new qlf(optional, i2), andi.a);
                }
                return aktp.ag(optional);
            case 10:
                qrf qrfVar = (qrf) obj;
                if ((qrfVar.b & 1) != 0) {
                    return aktp.ag(Optional.of(Integer.valueOf(qrfVar.c)));
                }
                Object obj6 = this.a;
                qqx qqxVar2 = (qqx) obj6;
                return ((qrh) qqxVar2.a.b()).a().i(new prf(obj6, i6), qqxVar2.c);
            case 11:
                utz utzVar = qrb.a;
                try {
                    this.a.run();
                    return aktp.ag(null);
                } catch (RuntimeException e3) {
                    return aktp.af(e3);
                }
            case 12:
                return ((uvi) ((qrg) this.a).d.b()).b((Throwable) obj);
            case 13:
                return ((GenericWorkerQueueAction) this.a).l((ArrayList) obj);
            case 14:
                Object obj7 = GenericWorkerQueueAction.a;
                if (((Boolean) obj).booleanValue()) {
                    return (ListenableFuture) this.a.getValue();
                }
                return aktp.ag(false);
            case 15:
                GetOrCreateConversationAction getOrCreateConversationAction = (GetOrCreateConversationAction) this.a;
                armf armfVar = getOrCreateConversationAction.b;
                Optional optional2 = (Optional) obj;
                String l = getOrCreateConversationAction.u.l("trace_id");
                mmx mmxVar = (mmx) armfVar.b();
                long epochMilli = getOrCreateConversationAction.a.f().toEpochMilli();
                rhl rhlVar = getOrCreateConversationAction.u;
                String l2 = rhlVar.l("conversation_name");
                boolean y = rhlVar.y("is_rcs_group_conversation");
                alog n = alog.n(rhlVar.m("participants_list"));
                Optional empty = Optional.empty();
                if (l != null) {
                    aozy createBuilder2 = qgr.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    qgr qgrVar2 = (qgr) createBuilder2.b;
                    qgrVar2.b |= 1;
                    qgrVar2.c = l;
                    qgrVar = (qgr) createBuilder2.s();
                }
                return mmxVar.c(epochMilli, l2, y, optional2, n, empty, qgrVar);
            case 16:
                RuntimeException runtimeException = (RuntimeException) obj;
                ((InsertNewMessageAction) this.a).h(runtimeException);
                throw runtimeException;
            case 17:
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                if (messageCoreData == null) {
                    return aktp.ag(null);
                }
                xpc c = xpf.c();
                c.w("pauseFileTransferForChatApi");
                ahmv ahmvVar = xpf.d;
                c.c((xoy) ahmvVar.b, (xoy) ahmvVar.d);
                c.e(new qwz(messageCoreData, i4));
                xow xowVar = (xow) ((xoz) c.b().n()).cO();
                if (xowVar == null) {
                    alvw i11 = PauseRcsFileTransferAction.a.i();
                    i11.X(alwp.a, "BugleDataModel");
                    alvg alvgVar = (alvg) i11;
                    alvgVar.X(ydl.b, messageCoreData.B());
                    alvgVar.X(ydl.f, messageCoreData.E());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", 163, "PauseRcsFileTransferAction.java")).q("No file transfer bind data found. Cannot pause file transfer.");
                    return aktp.ag(null);
                }
                Object obj8 = this.a;
                if (xpg.UPLOAD.equals(xowVar.n())) {
                    PauseRcsFileTransferAction pauseRcsFileTransferAction = (PauseRcsFileTransferAction) obj8;
                    xsf A = pauseRcsFileTransferAction.e.A();
                    String p = xowVar.p();
                    p.getClass();
                    return A.a(p);
                }
                PauseRcsFileTransferAction pauseRcsFileTransferAction2 = (PauseRcsFileTransferAction) obj8;
                xpz z = pauseRcsFileTransferAction2.e.z();
                String p2 = xowVar.p();
                p2.getClass();
                return z.b(p2).f(xpt.class, new jab(i), andi.a).h(new raw(obj8, messageCoreData, i5), pauseRcsFileTransferAction2.b);
            case 18:
                Object obj9 = this.a;
                ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction = (ProcessConversationUpdateAsyncAction) obj9;
                alog alogVar2 = (alog) obj;
                ConversationIdType b = ruy.b(processConversationUpdateAsyncAction.u.l("conversation_id_key"));
                aozy createBuilder3 = anfu.a.createBuilder();
                if (processConversationUpdateAsyncAction.k.a()) {
                    if (b.b()) {
                        List n2 = ((uie) processConversationUpdateAsyncAction.f.b()).n(processConversationUpdateAsyncAction.u.e("conversation_timestamp_key", Long.MAX_VALUE));
                        xyo c2 = ProcessConversationUpdateAsyncAction.a.c();
                        c2.K("conversationsToUpdate", n2);
                        c2.H("conversations need retrying.");
                        c2.q();
                        Stream map3 = Collection.EL.stream(n2).map(new rbp(obj9, alogVar2, i8));
                        int i12 = alog.d;
                        return aktp.ad((alog) map3.collect(alls.a)).h(new rau(createBuilder3, 4), processConversationUpdateAsyncAction.d);
                    }
                    rto z2 = ((uac) processConversationUpdateAsyncAction.i.b()).z(b);
                    if (z2 == null) {
                        createBuilder3.aT(((vbm) processConversationUpdateAsyncAction.g.b()).c(b));
                        return aktp.ag((anfu) createBuilder3.s());
                    }
                    return ((vbm) processConversationUpdateAsyncAction.g.b()).b(z2, alogVar2).h(new rau(createBuilder3, 5), processConversationUpdateAsyncAction.d);
                }
                if (b.b()) {
                    List n3 = ((uie) processConversationUpdateAsyncAction.f.b()).n(processConversationUpdateAsyncAction.u.e("conversation_timestamp_key", Long.MAX_VALUE));
                    xyo c3 = ProcessConversationUpdateAsyncAction.a.c();
                    c3.K("conversationsToUpdate", n3);
                    c3.H("conversations need retrying.");
                    c3.q();
                    createBuilder3.aS((Iterable) Collection.EL.stream(n3).map(new rbp(obj9, alogVar2, i5)).collect(Collectors.toCollection(new qxs(i6))));
                    return aktp.ag((anfu) createBuilder3.s());
                }
                rto z3 = ((uac) processConversationUpdateAsyncAction.i.b()).z(b);
                if (z3 == null) {
                    createBuilder3.aT(((vbm) processConversationUpdateAsyncAction.g.b()).c(b));
                    return aktp.ag((anfu) createBuilder3.s());
                }
                createBuilder3.aT(((vbm) processConversationUpdateAsyncAction.g.b()).d(z3, alogVar2));
                return aktp.ag((anfu) createBuilder3.s());
            case 19:
                anfu anfuVar = (anfu) obj;
                if (((Boolean) ((utz) trf.i.get()).e()).booleanValue()) {
                    Object obj10 = this.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator<E> it = anfuVar.b.iterator();
                    while (true) {
                        ahmv ahmvVar2 = ((ProcessConversationUpdateAsyncAction) obj10).o;
                        if (it.hasNext()) {
                            anfr anfrVar = (anfr) it.next();
                            if (!((okg) ahmvVar2.f.b()).a()) {
                                h = ((vbu) ahmvVar2.b.b()).a();
                            } else {
                                SelfIdentityId W = lga.W(anfrVar.j);
                                if (W == null) {
                                    h = aktp.ag(Optional.empty());
                                } else {
                                    h = ((nfx) ahmvVar2.d.b()).c(W).h(new vej(i), ahmvVar2.a);
                                }
                            }
                            arrayList.add(h.h(new veg(ahmvVar2, 12), ahmvVar2.a).i(new vbl(ahmvVar2, anfrVar, 19, 0 == true ? 1 : 0), ahmvVar2.a));
                        } else {
                            return aktp.ao(arrayList).h(new ulo(anfuVar, arrayList, 15), ahmvVar2.a);
                        }
                    }
                } else {
                    return aktp.ag(anfuVar);
                }
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj11 = this.a;
                if (booleanValue) {
                    uqg uqgVar = (uqg) obj11;
                    vjs vjsVar = (vjs) uqgVar.a.b();
                    return vjsVar.a.h().h(new vdx(i2), andi.a).i(new mfj(vjsVar, ((xnv) uqgVar.b).f().toEpochMilli(), i6), andi.a);
                }
                uqg uqgVar2 = (uqg) obj11;
                vco vcoVar = (vco) uqgVar2.c.b();
                return vcoVar.b.h().h(new vdx(i9), andi.a).i(new mfj(vcoVar, ((xnv) uqgVar2.b).f().toEpochMilli(), i7), andi.a);
        }
    }
}
