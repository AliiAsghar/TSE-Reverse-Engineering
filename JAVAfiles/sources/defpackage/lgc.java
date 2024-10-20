package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.bwj;
import defpackage.cga;
import defpackage.csv;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgc {
    public lgc() {
    }

    public static /* synthetic */ sxy A(String str, String str2, String str3, alog alogVar, int i) {
        if ((i & 1) != 0) {
            String[] strArr = PartsTable.a;
            str = "parts";
        }
        if ((i & 2) != 0) {
            String[] strArr2 = ParticipantsTable.a;
            str2 = "participants";
        }
        if ((i & 4) != 0) {
            String[] strArr3 = tom.a;
            str3 = "user_references";
        }
        if ((i & 8) != 0) {
            int i2 = alog.d;
            alogVar = alsx.a;
            alogVar.getClass();
        }
        int i3 = i & 16;
        str.getClass();
        str2.getClass();
        str3.getClass();
        alogVar.getClass();
        tbs d = PartsTable.d();
        int i4 = 0;
        d.d(new mva(i4));
        int size = alogVar.size();
        while (i4 < size) {
            ((mzy) alogVar.get(i4)).d();
            i4++;
        }
        sxy d2 = MessagesTable.d();
        d2.d(new mva(2));
        d2.a.m = true;
        tbr b = d.b();
        tbi tbiVar = PartsTable.d.b;
        sxp sxpVar = MessagesTable.c.a;
        tbu tbuVar = new tbu();
        tbuVar.U(new agmg("parts._id", 6));
        agog q = b.q(tbiVar, sxpVar, new agpw(tbuVar));
        q.f = str;
        d2.D(q.a());
        if (i3 != 0) {
            tok tokVar = new tok(tom.a);
            taz e = ParticipantsTable.e();
            e.d(new mtm(20));
            agog b2 = agoh.b(e.b(), ParticipantsTable.c.a, (agmh) tom.e.c);
            b2.f = str2;
            tokVar.D(b2.a());
            agog b3 = agoh.b(tokVar.b(), (agmh) tom.e.b, MessagesTable.c.a);
            b3.f = str3;
            d2.D(b3.a());
        }
        return d2;
    }

    public static final boolean B(miz mizVar) {
        String b;
        mix a;
        int ordinal;
        mje c = mizVar.c();
        if ((c instanceof mjl) && ((a = ((mjl) c).a()) == null || (ordinal = a.ordinal()) == 0 || ordinal == 4 || ordinal == 5)) {
            return false;
        }
        mym e = mizVar.e();
        if (e instanceof mxs) {
            mxs mxsVar = (mxs) e;
            alog alogVar = mxsVar.a;
            alogVar.getClass();
            if (alogVar.isEmpty()) {
                return false;
            }
            alog alogVar2 = mxsVar.a;
            alogVar2.getClass();
            if (!alogVar2.isEmpty()) {
                alur it = alogVar2.iterator();
                while (it.hasNext()) {
                    if (!P((mxf) it.next())) {
                        return false;
                    }
                }
            }
        } else if (e instanceof mys) {
            mys mysVar = (mys) e;
            String c2 = mysVar.c();
            if ((c2 == null || c2.length() == 0) && ((b = mysVar.b()) == null || b.length() == 0)) {
                return false;
            }
        } else {
            if (e instanceof myr) {
                String b2 = ((myr) e).b();
                if (b2 == null || b2.length() == 0) {
                    return false;
                }
                return true;
            }
            if (!(e instanceof mxf)) {
                return false;
            }
            return P((mxf) e);
        }
        return true;
    }

    public static final boolean C(String str) {
        return d.F(str, "EMERGENCY+SERVICE+PROVIDER");
    }

    public static final boolean D(String str) {
        return d.F(str, "EMERGENCY+SERVICE+PROVIDER+DEMO");
    }

    public static msb E(Context context, apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5, apwt apwtVar6, apwt apwtVar7, apwt apwtVar8) {
        apwtVar.getClass();
        mrr mrrVar = new mrr(apwtVar, 0);
        apwtVar2.getClass();
        return new msb(context, mrrVar, new mrr(apwtVar2, 0), apwtVar3, apwtVar4, apwtVar5, apwtVar6, apwtVar7, apwtVar8);
    }

    public static /* synthetic */ void F() {
        alok alokVar = new alok();
        alokVar.h("conversations.name_is_automatic", 10012);
        alokVar.h("conversations.conv_type", 10007);
        alokVar.h("group_concat(quote(participants.comparable_destination), '|')", 54040);
        alokVar.b();
    }

    public static /* synthetic */ Object G(Object obj) {
        boolean z;
        if (((String) obj) != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final ConversationIdType H(ConversationId conversationId) {
        if (conversationId instanceof RbmConversationId) {
            ConversationIdType conversationIdType = ((RbmConversationId) conversationId).a;
            conversationIdType.getClass();
            return conversationIdType;
        }
        if (conversationId instanceof EmergencySosConversationId) {
            return ((EmergencySosConversationId) conversationId).a;
        }
        if (conversationId instanceof PenpalBotConversationId) {
            ConversationIdType conversationIdType2 = ((PenpalBotConversationId) conversationId).a;
            conversationIdType2.getClass();
            return conversationIdType2;
        }
        return ((BugleConversationId) conversationId).a;
    }

    public static boolean I(mll mllVar) {
        if (mllVar.t() != -1) {
            return true;
        }
        return false;
    }

    public static ConversationId J() {
        throw new UnsupportedOperationException();
    }

    public static ConversationId K() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ String L(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "REQUIRES_SIMPLE";
            }
            return "DISABLED";
        }
        return "ENABLED";
    }

    public static boolean M(int i) {
        if (i != 2) {
            return true;
        }
        return false;
    }

    private static final boolean N(lbw lbwVar, String str) {
        if (lbwVar.as(str)) {
            aglz[] au = lbwVar.au(str, new aglz[0]);
            au.getClass();
            if (au.length != 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean O(lda ldaVar, String str) {
        if (ldaVar.as(str)) {
            aglz[] au = ldaVar.au(str, new aglz[0]);
            au.getClass();
            if (au.length != 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean P(mxf mxfVar) {
        if (mxfVar.d() == null) {
            return false;
        }
        myz fl = mxfVar.fl();
        if (fl != null && fl.b) {
            return false;
        }
        return true;
    }

    public static final void a(lgj lgjVar, bwj bwjVar, int i) {
        int i2;
        long f;
        cga a;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-838257690);
        if (i4 == 0) {
            if (true != c.G(lgjVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            c.y(-242131323);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new cit();
                bwkVar.ad(T);
            }
            cit citVar = (cit) T;
            bwkVar.Y();
            aeoq aeoqVar = (aeoq) cak.a(lgjVar.a, c).a();
            cga.a aVar = cga.e;
            f = ckw.f(cku.d(r3), cku.c(r3), cku.b(r3), 0.96f, cku.f(bmp.a(c).p));
            a = adf.a(aVar, f, clw.a);
            adom.aE(aeoqVar, a, citVar, c, 384, 0);
            bxl.g(citVar, new kca((agak) c.g(agas.a), (View) c.g(AndroidCompositionLocals_androidKt.f), (arpe) null, 11), c);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lgjVar, i, 6);
        }
    }

    public static final void b(lix lixVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        cga a;
        boolean z;
        bwk bwkVar;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-2711155);
        if (i4 == 0) {
            if (true != c2.G(lixVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            aov a2 = aoz.a(c2);
            if (lixVar.b.isEmpty()) {
                a = amv.c(cga.e, 1.0f);
            } else {
                c = amv.c(cga.e, 1.0f);
                a = c.a(amv.b);
            }
            c2.y(-168034590);
            int i5 = i2 & 14;
            bwk bwkVar2 = (bwk) c2;
            Object T = bwkVar2.T();
            if (i5 == 4 || T == bwj.a.a) {
                T = new kju(lixVar, 19);
                bwkVar2.ad(T);
            }
            bwkVar2.Y();
            anp.a(a, a2, null, false, null, null, null, false, (arqr) T, c2, 0, 252);
            String str = lixVar.a;
            c2.y(-168015887);
            if (i5 == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean G = c2.G(a2) | z;
            Object T2 = bwkVar2.T();
            if (!G && T2 != bwj.a.a) {
                bwkVar = bwkVar2;
            } else {
                T2 = new kda(lixVar, a2, (arpe) null, 18);
                bwkVar = bwkVar2;
                bwkVar.ad(T2);
            }
            bwkVar.Y();
            bxl.g(str, (arqv) T2, c2);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lixVar, i, 11);
        }
    }

    public static final void c(List list, boolean z, bwj bwjVar, int i, int i2) {
        boolean z2;
        List list2;
        bwj c = bwjVar.c(-1332843754);
        boolean z3 = !list.isEmpty();
        if ((i2 & 2) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z4 = z & z2;
        if (z4 && list.size() == 1) {
            aeqn aeqnVar = (aeqn) list.get(0);
            list2 = aqjn.y(new aeqn(aeqnVar.a, aeqnVar.b, aeqnVar.c, null));
        } else {
            list2 = list;
        }
        wf.a(z3, null, wx.m().a(wx.g(null, 3)), wx.n().a(wx.h(null, 3)), null, cdk.e(2097909742, new jjs(list2, 18), c), c, 200064, 18);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new lil(list, z4, i, i2, 0);
        }
    }

    public static String d(String str, String str2) {
        String[] strArr = MessagesTable.a;
        return "CREATE TRIGGER IF NOT EXISTS " + "on_messages_delete_update_".concat(str) + " AFTER DELETE ON messages WHEN OLD.message_status >= 1 AND OLD.message_status <= 22 BEGIN DELETE FROM " + str + " WHERE CAST(julianday(OLD.received_timestamp / 1000, 'unixepoch') AS INT) <= CAST(julianday(" + str2 + " / 1000, 'unixepoch') AS INT); END";
    }

    public static final long f(Optional optional, long j) {
        optional.getClass();
        if (optional.isPresent() && ((Number) optional.get()).longValue() > j) {
            return ((Number) optional.get()).longValue();
        }
        return j;
    }

    public static final int g(lbw lbwVar) {
        lbwVar.getClass();
        if (N(lbwVar, "scheduled_send_nudge")) {
            return 1;
        }
        if (abal.c() && N(lbwVar, "reminder_nudge")) {
            return 4;
        }
        if (ier.a() && N(lbwVar, "conversation_classification_type")) {
            return 3;
        }
        if (!yig.e() || !N(lbwVar, "nudge_classification")) {
            return 1;
        }
        return 2;
    }

    public static final int h(lda ldaVar) {
        ldaVar.getClass();
        if (O(ldaVar, "scheduled_send_nudge")) {
            return 1;
        }
        if (abal.c() && O(ldaVar, "reminder_nudge")) {
            return 4;
        }
        if (ier.a() && O(ldaVar, "conversation_classification_type")) {
            return 3;
        }
        if (!yig.e() || !O(ldaVar, "nudge_classification")) {
            return 1;
        }
        return 2;
    }

    public static final /* synthetic */ lwy i(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (lwy) s;
    }

    public static final void j(long j, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        lwy lwyVar = (lwy) aozyVar.b;
        lwy lwyVar2 = lwy.a;
        lwyVar.b |= 2;
        lwyVar.f = j;
    }

    public static final void k(aozb aozbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        lwy lwyVar = (lwy) aozyVar.b;
        lwy lwyVar2 = lwy.a;
        lwyVar.b |= 1;
        lwyVar.e = aozbVar;
    }

    public static final /* synthetic */ lwq l(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (lwq) s;
    }

    public static final void m(lwo lwoVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        lwq lwqVar = (lwq) aozyVar.b;
        lwq lwqVar2 = lwq.a;
        lwqVar.d = lwoVar;
        lwqVar.c = 3;
    }

    public static final void n(lwp lwpVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        lwq lwqVar = (lwq) aozyVar.b;
        lwq lwqVar2 = lwq.a;
        lwqVar.d = lwpVar;
        lwqVar.c = 2;
    }

    public static final void o(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        lwq lwqVar = (lwq) aozyVar.b;
        lwq lwqVar2 = lwq.a;
        lwqVar.b |= 1;
        lwqVar.e = str;
    }

    public static final /* synthetic */ lwo p(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (lwo) s;
    }

    public static final void q(long j, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        lwo lwoVar = (lwo) aozyVar.b;
        lwo lwoVar2 = lwo.a;
        lwoVar.b |= 2;
        lwoVar.d = j;
    }

    public static final void r(long j, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        lwo lwoVar = (lwo) aozyVar.b;
        lwo lwoVar2 = lwo.a;
        lwoVar.b |= 1;
        lwoVar.c = j;
    }

    public static /* synthetic */ lwp s(icl iclVar) {
        aozy createBuilder = lwp.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str = iclVar.b;
        apag apagVar = createBuilder.b;
        lwp lwpVar = (lwp) apagVar;
        lwpVar.b |= 2;
        lwpVar.d = str;
        long j = iclVar.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        lwp lwpVar2 = (lwp) createBuilder.b;
        lwpVar2.b |= 1;
        lwpVar2.c = j;
        apct k = aoue.k(iclVar.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        lwp lwpVar3 = (lwp) apagVar2;
        lwpVar3.e = k;
        lwpVar3.b |= 4;
        long j2 = iclVar.d;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        lwp lwpVar4 = (lwp) apagVar3;
        lwpVar4.b |= 8;
        lwpVar4.f = j2;
        long j3 = iclVar.e;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        lwp lwpVar5 = (lwp) createBuilder.b;
        lwpVar5.b |= 16;
        lwpVar5.g = j3;
        apag s = createBuilder.s();
        s.getClass();
        return (lwp) s;
    }

    public static final boolean t(lwr lwrVar) {
        lwrVar.getClass();
        if (lwrVar.p < lwr.COMPLETE_SUCCESS.p) {
            return true;
        }
        return false;
    }

    public static final void u(String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        cgaVar.getClass();
        int i5 = i & 14;
        bwj c = bwjVar.c(-1092720414);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 896) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i6 |= i3;
        }
        int i7 = i6 | 3072;
        if ((i7 & 5851) == 1170 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            Uri parse = Uri.parse(str);
            int i8 = csv.a;
            bwjVar2 = c;
            aeke.bf(parse, "", cgaVar, null, null, null, csv.a.a, null, brg.a, null, null, null, null, null, null, null, bwjVar2, (i7 & 896) | 12582920, (i7 << 6) & 458752, 491384);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new kie(str, cgaVar, i, 14);
        }
    }

    public static final /* synthetic */ ltz v(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ltz) s;
    }

    public static final void w(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ltz ltzVar = (ltz) aozyVar.b;
        ltz ltzVar2 = ltz.a;
        ltzVar.b = str;
    }

    public static final boolean x(MessageIdType messageIdType) {
        if (!messageIdType.b()) {
            return true;
        }
        return false;
    }

    public static final sxt y(MessageIdType messageIdType) {
        sxy d = MessagesTable.d();
        d.d(new mtm(19));
        d.w("MessageQueryHelper.getBasicMessageDetailsData");
        syc sycVar = new syc();
        sycVar.i(messageIdType);
        d.f(sycVar);
        return (sxt) d.b().n();
    }

    public static final tbn z(Uri uri, MessageIdType messageIdType) {
        tbs d = PartsTable.d();
        d.d(new mva(1));
        d.w("MessageQueryHelper.getPartsFileSizeBytes");
        tbu tbuVar = new tbu();
        tbuVar.n(uri);
        tbuVar.i(messageIdType);
        d.f(tbuVar);
        return (tbn) d.b().n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [apwt, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.armf r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.lpl
            if (r0 == 0) goto L13
            r0 = r8
            lpl r0 = (defpackage.lpl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            lpl r0 = new lpl
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            defpackage.aqil.P(r8)
            goto Lc6
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.aqil.P(r8)
            alhr r8 = defpackage.lpm.c
            java.lang.Object r8 = r8.get()
            utz r8 = (defpackage.utz) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Ld1
            java.lang.Object r7 = r7.b()
            znj r7 = (defpackage.znj) r7
            boolean r8 = defpackage.ier.a()
            if (r8 == 0) goto L96
            alhr r8 = defpackage.ier.c
            java.lang.Object r8 = r8.get()
            utz r8 = (defpackage.utz) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L96
            java.lang.Object r8 = r7.b
            java.lang.Object r8 = r8.b()
            j$.util.Optional r8 = (j$.util.Optional) r8
            boolean r8 = r8.isPresent()
            if (r8 == 0) goto L96
            java.lang.Object r8 = r7.b
            java.lang.Object r8 = r8.b()
            j$.util.Optional r8 = (j$.util.Optional) r8
            java.lang.Object r8 = r8.get()
            yiz r8 = (defpackage.yiz) r8
            akul r8 = r8.b()
            yeb r2 = new yeb
            r5 = 15
            r2.<init>(r5)
            java.lang.Object r7 = r7.a
            akul r7 = r8.h(r2, r7)
            goto Lbb
        L96:
            alhr r7 = defpackage.ier.c
            java.lang.Object r7 = r7.get()
            utz r7 = (defpackage.utz) r7
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto Lb3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            akul r7 = defpackage.aktp.ag(r7)
            goto Lbb
        Lb3:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            akul r7 = defpackage.aktp.ag(r7)
        Lbb:
            r7.getClass()
            r0.b = r4
            java.lang.Object r8 = defpackage.arro.F(r7, r0)
            if (r8 == r1) goto Ld0
        Lc6:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto Ld1
            r3 = r4
            goto Ld1
        Ld0:
            return r1
        Ld1:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgc.e(armf, arpe):java.lang.Object");
    }

    public lgc(arwe arweVar, arpi arpiVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        arpiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
    }

    public lgc(agnq agnqVar, arwe arweVar) {
        agnqVar.getClass();
        arweVar.getClass();
    }
}
