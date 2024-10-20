package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qpk implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qpk(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ParticipantsTable.BindData b;
        Object bz;
        int i = 1;
        switch (this.c) {
            case 0:
                return ((qpn) this.a).o((String) this.b);
            case 1:
                qfo qfoVar = (qfo) this.b;
                qei qeiVar = qfoVar.d;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                String str = qeiVar.d;
                xze xzeVar = xca.a;
                if (msx.g(str)) {
                    tap i2 = rxn.i(str);
                    i2.H(str);
                    i2.q(str);
                    b = i2.a();
                } else {
                    b = rxn.b(str);
                }
                vsi a = vsj.a();
                a.b(false);
                qeh qehVar = qeh.BOT;
                qei qeiVar2 = qfoVar.d;
                if (qeiVar2 == null) {
                    qeiVar2 = qei.a;
                }
                qeh b2 = qeh.b(qeiVar2.c);
                if (b2 == null) {
                    b2 = qeh.UNKNOWN_TYPE;
                }
                a.g(qehVar.equals(b2));
                qeh qehVar2 = qeh.GROUP;
                qei qeiVar3 = qfoVar.e;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                qeh b3 = qeh.b(qeiVar3.c);
                if (b3 == null) {
                    b3 = qeh.UNKNOWN_TYPE;
                }
                a.h(qehVar2.equals(b3));
                a.n(amku.INCOMING_IS_COMPOSING);
                a.p(-1L);
                a.i(alog.r(b));
                qeh qehVar3 = qeh.GROUP;
                qei qeiVar4 = qfoVar.e;
                if (qeiVar4 == null) {
                    qeiVar4 = qei.a;
                }
                qeh b4 = qeh.b(qeiVar4.c);
                if (b4 == null) {
                    b4 = qeh.UNKNOWN_TYPE;
                }
                if (qehVar3.equals(b4)) {
                    qei qeiVar5 = qfoVar.e;
                    if (qeiVar5 == null) {
                        qeiVar5 = qei.a;
                    }
                    a.j(qeiVar5.d);
                    a.k(qfoVar.h);
                }
                return ((qcv) this.a).c.a(a.a());
            case 2:
                return ((qpn) this.a).p(qpm.a((alog) this.b));
            case 3:
                ?? r0 = this.b;
                synchronized (GenericWorkerQueueAction.a) {
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        GenericWorkerQueueAction.b.remove(((srd) it.next()).o());
                    }
                }
                if (!r0.isEmpty()) {
                    Object obj = this.a;
                    xyo c = GenericWorkerQueueAction.d.c();
                    c.H("Rescheduling immediately to continue processing since we didn't yet reach the end.");
                    c.q();
                    GenericWorkerQueueAction genericWorkerQueueAction = (GenericWorkerQueueAction) obj;
                    qzl qzlVar = new qzl(genericWorkerQueueAction, 0);
                    xnv xnvVar = genericWorkerQueueAction.n;
                    apwt apwtVar = genericWorkerQueueAction.m;
                    anen anenVar = genericWorkerQueueAction.l;
                    new GenericWorkerQueueAction(genericWorkerQueueAction.i, genericWorkerQueueAction.j, genericWorkerQueueAction.k, qzlVar, anenVar, apwtVar, xnvVar).w(1L);
                }
                return null;
            case 4:
                ((reh) this.a).c((MessageIdType) this.b);
                return null;
            case 5:
                return ((rus) ((SendMessageToConversationOrParticipantsAction) this.a).f.b()).a((ConversationIdType) this.b, true);
            case 6:
                return ((Action) this.b).fz((Bundle) this.a);
            case 7:
                Set set = (Set) ((vl) ((usk) this.a).e).get(this.b);
                if (set == null) {
                    return new to();
                }
                return new to(set);
            case 8:
                Object obj2 = this.b;
                armf armfVar = (armf) ((alor) ((usk) this.a).f).get(obj2);
                albo.C(armfVar);
                ruw ruwVar = new ruw(armfVar, 3);
                int i3 = roi.a;
                snq a2 = snz.a((tqb) obj2);
                if (a2 != null) {
                    bz = ruwVar.apply(a2);
                } else {
                    bz = a.bz();
                }
                Boolean bool = (Boolean) bz;
                bool.booleanValue();
                return bool;
            case 9:
                ryx ryxVar = (ryx) this.b;
                MessageCoreData q = ((rwd) ryxVar.e.b()).q((MessageIdType) this.a);
                arbj arbjVar = new arbj();
                String h = ((znj) ryxVar.i.b()).h();
                if (h != null) {
                    arbjVar.c = h;
                    arbjVar.a = ((znj) ryxVar.i.b()).i();
                    arbjVar.ai(ypk.b);
                    if (q == null) {
                        return arbjVar.ah();
                    }
                    ParticipantsTable.BindData a3 = ((rxq) ryxVar.f.b()).a(q.aw());
                    if (a3 == null) {
                        return arbjVar.ah();
                    }
                    if (ryg.l(a3)) {
                        arbjVar.ai(ypk.a);
                        return arbjVar.ah();
                    }
                    arbjVar.ai(znj.j(q.z(), TextUtils.isEmpty(a3.N())));
                    return arbjVar.ah();
                }
                throw new NullPointerException("Null countryCode");
            case 10:
                ?? r02 = this.b;
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) albo.bQ(this.a);
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) albo.bQ(r02);
                if (!Objects.equals(messagePartCoreData2, messagePartCoreData)) {
                    String S = messagePartCoreData.S();
                    if (S != null) {
                        messagePartCoreData2.ao(S);
                    }
                    messagePartCoreData2.aq(messagePartCoreData.bE());
                }
                return messagePartCoreData2;
            case 11:
                final ?? r03 = this.b;
                if (r03.isEmpty()) {
                    trs.a.l("Skipped attachment blob ID update");
                } else {
                    Object obj3 = this.a;
                    xyo a4 = trs.a.a();
                    a4.H("updateMessagePartBlobId for");
                    a4.K("partFutures", r03);
                    a4.q();
                    final trs trsVar = (trs) obj3;
                    ((agnq) trsVar.b.b()).d(new Runnable() { // from class: trr
                        @Override // java.lang.Runnable
                        public final void run() {
                            akrh e;
                            Integer valueOf;
                            Integer valueOf2;
                            akrh e2;
                            Integer valueOf3;
                            Integer valueOf4;
                            Integer valueOf5;
                            Integer valueOf6;
                            Integer valueOf7;
                            Integer valueOf8;
                            Iterator it2 = r03.iterator();
                            while (it2.hasNext()) {
                                try {
                                    MessagePartCoreData messagePartCoreData3 = (MessagePartCoreData) albo.bQ((akul) it2.next());
                                    String P = messagePartCoreData3.P();
                                    boolean isEmpty = TextUtils.isEmpty(P);
                                    trs trsVar2 = trs.this;
                                    if (!isEmpty) {
                                        ConversationIdType z = messagePartCoreData3.z();
                                        MessageIdType A = messagePartCoreData3.A();
                                        String Z = messagePartCoreData3.Z();
                                        e = aktp.e("AttachmentToBlobstoreUploader#updateMessagePartBlobId");
                                        try {
                                            xyl.h();
                                            rxc rxcVar = (rxc) trsVar2.c.b();
                                            tbt tbtVar = new tbt();
                                            tbtVar.aj("updateMessagePartBlobId");
                                            valueOf7 = Integer.valueOf(a.bp().c());
                                            int intValue = valueOf7.intValue();
                                            valueOf8 = Integer.valueOf(a.bp().c());
                                            int intValue2 = valueOf8.intValue();
                                            if (intValue2 < 17020) {
                                                agnc.t("blob_id", intValue2);
                                            }
                                            if (intValue >= 17020) {
                                                agnc.r(tbtVar.a, "blob_id", P);
                                            }
                                            rxcVar.e(z, A, Z, tbtVar);
                                            e.close();
                                            xyo a5 = trs.a.a();
                                            a5.H("updated blob id for part");
                                            a5.z("partId", messagePartCoreData3.Z());
                                            a5.q();
                                        } finally {
                                        }
                                    }
                                    String S2 = messagePartCoreData3.S();
                                    if (!TextUtils.isEmpty(S2)) {
                                        ConversationIdType z2 = messagePartCoreData3.z();
                                        MessageIdType A2 = messagePartCoreData3.A();
                                        String Z2 = messagePartCoreData3.Z();
                                        e2 = aktp.e("AttachmentToBlobstoreUploader#updateMessagePartCompressedBlobId");
                                        try {
                                            xyl.h();
                                            rxc rxcVar2 = (rxc) trsVar2.c.b();
                                            tbt tbtVar2 = new tbt();
                                            tbtVar2.aj("updateMessagePartCompressedBlobId");
                                            valueOf5 = Integer.valueOf(a.bp().c());
                                            int intValue3 = valueOf5.intValue();
                                            valueOf6 = Integer.valueOf(a.bp().c());
                                            int intValue4 = valueOf6.intValue();
                                            if (intValue4 < 27000) {
                                                agnc.t("compressed_blob_id", intValue4);
                                            }
                                            if (intValue3 >= 27000) {
                                                agnc.r(tbtVar2.a, "compressed_blob_id", S2);
                                            }
                                            rxcVar2.e(z2, A2, Z2, tbtVar2);
                                            e2.close();
                                            xyo a6 = trs.a.a();
                                            a6.H("updated compressed blob id for part");
                                            a6.z("partId", messagePartCoreData3.Z());
                                            a6.q();
                                        } finally {
                                        }
                                    }
                                    if (uvl.n(messagePartCoreData3.bF())) {
                                        byte[] bF = messagePartCoreData3.bF();
                                        e2 = aktp.e("AttachmentToBlobstoreUploader#updateMessagePartEncryptionKey");
                                        try {
                                            xyl.h();
                                            tbt tbtVar3 = new tbt();
                                            tbtVar3.aj("updateMessagePartEncryptionKey");
                                            valueOf3 = Integer.valueOf(a.bp().c());
                                            int intValue5 = valueOf3.intValue();
                                            valueOf4 = Integer.valueOf(a.bp().c());
                                            int intValue6 = valueOf4.intValue();
                                            if (intValue6 < 30040) {
                                                agnc.t("media_encryption_key", intValue6);
                                            }
                                            if (intValue5 >= 30040) {
                                                tbtVar3.a.put("media_encryption_key", bF);
                                            }
                                            trsVar2.c(messagePartCoreData3, tbtVar3);
                                            e2.close();
                                            xyo a7 = trs.a.a();
                                            a7.H("updated key for part");
                                            a7.z("partId", messagePartCoreData3.Z());
                                            a7.q();
                                        } finally {
                                            try {
                                                e2.close();
                                            } catch (Throwable th) {
                                                th.addSuppressed(th);
                                            }
                                        }
                                    }
                                    if (uvl.n(messagePartCoreData3.bE())) {
                                        byte[] bE = messagePartCoreData3.bE();
                                        e = aktp.e("AttachmentToBlobstoreUploader#updateMessagePartCompressedEncryptionKey");
                                        try {
                                            xyl.h();
                                            tbt tbtVar4 = new tbt();
                                            tbtVar4.aj("updateMessagePartCompressedEncryptionKey");
                                            valueOf = Integer.valueOf(a.bp().c());
                                            int intValue7 = valueOf.intValue();
                                            valueOf2 = Integer.valueOf(a.bp().c());
                                            int intValue8 = valueOf2.intValue();
                                            if (intValue8 < 30040) {
                                                agnc.t("compressed_media_encryption_key", intValue8);
                                            }
                                            if (intValue7 >= 30040) {
                                                tbtVar4.a.put("compressed_media_encryption_key", bE);
                                            }
                                            trsVar2.c(messagePartCoreData3, tbtVar4);
                                            e.close();
                                            xyo a8 = trs.a.a();
                                            a8.H("updated key for compressed part");
                                            a8.z("partId", messagePartCoreData3.Z());
                                            a8.q();
                                        } finally {
                                            try {
                                                e.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } catch (Exception e3) {
                                    trs.a.r("Error uploading attachment.", e3);
                                }
                            }
                        }
                    });
                }
                return null;
            case 12:
                Pair pair = (Pair) albo.bQ(this.b);
                aozy createBuilder = amkm.a.createBuilder();
                amkj amkjVar = (amkj) albo.bQ(this.a);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amkm amkmVar = (amkm) createBuilder.b;
                amkmVar.c = amkjVar.f;
                amkmVar.b = 1 | amkmVar.b;
                amkl amklVar = (amkl) pair.first;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amkm amkmVar2 = (amkm) createBuilder.b;
                amkmVar2.e = amklVar.e;
                amkmVar2.b |= 4;
                amkk amkkVar = (amkk) pair.second;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amkm amkmVar3 = (amkm) createBuilder.b;
                amkmVar3.d = amkkVar.d;
                amkmVar3.b |= 2;
                return (amkm) createBuilder.s();
            case 13:
                ((tsp) this.b).j(((rto) this.a).L(), uax.DEFAULT);
                return null;
            case 14:
                return tsp.f((String) this.b, (qei) this.a);
            case 15:
                ((tsp) this.b).j((ConversationIdType) this.a, uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING);
                return null;
            case 16:
                ((tsp) this.b).j((ConversationIdType) this.a, uax.DEFAULT);
                return null;
            case 17:
                ttj ttjVar = (ttj) this.a;
                qwm G = ((wpp) ttjVar.q.b()).G(((psq) ttjVar.r.b()).c((String) this.b));
                if (G == null) {
                    alvw i4 = ttj.b.i();
                    i4.X(alwp.a, "BugleEtouffee");
                    ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/E2eeStateMachine", "disableConversationE2eeIfNeeded", 296, "E2eeStateMachine.java")).q("Skip disabling E2EE in conversations, subscription is null.");
                } else {
                    ((tsa) ttjVar.i.b()).h(G.g());
                }
                return null;
            case 18:
                tcd b5 = tcf.b();
                b5.w("pendingIdentityVerificationFor");
                b5.d(new tux(this.a, this.b, i));
                return Optional.ofNullable((tbw) ((tca) b5.b().n()).cM());
            case 19:
                MessageCoreData s = ((rwd) ((tvg) this.b).m.b()).s((rve) this.a);
                if (s != null) {
                    return Boolean.valueOf(s.cn());
                }
                return false;
            default:
                txg txgVar = (txg) this.a;
                ParticipantsTable.BindData a5 = ((rxq) txgVar.f.b()).a((String) this.b);
                if (a5 == null) {
                    return Optional.empty();
                }
                String O = a5.O();
                if (O == null) {
                    return Optional.empty();
                }
                return Optional.ofNullable(((psq) txgVar.h.b()).a(O, false));
        }
    }

    public /* synthetic */ qpk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
