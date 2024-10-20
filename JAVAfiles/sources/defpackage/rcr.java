package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rcr implements rbt {
    public static final xze a = xze.g("BugleDataModel", "ProcessDownloadedMmsAction");
    private static final alwo u = alwo.o("Bugle");
    private static final alwo v = alwo.o("BugleNotifications");
    private final Optional A;
    private final ujv B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final mce G;
    private final armf H;
    private final armf I;
    private final ryg J;
    private final wyp K;
    private final qyn L;
    private final rji M;
    private final uhj N;
    private final rys O;
    private final agnq P;
    private final yck Q;
    private final wzp R;
    private final mfc S;
    private final Optional T;
    private final armf U;
    private final armf V;
    private final arpi W;
    private final armf X;
    private final armf Y;
    private final apwt Z;
    private final zai aA;
    private final hgj aB;
    private final armf aa;
    private final ahqr ab;
    private final armf ac;
    private final armf ad;
    private final armf ae;
    private final armf af;
    private final armf ag;
    private final armf ah;
    private final armf ai;
    private final odn aj;
    private final armf ak;
    private final armf al;
    private final armf am;
    private final armf an;
    private final armf ao;
    private final armf ap;
    private final armf aq;
    private final pmz ar;
    private final armf as;
    private final armf at;
    private final armf au;
    private final armf av;
    private final oia aw;
    private final armf ax;
    private final armf ay;
    private final tzn az;
    public final Context b;
    public final wys c;
    public final mho d;
    public final armf e;
    public final armf f;
    public final wzs g;
    public final wyq h;
    public final rtb i;
    public final armf j;
    public final arwe k;
    public final arwe l;
    public final arpi m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final Action r;
    public final rhl s;
    public final qya t;
    private final xnv w;
    private final xca x;
    private final armf y;
    private final rzc z;

    public rcr(Context context, xnv xnvVar, wys wysVar, xca xcaVar, armf armfVar, rzc rzcVar, Optional optional, ujv ujvVar, mho mhoVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, mce mceVar, zai zaiVar, armf armfVar8, wzs wzsVar, armf armfVar9, ryg rygVar, wyp wypVar, qyn qynVar, wyq wyqVar, rji rjiVar, uhj uhjVar, rys rysVar, agnq agnqVar, qya qyaVar, rtb rtbVar, yck yckVar, wzp wzpVar, tzn tznVar, hgj hgjVar, mfc mfcVar, armf armfVar10, Optional optional2, armf armfVar11, armf armfVar12, arwe arweVar, arwe arweVar2, arpi arpiVar, arpi arpiVar2, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, apwt apwtVar, armf armfVar17, ahqr ahqrVar, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, odn odnVar, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, pmz pmzVar, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, oia oiaVar, armf armfVar38, armf armfVar39, Action action) {
        this.b = context;
        this.w = xnvVar;
        this.c = wysVar;
        this.x = xcaVar;
        this.y = armfVar;
        this.z = rzcVar;
        this.A = optional;
        this.B = ujvVar;
        this.d = mhoVar;
        this.e = armfVar2;
        this.C = armfVar3;
        this.D = armfVar4;
        this.f = armfVar5;
        this.E = armfVar6;
        this.F = armfVar7;
        this.G = mceVar;
        this.aA = zaiVar;
        this.H = armfVar8;
        this.g = wzsVar;
        this.I = armfVar9;
        this.J = rygVar;
        this.K = wypVar;
        this.L = qynVar;
        this.h = wyqVar;
        this.M = rjiVar;
        this.N = uhjVar;
        this.O = rysVar;
        this.P = agnqVar;
        this.t = qyaVar;
        this.i = rtbVar;
        this.Q = yckVar;
        this.R = wzpVar;
        this.az = tznVar;
        this.aB = hgjVar;
        this.S = mfcVar;
        this.j = armfVar10;
        this.T = optional2;
        this.U = armfVar11;
        this.V = armfVar12;
        this.k = arweVar;
        this.l = arweVar2;
        this.m = arpiVar;
        this.W = arpiVar2;
        this.n = armfVar13;
        this.o = armfVar14;
        this.X = armfVar15;
        this.Y = armfVar16;
        this.Z = apwtVar;
        this.aa = armfVar17;
        this.ab = ahqrVar;
        this.p = armfVar18;
        this.ac = armfVar19;
        this.ad = armfVar20;
        this.ae = armfVar21;
        this.af = armfVar22;
        this.ag = armfVar23;
        this.ah = armfVar24;
        this.ai = armfVar25;
        this.q = armfVar26;
        this.aj = odnVar;
        this.ak = armfVar27;
        this.al = armfVar28;
        this.am = armfVar29;
        this.an = armfVar30;
        this.ao = armfVar31;
        this.ap = armfVar32;
        this.aq = armfVar33;
        this.ar = pmzVar;
        this.as = armfVar34;
        this.at = armfVar35;
        this.au = armfVar36;
        this.av = armfVar37;
        this.aw = oiaVar;
        this.ax = armfVar38;
        this.ay = armfVar39;
        this.r = action;
        rhl rhlVar = action.u;
        rhlVar.getClass();
        this.s = rhlVar;
    }

    private final boolean A(smr smrVar) {
        if (smrVar.l() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rbu B(rut rutVar, wye wyeVar, qwm qwmVar, long j, MessageIdType messageIdType, ConversationIdType conversationIdType, long j2, Uri uri, Uri uri2, tqc tqcVar, ParticipantsTable.BindData bindData, boolean z) {
        int i;
        tqr tqrVar;
        long j3;
        int Y = a.Y(this.s.a("mms_api"));
        boolean c = ((ubl) this.y.b()).c(rutVar.a);
        boolean c2 = ((ubl) this.y.b()).c(rutVar.a);
        wyeVar.l = c;
        boolean z2 = false;
        if (!uzz.f() ? c2 || this.aA.b(rutVar.a) : c2 || this.aA.b(rutVar.a) || !z) {
            z2 = true;
        }
        wyeVar.m = z2;
        if (this.Q.p()) {
            i = this.Q.l;
        } else {
            i = 100;
        }
        int i2 = i;
        boolean a2 = qyn.c(bindData.M()).a();
        if (a2) {
            this.L.b(bindData.M());
        }
        wyp wypVar = this.K;
        ConversationIdType conversationIdType2 = rutVar.a;
        String M = bindData.M();
        SelfIdentityId g = qwmVar.g();
        if (a2) {
            tqrVar = tqr.VERIFICATION_UNVERIFIED;
        } else {
            tqrVar = tqr.VERIFICATION_NA;
        }
        MessageCoreData a3 = wypVar.a(wyeVar, conversationIdType2, M, g, i2, tqrVar, j);
        a3.bT();
        MessageData messageData = (MessageData) a3;
        Collection.EL.stream(messageData.i).forEach(new rbc(7));
        Collection.EL.stream(messageData.i).forEach(new rbc(8));
        this.R.i(a3.n());
        MessageCoreData u2 = ((rwd) this.e.b()).u(messageIdType);
        if (u2 == null) {
            a.q("Message deleted prior to update");
            this.az.i(a3);
            ((rvw) this.ad.b()).a(a3);
            j3 = -1;
        } else {
            a3.bQ(messageIdType);
            a3.bK(u2.s());
            long epochMilli = this.w.f().toEpochMilli();
            a3.aQ(epochMilli);
            if (this.Q.p()) {
                a3.bI(this.Q.l);
            }
            for (uyd uydVar : (Set) this.Z.b()) {
            }
            tzn tznVar = this.az;
            ((tzr) tznVar.j.b()).b(4);
            tznVar.k(a3);
            j3 = epochMilli;
            tznVar.g.e("ProtocolChangeTombstoneManagerImpl#updateTombstonesAfterMessageMove", new rvz(tznVar, conversationIdType, a3, 9, (int[]) null));
        }
        if (!this.Q.p()) {
            this.d.aJ(a3, wyeVar.q, j2, false, Y);
            lfl bc = this.d.bc();
            if (bc != null) {
                bc.g(0, uri, j2, 0L, a3.ag());
            }
            w(messageIdType, i2);
            this.T.ifPresent(new qdm(new qnc(4), 17));
        }
        if (!conversationIdType.equals(rutVar.a) && !((uzo) this.F.b()).f(conversationIdType)) {
            ruq ruqVar = (ruq) this.f.b();
            ruqVar.c(new eex(ruqVar, messageIdType, conversationIdType, tqcVar, 18), "ConversationMetadataDatabaseOperations#maybeRefreshConversationMetadata", conversationIdType);
        }
        ((ruq) this.f.b()).a(rutVar.a, true, tqcVar);
        this.N.e(rutVar.a, true);
        if (u2 != null) {
            Object b = this.H.b();
            b.getClass();
            ((ahmv) b).j(u2, null);
        }
        return rbu.a(uri2, this.b, messageIdType, conversationIdType.a(), c, rutVar, a3, qwmVar.e(), j3, bindData, z);
    }

    public static final utz b() {
        return uuh.i(uuh.b, "bug_193237225_use_lightweight_scope", false);
    }

    private final alpt q(String str) {
        alpt a2 = this.g.t(Uri.parse(str)).a();
        a2.getClass();
        if (a2.isEmpty()) {
            ((alwl) u.i()).q("Received MMS without any recipients, using unknown.");
            return new altx("ʼUNKNOWN_SENDER!ʼ");
        }
        return a2;
    }

    private final alpt r(String str) {
        alpt a2 = this.g.t(Uri.parse(str)).a();
        a2.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(a2, 10));
        Iterator<E> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((msk) this.j.b()).n((String) it.next()));
        }
        alpt bd = alzz.bd(arrayList);
        if (bd.isEmpty()) {
            ((alwl) u.i()).q("Received MMS without any recipients, using unknown.");
            return new altx(((msk) this.j.b()).f());
        }
        return bd;
    }

    private final Object s(int i, int i2, Uri uri, long j, int i3, arpe arpeVar) {
        Object e = qpf.a.e();
        e.getClass();
        if (((Boolean) e).booleanValue()) {
            return i(i, i2, uri, j, i3, arpeVar);
        }
        return j(i, i2, uri, j, i3, arpeVar);
    }

    private final Object t(alog alogVar, arpe arpeVar) {
        return k(Optional.of(alogVar), arpeVar);
    }

    private final armo u() {
        return new armo(rvc.b(this.s.l("message_id")), ruy.b(this.s.l("conversation_id")));
    }

    private final void v(tqk tqkVar, alpt alptVar, alob alobVar) {
        aluq listIterator = alptVar.listIterator();
        while (listIterator.hasNext()) {
            alobVar.h(new rwi(tqkVar, (String) listIterator.next()));
        }
    }

    private final void w(MessageIdType messageIdType, int i) {
        aozy createBuilder = mex.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        mex mexVar = (mex) createBuilder.b;
        mexVar.c = 2;
        mexVar.b |= 1;
        aozy createBuilder2 = amgx.a.createBuilder();
        String a2 = messageIdType.a();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amgx amgxVar = (amgx) createBuilder2.b;
        a2.getClass();
        amgxVar.b |= 1;
        amgxVar.c = a2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        mex mexVar2 = (mex) createBuilder.b;
        amgx amgxVar2 = (amgx) createBuilder2.s();
        amgxVar2.getClass();
        mexVar2.d = amgxVar2;
        mexVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        mex mexVar3 = (mex) createBuilder.b;
        mexVar3.b |= 4;
        mexVar3.e = i;
        int a3 = this.s.a("result_code");
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        mex mexVar4 = (mex) createBuilder.b;
        mexVar4.b |= 16;
        mexVar4.g = a3;
        int a4 = this.s.a("mms_last_connection_failure_cause_code");
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        mfc mfcVar = this.S;
        mex mexVar5 = (mex) createBuilder.b;
        mexVar5.b |= 64;
        mexVar5.i = a4;
        mfcVar.e((mex) createBuilder.s());
    }

    private final void x(rbu rbuVar) {
        MessageCoreData messageCoreData;
        if (rbuVar.a != null) {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("read", Boolean.valueOf(rbuVar.e));
            mce mceVar = this.G;
            Context context = rbuVar.b;
            mbm b = mceVar.b("Bugle.Telephony.Update.Mms.Read.Latency");
            vcp.d(context.getContentResolver(), rbuVar.a, contentValues, null, null);
            b.c();
        }
        if (!rbuVar.b().b() && (!this.ar.a() || ((messageCoreData = rbuVar.g) != null && !messageCoreData.cs()))) {
            ((alwl) v.g()).q("Creating notification from ProcessDownloadedMmsAsyncAction");
            if (uzz.g() && !rbuVar.j) {
                ((vco) this.an.b()).r(new BugleConversationId(rbuVar.b()));
            } else {
                ((wpp) this.ac.b()).I(rbuVar.b(), Duration.ofMillis(rbuVar.h), false);
            }
        }
        ((vjs) this.am.b()).f();
        ConversationIdType b2 = rbuVar.b();
        if (!b2.b()) {
            this.N.j(b2, rbuVar.c, new String[0]);
        }
        MessageCoreData messageCoreData2 = rbuVar.g;
        if (messageCoreData2 != null) {
            Iterator it = ((Set) this.Z.b()).iterator();
            while (it.hasNext()) {
                ((uyd) it.next()).a();
            }
            ParticipantsTable.BindData bindData = rbuVar.i;
            if (bindData != null) {
                qiu.h(((ptb) this.aa.b()).b(((msk) this.j.b()).s(bindData), messageCoreData2));
            }
            this.A.ifPresent(new qdm(new qin(messageCoreData2, 15), 16));
        }
        this.z.a(rbuVar.c);
        this.N.j(rbuVar.d, rbuVar.c, new String[0]);
    }

    private final void y(wye wyeVar) {
        for (uyd uydVar : (Set) this.Z.b()) {
            Iterator it = wyeVar.x.iterator();
            while (true) {
                if (it.hasNext()) {
                    wyf wyfVar = (wyf) it.next();
                    if (wyfVar.e()) {
                        wyp.c(wyfVar);
                        break;
                    }
                }
            }
        }
    }

    private final void z(ConversationIdType conversationIdType, boolean z) {
        if (uzz.g()) {
            if (!((lpg) this.al.b()).u()) {
                if (z) {
                    lpg.x(conversationIdType);
                    return;
                }
                lpg.y(conversationIdType);
            }
        }
        if (z) {
            return;
        }
        lpg.y(conversationIdType);
    }

    public final rbu a(int i, int i2, Uri uri) {
        int i3;
        boolean z;
        long j;
        int i4;
        rhl rhlVar = this.s;
        int b = rhlVar.b("sub_id", -1);
        ConversationIdType b2 = ruy.b(rhlVar.l("conversation_id"));
        Uri uri2 = (Uri) this.s.h("notification_uri");
        MessageIdType b3 = rvc.b(this.s.l("message_id"));
        boolean y = this.s.y("auto_download");
        boolean c = ((ubl) this.y.b()).c(b2);
        if (i != 2) {
            if (i != 3) {
                i3 = this.s.a("status_if_failed");
            } else {
                i3 = 107;
            }
        } else if (y) {
            i3 = 101;
        } else {
            i3 = 106;
        }
        if (this.Q.p()) {
            i3 = this.Q.l;
        }
        qya qyaVar = this.t;
        if (uri2 != null) {
            z = true;
        } else {
            z = false;
        }
        qyaVar.m(uri2, b3, b2, i3, i2, z, false);
        MessageCoreData u2 = ((rwd) this.e.b()).u(b3);
        mho mhoVar = this.d;
        ConversationIdType conversationIdType = ruy.a;
        if (u2 != null) {
            j = u2.r();
            conversationIdType = u2.z();
            conversationIdType.getClass();
            i4 = u2.f();
        } else {
            j = -1;
            i4 = 0;
        }
        ConversationIdType conversationIdType2 = conversationIdType;
        long j2 = j;
        int b4 = this.s.b("sub_id", -1);
        rhl rhlVar2 = this.s;
        int a2 = rhlVar2.a("result_code");
        int a3 = rhlVar2.a("http_status_code");
        long d = rhlVar2.d("received_timestamp") * 1000;
        rhl rhlVar3 = this.s;
        yck yckVar = this.Q;
        String l = rhlVar3.l("content_location");
        if (!yckVar.p()) {
            mhoVar.P(b4, a2, a3, i4, lzz.g(null, l, d, null, null), i3, j2, conversationIdType2);
            lfl bc = mhoVar.bc();
            if (bc != null) {
                bc.f(0, uri, a3);
                w(b3, i3);
                ((ruq) this.f.b()).a(b2, true, tqc.UNARCHIVED);
                return rbu.a(uri, this.b, b3, b2.a(), c, null, null, b, -1L, null, true);
            }
        }
        w(b3, i3);
        ((ruq) this.f.b()).a(b2, true, tqc.UNARCHIVED);
        return rbu.a(uri, this.b, b3, b2.a(), c, null, null, b, -1L, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x032d A[EDGE_INSN: B:55:0x032d->B:50:0x032d BREAK  A[LOOP:0: B:17:0x025e->B:53:0x0324], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [aozy] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r43) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [rcr] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [rch, arpe] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [rcr] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ahqr] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [rcr] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ahqq] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ahqq] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ahqq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [rcr] */
    /* JADX WARN: Type inference failed for: r8v3, types: [rcr] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r29, int r30, defpackage.arpe r31) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.e(java.lang.String, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.rcj
            if (r0 == 0) goto L13
            r0 = r6
            rcj r0 = (defpackage.rcj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rcj r0 = new rcj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            java.lang.String r3 = "MMS receiving END"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.aqil.P(r6)     // Catch: java.lang.Throwable -> L29
            goto L3f
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.aqil.P(r6)
            r0.c = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r5.g(r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r6     // Catch: java.lang.Throwable -> L29
            xze r0 = defpackage.rcr.a
            r0.k(r3)
            return r6
        L47:
            xze r0 = defpackage.rcr.a
            r0.k(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.rck
            if (r0 == 0) goto L13
            r0 = r12
            rck r0 = (defpackage.rck) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rck r0 = new rck
            r0.<init>(r11, r12)
        L18:
            r8 = r0
            java.lang.Object r12 = r8.a
            arpl r0 = defpackage.arpl.a
            int r1 = r8.c
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L33
            if (r1 != r10) goto L2b
            rcr r0 = r8.d
            defpackage.aqil.P(r12)
            goto L63
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            defpackage.aqil.P(r12)
            rhl r12 = r11.s
            java.lang.String r1 = "send_deferred_resp_status"
            boolean r12 = r12.y(r1)
            if (r12 == 0) goto L48
            xze r12 = defpackage.rcr.a
            java.lang.String r0 = "Exception while sending deferred NotifyRespInd"
            r12.q(r0)
            return r9
        L48:
            rhl r12 = r11.s
            java.lang.String r1 = "sub_id"
            r2 = -1
            int r7 = r12.b(r1, r2)
            r8.d = r11
            r8.c = r10
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r11
            java.lang.Object r12 = r1.s(r2, r3, r4, r5, r7, r8)
            if (r12 != r0) goto L62
            return r0
        L62:
            r0 = r11
        L63:
            rhl r12 = r0.s
            java.lang.String r1 = "cloud_sync_id"
            java.lang.String r12 = r12.l(r1)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r12 = r12 ^ r10
            r1 = 0
            int r12 = defpackage.riw.e(r12, r1)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = r0.r
            defpackage.rbk.d(r12, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.g(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v29, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r4v29, types: [msh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(android.os.Bundle r34, defpackage.arpe r35) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.h(android.os.Bundle, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x011a, code lost:
    
        if (r12 == null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(int r20, int r21, android.net.Uri r22, long r23, int r25, defpackage.arpe r26) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.i(int, int, android.net.Uri, long, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x044b, code lost:
    
        if (r1 != r3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x03c9, code lost:
    
        if (r1 != r3) goto L85;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016e  */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(int r32, int r33, android.net.Uri r34, long r35, int r37, defpackage.arpe r38) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.j(int, int, android.net.Uri, long, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(j$.util.Optional r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.rcp
            if (r0 == 0) goto L13
            r0 = r7
            rcp r0 = (defpackage.rcp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rcp r0 = new rcp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            rcr r6 = r0.f
            j$.util.Optional r1 = r0.e
            rcr r0 = r0.d
            defpackage.aqil.P(r7)     // Catch: java.lang.Throwable -> L32
            r4 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L50
        L32:
            r6 = move-exception
            goto L64
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            defpackage.aqil.P(r7)
            r0.d = r5     // Catch: java.lang.Throwable -> L62
            r0.e = r6     // Catch: java.lang.Throwable -> L62
            r0.f = r5     // Catch: java.lang.Throwable -> L62
            r0.c = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r5.l(r6, r0)     // Catch: java.lang.Throwable -> L62
            if (r7 == r1) goto L61
            r1 = r5
            r0 = r7
            r7 = r1
        L50:
            j$.util.Optional r0 = (j$.util.Optional) r0     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L5e
            rdq r2 = new rdq     // Catch: java.lang.Throwable -> L5e
            alog r6 = (defpackage.alog) r6     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r7, r0, r6)     // Catch: java.lang.Throwable -> L5e
            goto L87
        L5e:
            r6 = move-exception
            r0 = r1
            goto L64
        L61:
            return r1
        L62:
            r6 = move-exception
            r0 = r5
        L64:
            alwo r7 = defpackage.rcr.u
            alvw r7 = r7.i()
            alwl r7 = (defpackage.alwl) r7
            alvw r7 = r7.g(r6)
            alwl r7 = (defpackage.alwl) r7
            java.lang.String r1 = "Unable to perform BCM"
            r7.q(r1)
            armf r7 = r0.Y
            java.lang.Object r7 = r7.b()
            uvi r7 = (defpackage.uvi) r7
            akul r6 = r7.a(r6)
            defpackage.qiu.h(r6)
            r2 = 0
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.k(j$.util.Optional, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(j$.util.Optional r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.rcq
            if (r0 == 0) goto L13
            r0 = r8
            rcq r0 = (defpackage.rcq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rcq r0 = new rcq
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.aqil.P(r8)
            arpi r8 = r6.m
            qsk r2 = new qsk
            r4 = 0
            r5 = 10
            r2.<init>(r7, r6, r4, r5)
            r0.c = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.l(j$.util.Optional, arpe):java.lang.Object");
    }

    public final boolean m(smr smrVar) {
        if (!((pft) this.av.b()).a()) {
            if (smrVar.l() == 0) {
                return true;
            }
            return false;
        }
        if (A(smrVar)) {
            if (smrVar.E() != vvh.j) {
                Instant ofEpochMilli = Instant.ofEpochMilli(smrVar.u());
                xnv xnvVar = this.w;
                armf armfVar = this.ay;
                Instant f = xnvVar.f();
                Object b = armfVar.b();
                b.getClass();
                if (!ofEpochMilli.isAfter(f.n(((Number) b).longValue(), ChronoUnit.DAYS))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final rbu o(Uri uri, long j, wye wyeVar, xaz xazVar, msh mshVar, boolean z, boolean z2) {
        boolean z3;
        ArrayList J;
        rhl rhlVar = this.s;
        int b = rhlVar.b("sub_id", -1);
        String l = rhlVar.l("participant_id");
        ConversationIdType b2 = ruy.b(rhlVar.l("conversation_id"));
        MessageIdType b3 = rvc.b(this.s.l("message_id"));
        Uri uri2 = (Uri) this.s.h("content_uri");
        rhl rhlVar2 = this.s;
        long d = rhlVar2.d("message_logging_id");
        Uri uri3 = (Uri) rhlVar2.h("notification_uri");
        qwm f = this.J.f(wyeVar.q);
        f.getClass();
        tap j2 = rxn.j(mshVar, null, b);
        ((rxq) this.D.b()).h(j2);
        ParticipantsTable.BindData a2 = j2.a();
        String M = a2.M();
        if (!d.F(M, l)) {
            xyo b4 = a.b();
            b4.H("Downloaded MMS");
            b4.n(b3, b2);
            b4.H("has different sender");
            b4.e(M);
            b4.H("than notification sender");
            b4.e(l);
            b4.q();
        }
        rwd rwdVar = (rwd) this.e.b();
        long j3 = xazVar.a;
        String O = a2.O();
        if (xazVar.b.size() > 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        tqc z4 = rwdVar.z(j3, O, z, z3);
        boolean ac = ((rtz) this.C.b()).ac(xazVar.a);
        rut h = ((ibi) this.E.b()).h(xazVar, z4, b);
        h.getClass();
        armo armoVar = new armo(Boolean.valueOf(ac), h);
        boolean booleanValue = ((Boolean) armoVar.a).booleanValue();
        Object obj = armoVar.b;
        ujv ujvVar = this.B;
        rut rutVar = (rut) obj;
        ConversationIdType conversationIdType = rutVar.a;
        if (xazVar.b.size() > 1) {
            if (!booleanValue) {
                if (((Boolean) qpf.a.e()).booleanValue()) {
                    J = new ArrayList(((rtz) ujvVar.c.b()).K(conversationIdType));
                } else {
                    J = ((rtz) ujvVar.c.b()).J(xazVar, b);
                }
                J.add(f.a());
                ujvVar.h(Optional.empty(), conversationIdType, f, a2, J, 204, ujvVar.e.f().toEpochMilli(), -1L);
            }
        } else if (!booleanValue) {
            alvw i = ujv.a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertMmsGroupCreationTombstone", 518, "TombstoneInserter.java")).q("MMS group creation tombstone could not be created");
            if (xazVar.b.size() <= 1) {
                alvw i2 = ujv.a.i();
                i2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertMmsGroupCreationTombstone", 524, "TombstoneInserter.java")).r("Unexpected threadData.recipients size: %d", xazVar.b.size());
            }
        }
        if (uzz.f()) {
            ConversationIdType conversationIdType2 = rutVar.a;
            conversationIdType2.getClass();
            z(conversationIdType2, z2);
            uri3.getClass();
            a2.getClass();
            return B(rutVar, wyeVar, f, d, b3, b2, j, uri2, uri, z4, a2, z2);
        }
        uri3.getClass();
        a2.getClass();
        return B(rutVar, wyeVar, f, d, b3, b2, j, uri2, uri, z4, a2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rbu p(android.net.Uri r30, long r31, defpackage.wye r33, defpackage.msh r34, defpackage.rut r35, defpackage.alpt r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcr.p(android.net.Uri, long, wye, msh, rut, alpt, boolean):rbu");
    }
}
