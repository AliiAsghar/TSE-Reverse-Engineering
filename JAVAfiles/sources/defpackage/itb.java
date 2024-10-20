package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.common.PinnedLinearLayoutManager;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiPredicate$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itb implements aack, iru {
    public static final utz a = uuh.e(uuh.b, "num_message_threshold_to_be_close_to_end_of_scroll", 4);
    public static final alhr b;
    private static final alog bf;
    public static final Duration c;
    public final armf A;
    public final aneo B;
    public final akbo C;
    public final akgu D;
    public final Optional E;
    public final aksr F;
    public final Optional G;
    public final Optional H;
    public final Optional I;
    public final apwt J;
    public final armf K;
    public final armf L;
    public final armf M;
    public final armf N;
    public final apwt P;
    public final apwt Q;
    public final armf R;
    public final armf S;
    public final armf T;
    public final akgh U;
    public final akgh V;
    public final akgh W;
    public final akbp X;
    public final akbp Y;
    public final akbp Z;
    public ValueAnimator aA;
    public int aH;
    public Uri aI;
    public boolean aJ;
    public MessageIdType aK;
    public Menu aL;
    public final nzq aN;
    public final iyh aO;
    public final rbh aP;
    public final zjq aQ;
    public final zjm aR;
    public final zmr aS;
    public final kor aT;
    public nq aV;
    public ipq aW;
    public final akmy aX;
    public final iji aY;
    public final iji aZ;
    public final akbp aa;
    public final akbp ab;
    public final akbp ac;
    public final akbp ad;
    public final ActionMode.Callback ae;
    public final ConversationIdType af;
    public final armf al;
    public final armf am;
    public isz an;
    public MessageListRecyclerView ao;
    public PinnedLinearLayoutManager ap;
    public ird aq;
    public irg ar;
    public irq as;
    public boolean at;
    public MessagePartCoreData aw;
    public ArrayList ax;
    public int az;
    public final ifb ba;
    public final nei bb;
    public final usk bc;
    public final aohs bd;
    public final wfh be;
    private final Optional bg;
    private final mho bh;
    private final abco bi;
    private final yjf bj;
    private final armf bk;
    private final qky bl;
    private final trz bm;
    private final abbj bn;
    private final Optional bo;
    private final armf bp;
    private final Optional bq;
    private final apwt br;
    private final armf bs;
    private final armf bt;
    private List bu;
    private final gpx bv;
    private final gpx bw;
    public Parcelable d;
    public akbj e;
    public final cg f;
    public final ajwt g;
    public final itu h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final mgv l;
    public final yti m;
    public final yjy n;
    public final xnv o;
    public final armf p;
    public final Optional q;
    public final Optional r;
    public final xpi s;
    public final armf t;
    public final jbp u;
    public final Optional v;
    public final ahoo w;
    public final armf x;
    public final apwt y;
    public final irl z;
    public final List O = new ArrayList();
    public final xvv ag = new xvv("enableSafeUrlOnClickCheck", new isd(1));
    public final xvv ah = new xvv("enableSaveOtpUi", new isd(0));
    public final xvv ai = new xvv("enableConversationScaleSetting", new isd(2));
    public final xvv aj = new xvv("hasShownSuggestionShortcutsDialog", new isd(3));
    public final xvv ak = new xvv("hasShownStarToolstone", new isd(4));
    public vl au = new vl();
    public Set av = new to();
    public rre ay = new rre(new rrb());
    public boolean aB = false;
    public boolean aC = true;
    public final vl aD = new vl();
    public final ConcurrentHashMap aE = new ConcurrentHashMap();
    public final Map aF = new HashMap();
    public final Map aG = new HashMap();
    public Optional aM = Optional.empty();
    public final ahcn aU = new ahcn(new isi(this), new mzp(this, 1));

    static {
        uuh.e(uuh.b, "typing_indicator_timeout_ms", 20000);
        b = uuh.v(172415650);
        bf = alog.y(Integer.valueOf(R.id.save_attachment), Integer.valueOf(R.id.copy_text), Integer.valueOf(R.id.action_delete_message), Integer.valueOf(R.id.share_message_menu), Integer.valueOf(R.id.forward_message_menu), Integer.valueOf(R.id.details_menu), Integer.valueOf(R.id.action_send), Integer.valueOf(R.id.action_download));
        c = Duration.ofSeconds(1L);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public itb(ajwt ajwtVar, cg cgVar, zmr zmrVar, Optional optional, mho mhoVar, itu ituVar, abco abcoVar, zjm zjmVar, nei neiVar, mgv mgvVar, yti ytiVar, wfh wfhVar, iji ijiVar, yjf yjfVar, armf armfVar, yjy yjyVar, xnv xnvVar, armf armfVar2, qky qkyVar, Optional optional2, iyh iyhVar, trz trzVar, Optional optional3, aohs aohsVar, abbj abbjVar, rbh rbhVar, ifb ifbVar, gpx gpxVar, iji ijiVar2, Optional optional4, usk uskVar, xpi xpiVar, aneo aneoVar, akbo akboVar, akgu akguVar, akmy akmyVar, Optional optional5, Optional optional6, Optional optional7, aksr aksrVar, armf armfVar3, armf armfVar4, armf armfVar5, zjq zjqVar, armf armfVar6, apwt apwtVar, ahoo ahooVar, jbp jbpVar, jat jatVar, Optional optional8, Optional optional9, armf armfVar7, gpx gpxVar2, armf armfVar8, apwt apwtVar2, apwt apwtVar3, armf armfVar9, kor korVar, armf armfVar10, apwt apwtVar4, Optional optional10, apwt apwtVar5, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, String str, nzq nzqVar) {
        this.g = ajwtVar;
        this.af = ruy.b(str);
        new BugleConversationId(ruy.b(str));
        this.f = cgVar;
        this.al = armfVar15;
        this.aS = zmrVar;
        this.bg = optional;
        this.bh = mhoVar;
        this.h = ituVar;
        this.bi = abcoVar;
        this.aR = zjmVar;
        this.bb = neiVar;
        this.l = mgvVar;
        this.m = ytiVar;
        this.be = wfhVar;
        this.aZ = ijiVar;
        this.bj = yjfVar;
        this.bk = armfVar;
        this.n = yjyVar;
        this.o = xnvVar;
        this.p = armfVar2;
        this.bl = qkyVar;
        this.q = optional2;
        this.aO = iyhVar;
        this.bm = trzVar;
        this.r = optional3;
        this.bd = aohsVar;
        this.bn = abbjVar;
        this.aP = rbhVar;
        this.ba = ifbVar;
        this.bv = gpxVar;
        this.aY = ijiVar2;
        this.bo = optional4;
        this.bc = uskVar;
        this.s = xpiVar;
        this.B = aneoVar;
        this.C = akboVar;
        this.D = akguVar;
        this.aX = akmyVar;
        this.G = optional5;
        this.E = optional6;
        this.F = aksrVar;
        this.v = optional7;
        this.i = armfVar3;
        this.j = armfVar4;
        this.k = armfVar5;
        this.aQ = zjqVar;
        this.t = armfVar6;
        this.y = apwtVar;
        this.w = ahooVar;
        this.x = armfVar9;
        this.aT = korVar;
        this.u = jbpVar;
        this.H = optional8;
        this.I = optional9;
        this.J = apwtVar4;
        this.K = armfVar11;
        this.L = armfVar12;
        this.M = armfVar13;
        this.N = armfVar14;
        da daVar = cgVar.B;
        anen anenVar = (anen) jatVar.a.b();
        anenVar.getClass();
        aneo aneoVar2 = (aneo) jatVar.f.b();
        aneoVar2.getClass();
        eoy eoyVar = (eoy) jatVar.b.b();
        nct nctVar = (nct) jatVar.d.b();
        trz trzVar2 = (trz) jatVar.e.b();
        trzVar2.getClass();
        this.z = new irl(anenVar, aneoVar2, eoyVar, nctVar, trzVar2, jatVar.c, jatVar.g, daVar);
        this.bp = armfVar7;
        this.bw = gpxVar2;
        this.A = armfVar8;
        this.P = apwtVar2;
        this.Q = apwtVar3;
        this.R = armfVar10;
        this.bq = optional10;
        this.br = apwtVar5;
        this.am = armfVar16;
        this.S = armfVar17;
        this.bs = armfVar18;
        this.bt = armfVar19;
        this.T = armfVar20;
        this.aN = nzqVar;
        this.U = new iso(this);
        this.W = new isp(this);
        this.V = new isq(this);
        this.X = new isr(this);
        this.Y = new ist(this);
        this.Z = new isu(this);
        this.aa = new isw(this);
        this.ab = new iuv(cgVar);
        this.ac = new isx(this);
        this.ad = new isy(this);
        this.ae = new zlx(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L(defpackage.rry r8, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r9) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itb.L(rry, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData):void");
    }

    private final void M(boolean z, rry rryVar) {
        akul h;
        if (z) {
            akbo akboVar = this.C;
            irl irlVar = this.z;
            BiPredicate biPredicate = new BiPredicate() { // from class: irz
                public final /* synthetic */ BiPredicate and(BiPredicate biPredicate2) {
                    return BiPredicate$CC.$default$and(this, biPredicate2);
                }

                public final /* synthetic */ BiPredicate negate() {
                    return BiPredicate$CC.$default$negate(this);
                }

                public final /* synthetic */ BiPredicate or(BiPredicate biPredicate2) {
                    return BiPredicate$CC.$default$or(this, biPredicate2);
                }

                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    boolean z2;
                    rry rryVar2 = (rry) obj;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    utz utzVar = itb.a;
                    if (!rryVar2.aM() && !MessageData.cF(rryVar2.f())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!booleanValue && !z2) {
                        return false;
                    }
                    return true;
                }
            };
            akul b2 = ((iks) irlVar.h.a(iks.class)).c().b();
            akul ai = aktp.ai(new haw(irlVar, rryVar.t(), 6), irlVar.a);
            if (((okf) irlVar.e.b()).a()) {
                akul b3 = ((iks) irlVar.h.a(iks.class)).b().b();
                h = aktp.an(b2, ai, b3).h(new irk(irlVar, b2, ai, b3, rryVar, biPredicate, 1), irlVar.b);
            } else {
                akul b4 = ((iks) irlVar.h.a(iks.class)).a().b();
                h = aktp.an(b2, ai, b4).h(new irk(irlVar, b2, ai, b4, rryVar, biPredicate, 0), irlVar.b);
            }
            akboVar.c(ahlp.k(h), this.ac);
            return;
        }
        this.bi.a();
    }

    @Override // defpackage.aack
    public final boolean A(rry rryVar) {
        if (!((Boolean) wkz.a.e()).booleanValue() && this.aJ && this.G.isPresent()) {
            iuu iuuVar = (iuu) this.G.get();
            if (iuuVar.a() && rryVar.au() && rvx.h(rryVar.f())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final boolean B(int i) {
        akul h;
        int i2;
        String str;
        String str2;
        String str3;
        String U;
        int i3 = 0;
        if (this.aO.a() == 0) {
            xzb.k("Bugle", "Handling action %d with empty selectedMessages", Integer.valueOf(i));
            return false;
        }
        isf isfVar = new isf(this, new ArrayList(this.aO.b()), i3);
        if (this.aO.a() > 1) {
            if (i != R.id.action_delete_message) {
                return false;
            }
            G(this.aO);
            isfVar.accept(amgf.DELETE);
            return true;
        }
        rry rryVar = (rry) this.aO.b().iterator().next();
        if (i == R.id.save_attachment) {
            List T = rryVar.T();
            alog alogVar = rvx.a;
            Iterator it = T.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!gh.t(((MessagePartCoreData) it.next()).U())) {
                        this.bu = rryVar.T();
                        q();
                        break;
                    }
                } else {
                    xzb.j("Bugle", "Save attachment action started");
                    if (!this.bj.n() && !yhx.c) {
                        ((yjl) this.bk.b()).e(new aaxg(this, 1));
                    } else {
                        p(rryVar.T());
                        isfVar.accept(amgf.SAVE_ATTACHMENT);
                    }
                }
            }
            return true;
        }
        if (i == R.id.copy_text) {
            d.s(rryVar.am());
            String Q = rryVar.Q(this.f.F());
            if (Q != null) {
                this.m.a(Q, this.f.z().getString(R.string.message_context_menu_text_copied_toast_text));
                this.an.l();
                isfVar.accept(amgf.COPY);
            }
            return true;
        }
        if (i == R.id.action_delete_message) {
            G(this.aO);
            isfVar.accept(amgf.DELETE);
            return true;
        }
        if (i == R.id.share_message_menu) {
            rryVar.getClass();
            String Q2 = rryVar.Q(this.f.F());
            String d = ((xca) this.br.b()).d(this.f.z(), rryVar.E());
            armf armfVar = this.p;
            List T2 = rryVar.T();
            Context x = this.f.x();
            x.getClass();
            xyl.l(T2);
            boolean h2 = ytd.h(Q2);
            boolean h3 = ytd.h(d);
            if (h2 && h3) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int size = i2 + T2.size();
            if (size > 0) {
                Intent intent = new Intent();
                String str4 = "extra_subject_mandatory";
                if (size == 1) {
                    intent.setAction("android.intent.action.SEND");
                    if (T2.isEmpty()) {
                        intent.setType("text/plain");
                        if (!h2) {
                            intent.putExtra("android.intent.extra.TEXT", Q2);
                        }
                        if (!h3) {
                            intent.putExtra("android.intent.extra.SUBJECT", d);
                            intent.putExtra("extra_subject_mandatory", true);
                        }
                    } else {
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) T2.get(0);
                        Uri u = lzv.u(x, messagePartCoreData);
                        if (u != null) {
                            if (gh.p(messagePartCoreData.U())) {
                                u = lzv.v(x, u, messagePartCoreData.U());
                            }
                            intent.putExtra("android.intent.extra.STREAM", u);
                            if (messagePartCoreData.bx()) {
                                U = "text/plain";
                            } else {
                                U = messagePartCoreData.U();
                            }
                            intent.setType(U);
                        }
                    }
                    str = d;
                    str2 = "extra_subject_mandatory";
                } else {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>(T2.size());
                    ArrayList arrayList2 = new ArrayList(size);
                    Iterator it2 = T2.iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = it2;
                        MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) it2.next();
                        String str5 = str4;
                        Uri u2 = lzv.u(x, messagePartCoreData2);
                        if (u2 != null) {
                            if (gh.p(messagePartCoreData2.U())) {
                                str3 = d;
                                u2 = lzv.v(x, u2, messagePartCoreData2.U());
                            } else {
                                str3 = d;
                            }
                            arrayList.add(u2);
                            String U2 = messagePartCoreData2.U();
                            if (messagePartCoreData2.bw()) {
                                arrayList2.add("text/plain");
                            } else if (U2 != null) {
                                arrayList2.add(U2);
                            }
                            it2 = it3;
                            str4 = str5;
                            d = str3;
                        } else {
                            it2 = it3;
                            str4 = str5;
                        }
                    }
                    str = d;
                    str2 = str4;
                    String[] strArr = gh.a;
                    Iterator it4 = arrayList2.iterator();
                    String str6 = "*/*";
                    if (it4.hasNext()) {
                        String[] B = gh.B((String) it4.next());
                        char c2 = 0;
                        String str7 = B[0];
                        String str8 = B[1];
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            String[] B2 = gh.B((String) it4.next());
                            Iterator it5 = it4;
                            if (str7.equalsIgnoreCase(B2[c2])) {
                                if (str8 != null && !str8.equalsIgnoreCase(B2[1])) {
                                    it4 = it5;
                                    str8 = null;
                                } else {
                                    it4 = it5;
                                }
                                c2 = 0;
                            } else {
                                str7 = null;
                                break;
                            }
                        }
                        if (str7 != null) {
                            if (str8 == null) {
                                str6 = str7.concat("/*");
                            } else {
                                str6 = str7 + "/" + str8;
                            }
                        }
                    }
                    intent.setType(str6);
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                }
                if (T2.size() == 1 && ((MessagePartCoreData) T2.get(0)).bp()) {
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    if (!h2) {
                        intent.putExtra("android.intent.extra.TEXT", Q2);
                    }
                    if (!h3) {
                        intent.putExtra("android.intent.extra.SUBJECT", str);
                        intent.putExtra(str2, true);
                    }
                }
                akto.n(this.f.F(), Intent.createChooser(intent, this.f.z().getText(R.string.action_share)));
                this.an.l();
                isfVar.accept(amgf.SHARE);
                return true;
            }
            throw new IllegalArgumentException("No parts to share");
        }
        if (i == R.id.forward_message_menu) {
            MessageCoreData a2 = ((mkp) this.i.b()).a(this.f.z(), rryVar);
            if (((Optional) this.bt.b()).isPresent()) {
                ((ghw) ((Optional) this.bt.b()).get()).t(this.f.F(), this.g, a2, amwf.FORWARD);
            } else {
                ((lzv) this.p.b()).C(this.f.F(), a2, amwf.FORWARD);
            }
            this.an.l();
            isfVar.accept(amgf.FORWARD);
            return true;
        }
        if (i == R.id.details_menu) {
            qwm j = ((rrl) this.ay.a()).j(rryVar.s());
            if (j != null) {
                akbo akboVar = this.C;
                gpx gpxVar = (gpx) this.bp.b();
                akul b2 = ((iks) ((eoy) gpxVar.b).a(iks.class)).c().b();
                akrh e = aktp.e("MessageDetailsDialogHandler::getRcsSessionId_dsdrGroupsFlag");
                try {
                    if (((okf) gpxVar.c.b()).a()) {
                        h = ((iks) ((eoy) gpxVar.b).a(iks.class)).b().b().h(new ezr(19), gpxVar.a);
                    } else {
                        h = ((iks) ((eoy) gpxVar.b).a(iks.class)).a().b().h(new ezr(20), gpxVar.a);
                    }
                    akul akulVar = h;
                    e.close();
                    akboVar.c(new ahlp(aktp.an(b2, akulVar).h(new kwr(gpxVar, b2, akulVar, rryVar, j, 1), gpxVar.a)), this.ad);
                    this.an.l();
                    isfVar.accept(amgf.VIEW_DETAILS);
                    return true;
                } finally {
                }
            } else {
                throw new IllegalStateException("getSubscriptionBySelfParticipantId returned null when processing details menu click.");
            }
        } else {
            if (i == R.id.action_send) {
                this.an.m(rryVar.u());
                this.an.l();
                isfVar.accept(amgf.RETRY_SEND);
                return true;
            }
            if (i == R.id.action_download) {
                o(rryVar);
                this.an.l();
                isfVar.accept(amgf.DOWNLOAD);
                return true;
            }
            this.q.isPresent();
            return false;
        }
    }

    public final boolean C(long j) {
        if (b(j) < 0) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if (this.ao.getChildCount() == 0) {
            return true;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.ao.m;
        if (linearLayoutManager != null) {
            if (linearLayoutManager.K() == 0) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager during isScrolledToBottom().");
    }

    @Override // defpackage.aack
    public final boolean E(aacl aaclVar, MessagePartCoreData messagePartCoreData, Rect rect, boolean z) {
        if (!z) {
            F(aaclVar.c(), 1);
        }
        if (z && (aaclVar instanceof ConversationMessageView)) {
            z((ConversationMessageView) aaclVar);
            I();
        }
        if (!z && this.aO.d()) {
            if (!aaclVar.c().aB()) {
                rry c2 = aaclVar.c();
                if ((((rrl) this.ay.a()).b.b() || !c2.aV()) && !aaclVar.c().az() && !aaclVar.c().aD() && !aaclVar.c().ae()) {
                    int i = 4;
                    if (messagePartCoreData.ba()) {
                        this.bo.ifPresent(new iry(messagePartCoreData, i));
                        return false;
                    }
                    Uri t = messagePartCoreData.t();
                    if (t == null) {
                        xzb.n("Bugle", "Cannot click attachment with null contentUri");
                    } else if (messagePartCoreData.bk()) {
                        aktp.K(new iqx(t, rect), this.f);
                        this.bh.R(2);
                    } else if (messagePartCoreData.by()) {
                        this.bl.c(this.f.F(), t);
                    } else if (messagePartCoreData.aZ()) {
                        Context x = this.f.x();
                        x.getClass();
                        Uri a2 = uhn.a(x, t, messagePartCoreData.X(), messagePartCoreData.U(), messagePartCoreData.p());
                        mho mhoVar = this.bh;
                        String a3 = messagePartCoreData.A().a();
                        if (true != aaclVar.c().au()) {
                            i = 3;
                        }
                        mhoVar.aw(a3, i);
                        if (messagePartCoreData.bj()) {
                            lzv lzvVar = (lzv) this.p.b();
                            Context x2 = this.f.x();
                            x2.getClass();
                            lzvVar.B(x2, a2, messagePartCoreData.U());
                        } else {
                            this.bg.ifPresent(new iry(this, 5));
                        }
                    } else if (messagePartCoreData.bv()) {
                        String a4 = gh.a(messagePartCoreData.U());
                        Context x3 = this.f.x();
                        x3.getClass();
                        Uri a5 = uhn.a(x3, t, messagePartCoreData.X(), a4, messagePartCoreData.p());
                        mho mhoVar2 = this.bh;
                        int bJ = messagePartCoreData.bJ();
                        String a6 = messagePartCoreData.A().a();
                        if (true != aaclVar.c().au()) {
                            i = 3;
                        }
                        mhoVar2.aF(bJ, a6, i);
                        lzv lzvVar2 = (lzv) this.p.b();
                        Context x4 = this.f.x();
                        x4.getClass();
                        lzvVar2.B(x4, a5, a4);
                    } else if (messagePartCoreData.bg()) {
                        abbj.b(this.f.F(), new ise(this.bn, messagePartCoreData, 14, null));
                    }
                    return false;
                }
            }
            m(aaclVar);
            return true;
        }
        L(aaclVar.c(), messagePartCoreData);
        return true;
    }

    public final void F(rry rryVar, int i) {
        if (this.aO.d()) {
            itu ituVar = this.h;
            if (rryVar.aF() && rryVar.ak()) {
                qiu.h(ituVar.a(rryVar, i, new iry(ituVar, 10)));
            }
        }
    }

    final void G(iyh iyhVar) {
        if (this.m.b(this.f.F())) {
            ajgi ajgiVar = new ajgi(this.f.F());
            ajgiVar.y(this.f.F().getResources().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, iyhVar.a(), Integer.valueOf(iyhVar.a())));
            ajgiVar.m(R.string.delete_message_confirmation_dialog_text);
            ajgiVar.t(R.string.delete_message_confirmation_button, new aabt(this.F, "deleteMessages.Dialog.Onclick", new ise(this, iyhVar, 0), 8));
            ajgiVar.o(android.R.string.cancel, null);
            ajgiVar.create().show();
            return;
        }
        this.bi.a();
        this.an.l();
    }

    public final void I() {
        this.bq.isPresent();
        xzb.c("BugleReplies", "updateReplyButtonSelectionState: replyChecker is absent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [xde] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    @Override // defpackage.aack
    public final List J(List list, int i) {
        alog alogVar;
        ?? r1;
        if (!adom.o(list)) {
            ArrayList arrayList = new ArrayList();
            for (SuggestionData suggestionData : list) {
                if ((suggestionData instanceof SmartSuggestionData) && ((SmartSuggestionData) suggestionData).p()) {
                    MessageIdType r = suggestionData.r();
                    vl vlVar = this.au;
                    if (vlVar != null && !r.b() && vlVar.containsKey(r)) {
                        xzb.j("Bugle", "Not showing reminder SmartAction for message which already has a reminder set.");
                        arrayList.add(suggestionData);
                    }
                }
            }
            list.removeAll(arrayList);
        }
        ixd ixdVar = (ixd) this.an;
        rrl rrlVar = (rrl) ixdVar.ca.a();
        aagg aaggVar = ixdVar.cD;
        ryh ryhVar = ixdVar.aH;
        xca xcaVar = (xca) ixdVar.bh.b();
        yvs yvsVar = (yvs) ixdVar.S.b();
        xcaVar.getClass();
        yvsVar.getClass();
        ixs ixsVar = new ixs(rrlVar, yvsVar);
        if (list != 0 && !list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((SuggestionData) it.next()) instanceof RbmSuggestionData) {
                        r1 = aaggVar.b;
                        break;
                    }
                }
            }
            r1 = aaggVar.c;
            alogVar = r1.a(list, ixsVar, i);
        } else {
            int i2 = alog.d;
            alogVar = alsx.a;
            alogVar.getClass();
        }
        ixdVar.bZ = alogVar;
        return ixdVar.bZ;
    }

    public final void K(MessageIdType messageIdType, Uri uri) {
        if (messageIdType.b()) {
            xzb.c("Bugle", "no message id, load return.");
        } else {
            xzw.b(new faq(this, messageIdType, uri, 19, (short[]) null), 300L);
        }
    }

    @Override // defpackage.aack
    public final int a() {
        ParticipantsTable.BindData a2;
        ixd ixdVar = (ixd) this.an;
        if (ixdVar.ca.g() && (a2 = ((rrl) ixdVar.ca.a()).e.a()) != null) {
            int i = lru.g(a2).c;
            if (i == 0) {
                return ixdVar.cb;
            }
            return i;
        }
        return ixdVar.cb;
    }

    public final long b(long j) {
        return j - this.o.f().toEpochMilli();
    }

    @Override // defpackage.aack
    public final rsa c() {
        if (this.ay.g() && ((rrl) this.ay.a()).d) {
            return ((rrl) this.ay.a()).e;
        }
        return null;
    }

    @Override // defpackage.aack
    public final rti d(SelfIdentityId selfIdentityId) {
        if (selfIdentityId != null && this.ay.g()) {
            return ((rrl) this.ay.a()).k(selfIdentityId);
        }
        return null;
    }

    public final Optional e() {
        View view = this.f.Q;
        if (view == null) {
            return Optional.empty();
        }
        return Optional.of(view.findViewById(R.id.flash_conversation));
    }

    @Override // defpackage.aack
    public final Optional f(MessageIdType messageIdType) {
        return Optional.ofNullable((xog) this.aF.get(messageIdType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList g(Menu menu) {
        ArrayList arrayList = new ArrayList();
        alog alogVar = bf;
        int i = ((alsx) alogVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            MenuItem findItem = menu.findItem(((Integer) alogVar.get(i2)).intValue());
            if (findItem != null && findItem.isVisible()) {
                arrayList.add(findItem);
            }
        }
        this.q.ifPresent(new ilf(menu, arrayList, 2));
        return arrayList;
    }

    @Override // defpackage.aack
    public final void h(SuggestionData suggestionData) {
        j();
        this.an.k(suggestionData);
    }

    public final void i() {
        this.aO.c();
    }

    public final void j() {
        this.an.l();
    }

    @Override // defpackage.aack
    public final void k(rry rryVar) {
        MessageIdType u = rryVar.u();
        irl irlVar = this.z;
        if (!irlVar.g.b() && irlVar.g.equals(u)) {
            da daVar = this.z.f;
            if (daVar != null) {
                try {
                    xvl xvlVar = (xvl) daVar.e("messageFailureOptionsBottomModalFragment");
                    if (xvlVar != null) {
                        xvn E = xvlVar.E();
                        int f = rryVar.f();
                        if (apne.SENDING_OPTIONS.equals(E.d)) {
                            if (rvx.j(f) || rvx.n(f)) {
                                E.h.d();
                                return;
                            }
                            return;
                        }
                        if (apne.SENT_OPTIONS.equals(E.d) && rvx.l(f)) {
                            E.h.d();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (IllegalStateException e) {
                    xzb.e("Bugle", e, "Failed to dismiss options UI:");
                    return;
                }
            }
            xzb.n("Bugle", "Failed to dismiss options UI: fragment manager is null.");
        }
    }

    public final void l(MessageIdType messageIdType, boolean z) {
        if (messageIdType.b()) {
            xzb.n("Bugle", "goToMessage with empty message id");
        } else {
            this.aB = true;
            this.aq.b(messageIdType).k(qjc.a(new ism(this, messageIdType, z)), new sp(10));
        }
    }

    public final void m(aacl aaclVar) {
        int i = 1;
        xzb.k("Bugle", "handle message click for %s", aaclVar);
        if (!this.aO.d()) {
            u(aaclVar.c());
            return;
        }
        rry c2 = aaclVar.c();
        boolean b2 = this.m.b(this.f.F());
        itu ituVar = this.h;
        qiu.h(ituVar.a(c2, 3, new iry(ituVar, 11)));
        if (!this.bm.i() || !rvx.t(c2.f())) {
            if (this.bm.q() && c2.aq() && c2.aT()) {
                M(b2, c2);
                i();
            } else if (c2.aT() || c2.aD()) {
                M(b2, c2);
                i();
            }
            this.z.g = c2.u();
            return;
        }
        if (c2.ar()) {
            if (this.bm.n()) {
                Context x = this.f.x();
                x.getClass();
                Resources resources = x.getResources();
                String valueOf = String.valueOf(x.getPackageName());
                String c3 = this.bm.c();
                String string = resources.getString(R.string.dismiss_button);
                itu ituVar2 = this.h;
                String bs = yyb.bs(x);
                ituVar2.b.c("Bugle.Etouffee.UI.FailToDecrypt.Dialog.Open.Counts");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(x.getString(R.string.simple_fail_to_decrypt_message_dialog_body_with_learn_more, bs));
                byte[] bArr = null;
                ubh.c(spannableStringBuilder, x, bs, c3, null);
                ajgi ajgiVar = new ajgi(x);
                ajgiVar.n(spannableStringBuilder);
                ajgiVar.j(true);
                ajgiVar.p(string, new iws(1));
                if (!TextUtils.isEmpty(c3)) {
                    Uri aa = aabr.aa("market://details?id=".concat(valueOf), this.f.F());
                    String string2 = x.getString(R.string.update_messages_app);
                    string2.getClass();
                    ajgiVar.u(new arus("\\s").a(string2, " "), new ise(this, aa, i, bArr));
                }
                ev create = ajgiVar.create();
                create.setOnShowListener(new uab(create, i));
                create.show();
                return;
            }
            return;
        }
        if (c2.aB()) {
            this.an.m(c2.u());
            i();
            return;
        }
        if (c2.ag() && b2) {
            u(aaclVar.c());
            return;
        }
        abco abcoVar = this.bi;
        boolean e = abcoVar.b.e();
        boolean p = abcoVar.c.p();
        boolean h = yhx.h(abcoVar.a);
        boolean d = abcoVar.b.d();
        if (e && p && h && d) {
            if (aaclVar instanceof ConversationMessageView) {
                ConversationMessageView conversationMessageView = (ConversationMessageView) aaclVar;
                MessageIdType u = c2.u();
                boolean z = !conversationMessageView.D();
                Boolean valueOf2 = Boolean.valueOf(z);
                xzb.k("Bugle", "Should show metadata view: %b", valueOf2);
                this.aD.put(u, new ita(z, conversationMessageView.e.f()));
                conversationMessageView.o = Optional.of(valueOf2);
                ((adjw) conversationMessageView.O.b()).f(conversationMessageView.D(), true);
                return;
            }
            if (c2.aR()) {
                return;
            } else {
                throw new IllegalStateException("unhandled tap action for a conversation list item");
            }
        }
        this.bi.a();
        i();
    }

    public final void n() {
        if (this.ao == null) {
            return;
        }
        this.aq.f.p();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
    public final void o(rry rryVar) {
        if (this.m.b(this.f.F())) {
            ((mkp) this.i.b()).d(rryVar.u());
            if (((Boolean) ((utz) b.get()).e()).booleanValue()) {
                gpx gpxVar = this.bw;
                boolean z = false;
                if (rryVar.aF() && rryVar.ak()) {
                    z = true;
                }
                if (gpxVar.A(z)) {
                    gpx gpxVar2 = this.bw;
                    gpxVar2.z(R.string.data_required_download_snackbar_message);
                    ((mbl) gpxVar2.c.b()).c("Bugle.UI.Conversations.DataWarning.Downloading.Shown");
                    return;
                }
                return;
            }
            return;
        }
        this.bi.a();
    }

    public final void p(List list) {
        String U;
        ibr o = this.bv.o("Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            Uri t = messagePartCoreData.t();
            if (messagePartCoreData.bx()) {
                U = "text/plain";
            } else {
                U = messagePartCoreData.U();
            }
            if (t != null && U != null) {
                Uri v = messagePartCoreData.v();
                String str = null;
                if (!messagePartCoreData.bz() && !messagePartCoreData.bk()) {
                    str = messagePartCoreData.X();
                }
                o.b(t, U, v, str);
            }
        }
        if (o.a.size() > 0) {
            o.e(new Void[0]);
            this.an.l();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
    public final void q() {
        String U;
        List list = this.bu;
        if (list != null && !list.isEmpty()) {
            iji ijiVar = this.aY;
            cg cgVar = this.f;
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.bu.remove(r2.size() - 1);
            ijiVar.c.put(100, messagePartCoreData);
            if (messagePartCoreData.bx()) {
                U = "text/plain";
            } else {
                U = messagePartCoreData.U();
            }
            if (U != null) {
                Object obj = ijiVar.b;
                String X = messagePartCoreData.X();
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.setType(U);
                intent.putExtra("android.intent.extra.TITLE", X);
                cgVar.startActivityForResult(intent, 100);
            }
        }
    }

    public final void r() {
        this.aB = true;
        this.aq.b(rvc.a).k(qjc.a(new isn(this, 0)), new sp(10));
    }

    @Override // defpackage.aack
    public final void s() {
        if (this.aC && D()) {
            itm itmVar = this.aq.c.f;
            itmVar.getClass();
            if (!itmVar.w) {
                this.ap.ac(0);
            }
        }
    }

    public final void t(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.aC = z;
        PinnedLinearLayoutManager pinnedLinearLayoutManager = this.ap;
        pinnedLinearLayoutManager.ad(i, pinnedLinearLayoutManager.G / 2);
    }

    public final void u(rry rryVar) {
        L(rryVar, null);
    }

    public final void v(int i) {
        cj fe = this.f.fe();
        if (fe != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ao.getLayoutParams();
            marginLayoutParams.bottomMargin = (int) (i * fe.getResources().getDisplayMetrics().density);
            this.ao.setLayoutParams(marginLayoutParams);
        }
    }

    public final void w(int i) {
        PinnedLinearLayoutManager pinnedLinearLayoutManager = this.ap;
        int max = Math.max(i, 0);
        if (max != pinnedLinearLayoutManager.a) {
            pinnedLinearLayoutManager.a = max;
            pinnedLinearLayoutManager.bc();
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final void x() {
        MessageIdType messageIdType;
        Uri uri;
        Intent intent = this.f.F().getIntent();
        if (intent != null) {
            messageIdType = rvc.b(intent.getStringExtra("message_id"));
            intent.removeExtra("message_id");
            uri = (Uri) intent.getParcelableExtra("target_uri");
            intent.removeExtra("target_uri");
            if (abal.c() && intent.getBooleanExtra("via_reminder_view", false) && intent.getStringExtra("viewed_reminder_id") != null) {
                ((Optional) ((apxx) this.bs).a).ifPresent(new ile(19));
            }
        } else {
            messageIdType = rvc.a;
            uri = null;
        }
        ird irdVar = this.aq;
        ConversationIdType conversationIdType = this.af;
        irr irrVar = irdVar.c;
        rae raeVar = irrVar.j;
        Context context = irrVar.c;
        hk hkVar = irrVar.d;
        hkVar.getClass();
        int intValue = ((Integer) ite.a.e()).intValue();
        int intValue2 = ((Integer) ite.b.e()).intValue();
        int intValue3 = ((Integer) ite.c.e()).intValue();
        hgj hgjVar = (hgj) raeVar.a.b();
        ?? r7 = raeVar.b;
        ?? r8 = raeVar.d;
        ?? r9 = raeVar.h;
        aksr aksrVar = (aksr) raeVar.i.b();
        aksrVar.getClass();
        ?? r11 = raeVar.e;
        lgg lggVar = (lgg) raeVar.c.b();
        lggVar.getClass();
        ?? r14 = raeVar.f;
        anen anenVar = (anen) raeVar.g.b();
        anenVar.getClass();
        conversationIdType.getClass();
        irrVar.f = new itm(hgjVar, r7, r8, r9, aksrVar, r11, lggVar, r14, anenVar, context, conversationIdType, hkVar, intValue, intValue2, intValue3);
        irrVar.H(messageIdType).k(qjc.a(new ahjd(this, messageIdType, uri, 1)), new sp(10));
    }

    public final void y(List list) {
        irh irhVar = this.aq.b;
        irhVar.c = list;
        irhVar.F();
    }

    public final void z(ConversationMessageView conversationMessageView) {
        rrl rrlVar = (rrl) this.ay.a();
        if (!this.G.isPresent() || ((iuu) this.G.get()).a()) {
            if (this.aO.d() && this.G.isPresent()) {
                iui iuiVar = (iui) this.t.b();
                iuiVar.d.q(iuiVar.c.j(new its(2)), iui.a);
                iuu iuuVar = (iuu) this.G.get();
                this.an.i();
                rrlVar.s();
                boolean z = rrlVar.b.d;
                this.an.getClass();
                iuuVar.d();
                return;
            }
            if (this.aO.a() != 1 || !this.aO.e(conversationMessageView.e)) {
                i();
                if (this.G.isPresent()) {
                    iuu iuuVar2 = (iuu) this.G.get();
                    this.an.i();
                    rrlVar.s();
                    boolean z2 = rrlVar.b.d;
                    this.an.getClass();
                    iuuVar2.d();
                }
            }
        }
    }
}
