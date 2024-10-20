package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tvp implements ancr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ tvp(ahrn ahrnVar, aozy aozyVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, String str, int i) {
        this.f = i;
        this.b = ahrnVar;
        this.e = aozyVar;
        this.c = listenableFuture;
        this.a = listenableFuture2;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, altk] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, altk] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        akul h;
        Object obj;
        alog alogVar = null;
        switch (this.f) {
            case 0:
                Object obj2 = this.c;
                if (obj2 != null) {
                    alogVar = alog.r(obj2);
                }
                Object obj3 = this.e;
                return ((tvr) this.a).c((qei) this.b, alogVar, alog.r(this.d), (amkd) obj3);
            case 1:
                Optional optional = (Optional) albo.bQ(this.e);
                final rto rtoVar = (rto) albo.bQ(this.d);
                Object obj4 = this.b;
                final ?? r2 = this.a;
                Object obj5 = this.c;
                akrh e = aktp.e("DraftDataService#combineWithIncomingDraft");
                try {
                    if (rtoVar == null) {
                        h = aktp.ag(new imj(Optional.empty(), 1));
                    } else {
                        final iml imlVar = (iml) obj5;
                        final imk imkVar = (imk) obj4;
                        h = aktp.ai(new hbd(obj4, optional, rtoVar, 2, (byte[]) null), ((imk) obj4).g).h(new algk() { // from class: imf
                            @Override // defpackage.algk
                            public final Object apply(Object obj6) {
                                imj imjVar;
                                imk imkVar2 = imk.this;
                                ConversationIdType conversationIdType = imkVar2.l;
                                MessageCoreData messageCoreData = (MessageCoreData) obj6;
                                SelfIdentityId f = rtoVar.f();
                                MessageCoreData messageCoreData2 = r2;
                                akrh e2 = aktp.e("DraftDataService#combineDrafts");
                                try {
                                    if (messageCoreData == null && messageCoreData2 == null) {
                                        alvw m = imk.a.m();
                                        m.X(imk.b, conversationIdType.toString());
                                        m.X(imk.c, ((SelfIdentityIdImpl) f).a);
                                        ((alwl) m.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 652, "DraftDataService.java")).q("empty draft.");
                                        imjVar = new imj(Optional.empty(), 1);
                                    } else if (messageCoreData2 == null) {
                                        messageCoreData.getClass();
                                        alvw m2 = imk.a.m();
                                        m2.X(imk.b, conversationIdType.toString());
                                        m2.X(imk.c, ((SelfIdentityIdImpl) f).a);
                                        ((alwl) m2.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 661, "DraftDataService.java")).q("read existing draft.");
                                        imjVar = new imj(Optional.of(messageCoreData), 3);
                                    } else {
                                        iml imlVar2 = imlVar;
                                        if (messageCoreData != null && imlVar2.equals(iml.c)) {
                                            alvw m3 = imk.a.m();
                                            m3.X(imk.b, conversationIdType.toString());
                                            m3.X(imk.c, ((SelfIdentityIdImpl) f).a);
                                            ((alwl) m3.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 670, "DraftDataService.java")).q("combined non text parts from existing draft with incoming draft.");
                                            messageCoreData2.bB(messageCoreData.u());
                                            for (MessagePartCoreData messagePartCoreData : messageCoreData.W()) {
                                                if (!messagePartCoreData.aT()) {
                                                    messageCoreData2.aH(messagePartCoreData);
                                                }
                                            }
                                            imjVar = new imj(Optional.of(messageCoreData2), 4);
                                        } else {
                                            if (imlVar2.equals(iml.b) && messageCoreData != null) {
                                                String am = messageCoreData.am();
                                                String am2 = messageCoreData2.am();
                                                if ((TextUtils.isEmpty(am) || TextUtils.isEmpty(am2)) && messageCoreData.u() == null) {
                                                    alvw m4 = imk.a.m();
                                                    m4.X(imk.b, conversationIdType.toString());
                                                    m4.X(imk.c, ((SelfIdentityIdImpl) f).a);
                                                    ((alwl) m4.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 697, "DraftDataService.java")).q("combining existing and incoming drafts.");
                                                    Iterator it = messageCoreData2.W().iterator();
                                                    while (it.hasNext()) {
                                                        messageCoreData.aH((MessagePartCoreData) it.next());
                                                    }
                                                    imjVar = new imj(Optional.of(messageCoreData), 4);
                                                }
                                            }
                                            alvw m5 = imk.a.m();
                                            m5.X(imk.b, conversationIdType.toString());
                                            m5.X(imk.c, ((SelfIdentityIdImpl) f).a);
                                            ((alwl) m5.h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "combineDrafts", 682, "DraftDataService.java")).q("created new draft from incoming draft.");
                                            imjVar = new imj(Optional.of(imkVar2.e.e(conversationIdType, f, messageCoreData2)), 2);
                                        }
                                    }
                                    e2.close();
                                    return imjVar;
                                } catch (Throwable th) {
                                    try {
                                        e2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }, ((imk) obj4).f);
                        e.b(h);
                    }
                    e.close();
                    return h;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 2:
                boolean booleanValue = ((Boolean) new mss(11).get()).booleanValue();
                Object obj6 = this.b;
                Object obj7 = this.d;
                if (booleanValue && obj6 != null) {
                    obj = ((qei) obj6).d;
                } else {
                    obj = obj7;
                }
                tvt tvtVar = (tvt) this.c;
                return tvtVar.k.j((String) obj).i(new qcf(tvtVar, (String) obj7, (qei) obj6, (altk) this.a, (altk) this.e, 5), tvtVar.g);
            case 3:
                boolean booleanValue2 = ((Boolean) albo.bQ(this.a)).booleanValue();
                Object obj8 = this.c;
                Object obj9 = this.b;
                if (!booleanValue2) {
                    vcj.a.l("Performing registration because it is currently not registered.");
                    return ((vcj) obj8).g((vbq) obj9);
                }
                vcj vcjVar = (vcj) obj8;
                if (vcjVar.i.get()) {
                    vcj.a.l("Forcing a refresh.");
                    return vcjVar.g((vbq) obj9);
                }
                if (!((Boolean) albo.bQ(this.e)).booleanValue()) {
                    vcj.a.l("Forcing a re-register because the state is set to not registered.");
                    return vcjVar.g((vbq) obj9);
                }
                if (ttd.a() && !((Boolean) albo.bQ(this.d)).booleanValue()) {
                    vcj.a.l("Forcing a refresh for etouffee.");
                    return vcjVar.g((vbq) obj9);
                }
                vcj.a.l("Already registered, skipping refresh");
                return aktp.ag(aqfg.a);
            case 4:
                aozy createBuilder = qfy.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj10 = this.e;
                Object obj11 = this.b;
                Object obj12 = this.a;
                qfy qfyVar = (qfy) createBuilder.b;
                obj12.getClass();
                qfyVar.c = (qfb) obj12;
                qfyVar.b = 1 | qfyVar.b;
                createBuilder.L((qei) obj11);
                aozb byteString = ((aoyj) obj10).toByteString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                qfy qfyVar2 = (qfy) apagVar;
                qfyVar2.b = 2 | qfyVar2.b;
                qfyVar2.e = byteString;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                Object obj13 = this.c;
                qfy qfyVar3 = (qfy) createBuilder.b;
                obj13.getClass();
                qfyVar3.f = (qei) obj13;
                qfyVar3.b |= 4;
                qgr qgrVar = ((qfx) obj10).f;
                if (qgrVar == null) {
                    qgrVar = qgr.a;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj14 = this.d;
                qfy qfyVar4 = (qfy) createBuilder.b;
                qgrVar.getClass();
                qfyVar4.g = qgrVar;
                qfyVar4.b |= 8;
                return ((vwy) obj14).f.c((qfy) createBuilder.s());
            case 5:
                Object obj15 = this.d;
                if (obj15 != null) {
                    Object obj16 = this.b;
                    Object obj17 = this.e;
                    Object obj18 = this.a;
                    xsr xsrVar = new xsr(null);
                    xsrVar.b = Optional.of(obj18);
                    xsrVar.b((String) obj17);
                    xsrVar.c = obj16;
                    HttpFileTransferPushMessage a = HttpFileTransferPushMessage.a((byte[]) obj15);
                    Instant instant = (Instant) obj18;
                    qep a2 = woe.a(instant, a.mFileInfo);
                    aozy createBuilder2 = qeq.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    qeq qeqVar = (qeq) createBuilder2.b;
                    a2.getClass();
                    qeqVar.c = a2;
                    qeqVar.b |= 1;
                    if (a.b()) {
                        qep a3 = woe.a(instant, a.mThumbnailInfo);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        qeq qeqVar2 = (qeq) createBuilder2.b;
                        a3.getClass();
                        qeqVar2.d = a3;
                        qeqVar2.b |= 2;
                    }
                    Object obj19 = this.c;
                    xsrVar.c((qeq) createBuilder2.s());
                    return ((woe) obj19).i.a(xsrVar.a(), Optional.empty());
                }
                throw new IllegalStateException("Missing RCS XML response.");
            case 6:
                return ((xrf) this.e).e(this.b, (rve) this.c, (ParticipantsTable.BindData) this.a, (Optional) albo.bQ(this.d));
            case 7:
                if (((Optional) this.d).isEmpty()) {
                    Object obj20 = this.c;
                    alwl alwlVar = (alwl) xrf.a.h();
                    alwlVar.X(ydl.e, ((rve) obj20).toString());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "scheduleFinishingActions", 869, "IncomingFileTransferProcessor.java")).q("Failed to store incoming file transfer push message in Telephony.");
                    return aktp.ag(pwh.FAIL_RETRY);
                }
                Object obj21 = this.a;
                ?? r4 = this.b;
                Object obj22 = this.e;
                wnc wncVar = new wnc(obj22, r4.z(), 10);
                xrf xrfVar = (xrf) obj22;
                akul ah = aktp.ah(wncVar, xrfVar.c);
                ((ahmv) xrfVar.o.b()).j(r4, null);
                return aktp.ap(ah, xrfVar.r.b(r4.B()).q().i(new xdg(12), xrfVar.c), ((ptb) xrfVar.z.b()).b(((msk) xrfVar.x.b()).s((ParticipantsTable.BindData) obj21), r4)).h(new wkf(r4, 14), xrfVar.c);
            default:
                Object obj23 = this.e;
                try {
                    Map map = (Map) ((algw) albo.bQ(this.c)).e();
                    if (map != null) {
                        aozy aozyVar = (aozy) obj23;
                        long j = ((asim) aozyVar.b).c;
                        for (Map.Entry entry : map.entrySet()) {
                            Integer num = (Integer) entry.getKey();
                            num.intValue();
                            long longValue = ((Long) entry.getValue()).longValue() - j;
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            asim asimVar = (asim) aozyVar.b;
                            apbo apboVar = asimVar.w;
                            if (!apboVar.b) {
                                asimVar.w = apboVar.a();
                            }
                            asimVar.w.put(num, Long.valueOf(longValue));
                        }
                    }
                } catch (Exception e2) {
                    ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e2)).h("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).q("Failed to get custom timestamps future");
                }
                Object obj24 = this.b;
                ahmq a4 = ahmr.a();
                aozy createBuilder3 = asjt.a.createBuilder();
                aozy createBuilder4 = asii.a.createBuilder();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                asii asiiVar = (asii) createBuilder4.b;
                asiiVar.b |= 1;
                asiiVar.c = leastSignificantBits;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                asii asiiVar2 = (asii) createBuilder4.b;
                asiiVar2.d = 2;
                asiiVar2.b = 2 | asiiVar2.b;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                asii asiiVar3 = (asii) createBuilder4.b;
                asim asimVar2 = (asim) ((aozy) obj23).s();
                asimVar2.getClass();
                asiiVar3.f = asimVar2;
                asiiVar3.b |= 16;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                Object obj25 = ((ahrn) obj24).a;
                Object obj26 = this.d;
                ?? r22 = this.a;
                asjt asjtVar = (asjt) createBuilder3.b;
                asii asiiVar4 = (asii) createBuilder4.s();
                asiiVar4.getClass();
                asjtVar.m = asiiVar4;
                asjtVar.b |= 2048;
                a4.e((asjt) createBuilder3.s());
                a4.b = (ashu) ((algw) albo.bQ(r22)).e();
                a4.c = (String) obj26;
                a4.d(true);
                return ((ahmu) obj25).b(a4.a());
        }
    }

    public /* synthetic */ tvp(imk imkVar, akul akulVar, akul akulVar2, MessageCoreData messageCoreData, iml imlVar, int i) {
        this.f = i;
        this.b = imkVar;
        this.e = akulVar;
        this.d = akulVar2;
        this.a = messageCoreData;
        this.c = imlVar;
    }

    public /* synthetic */ tvp(tvr tvrVar, qei qeiVar, qei qeiVar2, String str, amkd amkdVar, int i) {
        this.f = i;
        this.a = tvrVar;
        this.b = qeiVar;
        this.c = qeiVar2;
        this.d = str;
        this.e = amkdVar;
    }

    public /* synthetic */ tvp(tvt tvtVar, String str, qei qeiVar, altk altkVar, altk altkVar2, int i) {
        this.f = i;
        this.c = tvtVar;
        this.d = str;
        this.b = qeiVar;
        this.a = altkVar;
        this.e = altkVar2;
    }

    public /* synthetic */ tvp(vcj vcjVar, akul akulVar, vbq vbqVar, akul akulVar2, akul akulVar3, int i) {
        this.f = i;
        this.c = vcjVar;
        this.a = akulVar;
        this.b = vbqVar;
        this.e = akulVar2;
        this.d = akulVar3;
    }

    public /* synthetic */ tvp(vwy vwyVar, qfb qfbVar, qei qeiVar, qfx qfxVar, qei qeiVar2, int i) {
        this.f = i;
        this.d = vwyVar;
        this.a = qfbVar;
        this.b = qeiVar;
        this.e = qfxVar;
        this.c = qeiVar2;
    }

    public /* synthetic */ tvp(woe woeVar, byte[] bArr, Instant instant, String str, rve rveVar, int i) {
        this.f = i;
        this.c = woeVar;
        this.d = bArr;
        this.a = instant;
        this.e = str;
        this.b = rveVar;
    }

    public /* synthetic */ tvp(xrf xrfVar, MessageCoreData messageCoreData, rve rveVar, ParticipantsTable.BindData bindData, akul akulVar, int i) {
        this.f = i;
        this.e = xrfVar;
        this.b = messageCoreData;
        this.c = rveVar;
        this.a = bindData;
        this.d = akulVar;
    }

    public /* synthetic */ tvp(xrf xrfVar, Optional optional, rve rveVar, MessageCoreData messageCoreData, ParticipantsTable.BindData bindData, int i) {
        this.f = i;
        this.e = xrfVar;
        this.d = optional;
        this.c = rveVar;
        this.b = messageCoreData;
        this.a = bindData;
    }
}
