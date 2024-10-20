package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import j$.util.Collection;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqw implements vqu {
    public static final uuf c;
    public static final uuf d;
    public static final uuf e;
    private static final alvi r;
    private final armf A;
    private final xyt B;
    private final armf C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    private final armf H;
    private final armf I;
    private final armf J;
    private final armf K;
    private final armf L;
    private final armf M;
    private final armf N;
    private final anen O;
    private final armf P;
    private final armf Q;
    private final armf R;
    private final ahqr S;
    private final armf T;
    private final armf U;
    private final armf V;
    private final armf W;
    private final oeh X;
    private final osp Y;
    private final armf Z;
    private final zbl aa;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    private final armf s;
    private final Context t;
    private final armf u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;

    static {
        uuh.r(155051225, "enable_timeout_in_bugle_for_rcs");
        c = uuh.r(169210093, "allow_invalid_session_id_for_get_or_create_rcs_group_conversation");
        d = uuh.i(uuh.b, "log_telephony_access_get_contribution_id", true);
        e = uuh.i(uuh.b, "log_timer_get_contribution_id", true);
        r = alvi.m("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl");
    }

    public vqw(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, xyt xytVar, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, anen anenVar, zbl zblVar, armf armfVar28, armf armfVar29, ahqr ahqrVar, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, oeh oehVar, osp ospVar, armf armfVar40) {
        this.t = context;
        this.s = armfVar;
        this.f = armfVar2;
        this.v = armfVar3;
        this.w = armfVar4;
        this.x = armfVar5;
        this.y = armfVar6;
        this.z = armfVar7;
        this.A = armfVar8;
        this.B = xytVar;
        this.C = armfVar9;
        this.D = armfVar10;
        this.E = armfVar11;
        this.F = armfVar12;
        this.G = armfVar13;
        this.H = armfVar14;
        this.I = armfVar15;
        this.J = armfVar16;
        this.K = armfVar17;
        this.L = armfVar18;
        this.g = armfVar19;
        this.h = armfVar20;
        this.M = armfVar21;
        this.u = armfVar22;
        this.N = armfVar23;
        this.O = anenVar;
        this.i = armfVar24;
        this.j = armfVar25;
        this.k = armfVar26;
        this.R = armfVar27;
        this.aa = zblVar;
        this.P = armfVar28;
        this.Q = armfVar29;
        this.S = ahqrVar;
        this.T = armfVar30;
        this.l = armfVar31;
        this.m = armfVar32;
        this.U = armfVar33;
        this.V = armfVar34;
        this.n = armfVar35;
        this.W = armfVar36;
        this.o = armfVar37;
        this.p = armfVar38;
        this.q = armfVar39;
        this.X = oehVar;
        this.Y = ospVar;
        this.Z = armfVar40;
    }

    private static int Y(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    private final Uri Z(MessageCoreData messageCoreData, int i, long j) {
        if (i == 0) {
            Uri m = ((wzs) this.K.b()).m((ryg) this.h.b(), messageCoreData, j);
            if (messageCoreData.cn() && messageCoreData.bZ()) {
                messageCoreData.bq();
                messageCoreData.aM();
                Collection.EL.stream(messageCoreData.W()).forEach(new uhb(16));
                ((rwd) this.H.b()).I(messageCoreData, messageCoreData.W());
                return m;
            }
            return m;
        }
        return null;
    }

    private final Optional aa(int i) {
        String f;
        if (((Boolean) zke.a.e()).booleanValue()) {
            f = (String) this.aa.a(i).j().orElse(null);
        } else {
            f = ((zxy) this.C.b()).x(i).f(this.t.getString(R.string.mms_phone_number_pref_key), null);
        }
        if (TextUtils.isEmpty(f)) {
            if (i != -1) {
                Optional j = ((yjy) this.x.b()).h(i).j(false);
                af(j, 5);
                return j;
            }
            if (TextUtils.isEmpty(f)) {
                xzb.n("BugleAction", "No default number, returning empty msisdn");
                return Optional.empty();
            }
        }
        xzb.d("BugleAction", "Using subId %d for msisdn", Integer.valueOf(i));
        Optional of = Optional.of(((yjy) this.x.b()).h(i).h(f));
        af(of, 6);
        return of;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [msh, java.lang.Object] */
    private final Optional ab() {
        Optional flatMap = ((adje) this.l.b()).l().flatMap(new viu(this, 10));
        if (flatMap.isEmpty() || ((msh) flatMap.get()).e().isEmpty()) {
            xzb.n("BugleAction", "Failed to get msisdn from Bugle");
            try {
                flatMap = Optional.of(((msk) this.k.b()).r(((RcsProfileService) this.z.b()).getMsisdn()));
                af(flatMap, 4);
            } catch (ajny | NullPointerException e2) {
                xzb.p("BugleAction", e2, "Failed to get msisdn from RcsProfileService");
            }
        }
        if (!flatMap.isEmpty() && !((msh) flatMap.get()).e().isEmpty()) {
            return flatMap;
        }
        Optional aa = aa(((yyt) this.Q.b()).Q(vqk.q));
        if (aa.isPresent() && !TextUtils.isEmpty(aa.get().i())) {
            return aa;
        }
        return aa(-1);
    }

    private final String ac(ConversationIdType conversationIdType) {
        Uri t;
        if (((Boolean) qpf.a.e()).booleanValue()) {
            smr a = sni.a(conversationIdType);
            if (a == null) {
                xzb.g("BugleRcs", "Conversation was not found, conversationId=".concat(String.valueOf(String.valueOf(conversationIdType))));
                return "";
            }
            if (!TextUtils.isEmpty(a.V())) {
                return a.V();
            }
        }
        if (((Boolean) qpf.a.e()).booleanValue() && ((Boolean) d.e()).booleanValue()) {
            ((mbl) this.f.b()).c("Bugle.RcsMigration.ContributionIdFromTelephony");
        }
        xhv a2 = ((ugy) this.I.b()).a(conversationIdType);
        String I = ((rtz) this.G.b()).I(conversationIdType);
        MessageCoreData k = ((rwd) this.H.b()).k(conversationIdType);
        if (k == null) {
            t = null;
        } else {
            t = k.t();
        }
        if (t == null) {
            return "";
        }
        return W(a2, I, t.toString()).e;
    }

    private final List ad(String str) {
        Uri withAppendedPath = Uri.withAppendedPath(Uri.parse(str), "addr");
        mbm b = ((mce) this.s.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor e2 = vcp.e(this.t.getContentResolver(), withAppendedPath, qkv.b(), null, null, null);
        qxq.m(e2);
        b.c();
        if (e2 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                while (e2.moveToNext()) {
                    msh v = ((msk) this.k.b()).v(((wfh) this.F.b()).g(e2));
                    if (!arrayList.contains(v) && !((ryg) this.h.b()).k(v)) {
                        arrayList.add(v);
                    }
                }
                return arrayList;
            } finally {
                e2.close();
            }
        }
        return new ArrayList();
    }

    private final boolean ae() {
        return ((Boolean) ((adje) this.l.b()).l().map(new vmd(12)).orElse(false)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [msh, java.lang.Object] */
    private final void af(Optional optional, int i) {
        if (optional.isPresent() && optional.get().e().isPresent()) {
            ((mbl) this.f.b()).e("Bugle.Rcs.PhoneNumber.Invalid.Counts", i);
        }
    }

    @Override // defpackage.vqu
    public final void A() {
        ((ykw) this.w.b()).j("rcs_sub_id", -2);
        ((ykw) this.w.b()).n("rcs_msisdn");
    }

    @Override // defpackage.vqu
    public final void B(acun acunVar) {
        xzb.c("BugleAction", "Set RCS T&Cs");
        SharedPreferences sharedPreferences = this.t.getSharedPreferences(((ykw) this.w.b()).a(), 0);
        String str = acunVar.c;
        if (TextUtils.isEmpty(str)) {
            xzb.n("BugleAction", "Terms&Conditions message is empty");
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("rcs_terms_and_conditions_title", acunVar.d);
        edit.putString("rcs_terms_and_conditions_message", str);
        edit.apply();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [msh, java.lang.Object] */
    @Override // defpackage.vqu
    public final void C() {
        ykb h = ((yjy) this.x.b()).h(((yjy) this.x.b()).f());
        ((ykw) this.w.b()).j("rcs_sub_id", h.a());
        Optional j = h.j(false);
        if (j.isPresent()) {
            ((ykw) this.w.b()).l("rcs_msisdn", j.get().g());
        } else {
            ((ykw) this.w.b()).n("rcs_msisdn");
        }
    }

    @Override // defpackage.vqu
    public final boolean D(ConversationIdType conversationIdType) {
        vqt V = V(conversationIdType);
        int i = 1;
        if (V == vqt.MANUAL) {
            return true;
        }
        if (V.ordinal() != 1) {
            i = 2;
        }
        ((mbl) this.f.b()).e("Bugle.Fallback.Conversation.Cancelled.Reason", i);
        return false;
    }

    @Override // defpackage.vqu
    public final boolean E() {
        return ((ykw) this.w.b()).p("rcs_terms_and_conditions_message");
    }

    @Override // defpackage.vqu
    public final boolean F(vqt vqtVar) {
        if (vqtVar != vqt.AUTOMATIC_NOT_ROAMING && vqtVar != vqt.AUTOMATIC_ALWAYS) {
            return false;
        }
        return true;
    }

    @Override // defpackage.vqu
    public final boolean G(Intent intent) {
        try {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent == null) {
                xzb.n("BugleRcs", "Pending intent is null. Broadcast not authorized.");
                return false;
            }
            if (!((vpv) this.P.b()).a(pendingIntent.getCreatorUid())) {
                xzb.n("BugleRcs", "Package not google signed. Broadcast not authorized.");
                return false;
            }
            return true;
        } catch (RuntimeException e2) {
            xzb.n("BugleRcs", "Unable to retrieve pending intent. Broadcast not authorized.");
            xzb.e("BugleRcs", e2, "Logging Stacktrace.");
            return false;
        }
    }

    @Override // defpackage.vqu
    public final boolean H() {
        if (!((yaq) this.B.a()).n() && !((yjy) this.x.b()).i().E()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vqu
    public final boolean I(ConversationIdType conversationIdType) {
        return ((rtz) this.G.b()).af(conversationIdType);
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [msh, java.lang.Object] */
    @Override // defpackage.vqu
    public final boolean J(int i) {
        int d2 = ((ykw) this.w.b()).d("rcs_sub_id", -2);
        if (d2 == -2) {
            xzb.d("BugleRcs", "subId %d not rcs because no sim has rcs", Integer.valueOf(i));
            return false;
        }
        int a = ((yjy) this.x.b()).h(i).a();
        if (d2 == a) {
            xzb.d("BugleRcs", "subId %d has rcs because it is the saved rcs subId", Integer.valueOf(i));
            return true;
        }
        String f = ((ykw) this.w.b()).f("rcs_msisdn", null);
        if (TextUtils.isEmpty(f)) {
            xzb.d("BugleRcs", "subId %d not rcs because unknown msisdn for rcs subid %d", Integer.valueOf(i), Integer.valueOf(a));
            return false;
        }
        Optional j = ((yjy) this.x.b()).h(a).j(false);
        if (j.isEmpty()) {
            xzb.d("BugleRcs", "subId %d not rcs because its msisdn is not available", Integer.valueOf(i));
            return false;
        }
        if (!albo.ag(j.get().o(((Boolean) new mst(10).get()).booleanValue())).equals(f)) {
            xzb.d("BugleRcs", "subId %d not rcs because msisdn %s different than rcs subid %d %s", Integer.valueOf(i), yyb.bi(j.get()), Integer.valueOf(a), yyb.bh(f));
            return false;
        }
        xzb.d("BugleRcs", "subId %d has rcs because has same msisdn as rcs subid %d", Integer.valueOf(i), Integer.valueOf(a));
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    @Override // defpackage.vqu
    public final boolean K() {
        amwt d2 = ((vrn) ((xyt) this.J.b()).a()).d();
        wfh wfhVar = (wfh) ((yck) this.M.b()).d.b();
        if (((Boolean) acpq.E().c().a()).booleanValue() && ((ykw) wfhVar.a.b()).q("bugle_allow_rcs_overrides", false) && d2 != amwt.DISABLED_TERMS_AND_CONDITIONS_REJECTED) {
            return false;
        }
        int ordinal = d2.ordinal();
        if (ordinal != 10 && ordinal != 16 && ordinal != 18) {
            xzb.d("Bugle", "isReadyForProvisioning: false, rcsAvailability is %s", d2.toString());
            return false;
        }
        xzb.d("Bugle", "isReadyForProvisioning: true, rcsAvailability is %s", d2.toString());
        return true;
    }

    @Override // defpackage.vqu
    public final synchronized boolean L() {
        return ((ykw) this.w.b()).q("rcs_welcome_message_dismissed", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0126, code lost:
    
        defpackage.xzb.l("Bugle", "Cannot resize message for MMS fallback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
    
        if (((defpackage.wyp) r3.d).b(r18.W(), r20).a() == false) goto L47;
     */
    /* JADX WARN: Type inference failed for: r2v37, types: [armf, java.lang.Object] */
    @Override // defpackage.vqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18, int r19, int r20, long r21, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqw.M(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, int, long, boolean, boolean):boolean");
    }

    @Override // defpackage.vqu
    public final boolean N(MessageCoreData messageCoreData, int i, long j) {
        int i2;
        if (i != 0) {
            i2 = 1;
        } else {
            i2 = i;
        }
        d.s(true);
        return ((rwd) this.H.b()).L(messageCoreData, i2, j, Z(messageCoreData, i2, j));
    }

    @Override // defpackage.vqu
    public final boolean O() {
        return ((wfe) this.i.b()).l();
    }

    @Override // defpackage.vqu
    public final boolean P(int i) {
        return ((wfe) this.i.b()).m(i);
    }

    @Override // defpackage.vqu
    public final boolean Q(MessageCoreData messageCoreData) {
        if (!((Boolean) messageCoreData.ab().map(new viu(this, 9)).orElse(false)).booleanValue()) {
            alvg alvgVar = (alvg) r.i();
            alvgVar.X(ydl.f, messageCoreData.E());
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "shouldSendReadReport", 949, "RcsUtilsImpl.java")).q("Can't send a read report because the subscription is no longer active.");
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vqu
    public final ConversationIdType R(long j, xhv xhvVar, GroupInfo groupInfo, int i, Optional optional, boolean z, int i2) {
        boolean z2;
        xyl.h();
        if (((Boolean) c.e()).booleanValue()) {
            if (j == -1) {
                if (groupInfo != null) {
                    j = -1;
                } else {
                    z2 = false;
                    j = -1;
                    d.s(z2);
                }
            }
            z2 = true;
            d.s(z2);
        }
        if (xhvVar.c()) {
            alog v = ((rtz) this.G.b()).v(wxr.c, xhvVar);
            if (!v.isEmpty()) {
                ConversationIdType conversationIdType = (ConversationIdType) v.get(0);
                xzb.k("Bugle", "Retrieved group conversation id %s using threadId %s, with %d matches", conversationIdType, xhvVar, Integer.valueOf(((alsx) v).c));
                return conversationIdType;
            }
        }
        xzb.k("Bugle", "Retrieved no group conversation id using threadId %s", xhvVar);
        if (j != -1) {
            ConversationIdType p = ((rtz) this.G.b()).p(j);
            if (!p.b()) {
                xzb.c("Bugle", a.ck(j, "Resolved group conversation id using chatSessionId: "));
                return p;
            }
        }
        if (groupInfo != null && !groupInfo.b.isEmpty()) {
            String str = groupInfo.a;
            List<UserInfo> list = groupInfo.b;
            ArrayList arrayList = new ArrayList(list.size());
            for (UserInfo userInfo : list) {
                String str2 = userInfo.a;
                if (!userInfo.d) {
                    arrayList.add(rxn.b(str2));
                }
            }
            Optional or = optional.or(new uea(this, 12));
            ruu a = ruv.a();
            a.s(xhvVar);
            a.j(arrayList);
            a.d(or);
            a.g(i);
            a.o(j);
            a.c = Optional.ofNullable(str);
            a.e(z);
            a.p(i2);
            a.f(true);
            a.m(Optional.ofNullable(groupInfo.c));
            a.k(Optional.ofNullable(groupInfo.d));
            a.n(or.map(new vmd(13)));
            Optional map = or.map(new vmd(13));
            adae adaeVar = (adae) this.n.b();
            adaeVar.getClass();
            Optional map2 = map.map(new viu(adaeVar, 14));
            adji adjiVar = (adji) this.V.b();
            adjiVar.getClass();
            Optional map3 = map2.flatMap(new viu(adjiVar, 15)).map(new vmd(14));
            ryg rygVar = (ryg) this.h.b();
            rygVar.getClass();
            a.a = Optional.of(((qwm) map3.map(new viu(rygVar, 16)).orElseGet(new uea(this, 13))).g());
            return ((rtz) this.G.b()).i(a.a()).a;
        }
        ((alvg) ((alvg) r.i()).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getOrCreateGroupConversationId", 716, "RcsUtilsImpl.java")).q("GroupInfo is empty.");
        return ruy.a;
    }

    @Override // defpackage.vqu
    public final void S(Bundle bundle) {
        Intent intent = new Intent(RcsIntents.ACTION_PROVISIONING_EVENT);
        intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key", 100);
        intent.putExtra("com.google.android.ims.provisioning.engine.provisioning_event_bundle_key", bundle);
        xzb.d("Bugle", "Sending ProvisioningEvent %s, %s", adjk.b(100), yyb.bh(bundle.toString()));
        intent.putExtra("pending_intent", PendingIntent.getBroadcast(this.t, 0, intent, 201326592));
        adwi.c(this.t, intent);
        this.t.sendBroadcast(intent);
    }

    @Override // defpackage.vqu
    public final int T() {
        xzb.c("BugleRcs", "Getting the IM tech from RcsConfigurationProvider");
        Optional l = ((adje) this.l.b()).l();
        if (l.isEmpty()) {
            xzb.n("BugleRcs", "Unable to retrieve the RCS Config from RcsConfigurationProvider for getting the IM tech.");
        }
        if (l.isEmpty()) {
            return 1;
        }
        int i = ((Configuration) l.get()).mInstantMessageConfiguration.mMessageTech;
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return 1;
        }
        return 3;
    }

    @Override // defpackage.vqu
    public final gqg U(MessageCoreData messageCoreData) {
        gqg gqgVar = new gqg();
        Iterator it = messageCoreData.W().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (messagePartCoreData.bd()) {
                ((Vector) gqgVar.a).clear();
                gs gsVar = new gs();
                String ad = messagePartCoreData.ad();
                String U = messagePartCoreData.U();
                if (ad != null) {
                    gsVar.i(ad.getBytes(StandardCharsets.UTF_8));
                }
                if (U != null) {
                    gsVar.h(U.getBytes(StandardCharsets.UTF_8));
                }
                gsVar.k("attachment".getBytes(StandardCharsets.UTF_8));
                gsVar.d(106);
                gqgVar.l(gsVar);
            } else {
                byte[] bArr = null;
                if (!messagePartCoreData.aV()) {
                    gs gsVar2 = new gs();
                    String am = messageCoreData.am();
                    if (am != null) {
                        bArr = am.getBytes();
                    }
                    gsVar2.i(bArr);
                    gsVar2.h("text/plain".getBytes());
                    gsVar2.k("body".getBytes());
                    gqgVar.l(gsVar2);
                } else if (messagePartCoreData.bp()) {
                    gs gsVar3 = new gs();
                    String au = messageCoreData.au();
                    if (au != null) {
                        bArr = au.getBytes();
                    }
                    gsVar3.i(bArr);
                    gsVar3.h("text/plain".getBytes());
                    gsVar3.k("body".getBytes());
                    gqgVar.l(gsVar3);
                }
            }
        }
        return gqgVar;
    }

    public final vqt V(ConversationIdType conversationIdType) {
        if (!I(conversationIdType)) {
            return vqt.NONE;
        }
        return vqt.MANUAL;
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.CharSequence, java.lang.Object] */
    public final xaz W(xhv xhvVar, String str, String str2) {
        String str3;
        Object obj;
        Object R;
        Object k;
        xyl.h();
        if (str != null && ((vqq) this.T.b()).d(str)) {
            String ag = albo.ag(((yst) this.D.b()).c(str));
            int length = ag.length();
            int i = length - 15;
            int i2 = length - 16;
            int lastIndexOf = ag.lastIndexOf(31, i2);
            int lastIndexOf2 = ag.lastIndexOf(31, lastIndexOf - 1);
            if (lastIndexOf == -1) {
                lastIndexOf = ag.lastIndexOf(45, i2);
                lastIndexOf2 = ag.lastIndexOf(45, lastIndexOf - 1);
            }
            return xaz.a(xhvVar, ad(str2), URLDecoder.decode(ag.substring(0, lastIndexOf2)), ag.substring(lastIndexOf2 + 1, lastIndexOf), ag.substring(lastIndexOf + 1, i));
        }
        if (str != null && ((vqq) this.T.b()).c(str)) {
            List ad = ad(str2);
            wyj e2 = ((vqq) this.T.b()).e(str);
            if (e2 != null) {
                if (TextUtils.isEmpty(e2.a)) {
                    R = ((yyt) this.Q.b()).R();
                } else {
                    R = e2.a;
                }
                if (TextUtils.isEmpty(e2.c)) {
                    k = uvl.k();
                } else {
                    k = e2.c;
                }
                obj = e2.b;
            } else {
                String c2 = ((yst) this.D.b()).c(str);
                xyl.c(String.format(Locale.US, "The RBM bot thread data in Telephony is invalid: encoded = %s, decoded = %s", yyb.bh(str), yyb.bh(c2)));
                Iterator it = ad.iterator();
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
                    if (true != TextUtils.isEmpty(c2)) {
                        str = c2;
                    }
                } else {
                    str = str3;
                }
                obj = str;
                R = ((yyt) this.Q.b()).R();
                k = uvl.k();
            }
            String str4 = (String) obj;
            wyj wyjVar = new wyj(str4, (String) R, (String) k);
            obj.getClass();
            return xaz.c(xhvVar, Collections.singletonList(((msk) this.k.b()).n(str4)), wyjVar);
        }
        return ((wzs) this.K.b()).v(xhvVar, str2);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [msh, java.lang.Object] */
    public final String X(Optional optional) {
        String m;
        Optional of = Optional.of(((msk) this.k.b()).h((msh) optional.get(), (String) ((msh) optional.get()).c().orElse("")));
        if (((Boolean) new mst(17).get()).booleanValue()) {
            m = ((qei) of.get().e().get()).d;
        } else {
            m = of.get().m();
        }
        return albo.ag(m);
    }

    @Override // defpackage.utv
    public final void a() {
        u();
    }

    @Override // defpackage.vgy
    public final void c(String str) {
        xzb.d("BugleRcs", "Tachyon Anonymous Device ID received: %s", str);
        xzb.d("BugleRcs", "Send Tachyon Anonymous Device ID to RCS process: %s", str);
        Intent intent = new Intent(RcsIntents.ACTION_TACHYON_ANONYMOUS_DEVICE_ID);
        adwi.c(this.t, intent);
        adtw.c(this.t, intent);
        intent.putExtra(RcsIntents.EXTRA_TACHYON_ANONYMOUS_DEVICE_ID, str);
        this.t.sendBroadcast(intent);
    }

    @Override // defpackage.vqu
    public final int d() {
        int d2 = ((ykw) this.w.b()).d(this.t.getString(R.string.rcs_default_sharing_method_key), -1);
        int Y = Y(d2);
        if (d2 != -1) {
            xzb.d("BugleRcs", "obtained sharingMethod from buglePrefs: %d", Integer.valueOf(Y));
            return Y;
        }
        if (((vrn) ((xyt) this.J.b()).a()).d() == amwt.AVAILABLE) {
            d2 = ((RcsProfileService) this.z.b()).getDefaultSharingMethod();
            xzb.d("BugleRcs", "obtained sharingMethod from profileService: %d", Integer.valueOf(d2));
        }
        return Y(d2);
    }

    @Override // defpackage.vqu
    public final int e(boolean z) {
        int d2;
        if (z) {
            d2 = ((ylm) this.W.b()).b();
        } else {
            d2 = ((ylm) this.W.b()).d();
        }
        if (d2 == 0) {
            return Integer.MAX_VALUE;
        }
        return d2;
    }

    @Override // defpackage.vqu
    public final int f(Optional optional) {
        if (optional.isEmpty()) {
            ((alvg) ((alvg) r.i()).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "getRcsConversationParticipantLimit", 964, "RcsUtilsImpl.java")).q("#getRcsConversationParticipantLimit: selfChatEndpoint is empty");
        }
        return ((Integer) optional.map(new viu(this, 11)).orElse(Integer.MAX_VALUE)).intValue();
    }

    @Override // defpackage.utv
    public final boolean fN() {
        return true;
    }

    @Override // defpackage.vqu
    public final qwm g() {
        return ((ryg) this.h.b()).f(((yyt) this.Q.b()).Q(vqk.p));
    }

    @Override // defpackage.vqu
    public final vqt h() {
        if (!ae()) {
            return vqt.NONE;
        }
        return vqt.MANUAL;
    }

    @Override // defpackage.vqu
    public final vqt i(rve rveVar) {
        ConversationIdType conversationIdType = ruy.a;
        MessageCoreData r2 = ((rwd) this.H.b()).r(rveVar);
        if (r2 != null) {
            conversationIdType = r2.z();
        }
        if (conversationIdType.b()) {
            if (!ae()) {
                return vqt.NONE;
            }
            return vqt.MANUAL;
        }
        return V(conversationIdType);
    }

    @Override // defpackage.vqu
    @Deprecated
    public final xaz j(long j, String str, String str2) {
        return W(xhv.b(j), str, str2);
    }

    @Override // defpackage.vqu
    public final acun k() {
        aozy createBuilder = acun.a.createBuilder();
        String ag = albo.ag(((ykw) this.w.b()).f("rcs_terms_and_conditions_title", null));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        acun acunVar = (acun) createBuilder.b;
        acunVar.b |= 2;
        acunVar.d = ag;
        String ag2 = albo.ag(((ykw) this.w.b()).f("rcs_terms_and_conditions_message", null));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        acun acunVar2 = (acun) createBuilder.b;
        acunVar2.b |= 1;
        acunVar2.c = ag2;
        acun acunVar3 = (acun) createBuilder.s();
        if (acunVar3.c.isEmpty()) {
            return null;
        }
        return acunVar3;
    }

    @Override // defpackage.vqu
    @Deprecated
    public final akul l(MessageCoreData messageCoreData, msh mshVar) {
        xyl.h();
        ((mbl) this.f.b()).c("Bugle.Rcs.Chat.Message.Revoke.Send.Counts");
        xzb.k("BugleAction", "Revocation send attempt for message id %s, rcs id %s", messageCoreData.B(), messageCoreData.E());
        rve E = messageCoreData.E();
        aozy createBuilder = qgd.a.createBuilder();
        String f = E.f();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgd qgdVar = (qgd) createBuilder.b;
        qgdVar.b |= 1;
        qgdVar.c = f;
        qgd qgdVar2 = (qgd) createBuilder.s();
        if (!mshVar.e().isEmpty()) {
            aozy createBuilder2 = qgb.a.createBuilder();
            String f2 = E.f();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgb qgbVar = (qgb) createBuilder2.b;
            qgbVar.b = 2 | qgbVar.b;
            qgbVar.d = f2;
            String a = messageCoreData.z().a();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgb qgbVar2 = (qgb) createBuilder2.b;
            a.getClass();
            qgbVar2.b |= 4;
            qgbVar2.e = a;
            qei qeiVar = (qei) mshVar.e().get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgb qgbVar3 = (qgb) createBuilder2.b;
            qgbVar3.c = qeiVar;
            qgbVar3.b |= 1;
            aozb byteString = qgdVar2.toByteString();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgb qgbVar4 = (qgb) createBuilder2.b;
            qgbVar4.b |= 8;
            qgbVar4.f = byteString;
            qei qeiVar2 = (qei) messageCoreData.ac().flatMap(new vmd(11)).orElseThrow(new vtc(1));
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgb qgbVar5 = (qgb) createBuilder2.b;
            qeiVar2.getClass();
            qgbVar5.g = qeiVar2;
            qgbVar5.b |= 16;
            return ((pss) this.u.b()).d((qgb) createBuilder2.s()).h(new vqv(this, E, 0), this.O);
        }
        throw new IllegalStateException("RCS identifier does not exist");
    }

    @Override // defpackage.vqu
    public final Optional m(msh mshVar) {
        if (mshVar.C()) {
            xzb.l("Bugle", "no capabilities because it is a short code");
            return Optional.empty();
        }
        if (mshVar.g() == null) {
            xzb.n("Bugle", "Remote user id is null.");
            return Optional.empty();
        }
        try {
            return ((psz) this.A.b()).f(mshVar);
        } catch (psx e2) {
            xzb.p("Bugle", e2, "exception getting cached capabilities");
            return Optional.empty();
        }
    }

    @Override // defpackage.vqu
    public final Optional n(ParticipantsTable.BindData bindData) {
        return m(((msk) this.k.b()).q(bindData));
    }

    @Override // defpackage.vqu
    public final Optional o() {
        return ab().filter(new vmc(9)).map(new viu(this, 13));
    }

    @Override // defpackage.vqu
    public final synchronized Optional p() {
        return Optional.ofNullable(((ykw) this.w.b()).s());
    }

    @Override // defpackage.vqu
    public final String q(String str, String str2) {
        String str3;
        String k = ((vbu) this.R.b()).k();
        if (str != null) {
            str3 = URLEncoder.encode(str);
        } else {
            str3 = "";
        }
        String str4 = str3 + "\u001f" + k + "\u001f" + str2 + "@rcs.google.com";
        ((alvg) ((alvg) r.f()).h("com/google/android/apps/messaging/shared/rcs/RcsUtilsImpl", "buildGroupBackupContactNameHelper", 1123, "RcsUtilsImpl.java")).t("Created group backup contact name %s", yyb.bh(str4));
        return ((yst) this.D.b()).d(str4);
    }

    @Override // defpackage.vqu
    public final String r(ConversationIdType conversationIdType) {
        if (!((Boolean) e.e()).booleanValue()) {
            return ac(conversationIdType);
        }
        ahqq d2 = this.S.d();
        try {
            return ac(conversationIdType);
        } finally {
            this.S.f(d2, new ahka("RCS.GetContributionId"), null, ahqp.SUCCESS);
        }
    }

    @Override // defpackage.vqu
    public final String s() {
        return "empty";
    }

    @Override // defpackage.vqu
    @Deprecated
    public final String t() {
        xyl.h();
        Optional ab = ab();
        if (!ab.isEmpty() && !((msh) ab.get()).e().isEmpty()) {
            return X(ab);
        }
        return "";
    }

    @Override // defpackage.vqu
    public final void u() {
        Bundle bundle = new Bundle();
        String f = ((ykw) this.w.b()).f(this.t.getString(R.string.rcs_acs_url_override_key), null);
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_default_sms_app", ((yjr) this.E.b()).y());
        bundle.putLong("com.google.android.ims.provisioning.engine.bugle_version", yuv.a(this.t).b);
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_has_required_permission", ((yjf) this.v.b()).h());
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_enabled_rcs_from_preference", ((wih) this.U.b()).o());
        if (f != null) {
            bundle.putString("com.google.android.ims.provisioning.engine.bugle_overridden_acs_url", f);
        }
        S(bundle);
    }

    @Override // defpackage.vqu
    public final void v() {
        Intent intent = new Intent(RcsIntents.ACTION_DEBUG_OPTION_FORCE_CLIENT_TO_UNREGISTER);
        adwi.c(this.t, intent);
        adtw.c(this.t, intent);
        this.t.sendBroadcast(intent);
    }

    @Override // defpackage.vqu
    public final void w() {
        Intent intent = new Intent(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD);
        adwi.c(this.t, intent);
        adtw.c(this.t, intent);
        this.t.sendBroadcast(intent);
    }

    @Override // defpackage.vqu
    public final void x(apfw apfwVar) {
        Intent intent = new Intent(RcsIntents.ACTION_RCS_SELF_SERVICE_MESSAGE);
        adwi.c(this.t, intent);
        adtw.c(this.t, intent);
        intent.putExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE, apfwVar.toByteArray());
        if (!apfwVar.c.isEmpty()) {
            intent.putExtra(RcsIntents.EXTRA_RCS_SELF_SERVICE_MESSAGE_ID, apfwVar.c);
        }
        this.t.sendBroadcast(intent);
    }

    @Override // defpackage.vqu
    public final void y(long j) {
        if (xzb.q("Bugle", 2)) {
            xzb.l("Bugle", a.ck(j, "Deleting file transfer with session id "));
        }
        xyl.h();
        xyl.e(j, -1L);
        try {
            ((FileTransferService) this.y.b()).deleteFileTransfer(j);
        } catch (ajny e2) {
            xzb.i("Bugle", e2, a.ck(j, "Exception removing file transfer with session id "));
        }
    }

    @Override // defpackage.vqu
    public final void z() {
        SharedPreferences.Editor edit = this.t.getSharedPreferences(((ykw) this.w.b()).a(), 0).edit();
        edit.remove("rcs_terms_and_conditions_title");
        edit.remove("rcs_terms_and_conditions_message");
        edit.apply();
    }
}
