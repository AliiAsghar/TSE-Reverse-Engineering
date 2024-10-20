package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;
import com.google.android.apps.messaging.main.MainActivity;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.Compose2oRootView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ixd;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixd extends ixm implements jch, zqe, zqf, zxa, isz, aabh, aabz, rsm, vrl, inq, ilb {
    public WindowInsets A;
    public abcz B;
    public aapc C;
    public wnr E;
    public wnr F;
    public final armf G;
    public String H;
    public final ConversationIdType L;
    public final cg M;
    public final xwr N;
    public final mbl O;
    public final mce P;
    public final armf Q;
    public final ydf R;
    public final apwt S;
    public final armf T;
    public final rss U;
    public final Optional V;
    public final armf W;
    public final armf X;
    public final qya Y;
    public final ksi Z;
    public final Optional aA;
    public final armf aB;
    public final aksr aC;
    public final rtb aD;
    public final Optional aE;
    public final Optional aF;
    public final Set aG;
    public final ryh aH;
    public final armf aI;
    public final apwt aJ;
    public final apwt aK;
    public final armf aL;
    public final yya aM;
    public final armf aN;
    public final Optional aO;
    public final Optional aP;
    public final Optional aQ;
    public final Optional aR;
    public final Optional aS;
    public final Optional aT;
    public final Optional aU;
    public final msk aV;
    public final armf aW;
    public final jbn aX;
    public final armf aY;
    public final lbi aZ;
    public final yio aa;
    public final xnv ab;
    public final rym ac;
    public final apwt ad;
    public final xyt ae;
    public final armf af;
    public final qky ag;
    public final armf ah;
    public final yjr ai;
    public final yti aj;
    public final xzu ak;
    public final xbf al;
    public final yai am;
    public final armf an;
    public final abqa ao;
    public final ydc ap;
    public final abbj aq;
    public final ytj ar;
    public final abdc as;
    public final boolean at;
    public final abbu av;
    public final armf aw;
    public final Optional ax;
    public final akbo ay;
    public final yjf az;
    public final armf bA;
    public final armf bB;
    public final armf bC;
    public final armf bD;
    public final ajwt bE;
    public MessageIdType bF;
    public imk bG;
    public Snackbar bJ;
    public jad bK;
    public final xvv bL;
    public final armf bM;
    public Toast bN;
    public long bO;
    public String bP;
    public boolean bQ;
    public View bR;
    public View bS;
    public aabp bT;
    public ixa bU;

    @Deprecated
    public ComposeMessageView bV;
    public zxg bW;
    public itb bX;
    public MessageCoreData bY;
    public alog bZ;
    public final armf ba;
    public final armf bb;
    public final armf bc;
    public final armf bd;
    public final armf be;
    public final armf bf;
    public final armf bg;
    public final armf bh;
    public final armf bi;
    public final armf bj;
    public final armf bk;
    public final armf bl;
    public final armf bm;
    public final Optional bn;
    public final Optional bo;
    public final Optional bp;
    public final Optional bq;
    public final Optional br;
    public final Optional bs;
    public final Optional bt;
    public final armf bu;
    public final armf bv;
    public final armf bw;
    public final armf bx;
    public final armf by;
    public final Optional bz;
    public final armf c;
    public final rgo cA;
    public lex cB;
    public final eoy cC;
    public final aagg cD;
    public final aant cE;
    public final hwo cF;
    public final iji cG;
    public final abac cH;
    public final xjo cI;
    public final izc cJ;
    public final kor cK;
    public final kor cL;
    public final aqws cM;
    public final lig cN;
    public final ifb cO;
    public final yyz cP;
    public hwr cQ;
    public final hgj cR;
    public final zfh cS;
    public final wfh cT;
    public final akmy cU;
    public final hgj cV;
    public final aair cW;
    public final hmk cX;
    public final lfl cY;
    public final nei cZ;
    public final rrb ca;
    public int cb;
    public ViewGroup cc;
    public ContactIconView cd;
    public TextView ce;
    public TextView cf;
    public boolean cg;
    public boolean ch;
    public boolean ci;
    public boolean cj;
    public boolean ck;

    @Deprecated
    public rre cl;
    public long cm;
    public long cn;
    public boolean co;
    public TextView cp;
    public View cq;
    public Compose2oRootView cr;
    public ConversationScrollToBottomButton cs;
    public int ct;
    public int cu;
    public int cv;
    public ViewTreeObserver.OnGlobalLayoutListener cw;
    public boolean cx;
    public View.OnLayoutChangeListener cy;
    public final ijw cz;
    public boolean d;
    private xvy dA;
    private int dB;
    private BroadcastReceiver dC;
    private boolean dD;
    private boolean dE;
    private final xwe dF;
    private final znj dG;
    private final gpx dH;
    private final gpx dI;
    public hlc da;
    public final aohs db;
    public final aohs dc;
    public final wfh dd;
    public final wfh de;
    private final armf dh;
    private final Activity dk;
    private final Optional dl;
    private final mcp dm;
    private final apwt dn;

    /* renamed from: do, reason: not valid java name */
    private final xbi f2do;
    private final ytk dp;
    private final apwt dq;
    private final rsv dr;
    private final Map ds;
    private final rix dt;
    private final armf du;
    private final armf dv;
    private final armf dw;
    private final armf dx;
    private Snackbar dz;
    public ev e;
    public rw f;
    public akbp g;
    public akbp h;
    public Optional i;
    public akbp j;
    public akbp k;
    public akbp l;
    public akbp m;
    public akbp n;
    public lts o;
    public iks p;
    public MenuItem q;
    public MenuItem r;
    public MenuItem s;
    public MenuItem t;
    public MenuItem u;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer");
    private static final alwo dg = alwo.o("BugleBanners");
    public static final uuf b = uuh.i(uuh.b, "use_conv_recipients_model", false);
    public boolean v = false;
    private boolean di = false;
    private boolean dj = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public int z = -1;
    public int D = 0;
    public final AtomicReference I = new AtomicReference(ruy.a);
    public final AtomicReference J = new AtomicReference();
    public final AtomicReference K = new AtomicReference();
    public boolean au = false;
    public boolean bH = true;
    private boolean dy = true;
    public boolean bI = false;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class e implements akvv {
    }

    public ixd(armf armfVar, cg cgVar, Activity activity, eoy eoyVar, xwr xwrVar, ytj ytjVar, yjr yjrVar, apwt apwtVar, xnv xnvVar, ijw ijwVar, nei neiVar, iji ijiVar, aair aairVar, Optional optional, yyz yyzVar, Optional optional2, mbl mblVar, apwt apwtVar2, abbj abbjVar, rss rssVar, ydc ydcVar, ydf ydfVar, abqa abqaVar, ksi ksiVar, armf armfVar2, yai yaiVar, mcp mcpVar, xbf xbfVar, xbi xbiVar, yio yioVar, armf armfVar3, qya qyaVar, armf armfVar4, wfh wfhVar, xyt xytVar, wfh wfhVar2, rym rymVar, xzu xzuVar, aohs aohsVar, mce mceVar, armf armfVar5, armf armfVar6, qky qkyVar, yti ytiVar, armf armfVar7, rgo rgoVar, armf armfVar8, abac abacVar, ytk ytkVar, apwt apwtVar3, znj znjVar, aagg aaggVar, ifb ifbVar, apwt apwtVar4, abdc abdcVar, yyt yytVar, xwe xweVar, rsv rsvVar, abbu abbuVar, zfh zfhVar, Optional optional3, aant aantVar, akbo akboVar, wfh wfhVar3, yjf yjfVar, Map map, Optional optional4, kor korVar, aohs aohsVar2, gpx gpxVar, armf armfVar9, rix rixVar, lfl lflVar, aksr aksrVar, akmy akmyVar, rtb rtbVar, Optional optional5, Optional optional6, Set set, lig ligVar, aqws aqwsVar, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, xjo xjoVar, armf armfVar10, msk mskVar, armf armfVar11, armf armfVar12, apwt apwtVar5, apwt apwtVar6, armf armfVar13, yya yyaVar, jbn jbnVar, hwo hwoVar, armf armfVar14, hgj hgjVar, hgj hgjVar2, armf armfVar15, gpx gpxVar2, lbi lbiVar, kor korVar2, armf armfVar16, armf armfVar17, armf armfVar18, iuy iuyVar, ajwt ajwtVar, armf armfVar19, izc izcVar, hmk hmkVar, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, Optional optional14, Optional optional15, Optional optional16, Optional optional17, Optional optional18, Optional optional19, Optional optional20, armf armfVar33, armf armfVar34, armf armfVar35, Optional optional21, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40, armf armfVar41, armf armfVar42, armf armfVar43, armf armfVar44) {
        uuf uufVar = b;
        uufVar.getClass();
        this.bL = new xvv("use_conv_recipients_model", new gvc(uufVar, 8));
        this.bO = 0L;
        this.dB = 0;
        this.ca = new rrb();
        this.cm = 0L;
        this.cn = 0L;
        this.cs = null;
        this.c = armfVar;
        this.W = armfVar7;
        this.dh = armfVar14;
        this.bh = armfVar31;
        this.bn = optional14;
        this.bo = optional15;
        this.bp = optional16;
        this.bq = optional17;
        this.br = optional18;
        this.bs = optional19;
        this.bt = optional20;
        this.bu = armfVar33;
        this.dx = armfVar37;
        this.bv = armfVar34;
        this.bw = armfVar35;
        this.L = ruy.b(iuyVar.b);
        this.M = cgVar;
        this.dk = activity;
        this.cC = eoyVar;
        this.N = xwrVar;
        this.cz = ijwVar;
        this.cZ = neiVar;
        this.cG = ijiVar;
        this.cW = aairVar;
        this.ar = ytjVar;
        this.ai = yjrVar;
        this.dn = apwtVar;
        this.ab = xnvVar;
        this.V = optional;
        this.cP = yyzVar;
        this.dl = optional2;
        this.O = mblVar;
        this.ad = apwtVar2;
        this.aq = abbjVar;
        this.U = rssVar;
        this.ap = ydcVar;
        this.R = ydfVar;
        this.ao = abqaVar;
        this.Z = ksiVar;
        this.ah = armfVar2;
        this.am = yaiVar;
        this.dm = mcpVar;
        this.al = xbfVar;
        this.f2do = xbiVar;
        this.aa = yioVar;
        this.aN = armfVar3;
        this.Y = qyaVar;
        this.an = armfVar4;
        this.de = wfhVar;
        this.ae = xytVar;
        this.dd = wfhVar2;
        this.ac = rymVar;
        this.ak = xzuVar;
        this.dc = aohsVar;
        this.P = mceVar;
        this.Q = armfVar5;
        this.af = armfVar6;
        this.ag = qkyVar;
        this.aj = ytiVar;
        this.cA = rgoVar;
        this.X = armfVar8;
        this.cH = abacVar;
        this.dp = ytkVar;
        this.S = apwtVar3;
        this.T = armfVar18;
        this.dG = znjVar;
        this.cD = aaggVar;
        this.cO = ifbVar;
        this.dq = apwtVar4;
        this.as = abdcVar;
        this.at = yytVar.z();
        this.dF = xweVar;
        this.dr = rsvVar;
        this.av = abbuVar;
        this.cS = zfhVar;
        this.ax = optional3;
        this.cE = aantVar;
        this.ay = akboVar;
        this.cT = wfhVar3;
        this.aD = rtbVar;
        this.az = yjfVar;
        this.bz = optional21;
        this.ds = map;
        this.aA = optional4;
        this.cK = korVar;
        this.db = aohsVar2;
        this.dH = gpxVar;
        this.aB = armfVar9;
        this.dt = rixVar;
        this.cY = lflVar;
        this.aC = aksrVar;
        this.cU = akmyVar;
        this.aE = optional5;
        this.aF = optional6;
        this.aG = set;
        this.cN = ligVar;
        this.cM = aqwsVar;
        this.cI = xjoVar;
        this.du = armfVar10;
        this.aI = armfVar11;
        this.aJ = apwtVar5;
        this.aK = apwtVar6;
        this.aL = armfVar13;
        this.aM = yyaVar;
        this.aH = new ryh();
        this.aO = optional7;
        this.aP = optional8;
        this.aQ = optional9;
        this.aR = optional10;
        this.aS = optional11;
        this.aT = optional12;
        this.aU = optional13;
        this.aV = mskVar;
        this.aW = armfVar12;
        this.aX = jbnVar;
        this.cF = hwoVar;
        this.cR = hgjVar;
        this.cV = hgjVar2;
        this.aY = armfVar15;
        this.dI = gpxVar2;
        this.aZ = lbiVar;
        this.cL = korVar2;
        this.bE = ajwtVar;
        this.ba = armfVar16;
        this.dv = armfVar17;
        this.G = armfVar19;
        this.cJ = izcVar;
        this.cX = hmkVar;
        this.bb = armfVar20;
        this.bf = armfVar21;
        this.bc = armfVar22;
        this.bd = armfVar23;
        this.be = armfVar24;
        this.bg = armfVar25;
        this.bi = armfVar26;
        this.bj = armfVar27;
        this.bk = armfVar28;
        this.dw = armfVar29;
        this.bl = armfVar30;
        this.bm = armfVar32;
        this.bx = armfVar36;
        this.by = armfVar38;
        this.bA = armfVar39;
        this.bB = armfVar40;
        this.bC = armfVar41;
        this.bD = armfVar42;
        this.bM = armfVar43;
        this.aw = armfVar44;
        if (!(cgVar instanceof iuz)) {
            throw new AssertionError("The fragment should be ConversationFragment but is\n".concat(String.valueOf(cgVar.getClass().getName())));
        }
    }

    private final boolean bA() {
        rrl rrlVar = (rrl) this.ca.a();
        if (!rrlVar.d) {
            return false;
        }
        ArrayList f2 = rrlVar.e.f();
        int size = f2.size();
        int i = 0;
        while (i < size) {
            boolean s = rxn.s((ParticipantsTable.BindData) f2.get(i));
            i++;
            if (s) {
                this.av.h(R.string.unknown_sender);
                return false;
            }
        }
        return true;
    }

    private final boolean bB() {
        if (((Boolean) utw.ag.e()).booleanValue() && this.dl.isPresent()) {
            return true;
        }
        return false;
    }

    private final void bC(String str, MessagePartCoreData messagePartCoreData) {
        if (TextUtils.isEmpty(str) && messagePartCoreData == null) {
            return;
        }
        rsr D = D();
        D.Q(str);
        D.N("text/plain");
        if (messagePartCoreData != null) {
            D.C(new zxc(this, 1));
            rrb rrbVar = new rrb();
            rrbVar.c(D);
            D.S(new altx(messagePartCoreData), rrbVar.b());
            return;
        }
        at(D);
    }

    public static void bs(armf armfVar, Uri uri, boolean z, ConversationIdType conversationIdType, Activity activity) {
        if (z) {
            ((lzv) armfVar.b()).S(activity, uri, upb.m(activity, conversationIdType));
        } else {
            ((lzv) armfVar.b()).Q(activity, uri, upb.h(activity, conversationIdType));
        }
    }

    public static void bt(armf armfVar, Uri uri, boolean z, ConversationIdType conversationIdType, cg cgVar) {
        if (z) {
            ((lzv) armfVar.b()).T(cgVar, uri, upb.m(cgVar.y(), conversationIdType));
        } else {
            ((lzv) armfVar.b()).R(cgVar, uri, upb.h(cgVar.y(), conversationIdType));
        }
    }

    private final void by() {
        R(new ivn(5), new ivp(this, 4));
    }

    private final void bz() {
        Q(new ivg(5), new ivg(6));
        this.cp.setVisibility(8);
        this.bX.v(0);
        Snackbar snackbar = this.dz;
        if (snackbar != null) {
            snackbar.e();
        }
    }

    public static ila x(cg cgVar) {
        if (cgVar instanceof ikz) {
            return ((ikz) cgVar).E();
        }
        throw new AssertionError("The fragment should be DraftEditorFragment but is ".concat(String.valueOf(cgVar.getClass().getName())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ixd z(cg cgVar) {
        if (cgVar instanceof akkh) {
            Object E = ((akkh) cgVar).E();
            if (E instanceof ixd) {
                return (ixd) E;
            }
        }
        throw new AssertionError("Conversation fragment is not a ConversationFragmentPeer");
    }

    public final ixd A() {
        cg cgVar = this.M;
        if (cgVar instanceof iuz) {
            return ((iuz) cgVar).E();
        }
        throw new AssertionError("The fragment should be ConversationFragment but is\n".concat(String.valueOf(cgVar.getClass().getName())));
    }

    public final jbq B(SuggestionData suggestionData) {
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            return (jbq) this.ds.get(((SmartSuggestionItemSuggestionData) suggestionData).s());
        }
        return null;
    }

    @Override // defpackage.aabz
    public final rre C() {
        return this.cl;
    }

    public final rsr D() {
        rrl rrlVar = (rrl) this.ca.a();
        rsr a2 = this.U.a(rrlVar.c, rrlVar.s());
        a2.f = A();
        a2.h = rrlVar.b.b();
        a2.R(i(), a());
        return a2;
    }

    public final MessageCoreData E() {
        rre rreVar = this.cl;
        if (rreVar == null) {
            return null;
        }
        return ((rsr) rreVar.a()).t(false);
    }

    @Override // defpackage.aabz
    public final xbe F() {
        return this.al.a(a());
    }

    public final Object G(Function function, Function function2) {
        Object apply;
        Object apply2;
        if (aV()) {
            ila w = w();
            w.getClass();
            apply2 = function.apply(w);
            return apply2;
        }
        apply = function2.apply(this.bV);
        return apply;
    }

    @Override // defpackage.zxa
    public final Object H(Function function, Function function2) {
        Object apply;
        Object apply2;
        inn y = y();
        if (y != null) {
            apply2 = function.apply(y);
            return apply2;
        }
        apply = function2.apply(this.bT);
        return apply;
    }

    public final String I() {
        return ((rrl) this.ca.a()).m();
    }

    public final String J() {
        if (!((rrl) this.ca.a()).j) {
            return null;
        }
        return ((rrl) this.ca.a()).m();
    }

    public final void K(akfb akfbVar, akgh akghVar) {
        this.dc.C(akfbVar, akghVar);
    }

    public final void L() {
        Q(new ivp(this, 11), new ivp(this, 12));
    }

    public final void M() {
        Toast toast = this.bN;
        if (toast != null) {
            toast.cancel();
        }
    }

    public final void N() {
        BugleSearchView bugleSearchView;
        MenuItem menuItem = this.q;
        if (menuItem != null && (bugleSearchView = (BugleSearchView) menuItem.getActionView()) != null) {
            bugleSearchView.setOnQueryTextListener(null);
        }
    }

    public final void O() {
        this.ak.i();
        this.cB.C();
    }

    @Override // defpackage.zxa
    public final void P() {
        by();
        int a2 = a();
        aabi aabiVar = new aabi();
        Bundle bundle = new Bundle();
        bundle.putInt("subId", a2);
        aabiVar.ak(bundle);
        aabiVar.aF(this.M);
        aabiVar.q(this.M.H(), null);
    }

    public final void Q(Consumer consumer, Consumer consumer2) {
        if (aV()) {
            if (consumer != null) {
                ila w = w();
                w.getClass();
                consumer.q(w);
                return;
            }
            return;
        }
        consumer2.q(this.bV);
    }

    @Override // defpackage.zxa
    public final void R(Consumer consumer, Consumer consumer2) {
        inn y = y();
        if (y != null) {
            if (consumer == null) {
                return;
            }
            consumer.q(y);
        } else {
            if (consumer2 == null) {
                return;
            }
            consumer2.q(this.bT);
        }
    }

    public final void S(Consumer consumer, Consumer consumer2) {
        if (aV()) {
            consumer.q(w());
        } else {
            consumer2.q(this.bV);
        }
    }

    public final void T(lym lymVar) {
        this.aO.ifPresent(new ilf(this, lymVar, 13));
    }

    public final void U(int i) {
        da G = this.M.G();
        aaeb aaebVar = (aaeb) G.e("RbmUnavailableBottomSheetFragment");
        if (aaebVar != null && aaebVar.aB()) {
            return;
        }
        String valueOf = String.valueOf(i);
        valueOf.getClass();
        aaeb aaebVar2 = new aaeb();
        apxh.e(aaebVar2);
        aklt.b(aaebVar2, valueOf);
        aaebVar2.r();
        aaebVar2.p(G, "RbmUnavailableBottomSheetFragment");
    }

    public final void V(boolean z) {
        int i = 1;
        R(new ivd(z, i), new ive(this, z, i));
    }

    public final void W() {
        R(new ivc(this, 15), new ivc(this, 16));
    }

    @Override // defpackage.aabz
    public final void X() {
        this.cB.g();
    }

    public final void Y() {
        if (aY()) {
            N();
        }
        cj fe = this.M.fe();
        if (!(fe instanceof zgu)) {
            return;
        }
        ((zgu) fe).m();
    }

    public final void Z(int i) {
        if (i != 1) {
            albo.T(((rrl) this.ca.a()).d);
        }
        if (((rrl) this.ca.a()).r()) {
            ParticipantsTable.BindData a2 = ((rrl) this.ca.a()).e.a();
            if (a2 != null) {
                String O = a2.O();
                if (O != null) {
                    gpx.w(q(), this.L, O);
                    return;
                }
                alvw h2 = a.h();
                h2.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) h2;
                alvgVar.X(ydl.p, this.L);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "launchConversationSettings", 4643, "ConversationFragmentPeer.java")).q("ConversationFragment: Conversation has RBM bot recipient and other participant, but the participant has a null normalized destination");
                return;
            }
            alvw h3 = a.h();
            h3.X(alwp.a, "Bugle");
            alvg alvgVar2 = (alvg) h3;
            alvgVar2.X(ydl.p, this.L);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "launchConversationSettings", 4651, "ConversationFragmentPeer.java")).q("ConversationFragment: Conversation has RBM bot recipient, but null other participant");
            return;
        }
        if (!((rrl) this.ca.a()).b.c()) {
            this.dH.u(q(), this.L, ((rrl) this.ca.a()).j, ((rrl) this.ca.a()).b.g, ((rrl) this.ca.a()).b.d, J(), i, ((rrl) this.ca.a()).b.q);
        } else {
            this.dH.v(q(), this.L, ((rrl) this.ca.a()).j, ((rrl) this.ca.a()).b.g, ((rrl) this.ca.a()).b.d, ((rrl) this.ca.a()).b.r, i, ((rrl) this.ca.a()).b.m);
        }
    }

    @Override // defpackage.rsn
    public final int a() {
        return ((rrl) this.ca.a()).c(i());
    }

    public final void aA(boolean z) {
        R(new ivd(z, 0), new isb(14));
    }

    public final void aB(ParticipantsTable.BindData bindData) {
        if (((Boolean) psn.b.e()).booleanValue() && ((rrl) this.ca.a()).l == psk.SHOW && ((rrl) this.ca.a()).d) {
            rrl rrlVar = (rrl) this.ca.a();
            if (rrlVar.i == null) {
                alvw g2 = rrl.a.g();
                g2.X(alwp.a, "BugleDataModel");
                alvg alvgVar = (alvg) g2;
                alvgVar.X(ydl.p, rrlVar.c);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "shouldShowRbmToolstone", 596, "ConversationData.java")).q("ConversationData: Should not show RBM block and report spam toolstone due to null BusinessInfoData");
                return;
            }
            List a2 = psn.a();
            BusinessInfoData businessInfoData = rrlVar.i;
            businessInfoData.getClass();
            if (a2.contains(businessInfoData.getAgentUseCase().name())) {
                alvw g3 = rrl.a.g();
                g3.X(alwp.a, "BugleDataModel");
                alvg alvgVar2 = (alvg) g3;
                alvgVar2.X(ydl.p, rrlVar.c);
                alvg alvgVar3 = (alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "shouldShowRbmToolstone", 606, "ConversationData.java");
                BusinessInfoData businessInfoData2 = rrlVar.i;
                businessInfoData2.getClass();
                alvgVar3.t("ConversationData: Should not show RBM block and report spam toolstone due to AgentUseCase of %s", businessInfoData2.getAgentUseCase().name());
                return;
            }
            if (psn.b().contains(bindData.P())) {
                alvw g4 = a.g();
                g4.X(alwp.a, "Bugle");
                alvg alvgVar4 = (alvg) g4;
                alvgVar4.X(ydl.p, this.L);
                ((alvg) alvgVar4.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "showRbmBlockAndReportToolstone", 5526, "ConversationFragmentPeer.java")).q("ConversationFragment: Not showing RBM block and report spam toolstone as the sender is allowlisted.");
                return;
            }
            this.dA = new xvy(this.bR, R.id.draft_toolstone_stub, R.id.draft_toolstone);
            aahp aahpVar = (aahp) this.bd.b();
            xvy xvyVar = this.dA;
            ConversationIdType conversationIdType = this.L;
            gvc gvcVar = new gvc(this, 9);
            xvyVar.getClass();
            if (((Boolean) psn.b.e()).booleanValue()) {
                psi psiVar = (psi) aahpVar.d.b();
                aozy createBuilder = amtn.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amtn amtnVar = (amtn) createBuilder.b;
                amtnVar.c = 3;
                amtnVar.b |= 1;
                psiVar.h((amtn) createBuilder.s());
                xvyVar.f(R.layout.draft_toolstone);
                ((ComposeView) xvyVar.b().findViewById(R.id.draft_toolstone_compose_view)).a(new cdj(-59981352, true, new aaho(aahpVar, gvcVar, conversationIdType, bindData, 2)));
            }
            if (this.dA.h()) {
                this.dA.b().addOnLayoutChangeListener(new fyc(this, 5));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aC() {
        if (!this.az.l()) {
            if (Build.VERSION.SDK_INT < 31) {
                albo.T(false);
                return;
            }
            rw rwVar = this.f;
            rwVar.getClass();
            new AlertDialog.Builder(q()).setMessage(R.string.request_exact_alarm_permission).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(android.R.string.ok, new ise(this, rwVar, 2, null)).create().show();
            return;
        }
        this.aP.ifPresent(new isb(13));
    }

    public final void aD(String str, String str2, Runnable runnable, boolean z) {
        cj fe = this.M.fe();
        fe.getClass();
        if (xwr.h(fe)) {
            if (z) {
                runnable.run();
            }
        } else {
            jh jhVar = new jh(runnable, 15, null);
            Snackbar q = Snackbar.q(this.bR, str, 0);
            q.n();
            q.s(str2, jhVar);
            q.i();
        }
    }

    public final void aE() {
        boolean z = false;
        if (this.av.m() && this.as.b) {
            z = true;
        }
        this.cI.c(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r1 != 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aF(com.google.android.ims.rcsservice.businessinfo.BusinessInfoData r5) {
        /*
            r4 = this;
            rrb r0 = r4.ca
            rqz r0 = r0.a()
            rrl r0 = (defpackage.rrl) r0
            r0.i = r5
            rrb r0 = r4.ca
            rqz r0 = r0.a()
            rrl r0 = (defpackage.rrl) r0
            rsa r0 = r0.e
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r0 = r0.a()
            if (r0 == 0) goto L2b
            rrb r1 = r4.ca
            rqz r1 = r1.a()
            rrl r1 = (defpackage.rrl) r1
            boolean r1 = r1.r()
            if (r1 == 0) goto L2b
            r4.aB(r0)
        L2b:
            itb r1 = r4.bX
            ird r1 = r1.aq
            irb r1 = r1.d
            r1.F(r5, r0)
            r0 = 0
            if (r5 == 0) goto L68
            itb r1 = r4.bX
            r2 = 1
            r1.w(r2)
            int r1 = r5.getVerificationStatus()
            r3 = 2
            if (r1 == r3) goto L45
            goto L62
        L45:
            int r1 = r5.getVerifiedBotPlatform()
            if (r1 == r2) goto L50
            if (r1 == r3) goto L4e
            goto L62
        L4e:
            r0 = r2
            goto L62
        L50:
            utz r0 = defpackage.utw.l
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            boolean r0 = r5.containsLocalVerifierInfo()
        L62:
            r4.dj = r0
            r4.aL()
            goto L6d
        L68:
            itb r5 = r4.bX
            r5.w(r0)
        L6d:
            itb r5 = r4.bX
            r5.n()
            lex r5 = r4.cB
            r5.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixd.aF(com.google.android.ims.rcsservice.businessinfo.BusinessInfoData):void");
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [msh, java.lang.Object] */
    public final void aG() {
        tqr A;
        String I = I();
        if (!TextUtils.isEmpty(I)) {
            if (!((rrl) this.ca.a()).b.d() && !((rrl) this.ca.a()).b.c()) {
                wfh wfhVar = this.dd;
                TextPaint paint = this.ce.getPaint();
                int width = this.ce.getWidth();
                this.M.S(R.string.and_n_more);
                I = wfhVar.B(I, paint, width, R.plurals.and_n_more_plural);
            }
            TextView textView = this.ce;
            if (textView != null) {
                textView.setText(this.dd.z(I));
            }
            if (this.cf != null) {
                String str = ((rrl) this.ca.a()).b.i;
                if (((Boolean) this.by.b()).booleanValue() && str != null) {
                    this.cf.setText(this.dd.z(str));
                    this.cf.setVisibility(0);
                    return;
                }
                ParticipantsTable.BindData a2 = ((rrl) this.ca.a()).e.a();
                if (a2 == null) {
                    A = tqr.VERIFICATION_NA;
                } else {
                    A = a2.A();
                }
                if (A != tqr.VERIFICATION_IN_PROGRESS) {
                    if (A == tqr.VERIFICATION_VERIFIED && this.dp.d() && ((rrl) this.ca.a()).e.d().isPresent() && !((rrl) this.ca.a()).e.d().get().w()) {
                        this.cf.setVisibility(0);
                        this.cf.setText(this.dd.z(((rrl) this.ca.a()).e.d().get().F().a));
                    } else {
                        this.cf.setVisibility(8);
                    }
                }
            }
        }
    }

    public final void aH(MessageCoreData messageCoreData, boolean z) {
        alvw d2 = a.d();
        d2.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d2;
        alvgVar.X(ydl.p, this.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "updateDraft", 4831, "ConversationFragmentPeer.java")).q("ConversationFragment: DraftDataService : replace with new incoming data");
        Q(new ive(messageCoreData, z, 0), new ivo(this, messageCoreData, z, 1));
    }

    public final void aI() {
        if (yig.b() && this.ca.g() && this.J.get() != null) {
            Q(new ive(this, ((zxy) this.dx.b()).q(), 2), new ivn(13));
        }
    }

    public final void aJ(boolean z) {
        int systemWindowInsetTop;
        if (this.bX != null) {
            WindowInsets windowInsets = this.A;
            if (windowInsets == null) {
                systemWindowInsetTop = 0;
            } else {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            }
            int dimensionPixelSize = this.bR.getResources().getDimensionPixelSize(R.dimen.message_padding_default);
            itb itbVar = this.bX;
            int i = systemWindowInsetTop + this.cu + this.cv + dimensionPixelSize;
            MessageListRecyclerView messageListRecyclerView = itbVar.ao;
            if (messageListRecyclerView != null && i != messageListRecyclerView.getPaddingTop()) {
                ValueAnimator valueAnimator = itbVar.aA;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (z) {
                    itbVar.aA = ValueAnimator.ofInt(itbVar.ao.getPaddingTop(), i);
                    itbVar.aA.addUpdateListener(new qu(itbVar, 9, null));
                    itbVar.aA.setDuration(300L);
                    itbVar.aA.start();
                    return;
                }
                int paddingTop = itbVar.ao.getPaddingTop();
                itbVar.ao.setPadding(0, i, 0, itbVar.f.z().getDimensionPixelOffset(R.dimen.message_list_padding_bottom));
                MessageListRecyclerView messageListRecyclerView2 = itbVar.ao;
                messageListRecyclerView2.scrollBy(0, paddingTop - messageListRecyclerView2.getPaddingTop());
            }
        }
    }

    public final void aK(int i) {
        View a2;
        int dimensionPixelSize;
        if (this.bX != null && !this.di) {
            if (((Boolean) ((utz) zxh.a.get()).e()).booleanValue()) {
                zxg zxgVar = this.bW;
                zxh zxhVar = null;
                if (zxgVar != null && zxgVar.aw()) {
                    zxhVar = zxgVar.E();
                }
                if (zxhVar != null && (a2 = zxh.a((zxg) zxhVar.b.b())) != null && a2.getVisibility() == 0) {
                    View a3 = zxh.a((zxg) zxhVar.b.b());
                    if (a3 != null && a3.getHeight() > 0) {
                        dimensionPixelSize = a3.getHeight();
                    } else {
                        dimensionPixelSize = ((zxg) zxhVar.b.b()).z().getDimensionPixelSize(R.dimen.conv_bottom_bar_height);
                    }
                    i += dimensionPixelSize;
                }
            }
            xvy xvyVar = this.dA;
            if (xvyVar != null) {
                int i2 = 0;
                if (xvyVar.h() && xvyVar.h()) {
                    i2 = xvyVar.b().getHeight();
                }
                i += i2;
            }
            itb itbVar = this.bX;
            itbVar.aq.k(i);
            nt ntVar = itbVar.ao.C;
            if (ntVar instanceof irw) {
                ((irw) ntVar).h = i;
            }
        }
    }

    public final void aL() {
        boolean z;
        ParticipantsTable.BindData a2;
        if (this.u == null) {
            return;
        }
        boolean z2 = true;
        if (this.dp.d() && (a2 = ((rrl) this.ca.a()).e.a()) != null && a2.A() == tqr.VERIFICATION_VERIFIED) {
            z = true;
        } else {
            z = false;
        }
        MenuItem menuItem = this.u;
        if (!z && !this.dj) {
            z2 = false;
        }
        menuItem.setVisible(z2);
    }

    public final void aM(Menu menu, boolean z) {
        ArrayList arrayList;
        int i = 7;
        if (aW()) {
            rrl rrlVar = (rrl) this.ca.a();
            ArrayList f2 = rrlVar.e.f();
            if (((Boolean) yvr.a.e()).booleanValue() && this.dG.g()) {
                rsa rsaVar = rrlVar.e;
                ArrayList f3 = rsaVar.f();
                if (!f3.isEmpty() && !Collection.EL.stream(f3).anyMatch(new qxp(rsaVar, 4))) {
                    arrayList = new ArrayList();
                    int size = f3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(((msk) rsaVar.c.b()).s((ParticipantsTable.BindData) f3.get(i2)));
                    }
                } else {
                    arrayList = new ArrayList();
                }
                if (!arrayList.isEmpty() && !rrlVar.r() && !rrlVar.e.h() && z && !f2.isEmpty()) {
                    if (!aS() || !this.av.m()) {
                        MenuItem findItem = menu.findItem(R.id.action_video_call);
                        this.t = findItem;
                        if (findItem != null) {
                            boolean noneMatch = Collection.EL.stream(f2).noneMatch(new xdm((yvs) this.S.b(), 19));
                            this.t.setVisible(noneMatch);
                            if (noneMatch) {
                                if (Collection.EL.stream(f2).noneMatch(new xdm((yvs) this.S.b(), 20))) {
                                    this.Z.a();
                                    Optional b2 = ((yvs) this.S.b()).b();
                                    MenuItem menuItem = this.t;
                                    menuItem.getClass();
                                    b2.ifPresent(new ivp(menuItem, i));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        rrl rrlVar2 = (rrl) this.ca.a();
        ParticipantsTable.BindData a2 = rrlVar2.e.a();
        if (((Boolean) yvr.a.e()).booleanValue() && this.dG.g() && !rrlVar2.e.d().isEmpty() && !rrlVar2.r() && !rrlVar2.e.h() && z && a2 != null) {
            if (!aS() || !this.av.m()) {
                MenuItem findItem2 = menu.findItem(R.id.action_video_call);
                this.t = findItem2;
                if (findItem2 != null) {
                    boolean e2 = ((yvs) this.S.b()).e(a2);
                    this.t.setVisible(e2);
                    if (e2) {
                        this.O.e("Bugle.UI.VideoCallButton.Shown", a2.r());
                        if (((yvs) this.S.b()).h(a2)) {
                            this.Z.a();
                            if (yvs.f(a2.r()) && ((Boolean) yvr.b.e()).booleanValue()) {
                                Optional b3 = ((yvs) this.S.b()).b();
                                MenuItem menuItem2 = this.t;
                                menuItem2.getClass();
                                b3.ifPresent(new ivp(menuItem2, i));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void aN(rsr rsrVar) {
        if (!this.dE && this.dD && this.ch && this.ci) {
            this.dE = true;
            rrl rrlVar = (rrl) this.ca.a();
            xwe xweVar = this.dF;
            ConversationIdType conversationIdType = rrlVar.c;
            SelfIdentityId s = rsrVar.s();
            int q = rsrVar.q();
            int i = rrlVar.e.e;
            boolean z = rrlVar.j;
            ujv ujvVar = (ujv) xweVar.b.b();
            ujvVar.getClass();
            ryg rygVar = (ryg) xweVar.c.b();
            rygVar.getClass();
            xnv xnvVar = (xnv) xweVar.d.b();
            xnvVar.getClass();
            new LegacyGroupProtocolSwitchAction(xweVar.a, ujvVar, rygVar, xnvVar, conversationIdType, s, q, i, z).t();
        }
    }

    @Override // defpackage.zxa
    public final void aO(rsr rsrVar, boolean z, boolean z2) {
        Object obj;
        int i;
        boolean z3;
        ajgi ajgiVar;
        final AtomicBoolean atomicBoolean;
        mcp mcpVar;
        ajgi ajgiVar2;
        final Runnable runnable = (Runnable) G(new ivk(5), new ivk(6));
        boolean b2 = b();
        Activity q = q();
        mau mauVar = new mau(this, rsrVar, 1, null);
        int a2 = a();
        obj = mauVar.get();
        final Iterable iterable = (Iterable) obj;
        if (b2) {
            i = 4;
        } else {
            i = 3;
        }
        final int i2 = i;
        if (z && !b2 && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        final mcp mcpVar2 = this.dm;
        abbj abbjVar = this.aq;
        final int d2 = abbjVar.e.a(a2).d();
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        ajgi ajgiVar3 = new ajgi(q);
        ajgiVar3.x(R.string.mms_attachment_limit_reached);
        final int i3 = 0;
        final boolean z4 = z3;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: abbi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                if (i3 != 0) {
                    boolean z5 = z4;
                    int i5 = d2;
                    int i6 = i2;
                    mcpVar2.b(iterable, i6, i5, z5);
                    atomicBoolean2.set(true);
                    return;
                }
                boolean z6 = z4;
                int i7 = d2;
                int i8 = i2;
                mcpVar2.b(iterable, i8, i7, z6);
                atomicBoolean2.set(true);
            }
        };
        if (b2) {
            ajgiVar3.m(R.string.attachment_limit_reached_dialog_message_when_composing_rcs);
            ajgiVar3.t(android.R.string.ok, onClickListener);
            ajgiVar = ajgiVar3;
            atomicBoolean = atomicBoolean2;
            mcpVar = mcpVar2;
        } else if (z) {
            if (z2) {
                ajgiVar3.m(R.string.video_attachment_limit_exceeded_when_sending);
                ajgiVar2 = ajgiVar3;
                atomicBoolean = atomicBoolean2;
                mcpVar = mcpVar2;
            } else {
                ajgiVar3.m(R.string.attachment_limit_reached_dialog_message_when_sending);
                ajgiVar2 = ajgiVar3;
                atomicBoolean = atomicBoolean2;
                final boolean z5 = z3;
                mcpVar = mcpVar2;
                ajgiVar2.o(R.string.attachment_limit_reached_send_anyway, new aabt(abbjVar.i, "DialogUtils#warnOfExceedingMessageLimit", new DialogInterface.OnClickListener() { // from class: abbe
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        mcp.this.c(4, iterable, i2, d2, z5);
                        atomicBoolean.set(true);
                        runnable.run();
                    }
                }, 8));
            }
            final int i4 = 1;
            final mcp mcpVar3 = mcpVar;
            ajgiVar = ajgiVar2;
            final boolean z6 = z3;
            final AtomicBoolean atomicBoolean3 = atomicBoolean;
            ajgiVar.t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: abbi
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    if (i4 != 0) {
                        boolean z52 = z6;
                        int i5 = d2;
                        int i6 = i2;
                        mcpVar3.b(iterable, i6, i5, z52);
                        atomicBoolean3.set(true);
                        return;
                    }
                    boolean z62 = z6;
                    int i7 = d2;
                    int i8 = i2;
                    mcpVar3.b(iterable, i8, i7, z62);
                    atomicBoolean3.set(true);
                }
            });
        } else {
            ajgiVar = ajgiVar3;
            atomicBoolean = atomicBoolean2;
            mcpVar = mcpVar2;
            if (z2) {
                ajgiVar.m(R.string.video_attachment_limit_exceeded_when_sending);
            } else {
                ajgiVar.m(R.string.attachment_limit_reached_dialog_message_when_composing);
            }
            ajgiVar.t(android.R.string.ok, onClickListener);
        }
        final AtomicBoolean atomicBoolean4 = atomicBoolean;
        final mcp mcpVar4 = mcpVar;
        final boolean z7 = z3;
        ajgiVar.s(new DialogInterface.OnDismissListener() { // from class: abbf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (!atomicBoolean4.get()) {
                    boolean z8 = z7;
                    int i5 = d2;
                    int i6 = i2;
                    mcpVar4.c(3, iterable, i6, i5, z8);
                }
            }
        });
        ajgiVar.a();
        mcpVar.c(2, iterable, i2, d2, z3);
    }

    @Override // defpackage.zxa
    public final void aP() {
        Runnable runnable = (Runnable) G(new ivk(11), new ivk(12));
        Activity q = q();
        Runnable j = akto.j(runnable);
        ajgi ajgiVar = new ajgi(q);
        ajgiVar.m(R.string.warn_of_exceeding_sms_message_limit_to_emergency_number_dialog_message);
        ajgiVar.t(R.string.confirm_send_to_emergency_number, new aabt(this.aq.i, "DialogUtils#warnOfExceedingSmsMessageLengthToEmergencyNumber", new aajo(j, 10), 8));
        ajgiVar.o(R.string.cancel_send_to_emergency_number, new aala(6));
        ajgiVar.create().show();
    }

    public final void aQ() {
        ((abco) this.dn.b()).a();
    }

    public final void aR() {
        Q(new iry(this, 17), new iry(this, 18));
    }

    public final boolean aS() {
        return ((Boolean) H(new isa(14), new isa(15))).booleanValue();
    }

    @Override // defpackage.zxa, defpackage.aabz
    public final boolean aT() {
        return this.ca.g();
    }

    public final boolean aU() {
        return this.aE.isPresent();
    }

    public final boolean aV() {
        if (((Boolean) utw.p.e()).booleanValue() && bB()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aabz
    public final boolean aW() {
        return ((rrl) this.ca.a()).b.b();
    }

    @Override // defpackage.aabz
    public final boolean aX() {
        cj fe = this.M.fe();
        if (fe != null) {
            return yhx.d(fe, this.cM.a);
        }
        return false;
    }

    public final boolean aY() {
        MenuItem menuItem = this.q;
        if (menuItem != null && menuItem.isActionViewExpanded()) {
            return true;
        }
        return false;
    }

    public final boolean aZ() {
        return lga.q(this.dk, this.cM.a);
    }

    public final void aa() {
        qiu.h(((ksm) this.ah.b()).c(q(), "Messenger_conversation", this.bE));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void ab() {
        if (((Boolean) yig.d.e()).booleanValue()) {
            aair aairVar = this.cW;
            Optional ofNullable = Optional.ofNullable(aairVar.g.get(this.L));
            if (ofNullable.isPresent() && ((rrl) this.ca.a()).d && ((rrl) this.ca.a()).b.n) {
                aair aairVar2 = this.cW;
                ConversationIdType conversationIdType = this.L;
                String str = (String) aairVar2.c.remove(conversationIdType);
                aairVar2.g.remove(conversationIdType);
                if (str != null) {
                    ((ahiy) aairVar2.h).q(aktp.ag(null), aair.f(conversationIdType));
                }
                k((SuggestionData) ofNullable.get());
            }
        }
    }

    public final void ac() {
        cj fe;
        int a2 = a();
        if (!this.co && this.ca.g() && ((rrl) this.ca.a()).e.e > 1 && ((rrl) this.ca.a()).d && this.f2do.d(a2) && this.ch && (fe = this.M.fe()) != null && this.dr.e(fe, a2)) {
            if (!b()) {
                this.co = true;
            }
            View view = this.bR;
            view.getClass();
            view.post(new ivl(this, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ad() {
        byte b2;
        boolean r;
        String bs;
        int i;
        View.OnClickListener onClickListener;
        String n;
        List list;
        int i2;
        boolean g2;
        if (this.ca.g() && this.ci && this.dD && this.bJ == null) {
            boolean i3 = ((rrl) this.ca.a()).e.i();
            boolean r2 = ((rrl) this.ca.a()).r();
            int a2 = a();
            alvi alviVar = a;
            alvw g3 = alviVar.g();
            g3.X(alwp.a, "Bugle");
            ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onAllowReplyStateMaybeChanged", 5726, "ConversationFragmentPeer.java")).r("Calling onAllowReplyStateMaybeChanged with subId: %d", a2);
            boolean w = ((adjc) this.bA.b()).w(a2);
            int i4 = 1;
            int i5 = 0;
            if (r2 && (w || ((vrn) this.ae.a()).s())) {
                b2 = true;
            } else {
                b2 = false;
            }
            if (((rrl) this.ca.a()).p() && ((!r2 || b2 != false) && ((yjv) this.dv.b()).d())) {
                bz();
                return;
            }
            if (bb() && r2) {
                bz();
                if (a2 != -1 && bi(a2)) {
                    U(a2);
                    return;
                }
                return;
            }
            W();
            this.bX.v((int) this.M.z().getDimension(R.dimen.conversation_bottom_margin_without_compose));
            Snackbar snackbar = this.dz;
            if (snackbar != null) {
                ajly a3 = ajly.a();
                Object obj = a3.a;
                asqc asqcVar = snackbar.u;
                synchronized (obj) {
                    g2 = a3.g(asqcVar);
                }
                if (g2) {
                    return;
                }
            }
            rrl rrlVar = (rrl) this.ca.a();
            int i6 = 2;
            if (rrlVar.r() || ((rrlVar.b.d() && (i2 = rrlVar.b.g) != 2 && i2 != 8) || !((yjv) this.dv.b()).d() || rrlVar.e.i())) {
                String format = String.format((String) utw.t.e(), dzf.c(this.M.z().getConfiguration()).f(0));
                Activity q = q();
                ivq ivqVar = null;
                byte b3 = 0;
                byte b4 = 0;
                byte b5 = 0;
                byte b6 = 0;
                if (i3) {
                    Context x = this.M.x();
                    x.getClass();
                    bs = yyb.bs(x);
                    onClickListener = new jh(this, 18, b6 == true ? 1 : 0);
                    i = R.string.messaging_not_supported_with_short_code_snackbar_body;
                } else if (!((yjv) this.dv.b()).d()) {
                    bs = this.M.z().getString(R.string.requires_default_sms_change_button);
                    onClickListener = new jh(this, 19, b5 == true ? 1 : 0);
                    i = R.string.requires_default_sms_app_to_send;
                } else {
                    if (((okf) this.c.b()).a()) {
                        r = ((adjc) this.bA.b()).d(a()).b();
                    } else {
                        r = ((vrn) this.ae.a()).r();
                    }
                    if (r) {
                        bs = this.M.z().getString(R.string.rcs_reply_not_available_turn_on_label);
                        onClickListener = new iix(this, q, 3, b4 == true ? 1 : 0);
                        i = R.string.rcs_turned_off_from_preferences_v2;
                    } else if (((vrn) this.ae.a()).t()) {
                        Context x2 = this.M.x();
                        x2.getClass();
                        rrb rrbVar = this.ca;
                        bs = yyb.bs(x2);
                        if (((rrl) rrbVar.a()).r()) {
                            onClickListener = new ivq(this, q, format, i5);
                        } else {
                            onClickListener = new iix(this, q, 4, b3 == true ? 1 : 0);
                        }
                        i = R.string.rcs_not_supported_by_carrier;
                    } else {
                        Context x3 = this.M.x();
                        x3.getClass();
                        rrb rrbVar2 = this.ca;
                        bs = yyb.bs(x3);
                        if (((rrl) rrbVar2.a()).r()) {
                            ivqVar = new ivq(this, q, format, i6);
                        }
                        i = R.string.rcs_reply_not_available_message;
                        onClickListener = ivqVar;
                    }
                }
                View u = u();
                rrl rrlVar2 = (rrl) this.ca.a();
                ParticipantsTable.BindData a4 = rrlVar2.e.a();
                if (a4 == null) {
                    if (rrlVar2.b.c()) {
                        alvw i7 = alviVar.i();
                        i7.X(alwp.a, "Bugle");
                        alvg alvgVar = (alvg) i7;
                        alvgVar.X(ydl.p, this.L);
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "buildAvailabilityMessage", 5930, "ConversationFragmentPeer.java")).q("ConversationFragment: Participant data is expected in conversation");
                    }
                    n = rrlVar2.m();
                } else {
                    n = ((iew) this.dh.b()).n(a4, true);
                }
                Snackbar q2 = Snackbar.q(u, this.M.z().getString(i, n), -2);
                this.dz = q2;
                q2.m(this.bR.findViewById(R.id.input_manager_fragment));
                if (onClickListener != null) {
                    this.dz.s(bs, new akwb(this.aC, "ConversationFragmentPeer#shouldShowComposeDisabledMessage", onClickListener, i4));
                }
                Snackbar snackbar2 = this.dz;
                iwr iwrVar = new iwr();
                ajgl ajglVar = snackbar2.v;
                if (ajglVar != null && (list = snackbar2.s) != null) {
                    list.remove(ajglVar);
                }
                if (snackbar2.s == null) {
                    snackbar2.s = new ArrayList();
                }
                snackbar2.s.add(iwrVar);
                snackbar2.v = iwrVar;
                this.dz.i();
            }
        }
    }

    @Override // defpackage.aabz
    public final void ae() {
        Q(null, new ivc(this, 17));
        this.bS.addOnLayoutChangeListener(t());
    }

    @Override // defpackage.zxa
    public final void af() {
        this.cB.F();
        this.bX.i();
        l();
        if (!aV()) {
            R(new ivh(this, 9), null);
        }
    }

    public final void ag() {
        cj fe = this.M.fe();
        if (fe != null && !fe.isDestroyed()) {
            this.dD = true;
            aN((rsr) this.cl.a());
            ad();
            ab();
            itb itbVar = this.bX;
            if (itbVar.aO.a() == 1 && itbVar.aw != null) {
                List T = ((rry) itbVar.aO.b().iterator().next()).T();
                if (T.size() == 1) {
                    itbVar.aw = (MessagePartCoreData) T.get(0);
                } else if (!T.contains(itbVar.aw)) {
                    itbVar.i();
                }
            }
            ird irdVar = itbVar.aq;
            if (irdVar != null) {
                irdVar.c.q(0);
            }
            Y();
            lex lexVar = this.cB;
            lexVar.v.isPresent();
            lexVar.g();
            ixd n = lexVar.n();
            if (n != null && !n.bQ) {
                xzu xzuVar = n.ak;
                xzuVar.g(n.q(), xzuVar.f(n.L));
                n.bQ = true;
            }
            alvw f2 = a.f();
            f2.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) f2;
            alvgVar.X(ydl.p, this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onConversationMetadataUpdated", 4763, "ConversationFragmentPeer.java")).I("ConversationFragment: isRcsConversation: %s isRcsSendingEnabled: %s", ((rrl) this.ca.a()).j, ((rrl) this.ca.a()).s());
        }
    }

    @Override // defpackage.rsm
    public final void ai(rsr rsrVar, int i) {
        this.cl.e(rsrVar);
        rsr rsrVar2 = (rsr) this.cl.a();
        if (!this.ch) {
            this.ch = true;
        }
        alvw d2 = a.d();
        d2.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) d2;
        alvgVar.X(ydl.p, this.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "internalOnDraftChanged", 7157, "ConversationFragmentPeer.java")).q("ConversationFragment: onDraftChanged");
        ac();
        aN(rsrVar2);
        ar();
    }

    @Override // defpackage.zxa
    public final void aj() {
        if (((rrl) this.ca.a()).b.d()) {
            rrl rrlVar = (rrl) this.ca.a();
            ConversationIdType conversationIdType = rrlVar.c;
            boolean z = rrlVar.b.e;
            int i = 0;
            if (rrlVar.q(false)) {
                Q(new ivo(this, conversationIdType, z, i), new ivo(this, conversationIdType, z, 2));
            }
        } else {
            rrl rrlVar2 = (rrl) this.ca.a();
            final ConversationIdType conversationIdType2 = rrlVar2.c;
            final msh mshVar = (msh) rrlVar2.b.k.orElse(null);
            if (mshVar != null) {
                final boolean b2 = rrlVar2.b.b();
                final boolean z2 = rrlVar2.b.e;
                final int i2 = 1;
                Consumer consumer = new Consumer(this) { // from class: iva
                    public final /* synthetic */ ixd a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj) {
                        if (i2 != 0) {
                            int m = ((ila) obj).d().m();
                            ixd ixdVar = this.a;
                            boolean z3 = z2;
                            boolean z4 = b2;
                            ixdVar.cz.b(conversationIdType2, mshVar, z4, z3, m);
                            return;
                        }
                        int m2 = ((rsr) ((ComposeMessageView) obj).E().s().a()).m();
                        ixd ixdVar2 = this.a;
                        boolean z5 = z2;
                        boolean z6 = b2;
                        ixdVar2.cz.b(conversationIdType2, mshVar, z6, z5, m2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        if (i2 != 0) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                final int i3 = 0;
                Q(consumer, new Consumer(this) { // from class: iva
                    public final /* synthetic */ ixd a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj) {
                        if (i3 != 0) {
                            int m = ((ila) obj).d().m();
                            ixd ixdVar = this.a;
                            boolean z3 = z2;
                            boolean z4 = b2;
                            ixdVar.cz.b(conversationIdType2, mshVar, z4, z3, m);
                            return;
                        }
                        int m2 = ((rsr) ((ComposeMessageView) obj).E().s().a()).m();
                        ixd ixdVar2 = this.a;
                        boolean z5 = z2;
                        boolean z6 = b2;
                        ixdVar2.cz.b(conversationIdType2, mshVar, z6, z5, m2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        if (i3 != 0) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
            }
        }
        ad();
    }

    public final void ak(ammc ammcVar) {
        Q(null, new ilf(this, ammcVar, 14));
    }

    @Override // defpackage.vrl
    public final void am(vrm vrmVar) {
        xzw.b(new ivl(this, 8), 250L);
    }

    public final void an() {
        this.O.c("Bugle.UI.Conversations.ScrollToBottomButton.Click");
        itb itbVar = this.bX;
        itbVar.aB = true;
        itbVar.C.c(new ahlp(itbVar.aq.b(rvc.a)), itbVar.Z);
        V(false);
    }

    public final void ao() {
        this.bX.n();
        Q(null, new ivg(19));
    }

    @Override // defpackage.zxa
    public final void ap() {
        if (this.dB == 1) {
            az(0);
            aw(0, this.ab.f());
            this.cm = 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [msh, java.lang.Object] */
    @Override // defpackage.zxa
    public final void aq(boolean z) {
        aabs a2;
        by();
        albo.T(this.ca.g());
        if (this.ca.g()) {
            qwm j = ((rrl) this.ca.a()).j(i());
            if (j == null) {
                a2 = aabu.a(-1, null, z);
            } else {
                String h2 = j.h();
                if (h2 == null) {
                    xzb.n("Bugle", "subscriptionName is empty");
                    if (j.b().isPresent()) {
                        h2 = j.b().get().F().a;
                    } else {
                        h2 = String.valueOf(j.d());
                    }
                }
                a2 = aabu.a(j.e(), h2, z);
            }
            a2.aF(this.M);
            a2.q(this.M.H(), null);
        }
    }

    public final void ar() {
        ArrayList arrayList = new ArrayList();
        ryh ryhVar = this.aH;
        arrayList.addAll(ryhVar.a);
        ArrayList arrayList2 = new ArrayList();
        Object obj = ryhVar.b;
        ((ryi) obj).b().ifPresent(new rge(obj, arrayList2, 3));
        arrayList.addAll(arrayList2);
        Q(new ilf(this, arrayList, 9), new ilf(this, arrayList, 10));
    }

    public final void as() {
        if (this.cy != null) {
            Q(null, new ivc(this, 8));
            this.bS.removeOnLayoutChangeListener(this.cy);
        }
    }

    public final void at(rsr rsrVar) {
        xnv xnvVar = this.ab;
        long a2 = xnvVar.a();
        MessageCoreData u = rsrVar.u(xnvVar.f().toEpochMilli());
        mho mhoVar = (mho) this.X.b();
        rsrVar.x();
        mhoVar.ap(u);
        bx(u, a2);
    }

    @Override // defpackage.aabh
    public final void au(final long j, final long j2) {
        final int i = 1;
        final int i2 = 0;
        S(new Consumer() { // from class: ivr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void q(Object obj) {
                if (i != 0) {
                    ila ilaVar = (ila) obj;
                    alvi alviVar = ixd.a;
                    if (ilaVar != null) {
                        ilaVar.h(j, j2);
                        return;
                    }
                    return;
                }
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                alvi alviVar2 = ixd.a;
                if (composeMessageView != null) {
                    long j3 = j2;
                    composeMessageView.E().c.an(j, j3, 1, null);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                if (i != 0) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: ivr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void q(Object obj) {
                if (i2 != 0) {
                    ila ilaVar = (ila) obj;
                    alvi alviVar = ixd.a;
                    if (ilaVar != null) {
                        ilaVar.h(j, j2);
                        return;
                    }
                    return;
                }
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                alvi alviVar2 = ixd.a;
                if (composeMessageView != null) {
                    long j3 = j2;
                    composeMessageView.E().c.an(j, j3, 1, null);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                if (i2 != 0) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Deprecated
    public final void av(String str, String str2) {
        long a2 = this.ab.a();
        rsr D = D();
        D.Q(str);
        D.N(str2);
        MessageCoreData u = D.u(this.ab.f().toEpochMilli());
        mho mhoVar = (mho) this.X.b();
        D.x();
        mhoVar.ap(u);
        bx(u, a2);
    }

    public final void aw(int i, final Instant instant) {
        wzk wzkVar;
        final rrl rrlVar = (rrl) this.ca.a();
        final int a2 = a();
        if (!rrlVar.j) {
            return;
        }
        final ikl iklVar = rrlVar.b;
        if (i == 1) {
            wzkVar = wzk.ACTIVE;
        } else {
            wzkVar = wzk.IDLE;
        }
        final wzk wzkVar2 = wzkVar;
        final ijw ijwVar = this.cz;
        ((weq) ijwVar.o.get()).b(rrlVar, wzkVar2);
        aktp.ai(new ijt(ijwVar, a2, 0), ijwVar.c).i(new ancs() { // from class: iju
            /* JADX WARN: Type inference failed for: r11v11, types: [msh, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v2, types: [msh, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v4, types: [msh, java.lang.Object] */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                Optional empty;
                Object obj2;
                Optional of;
                if (!((Boolean) obj).booleanValue()) {
                    xyo c2 = ijw.a.c();
                    c2.H("Not sending a typing indicator because we should not share our typing status");
                    c2.q();
                    return aktp.ag(null);
                }
                ikl iklVar2 = iklVar;
                ijw ijwVar2 = ijw.this;
                if (iklVar2.b()) {
                    rrl rrlVar2 = rrlVar;
                    ikl iklVar3 = rrlVar2.b;
                    String str = iklVar3.o;
                    if (TextUtils.isEmpty(str)) {
                        xyo e2 = ijw.a.e();
                        e2.H("Not sending typing indicator because RCS conversation id is missing");
                        e2.b(iklVar3.b);
                        e2.q();
                        of = Optional.empty();
                    } else {
                        String str2 = iklVar3.p;
                        if (TextUtils.isEmpty(str2)) {
                            ConversationIdType conversationIdType = rrlVar2.c;
                            snf e3 = sni.e();
                            e3.w("getRcsConferenceUriFromDatabase");
                            e3.c(sni.c.ab);
                            e3.h(new ijs(conversationIdType, 2));
                            str2 = ((smr) ((sna) e3.b().n()).cP()).U();
                        }
                        if (TextUtils.isEmpty(str2)) {
                            xyo e4 = ijw.a.e();
                            e4.H("Not sending typing indicator because RCS conference URI is missing");
                            e4.b(iklVar3.b);
                            e4.f(str);
                            e4.q();
                            of = Optional.empty();
                        } else {
                            alob alobVar = new alob();
                            ArrayList f2 = rrlVar2.e.f();
                            int size = f2.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) f2.get(i2);
                                if (bindData.O() == null) {
                                    xyo e5 = ijw.a.e();
                                    e5.H("Ignoring participant with null normalized destination while sending typing indicator");
                                    e5.b(iklVar3.b);
                                    e5.f(str);
                                    e5.q();
                                } else {
                                    alobVar.h(((msk) ijwVar2.j.b()).q(bindData));
                                }
                            }
                            alog g2 = alobVar.g();
                            if (g2.isEmpty()) {
                                xyo e6 = ijw.a.e();
                                e6.H("Not sending typing indicator because no valid participant found in the conference");
                                e6.b(iklVar3.b);
                                e6.f(str);
                                e6.q();
                                of = Optional.empty();
                            } else {
                                of = Optional.of(((qnu) ijwVar2.g.b()).h(str, str2, g2));
                            }
                        }
                    }
                    if (of.isEmpty()) {
                        return aktp.ag(null);
                    }
                    obj2 = of.get();
                } else {
                    Optional optional = iklVar2.k;
                    boolean booleanValue = ((Boolean) new msn(15).get()).booleanValue();
                    if (!optional.isEmpty() && optional.get().o(booleanValue) != null) {
                        if (booleanValue) {
                            try {
                                if (optional.get().e().isPresent()) {
                                    Optional e7 = optional.get().e();
                                    ((qnu) ijwVar2.g.b()).getClass();
                                    empty = e7.map(new idc(7));
                                }
                            } catch (psr e8) {
                                xyo e9 = ijw.a.e();
                                e9.H("1-1 conversation has otherParticipantNormalizedDestination() that cannot be parsed.");
                                e9.r(e8);
                                empty = Optional.empty();
                            }
                        }
                        empty = optional.map(new lch(ijwVar2, booleanValue, 1));
                    } else {
                        ijw.a.q("1-1 conversation has empty otherParticipantNormalizedDestination().");
                        empty = Optional.empty();
                    }
                    if (empty.isEmpty()) {
                        return aktp.ag(null);
                    }
                    obj2 = (aoia) empty.get();
                }
                int i3 = a2;
                return ((zap) ijwVar2.f.b()).h(wzkVar2, (aoia) obj2, instant, i3);
            }
        }, ijwVar.c).k(qiu.b(), ijwVar.d);
    }

    public final void ax() {
        lex lexVar = this.cB;
        lexVar.v.isPresent();
        if (!lexVar.F && lexVar.b.hasWindowFocus()) {
            alvw g2 = a.g();
            g2.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) g2;
            alvgVar.X(ydl.p, this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "setConversationFocus", 3950, "ConversationFragmentPeer.java")).q("ConversationFragment: marking conversation as seen because setConversationFocus.");
            ((ubl) this.aB.b()).b(this.L);
            this.dt.f(this.L);
        }
    }

    @Override // defpackage.zxa
    public final void ay(boolean z) {
        boolean z2 = false;
        if (this.di && !z) {
            z2 = true;
        }
        this.di = z;
        if (z2) {
            if (!this.ca.g()) {
                alvw g2 = a.g();
                g2.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) g2;
                alvgVar.X(ydl.p, this.L);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "setIsAnimating", 7233, "ConversationFragmentPeer.java")).q("ConversationFragment: Fragment has been destroyed when animation ended");
                return;
            }
            Q(new ivp(this, 13), new iry(this, 20));
        }
    }

    public final void az(int i) {
        if (i != 0) {
            i = 1;
        }
        this.dB = i;
    }

    @Override // defpackage.rsn
    public final boolean b() {
        return ((rrl) this.ca.a()).s();
    }

    public final boolean ba() {
        lex lexVar = this.cB;
        lexVar.v.isPresent();
        if (lexVar.O == 3) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean bb() {
        if (((rrl) this.ca.a()).a() > 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zxa
    public final boolean bc() {
        return ((rrl) this.ca.a()).b.c();
    }

    public final boolean bd() {
        if (!ofn.a() || !((rrl) this.ca.a()).r() || ((rrl) this.ca.a()).b.s != mmy.c) {
            return false;
        }
        return true;
    }

    @Override // defpackage.aabz
    public final boolean be() {
        if (((rrl) this.ca.a()).e.a() != null) {
            ParticipantsTable.BindData a2 = ((rrl) this.ca.a()).e.a();
            a2.getClass();
            if (vcp.k(a2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.zxa
    public final boolean bf() {
        return this.aj.b(q());
    }

    public final boolean bg() {
        if (((rrl) this.ca.a()).b.m == 2) {
            return true;
        }
        return false;
    }

    public final boolean bh() {
        if (!ba() || !this.dy) {
            return false;
        }
        this.dy = false;
        return true;
    }

    public final boolean bi(int i) {
        if (be() && !((adjc) this.bA.b()).w(i)) {
            return true;
        }
        return false;
    }

    public final boolean bj() {
        return ((rrl) this.ca.a()).b.d;
    }

    @Override // defpackage.zxa
    public final jar bk() {
        return bl(true);
    }

    public final jar bl(boolean z) {
        da G = this.M.G();
        jao jaoVar = (jao) G.d(R.id.sim_picker_fragment);
        if (jaoVar == null && this.cj && z) {
            String a2 = this.L.a();
            jaoVar = new jao();
            apxh.e(jaoVar);
            aklt.b(jaoVar, a2);
            bd bdVar = new bd(G);
            bdVar.z(R.id.sim_picker_fragment, jaoVar);
            bdVar.b();
        }
        if (jaoVar != null) {
            return jaoVar.E();
        }
        return null;
    }

    public final void bn() {
        en j;
        cj fe = this.M.fe();
        if ((fe instanceof ex) && (j = ((ex) fe).j()) != null) {
            j.isShowing();
        }
    }

    public final void bo() {
        alvw g2 = a.g();
        g2.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) g2;
        alvgVar.X(ydl.p, this.L);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "logZeroStateSearchItemActionShowAsActionState", 3186, "ConversationFragmentPeer.java")).q("ConversationFragment: Setting search action showAsAction to SHOW_AS_ACTION_NEVER");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, zte] */
    public final void bq() {
        ((alwl) ((alwl) dg.g()).h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "setRecipientContainerHeight", 1745, "ConversationFragmentPeer.java")).u("setContainerHeight: recipientHeight=%d, actionBarHeight=%d", 0, this.cu);
        int i = this.cu;
        ?? r1 = this.cI.a;
        if (r1 != 0) {
            r1.e(i);
        }
    }

    public final void br(MenuItem menuItem) {
        if (menuItem == null) {
            return;
        }
        menuItem.setOnMenuItemClickListener(new aksh(this.aC, "ConversationFragmentPeer searchMenuItem onMenuItemClick", new pf(this, 1)));
    }

    public final void bu() {
        this.bE.getClass();
        q();
        irr irrVar = this.bX.aq.c;
        irrVar.d.getClass();
        int i = 0;
        while (true) {
            hk hkVar = irrVar.d;
            if (i < hkVar.g && ((rry) hkVar.d(i)).e.isEmpty()) {
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.zxa
    public final void bv(MessageCoreData messageCoreData) {
        View view;
        if (((Boolean) wsm.a.e()).booleanValue() && this.aO.isPresent()) {
            this.aQ.isPresent();
        }
        albo.U(false, "Cannot schedule message. Is the build misconfigured?");
        this.bX.i();
        l();
        if (!bf()) {
            aQ();
            return;
        }
        if (!bA()) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) i;
            alvgVar.X(ydl.p, this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "scheduleMessage", 5053, "ConversationFragmentPeer.java")).q("ConversationFragment: Message can't be scheduled: conversation participants not loaded");
            return;
        }
        if (xwr.h(q()) && (view = this.bR) != null) {
            xwr.f(view, ((lza) this.aQ.get()).d());
        }
        this.ay.j(new ahlp(((wtg) this.aO.get()).a()), new ahlp(messageCoreData), this.l);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03f0 A[Catch: all -> 0x04a5, TRY_LEAVE, TryCatch #2 {all -> 0x04a5, blocks: (B:105:0x03e2, B:107:0x03f0), top: B:104:0x03e2, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0419 A[Catch: all -> 0x04c3, TRY_LEAVE, TryCatch #1 {all -> 0x04c3, blocks: (B:28:0x00d0, B:29:0x00d9, B:39:0x00f1, B:56:0x0126, B:58:0x012d, B:60:0x020f, B:63:0x021f, B:65:0x023c, B:68:0x0264, B:69:0x026b, B:71:0x0272, B:72:0x02a9, B:73:0x02c5, B:75:0x02cb, B:77:0x02d7, B:79:0x02dd, B:84:0x02ec, B:85:0x02fc, B:88:0x0308, B:90:0x033d, B:92:0x0341, B:93:0x0348, B:95:0x0370, B:96:0x037a, B:98:0x0380, B:100:0x0398, B:103:0x03d9, B:109:0x0402, B:111:0x0419, B:114:0x0431, B:126:0x0440, B:125:0x043d, B:127:0x0441, B:192:0x0346, B:193:0x031f, B:195:0x0325, B:203:0x029e, B:207:0x0257, B:208:0x0267, B:210:0x0160, B:212:0x0169, B:213:0x0177, B:215:0x0182, B:217:0x018f, B:221:0x0199, B:223:0x019f, B:225:0x01a9, B:227:0x01af, B:228:0x01b2, B:230:0x01c1, B:234:0x01c6, B:237:0x01ce, B:238:0x01e6, B:240:0x01f0, B:241:0x01f6, B:113:0x041f, B:67:0x0250, B:119:0x0437), top: B:26:0x00ce, inners: #7, #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047c A[Catch: all -> 0x0499, TRY_LEAVE, TryCatch #9 {all -> 0x0499, blocks: (B:130:0x0449, B:132:0x0457, B:134:0x045f, B:136:0x0467, B:137:0x0476, B:139:0x047c), top: B:129:0x0449, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0341 A[Catch: all -> 0x04c3, TryCatch #1 {all -> 0x04c3, blocks: (B:28:0x00d0, B:29:0x00d9, B:39:0x00f1, B:56:0x0126, B:58:0x012d, B:60:0x020f, B:63:0x021f, B:65:0x023c, B:68:0x0264, B:69:0x026b, B:71:0x0272, B:72:0x02a9, B:73:0x02c5, B:75:0x02cb, B:77:0x02d7, B:79:0x02dd, B:84:0x02ec, B:85:0x02fc, B:88:0x0308, B:90:0x033d, B:92:0x0341, B:93:0x0348, B:95:0x0370, B:96:0x037a, B:98:0x0380, B:100:0x0398, B:103:0x03d9, B:109:0x0402, B:111:0x0419, B:114:0x0431, B:126:0x0440, B:125:0x043d, B:127:0x0441, B:192:0x0346, B:193:0x031f, B:195:0x0325, B:203:0x029e, B:207:0x0257, B:208:0x0267, B:210:0x0160, B:212:0x0169, B:213:0x0177, B:215:0x0182, B:217:0x018f, B:221:0x0199, B:223:0x019f, B:225:0x01a9, B:227:0x01af, B:228:0x01b2, B:230:0x01c1, B:234:0x01c6, B:237:0x01ce, B:238:0x01e6, B:240:0x01f0, B:241:0x01f6, B:113:0x041f, B:67:0x0250, B:119:0x0437), top: B:26:0x00ce, inners: #7, #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0370 A[Catch: all -> 0x04c3, TryCatch #1 {all -> 0x04c3, blocks: (B:28:0x00d0, B:29:0x00d9, B:39:0x00f1, B:56:0x0126, B:58:0x012d, B:60:0x020f, B:63:0x021f, B:65:0x023c, B:68:0x0264, B:69:0x026b, B:71:0x0272, B:72:0x02a9, B:73:0x02c5, B:75:0x02cb, B:77:0x02d7, B:79:0x02dd, B:84:0x02ec, B:85:0x02fc, B:88:0x0308, B:90:0x033d, B:92:0x0341, B:93:0x0348, B:95:0x0370, B:96:0x037a, B:98:0x0380, B:100:0x0398, B:103:0x03d9, B:109:0x0402, B:111:0x0419, B:114:0x0431, B:126:0x0440, B:125:0x043d, B:127:0x0441, B:192:0x0346, B:193:0x031f, B:195:0x0325, B:203:0x029e, B:207:0x0257, B:208:0x0267, B:210:0x0160, B:212:0x0169, B:213:0x0177, B:215:0x0182, B:217:0x018f, B:221:0x0199, B:223:0x019f, B:225:0x01a9, B:227:0x01af, B:228:0x01b2, B:230:0x01c1, B:234:0x01c6, B:237:0x01ce, B:238:0x01e6, B:240:0x01f0, B:241:0x01f6, B:113:0x041f, B:67:0x0250, B:119:0x0437), top: B:26:0x00ce, inners: #7, #8, #11 }] */
    /* JADX WARN: Type inference failed for: r0v115, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [armf, java.lang.Object] */
    @Override // defpackage.zxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bw(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r22, long r23, boolean r25, j$.util.Optional r26, j$.util.Optional r27) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixd.bw(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, long, boolean, j$.util.Optional, j$.util.Optional):void");
    }

    public final void bx(MessageCoreData messageCoreData, long j) {
        bw(messageCoreData, j, false, Optional.empty(), Optional.empty());
    }

    @Override // defpackage.inq
    public final int c(MessagePartCoreData messagePartCoreData) {
        return ((Integer) G(new ivj(this, messagePartCoreData, 4), new ivj(this, messagePartCoreData, 5))).intValue();
    }

    @Override // defpackage.inq
    public final EditText d() {
        return (EditText) (aV() ? new isa(10).apply(w()) : new isa(11).apply(this.bV));
    }

    @Override // defpackage.inq
    public final ioa e() {
        int i = 4;
        return new ioa(new gxy(this, i), new gvc(this, i), new gvc(this, 5), new gvc(this, 6));
    }

    @Override // defpackage.inq
    public final void f(MessagePartCoreData messagePartCoreData) {
        bC(null, messagePartCoreData);
    }

    @Override // defpackage.inq
    public final void g(String str) {
        bC(str, null);
    }

    @Override // defpackage.inq
    public final boolean h(MessagePartCoreData messagePartCoreData) {
        return ((Boolean) G(new ivi(messagePartCoreData, 4), new ivi(messagePartCoreData, 5))).booleanValue();
    }

    @Override // defpackage.isz
    public final SelfIdentityId i() {
        return (SelfIdentityId) G(new ivk(3), new ivk(4));
    }

    @Override // defpackage.isz
    public final Optional j() {
        return this.cB.e();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [armf, java.lang.Object] */
    @Override // defpackage.isz
    public final void k(SuggestionData suggestionData) {
        da daVar;
        String t;
        aqbl aqblVar;
        aqbl aqblVar2;
        aqbl aqblVar3;
        Uri.Builder buildUpon;
        aqbi aqbiVar;
        qdq qdqVar = new qdq(this, null);
        jbq B = B(suggestionData);
        if (B != null) {
            this.ay.j(ahlp.k(B.b()), new ahlp(suggestionData), this.h);
        }
        aagg aaggVar = this.cD;
        suggestionData.getClass();
        if (suggestionData instanceof SmartSuggestionData) {
            yzk yzkVar = (yzk) aaggVar.d.b();
            ?? r3 = yzkVar.d;
            ?? r4 = yzkVar.k;
            ?? r5 = yzkVar.j;
            ?? r6 = yzkVar.g;
            ?? r7 = yzkVar.h;
            ?? r8 = yzkVar.c;
            ?? r9 = yzkVar.i;
            ?? r10 = yzkVar.e;
            ?? r11 = yzkVar.b;
            ?? r2 = yzkVar.l;
            ?? r22 = yzkVar.a;
            ?? r23 = yzkVar.o;
            ?? b2 = yzkVar.n.b();
            b2.getClass();
            ?? b3 = yzkVar.f.b();
            b3.getClass();
            aafp aafpVar = new aafp(r3, r4, r5, r6, r7, r8, r9, r10, r11, r2, r22, r23, b2, b3, yzkVar.m, qdqVar);
            if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
                SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
                aqcy aqcyVar = smartSuggestionItemSuggestionData.c.e;
                if (aqcyVar == null) {
                    aqcyVar = aqcy.b;
                }
                aqbc b4 = aqbc.b(aqcyVar.k);
                if (b4 == null) {
                    b4 = aqbc.UNRECOGNIZED;
                }
                int ordinal = b4.ordinal();
                if (ordinal != 1 && ordinal != 2) {
                    if (ordinal != 3) {
                        int i = 6;
                        int i2 = 13;
                        if (ordinal != 5) {
                            if (ordinal != 6) {
                                int i3 = 19;
                                if (ordinal != 7) {
                                    if (ordinal != 9) {
                                        if (ordinal != 10) {
                                            if (ordinal != 12) {
                                                if (ordinal != 13) {
                                                    if (ordinal != 15 && ordinal != 16) {
                                                        if (ordinal != 22) {
                                                            if (ordinal == 23) {
                                                                aqcz aqczVar = smartSuggestionItemSuggestionData.c;
                                                                if (aqczVar.c == 19) {
                                                                    aqbi aqbiVar2 = (aqbi) aqczVar.d;
                                                                    aqbiVar2.getClass();
                                                                    if (defpackage.d.F("android.intent.action.INSERT", "android.intent.action.VIEW")) {
                                                                        buildUpon = CalendarContract.CONTENT_URI.buildUpon();
                                                                    } else {
                                                                        buildUpon = CalendarContract.Events.CONTENT_URI.buildUpon();
                                                                    }
                                                                    Intent intent = new Intent("android.intent.action.INSERT");
                                                                    aqcz aqczVar2 = smartSuggestionItemSuggestionData.c;
                                                                    if (aqczVar2.c == 19) {
                                                                        aqbiVar = (aqbi) aqczVar2.d;
                                                                    } else {
                                                                        aqbiVar = aqbi.a;
                                                                    }
                                                                    aqbiVar.getClass();
                                                                    if ((aqbiVar.b & 1) != 0) {
                                                                        Calendar calendar = Calendar.getInstance();
                                                                        boolean z = false;
                                                                        calendar.set(13, 0);
                                                                        calendar.set(14, 0);
                                                                        aqgf aqgfVar = aqbiVar.d;
                                                                        if (aqgfVar == null) {
                                                                            aqgfVar = aqgf.a;
                                                                        }
                                                                        aqgfVar.getClass();
                                                                        int i4 = aqgfVar.b;
                                                                        if ((i4 & 2) != 0) {
                                                                            z = true;
                                                                        }
                                                                        int i5 = i4 & 1;
                                                                        if (z && i5 != 0) {
                                                                            calendar.getClass();
                                                                            apun apunVar = aqgfVar.c;
                                                                            if (apunVar == null) {
                                                                                apunVar = apun.a;
                                                                            }
                                                                            apunVar.getClass();
                                                                            aabr.E(calendar, apunVar);
                                                                            apur apurVar = aqgfVar.d;
                                                                            if (apurVar == null) {
                                                                                apurVar = apur.a;
                                                                            }
                                                                            apurVar.getClass();
                                                                            aabr.F(calendar, apurVar);
                                                                        } else if (z) {
                                                                            calendar.getClass();
                                                                            apur apurVar2 = aqgfVar.d;
                                                                            if (apurVar2 == null) {
                                                                                apurVar2 = apur.a;
                                                                            }
                                                                            apurVar2.getClass();
                                                                            aabr.F(calendar, apurVar2);
                                                                        } else if (i5 != 0) {
                                                                            calendar.clear();
                                                                            calendar.getClass();
                                                                            apun apunVar2 = aqgfVar.c;
                                                                            if (apunVar2 == null) {
                                                                                apunVar2 = apun.a;
                                                                            }
                                                                            apunVar2.getClass();
                                                                            aabr.E(calendar, apunVar2);
                                                                        }
                                                                        if (defpackage.d.F("android.intent.action.INSERT", "android.intent.action.VIEW")) {
                                                                            buildUpon.appendPath("time");
                                                                            ContentUris.appendId(buildUpon, calendar.getTimeInMillis()).getClass();
                                                                        } else {
                                                                            intent.putExtra("beginTime", calendar.getTimeInMillis()).getClass();
                                                                        }
                                                                    }
                                                                    intent.setData(buildUpon.build());
                                                                    aqbiVar2.c.getClass();
                                                                    String str = aqbiVar2.e;
                                                                    str.getClass();
                                                                    if (!TextUtils.isEmpty(str)) {
                                                                        intent.putExtra("eventLocation", str);
                                                                    }
                                                                    intent.putExtra("description", ((Context) aafpVar.b.b()).getString(R.string.calendar_suggestion_event_description));
                                                                    aozy createBuilder = aegt.a.createBuilder();
                                                                    if (!createBuilder.b.isMutable()) {
                                                                        createBuilder.u();
                                                                    }
                                                                    aegt aegtVar = (aegt) createBuilder.b;
                                                                    aegtVar.b |= 2048;
                                                                    aegtVar.g = true;
                                                                    aozy createBuilder2 = aegs.a.createBuilder();
                                                                    String string = ((Context) aafpVar.b.b()).getString(R.string.calendar_suggestion_event_chat_title);
                                                                    if (!createBuilder2.b.isMutable()) {
                                                                        createBuilder2.u();
                                                                    }
                                                                    aegs aegsVar = (aegs) createBuilder2.b;
                                                                    string.getClass();
                                                                    aegsVar.b = 16 | aegsVar.b;
                                                                    aegsVar.c = string;
                                                                    if (!createBuilder.b.isMutable()) {
                                                                        createBuilder.u();
                                                                    }
                                                                    aegt aegtVar2 = (aegt) createBuilder.b;
                                                                    aegs aegsVar2 = (aegs) createBuilder2.s();
                                                                    aegsVar2.getClass();
                                                                    aegtVar2.h = aegsVar2;
                                                                    aegtVar2.b |= 8192;
                                                                    if (intent.hasExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                                                                        String stringExtra = intent.getStringExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
                                                                        stringExtra.getClass();
                                                                        if (!createBuilder.b.isMutable()) {
                                                                            createBuilder.u();
                                                                        }
                                                                        aegt aegtVar3 = (aegt) createBuilder.b;
                                                                        aegtVar3.b = 2 | aegtVar3.b;
                                                                        aegtVar3.c = stringExtra;
                                                                    }
                                                                    if (intent.hasExtra("eventLocation")) {
                                                                        String stringExtra2 = intent.getStringExtra("eventLocation");
                                                                        stringExtra2.getClass();
                                                                        if (!createBuilder.b.isMutable()) {
                                                                            createBuilder.u();
                                                                        }
                                                                        aegt aegtVar4 = (aegt) createBuilder.b;
                                                                        aegtVar4.b |= 64;
                                                                        aegtVar4.e = stringExtra2;
                                                                    }
                                                                    if (intent.hasExtra("description")) {
                                                                        String stringExtra3 = intent.getStringExtra("description");
                                                                        stringExtra3.getClass();
                                                                        if (!createBuilder.b.isMutable()) {
                                                                            createBuilder.u();
                                                                        }
                                                                        aegt aegtVar5 = (aegt) createBuilder.b;
                                                                        aegtVar5.b |= 128;
                                                                        aegtVar5.f = stringExtra3;
                                                                    }
                                                                    if (intent.hasExtra("beginTime")) {
                                                                        long longExtra = intent.getLongExtra("beginTime", 0L);
                                                                        if (!createBuilder.b.isMutable()) {
                                                                            createBuilder.u();
                                                                        }
                                                                        aegt aegtVar6 = (aegt) createBuilder.b;
                                                                        aegtVar6.b |= 8;
                                                                        aegtVar6.d = longExtra;
                                                                    }
                                                                    apag s = createBuilder.s();
                                                                    s.getClass();
                                                                    intent.putExtra("proto", ((aegt) s).toByteArray());
                                                                    qdq qdqVar2 = aafpVar.o;
                                                                    String str2 = smartSuggestionItemSuggestionData.a;
                                                                    ixd ixdVar = (ixd) qdqVar2.a;
                                                                    ixdVar.H = str2;
                                                                    ixdVar.M.startActivityForResult(intent, 5001);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        ((xwj) aafpVar.l.b()).b(smartSuggestionItemSuggestionData, aqax.CONVERSATION_VIEW);
                                                        return;
                                                    }
                                                } else {
                                                    ParticipantsTable.BindData a2 = aafpVar.o.x().e.a();
                                                    a2.getClass();
                                                    qiu.h(((yvs) aafpVar.k.b()).a(a2));
                                                    return;
                                                }
                                            } else {
                                                smartSuggestionItemSuggestionData.l();
                                                smartSuggestionItemSuggestionData.n();
                                                return;
                                            }
                                        } else {
                                            String h2 = smartSuggestionItemSuggestionData.h();
                                            aqcz aqczVar3 = smartSuggestionItemSuggestionData.c;
                                            if (aqczVar3.c == 11) {
                                                aqblVar = (aqbl) aqczVar3.d;
                                            } else {
                                                aqblVar = aqbl.a;
                                            }
                                            String str3 = aqblVar.c;
                                            str3.getClass();
                                            aqcz aqczVar4 = smartSuggestionItemSuggestionData.c;
                                            int i6 = aqczVar4.c;
                                            if (i6 == 11) {
                                                aqblVar2 = (aqbl) aqczVar4.d;
                                            } else {
                                                aqblVar2 = aqbl.a;
                                            }
                                            boolean z2 = aqblVar2.d;
                                            if (i6 == 11) {
                                                aqblVar3 = (aqbl) aqczVar4.d;
                                            } else {
                                                aqblVar3 = aqbl.a;
                                            }
                                            String str4 = aqblVar3.e;
                                            str4.getClass();
                                            ((lzv) aafpVar.h.b()).F(aafpVar.o.w(), str3, h2, z2, str4);
                                            return;
                                        }
                                    } else {
                                        ((ixd) aafpVar.o.a).aA(false);
                                        return;
                                    }
                                } else {
                                    if (((Boolean) ((utz) xww.b.get()).e()).booleanValue()) {
                                        zfh zfhVar = (zfh) aafpVar.m.b();
                                        cj w = aafpVar.o.w();
                                        Activity e2 = abbu.e(w);
                                        if (e2 != null) {
                                            if (e2 instanceof ex) {
                                                daVar = ((ex) e2).a();
                                            } else if (e2 instanceof cj) {
                                                daVar = ((cj) e2).a();
                                            } else {
                                                daVar = null;
                                            }
                                            if (daVar != null) {
                                                if (((Boolean) ((utz) xww.c.get()).e()).booleanValue()) {
                                                    if (smartSuggestionItemSuggestionData.t().length() == 0) {
                                                        t = smartSuggestionItemSuggestionData.i();
                                                    } else {
                                                        t = smartSuggestionItemSuggestionData.t();
                                                    }
                                                    Intent addFlags = new Intent("android.intent.action.WEB_SEARCH").putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, t).addFlags(32768);
                                                    addFlags.getClass();
                                                    akto.n(w, addFlags);
                                                    return;
                                                }
                                                ((Optional) ((apxx) zfhVar.a).a).ifPresent(new aacm(new ynn(smartSuggestionItemSuggestionData, 17), i3));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                int i7 = 0;
                                String j = smartSuggestionItemSuggestionData.j();
                                if (TextUtils.isEmpty(j)) {
                                    ((qky) aafpVar.c.b()).a(aafpVar.o.v());
                                    return;
                                } else {
                                    new abcd((abac) aafpVar.i.b(), j, new aafo(aafpVar, i7)).e(new Void[0]);
                                    return;
                                }
                            }
                        } else {
                            if (((yio) aafpVar.g.b()).c()) {
                                String m = smartSuggestionItemSuggestionData.m();
                                if (aafpVar.o.x().s()) {
                                    ((lzv) aafpVar.h.b()).E(aafpVar.o.v(), m, 0, 0, ((ydf) aafpVar.d.b()).b(-1), amqe.SUGGESTION);
                                    return;
                                }
                                xbf xbfVar = (xbf) aafpVar.e.b();
                                qdq qdqVar3 = aafpVar.o;
                                xbe a3 = xbfVar.a(qdqVar3.x().c((SelfIdentityId) ((ixd) qdqVar3.a).G(new ivk(i2), new ivi(qdqVar3, i))));
                                ((lzv) aafpVar.h.b()).E(aafpVar.o.v(), m, a3.c(), a3.b(), a3.d(), amqe.SUGGESTION);
                                return;
                            }
                            return;
                        }
                    } else {
                        aafpVar.c();
                        return;
                    }
                }
                aafpVar.b(smartSuggestionItemSuggestionData);
                return;
            }
            aafp.a.m("Non P2P suggestion passed to SmartSuggestionAcceptor");
            throw new IllegalStateException("Non P2P suggestion passed to SmartSuggestionAcceptor");
        }
        if (suggestionData instanceof RbmSuggestionData) {
            aair aairVar = (aair) aaggVar.a.b();
            aagc aagcVar = (aagc) aairVar.d.b();
            ?? r42 = aairVar.g;
            armf armfVar = aairVar.a;
            ?? r62 = aairVar.e;
            abbu abbuVar = (abbu) aairVar.f.b();
            abbuVar.getClass();
            mbl mblVar = (mbl) aairVar.h.b();
            mblVar.getClass();
            Optional optional = (Optional) aairVar.c.b();
            optional.getClass();
            new aafn(aagcVar, r42, armfVar, r62, abbuVar, mblVar, optional, (xve) aairVar.b.b(), qdqVar).a(suggestionData);
            return;
        }
        String format = String.format("Cannot determine how to handle suggestion %s", Arrays.copyOf(new Object[]{suggestionData}, 1));
        format.getClass();
        throw new IllegalStateException(format);
    }

    @Override // defpackage.isz
    public final void l() {
        this.cB.f();
    }

    @Override // defpackage.isz
    public final void m(MessageIdType messageIdType) {
        if (bf()) {
            alvw g2 = a.g();
            g2.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) g2;
            alvgVar.X(ydl.p, this.L);
            alvgVar.X(ydl.b, messageIdType);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "retrySend", 5411, "ConversationFragmentPeer.java")).q("ConversationFragment: UI initiated message resending");
            if (bA()) {
                ((mkp) this.du.b()).e(messageIdType, ((rrl) this.ca.a()).l(amgj.MESSAGE_SEND_RETRY, this.ab.f().toEpochMilli()));
                return;
            }
            return;
        }
        aQ();
    }

    @Override // defpackage.zqe
    public final boolean n() {
        throw null;
    }

    @Override // defpackage.isz
    public final void o() {
        Object ixwVar;
        ConversationScrollToBottomButton conversationScrollToBottomButton = this.cs;
        if (conversationScrollToBottomButton != null) {
            iyc E = conversationScrollToBottomButton.E();
            int i = this.ct;
            if (i == 0) {
                ixwVar = ixx.a;
            } else {
                ixwVar = new ixw(i);
            }
            E.i.d(iyc.a[0], ixwVar);
            iyc E2 = this.cs.E();
            if (!E2.b.isShown()) {
                E2.a().start();
            }
            aahp aahpVar = (aahp) this.bd.b();
            if (!aahpVar.f) {
                aahpVar.e.h(false);
            }
        }
    }

    @Override // defpackage.aabz
    public final long p() {
        return this.R.b(-1);
    }

    @Override // defpackage.zxa
    public final Activity q() {
        return this.M.F();
    }

    public final BroadcastReceiver r() {
        if (this.dC == null) {
            this.dC = new iwd(this);
        }
        return this.dC;
    }

    public final Intent s() {
        cj fe = this.M.fe();
        if (fe == null) {
            return null;
        }
        return fe.getIntent();
    }

    public final View.OnLayoutChangeListener t() {
        if (this.cy == null) {
            this.cy = new fyc(this, 6);
        }
        return this.cy;
    }

    public final View u() {
        return (View) G(new isa(7), new isa(8));
    }

    @Override // defpackage.zqf
    public final void v() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    public final ila w() {
        da G = this.M.G();
        cg d2 = G.d(R.id.draft_editor_fragment);
        if (d2 == null && this.cj) {
            ajwt ajwtVar = this.bE;
            ConversationIdType conversationIdType = this.L;
            alwo alwoVar = ilw.a;
            String a2 = conversationIdType.a();
            ikz ikzVar = new ikz();
            apxh.e(ikzVar);
            aklw.b(ikzVar, ajwtVar);
            aklt.b(ikzVar, a2);
            ikzVar.a.c(new iwu(this, ikzVar, 1));
            bd bdVar = new bd(G);
            bdVar.z(R.id.draft_editor_fragment, ikzVar);
            bdVar.b();
            lex lexVar = this.cB;
            ila x = x(ikzVar);
            lexVar.v.isPresent();
            ibi ibiVar = (ibi) lexVar.j.b();
            MainActivity mainActivity = lexVar.b;
            ibi ibiVar2 = (ibi) ibiVar.a.b();
            ibiVar2.getClass();
            lexVar.L = new ibp(ibiVar2, mainActivity, x);
            d2 = ikzVar;
        }
        if (d2 != null) {
            return x(d2);
        }
        return null;
    }

    public final inn y() {
        if (bB()) {
            cg d2 = this.M.G().d(R.id.input_manager_fragment);
            if (d2 == null && this.cj) {
                ajwt ajwtVar = this.bE;
                ConversationIdType conversationIdType = this.L;
                alwo alwoVar = inh.a;
                String a2 = conversationIdType.a();
                ing ingVar = new ing();
                apxh.e(ingVar);
                aklw.b(ingVar, ajwtVar);
                aklt.b(ingVar, a2);
                bd bdVar = new bd(this.M.G());
                bdVar.z(R.id.input_manager_fragment, ingVar);
                bdVar.b();
                d2 = ingVar;
            }
            if (d2 != null) {
                inn j = ipq.j(d2);
                j.q(A());
                return j;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.rsm
    public final void ah() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a implements akbp<apdj<lym>, MessageCoreData> {
        public a() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ixd.this.aQ.ifPresent(new Consumer() { // from class: ixc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj2) {
                    ixd.this.av.k(((lza) obj2).a());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((uvi) ixd.this.aW.b()).b(th).k(qiu.b(), andi.a);
            alvw i = ixd.a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) i).g(th);
            alvgVar.X(ydl.p, ixd.this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$EditScheduledMessageCallback", "onFailure", 808, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to edit message.");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Instant ofEpochMilli = Instant.ofEpochMilli(((lym) ((apdj) obj).a(lym.a, aozs.a())).c);
            ixd.this.Q(new ivh(ofEpochMilli, 3), new ivh(ofEpochMilli, 4));
            ixd.this.aH((MessageCoreData) obj2, false);
            ixd.this.aT.ifPresent(new ixe(1));
            ixd.this.aQ.ifPresent(new Consumer() { // from class: ixb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj3) {
                    View view;
                    lza lzaVar = (lza) obj3;
                    ixd.a aVar = ixd.a.this;
                    if (xwr.h(ixd.this.q()) && (view = ixd.this.bR) != null) {
                        xwr.f(view, lzaVar.b());
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class b implements akbp<String, ScheduledSendTable.BindData> {
        public b() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ixd.this.av.k(R.string.send_message_failure);
            ((uvi) ixd.this.aW.b()).b(th).k(qiu.b(), andi.a);
            xzb.p("Bugle", th, "Failed to queue scheduled message for immediate send.");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            View view;
            if (xwr.h(ixd.this.q()) && (view = ixd.this.bR) != null) {
                xwr.f(view, R.string.sending_message);
            }
            ixd.this.aS.ifPresent(new ixe(0));
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class c implements akbp<Void, Boolean> {
        public c() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            alvw h = ixd.a.h();
            h.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) h).g(th);
            alvgVar.X(ydl.p, ixd.this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$PermissionFutureCallback", "onFailure", 655, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to get permission promotion info from settings.");
            ((mgv) ixd.this.Q.b()).b(mgv.A);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj2;
            if (bool != null && bool.booleanValue()) {
                ixd.this.aA(true);
                return;
            }
            yjf yjfVar = ixd.this.az;
            boolean b = yjfVar.b();
            if (yjfVar.n() && b) {
                ixd.this.aA(true);
                return;
            }
            ((mgv) ixd.this.Q.b()).b(mgv.A);
            ((yjl) ixd.this.an.b()).f(yjh.CAMERA_GALLERY_ROLL_PERMISSIONS, new ixf(this));
            yyb.aO(akul.g(((aiwu) ixd.this.cT.a).b(new woc(10), andi.a)), "Bugle", "Fail to update cameraGalleryAlreadyPromotedPermissions");
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class d implements akbp<MessageCoreData, ScheduledSendTable.BindData> {
        public d() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ixd.this.aQ.ifPresent(new Consumer() { // from class: ixg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj2) {
                    ixd.this.av.k(((lza) obj2).c());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((uvi) ixd.this.aW.b()).b(th).k(qiu.b(), andi.a);
            alvw i = ixd.a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) i).g(th);
            alvgVar.X(ydl.p, ixd.this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$ScheduleMessageCallback", "onFailure", 759, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to schedule message.");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ixd.this.aQ.ifPresent(new Consumer() { // from class: ixh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj3) {
                    View view;
                    lza lzaVar = (lza) obj3;
                    ixd.d dVar = ixd.d.this;
                    if (xwr.h(ixd.this.q()) && (view = ixd.this.bR) != null) {
                        xwr.f(view, lzaVar.e());
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ixd.this.aP.ifPresent(new Consumer() { // from class: ixi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj3) {
                    ixd.this.aR.ifPresent(new ixj((lys) obj3, 1));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class f implements akbp<String, List<String>> {
        public f() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            alvw i = ixd.a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) i).g(th);
            alvgVar.X(ydl.p, ixd.this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$SearchQueryChangeCallback", "onFailure", 723, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to get search results");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ixd.this.aE.ifPresent(new ixj((List) obj2, 0));
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class g implements akbp<SuggestionData, apdj> {
        public g() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            alvw h = ixd.a.h();
            h.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) h).g(th);
            alvgVar.X(ydl.p, ixd.this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$SuggestionBehaviorCallback", "onFailure", 677, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to run conversation suggestion.");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            jbq B = ixd.this.B((SuggestionData) obj);
            if (B != null) {
                B.a();
            }
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class h implements akbp<Void, Boolean> {
        public h() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            ixd.this.av.k(R.string.activity_not_found_message);
            alvw h = ixd.a.h();
            h.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) h).g(th);
            alvgVar.X(ydl.p, ixd.this.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$VideoCallCallback", "onFailure", 702, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to start video call.");
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj2;
            if (bool != null && bool.booleanValue()) {
                alvw h = ixd.a.h();
                h.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) h;
                alvgVar.X(ydl.p, ixd.this.L);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$VideoCallCallback", "onSuccess", 691, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to start video call.");
                return;
            }
            ixd.this.av.k(R.string.activity_not_found_message);
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    }

    @Override // defpackage.rsm
    public final void al(rsr rsrVar) {
    }

    @Override // defpackage.rsm
    public final void bp(rsr rsrVar) {
    }
}
