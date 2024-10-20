package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.VerifiedSmsRemoteVerificationWork;
import com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.PrekeyBundle;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.RecreateFtdSessionResult;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.media.webrtc.common.StatusOr;
import defpackage.uhr;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tul implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ tul(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, unx] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r1v70, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71, types: [vyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, unx] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        Optional empty;
        Object obj2;
        aozb w;
        char c;
        byte[] cE;
        qeg qegVar;
        asmb asmbVar = null;
        switch (this.d) {
            case 0:
                String str = (String) obj;
                boolean isEmpty = str.isEmpty();
                Object obj3 = this.a;
                if (isEmpty) {
                    ((tum) obj3).d.e("Bugle.Etouffee.Ftd.Process.Status.Counts", 4);
                    return pwh.FAIL_RETRY;
                }
                Object obj4 = this.c;
                Object obj5 = this.b;
                tvh tvhVar = ((tum) obj3).b;
                ajrt ajrtVar = (ajrt) obj5;
                String C = ajrtVar.a.C(StandardCharsets.US_ASCII);
                String contentType = ajrtVar.b.toString();
                qdk qdkVar = (qdk) obj4;
                qei qeiVar = qdkVar.a.d;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                if (tvhVar.d(C, contentType, qeiVar.d, str)) {
                    alwl alwlVar = (alwl) tum.a.g();
                    alwlVar.X(ydl.f, rve.a(qdkVar.a.g));
                    alwlVar.X(ydl.p, ruy.b(qdkVar.a.h));
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processFailedToDecryptReceipt", 329, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Completed processing FTD receipt. The original message has been scheduled  for resending. (The RCS message ID included with this log is for the FTD receipt.)");
                    return pwh.SUCCESS;
                }
                alwl alwlVar2 = (alwl) tum.a.i();
                alwlVar2.X(ydl.f, rve.a(qdkVar.a.g));
                alwlVar2.X(ydl.p, ruy.b(qdkVar.a.h));
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processFailedToDecryptReceipt", 346, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Completed processing FTD receipt. The original message will not be resent. (The RCS message ID included with this log is for the FTD receipt.)");
                return pwh.FAIL_NO_RETRY;
            case 1:
                Integer num = (Integer) obj;
                qqw qqwVar = (qqw) this.a;
                return (alog) ((agnq) qqwVar.e.b()).c("BugleCompatibleConversationMatcher#findAllRcsGroupConversations.txn", new rka(qqwVar, (alog) this.b, num, (qqq) this.c, 1));
            case 2:
                return new tut(!((RecreateFtdSessionResult) twd.a(((NativeMessageEncryptorV2) this.c).recreateFtdSession((Scope) this.b, r15, (ReceiptInfo) this.a))).getCanReencryptMessageId().isEmpty(), Optional.of(aozb.w(((PrekeyBundle) alzz.aP((Iterable) twd.a((StatusOr) obj))).getIdentityKey())));
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    Object obj6 = this.a;
                    Object obj7 = this.c;
                    Object obj8 = this.b;
                    xyo c2 = tvg.a.c();
                    c2.H("Message receipt does not contain the encrypted-data extension.");
                    c2.H("Original message");
                    rve rveVar = (rve) obj7;
                    c2.g(rveVar);
                    c2.H("Imdn message");
                    rve rveVar2 = (rve) obj6;
                    c2.g(rveVar2);
                    c2.q();
                    ((tvg) obj8).q.s(rveVar2, rveVar, 4, 24, 43);
                }
                return tsw.a;
            case 4:
                Object obj9 = this.c;
                Object obj10 = this.a;
                Object obj11 = this.b;
                ((ujv) obj11).h.e("TombstoneInserter#onRbmSimChange", new uju(obj11, obj10, obj9, (Optional) obj, 1));
                return null;
            case 5:
                VerifiedSmsRemoteVerificationWork verifiedSmsRemoteVerificationWork = (VerifiedSmsRemoteVerificationWork) this.a;
                ukj ukjVar = verifiedSmsRemoteVerificationWork.g;
                anly anlyVar = (anly) obj;
                ukjVar.a(amir.VERIFIED, (yua) this.b, verifiedSmsRemoteVerificationWork.h);
                ukj.c.l("Verification response verdict was Verified");
                gsi gsiVar = (gsi) this.c;
                String ag = albo.ag(gsiVar.d("vsms_sender_id"));
                long b = gsiVar.b("vsms_verification_chain_start_time_key", -1L);
                hgi hgiVar = new hgi((char[]) null);
                hgiVar.n("sms_verification_result_key", tqr.VERIFICATION_VERIFIED.name());
                hgiVar.n("vsms_sender_id", ag);
                hgiVar.q("vsms_verification_chain_start_time_key", b);
                if ((anlyVar.b & 1) != 0) {
                    anlw anlwVar = anlyVar.c;
                    if (anlwVar == null) {
                        anlwVar = anlw.a;
                    }
                    String trim = anlwVar.b.trim();
                    String trim2 = anlwVar.c.trim();
                    String trim3 = anlwVar.f.trim();
                    hgiVar.n("sms_verification_brand_id_key", trim);
                    hgiVar.n("sms_verification_brand_name_key", trim2.trim());
                    hgiVar.n("sms_verification_brand_description_key", anlwVar.d.trim());
                    hgiVar.n("sms_verification_brand_version_key", trim3);
                    hgiVar.n("sms_verification_brand_logo_url_key", anlwVar.e);
                    xyo a = ukj.c.a();
                    a.H("Brand data received");
                    a.z("brandId", trim);
                    a.L("name", trim2);
                    a.L("description", anlwVar.d);
                    a.L("logoUrl", anlwVar.e);
                    a.z(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, trim3);
                    a.q();
                    if (!anlwVar.g.G()) {
                        uhs uhsVar = ukjVar.e;
                        String str2 = anlwVar.b;
                        aozb aozbVar = anlwVar.g;
                        File file = new File(uhr.d(uhsVar.c), str2);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                xyo c3 = uhs.b.c();
                                c3.H("Writing vSms brand logo");
                                c3.z("file", file);
                                c3.z("brandId", str2);
                                c3.q();
                                amcp.a(aozbVar.m(), fileOutputStream);
                                Context context = uhsVar.c;
                                Uri build = new Uri.Builder().authority(ujy.f(context)).scheme("content").appendPath(str2).appendQueryParameter("t", String.valueOf(((uhr.a) akec.w(context, uhr.a.class)).fN().a())).build();
                                xyo a2 = uhr.a.a();
                                a2.L("built file uri for Verified SMS brand", build.toString());
                                a2.q();
                                empty = Optional.of(build);
                                fileOutputStream.close();
                            } finally {
                            }
                        } catch (IOException e) {
                            alvw i = uhs.a.i();
                            i.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/provider/VerifiedSmsLogoManager", "saveLogo", 56, "VerifiedSmsLogoManager.java")).t("Unable to write vSms brand logo: %s", file);
                            xyo e2 = uhs.b.e();
                            e2.H("Unable to write VSMS brand logo");
                            e2.z("file", file);
                            e2.z("brandId", str2);
                            e2.r(e);
                            empty = Optional.empty();
                        }
                        empty.ifPresent(new ter(hgiVar, 19));
                    }
                }
                return new gsw(hgiVar.j());
            case 6:
                Throwable th = (Throwable) obj;
                Object obj12 = this.b;
                upm d = upm.d();
                alog alogVar = (alog) obj12;
                String p = ((upr) alogVar.get(0)).p();
                boolean z = th instanceof CancellationException;
                Object obj13 = this.a;
                if (z) {
                    xyo e3 = urr.a.e();
                    e3.H("got CancellationException");
                    e3.x("trancheId", urr.c(alogVar));
                    e3.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, p);
                    e3.q();
                    d = upm.e();
                } else if (th instanceof TimeoutException) {
                    xyo e4 = urr.a.e();
                    e4.H("got TimeoutException");
                    e4.x("trancheId", urr.c(alogVar));
                    e4.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, p);
                    e4.q();
                    d = upm.e();
                } else {
                    xyo b2 = urr.a.b();
                    b2.H("got throwable executing work");
                    b2.x("trancheId", urr.c(alogVar));
                    b2.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, p);
                    b2.z("exception", th.getClass().getName());
                    b2.r(th);
                    if (((Boolean) urr.b.e()).booleanValue()) {
                        ((urr) obj13).k.b(th);
                    }
                }
                ?? r2 = this.c;
                xyo e5 = urr.a.e();
                e5.H(Log.getStackTraceString(th));
                e5.q();
                return ((urr) obj13).d(r2, alogVar, d, unh.COMPLETED);
            case 7:
                return ((urr) this.a).d(this.c, (alog) this.b, (upm) obj, unh.COMPLETED);
            case 8:
                alvw h = uvf.a.h();
                h.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) ((alvg) h).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "invokeFunction", 211, "TickleHandlerHelper.java")).t("TickleHandlerHelper: %s", this.a);
                ((uvf) this.c).c.c((String) this.b);
                return null;
            case 9:
                vec b3 = vec.b(((vee) ((AtomicReference) this.b).get()).j);
                if (b3 == null) {
                    b3 = vec.UNRECOGNIZED;
                }
                Object obj14 = this.c;
                amkk l = vel.l(b3);
                amkk l2 = vel.l((vec) obj14);
                if (l != l2) {
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.BUGLE_E2EE_STATE_TRANSITION;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    aozy createBuilder = ammy.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ammy ammyVar = (ammy) apagVar;
                    ammyVar.c = l.d;
                    ammyVar.b |= 1;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    ammy ammyVar2 = (ammy) createBuilder.b;
                    ammyVar2.d = l2.d;
                    ammyVar2.b |= 2;
                    ammy ammyVar3 = (ammy) createBuilder.s();
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    Object obj15 = this.a;
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    ammyVar3.getClass();
                    amfrVar2.U = ammyVar3;
                    amfrVar2.c |= 16777216;
                    ((maq) ((vel) obj15).d.b()).j(amfqVar);
                }
                return null;
            case 10:
                aozy aozyVar = (aozy) obj;
                aozy createBuilder2 = aqeq.a.createBuilder();
                vfb vfbVar = (vfb) this.c;
                obj2 = vfbVar.c.get();
                aqfn aqfnVar = (aqfn) obj2;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj16 = this.a;
                aqeq aqeqVar = (aqeq) createBuilder2.b;
                aqfnVar.getClass();
                aqeqVar.d = aqfnVar;
                aqeqVar.b |= 2;
                vfl vflVar = (vfl) obj16;
                long a3 = vflVar.a();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                ((aqeq) apagVar2).e = a3;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                aqeq aqeqVar2 = (aqeq) createBuilder2.b;
                aqep aqepVar = (aqep) aozyVar.s();
                aqepVar.getClass();
                aqeqVar2.h = aqepVar;
                aqeqVar2.b |= 4;
                aqeq aqeqVar3 = (aqeq) createBuilder2.s();
                vfb.a.l("Creating RegisterRefreshRequest");
                vcs vcsVar = vfbVar.b;
                akul akulVar = vflVar.f;
                if (akulVar != null) {
                    try {
                        Optional optional = (Optional) albo.bQ(akulVar);
                        if (optional.isPresent()) {
                            asmbVar = (asmb) optional.get();
                        }
                        if (asmbVar != null) {
                            if (((pdu) vcsVar.c.b()).a()) {
                                try {
                                    int i2 = aqeqVar3.f;
                                    if (i2 != 0) {
                                        if (i2 != 2) {
                                            c = 0;
                                        } else {
                                            c = 4;
                                        }
                                    } else {
                                        c = 2;
                                    }
                                    if (c != 0 && c == 4) {
                                        aqgb aqgbVar = aqeqVar3.c;
                                        if (aqgbVar == null) {
                                            aqgbVar = aqgb.a;
                                        }
                                        cE = albo.cE(vcs.d(aqgbVar.c.getBytes(StandardCharsets.UTF_8)), vcs.e(aqeqVar3.e));
                                        w = aozb.w(vcs.f(cE, asmbVar));
                                    }
                                    cE = vcs.c(aqeqVar3);
                                    w = aozb.w(vcs.f(cE, asmbVar));
                                } catch (UnsupportedEncodingException e6) {
                                    throw new IllegalStateException("Unsupported encoding in the request", e6);
                                }
                            } else {
                                try {
                                    w = aozb.w(vcs.f(vcs.c(aqeqVar3), asmbVar));
                                } catch (UnsupportedEncodingException e7) {
                                    alvw h2 = vcs.a.h();
                                    h2.X(alwp.a, "BugleNetwork");
                                    ((alvg) ((alvg) ((alvg) h2).g(e7)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "signRequestOld", (char) 208, "CryptoHelper.java")).q("failed to getBytes()");
                                    throw new IllegalStateException("Unsupported encoding in the request", e7);
                                }
                            }
                            aozy builder = aqeqVar3.toBuilder();
                            if (!builder.b.isMutable()) {
                                builder.u();
                            }
                            Object obj17 = this.b;
                            apag apagVar3 = builder.b;
                            aqeq aqeqVar4 = (aqeq) apagVar3;
                            obj17.getClass();
                            aqeqVar4.c = (aqgb) obj17;
                            aqeqVar4.b |= 1;
                            if (!apagVar3.isMutable()) {
                                builder.u();
                            }
                            ((aqeq) builder.b).g = w;
                            return (aqeq) builder.s();
                        }
                        throw new IllegalStateException("Key pair is not available.");
                    } catch (ExecutionException e8) {
                        throw new IllegalStateException("Key pair is not available.", e8);
                    }
                }
                throw new IllegalStateException("Key pair future is not set.");
            case 11:
                alvw i3 = vgt.a.i();
                i3.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) ((alvg) i3).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "handleInboxMessageWithinSpanInternal", 228, "InboxMessageDispatcherImpl.java")).t("InboxMessageDispatcherImpl: Failed to handle message messageId: %s", this.b);
                ((vgt) this.c).e.e("Bugle.Net.InboxMessageDispatcher.HandleInboxMessage.HandlerFailed.Count", ((aqdr) this.a).a());
                return false;
            case 12:
                ?? r0 = this.b;
                r0.add((upm) obj);
                ahqr ahqrVar = ((vka) this.c).l;
                Object obj18 = this.a;
                upm k = vka.k(r0);
                ahqrVar.g(ahka.c("CreateNotificationLatency_", (Enum) obj18), null, ahqp.SUCCESS);
                return k;
            case 13:
                ((vrj) this.c).l(this.b, (vrk) this.a, ((Boolean) obj).booleanValue());
                return null;
            case 14:
                qeg qegVar2 = ((qgu) obj).c;
                if (qegVar2 == null) {
                    qegVar2 = qeg.a;
                }
                qef qefVar = qef.PENDING;
                qef b4 = qef.b(qegVar2.c);
                if (b4 == null) {
                    b4 = qef.UNKNOWN_STATUS;
                }
                Object obj19 = this.b;
                Object obj20 = this.c;
                if (!qefVar.equals(b4)) {
                    qef qefVar2 = qef.OK;
                    qef b5 = qef.b(qegVar2.c);
                    if (b5 == null) {
                        b5 = qef.UNKNOWN_STATUS;
                    }
                    if (!qefVar2.equals(b5)) {
                        alwl alwlVar3 = (alwl) vxh.a.i();
                        alwlVar3.X(ydl.o, ((ConversationIdType) obj20).toString());
                        alwlVar3.X(ydl.I, obj19);
                        alwl alwlVar4 = (alwl) alwlVar3.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "recoverDisabledRcsGroupWithChatApi", 234, "RecoverDisabledRcsGroupHandler.java");
                        qee b6 = qee.b(qegVar2.d);
                        if (b6 == null) {
                            b6 = qee.UNKNOWN_CAUSE;
                        }
                        Object obj21 = this.a;
                        alwlVar4.t("Failed to recover disabled RCS group with ChatApi. Cause: %s", b6.name());
                        ((vxh) obj21).g.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 5);
                        return upm.d();
                    }
                }
                alvw m = vxh.a.m();
                m.X(ydl.o, ((ConversationIdType) obj20).toString());
                m.X(ydl.I, obj19);
                ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "recoverDisabledRcsGroupWithChatApi", 226, "RecoverDisabledRcsGroupHandler.java")).q("Successfully initiated recovering a disabled RCs group with ChatApi.");
                return upm.b();
            case 15:
                ajpt ajptVar = (ajpt) obj;
                xyo e9 = vyy.a.e();
                e9.H("Call to Messaging service failed");
                vyy vyyVar = (vyy) this.c;
                e9.z("methodName", vyyVar.b.m());
                e9.H(vyyVar.b.l(this.b));
                e9.r(ajptVar);
                if (ajptVar.getCause() instanceof ajob) {
                    aozy createBuilder3 = qeg.a.createBuilder();
                    qef qefVar3 = qef.FAILED_TRANSIENTLY;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar4 = createBuilder3.b;
                    qeg qegVar3 = (qeg) apagVar4;
                    qegVar3.c = qefVar3.f;
                    qegVar3.b |= 1;
                    qee qeeVar = qee.NOT_CONNECTED;
                    if (!apagVar4.isMutable()) {
                        createBuilder3.u();
                    }
                    qeg qegVar4 = (qeg) createBuilder3.b;
                    qegVar4.d = qeeVar.p;
                    qegVar4.b |= 2;
                    qegVar = (qeg) createBuilder3.s();
                } else {
                    aozy createBuilder4 = qeg.a.createBuilder();
                    qef qefVar4 = qef.FAILED_PERMANENTLY;
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    qeg qegVar5 = (qeg) createBuilder4.b;
                    qegVar5.c = qefVar4.f;
                    qegVar5.b |= 1;
                    qegVar = (qeg) createBuilder4.s();
                }
                return vyyVar.b.h(qegVar, (aozb) this.a);
            case 16:
                xyo e10 = vyy.a.e();
                e10.H("Time out connecting to Messaging service");
                vyy vyyVar2 = (vyy) this.c;
                e10.z("methodName", vyyVar2.b.m());
                e10.H(vyyVar2.b.l(this.b));
                e10.r((TimeoutException) obj);
                aozy createBuilder5 = qeg.a.createBuilder();
                qef qefVar5 = qef.FAILED_TRANSIENTLY;
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                apag apagVar5 = createBuilder5.b;
                qeg qegVar6 = (qeg) apagVar5;
                qegVar6.c = qefVar5.f;
                qegVar6.b |= 1;
                qee qeeVar2 = qee.NOT_CONNECTED;
                if (!apagVar5.isMutable()) {
                    createBuilder5.u();
                }
                vyx vyxVar = vyyVar2.b;
                Object obj22 = this.a;
                qeg qegVar7 = (qeg) createBuilder5.b;
                qegVar7.d = qeeVar2.p;
                qegVar7.b |= 2;
                return vyxVar.h((qeg) createBuilder5.s(), (aozb) obj22);
            case 17:
                MessagingServiceResponseReceiver messagingServiceResponseReceiver = (MessagingServiceResponseReceiver) this.a;
                ((vza) messagingServiceResponseReceiver.e.b()).b.g(this.c.b(), Duration.between(this.b, Instant.ofEpochMilli(((xnv) messagingServiceResponseReceiver.d.b()).a())).toMillis());
                return null;
            case 18:
                qgg qggVar = (qgg) obj;
                if (((Boolean) ((utz) vzh.b.get()).e()).booleanValue()) {
                    Object obj23 = this.c;
                    Object obj24 = this.b;
                    qgr qgrVar = ((qgf) obj23).l;
                    if (qgrVar == null) {
                        qgrVar = qgr.a;
                    }
                    ((vzc) obj24).a.c(qgrVar, (rve) this.a);
                }
                return qggVar;
            case 19:
                Void r15 = (Void) obj;
                if (((Boolean) ((utz) vzh.d.get()).e()).booleanValue()) {
                    Object obj25 = this.c;
                    ((vzg) this.a).b.a((qgr) ((aozy) this.b).s(), rve.a(((Intent) obj25).getStringExtra(RcsIntents.EXTRA_MESSAGE_ID)));
                }
                return r15;
            default:
                SendMessageResponse sendMessageResponse = (SendMessageResponse) obj;
                if (((Boolean) ((utz) vzh.a.get()).e()).booleanValue()) {
                    ((vzf) this.b).c.g((qgr) this.c, (rve) this.a, 9, 15);
                    return sendMessageResponse;
                }
                return sendMessageResponse;
        }
    }

    public /* synthetic */ tul(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ tul(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ tul(Object obj, Object obj2, rve rveVar, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = rveVar;
    }

    public /* synthetic */ tul(ujv ujvVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i) {
        this.d = i;
        this.b = ujvVar;
        this.a = conversationIdType;
        this.c = selfIdentityId;
    }

    public /* synthetic */ tul(uvf uvfVar, String str, String str2, int i) {
        this.d = i;
        this.c = uvfVar;
        this.a = str;
        this.b = str2;
    }
}
