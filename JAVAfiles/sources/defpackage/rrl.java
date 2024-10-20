package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rrl extends rqz {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/ConversationData");
    public ikl b;
    public final ConversationIdType c;
    public boolean d;
    public rsa e;
    public final ryg f;

    @Deprecated
    public final rru g;
    public rtj h;
    public BusinessInfoData i;
    public boolean j;
    public SelfIdentityId k;
    public psk l;

    @Deprecated
    public mnd m;
    public lrf n;
    public final uie o;
    private final xyt p;
    private final armf q;
    private final armf r;
    private final armf s;

    public rrl(armf armfVar, ryg rygVar, xyt xytVar, armf armfVar2, qya qyaVar, uie uieVar, ConversationIdType conversationIdType, lrf lrfVar, armf armfVar3, armf armfVar4) {
        ikk a2 = ikl.a();
        a2.b(tqc.UNARCHIVED);
        a2.a = ruy.a;
        a2.e(0);
        a2.h(false);
        a2.i(false);
        a2.k(0);
        a2.l(false);
        a2.n(0L);
        a2.o(0);
        a2.p(false);
        a2.j(false);
        a2.f = "";
        a2.g = "";
        a2.m(Optional.empty());
        a2.c(false);
        a2.f(qpd.NONE);
        a2.g(false);
        a2.d(mmy.b);
        this.b = a2.a();
        this.j = false;
        this.l = psk.NOT_SET;
        this.m = mnd.NONE;
        this.c = conversationIdType;
        this.f = rygVar;
        this.p = xytVar;
        this.q = armfVar2;
        this.o = uieVar;
        this.r = armfVar3;
        this.s = armfVar4;
        this.d = false;
        int i = alog.d;
        this.e = qyaVar.k(alsx.a);
        this.h = uieVar.r();
        this.g = (rru) armfVar.b();
        this.n = lrfVar;
    }

    public static ikl d(rru rruVar, ConversationIdType conversationIdType) {
        String str;
        String str2;
        boolean z;
        String str3;
        tqh tqhVar;
        String str4;
        boolean z2;
        qpd qpdVar;
        Optional optional;
        tqc M = rruVar.M();
        ikk a2 = ikl.a();
        a2.a = conversationIdType;
        if (M == null) {
            M = tqc.UNARCHIVED;
        }
        a2.b(M);
        a2.e(rruVar.G());
        a2.p(rruVar.E());
        a2.h(rruVar.R());
        a2.i(rruVar.Q());
        a2.k(rruVar.a());
        a2.b = rruVar.r();
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar = rruVar.d;
            sacVar.ao(61, "full_name");
            str = sacVar.aj;
        } else {
            san sanVar = rruVar.c;
            sanVar.ao(61, "full_name");
            str = sanVar.aj;
        }
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar2 = rruVar.d;
            sacVar2.ao(62, "first_name");
            str2 = sacVar2.ak;
        } else {
            san sanVar2 = rruVar.c;
            sanVar2.ao(62, "first_name");
            str2 = sanVar2.ak;
        }
        boolean z3 = false;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar3 = rruVar.d;
            sacVar3.ao(63, "display_name");
            str3 = sacVar3.al;
        } else {
            san sanVar3 = rruVar.c;
            sanVar3.ao(63, "display_name");
            str3 = sanVar3.al;
        }
        String str5 = null;
        if (!z && !TextUtils.isEmpty(str3)) {
            str5 = vom.b(str3);
        }
        a2.c = str5;
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar4 = rruVar.d;
            sacVar4.ao(3, "name_is_automatic");
            tqhVar = sacVar4.d;
        } else {
            san sanVar4 = rruVar.c;
            sanVar4.ao(3, "name_is_automatic");
            tqhVar = sanVar4.d;
        }
        if (tqhVar == tqh.NAME_IS_AUTOMATIC) {
            z3 = true;
        }
        a2.l(z3);
        a2.n(rruVar.e());
        a2.o(rruVar.d());
        a2.f = rruVar.t();
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar5 = rruVar.d;
            sacVar5.ao(38, "rcs_conference_uri");
            str4 = sacVar5.M;
        } else {
            san sanVar5 = rruVar.c;
            sanVar5.ao(38, "rcs_conference_uri");
            str4 = sanVar5.M;
        }
        a2.g = str4;
        a2.q(rruVar.h());
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar6 = rruVar.d;
            sacVar6.ao(40, "awaiting_reverse_sync");
            z2 = sacVar6.O;
        } else {
            san sanVar6 = rruVar.c;
            sanVar6.ao(40, "awaiting_reverse_sync");
            z2 = sanVar6.O;
        }
        a2.c(z2);
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar7 = rruVar.d;
            sacVar7.ao(41, "error_state");
            qpdVar = sacVar7.P;
        } else {
            san sanVar7 = rruVar.c;
            sanVar7.ao(41, "error_state");
            qpdVar = sanVar7.P;
        }
        a2.f(qpdVar);
        if (((okf) rruVar.e.b()).a()) {
            sac sacVar8 = rruVar.d;
            sacVar8.ao(42, "rcs_group_last_sync_timestamp");
            optional = sacVar8.Q;
        } else {
            san sanVar8 = rruVar.c;
            sanVar8.ao(42, "rcs_group_last_sync_timestamp");
            optional = sanVar8.Q;
        }
        a2.m(optional);
        a2.g(rruVar.P());
        a2.d = rruVar.q();
        if (ofn.a()) {
            a2.d(rruVar.K());
        } else {
            a2.d(mmy.b);
        }
        if (rruVar.n().isPresent()) {
            a2.e = Optional.of((msh) rruVar.n().get());
        }
        return a2.a();
    }

    public final int a() {
        return this.f.a();
    }

    public final int b(Context context) {
        lrf lrfVar;
        Object obj;
        if (!this.d && (lrfVar = this.n) != null && (obj = lrfVar.b) != null) {
            return ((Integer) obj).intValue();
        }
        rsa rsaVar = this.e;
        int i = ((yje) rsaVar.a.b()).c().a;
        ArrayList f = rsaVar.f();
        if (!f.isEmpty()) {
            if (f.size() == 1) {
                return ((yje) rsaVar.a.b()).f;
            }
            return context.getResources().getColor(R.color.action_bar_background_color);
        }
        return i;
    }

    public final int c(SelfIdentityId selfIdentityId) {
        qwm j = j(selfIdentityId);
        if (j == null) {
            return -1;
        }
        return j.e();
    }

    public final qwm j(SelfIdentityId selfIdentityId) {
        if (selfIdentityId == null) {
            return null;
        }
        return this.f.c(selfIdentityId);
    }

    public final rti k(SelfIdentityId selfIdentityId) {
        return this.h.a(selfIdentityId, this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:3:0x0007, B:5:0x0021, B:7:0x002c, B:9:0x0038, B:12:0x0041, B:13:0x004a, B:16:0x005f, B:18:0x0067, B:19:0x006a, B:22:0x0080, B:24:0x0088, B:25:0x008b, B:31:0x0048, B:32:0x0025), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:3:0x0007, B:5:0x0021, B:7:0x002c, B:9:0x0038, B:12:0x0041, B:13:0x004a, B:16:0x005f, B:18:0x0067, B:19:0x006a, B:22:0x0080, B:24:0x0088, B:25:0x008b, B:31:0x0048, B:32:0x0025), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl l(defpackage.amgj r16, long r17) {
        /*
            r15 = this;
            r1 = r15
            java.lang.String r0 = "ConversationData::getMessageUsageStatisticsData"
            akrh r2 = defpackage.aktp.e(r0)
            com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl r0 = new com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl     // Catch: java.lang.Throwable -> Lb5
            ikl r3 = r1.b     // Catch: java.lang.Throwable -> Lb5
            int r6 = r3.c     // Catch: java.lang.Throwable -> Lb5
            alhr r3 = com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData.b     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Lb5
            utz r3 = (defpackage.utz) r3     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r3 = r3.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L25
            amgi r3 = defpackage.amgi.FIRST_ATTEMPT_TO_SEND     // Catch: java.lang.Throwable -> Lb5
        L23:
            r7 = r3
            goto L2c
        L25:
            rru r3 = r1.g     // Catch: java.lang.Throwable -> Lb5
            amgi r3 = r3.j()     // Catch: java.lang.Throwable -> Lb5
            goto L23
        L2c:
            amge r8 = defpackage.amge.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON     // Catch: java.lang.Throwable -> Lb5
            rru r3 = r1.g     // Catch: java.lang.Throwable -> Lb5
            amgk r9 = r3.k()     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r1.d     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L48
            rru r3 = r1.g     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r3.B()     // Catch: java.lang.Throwable -> Lb5
            if (r3 != 0) goto L41
            goto L48
        L41:
            rru r3 = r1.g     // Catch: java.lang.Throwable -> Lb5
            amgh r3 = r3.i()     // Catch: java.lang.Throwable -> Lb5
            goto L4a
        L48:
            amgh r3 = defpackage.amgh.CONVERSATION_DATA_NOT_LOADED     // Catch: java.lang.Throwable -> Lb5
        L4a:
            r10 = r3
            rru r3 = r1.g     // Catch: java.lang.Throwable -> Lb5
            amjk r3 = r3.l()     // Catch: java.lang.Throwable -> Lb5
            aozy r3 = r3.toBuilder()     // Catch: java.lang.Throwable -> Lb5
            boolean r4 = r1.d     // Catch: java.lang.Throwable -> Lb5
            r5 = 3
            r11 = 1
            r12 = 2
            if (r11 == r4) goto L5e
            r4 = r12
            goto L5f
        L5e:
            r4 = r5
        L5f:
            apag r13 = r3.b     // Catch: java.lang.Throwable -> Lb5
            boolean r13 = r13.isMutable()     // Catch: java.lang.Throwable -> Lb5
            if (r13 != 0) goto L6a
            r3.u()     // Catch: java.lang.Throwable -> Lb5
        L6a:
            apag r13 = r3.b     // Catch: java.lang.Throwable -> Lb5
            amjk r13 = (defpackage.amjk) r13     // Catch: java.lang.Throwable -> Lb5
            int r4 = r4 + (-1)
            r13.d = r4     // Catch: java.lang.Throwable -> Lb5
            int r4 = r13.b     // Catch: java.lang.Throwable -> Lb5
            r4 = r4 | r12
            r13.b = r4     // Catch: java.lang.Throwable -> Lb5
            rru r4 = r1.g     // Catch: java.lang.Throwable -> Lb5
            boolean r4 = r4.B()     // Catch: java.lang.Throwable -> Lb5
            if (r11 == r4) goto L80
            r5 = r12
        L80:
            apag r4 = r3.b     // Catch: java.lang.Throwable -> Lb5
            boolean r4 = r4.isMutable()     // Catch: java.lang.Throwable -> Lb5
            if (r4 != 0) goto L8b
            r3.u()     // Catch: java.lang.Throwable -> Lb5
        L8b:
            apag r4 = r3.b     // Catch: java.lang.Throwable -> Lb5
            amjk r4 = (defpackage.amjk) r4     // Catch: java.lang.Throwable -> Lb5
            int r5 = r5 + (-1)
            r4.e = r5     // Catch: java.lang.Throwable -> Lb5
            int r5 = r4.b     // Catch: java.lang.Throwable -> Lb5
            r5 = r5 | 4
            r4.b = r5     // Catch: java.lang.Throwable -> Lb5
            apag r3 = r3.s()     // Catch: java.lang.Throwable -> Lb5
            r11 = r3
            amjk r11 = (defpackage.amjk) r11     // Catch: java.lang.Throwable -> Lb5
            rru r3 = r1.g     // Catch: java.lang.Throwable -> Lb5
            amwt r3 = r3.m()     // Catch: java.lang.Throwable -> Lb5
            int r12 = r3.E     // Catch: java.lang.Throwable -> Lb5
            r5 = 0
            r3 = r0
            r4 = r16
            r13 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lb5
            r2.close()
            return r0
        Lb5:
            r0 = move-exception
            r3 = r0
            r2.close()     // Catch: java.lang.Throwable -> Lbb
            goto Lc0
        Lbb:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)
        Lc0:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrl.l(amgj, long):com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl");
    }

    public final String m() {
        lrf lrfVar;
        Object obj;
        ikl iklVar = this.b;
        if (!iklVar.n && (lrfVar = this.n) != null && (obj = lrfVar.c) != null) {
            return (String) obj;
        }
        return iklVar.h;
    }

    public final String n() {
        Object obj;
        if (!this.d) {
            lrf lrfVar = this.n;
            if (lrfVar != null && (obj = lrfVar.a) != null) {
                return (String) obj;
            }
            return null;
        }
        ParticipantsTable.BindData a2 = this.e.a();
        if (a2 != null) {
            return a2.O();
        }
        return null;
    }

    public final void o(int i) {
        nct nctVar = (nct) this.q.b();
        Optional optional = this.b.k;
        if (optional.isEmpty()) {
            this.j = nctVar.e(nctVar.b(Optional.empty(), i));
        } else {
            this.j = nctVar.e(nctVar.c(i, optional));
        }
    }

    public final boolean p() {
        boolean q;
        if (this.e.i()) {
            alvw g = a.g();
            g.X(alwp.a, "BugleDataModel");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.p, this.c);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "allowReply", 286, "ConversationData.java")).q("ConversationData: Reply not allowed because this is an incoming conversation.");
            return false;
        }
        int c = c(this.k);
        akrh e = aktp.e("ConversationData#allowReply_dsdrGroupsFlag");
        try {
            if (((okf) this.s.b()).a()) {
                if (c != -1 && ((adjc) this.r.b()).w(c)) {
                    q = true;
                } else {
                    q = false;
                }
            } else {
                q = ((vrn) this.p.a()).q();
            }
            e.close();
            if (this.b.d() && !q) {
                alvw g2 = a.g();
                g2.X(alwp.a, "BugleDataModel");
                alvg alvgVar2 = (alvg) g2;
                alvgVar2.X(ydl.p, this.c);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "allowReply", 305, "ConversationData.java")).q("ConversationData: Reply not allowed because this is a RCS group conversation and RCS is not available.");
                return false;
            }
            if (this.m != mnd.NONE) {
                alvw g3 = a.g();
                g3.X(alwp.a, "BugleDataModel");
                alvg alvgVar3 = (alvg) g3;
                alvgVar3.X(ydl.p, this.c);
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "allowReply", 314, "ConversationData.java")).t("ConversationData: Reply not allowed because of conversation disable mode %s", this.m);
                return false;
            }
            return q(true);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean q(boolean z) {
        int i = this.b.g;
        if (i == 0 || i == 1) {
            return true;
        }
        if (z) {
            alvw g = a.g();
            g.X(alwp.a, "BugleDataModel");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.p, this.c);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "allowReplyBasedOnJoinState", 333, "ConversationData.java")).r("ConversationData: Reply not allowed because conversation state disallows replies. joinState: %s", this.b.g);
            return false;
        }
        return false;
    }

    public final boolean r() {
        if (this.d) {
            return this.e.g();
        }
        return this.b.e;
    }

    public final boolean s() {
        ikl iklVar = this.b;
        int i = iklVar.m;
        if (iklVar.d() || r()) {
            return true;
        }
        if (nct.g(nct.a(i)) && this.j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rqz
    protected final void g() {
    }
}
