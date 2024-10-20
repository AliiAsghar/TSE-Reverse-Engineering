package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rat {
    public static final alwo a = alwo.o("BugleNotifications");
    public static final alwo b = alwo.o("BugleDataModel");
    public final armf A;
    public final armf B;
    public final viq C;
    public final armf D;
    public final armf E;
    public final armf F;
    public final armf G;
    public final armf H;
    public final armf I;
    public final armf J;
    public final arwe K;
    public final olj L;
    public final nib M;
    public final armf N;
    public final armf O;
    public final armf P;
    public final AtomicReference Q;
    public final armf R;
    public final armf S;
    public final armf T;
    public final Map U;
    public MessageIdType V;
    public boolean W;
    public final qzx X;
    private final Context Y;
    private final armf Z;
    private final armf aa;
    private final armf ab;
    private final armf ac;
    private final armf ad;
    private final ydh ae;
    private final wzs af;
    private final mbl ag;
    private final ryr ah;
    private final armf ai;
    private final armf aj;
    private final armf ak;
    private final armf al;
    private final armf am;
    private final armf an;
    private final armf ao;
    private final armf ap;
    private final armf aq;
    private final armf ar;
    private final armf as;
    private final armf at;
    private final och au;
    private final anen av;
    private final trw aw;
    private final armf ax;
    private final armf ay;
    private final tzn az;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final ryg j;
    public final rsv k;
    public final xbi l;
    public final rzc m;
    public final armf n;
    public final armf o;
    public final yjf p;
    public final Optional q;
    public final xnv r;
    public final mce s;
    public final armf t;
    public final ryy u;
    public final uhj v;
    public final tqx w;
    public final agnq x;
    public final armf y;
    public final msk z;

    public rat(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, ryg rygVar, rsv rsvVar, xbi xbiVar, armf armfVar12, rzc rzcVar, armf armfVar13, armf armfVar14, yio yioVar, yjf yjfVar, ydh ydhVar, wzs wzsVar, Optional optional, xnv xnvVar, mce mceVar, mbl mblVar, armf armfVar15, qzx qzxVar, ryy ryyVar, vjs vjsVar, ryr ryrVar, uhj uhjVar, qzi qziVar, tqx tqxVar, agnq agnqVar, armf armfVar16, tzn tznVar, armf armfVar17, msk mskVar, armf armfVar18, armf armfVar19, viq viqVar, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, rzx rzxVar, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, och ochVar, anen anenVar, arwe arweVar, trw trwVar, olj oljVar, nib nibVar, armf armfVar38, armf armfVar39, armf armfVar40, AtomicReference atomicReference, armf armfVar41, armf armfVar42, armf armfVar43, armf armfVar44, armf armfVar45) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        rygVar.getClass();
        rsvVar.getClass();
        xbiVar.getClass();
        armfVar12.getClass();
        rzcVar.getClass();
        armfVar13.getClass();
        armfVar14.getClass();
        yioVar.getClass();
        yjfVar.getClass();
        ydhVar.getClass();
        wzsVar.getClass();
        xnvVar.getClass();
        mceVar.getClass();
        mblVar.getClass();
        armfVar15.getClass();
        ryyVar.getClass();
        vjsVar.getClass();
        ryrVar.getClass();
        uhjVar.getClass();
        qziVar.getClass();
        tqxVar.getClass();
        agnqVar.getClass();
        armfVar16.getClass();
        tznVar.getClass();
        armfVar17.getClass();
        mskVar.getClass();
        armfVar18.getClass();
        armfVar19.getClass();
        viqVar.getClass();
        armfVar20.getClass();
        armfVar21.getClass();
        armfVar22.getClass();
        armfVar23.getClass();
        armfVar24.getClass();
        armfVar25.getClass();
        armfVar26.getClass();
        armfVar27.getClass();
        rzxVar.getClass();
        armfVar28.getClass();
        armfVar29.getClass();
        armfVar30.getClass();
        armfVar31.getClass();
        armfVar32.getClass();
        armfVar33.getClass();
        armfVar34.getClass();
        armfVar35.getClass();
        armfVar36.getClass();
        armfVar37.getClass();
        anenVar.getClass();
        arweVar.getClass();
        oljVar.getClass();
        nibVar.getClass();
        armfVar38.getClass();
        armfVar39.getClass();
        armfVar40.getClass();
        atomicReference.getClass();
        armfVar41.getClass();
        armfVar42.getClass();
        armfVar43.getClass();
        armfVar44.getClass();
        armfVar45.getClass();
        this.Y = context;
        this.Z = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.aa = armfVar6;
        this.g = armfVar7;
        this.h = armfVar8;
        this.ab = armfVar9;
        this.i = armfVar10;
        this.ac = armfVar11;
        this.j = rygVar;
        this.k = rsvVar;
        this.l = xbiVar;
        this.ad = armfVar12;
        this.m = rzcVar;
        this.n = armfVar13;
        this.o = armfVar14;
        this.p = yjfVar;
        this.ae = ydhVar;
        this.af = wzsVar;
        this.q = optional;
        this.r = xnvVar;
        this.s = mceVar;
        this.ag = mblVar;
        this.t = armfVar15;
        this.X = qzxVar;
        this.u = ryyVar;
        this.ah = ryrVar;
        this.v = uhjVar;
        this.w = tqxVar;
        this.x = agnqVar;
        this.ai = armfVar16;
        this.az = tznVar;
        this.y = armfVar17;
        this.z = mskVar;
        this.A = armfVar18;
        this.B = armfVar19;
        this.C = viqVar;
        this.D = armfVar20;
        this.aj = armfVar21;
        this.E = armfVar22;
        this.ak = armfVar23;
        this.al = armfVar24;
        this.F = armfVar25;
        this.am = armfVar26;
        this.G = armfVar27;
        this.an = armfVar28;
        this.H = armfVar29;
        this.ao = armfVar30;
        this.I = armfVar31;
        this.J = armfVar32;
        this.ap = armfVar33;
        this.aq = armfVar34;
        this.ar = armfVar35;
        this.as = armfVar36;
        this.at = armfVar37;
        this.au = ochVar;
        this.av = anenVar;
        this.K = arweVar;
        this.aw = trwVar;
        this.L = oljVar;
        this.M = nibVar;
        this.N = armfVar38;
        this.O = armfVar39;
        this.P = armfVar40;
        this.Q = atomicReference;
        this.R = armfVar41;
        this.ax = armfVar42;
        this.S = armfVar43;
        this.ay = armfVar44;
        this.T = armfVar45;
        this.U = new LinkedHashMap();
        this.V = rvc.a;
    }

    public static final Collection n(MessageCoreData messageCoreData) {
        ArrayList arrayList = new ArrayList();
        Object e = vof.a.e();
        e.getClass();
        if (((Boolean) e).booleanValue()) {
            List W = messageCoreData.W();
            if (!W.isEmpty()) {
                Iterator it = W.iterator();
                while (it.hasNext()) {
                    if (((MessagePartCoreData) it.next()).bi()) {
                        arrayList.add(messageCoreData);
                        break;
                    }
                }
            }
        }
        if (messageCoreData.c() == 1) {
            arrayList.add(messageCoreData);
            return arrayList;
        }
        for (MessagePartCoreData messagePartCoreData : messageCoreData.W()) {
            MessageCoreData x = messageCoreData.x();
            if (messageCoreData.cI() && messagePartCoreData.o() != 0) {
                x.bK(messagePartCoreData.o());
            }
            x.aH(messagePartCoreData);
            ((MessageData) x).j.n("split_rcs");
            arrayList.add(x);
        }
        return arrayList;
    }

    public final MessageCoreData a(String str, SelfIdentityId selfIdentityId, int i, ConversationIdType conversationIdType) {
        return this.w.o(conversationIdType, selfIdentityId, ((vpk) this.ao.b()).b(i), str, "text/plain");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ConversationIdType b(String str, int i, List list) {
        alog aZ;
        alog g;
        xhv b2;
        int i2 = 10;
        if (((oop) this.R.b()).a()) {
            if (list != null && ((oop) this.R.b()).a()) {
                ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((lqn) this.ap.b()).k((apdj) it.next()));
                }
                aZ = alzz.aZ(arrayList);
            } else {
                List aa = arsd.aa(str, new char[]{','});
                ArrayList arrayList2 = new ArrayList(aqjn.J(aa, 10));
                Iterator it2 = aa.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(this.z.t((String) it2.next(), i));
                }
                aZ = alzz.aZ(arrayList2);
            }
        } else {
            List aa2 = arsd.aa(str, new char[]{','});
            ArrayList arrayList3 = new ArrayList(aqjn.J(aa2, 10));
            Iterator it3 = aa2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(this.z.t((String) it3.next(), i));
            }
            aZ = alzz.aZ(arrayList3);
        }
        alog alogVar = aZ;
        if (((oop) this.R.b()).a()) {
            ArrayList arrayList4 = new ArrayList(aqjn.J(alogVar, 10));
            Iterator<E> it4 = alogVar.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((nds) this.al.b()).a((msh) it4.next()));
            }
            g = alzz.aZ(arrayList4);
        } else {
            alob alobVar = new alob();
            int size = alogVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                alobVar.h(rxn.c((msh) alogVar.get(i3), i));
            }
            g = alobVar.g();
            g.getClass();
        }
        if (g.isEmpty()) {
            xyl.c("InsertNewMessage: Empty participants");
            return ruy.a;
        }
        alwo alwoVar = b;
        ((alwl) alwoVar.i()).q("InsertNewMessageProcessor was invoked without conversation id");
        this.ag.c("Bugle.Action.InsertNewMessageAction.EmptyConversationId");
        alog B = ((rtz) this.d.b()).B(g);
        B.getClass();
        if (B.isEmpty()) {
            xyl.c("InsertNewMessage: Empty participants");
            return ruy.a;
        }
        Object e = qpf.a.e();
        e.getClass();
        if (((Boolean) e).booleanValue()) {
            ((alwl) alwoVar.g()).q("Recovering conversationId with BCM getOrCreateConversation");
            if (B.size() == 1) {
                ((ParticipantsTable.BindData) B.get(0)).P();
                msh mshVar = (msh) alogVar.get(0);
                ConversationIdType x = ((qpj) this.aj.b()).a(mshVar, new lpn(new raq(this, mshVar, i, 0), 13)).x();
                x.getClass();
                return x;
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<E> it5 = B.iterator();
            while (it5.hasNext()) {
                String P = ((ParticipantsTable.BindData) it5.next()).P();
                if (P != null) {
                    arrayList5.add(P);
                }
            }
            alog aZ2 = alzz.aZ(arrayList5);
            ConversationIdType x2 = ((qpj) this.aj.b()).d(aZ2, new rek(this, aZ2, alogVar, i, 1)).x();
            x2.getClass();
            return x2;
        }
        if (this.q.isPresent() && ((ywz) this.q.get()).a()) {
            Object c = this.x.c("InsertNewMessageProcessor#createMessage", new ndb(this, B, i2, null));
            c.getClass();
            return (ConversationIdType) c;
        }
        if (((oop) this.R.b()).a()) {
            b2 = xhv.b(((wyw) this.am.b()).b(alogVar));
        } else {
            b2 = xhv.b(((wyt) this.ad.b()).d(B));
        }
        if (b2.d()) {
            xyl.c("InsertNewMessage: Couldn't get threadId in SMS db");
            return ruy.a;
        }
        ConversationIdType ao = ((rtz) this.d.b()).ao(yyb.cE(b2), tqc.UNARCHIVED, B);
        ao.getClass();
        return ao;
    }

    public final Integer c(rto rtoVar, MessageCoreData messageCoreData, int i, int i2, amgj amgjVar) {
        Optional of;
        qwm qwmVar;
        String str;
        messageCoreData.getClass();
        amgjVar.getClass();
        akrh e = aktp.e("INMA::getSubscription");
        try {
            if (i != -1) {
                qwmVar = this.j.f(i);
                qwmVar.getClass();
                Object e2 = ((utz) jbh.a.get()).e();
                e2.getClass();
                if (((Boolean) e2).booleanValue()) {
                    ((alwl) b.g()).J("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s from param subId=%s", messageCoreData.aE(), Integer.valueOf(qwmVar.e()), Integer.valueOf(i));
                }
            } else {
                SelfIdentityId v = messageCoreData.v();
                if (v == null) {
                    v = rtoVar.f();
                    Object e3 = ((utz) jbh.a.get()).e();
                    e3.getClass();
                    if (((Boolean) e3).booleanValue()) {
                        ((alwl) b.g()).D("InsertNewMessageProcessor#getSubscription: draftId=%s had no self, so conversation self subId=%s", messageCoreData.aE(), v);
                    }
                }
                qwm e4 = this.j.e(v);
                if (i2 == -1) {
                    of = Optional.empty();
                } else {
                    of = Optional.of(Integer.valueOf(i2));
                }
                if (e4 != null && e4.j() && of.isPresent()) {
                    qwm f = this.j.f(((Number) of.get()).intValue());
                    f.getClass();
                    Object e5 = ((utz) jbh.a.get()).e();
                    e5.getClass();
                    if (((Boolean) e5).booleanValue()) {
                        ((alwl) b.g()).K("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s for lockedDefaultSmsSubId=%s, instead of subId=%s", messageCoreData.aE(), Integer.valueOf(f.e()), of.get(), Integer.valueOf(e4.e()));
                    }
                    qwmVar = f;
                } else {
                    Object e6 = ((utz) jbh.a.get()).e();
                    e6.getClass();
                    if (((Boolean) e6).booleanValue()) {
                        alwl alwlVar = (alwl) b.g();
                        UUID aE = messageCoreData.aE();
                        if (e4 == null || (str = Integer.valueOf(e4.e()).toString()) == null) {
                            str = "(null)";
                        }
                        alwlVar.D("InsertNewMessageProcessor#getSubscription: draftId=%s using subId=%s", aE, str);
                    }
                    qwmVar = e4;
                }
            }
            if (qwmVar != null) {
                armd.i(e, null);
                SelfIdentityId g = qwmVar.g();
                messageCoreData.aJ(g);
                messageCoreData.aK(g);
                if (messageCoreData.d() == 3 && messageCoreData.ac().isEmpty()) {
                    e = aktp.e("INMA::getSenderMessagingIdentityEmpty");
                    try {
                        int a2 = ((yjy) this.ar.b()).h(qwmVar.e()).a();
                        try {
                            messageCoreData.bD(this.z.b(((vpk) this.ao.b()).b(a2)));
                            armd.i(e, null);
                        } catch (vpd unused) {
                            ((alwl) b.i()).K("InsertNewMessageProcessor#setSelfDetailsAndGetSubId: Cannot determine the RCS Self Identity for draftId=%s using SelfParticipant=%s subId=%s, effectiveSubId=%s", messageCoreData.aE(), g, Integer.valueOf(qwmVar.e()), Integer.valueOf(a2));
                            ((mho) this.t.b()).O(messageCoreData, qwmVar.e(), rtoVar.G(), amgjVar);
                            armd.i(e, null);
                            return null;
                        }
                    } finally {
                    }
                }
                ((alwl) b.g()).J("InsertNewMessageProcessor#setSelfDetailsAndGetSubId: draftId=%s using SelfParticipant=%s and subId=%s", messageCoreData.aE(), g, Integer.valueOf(qwmVar.e()));
                return Integer.valueOf(qwmVar.e());
            }
            armd.i(e, null);
            return null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r25, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r26, boolean r27, boolean r28, java.util.List r29, java.util.List r30, java.util.List r31, defpackage.arpe r32) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rat.d(int, java.lang.String, java.lang.String, java.lang.String, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean, boolean, java.util.List, java.util.List, java.util.List, arpe):java.lang.Object");
    }

    public final void e(MessageCoreData messageCoreData) {
        MessageCoreData x = messageCoreData.x();
        Iterator it = messageCoreData.W().iterator();
        while (it.hasNext()) {
            x.aH((MessagePartCoreData) it.next());
        }
        akrh e = aktp.e("InsertNewMessageProcessor::onPendingNewMessage");
        try {
            ((lgg) this.as.b()).g(new qdm(x, 13));
            armd.i(e, null);
        } finally {
        }
    }

    public final void f(final rag ragVar) {
        this.x.b(new alhr() { // from class: raj
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[Catch: all -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x001d, blocks: (B:313:0x001a, B:10:0x003a, B:13:0x0041, B:16:0x004f, B:24:0x006c, B:29:0x009b, B:31:0x00a5, B:37:0x00e7, B:39:0x0102, B:41:0x010f, B:45:0x0131, B:47:0x015d, B:48:0x0184, B:51:0x01a9, B:53:0x01b1, B:303:0x0172, B:305:0x017d, B:306:0x0187, B:307:0x018c), top: B:312:0x001a }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x0777, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0777, blocks: (B:3:0x0014, B:7:0x0023, B:21:0x0061, B:27:0x007c, B:34:0x00b8, B:43:0x0117, B:49:0x0192, B:56:0x01c8, B:302:0x01ba, B:311:0x0046), top: B:2:0x0014 }] */
            /* JADX WARN: Type inference failed for: r12v10, types: [java.io.Closeable, akrh] */
            /* JADX WARN: Type inference failed for: r15v18, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r1v23 */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r1v25 */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r1v45 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v19 */
            /* JADX WARN: Type inference failed for: r3v28 */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Closeable, akrh] */
            /* JADX WARN: Type inference failed for: r8v2 */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
            @Override // defpackage.alhr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 1921
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.raj.get():java.lang.Object");
            }
        });
    }

    public final void g(MessageCoreData messageCoreData, int i, int i2, long j) {
        if (this.W) {
            messageCoreData.bb(j);
        }
        this.az.i(messageCoreData);
        MessageIdType a2 = ((rvw) this.y.b()).a(messageCoreData);
        a2.getClass();
        if (((asho) this.Q.get()).equals(asho.UNKNOWN_CLOUD_SYNC_STATUS)) {
            qjh.c(this.K, arpj.a, arwf.a, new ras(this, messageCoreData, i, i2, (arpe) null, 0));
        } else {
            ((mho) this.t.b()).H(messageCoreData, Integer.valueOf(i), i2, (amgc) new qyq().fu(this.Q.get()));
        }
        if (messageCoreData.cI() && messageCoreData.B().b() && !messageCoreData.bZ()) {
            messageCoreData.bQ(a2);
        }
    }

    public final void h(rto rtoVar, final int i, final MessageCoreData messageCoreData, long j, final long j2, Action action) {
        boolean z;
        String str;
        messageCoreData.getClass();
        final ConversationIdType z2 = messageCoreData.z();
        z2.getClass();
        int c = messageCoreData.c();
        akrh e = aktp.e("InsertNewMessageProcessor::processParts");
        try {
            int i2 = 0;
            if (c == 1) {
                z = true;
            } else {
                z = false;
            }
            for (MessagePartCoreData messagePartCoreData : messageCoreData.W()) {
                rxc rxcVar = (rxc) this.aa.b();
                akrh e2 = aktp.e("MessagePartDatabaseOperations#readMessagePartProcessingFieldsFromDraft");
                try {
                    if (messagePartCoreData.w() != null) {
                        Uri w = messagePartCoreData.w();
                        scb a2 = scd.a();
                        a2.w("readMessagePartProcessingFieldsFromDraft");
                        a2.c(new rxb(w, i2));
                        sbz sbzVar = (sbz) ((lbz) a2.b().n()).cO();
                        if (sbzVar != null) {
                            messagePartCoreData.aO(((rtb) rxcVar.a.b()).f(sbzVar));
                        }
                    }
                    e2.close();
                    z &= messagePartCoreData.bw();
                    if (messagePartCoreData.aP()) {
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.Y.getResources().getString(R.string.app_name));
                        messagePartCoreData.getClass();
                        Context context = this.Y;
                        Uri v = messagePartCoreData.v();
                        v.getClass();
                        Uri i3 = ydk.i(context, v, file, messagePartCoreData.U(), null, this.ae);
                        messagePartCoreData.aB(i3);
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                        intent.setData(i3);
                        this.Y.sendBroadcast(intent);
                    }
                    if (((pkj) this.ay.b()).a() && (d.F(messagePartCoreData.U(), "video/mpeg") || d.F(messagePartCoreData.U(), "video/mpeg4"))) {
                        messagePartCoreData.ar("video/mp4");
                    }
                } catch (Throwable th) {
                    try {
                        e2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            armd.i(e, null);
            final List b2 = this.ah.b(messageCoreData, i, null, j2);
            final int G = rtoVar.G();
            Object c2 = this.x.c("InsertNewMessageProcessor#insertSendingMmsOrRcsMessage", new alhr() { // from class: rai
                @Override // defpackage.alhr
                public final Object get() {
                    rat ratVar = rat.this;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    int i4 = G;
                    int i5 = i;
                    long j3 = j2;
                    ratVar.g(messageCoreData2, i4, i5, j3);
                    ArrayList arrayList = new ArrayList();
                    lgg.c(b2, arrayList);
                    if (!messageCoreData2.cs()) {
                        ConversationIdType conversationIdType = z2;
                        if (((pdd) ratVar.T.b()).a()) {
                            ((ruq) ratVar.h.b()).g(conversationIdType, messageCoreData2.B(), Long.valueOf(j3), tqc.UNARCHIVED, null, false, -1L, null, messageCoreData2.v());
                        } else {
                            ((ruq) ratVar.h.b()).d(conversationIdType, messageCoreData2.B(), Long.valueOf(j3), tqc.UNARCHIVED, false);
                        }
                    }
                    return arrayList;
                }
            });
            c2.getClass();
            List<MessagePartCoreData> list = (List) c2;
            this.V = messageCoreData.B();
            e = aktp.e("InsertNewMessageProcessor::logMmsOrRcsMessageInserted");
            try {
                if (messageCoreData.cB()) {
                    if (z) {
                        str = "Bugle.UI.ConversationActivity.Send.Duration.Mms.Text";
                    } else {
                        str = "Bugle.UI.ConversationActivity.Send.Duration.Mms.Attachment";
                    }
                } else if (z) {
                    str = "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Text";
                } else {
                    str = "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Attachment";
                }
                if (j != 0) {
                    this.s.d(str, messageCoreData.B().a(), j);
                }
                armd.i(e, null);
                for (MessagePartCoreData messagePartCoreData2 : list) {
                    trw trwVar = this.aw;
                    akrh e3 = aktp.e("MessagePartProcessor#process");
                    try {
                        if (messagePartCoreData2.t() != null) {
                            uin uinVar = (uin) trwVar.b.b();
                            Uri t = messagePartCoreData2.t();
                            t.getClass();
                            qiu.e(uinVar.a(t, messagePartCoreData2.p(), messagePartCoreData2.U()).i(new qbt(trwVar, messagePartCoreData2, action, 12), trwVar.c));
                        }
                        e3.close();
                    } finally {
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    public final void i(final rto rtoVar, final int i, final MessageCoreData messageCoreData, long j, List list, final tqc tqcVar) {
        akrh akrhVar;
        Throwable th;
        ConversationIdType conversationIdType;
        long j2;
        String str;
        boolean z;
        akrh akrhVar2;
        xhv a2;
        xhv xhvVar;
        ConversationIdType conversationIdType2;
        long j3;
        rat ratVar;
        String str2;
        MessageCoreData messageCoreData2;
        xhv a3;
        rat ratVar2 = this;
        int i2 = i;
        akrh e = aktp.e("InsertNewMessageProcessor::insertSendingSms");
        try {
            long epochMilli = ratVar2.r.f().toEpochMilli();
            ConversationIdType z2 = messageCoreData.z();
            z2.getClass();
            if (list.size() > 1) {
                long j4 = epochMilli + 1;
                try {
                    alwo alwoVar = b;
                    alvw n = alwoVar.n();
                    n.X(ydl.a, messageCoreData.B().a());
                    n.s("InsertNewMessageProcessor: Inserting broadcast SMS {x-message-id:%d}.", messageCoreData.s());
                    ((wzp) ratVar2.ai.b()).i(j4);
                    Object e2 = qpf.a.e();
                    e2.getClass();
                    if (((Boolean) e2).booleanValue()) {
                        a3 = ((qos) ratVar2.ak.b()).a(z2);
                        a3.getClass();
                    } else {
                        a3 = ((ugy) ratVar2.ac.b()).a(z2);
                        a3.getClass();
                    }
                    String w = rxn.w(list);
                    w.getClass();
                    conversationIdType = z2;
                    j2 = epochMilli;
                    Uri ag = ratVar2.af.ag(ratVar2.Y, Telephony.Sms.CONTENT_URI, i, w, messageCoreData.an(), j4, 0, 2, a3, messageCoreData.Z());
                    if (ag != null && !TextUtils.isEmpty(ag.toString())) {
                        ratVar2.x.e("InsertNewMessageProcessor#insertFakeBroadcastSmsMessage", new rak(messageCoreData, conversationIdType, ag, j4, this, 0));
                        alvw m = alwoVar.m();
                        m.X(ydl.a, messageCoreData.B().a());
                        m.C("InsertNewMessageProcessor: Inserted broadcast SMS. (uri=%s) {x-message-id:%d}", messageCoreData.t(), messageCoreData.s());
                        if (j != 0) {
                            str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                            ratVar2.s.d(str, messageCoreData.B().a(), j);
                        } else {
                            str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                        }
                        ((mho) ratVar2.t.b()).af(messageCoreData);
                    } else {
                        str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                        alwl alwlVar = (alwl) alwoVar.h();
                        alwlVar.X(ydl.a, messageCoreData.B().a());
                        alwlVar.q("InsertNewMessageProcessor: No uri for broadcast SMS. Message inserted into telephony DB.");
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                    akrhVar = e;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        armd.i(akrhVar, th);
                        throw th3;
                    }
                }
            } else {
                conversationIdType = z2;
                j2 = epochMilli;
                str = "Bugle.UI.ConversationActivity.Send.Duration.Sms";
                z = false;
            }
            ConversationIdType conversationIdType3 = list.size() > 1 ? ruy.a : conversationIdType;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                    final long j5 = j2;
                    ((wzp) ratVar2.ai.b()).i(j5);
                    if (conversationIdType3.b()) {
                        Object e3 = qpf.a.e();
                        e3.getClass();
                        if (((Boolean) e3).booleanValue()) {
                            msh t = ratVar2.z.t(bindData.O(), i2);
                            ConversationIdType x = ((qpj) ratVar2.aj.b()).a(t, new lpn(new raq(ratVar2, t, i2, 2), 12)).x();
                            x.getClass();
                            xhv a4 = ((qos) ratVar2.ak.b()).a(x);
                            a4.getClass();
                            conversationIdType2 = x;
                            xhvVar = a4;
                        } else {
                            long c = ((wyt) ratVar2.ad.b()).c(bindData);
                            xhv b2 = xhv.b(c);
                            ConversationIdType j6 = ((ibi) ratVar2.ab.b()).j(c, tqcVar, bindData);
                            j6.getClass();
                            conversationIdType2 = j6;
                            xhvVar = b2;
                        }
                    } else {
                        Object e4 = qpf.a.e();
                        e4.getClass();
                        if (((Boolean) e4).booleanValue()) {
                            a2 = ((qos) ratVar2.ak.b()).a(conversationIdType3);
                            a2.getClass();
                        } else {
                            a2 = ((ugy) ratVar2.ac.b()).a(conversationIdType3);
                            a2.getClass();
                        }
                        xhvVar = a2;
                        conversationIdType2 = conversationIdType3;
                    }
                    final String an = messageCoreData.an();
                    messageCoreData.aE();
                    Optional Z = messageCoreData.Z();
                    Z.getClass();
                    final ConversationIdType conversationIdType4 = conversationIdType3;
                    String str3 = str;
                    final Uri ag2 = ratVar2.af.ag(ratVar2.Y, Telephony.Sms.CONTENT_URI, i, bindData.P(), an, j5, -1, 2, xhvVar, Z);
                    if (ag2 != null && !TextUtils.isEmpty(ag2.toString())) {
                        final ConversationIdType conversationIdType5 = conversationIdType2;
                        akrhVar2 = e;
                        final boolean z3 = z;
                        try {
                            Object c2 = ratVar2.x.c("InsertNewMessageProcessor#insertSendingSmsMessage", new alhr() { // from class: ral
                                @Override // defpackage.alhr
                                public final Object get() {
                                    ConversationIdType conversationIdType6 = conversationIdType5;
                                    conversationIdType6.getClass();
                                    MessageCoreData messageCoreData3 = messageCoreData;
                                    messageCoreData3.getClass();
                                    tqc tqcVar2 = tqcVar;
                                    tqcVar2.getClass();
                                    SelfIdentityId v = messageCoreData3.v();
                                    rat ratVar3 = rat.this;
                                    MessageCoreData g = ratVar3.w.g(conversationIdType6, v, an);
                                    Uri uri = ag2;
                                    long j7 = j5;
                                    g.bS(conversationIdType6, uri, j7);
                                    int G = rtoVar.G();
                                    MessageData messageData = (MessageData) g;
                                    messageData.k = messageCoreData3.y();
                                    g.bN(messageCoreData3.aA());
                                    g.bk(messageCoreData3.aE());
                                    g.bm(messageCoreData3.cs());
                                    g.bK(messageCoreData3.s());
                                    if (ratVar3.M.a()) {
                                        messageData.j.j(messageCoreData3.af());
                                        messageData.j.i(messageCoreData3.ae());
                                        g.bh(messageCoreData3.P());
                                    }
                                    atok aF = messageCoreData3.aF();
                                    if (aF != null) {
                                        g.bJ(aF);
                                    }
                                    ConversationIdType conversationIdType7 = conversationIdType4;
                                    ratVar3.g(g, G, i, j7);
                                    if (!conversationIdType7.b()) {
                                        boolean z4 = z3;
                                        ruq ruqVar = (ruq) ratVar3.h.b();
                                        MessageIdType B = g.B();
                                        if (true == z4) {
                                            j7 = 0;
                                        }
                                        ruqVar.g(conversationIdType6, B, Long.valueOf(j7), tqcVar2, null, false, -1L, null, g.v());
                                    }
                                    return g;
                                }
                            });
                            c2.getClass();
                            messageCoreData2 = (MessageCoreData) c2;
                            ratVar = this;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                            ratVar.k(messageCoreData2);
                            ratVar.V = messageCoreData2.B();
                            alwo alwoVar2 = b;
                            alvw m2 = alwoVar2.m();
                            m2.X(ydl.a, ratVar.V.a());
                            m2.q("InsertNewMessageProcessor: inserted.");
                            alwl alwlVar2 = (alwl) alwoVar2.g();
                            alwlVar2.X(ydl.a, messageCoreData2.B().a());
                            alwlVar2.X(ydl.o, messageCoreData2.z().toString());
                            alwlVar2.J("InsertNewMessageProcessor: Inserted SMS. (uri=%s, receivedTimestamp=%d {x-message-id:%d})", messageCoreData2.t(), Long.valueOf(messageCoreData2.n()), Long.valueOf(messageCoreData2.s()));
                            j3 = j;
                            if (j3 != 0) {
                                str2 = str3;
                                ratVar.s.d(str2, messageCoreData2.B().a(), j3);
                            } else {
                                i2 = i;
                                ratVar2 = ratVar;
                                e = akrhVar2;
                                j2 = j5;
                                conversationIdType3 = conversationIdType4;
                                str = str3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            akrhVar = akrhVar2;
                            throw th;
                        }
                    } else {
                        j3 = j;
                        ratVar = ratVar2;
                        akrhVar2 = e;
                        str2 = str3;
                        ((alwl) b.h()).q("InsertNewMessageProcessor: No uri for SMS inserted into telephony DB.");
                    }
                    i2 = i;
                    ratVar2 = ratVar;
                    str = str2;
                    e = akrhVar2;
                    j2 = j5;
                    conversationIdType3 = conversationIdType4;
                } catch (Throwable th6) {
                    th = th6;
                    akrhVar2 = e;
                }
            }
            armd.i(e, null);
        } catch (Throwable th7) {
            akrhVar = e;
            th = th7;
        }
    }

    public final void j(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, SelfIdentityId selfIdentityId2, int i) {
        SelfIdentityId selfIdentityId3;
        Optional map = Optional.ofNullable(this.j.e(selfIdentityId)).map(new qwz(qnc.d, 14));
        rto z = ((uac) this.Z.b()).z(conversationIdType);
        if (z != null) {
            this.U.put(conversationIdType, z);
        }
        if (z != null) {
            selfIdentityId3 = z.f();
        } else {
            selfIdentityId3 = null;
        }
        String str = ((SelfIdentityIdImpl) selfIdentityId2).a;
        ((alwl) b.g()).L("InsertNewMessage: selfId(param): %s, selfIdFromSub: %s, conversationSelfId: %s, subId(param): %d, subIdFromSelf: %s", selfIdentityId, str, selfIdentityId3, Integer.valueOf(i), map);
    }

    public final void k(MessageCoreData messageCoreData) {
        if (messageCoreData.B().a == -1) {
            ((alwl) b.g()).q("Not notifying UI about new message because message id is -1");
            return;
        }
        Object e = muv.c.e();
        e.getClass();
        if (((Boolean) e).booleanValue()) {
            Iterator it = ((Set) this.aq.b()).iterator();
            while (it.hasNext()) {
                ((qyi) it.next()).c(messageCoreData.B().toString(), messageCoreData.z().toString(), messageCoreData.n());
            }
        }
        this.v.h(messageCoreData.z(), messageCoreData.B());
    }

    public final boolean l(Action action, MessageCoreData messageCoreData) {
        Action f = ((rjq) this.an.b()).f(messageCoreData, 2);
        if (f == null) {
            return false;
        }
        f.B(action);
        if (((orj) this.J.b()).a() && messageCoreData.cL()) {
            ((alwl) b.g()).q("InsertNewMessageProcessor: Send message directly & bypass pending message queue for Satellite message.");
            return true;
        }
        ((alwl) b.g()).q("InsertNewMessageProcessor: Send message directly & bypass pending message queue because it's empty.");
        return true;
    }

    public final boolean m(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        int i = 0;
        if (!messageCoreData.cI() || !messageCoreData.cD() || messageCoreData.cM() || messageCoreData.bZ() || messageCoreData.cs() || messageCoreData.cZ() != null || messageCoreData.u() != null) {
            return false;
        }
        akrh e = aktp.e("InsertNewMessageProcessor::opportunisticUiUpdateInside");
        try {
            if (messageCoreData.E().i()) {
                messageCoreData.bR(((qdx) this.at.b()).a());
            }
            if (((ansy) ((nli) this.au).a.b()).e("bugle.show_rcs_text_in_ui_before_persistence_async")) {
                aktp.ah(new rah(this, messageCoreData, i), this.av).getClass();
            } else {
                e(messageCoreData);
            }
            armd.i(e, null);
            return true;
        } finally {
        }
    }
}
