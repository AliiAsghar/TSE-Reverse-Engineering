package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.net.URLDecoder;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqp implements vqm {
    public static final xze a = xze.g("BugleTelephony", "RcsTelephonyAccessImpl");
    public static final utz b;
    private final armf A;
    private final armf B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    public final Context c;
    public final ydh d;
    public final agnq e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final Optional i;
    public final armf j;
    public final anen k;
    public final anen l;
    public final vyv m;
    private final armf n;
    private final armf o;
    private final anen p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final armf v;
    private final Optional w;
    private final armf x;
    private final armf y;
    private final armf z;

    static {
        uuh.q(171959430);
        b = uuh.i(uuh.b, "use_conversation_data_instead_of_blindly_trusting_conference_uri", true);
    }

    public vqp(Context context, agnq agnqVar, armf armfVar, armf armfVar2, ydh ydhVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, Optional optional, Optional optional2, anen anenVar, armf armfVar12, vyv vyvVar, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, anen anenVar2, anen anenVar3) {
        this.c = context;
        this.p = anenVar;
        this.e = agnqVar;
        this.n = armfVar;
        this.o = armfVar2;
        this.d = ydhVar;
        this.f = armfVar3;
        this.g = armfVar4;
        this.q = armfVar5;
        this.h = armfVar6;
        this.r = armfVar7;
        this.s = armfVar8;
        this.t = armfVar9;
        this.u = armfVar10;
        this.v = armfVar11;
        this.i = optional;
        this.w = optional2;
        this.x = armfVar12;
        this.m = vyvVar;
        this.y = armfVar13;
        this.z = armfVar14;
        this.A = armfVar15;
        this.B = armfVar16;
        this.C = armfVar17;
        this.D = armfVar18;
        this.E = armfVar19;
        this.F = armfVar20;
        this.j = armfVar21;
        this.G = armfVar22;
        this.k = anenVar3;
        this.l = anenVar2;
    }

    private final String q(boolean z, MessageCoreData messageCoreData) {
        if (((orp) this.G.b()).a() && messageCoreData.cL()) {
            return null;
        }
        if (z) {
            return messageCoreData.w().d;
        }
        return ((vqu) this.n.b()).t();
    }

    private final void r(ConversationIdType conversationIdType, MessageIdType messageIdType, Uri uri) {
        if (uri != null) {
            rwd rwdVar = (rwd) this.q.b();
            sya syaVar = new sya();
            syaVar.aj("updateMessageUri");
            syaVar.K(uri);
            rwdVar.O(conversationIdType, messageIdType, syaVar);
        }
    }

    private final akul s(MessageCoreData messageCoreData, Uri uri, String str, int i) {
        return l(messageCoreData).h(new mhz(this, messageCoreData, uri, str, i, 3), this.p);
    }

    @Override // defpackage.vqm
    public final long a(long j) {
        return o(j, null);
    }

    @Override // defpackage.vqm
    public final Uri b(MessageCoreData messageCoreData, long j, msh mshVar, String str, int i) {
        aiut.b();
        int i2 = 1;
        ArrayList b2 = ((rus) this.r.b()).b(messageCoreData.z(), true);
        String[] strArr = (String[]) b2.toArray(new String[b2.size()]);
        try {
            Uri t = messageCoreData.t();
            gqg U = ((vqu) this.n.b()).U(messageCoreData);
            long n = messageCoreData.n() / 1000;
            gt gtVar = new gt();
            String o = mshVar.o(true);
            o.getClass();
            gtVar.b(new gi(o));
            gtVar.i(new gi(""));
            gtVar.b = U;
            gtVar.h(n);
            gtVar.g();
            String ag = messageCoreData.ag();
            if (ag != null) {
                gtVar.a.j(vak.f(ag), 132);
            }
            gtVar.a.h(messageCoreData.r(), 142);
            gi[] f = gi.f(strArr);
            if (f != null) {
                gtVar.a.n(f);
            }
            if (str != null) {
                gtVar.k(str.getBytes(StandardCharsets.UTF_8));
            }
            if (((Boolean) qpf.b.e()).booleanValue()) {
                if (((Boolean) b.e()).booleanValue()) {
                    gtVar.k(vqz.c(messageCoreData, str, sni.b(messageCoreData.z())));
                } else if (str != null) {
                    vrf.f(str);
                    gtVar.k(str.getBytes(StandardCharsets.UTF_8));
                }
            }
            MessagePartCoreData G = messageCoreData.G();
            if (G != null && !messageCoreData.cq()) {
                i2 = n(G);
            }
            String q = q(false, messageCoreData);
            Uri X = ((wzs) this.s.b()).X(this.c, gtVar, i, q, j, n, messageCoreData.E().b, i2);
            if (X == null) {
                return null;
            }
            Uri withAppendedId = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(X));
            messageCoreData.br(withAppendedId);
            r(messageCoreData.z(), messageCoreData.B(), withAppendedId);
            messageCoreData.j();
            p();
            if (t != null) {
                mbm b3 = ((mce) this.t.b()).b("Bugle.Telephony.Delete.Rcs.Latency");
                vcp.c(this.c.getContentResolver(), t, null, null);
                b3.c();
            }
            return withAppendedId;
        } catch (gk e) {
            a.n("updateIncomingRcsInTelephony: failed to create PDU", e);
            return null;
        }
    }

    @Override // defpackage.vqm
    @Deprecated
    public final xaz c(long j, String str, String str2) {
        return d(xhv.b(j), str, str2);
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.vqm
    public final xaz d(xhv xhvVar, String str, String str2) {
        String str3;
        Object obj;
        Object R;
        Object k;
        aiut.b();
        if (str != null && ((vqq) this.o.b()).d(str)) {
            String ag = albo.ag(((yst) this.y.b()).c(str));
            int length = ag.length();
            int i = length - 15;
            int i2 = length - 16;
            int lastIndexOf = ag.lastIndexOf(31, i2);
            int lastIndexOf2 = ag.lastIndexOf(31, lastIndexOf - 1);
            if (lastIndexOf == -1) {
                lastIndexOf = ag.lastIndexOf(45, i2);
                lastIndexOf2 = ag.lastIndexOf(45, lastIndexOf - 1);
            }
            return xaz.a(xhvVar, ((wzs) this.s.b()).J(str2), URLDecoder.decode(ag.substring(0, lastIndexOf2)), ag.substring(lastIndexOf2 + 1, lastIndexOf), ag.substring(lastIndexOf + 1, i));
        }
        if (str != null && ((vqq) this.o.b()).c(str)) {
            List J = ((wzs) this.s.b()).J(str2);
            wyj e = ((vqq) this.o.b()).e(str);
            if (e != null) {
                if (TextUtils.isEmpty(e.a)) {
                    R = ((yyt) this.z.b()).R();
                } else {
                    R = e.a;
                }
                if (TextUtils.isEmpty(e.c)) {
                    k = uvl.k();
                } else {
                    k = e.c;
                }
                obj = e.b;
            } else {
                String c = ((yst) this.y.b()).c(str);
                a.q(String.format(Locale.US, "The RBM bot thread data in Telephony is invalid: encoded = %s, decoded = %s", yyb.bh(str), yyb.bh(c)));
                Iterator it = J.iterator();
                while (true) {
                    if (it.hasNext()) {
                        msh mshVar = (msh) it.next();
                        if (mshVar.u()) {
                            str3 = mshVar.j(((Boolean) new msn(18).get()).booleanValue());
                            break;
                        }
                    } else {
                        str3 = null;
                        break;
                    }
                }
                if (str3 == null) {
                    if (true != TextUtils.isEmpty(c)) {
                        str = c;
                    }
                } else {
                    str = str3;
                }
                obj = str;
                R = ((yyt) this.z.b()).R();
                k = uvl.k();
            }
            String str4 = (String) obj;
            wyj wyjVar = new wyj(str4, (String) R, (String) k);
            obj.getClass();
            return xaz.c(xhvVar, Collections.singletonList(((msk) this.A.b()).n(str4)), wyjVar);
        }
        return ((wzs) this.s.b()).v(xhvVar, str2);
    }

    @Override // defpackage.vqm
    public final xhv e(long j, GroupInfo groupInfo) {
        return xhv.b(o(j, groupInfo));
    }

    @Override // defpackage.vqm
    public final akul f(MessageCoreData messageCoreData, Uri uri, String str) {
        return s(messageCoreData, uri, str, 1);
    }

    @Override // defpackage.vqm
    public final akul g(MessageCoreData messageCoreData, Uri uri, String str) {
        return s(messageCoreData, uri, str, 2);
    }

    @Override // defpackage.vqm
    public final akul h(final MessageCoreData messageCoreData, final long j, final msh mshVar, final String str, final int i) {
        return l(messageCoreData).h(new algk() { // from class: vqn
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                vqp vqpVar = vqp.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                long j2 = j;
                if (booleanValue) {
                    int i2 = i;
                    return vqpVar.b(messageCoreData2, j2, mshVar, str, i2);
                }
                vqpVar.m(messageCoreData2, j2);
                return null;
            }
        }, this.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    @Override // defpackage.vqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri i(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r15, defpackage.aknw r16, java.util.List r17, long r18, java.lang.String r20, int r21) {
        /*
            r14 = this;
            r0 = r14
            r13 = r15
            r1 = r20
            defpackage.aiut.b()
            android.net.Uri r2 = r15.t()
            if (r2 != 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            defpackage.d.s(r2)
            if (r1 == 0) goto L1a
            byte[] r2 = r20.getBytes()
            goto L1b
        L1a:
            r2 = 0
        L1b:
            utz r3 = defpackage.qpf.b
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
            utz r3 = defpackage.vqp.b
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L45
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = r15.z()
            smr r2 = defpackage.sni.b(r2)
            byte[] r1 = defpackage.vqz.c(r15, r1, r2)
        L43:
            r12 = r1
            goto L52
        L45:
            if (r1 == 0) goto L51
            defpackage.vrf.f(r20)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r2)
            goto L43
        L51:
            r12 = r2
        L52:
            armf r1 = r0.D
            java.lang.Object r1 = r1.b()
            okk r1 = (defpackage.okk) r1
            boolean r1 = r1.a()
            java.lang.String r9 = r14.q(r1, r15)
            long r10 = r15.n()
            armf r1 = r0.s
            java.lang.Object r1 = r1.b()
            wzs r1 = (defpackage.wzs) r1
            android.content.Context r2 = r0.c
            r3 = r17
            r4 = r15
            r5 = r16
            r6 = r18
            r8 = r21
            android.net.Uri r1 = r1.ah(r2, r3, r4, r5, r6, r8, r9, r10, r12)
            if (r1 == 0) goto L82
            r15.br(r1)
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqp.i(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, aknw, java.util.List, long, java.lang.String, int):android.net.Uri");
    }

    @Override // defpackage.vqm
    public final xhv j(wyj wyjVar) {
        if (wyjVar == null) {
            return new xhv();
        }
        xzb.j("Bugle", String.format("Building encoded RBM telephony addr for threadInfo: %s", String.format("id = %s, name = %s, color = %s", wyjVar.b, wyjVar.a, wyjVar.c)));
        long f = ((wyt) this.B.b()).f(wxr.a, ((vqq) this.o.b()).f(wyjVar));
        xzb.k("Bugle", "RcsUtils.getOrCreateRbmBotThreadId returned thread id %d", Long.valueOf(f));
        return xhv.b(f);
    }

    @Override // defpackage.vqm
    public final akul k(MessageCoreData messageCoreData, aknw aknwVar, List list, long j, String str, int i) {
        Stream map = Collection.EL.stream(list).map(new vmd(9));
        int i2 = alog.d;
        return l(messageCoreData).h(new vqo(this, messageCoreData, aknwVar, (alog) map.collect(alls.a), j, str, i, 0), this.p);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, trz] */
    public final akul l(MessageCoreData messageCoreData) {
        usk uskVar = (usk) this.u.b();
        if (messageCoreData.cn() && uskVar.a.o()) {
            return uskVar.c();
        }
        return aktp.ag(true);
    }

    public final void m(MessageCoreData messageCoreData, long j) {
        ConversationIdType z = messageCoreData.z();
        xze xzeVar = rwd.a;
        akrh e = aktp.e("MessageDatabaseOperations#getCountOfMessagesInBothConversationAndInTelephony");
        try {
            syc sycVar = new syc();
            sycVar.f(z);
            sycVar.K();
            int c = rwd.c(new syb(sycVar));
            e.close();
            if (c <= 0) {
                MessageCoreData f = ((tqx) this.v.b()).f(z, messageCoreData.v(), " ", null, false);
                f.bm(true);
                f.bI(1);
                ((rvw) this.x.b()).a(f);
                ArrayList b2 = ((rus) this.r.b()).b(z, true);
                String q = q(((okl) this.E.b()).a(), messageCoreData);
                long n = f.n();
                aknw aknwVar = new aknw(null);
                aknwVar.b = ((vqu) this.n.b()).U(f);
                aknwVar.a = 1L;
                Uri ah = ((wzs) this.s.b()).ah(this.c, b2, f, aknwVar, j, -1, q, n, null);
                if (ah != null) {
                    f.br(ah);
                    r(f.z(), f.B(), ah);
                }
            }
        } finally {
        }
    }

    public final int n(MessagePartCoreData messagePartCoreData) {
        armf armfVar = this.C;
        if (((zai) armfVar.b()).d(messagePartCoreData.p()).a()) {
            return 3;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126 A[Catch: ajny | SecurityException | vjg -> 0x014a, ajny -> 0x014c, SecurityException -> 0x014e, TryCatch #6 {ajny | SecurityException | vjg -> 0x014a, blocks: (B:55:0x0101, B:57:0x0110, B:59:0x0114, B:61:0x0126, B:62:0x012d), top: B:54:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(long r11, com.google.android.ims.rcsservice.group.GroupInfo r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqp.o(long, com.google.android.ims.rcsservice.group.GroupInfo):long");
    }

    public final void p() {
        this.w.ifPresent(new uhb(14));
    }
}
