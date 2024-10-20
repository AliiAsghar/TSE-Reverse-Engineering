package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxx {
    public static final alwo a = alwo.o("BugleNotifications");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor");
    public static final alog c = alog.x(ChatMessage.Type.TEXT, ChatMessage.Type.RBM_SPECIFIC_MESSAGE, ChatMessage.Type.TEST, ChatMessage.Type.TEST_FAILURE, ChatMessage.Type.ENCRYPTED_MESSAGE, ChatMessage.Type.ENCRYPTION_FTD, ChatMessage.Type.PROTO_MESSAGE);
    public static final alhr d = uuh.w("update_participant_with_received_rcs");
    public final armf A;
    public final armf B;
    public final armf C;
    public final armf D;
    public final armf E;
    public final armf F;
    public final armf G;
    public final armf H;
    public final armf I;
    public final armf J;
    public final armf K;
    public final armf L;
    public final armf M;
    public final armf N;
    public final armf O;
    public final armf P;
    public final anen Q;
    public final anen R;
    public final anen S;
    public final armf T;
    public final Optional U;
    public final ajsd V;
    public final armf W;
    public final armf X;
    public final armf Y;
    public final armf Z;
    public final armf aa;
    public final rav ab;
    public final tzn ac;
    public final vjs ad;
    public final zai ae;
    public final uac af;
    public final zai ag;
    private final vqu ah;
    private final ryy ai;
    private final tqx aj;
    private final wze ak;
    private final armf al;
    private final mbl am;
    private final armf an;
    private final qvv ao;
    private final arwe ap;
    private final armf aq;
    private final armf ar;
    private final armf as;
    private final armf at;
    private final armf au;
    private final adji av;
    private final adae aw;
    private final hgj ax;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final yxx i;
    public final armf j;
    public final mho k;
    public final armf l;
    public final rzc m;
    public final Optional n;
    public final vsh o;
    public final armf p;
    public final uhj q;
    public final rys r;
    public final wen s;
    public final rfr t;
    public final agnq u;
    public final armf v;
    public final armf w;
    public final armf x;
    public final apwt y;
    public final armf z;

    public vxx(vqu vquVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, yxx yxxVar, armf armfVar5, zai zaiVar, mho mhoVar, armf armfVar6, rzc rzcVar, Optional optional, rav ravVar, vsh vshVar, armf armfVar7, uac uacVar, ryy ryyVar, vjs vjsVar, uhj uhjVar, rys rysVar, wen wenVar, rfr rfrVar, tqx tqxVar, agnq agnqVar, zai zaiVar2, tzn tznVar, armf armfVar8, wze wzeVar, hgj hgjVar, armf armfVar9, armf armfVar10, apwt apwtVar, armf armfVar11, armf armfVar12, armf armfVar13, mbl mblVar, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, adji adjiVar, adae adaeVar, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, anen anenVar, anen anenVar2, anen anenVar3, Optional optional2, ajsd ajsdVar, armf armfVar30, armf armfVar31, armf armfVar32, qvv qvvVar, arwe arweVar, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40) {
        this.ah = vquVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = yxxVar;
        this.j = armfVar5;
        this.ae = zaiVar;
        this.k = mhoVar;
        this.l = armfVar6;
        this.m = rzcVar;
        this.n = optional;
        this.ab = ravVar;
        this.o = vshVar;
        this.p = armfVar7;
        this.af = uacVar;
        this.ai = ryyVar;
        this.ad = vjsVar;
        this.q = uhjVar;
        this.r = rysVar;
        this.s = wenVar;
        this.t = rfrVar;
        this.aj = tqxVar;
        this.u = agnqVar;
        this.ag = zaiVar2;
        this.ac = tznVar;
        this.v = armfVar8;
        this.ak = wzeVar;
        this.ax = hgjVar;
        this.w = armfVar9;
        this.x = armfVar10;
        this.y = apwtVar;
        this.z = armfVar11;
        this.al = armfVar12;
        this.A = armfVar13;
        this.am = mblVar;
        this.B = armfVar14;
        this.C = armfVar15;
        this.D = armfVar16;
        this.E = armfVar17;
        this.F = armfVar18;
        this.G = armfVar19;
        this.H = armfVar20;
        this.I = armfVar21;
        this.J = armfVar22;
        this.av = adjiVar;
        this.aw = adaeVar;
        this.M = armfVar23;
        this.K = armfVar24;
        this.L = armfVar25;
        this.N = armfVar26;
        this.P = armfVar27;
        this.T = armfVar28;
        this.Q = anenVar;
        this.R = anenVar2;
        this.S = anenVar3;
        this.O = armfVar29;
        this.U = optional2;
        this.V = ajsdVar;
        this.W = armfVar30;
        this.an = armfVar31;
        this.X = armfVar32;
        this.ao = qvvVar;
        this.ap = arweVar;
        this.Y = armfVar33;
        this.aq = armfVar34;
        this.ar = armfVar35;
        this.as = armfVar36;
        this.Z = armfVar37;
        this.at = armfVar38;
        this.au = armfVar39;
        this.aa = armfVar40;
    }

    public static boolean f(String str, LocationInformation locationInformation, vxv vxvVar) {
        if (str == null && locationInformation == null && !vxvVar.b()) {
            return true;
        }
        return false;
    }

    public static boolean i(String str) {
        if (str != null && adai.a.f(str)) {
            return true;
        }
        return false;
    }

    public final qwm a(vqy vqyVar) {
        String str = vqyVar.d.d;
        if (((pdl) this.au.b()).a()) {
            return ((wpp) this.at.b()).F(vqyVar.d);
        }
        adix adixVar = (adix) this.av.h(this.aw.d(str)).orElse(null);
        if (adixVar != null) {
            return ((ryg) this.M.b()).f(adixVar.a);
        }
        ((qya) this.an.b()).r(vqyVar.a, vqyVar.d);
        return this.ah.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r7 > 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData b(defpackage.vqy r32, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r33, defpackage.qwm r34, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r35, defpackage.vxv r36, java.lang.String r37, boolean r38, boolean r39, com.google.android.ims.rcsservice.locationsharing.LocationInformation r40, defpackage.apwq r41) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxx.b(vqy, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, qwm, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, vxv, java.lang.String, boolean, boolean, com.google.android.ims.rcsservice.locationsharing.LocationInformation, apwq):com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData");
    }

    public final tqc c(ConversationIdType conversationIdType, String str, boolean z) {
        return ((rwd) this.f.b()).A(conversationIdType, str, false, z);
    }

    public final akul d(vqy vqyVar) {
        akul ag;
        akul c2;
        akrh e = aktp.e("IncomingRcsMessageProcessor.processAsync");
        try {
            if (((Boolean) ((utz) yig.U.get()).e()).booleanValue() && !((Optional) ((apxx) this.X).a).isEmpty() && vom.f(vqyVar.c, vqyVar.r)) {
                vom.g(vqyVar.r).getClass();
                qvv qvvVar = this.ao;
                qei qeiVar = vqyVar.d;
                arwe arweVar = this.ap;
                qvvVar.getClass();
                qeiVar.getClass();
                arweVar.getClass();
                c2 = qjh.c(arweVar, arpj.a, arwf.a, new qsk(qvvVar, qeiVar, (arpe) null, 7));
                ag = c2.i(new vfj(this, vqyVar, 12), this.S);
                akul h = ag.h(new vuu(this, 6), this.R);
                e.b(h);
                e.close();
                return h;
            }
            ag = aktp.ag(vqyVar);
            akul h2 = ag.h(new vuu(this, 6), this.R);
            e.b(h2);
            e.close();
            return h2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(vqy vqyVar, qei qeiVar) {
        aoia aoiaVar;
        Optional empty;
        if (vqyVar.v) {
            if (vqyVar.g) {
                String str = vqyVar.h;
                String str2 = vqyVar.i;
                if (str != null && str2 != null) {
                    aoiaVar = qnu.i(this.ax.o(str, str2), qeiVar);
                } else {
                    throw new IllegalArgumentException("RCS group conversation information not found");
                }
            } else {
                aoiaVar = new aoia(qeiVar);
            }
            try {
                akrh e = aktp.e("IncomingRcsMessageProcessor#sendDeliveredReportForBlockedUserWithChatApi");
                try {
                    wze wzeVar = this.ak;
                    rve rveVar = vqyVar.a;
                    Instant ofEpochMilli = Instant.ofEpochMilli(vqyVar.j);
                    Bundle bundle = vqyVar.u;
                    String string = bundle.getString("chat.extra.customDeliveryReceiptContentType");
                    byte[] byteArray = bundle.getByteArray("chat.extra.customDeliveryReceipt");
                    if (string != null && byteArray != null) {
                        empty = Optional.of(new xai(string, byteArray, 1));
                    } else if (string == null && byteArray == null) {
                        empty = Optional.empty();
                    } else {
                        alvw i = b.i();
                        i.X(alwp.a, "BugleDataModel");
                        alvg alvgVar = (alvg) i;
                        alvgVar.X(ydl.f, vqyVar.a);
                        alvgVar.X(ydl.w, string);
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor", "getOptionalRcsMessageReceiptConverter", 1636, "IncomingRcsMessageProcessor.java")).q("custom report contentType or receipt is null");
                        throw new IllegalArgumentException("custom contentType and receipt must both be null or not null");
                    }
                    akul c2 = wzeVar.c(rveVar, ofEpochMilli, aoiaVar, empty, vqyVar.d);
                    e.b(c2);
                    arjv arjvVar = (arjv) c2.get();
                    e.close();
                    this.k.ao(vqyVar.a, (amxb) arjvVar.b, (amxo) arjvVar.c);
                    alvw d2 = b.d();
                    d2.X(alwp.a, "BugleDataModel");
                    ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor", "sendDeliveredReportForBlockedUser", 1547, "IncomingRcsMessageProcessor.java")).q("Stop incoming RCS message processing from blocked user.");
                    return;
                } finally {
                }
            } catch (InterruptedException | ExecutionException e2) {
                psp pspVar = new psp("Failed to get the send delivered message receipt future result.", e2);
                qiu.d(pspVar);
                throw pspVar;
            }
        }
        alvw d3 = b.d();
        d3.X(alwp.a, "BugleDataModel");
        alvg alvgVar2 = (alvg) d3;
        alvgVar2.X(ydl.f, vqyVar.a);
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor", "sendDeliveredReportForBlockedUser", 1537, "IncomingRcsMessageProcessor.java")).q("No need to send a delivered report for blocked user.");
    }

    public final boolean g() {
        if (((opo) this.as.b()).a()) {
            return true;
        }
        if (((Boolean) this.aq.b()).booleanValue() && ((oqb) this.ar.b()).a()) {
            return true;
        }
        return false;
    }

    public final boolean h(ConversationIdType conversationIdType, qwm qwmVar) {
        Optional e = this.av.e(qwmVar.e());
        if (e.isEmpty()) {
            return false;
        }
        return Collection.EL.stream(((rtz) this.O.b()).aq(conversationIdType)).map(new vxg(this, 2)).anyMatch(new uhe(((msk) this.z.b()).t(((adit) e.get()).a, qwmVar.e()), 17));
    }
}
