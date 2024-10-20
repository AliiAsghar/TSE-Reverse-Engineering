package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUiState;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;
import com.google.android.apps.messaging.main.MainActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lex extends ley implements kuz {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/main/MainActivityPeer");
    public final xze A;
    public kvw B;
    public ConversationActivityUiState C;
    public ConversationActivityUsageStatisticsState D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ibp L;
    public boolean M;
    public MessageCoreData N;
    public int O;
    public final aqws P;
    public lrf Q;
    private final armf S;
    private final armf T;
    private final armf U;
    private final armf V;
    private final armf W;
    private final armf X;
    private final armf Y;
    private final armf Z;
    private final arml aA;
    private final armf aa;
    private final armf ab;
    private final armf ac;
    private final armf ad;
    private final armf ae;
    private final armf af;
    private final armf ag;
    private final Optional ah;
    private final armf ai;
    private final armf aj;
    private final armf ak;
    private final arwe al;
    private final armf am;
    private final armf an;
    private final armf ao;
    private final armf ap;
    private final armf aq;
    private final armf ar;
    private final armf as;
    private final arml at;
    private final arml au;
    private final arml av;
    private Toolbar aw;
    private boolean ax;
    private rg ay;
    private rg az;
    public final MainActivity b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final aksr g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final Optional k;
    public final armf l;
    public final ibb m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final armf s;
    public final armf t;
    public final armf u;
    public final Optional v;
    public final armf w;
    public final armf x;
    public final armf y;
    public final armf z;

    public lex(MainActivity mainActivity, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, aksr aksrVar, armf armfVar15, aqws aqwsVar, ipq ipqVar, armf armfVar16, armf armfVar17, Optional optional, armf armfVar18, armf armfVar19, ibb ibbVar, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, Optional optional2, armf armfVar35, armf armfVar36, Optional optional3, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40, arwe arweVar, @oqd armf armfVar41, armf armfVar42, armf armfVar43, armf armfVar44, armf armfVar45, armf armfVar46, armf armfVar47, armf armfVar48, armf armfVar49, armf armfVar50) {
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
        armfVar12.getClass();
        armfVar13.getClass();
        armfVar14.getClass();
        aksrVar.getClass();
        armfVar15.getClass();
        aqwsVar.getClass();
        ipqVar.getClass();
        armfVar16.getClass();
        armfVar17.getClass();
        armfVar18.getClass();
        armfVar19.getClass();
        ibbVar.getClass();
        armfVar20.getClass();
        armfVar21.getClass();
        armfVar22.getClass();
        armfVar23.getClass();
        armfVar24.getClass();
        armfVar25.getClass();
        armfVar26.getClass();
        armfVar27.getClass();
        armfVar28.getClass();
        armfVar29.getClass();
        armfVar31.getClass();
        armfVar32.getClass();
        armfVar33.getClass();
        armfVar34.getClass();
        armfVar35.getClass();
        armfVar36.getClass();
        armfVar37.getClass();
        armfVar38.getClass();
        armfVar39.getClass();
        armfVar40.getClass();
        arweVar.getClass();
        armfVar41.getClass();
        armfVar42.getClass();
        armfVar43.getClass();
        armfVar45.getClass();
        armfVar48.getClass();
        armfVar49.getClass();
        this.b = mainActivity;
        this.S = armfVar;
        this.T = armfVar2;
        this.U = armfVar3;
        this.c = armfVar4;
        this.d = armfVar5;
        this.V = armfVar6;
        this.e = armfVar7;
        this.W = armfVar8;
        this.f = armfVar9;
        this.X = armfVar11;
        this.Y = armfVar12;
        this.Z = armfVar13;
        this.aa = armfVar14;
        this.g = aksrVar;
        this.h = armfVar15;
        this.P = aqwsVar;
        this.i = armfVar16;
        this.j = armfVar17;
        this.k = optional;
        this.ab = armfVar18;
        this.l = armfVar19;
        this.m = ibbVar;
        this.n = armfVar24;
        this.o = armfVar25;
        this.ac = armfVar26;
        this.ad = armfVar27;
        this.p = armfVar28;
        this.q = armfVar29;
        this.ae = armfVar30;
        this.r = armfVar31;
        this.s = armfVar32;
        this.af = armfVar33;
        this.ag = armfVar34;
        this.ah = optional2;
        this.t = armfVar35;
        this.u = armfVar36;
        this.v = optional3;
        this.ai = armfVar37;
        this.aj = armfVar38;
        this.w = armfVar39;
        this.ak = armfVar40;
        this.al = arweVar;
        this.am = armfVar41;
        this.x = armfVar42;
        this.an = armfVar43;
        this.ao = armfVar44;
        this.y = armfVar45;
        this.ap = armfVar46;
        this.aq = armfVar47;
        this.ar = armfVar48;
        this.z = armfVar49;
        this.as = armfVar50;
        this.at = armd.a(new kjm(this, 10));
        this.A = xze.g("Bugle", "MainActivity");
        this.au = armd.a(new kjm(this, 9));
        this.av = armd.a(new kjm(this, 7));
        akrh e = aktp.e("MainActivityPeer#init");
        try {
            ahqe.a.c(ahmz.b());
            if (this.v.isEmpty()) {
                if (kpt.a()) {
                    ajxd ajxdVar = (ajxd) this.l.b();
                    ajyt b = ajyu.b(this.b);
                    ibb ibbVar2 = this.m;
                    akrh f = aktp.f("DefaultAccountPrefetchedSelector::prefetchDefaultAccount", akrk.a);
                    try {
                        ListenableFuture d = ((akag) ibbVar2.c.a).d();
                        f.b(d);
                        armd.i(f, null);
                        ibbVar2.b = akul.g(d);
                        b.b(ibb.class);
                        ajxdVar.c(new akaf(this.m.a, 0));
                        if (kpt.b() || Q()) {
                            ((Optional) ((apxx) this.r).a).ifPresent(new ktm(new kju(ajxdVar, 6), 19));
                        }
                        ajxdVar.c((ajyk) armfVar20.b());
                        if (!((Boolean) ((utz) yig.R.get()).e()).booleanValue()) {
                            ajxdVar.c((ajyk) armfVar22.b());
                        }
                        if (ymd.b()) {
                            ajxdVar.c((ajyk) armfVar23.b());
                        }
                        ajxdVar.c(new let(this));
                        b.b(akaa.class);
                        if (uyh.a()) {
                            ajxdVar.c((ajyk) armfVar21.b());
                        }
                        ajxdVar.d(b.a());
                        if (((Optional) ((apxx) this.ai).a).isPresent()) {
                            ((kqc) ((Optional) ((apxx) this.ai).a).get()).a();
                        }
                    } finally {
                    }
                } else {
                    ajxd ajxdVar2 = (ajxd) this.l.b();
                    ajyt b2 = ajyu.b(this.b);
                    b2.b(ibc.class);
                    ajxdVar2.c((ajyk) armfVar20.b());
                    ajxdVar2.c(new let(this));
                    ajxdVar2.d(b2.a());
                    this.ah.ifPresent(new ktm(jyp.o, 20));
                }
            }
            armd.i(e, null);
            this.aA = armd.a(new kjm(this, 8));
        } finally {
        }
    }

    private final cg W() {
        ixo o = o();
        if (o != null) {
            return o.b();
        }
        return null;
    }

    private final da X() {
        ixo o = o();
        if (o != null) {
            da c = o.c();
            c.getClass();
            return c;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final kur Y() {
        akkh akkhVar;
        Object obj;
        eoz e = this.b.a().e("conversation_list_root_fragment_tag");
        if (true != (e instanceof cg)) {
            e = null;
        }
        if (e instanceof akkh) {
            akkhVar = (akkh) e;
        } else {
            akkhVar = null;
        }
        if (akkhVar != null) {
            obj = akkhVar.E();
        } else {
            obj = null;
        }
        if (!(obj instanceof kur)) {
            return null;
        }
        return (kur) obj;
    }

    private final lez Z() {
        return (lez) this.at.a();
    }

    private final void aa(cg cgVar) {
        bd bdVar = new bd(this.b.a());
        bdVar.v(R.id.conversation_root_container, cgVar, "conversation_root_fragment_tag");
        bdVar.b();
    }

    private final void ab() {
        this.b.getIntent().removeExtra("via_start_chat_intent");
        this.b.getIntent().removeExtra("render_add_recipient_button");
        this.b.getIntent().removeExtra("delete_empty_conversation_on_back");
    }

    private final void ac() {
        String str;
        boolean a2 = ((obh) this.af.b()).a();
        this.k.isPresent();
        boolean z = Z().a;
        if (true != ((Boolean) qrl.a.e()).booleanValue()) {
            str = "";
        } else {
            str = "\nFully disabled by conv2 override kill switch";
        }
        this.A.o("\n        Conversation 2 from MainActivity disabled.\n        Flag: " + a2 + ". \n        Entry point present: true. \n        Conversation 1 override: " + z + "\n        " + str);
    }

    private final void ad() {
        ixo o = o();
        if (o != null) {
            ajwt e = o.e();
            e.getClass();
            v(e);
            return;
        }
        throw new IllegalArgumentException("ConversationRootFragment must be attached already");
    }

    private final boolean ae() {
        return ((Boolean) this.aA.a()).booleanValue();
    }

    private final ktk af() {
        return (ktk) this.av.a();
    }

    public final void A(boolean z, boolean z2, boolean z3) {
        ConversationActivityUsageStatisticsState m = m();
        if (m.f == null && !d().c()) {
            m.g = z;
            m.f = Boolean.valueOf(z2);
            m.j = z3;
            this.I = true;
            z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8 A[Catch: all -> 0x02bf, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x02bf, blocks: (B:3:0x000c, B:6:0x002a, B:10:0x0037, B:11:0x0044, B:15:0x0051, B:18:0x009b, B:20:0x00b0, B:22:0x00bc, B:26:0x00d8, B:29:0x00f8, B:34:0x0151, B:44:0x016d, B:45:0x0170, B:46:0x0171, B:48:0x017a, B:50:0x0188, B:52:0x0191, B:53:0x0197, B:59:0x01df, B:61:0x01ec, B:62:0x0235, B:65:0x0269, B:68:0x0294, B:79:0x02a0, B:80:0x02a3, B:89:0x02a9, B:90:0x02ac, B:100:0x02b2, B:101:0x02b5, B:102:0x006b, B:104:0x0079, B:106:0x0087, B:107:0x0093, B:116:0x02bb, B:117:0x02be, B:96:0x02af, B:64:0x023b, B:13:0x004a, B:85:0x02a6, B:31:0x00fe, B:33:0x012a, B:35:0x0155, B:36:0x0167, B:112:0x02b8, B:67:0x0291, B:40:0x016a, B:55:0x01cf, B:58:0x01da, B:75:0x029d), top: B:2:0x000c, inners: #0, #2, #3, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ec A[Catch: all -> 0x02bf, TryCatch #11 {all -> 0x02bf, blocks: (B:3:0x000c, B:6:0x002a, B:10:0x0037, B:11:0x0044, B:15:0x0051, B:18:0x009b, B:20:0x00b0, B:22:0x00bc, B:26:0x00d8, B:29:0x00f8, B:34:0x0151, B:44:0x016d, B:45:0x0170, B:46:0x0171, B:48:0x017a, B:50:0x0188, B:52:0x0191, B:53:0x0197, B:59:0x01df, B:61:0x01ec, B:62:0x0235, B:65:0x0269, B:68:0x0294, B:79:0x02a0, B:80:0x02a3, B:89:0x02a9, B:90:0x02ac, B:100:0x02b2, B:101:0x02b5, B:102:0x006b, B:104:0x0079, B:106:0x0087, B:107:0x0093, B:116:0x02bb, B:117:0x02be, B:96:0x02af, B:64:0x023b, B:13:0x004a, B:85:0x02a6, B:31:0x00fe, B:33:0x012a, B:35:0x0155, B:36:0x0167, B:112:0x02b8, B:67:0x0291, B:40:0x016a, B:55:0x01cf, B:58:0x01da, B:75:0x029d), top: B:2:0x000c, inners: #0, #2, #3, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d7  */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [armf, java.lang.Object] */
    @Override // defpackage.ley
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lex.B(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        this.v.isPresent();
        ab();
        K();
        this.b.getIntent().replaceExtras((Bundle) null);
        alog alogVar = qor.a;
        alogVar.getClass();
        alur it = alogVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.b.getIntent().hasExtra(str)) {
                this.b.getIntent().removeExtra(str);
            }
        }
        L();
    }

    public final void D() {
        this.v.isPresent();
        ixd n = n();
        P();
        if (d().c() && c() != null) {
            ijp.e((ijp) this.ae.b(), 10, 0, d().f(this.O), 10);
        }
        if (this.J) {
            this.O = 2;
        }
        if (n != null) {
            n.M();
            if (((Boolean) n.H(new isa(16), new isa(17))).booleanValue()) {
                return;
            }
        }
        C();
    }

    public final void E(boolean z, boolean z2) {
        this.v.isPresent();
        ixd n = n();
        boolean z3 = false;
        if (n != null && n.bj()) {
            z3 = true;
        }
        A(z, z2, z3);
    }

    public final void F() {
        this.v.isPresent();
        albo.T(!ConversationActivityUiState.a.contains(Integer.valueOf(d().b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0363, code lost:
    
        if (r14 != false) goto L135;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(android.content.Intent r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lex.G(android.content.Intent, boolean):void");
    }

    public final void H(Intent intent, Bundle bundle, boolean z) {
        ConversationActivityUiState conversationActivityUiState;
        this.A.o("isBugleAccountEnabled: " + kpt.a());
        if (bundle != null) {
            ConversationActivityUiState conversationActivityUiState2 = (ConversationActivityUiState) bundle.getParcelable("uistate");
            if (conversationActivityUiState2 != null) {
                this.C = conversationActivityUiState2;
            }
            ConversationActivityUsageStatisticsState conversationActivityUsageStatisticsState = (ConversationActivityUsageStatisticsState) bundle.getParcelable("usstate");
            if (conversationActivityUsageStatisticsState != null) {
                this.D = conversationActivityUsageStatisticsState;
            }
            this.I = bundle.getBoolean("rcscapabilityupdate");
            this.J = bundle.getBoolean("shouldclearactivitystack");
        }
        int i = 1;
        if (z || this.C == null) {
            ConversationId s = s(intent);
            int intExtra = intent.getIntExtra("conversation_state", 1);
            if (s != null) {
                conversationActivityUiState = new ConversationActivityUiState(s, intExtra);
            } else if (intExtra == 2) {
                conversationActivityUiState = new ConversationActivityUiState(2);
            } else {
                conversationActivityUiState = new ConversationActivityUiState(0);
            }
            this.C = conversationActivityUiState;
        }
        this.P.a = d().b();
        if (z || this.D == null) {
            amfe amfeVar = amfe.CONVERSATION_FROM_LIST;
            if (d().b()) {
                amfeVar = amfe.CONVERSATION_FROM_BUBBLE;
            }
            this.D = new ConversationActivityUsageStatisticsState(amfeVar);
        }
        boolean booleanExtra = intent.getBooleanExtra("should_launch_home_on_back", false);
        boolean booleanExtra2 = intent.getBooleanExtra("via_share_intent", false);
        if (!booleanExtra && !booleanExtra2) {
            if (intent.getBooleanExtra("via_start_chat_intent", false)) {
                m().a = amfe.CONVERSATION_FROM_COMPOSE;
                i = 4;
            }
        } else if (intent.hasExtra("FOCUS_ON_FIELD")) {
            i = 3;
        } else {
            i = 2;
        }
        this.O = i;
        this.E = false;
    }

    public final void I() {
        this.v.isPresent();
        e().ifPresent(new leq(jyp.r, 0));
        this.R.K();
    }

    public final void J() {
        if (ae() && Z().a) {
            Z().a = false;
            ad();
        }
    }

    public final void K() {
        this.v.isPresent();
        d().e = false;
    }

    public final void L() {
        if (!this.b.isTaskRoot()) {
            this.b.finishAfterTransition();
        } else {
            d().b = 0;
            U();
        }
    }

    public final void M() {
        this.v.isPresent();
        this.ax = true;
    }

    public final void N(Toolbar toolbar) {
        this.v.isPresent();
        if (!d().e() && !T() && !d().c()) {
            this.R.L(toolbar);
            if (toolbar != null) {
                toolbar.setVisibility(0);
                return;
            }
            return;
        }
        if (toolbar != null) {
            toolbar.setVisibility(8);
        } else {
            toolbar = null;
        }
        this.aw = toolbar;
    }

    public final void O() {
        rg rgVar = this.ay;
        if (rgVar != null) {
            boolean z = true;
            if (!d().c() && !d().d()) {
                z = false;
            }
            rgVar.h(z);
        }
    }

    public final void P() {
        ixd n = n();
        if (n != null) {
            n.aR();
        }
    }

    public final boolean Q() {
        if (((Boolean) this.am.b()).booleanValue() && kpt.a()) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        this.v.isPresent();
        return d().e();
    }

    public final boolean S() {
        this.v.isPresent();
        return d().e;
    }

    public final boolean T() {
        if (ae() && !Z().a) {
            return true;
        }
        return false;
    }

    public final void U() {
        Toolbar toolbar;
        cg cgVar;
        jwl jwlVar;
        MessageCoreData messageCoreData;
        MessageCoreData E;
        ixo o = o();
        if (o != null) {
            jjs jjsVar = new jjs(o, 15);
            kju kjuVar = new kju(o, 9);
            kjs kjsVar = new kjs(o, this, 2);
            if (!this.E && !this.G) {
                Intent intent = this.b.getIntent();
                ConversationId conversationId = d().c;
                bd bdVar = new bd(X());
                boolean d = d().d();
                boolean c = d().c();
                cg W = W();
                ixd n = n();
                cg b = b();
                if (W != null && !d) {
                    if (n != null && c) {
                        n.cg = true;
                        if (d().b == 2) {
                            E = null;
                        } else {
                            E = n.E();
                        }
                        this.N = E;
                    }
                    bdVar.n(W);
                }
                if (!T() && !d().e() && this.b.j() == null) {
                    N(this.aw);
                } else if (d().c() && this.b.j() != null && (toolbar = this.aw) != null) {
                    toolbar.setVisibility(8);
                }
                if (d) {
                    lrf lrfVar = this.Q;
                    if (lrfVar == null) {
                        lrfVar = new lrf(intent.getExtras());
                    }
                    lrf lrfVar2 = lrfVar;
                    this.Q = null;
                    if (conversationId != null) {
                        kvw kvwVar = this.B;
                        if (kvwVar != null) {
                            kvwVar.k().Q(conversationId);
                        }
                        intent.getClass();
                        MessageCoreData t = t(intent);
                        if (t == null) {
                            messageCoreData = this.N;
                        } else {
                            messageCoreData = t;
                        }
                        if (!c && t != null) {
                            lga.o(intent);
                        }
                        if (intent.getBooleanExtra("open_keyboard", false)) {
                            d().e = true;
                        }
                        cgVar = b;
                        if (T()) {
                            jjsVar.a(bdVar, conversationId, messageCoreData);
                            this.b.U();
                            alvw g = a.g();
                            g.X(alwp.a, "Bugle");
                            ((alvg) g.h("com/google/android/apps/messaging/main/MainActivityPeer", "updateUiStateBase", 1492, "MainActivityPeer.kt")).q("Conversation 2 from MainActivity enabled.");
                        } else if (((orj) this.ar.b()).a() && (conversationId instanceof EmergencySosConversationId)) {
                            ac();
                            alvw h = a.h();
                            h.X(alwp.a, "Bugle");
                            alvg alvgVar = (alvg) h;
                            alvgVar.X(ydl.p, ((EmergencySosConversationId) conversationId).a);
                            ((alvg) alvgVar.h("com/google/android/apps/messaging/main/MainActivityPeer", "updateUiStateBase", 1503, "MainActivityPeer.kt")).q("EmergencySosConversation is not supported as Conversation 2 flag is disabled, navigate to home screen.");
                            d().b = 0;
                        } else {
                            ac();
                            if (n != null) {
                                ConversationIdType u = u(conversationId);
                                u.getClass();
                                V(u, n, lrfVar2, messageCoreData);
                                n.bq();
                                if (intent.getBooleanExtra("scroll_to_bottom", false)) {
                                    n.bX.r();
                                    this.b.getIntent().removeExtra("scroll_to_bottom");
                                }
                            } else {
                                cg cgVar2 = (cg) jjsVar.a(bdVar, conversationId, messageCoreData);
                                cgVar2.N().c(new lev(this, conversationId, cgVar2, lrfVar2, messageCoreData));
                                cgVar2.N().c(new lew(this, cgVar2));
                            }
                        }
                        Intent intent2 = this.b.getIntent();
                        intent2.getClass();
                        lga.o(intent2);
                        this.N = null;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    cgVar = b;
                }
                this.v.isPresent();
                a().getClass();
                if (d().e()) {
                    if (lga.q(this.b, this.P.a)) {
                        kjuVar.a(bdVar);
                    }
                    g();
                }
                ijf c2 = c();
                if (c) {
                    if (c2 == null) {
                        kjsVar.a(bdVar);
                    }
                    ((xzu) this.X.b()).h(this.b);
                    jwlVar = new jwl((Object) this, 15, (short[][][]) null);
                } else {
                    if (c2 != null) {
                        bdVar.n(c2.a());
                        if (n != null) {
                            n.bq();
                        }
                    }
                    jwlVar = new jwl((Object) this, 16, (int[][][]) null);
                }
                bdVar.w(new kut(jwlVar, 7));
                if (!bdVar.h()) {
                    bdVar.b();
                    if (this.ax) {
                        this.ax = false;
                        ixd n2 = n();
                        if (d().d() && n2 != null) {
                            n2.O();
                        }
                    }
                }
                if (!d().e() && !lga.q(this.b, this.P.a)) {
                    if (cgVar != null) {
                        kur Y = Y();
                        Y.getClass();
                        Y.c();
                        this.B = null;
                        if (T()) {
                            int i = ksj.a;
                        }
                    }
                } else {
                    if (cgVar == null) {
                        kur Y2 = Y();
                        Y2.getClass();
                        Y2.b();
                    }
                    kvw p = p();
                    p.getClass();
                    p.aG = this;
                    this.B = p;
                }
                O();
                return;
            }
            this.A.m("skipping ui state update because the activity is stopped or state has already been saved");
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    public final void V(ConversationIdType conversationIdType, ixd ixdVar, lrf lrfVar, MessageCoreData messageCoreData) {
        ixdVar.cB = this;
        qxr qxrVar = (qxr) this.U.b();
        ?? r4 = qxrVar.c;
        ryg rygVar = (ryg) qxrVar.f.b();
        rygVar.getClass();
        xyt xytVar = (xyt) qxrVar.a.b();
        xytVar.getClass();
        ?? r7 = qxrVar.b;
        qya qyaVar = (qya) qxrVar.e.b();
        qyaVar.getClass();
        uie uieVar = (uie) qxrVar.g.b();
        uieVar.getClass();
        rrl rrlVar = new rrl(r4, rygVar, xytVar, r7, qyaVar, uieVar, conversationIdType, lrfVar, qxrVar.d, qxrVar.h);
        if (!ixdVar.ca.g()) {
            alvw d = ixd.a.d();
            d.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) d;
            alvgVar.X(ydl.p, ixdVar.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "setConversationInfo", 4802, "ConversationFragmentPeer.java")).q("ConversationFragment: Setting conversation info");
            ixdVar.bY = messageCoreData;
            ixdVar.ca.c(rrlVar);
            itb itbVar = ixdVar.bX;
            if (itbVar != null) {
                itbVar.x();
            }
            ixdVar.S(new ivh(ixdVar, 1), new ilf(ixdVar, rrlVar, 7));
        } else {
            albo.T(((rrl) ixdVar.ca.a()).c.equals(rrlVar.c));
        }
        ixdVar.bq();
    }

    public final cg a() {
        cg e = this.b.a().e("conversation_root_fragment_tag");
        if (!(e instanceof cg)) {
            return null;
        }
        return e;
    }

    public final cg b() {
        this.v.isPresent();
        kur Y = Y();
        if (Y != null) {
            return Y.a();
        }
        return null;
    }

    public final ijf c() {
        this.v.isPresent();
        ixo o = o();
        if (o != null) {
            return o.d();
        }
        return null;
    }

    public final ConversationActivityUiState d() {
        ConversationActivityUiState conversationActivityUiState = this.C;
        if (conversationActivityUiState != null) {
            return conversationActivityUiState;
        }
        arro.b("uiState");
        return null;
    }

    @Override // defpackage.kuz
    public final Optional e() {
        this.v.isPresent();
        return this.b.R();
    }

    @Override // defpackage.kuz
    public final void f() {
        if (e().isEmpty()) {
            this.A.l("Bypassing dismissActionMode call, since action mode was not started");
            return;
        }
        this.A.l("dismissActionMode");
        this.v.isPresent();
        rg rgVar = this.az;
        int i = 0;
        if (rgVar != null) {
            rgVar.h(false);
        }
        ktk af = af();
        Window window = ((Activity) af.a).getWindow();
        Object obj = af.c;
        if (obj != null) {
            i = ((Integer) obj).intValue();
        }
        window.setStatusBarColor(i);
        af.c = null;
        this.b.S();
    }

    @Override // defpackage.kuz
    public final void g() {
        this.v.isPresent();
        this.b.U();
    }

    @Override // defpackage.kuz
    public final void h() {
        if (!R()) {
            return;
        }
        this.b.V();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, arml] */
    @Override // defpackage.kuz
    public final void i(ActionMode.Callback callback, View view, String str) {
        callback.getClass();
        this.v.isPresent();
        rg rgVar = this.az;
        if (rgVar != null) {
            rgVar.h(true);
        }
        if (callback instanceof aaig) {
            L();
        }
        this.b.W(callback, view, str);
        ktk af = af();
        Window window = ((Activity) af.a).getWindow();
        af.c = Integer.valueOf(window.getStatusBarColor());
        window.setStatusBarColor(((Number) af.b.a()).intValue());
    }

    @Override // defpackage.kuz
    public final void j() {
        this.v.isPresent();
        P();
        Intent intent = this.b.getIntent();
        intent.getClass();
        lga.o(intent);
        if (e().isPresent()) {
            f();
        }
        d().c = null;
        d().b = 2;
        U();
    }

    @Override // defpackage.kuz
    public final /* synthetic */ void k(ConversationId conversationId, lrf lrfVar, boolean z) {
        lga.R(this, conversationId, lrfVar, z);
    }

    @Override // defpackage.kuz
    public final void l(ConversationId conversationId, MessageIdType messageIdType, lrf lrfVar, boolean z) {
        conversationId.getClass();
        this.v.isPresent();
        if (ae()) {
            this.Q = lrfVar;
            this.v.isPresent();
            if (ae() && z && !((obm) this.ak.b()).a()) {
                if (!Z().a) {
                    Z().a = true;
                    ad();
                }
            } else {
                J();
            }
            y(conversationId, messageIdType);
            return;
        }
        J();
        this.Q = lrfVar;
        y(conversationId, messageIdType);
    }

    public final ConversationActivityUsageStatisticsState m() {
        ConversationActivityUsageStatisticsState conversationActivityUsageStatisticsState = this.D;
        if (conversationActivityUsageStatisticsState != null) {
            return conversationActivityUsageStatisticsState;
        }
        arro.b("usageStatisticsState");
        return null;
    }

    public final ixd n() {
        cg cgVar;
        this.v.isPresent();
        if (!T()) {
            ixo o = o();
            if (o != null) {
                cgVar = o.b();
            } else {
                cgVar = null;
            }
            if (((pil) this.ao.b()).a() && o != null && !(o instanceof ixp)) {
                ((alvg) this.A.i().h("com/google/android/apps/messaging/main/MainActivityPeer", "findConversationOneFragmentPeer", 1211, "MainActivityPeer.kt")).t("ConversationFragmentPeer should have been a conversation 1 root. Class was: %s", ahka.b(o.getClass()));
            }
            if (cgVar != null) {
                return ixd.z(cgVar);
            }
        }
        return null;
    }

    public final ixo o() {
        akkh akkhVar;
        Object obj;
        eoz a2 = a();
        if (a2 instanceof akkh) {
            akkhVar = (akkh) a2;
        } else {
            akkhVar = null;
        }
        if (akkhVar != null) {
            obj = akkhVar.E();
        } else {
            obj = null;
        }
        if (!(obj instanceof ixo)) {
            return null;
        }
        return (ixo) obj;
    }

    public final kvw p() {
        this.v.isPresent();
        cg b = b();
        if (b instanceof kux) {
            return ((kux) b).E();
        }
        return null;
    }

    public final lep q() {
        return (lep) this.au.a();
    }

    public final ConversationId r() {
        this.v.isPresent();
        return d().c;
    }

    public final ConversationId s(Intent intent) {
        return ((lpg) this.x.b()).j(intent);
    }

    public final MessageCoreData t(Intent intent) {
        String str = null;
        if (yhx.b && intent.hasExtra("android.remoteInputDraft")) {
            String stringExtra = intent.getStringExtra("android.remoteInputDraft");
            ConversationId conversationId = d().c;
            if (conversationId != null) {
                str = conversationId.b();
            }
            rsr a2 = ((rss) this.V.b()).a(ruy.b(str), false);
            a2.Q(stringExtra);
            return a2.u(((xnv) this.T.b()).f().toEpochMilli());
        }
        if (!intent.hasExtra("draft_data")) {
            return null;
        }
        return (MessageCoreData) intent.getParcelableExtra("draft_data");
    }

    public final ConversationIdType u(ConversationId conversationId) {
        if (((obm) this.ak.b()).a()) {
            return lgc.H(conversationId);
        }
        return ((BugleConversationId) conversationId).a;
    }

    public final void v(ajwt ajwtVar) {
        if (T()) {
            jcp jcpVar = new jcp();
            apxh.e(jcpVar);
            aklw.b(jcpVar, ajwtVar);
            aa(jcpVar);
            return;
        }
        ixn ixnVar = new ixn();
        apxh.e(ixnVar);
        aklw.b(ixnVar, ajwtVar);
        aa(ixnVar);
    }

    public final void w(int i) {
        View findViewById = this.b.findViewById(R.id.contact_picker_fragment_container);
        if (findViewById == null) {
            this.b.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new agds(this, i, 1));
        } else if (findViewById.getVisibility() != i) {
            findViewById.setVisibility(i);
        }
    }

    public final void x(int i) {
        this.v.isPresent();
        this.b.getWindow().setSoftInputMode(i);
    }

    public final void y(ConversationId conversationId, MessageIdType messageIdType) {
        cg W;
        if (d().b != 16) {
            ab();
        }
        if (!T() && (W = W()) != null) {
            MainActivity mainActivity = this.b;
            aqws aqwsVar = this.P;
            ixd z = ixd.z(W);
            if (lga.q(mainActivity, aqwsVar.a) && d.F(u(conversationId), z.L)) {
                return;
            }
            bd bdVar = new bd(X());
            bdVar.n(W);
            bdVar.b();
            alvw g = a.g();
            g.X(alwp.a, "Bugle");
            ((alvg) g.h("com/google/android/apps/messaging/main/MainActivityPeer", "launchConversationInternal", 2267, "MainActivityPeer.kt")).H("MainActivity#launchConversation: fragment isAdd: %s, isBound: %s", W.aw(), Boolean.valueOf(z.aT()));
        }
        d().b = 1;
        d().c = conversationId;
        if (!T() || !messageIdType.b()) {
            this.b.getIntent().putExtra("message_id", messageIdType.a());
        }
        U();
    }

    public final void z() {
        ConversationIdType conversationIdType;
        ConversationActivityUsageStatisticsState m = m();
        if (m.b >= 0 && m.c > 0 && this.I) {
            mho mhoVar = (mho) this.Z.b();
            ConversationId conversationId = d().c;
            if (conversationId != null) {
                conversationIdType = u(conversationId);
            } else {
                conversationIdType = null;
            }
            mhoVar.aC(conversationIdType, m.a, m.b, m.c, m.e, m.f, m.g, false, m.i, m.k, m.h, m.l, m().j, m().m);
            boolean z = m.e;
            if (((Boolean) ((utz) mik.c.get()).e()).booleanValue()) {
                ((mii) this.ag.b()).c(z);
            }
        }
    }
}
