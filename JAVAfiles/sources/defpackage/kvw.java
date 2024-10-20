package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.UserManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvw implements rrs {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/home/HomeFragmentPeer");
    public final aksr A;
    public final armf B;
    public final armf C;
    public final armf D;
    public final armf E;
    public final armf F;
    public final armf G;
    public final armf H;
    public final armf I;
    public final armf J;
    public final Optional K;
    public final armf L;
    public final armf M;
    public final abbc N;
    public final ahqr O;
    public final armf P;
    public final armf Q;
    public final armf R;
    public final Optional S;
    public final kwl T;
    public final armf U;
    public final armf V;
    public final armf W;
    public final armf X;
    public final armf Y;
    public final armf Z;
    public ViewTreeObserver.OnPreDrawListener aA;
    public ViewTreeObserver.OnPreDrawListener aB;
    public ViewGroup aD;
    public uye aE;
    boolean aF;
    public kuz aG;
    ghj aH;
    public LinearLayoutManager aI;
    public xvy aJ;
    public View aK;
    public boolean aL;
    lqy aQ;
    public boolean aR;
    public ViewTreeObserver.OnGlobalLayoutListener aS;
    public lat aU;
    public final armf aV;
    public final xvv aW;
    public final xvv aX;
    public final ohm aY;
    public final armf aZ;
    public final armf aa;
    public final armf ab;
    public final armf ac;
    public final armf ad;
    public final armf ae;
    public final ajwt af;
    public final armf ag;
    public final armf ah;
    public final armf ai;
    public final armf aj;
    public final armf ak;
    public final armf al;
    public final armf am;
    public final armf an;
    public final lqx ao;
    public final akbp ap;
    public final akbp aq;
    public final akbp ar;
    public final akbp as;
    public final akbp at;
    public final armf au;
    public final armf av;
    final armf aw;
    public final apwt ax;
    public final armf ay;
    public final armf az;
    public final kux b;
    private final apwt bA;
    private final armf bB;
    private final armf bC;
    private final armf bD;
    private final armf bE;
    private final armf bF;
    private final armf bG;
    private final apwt bH;
    private final armf bI;
    private final armf bJ;
    private final armf bK;
    private final apwt bL;
    private final apwt bM;
    private final apwt bN;
    private final ahoo bO;
    private final armf bP;
    private final armf bQ;
    private final armf bR;
    private final Optional bS;
    private final armf bT;
    private final armf bU;
    private final qif bV;
    private final armf bW;
    private final armf bX;
    private final armf bY;
    private final armf bZ;
    public final apwt ba;
    public final nwq bb;
    public final nwr bc;
    public final nwt bd;
    public final nws be;
    public final armf bf;
    public final armf bg;
    public final armf bh;
    public final armf bi;
    public final armf bj;
    public final AtomicBoolean bk;
    public final armf bl;
    public final lqn bm;
    public final kor bn;
    public final ngu bo;
    public final aohs bp;
    private final Activity bq;
    private final armf br;
    private final armf bs;
    private final armf bt;
    private final armf bu;
    private final armf bv;
    private final armf bw;
    private final kwu bx;
    private final armf by;
    private final armf bz;
    final armf c;
    private final armf ca;
    private final armf cb;
    private final armf cc;
    private final armf cd;
    private final armf ce;
    private final armf cf;
    private final armf cg;
    private final armf ch;
    private final armf ci;
    private MenuItem cj;
    private RecyclerView ck;
    private ViewGroup cl;
    private ViewStub cm;
    private View cn;
    private LottieAnimationView co;
    private final armf cp;
    private final armf cq;
    private final armf cr;
    private final armf cs;
    private final apwt ct;
    private final apwt cu;
    private final apwt cv;
    private final armf cw;
    private final armf cx;
    private final aqws cy;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final yjr j;
    public final armf k;
    public final xnv l;
    public final apwt m;
    public final armf n;
    public final armf o;
    public final apwt p;
    public final kyc q;
    public final kye r;
    public final lag s;
    public final armf t;
    public lr u;
    public final apwt v;
    public final apwt w;
    public final akgu x;
    public final akbo y;
    public final kwq z;
    public boolean aC = false;
    public boolean aM = true;
    public boolean aN = false;
    final rrb aO = new rrb();
    public final HashSet aP = new HashSet();
    public boolean aT = false;

    public kvw(ajwt ajwtVar, kux kuxVar, Activity activity, armf armfVar, armf armfVar2, Optional optional, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, yjr yjrVar, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, xnv xnvVar, armf armfVar22, apwt apwtVar, apwt apwtVar2, kyc kycVar, kye kyeVar, apwt apwtVar3, armf armfVar23, apwt apwtVar4, aohs aohsVar, akgu akguVar, akbo akboVar, kwq kwqVar, armf armfVar24, armf armfVar25, kwu kwuVar, armf armfVar26, aksr aksrVar, armf armfVar27, apwt apwtVar5, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, lqx lqxVar, armf armfVar38, armf armfVar39, armf armfVar40, armf armfVar41, apwt apwtVar6, lqn lqnVar, armf armfVar42, armf armfVar43, armf armfVar44, qif qifVar, armf armfVar45, Optional optional2, armf armfVar46, armf armfVar47, abbc abbcVar, armf armfVar48, apwt apwtVar7, apwt apwtVar8, apwt apwtVar9, ahoo ahooVar, ahqr ahqrVar, armf armfVar49, armf armfVar50, armf armfVar51, Optional optional3, kwl kwlVar, ngu nguVar, armf armfVar52, armf armfVar53, armf armfVar54, armf armfVar55, armf armfVar56, armf armfVar57, armf armfVar58, armf armfVar59, armf armfVar60, armf armfVar61, armf armfVar62, lag lagVar, armf armfVar63, armf armfVar64, armf armfVar65, armf armfVar66, armf armfVar67, aqws aqwsVar, kor korVar, armf armfVar68, armf armfVar69, armf armfVar70, ohm ohmVar, armf armfVar71, armf armfVar72, armf armfVar73, armf armfVar74, apwt apwtVar10, nwq nwqVar, nwr nwrVar, nwt nwtVar, nws nwsVar, armf armfVar75, armf armfVar76, armf armfVar77, armf armfVar78, armf armfVar79, AtomicBoolean atomicBoolean, armf armfVar80, armf armfVar81, armf armfVar82, armf armfVar83, armf armfVar84, armf armfVar85, armf armfVar86, armf armfVar87, armf armfVar88, armf armfVar89, armf armfVar90, armf armfVar91, armf armfVar92, armf armfVar93, armf armfVar94, apwt apwtVar11, apwt apwtVar12, armf armfVar95, armf armfVar96, apwt apwtVar13, apwt apwtVar14, armf armfVar97, armf armfVar98, armf armfVar99) {
        akrh e = aktp.e("HomeFragment#init");
        try {
            this.af = ajwtVar;
            this.b = kuxVar;
            this.bq = activity;
            this.c = armfVar2;
            this.bS = optional;
            this.n = armfVar;
            this.bT = armfVar3;
            this.bU = armfVar4;
            this.bv = armfVar5;
            this.ai = armfVar6;
            this.aj = armfVar7;
            this.d = armfVar8;
            this.e = armfVar9;
            this.f = armfVar10;
            this.g = armfVar11;
            this.h = armfVar12;
            this.i = armfVar13;
            this.j = yjrVar;
            this.k = armfVar14;
            this.bW = armfVar15;
            this.bX = armfVar16;
            this.bY = armfVar17;
            this.bZ = armfVar18;
            this.ca = armfVar19;
            this.cb = armfVar20;
            this.br = armfVar21;
            this.l = xnvVar;
            this.bs = armfVar22;
            this.m = apwtVar;
            this.p = apwtVar2;
            this.v = apwtVar3;
            this.bw = armfVar23;
            this.w = apwtVar4;
            this.bp = aohsVar;
            this.x = akguVar;
            this.y = akboVar;
            this.z = kwqVar;
            this.ag = armfVar24;
            this.ah = armfVar25;
            this.bx = kwuVar;
            this.by = armfVar26;
            this.A = aksrVar;
            this.bz = armfVar27;
            this.bA = apwtVar5;
            this.B = armfVar28;
            this.C = armfVar29;
            this.bB = armfVar30;
            this.bC = armfVar31;
            this.bD = armfVar32;
            this.bE = armfVar33;
            this.D = armfVar34;
            this.E = armfVar35;
            this.F = armfVar36;
            this.bF = armfVar37;
            this.ao = lqxVar;
            this.G = armfVar38;
            this.bG = armfVar39;
            this.H = armfVar40;
            this.cc = armfVar41;
            this.bH = apwtVar6;
            this.bm = lqnVar;
            this.I = armfVar42;
            this.bI = armfVar43;
            this.J = armfVar44;
            this.bV = qifVar;
            this.bJ = armfVar45;
            this.K = optional2;
            this.L = armfVar46;
            this.M = armfVar47;
            this.N = abbcVar;
            this.bK = armfVar48;
            this.bL = apwtVar7;
            this.bM = apwtVar8;
            this.bN = apwtVar9;
            this.bO = ahooVar;
            this.O = ahqrVar;
            this.P = armfVar49;
            this.Q = armfVar50;
            this.R = armfVar51;
            this.S = optional3;
            this.T = kwlVar;
            this.bo = nguVar;
            this.bP = armfVar52;
            this.bQ = armfVar53;
            this.U = armfVar54;
            this.V = armfVar55;
            this.bR = armfVar56;
            this.W = armfVar58;
            this.X = armfVar59;
            this.Y = armfVar60;
            this.q = kycVar;
            this.r = kyeVar;
            this.cd = armfVar61;
            this.ce = armfVar62;
            this.s = lagVar;
            this.al = armfVar63;
            this.am = armfVar64;
            this.an = armfVar65;
            this.Z = armfVar66;
            this.aa = armfVar67;
            this.bn = korVar;
            this.cf = armfVar68;
            this.cg = armfVar69;
            this.ch = armfVar70;
            this.aY = ohmVar;
            this.cy = aqwsVar;
            this.ac = armfVar57;
            this.ad = armfVar72;
            this.ae = armfVar71;
            this.aV = armfVar73;
            this.aZ = armfVar74;
            this.ba = apwtVar10;
            this.bb = nwqVar;
            this.bc = nwrVar;
            this.bd = nwtVar;
            this.be = nwsVar;
            this.bt = armfVar75;
            this.ab = armfVar76;
            this.ci = armfVar77;
            this.au = armfVar78;
            this.bf = armfVar79;
            this.av = armfVar82;
            this.aw = armfVar83;
            this.bk = atomicBoolean;
            this.ak = armfVar80;
            this.bg = armfVar81;
            this.cq = armfVar84;
            this.bh = armfVar85;
            this.cp = armfVar86;
            this.t = armfVar87;
            this.bi = armfVar88;
            this.bu = armfVar89;
            this.o = armfVar90;
            this.bj = armfVar91;
            this.cr = armfVar92;
            this.ay = armfVar93;
            this.az = armfVar94;
            this.ax = apwtVar11;
            this.cv = apwtVar12;
            this.cw = armfVar95;
            this.cs = armfVar96;
            this.ct = apwtVar13;
            this.cu = apwtVar14;
            this.cx = armfVar98;
            this.bl = armfVar99;
            this.ap = new kvm(this);
            this.aq = new kvo(this);
            this.ar = new kvq(this);
            this.as = new kvr(this);
            this.at = new kvt(this);
            this.aF = false;
            this.aW = new xvv("enable_ditto_extensions_state", new gvc(apwtVar7, 11));
            this.aX = new xvv("enable_welcome_flow_v1_state", new gvc(armfVar97, 10));
            e.close();
        } finally {
        }
    }

    private final void G() {
        qiu.h(((ksm) this.bD.b()).c(this.b.y(), "Messenger_main", this.af));
    }

    private final void H(int i) {
        ((mbl) this.bB.b()).e("Bugle.UI.AvatarMenu.ItemClickEvent", i);
    }

    private final void I(int i) {
        ((mbl) this.bB.b()).e("Bugle.UI.NavigationDrawer.ItemClickEvent", i);
    }

    private final void J() {
        if (!this.aE.a()) {
            return;
        }
        this.aU.a = !A();
    }

    private final boolean K() {
        return lga.q(this.bq, this.cy.a);
    }

    public static aaig l(cj cjVar) {
        aaig aaigVar = (aaig) ((zgu) cjVar).O();
        aaigVar.getClass();
        return aaigVar;
    }

    public static void t(ListEmptyView listEmptyView, int i) {
        listEmptyView.a.setContentDescription(listEmptyView.getResources().getString(i));
        listEmptyView.b(i);
    }

    public final boolean A() {
        return ((zgu) this.b.F()).O() instanceof aaig;
    }

    public final boolean B() {
        if (this.aI.K() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v34, types: [armf, java.lang.Object] */
    public final boolean C(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        Context y = this.b.y();
        if (itemId == R.id.action_settings) {
            ((lzv) this.B.b()).I(y, this.af);
            H(2);
            return true;
        }
        if (itemId == R.id.action_help_and_feedback) {
            G();
            H(4);
            return true;
        }
        if (itemId == R.id.action_help) {
            G();
            H(4);
            return true;
        }
        if (itemId == R.id.action_advanced_feedback) {
            kor korVar = (kor) this.bI.b();
            ksw kswVar = new ksw(null, null);
            kswVar.f(amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
            korVar.a(y, kswVar.e());
            H(6);
            return true;
        }
        if (itemId == R.id.action_show_archived) {
            ((lzv) this.B.b()).w(this.b.F(), this.af);
            if (((Boolean) ((utz) kuy.d.get()).e()).booleanValue()) {
                I(4);
            }
            return true;
        }
        if (itemId == R.id.action_show_spam_folder) {
            ((lzv) this.B.b()).X(y);
            ((ksi) this.g.b()).a();
            if (((Boolean) ((utz) kuy.d.get()).e()).booleanValue()) {
                I(6);
            }
            return true;
        }
        if (itemId == R.id.action_mark_all_as_read) {
            lfl lflVar = (lfl) this.c.b();
            ajwt ajwtVar = this.af;
            if (!((yjv) lflVar.c).d()) {
                ((xze) lflVar.a).q("Can't mark as read if it't not default default sms app");
            }
            ((rix) lflVar.b.b()).b(ajwtVar.a).p(new kwg(lflVar));
            ((mbl) this.bB.b()).c("Bugle.UI.MarkAllAsRead");
            if (((Boolean) ((utz) kuy.d.get()).e()).booleanValue()) {
                I(13);
            }
            return true;
        }
        if (itemId == R.id.action_show_blocked_contacts) {
            ((lzv) this.B.b()).x(y);
            ((mbl) this.bB.b()).c("Bugle.UI.Blocked");
            return true;
        }
        if (itemId == R.id.action_zero_state_search) {
            this.b.y();
            return true;
        }
        ((aakd) this.bA.b()).c(itemId, this.b.F(), aakd.a);
        if (this.aW.b() && ((kpb) ((Optional) this.bL.b()).get()).d()) {
            return true;
        }
        if (itemId == R.id.action_camera && ((ohi) this.av.b()).a() && ((Optional) ((apxx) this.aw).a).isPresent()) {
            lbc lbcVar = (lbc) ((Optional) ((apxx) this.aw).a).get();
            g(this.b).findViewById(R.id.action_camera);
            lbcVar.c();
            return false;
        }
        return false;
    }

    public final kyf D() {
        return (kyf) this.m.b();
    }

    public final void E(MenuInflater menuInflater) {
        int i;
        akrh e = aktp.e("HomeFragment#onCreateOptionsMenu");
        try {
            if (this.b.fe() != null && !A()) {
                if (this.aE.equals(uye.ARCHIVED)) {
                    i = R.menu.archived_menu;
                } else if (this.aE.equals(uye.SPAM_FOLDER)) {
                    i = R.menu.spam_menu;
                } else {
                    i = R.menu.home_menu_go;
                }
                if (kpt.a()) {
                    this.bS.isPresent();
                }
                Object obj = this.bo.b;
                obj.getClass();
                ((Toolbar) obj).n(i);
                ((Toolbar) obj).s = new kve(this, 0);
                MenuItem findItem = ((Toolbar) obj).f().findItem(R.id.action_mark_all_as_read);
                if (findItem != null && this.j.y()) {
                    findItem.setVisible(true);
                }
                obj.getClass();
                Menu f = ((Toolbar) obj).f();
                if (kpt.a()) {
                    this.bS.isPresent();
                }
                this.cj = f.findItem(R.id.action_show_blocked_contacts);
                w();
                if (((Boolean) ktf.a.e()).booleanValue()) {
                    f.findItem(R.id.action_help_and_feedback).setVisible(false);
                    f.findItem(R.id.action_help).setVisible(true);
                    f.findItem(R.id.action_advanced_feedback).setVisible(true);
                }
                if (((yck) this.bG.b()).q()) {
                    ((aakd) this.bA.b()).a(f.addSubMenu(0, 0, 1000, "Debug"), false);
                }
                if (this.aW.b() && this.aE.a()) {
                    if (this.bo.b != null) {
                        ((kpb) ((Optional) this.bL.b()).get()).h();
                    } else {
                        kpb kpbVar = (kpb) ((Optional) this.bL.b()).get();
                        menuInflater.getClass();
                        kpbVar.g();
                    }
                }
                e.close();
                yuw.a(f);
                return;
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r14v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    public final void F(int i, SelectedConversation selectedConversation, MessageIdType messageIdType, lrf lrfVar) {
        akul b;
        boolean z;
        laj lajVar = (laj) this.v.b();
        mdg mdgVar = lajVar.n;
        byte[] bArr = null;
        if (mdgVar != null) {
            mdgVar.b();
            lajVar.n = null;
        }
        ConversationIdType conversationIdType = selectedConversation.a;
        int i2 = 4;
        boolean z2 = true;
        boolean z3 = false;
        if (selectedConversation.o == 4 && selectedConversation.r != null) {
            if (uyh.a() && ((Optional) ((apxx) this.bR).a).isPresent()) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "Tried to open a LighterConversation, but it is not enabled");
            if (this.af != null) {
                z3 = true;
            }
            d.t(z3, "accountId is required to open conversation");
            ((mgv) this.bs.b()).e(mgv.J);
            uyw uywVar = (uyw) ((Optional) ((apxx) this.bR).a).get();
            this.b.F();
            selectedConversation.r.getClass();
            uywVar.a();
            if (((Boolean) ((utz) uyh.f.get()).e()).booleanValue()) {
                wpp wppVar = (wpp) this.bw.b();
                int ordinal = this.aE.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            i2 = 1;
                        } else {
                            i2 = 5;
                        }
                    }
                } else {
                    i2 = 2;
                }
                wppVar.ab(18, i2, conversationIdType);
                return;
            }
            return;
        }
        ConversationId conversationId = selectedConversation.b;
        this.bn.g(mgv.r, 0);
        if (qrl.a() && (!selectedConversation.h || ((obm) this.cr.b()).a())) {
            if (((Boolean) jcj.a.e()).booleanValue()) {
                khn khnVar = (khn) this.bP.b();
                aiut.c();
                if (khnVar.c == null) {
                    ((alvg) ((alvg) khn.a.g()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "cancelCurrentLoad", 87, "ConversationCachedLoaderImpl.java")).q("No conversations have started loading");
                } else {
                    alvg alvgVar = (alvg) ((alvg) khn.a.g()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "cancelCurrentLoad", 91, "ConversationCachedLoaderImpl.java");
                    ibi ibiVar = khnVar.c;
                    ibiVar.getClass();
                    alvgVar.t("Cancel loading for conversation %s", ibiVar.a.c().b());
                    khnVar.a().close();
                }
                ((alvg) ((alvg) khn.a.g()).h("com/google/android/apps/messaging/conversation2/preload/ConversationCachedLoaderImpl", "startLoadingConversation", 58, "ConversationCachedLoaderImpl.java")).t("Start loading messages for conversation %s", conversationId.b());
                khnVar.c = new ibi(khnVar.b.a(conversationId, miv.FOR_DISPLAY), (byte[]) null);
            }
            messageIdType = rvc.a;
        } else {
            rwe rweVar = (rwe) this.bK.b();
            int intValue = ((Integer) ite.a.e()).intValue();
            aiut.c();
            xzb.c("Bugle", "cancel preload.");
            rweVar.c = ruy.a;
            akul akulVar = rweVar.d;
            if (akulVar != null) {
                rweVar.d = null;
                akulVar.cancel(false);
            }
            albo.T(rweVar.c.b());
            if (rweVar.d != null) {
                z2 = false;
            }
            albo.T(z2);
            rweVar.c = conversationIdType;
            if (!messageIdType.b()) {
                b = rweVar.a(conversationIdType, messageIdType, intValue);
            } else {
                b = rweVar.b(conversationIdType, intValue);
            }
            rweVar.d = b;
        }
        MessageIdType messageIdType2 = messageIdType;
        if (ofn.a() && selectedConversation.t == mmy.c && (selectedConversation.h || selectedConversation.u)) {
            vco vcoVar = (vco) this.cx.b();
            cj F = this.b.F();
            ajgi ajgiVar = new ajgi(F);
            ajgiVar.x(R.string.rbm_email_trusted_contacts_user_education_title);
            ajgiVar.m(R.string.rbm_email_trusted_contacts_user_education_body);
            int i3 = 8;
            ajgiVar.t(R.string.ok_action, new aabt(vcoVar.b, "TrustedContactsDialog#ShowRbmEmailDisabledEducationDialog#positive", new iws(4), i3));
            ajgiVar.o(R.string.learn_more_action, new aabt(vcoVar.b, "TrustedContactsDialog#ShowRbmEmailDisabledEducationDialog#negative", new ise(vcoVar, F, i2, bArr), i3));
            ajgiVar.a();
            return;
        }
        if (this.aE.a()) {
            if (((Optional) this.ci.b()).isPresent()) {
                this.aG.k(conversationId, lrfVar, selectedConversation.h);
            } else {
                this.aG.l(conversationId, messageIdType2, lrfVar, selectedConversation.h);
            }
        } else {
            if (qrl.a()) {
                z3 = selectedConversation.h;
            }
            ((qoq) this.bz.b()).y(this.b.F(), conversationId, messageIdType2, lrfVar, Optional.of(this.af), z3);
        }
        ((mho) this.br.b()).t(conversationIdType, amfe.CONVERSATION_FROM_LIST, i);
        if (((ory) this.cs.b()).a()) {
            Optional optional = (Optional) this.ct.b();
            if (optional.isPresent() && ((msk) ((lpg) this.cu.b()).a.b()).t(selectedConversation.k, selectedConversation.p).z()) {
                ((lqt) optional.get()).a();
            }
        }
    }

    public final int a() {
        return ((kxm) this.p.b()).b();
    }

    public final RecyclerView b(kux kuxVar) {
        if (((ohs) this.bi.b()).a()) {
            return (RecyclerView) g(kuxVar).findViewById(android.R.id.list);
        }
        return this.ck;
    }

    public final View c(kux kuxVar) {
        if (((ohs) this.bi.b()).a()) {
            return kuxVar.L().findViewById(R.id.conversation_list_not_default_sms_app_view);
        }
        return this.cn;
    }

    public final View d(kux kuxVar) {
        if (((ohs) this.bi.b()).a()) {
            return kuxVar.L().findViewById(R.id.go_to_top_inflated_view);
        }
        return this.aK;
    }

    public final View e(kwv kwvVar) {
        View a2 = kwvVar.a();
        a2.setOnClickListener(new klx(this, 15));
        f(this.b).requestApplyInsets();
        return a2;
    }

    public final ViewGroup f(kux kuxVar) {
        if (((ohs) this.bi.b()).a()) {
            return (ViewGroup) g(kuxVar).findViewById(R.id.bottom_layout);
        }
        return this.cl;
    }

    public final ViewGroup g(kux kuxVar) {
        if (((ohs) this.bi.b()).a()) {
            return (ViewGroup) kuxVar.L().findViewById(R.id.home_fragment);
        }
        return this.aD;
    }

    public RecyclerView getRecyclerView() {
        return b(this.b);
    }

    public final ViewGroup h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.home_fragment, viewGroup, false);
        if (((ohs) this.bi.b()).a()) {
            viewGroup2.setId(R.id.home_fragment);
        } else {
            this.aD = viewGroup2;
        }
        viewGroup2.setOnApplyWindowInsetsListener(new ivf(4));
        if (!((ohs) this.bi.b()).a() && this.aE.a() && kpt.a()) {
            viewGroup2.setId(R.id.home_fragment);
        }
        View findViewById = this.b.F().findViewById(android.R.id.content);
        this.aB = new kvv(this, aktr.b(), new kwe(this, 0), 0);
        findViewById.getViewTreeObserver().addOnPreDrawListener(this.aB);
        return viewGroup2;
    }

    public final LottieAnimationView i(kux kuxVar) {
        if (((ohs) this.bi.b()).a()) {
            return (LottieAnimationView) c(kuxVar).findViewById(R.id.default_chat_app_animation);
        }
        return this.co;
    }

    public final kvw j() {
        return this.b.E();
    }

    public final kxn k() {
        return (kxn) this.p.b();
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v38, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [armf, java.lang.Object] */
    public final void m() {
        boolean isDemoUser;
        kvw kvwVar;
        ArrayList arrayList = new ArrayList();
        if (kpt.b()) {
            ((Optional) ((apxx) this.bU).a).ifPresent(new ktm(arrayList, 6));
        }
        kpf kpfVar = (kpf) this.bu.b();
        if (((Boolean) kpg.b.e()).booleanValue()) {
            alvw g = kpf.a.g();
            g.X(alwp.a, "DittoSatellite");
            ((alvg) g.h("com/google/android/apps/messaging/dittosatellite/impl/DittoSatelliteConfiguration", "isDittoSatelliteEnabled", 27, "DittoSatelliteConfiguration.kt")).q("Ditto Satellite Force disabled");
        } else if (((Boolean) kpg.a.e()).booleanValue() || !((yjv) kpfVar.c.b()).e() || ((Boolean) kph.a.e()).booleanValue()) {
            try {
                isDemoUser = ((UserManager) kpfVar.b.b()).isDemoUser();
                if (isDemoUser) {
                    alvw g2 = kpf.a.g();
                    g2.X(alwp.a, "DittoSatellite");
                    ((alvg) g2.h("com/google/android/apps/messaging/dittosatellite/impl/DittoSatelliteConfiguration", "isDittoSatelliteEnabled", 39, "DittoSatelliteConfiguration.kt")).q("Demo user detected, disabling Ditto Satellite");
                } else {
                    ((Optional) ((apxx) this.bv).a).ifPresent(new ktm(arrayList, 7));
                }
            } catch (RuntimeException e) {
                alvw h = kpf.a.h();
                h.X(alwp.a, "DittoSatellite");
                ((alvg) ((alvg) h).g(e).h("com/google/android/apps/messaging/dittosatellite/impl/DittoSatelliteConfiguration", "isDittoSatelliteEnabled", 43, "DittoSatelliteConfiguration.kt")).q("Error checking for demo user");
            }
        }
        arrayList.add((lqv) this.ch.b());
        ((Optional) ((apxx) this.bT).a).ifPresent(new ktm(arrayList, 9));
        arrayList.add((lqv) this.cd.b());
        arrayList.add((lqv) this.bW.b());
        arrayList.add((lqv) this.bX.b());
        aiqj aiqjVar = (aiqj) this.bZ.b();
        ?? r4 = aiqjVar.c;
        ?? r5 = aiqjVar.h;
        ?? r6 = aiqjVar.d;
        ?? r7 = aiqjVar.b;
        ?? r8 = aiqjVar.g;
        ?? r9 = aiqjVar.k;
        Context context = (Context) aiqjVar.e.b();
        context.getClass();
        anen anenVar = (anen) aiqjVar.a.b();
        anenVar.getClass();
        anen anenVar2 = (anen) aiqjVar.j.b();
        anenVar2.getClass();
        wjr wjrVar = (wjr) aiqjVar.i.b();
        wjrVar.getClass();
        odb odbVar = (odb) aiqjVar.f.b();
        odbVar.getClass();
        arrayList.add(new aayo(r4, r5, r6, r7, r8, r9, context, anenVar, anenVar2, wjrVar, odbVar));
        zoh zohVar = (zoh) this.cb.b();
        anen anenVar3 = (anen) zohVar.c.b();
        anenVar3.getClass();
        anen anenVar4 = (anen) zohVar.a.b();
        anenVar4.getClass();
        arrayList.add(new aayr(anenVar3, anenVar4, zohVar.b));
        yzk yzkVar = (yzk) this.ca.b();
        ?? r42 = yzkVar.n;
        ?? r52 = yzkVar.f;
        ?? r62 = yzkVar.a;
        ?? r72 = yzkVar.o;
        ?? r82 = yzkVar.m;
        ?? r92 = yzkVar.k;
        anen anenVar5 = (anen) yzkVar.d.b();
        anenVar5.getClass();
        anen anenVar6 = (anen) yzkVar.j.b();
        anenVar6.getClass();
        arrayList.add(new abai(r42, r52, r62, r72, r82, r92, anenVar5, anenVar6, yzkVar.i, yzkVar.l, yzkVar.c, yzkVar.b, yzkVar.e, yzkVar.h, yzkVar.g));
        if (xxy.a() && ((Boolean) ((utz) xxy.f.get()).e()).booleanValue()) {
            kvwVar = this;
            ((Optional) ((apxx) kvwVar.ce).a).ifPresent(new ktm(arrayList, 11));
        } else {
            kvwVar = this;
        }
        if (((Boolean) kvwVar.cf.b()).booleanValue() && ((Optional) ((apxx) kvwVar.cg).a).isPresent()) {
            arrayList.add((lqv) ((Optional) ((apxx) kvwVar.cg).a).get());
        }
        if (((oju) kvwVar.cw.b()).a()) {
            arrayList.add((lqv) ((Optional) kvwVar.cv.b()).get());
        }
        Stream sorted = Collection.EL.stream((Set) kvwVar.cc.b()).sorted(Comparator.CC.comparingInt(new kmb(4)));
        int i = alog.d;
        arrayList.addAll((java.util.Collection) sorted.collect(alls.a));
        zlz zlzVar = (zlz) kvwVar.bY.b();
        RecyclerView b = kvwVar.b(kvwVar.b);
        ?? r53 = zlzVar.b;
        armf armfVar = zlzVar.a;
        xnv xnvVar = (xnv) zlzVar.d.b();
        xnvVar.getClass();
        ?? b2 = zlzVar.c.b();
        b2.getClass();
        b.getClass();
        arrayList.add(new aajb(r53, armfVar, xnvVar, b2, b));
        lqx lqxVar = kvwVar.ao;
        ViewGroup f = kvwVar.f(kvwVar.b);
        lqxVar.g = (lqv[]) arrayList.toArray(new lqv[arrayList.size()]);
        for (lqv lqvVar : lqxVar.g) {
            lqvVar.c(lqxVar, f);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final void n() {
        kuy.a.l("enterMultiSelectState");
        wyp wypVar = (wyp) this.bE.b();
        ?? r1 = wypVar.f;
        kvw j = j();
        Context context = (Context) r1.b();
        ytk ytkVar = (ytk) wypVar.c.b();
        ytkVar.getClass();
        xbf xbfVar = (xbf) wypVar.b.b();
        xbfVar.getClass();
        xxe xxeVar = (xxe) wypVar.d.b();
        xxeVar.getClass();
        Object obj = wypVar.a;
        aaig aaigVar = new aaig(context, ytkVar, xbfVar, xxeVar, (Optional) ((apxx) obj).a, j, wypVar.g, wypVar.e);
        this.aG.i(aaigVar, this.b.L(), null);
        if (K()) {
            k().Q(kyb.a);
        }
        k().O(aaigVar);
        J();
        ((ksi) this.g.b()).a();
    }

    public final void o() {
        if (this.b.aw()) {
            kuy.a.l("exitMultiSelectState");
            if (!this.aG.e().isEmpty()) {
                ghj ghjVar = this.aH;
                if (ghjVar != null) {
                    ghjVar.h();
                }
                this.aG.f();
            }
            if (this.aH == null) {
                ((kxm) this.p.b()).u(0, ((kxm) this.p.b()).b());
            }
            J();
        }
    }

    public final void p(Iterable iterable, boolean z) {
        alob alobVar = new alob();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alobVar.h(((SelectedConversation) it.next()).a);
        }
        r(alobVar.g(), z, amfe.CONVERSATION_FROM_LIST);
    }

    public final void r(alog alogVar, boolean z, amfe amfeVar) {
        tqc tqcVar;
        if (this.b.G().ab()) {
            return;
        }
        xyo c = kuy.a.c();
        c.H("Set conversation archive status started by user");
        c.z("ConversationIds", alogVar);
        c.A("IsToArchive", z);
        c.z("Origin", amfeVar);
        c.q();
        kwq kwqVar = this.z;
        if (z) {
            tqcVar = tqc.ARCHIVED;
        } else {
            tqcVar = tqc.UNARCHIVED;
        }
        ahlp ahlpVar = new ahlp(kwqVar.a(alogVar, tqcVar, amfeVar, this.af));
        akbo akboVar = this.y;
        aozy createBuilder = lar.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        lar larVar = (lar) apagVar;
        larVar.b |= 1;
        larVar.c = z;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        lar larVar2 = (lar) createBuilder.b;
        larVar2.d = amfeVar.t;
        larVar2.b |= 2;
        akboVar.j(ahlpVar, ahlp.m((lar) createBuilder.s()), this.ar);
    }

    public final void s() {
        Button button;
        boolean y = this.j.y();
        xyo a2 = kuy.a.a();
        a2.A("isDefaultSmsApp", y);
        a2.q();
        if (!y) {
            if (c(this.b) == null) {
                if (((ohs) this.bi.b()).a()) {
                    ((ViewStub) g(this.b).findViewById(R.id.conversation_list_not_default_sms_app_stub)).inflate();
                } else {
                    this.cn = this.cm.inflate();
                }
                button = (Button) c(this.b).findViewById(R.id.set_as_default_button);
                Context context = c(this.b).getContext();
                if (!((ohs) this.bi.b()).a() && i(this.b) == null) {
                    this.co = (LottieAnimationView) c(this.b).findViewById(R.id.default_chat_app_animation);
                }
                i(this.b).e(context.getString(R.string.default_chat_app_gm3_json));
                i(this.b).c();
                if (abbu.n(this.b.y())) {
                    i(this.b).setVisibility(8);
                }
            } else if (c(this.b).getVisibility() == 0) {
                return;
            } else {
                button = (Button) c(this.b).findViewById(R.id.set_as_default_button);
            }
            b(this.b).setVisibility(8);
            c(this.b).setVisibility(0);
            button.setOnClickListener(((zmr) this.bt.b()).a(new klx(this, 14)));
            z();
            return;
        }
        if (c(this.b) != null) {
            c(this.b).setVisibility(8);
        }
        b(this.b).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        if (this.aE.a() && B() && this.b.az()) {
            ((rrt) this.aO.a()).d(true);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:1|2|3|(2:372|373)|5|6|7|8|9|10|(7:(45:(5:341|342|(2:354|(1:356))|348|(69:352|353|13|(1:15)|28|(1:30)(1:340)|31|(1:33)(6:307|308|13d|319|320|321)|34|35|(1:39)|50|51|52|53|54|55|56|57|58|59|(12:61|62|63|64|(2:270|271)|66|(1:68)|69|(1:71)|83|84|85)(2:277|(1:279))|86|(1:88)|267|90|91|92|93|94|95|96|97|98|99|100|101|102|(1:104)(1:226)|105|106|107|(1:109)|110|(1:112)|113|(1:115)|117|118|119|(1:121)|122|(1:124)(1:207)|125|(1:127)|128|(1:130)|132|133|134|(2:137|135)|138|139|(2:(1:142)|143)(11:159|(1:196)(1:163)|164|165|166|(1:168)(1:187)|169|170|(2:184|185)|172|173)|144|145|146|147|148))|91|92|93|94|95|96|97|98|99|100|101|102|(0)(0)|105|106|107|(0)|110|(0)|113|(0)|117|118|119|(0)|122|(0)(0)|125|(0)|128|(0)|132|133|134|(1:135)|138|139|(0)(0)|144|145|146|147|148|(3:(0)|(1:322)|(1:192)))|59|(0)(0)|86|(0)|267|90)|12|13|(0)|28|(0)(0)|31|(0)(0)|34|35|(2:37|39)|50|51|52|53|54|55|56|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x096f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0970, code lost:
    
        r26 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x01ab, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x042c, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L97;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04d8 A[Catch: all -> 0x093d, TryCatch #18 {all -> 0x093d, blocks: (B:102:0x04c7, B:104:0x04d8, B:226:0x04fa), top: B:101:0x04c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x051c A[Catch: all -> 0x0931, TryCatch #11 {all -> 0x0931, blocks: (B:107:0x050e, B:109:0x051c, B:110:0x052d, B:112:0x0553, B:113:0x0562, B:115:0x057f), top: B:106:0x050e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0553 A[Catch: all -> 0x0931, TryCatch #11 {all -> 0x0931, blocks: (B:107:0x050e, B:109:0x051c, B:110:0x052d, B:112:0x0553, B:113:0x0562, B:115:0x057f), top: B:106:0x050e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x057f A[Catch: all -> 0x0931, TRY_LEAVE, TryCatch #11 {all -> 0x0931, blocks: (B:107:0x050e, B:109:0x051c, B:110:0x052d, B:112:0x0553, B:113:0x0562, B:115:0x057f), top: B:106:0x050e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05ec A[Catch: all -> 0x0925, TryCatch #2 {all -> 0x0925, blocks: (B:119:0x0599, B:121:0x05ec, B:122:0x0626, B:125:0x06a1, B:127:0x06f6, B:128:0x0707, B:130:0x070f), top: B:118:0x0599 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06f6 A[Catch: all -> 0x0925, TryCatch #2 {all -> 0x0925, blocks: (B:119:0x0599, B:121:0x05ec, B:122:0x0626, B:125:0x06a1, B:127:0x06f6, B:128:0x0707, B:130:0x070f), top: B:118:0x0599 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x070f A[Catch: all -> 0x0925, TRY_LEAVE, TryCatch #2 {all -> 0x0925, blocks: (B:119:0x0599, B:121:0x05ec, B:122:0x0626, B:125:0x06a1, B:127:0x06f6, B:128:0x0707, B:130:0x070f), top: B:118:0x0599 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x074a A[Catch: all -> 0x0919, LOOP:0: B:135:0x0744->B:137:0x074a, LOOP_END, TRY_LEAVE, TryCatch #39 {all -> 0x0919, blocks: (B:134:0x072a, B:135:0x0744, B:137:0x074a), top: B:133:0x072a }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011a A[Catch: all -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x00f7, blocks: (B:342:0x00a2, B:344:0x00c4, B:346:0x00ca, B:348:0x00e2, B:352:0x00ec, B:15:0x011a, B:354:0x00d0, B:356:0x00da), top: B:341:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04fa A[Catch: all -> 0x093d, TRY_LEAVE, TryCatch #18 {all -> 0x093d, blocks: (B:102:0x04c7, B:104:0x04d8, B:226:0x04fa), top: B:101:0x04c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03d5 A[Catch: all -> 0x096d, TryCatch #8 {all -> 0x096d, blocks: (B:85:0x0376, B:277:0x03d5, B:279:0x03e1), top: B:59:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x013b A[Catch: all -> 0x09af, TryCatch #10 {all -> 0x09af, blocks: (B:10:0x008e, B:13:0x00ff, B:28:0x011d, B:31:0x012f, B:34:0x01ac, B:307:0x013b, B:309:0x013d), top: B:9:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026e A[Catch: all -> 0x096f, TRY_LEAVE, TryCatch #9 {all -> 0x096f, blocks: (B:58:0x025f, B:61:0x026e), top: B:57:0x025f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x041d A[Catch: all -> 0x09cb, TryCatch #28 {all -> 0x09cb, blocks: (B:86:0x0401, B:88:0x041d, B:90:0x0436, B:93:0x048b, B:266:0x096c, B:265:0x0969, B:267:0x042e, B:81:0x097b, B:82:0x097e, B:294:0x098c, B:293:0x0989, B:305:0x099a, B:304:0x0997, B:26:0x09b9, B:27:0x09bc, B:369:0x09ca, B:368:0x09c7, B:92:0x047d, B:260:0x0963, B:20:0x09b3, B:76:0x0975, B:7:0x0032, B:55:0x0202, B:363:0x09c1, B:288:0x0983, B:52:0x01ee, B:299:0x0991), top: B:6:0x0032, inners: #0, #4, #13, #16, #19, #20, #24, #25, #30, #36 }] */
    /* JADX WARN: Type inference failed for: r3v40, types: [ghg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [oa, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 2523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvw.v(android.os.Bundle):void");
    }

    public final void w() {
        MenuItem menuItem = this.cj;
        if (menuItem != null) {
            menuItem.setTitle(R.string.blocked_destination_list_title);
            this.cj.setVisible(((xxe) this.bF.b()).b());
        }
    }

    public final void x(ListEmptyView listEmptyView) {
        if (z() && this.aE.a()) {
            listEmptyView.a(8);
            dxv dxvVar = new dxv(-1, -1);
            dxvVar.c = 16;
            dxvVar.b(new AppBarLayout.ScrollingViewBehavior());
            listEmptyView.setLayoutParams(dxvVar);
            return;
        }
        if (abbu.n(this.b.y())) {
            listEmptyView.a(8);
        } else {
            listEmptyView.a(0);
            listEmptyView.c(R.drawable.ic_messages_noconversations);
        }
    }

    public final void y(boolean z) {
        if (this.bq.isDestroyed()) {
            return;
        }
        this.aL = !z;
        if (z && this.j.y()) {
            this.aJ.g(0);
        } else {
            this.aJ.e();
        }
    }

    public final boolean z() {
        if (!K() && ((Optional) this.bH.b()).isPresent()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rrs
    public final /* synthetic */ void q(rrt rrtVar, Cursor cursor) {
    }
}
