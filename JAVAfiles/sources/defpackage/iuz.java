package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsSubscriptionChangeReceiver;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import com.google.android.apps.messaging.ui.conversation.compose.Compose2oRootView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.aklx;
import defpackage.ixd;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuz extends ixt implements akkh, apxq, akkf, aklk, akrw, akwc {
    private ixd a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public iuz() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return ixd.class;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, miw] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            ixd E = E();
            E.bR = (View) E.H(new ivj(layoutInflater, viewGroup, 0), new ivj(layoutInflater, viewGroup, 2));
            if (((Optional) E.aJ.b()).isPresent()) {
                E.dc.C(((zxm) ((Optional) E.aJ.b()).get()).b(), new iwt(E));
            }
            cg d = E.M.G().d(R.id.message_list_fragment_container);
            if (d == null) {
                ajwt ajwtVar = E.bE;
                String a = E.L.a();
                irx irxVar = new irx();
                apxh.e(irxVar);
                aklw.b(irxVar, ajwtVar);
                aklt.b(irxVar, a);
                bd bdVar = new bd(E.M.G());
                bdVar.q(R.id.message_list_fragment_container, irxVar);
                bdVar.b();
                d = irxVar;
            }
            d.N().c(new iwu(E, d, 0));
            E.Q(new ivh(E, 5), new ivh(E, 6));
            E.bS = E.bR.findViewById(R.id.message_list_fragment_container);
            E.cr = (Compose2oRootView) E.bR.findViewById(R.id.c2o_root);
            E.cs = (ConversationScrollToBottomButton) E.bR.findViewById(R.id.conversation_scroll_to_bottom_button);
            ConversationScrollToBottomButton conversationScrollToBottomButton = E.cs;
            if (conversationScrollToBottomButton != null) {
                E.db.s(conversationScrollToBottomButton, new iux());
            }
            if (bundle != null) {
                E.R(null, new ivh(bundle, 7));
            }
            ((vrn) E.ae.a()).h(E.A());
            E.cp = (TextView) E.bR.findViewById(R.id.no_reply_pinned_message);
            if (!E.aE.isEmpty()) {
                if (bundle == null) {
                    Intent s = E.s();
                    if (s != null && s.hasExtra("search_text")) {
                        String stringExtra = s.getStringExtra("search_text");
                        stringExtra.getClass();
                        E.bP = stringExtra;
                        if (TextUtils.isEmpty(E.bP)) {
                            str = null;
                        } else {
                            str = E.bP;
                        }
                        E.bP = str;
                        s.removeExtra("search_text");
                    }
                } else if (bundle.containsKey("saved_instance_state_search_query_key")) {
                    E.bP = bundle.getString("saved_instance_state_search_query_key");
                }
            }
            View view = E.bR;
            Compose2oRootView compose2oRootView = E.cr;
            view.setSystemUiVisibility(1792);
            view.setOnApplyWindowInsetsListener(new iwv((Object) E, 1));
            E.R(null, new ilf(E, compose2oRootView, 16));
            hgj hgjVar = E.cR;
            aohs aohsVar = E.dc;
            gtq gtqVar = new gtq(E, 18);
            ivh ivhVar = new ivh(E, 8);
            ConversationIdType conversationIdType = E.L;
            Object obj = hgjVar.a;
            BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType);
            aohsVar.C(((uac) ((iji) obj).b).e(((iji) obj).a.d(bugleConversationId), new akgc(String.format("conversation_disable_mode_%s", bugleConversationId.b())), (enh) ((iji) obj).c), new iqo(gtqVar, ivhVar));
            View view2 = E.bR;
            if (view2 == null) {
                hlc.X(this, E());
            }
            akqj.p();
            return view2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r11v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v41, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v46, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v48, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v50, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v98, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void W(Bundle bundle) {
        boolean z;
        akfb j;
        Bundle bundle2 = bundle;
        this.c.k();
        try {
            aN(bundle);
            ixd E = E();
            if (!E.ca.g()) {
                alvw h = ixd.a.h();
                h.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) h;
                alvgVar.X(ydl.p, E.L);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onActivityCreated", 2157, "ConversationFragmentPeer.java")).q("ConversationFragment: binding is not bound, user left conversation before it was created.");
                E.q().finish();
            } else {
                E.bL.c(bundle2);
                alvw d = ixd.a.d();
                d.X(alwp.a, "Bugle");
                alvg alvgVar2 = (alvg) d;
                alvgVar2.X(ydl.p, E.L);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "addSubscriptionMixins", 2288, "ConversationFragmentPeer.java")).q("ConversationFragment: Subscribing to DataSources");
                enh N = E.M.N();
                ijw ijwVar = E.cz;
                final int i = 0;
                E.K(ijwVar.q.d(((ibi) ijwVar.m.b()).m(true, scq.a(E.L, 100).b()).b(), new ijv(ijwVar, i), "latest_message", N), new iwx(E));
                ijw ijwVar2 = E.cz;
                ConversationIdType conversationIdType = E.L;
                sxy d2 = MessagesTable.d();
                d2.e(new idc(8));
                d2.g(new ijs(conversationIdType, 3));
                sxx b = d2.b();
                sxy d3 = MessagesTable.d();
                d3.e(new idc(9));
                d3.g(new ijs(conversationIdType, 4));
                sxx b2 = d3.b();
                sxy d4 = MessagesTable.d();
                d4.w("+getConversationMessagesUpdatedDataSource");
                d4.s();
                d4.g(new ijs(conversationIdType, i));
                d4.n(b2.r(), "message_count");
                d4.n(b.r(), "unread_count");
                E.K(ijwVar2.q.d(d4.b(), new ijv(ijwVar2, 1), "message_count", N), new iwy(E));
                if (((okf) E.c.b()).a()) {
                    E.K(E.p.b().a(), new iwh(E));
                } else {
                    E.K(E.p.a().a(), new iwf(E));
                }
                ijw ijwVar3 = E.cz;
                E.K(((uac) ijwVar3.k.b()).e(((nfx) ijwVar3.l.b()).a(), "self_identity", N), new iwk(E));
                E.K(E.p.f().a(), new iwl(E));
                int i2 = 15;
                if (E.bL.b()) {
                    E.K(E.p.e().a(), new iwi(E));
                } else {
                    akfb a = E.p.c().a();
                    E.K(a, new iwj(E));
                    ytj ytjVar = E.ar;
                    E.K(new akfk(a, new xfn(ytjVar, i2), ytjVar.b, 0), new iwc(E));
                }
                ijw ijwVar4 = E.cz;
                ConversationIdType conversationIdType2 = E.L;
                lxe lxeVar = ijwVar4.r;
                scn a2 = scp.a();
                a2.w("+getMessageAnnotationsDataSource");
                if (!conversationIdType2.b()) {
                    a2.c(new ldg(conversationIdType2, 14));
                } else {
                    a2.q();
                }
                E.K(((uac) lxeVar.b).d(a2.b(), new ijv(lxeVar, 5), "message_annotations", N), new iwz(E));
                cg cgVar = E.M;
                enh N2 = cgVar.N();
                iji ijiVar = E.cG;
                cgVar.x().getClass();
                akfb b3 = ijiVar.b(N2, E.L, E.a());
                E.K(b3, new ivz(E));
                E.K(E.cG.a(b3), new iwb(E));
                qxr qxrVar = (qxr) E.be.b();
                ConversationIdType conversationIdType3 = E.L;
                int i3 = 2;
                E.K(new akfk((ansy) qxrVar.h, new izd(qxrVar, conversationIdType3, 4), "RBM_SPAM_CONTENT_KEY".concat(String.valueOf(conversationIdType3.a())), 2), new iwm(E));
                ijw ijwVar5 = E.cz;
                ConversationIdType conversationIdType4 = E.L;
                iql iqlVar = ijwVar5.p;
                anen anenVar = (anen) iqlVar.a.b();
                anenVar.getClass();
                anen anenVar2 = (anen) iqlVar.d.b();
                anenVar2.getClass();
                xnv xnvVar = (xnv) iqlVar.c.b();
                xnvVar.getClass();
                prd prdVar = (prd) iqlVar.f.b();
                prdVar.getClass();
                wfh wfhVar = (wfh) iqlVar.b.b();
                wfhVar.getClass();
                lpg lpgVar = (lpg) iqlVar.e.b();
                lpgVar.getClass();
                E.K(new ijr(anenVar, anenVar2, xnvVar, prdVar, wfhVar, lpgVar, conversationIdType4), new ivt(E));
                aair aairVar = E.cW;
                ConversationIdType conversationIdType5 = E.L;
                N.getClass();
                if (!conversationIdType5.b()) {
                    uac.t(yyb.aq(conversationIdType5), "conversation_suggestions", N, (ahiy) aairVar.h);
                    uac.t(aair.e(conversationIdType5), "conversation_suggestions", N, (ahiy) aairVar.h);
                    E.K(new akfk((ansy) aairVar.b, new izd(aairVar, conversationIdType5, 11, null), "conversation_suggestions", 2), new ivu(E));
                    imk g = E.cN.g(E.L);
                    E.bG = g;
                    E.K((akfb) E.G(new ivi(E, 3), new ivj(E, g, 3, null)), new iwo(E));
                    if (((Boolean) yig.d.e()).booleanValue()) {
                        aair aairVar2 = E.cW;
                        ConversationIdType conversationIdType6 = E.L;
                        N.getClass();
                        E.K(new akfk((ansy) aairVar2.b, new izd(aairVar2, conversationIdType6, 10, null), aair.f(conversationIdType6), 2), new ivv(E));
                    }
                    E.V.ifPresent(new ivh(E, 19));
                    E.dc.C(E.aM.a(), new ivx(E));
                    if (E.bK == null) {
                        nei neiVar = E.cZ;
                        nde ndeVar = new nde(E, 1);
                        aohs aohsVar = (aohs) neiVar.a.b();
                        aohsVar.getClass();
                        E.bK = new jad(aohsVar, (jbg) neiVar.e.b(), (gpx) neiVar.f.b(), neiVar.b, neiVar.c, ndeVar);
                    }
                    jad jadVar = E.bK;
                    if (bundle2 != null) {
                        z = bundle2.containsKey("saved_instance_state_active_sim_checker_key");
                    } else {
                        z = false;
                    }
                    jadVar.g = z;
                    aohs aohsVar2 = jadVar.j;
                    final jbg jbgVar = jadVar.b;
                    final Boolean bool = (Boolean) ((utz) jbh.a.get()).e();
                    iks iksVar = (iks) jbgVar.d.a(iks.class);
                    if (((okf) jbgVar.c.b()).a()) {
                        final int i4 = 1;
                        j = ansy.j(iksVar.f().a(), iksVar.b().a(), new akay() { // from class: jbb
                            @Override // defpackage.akay
                            public final Object a(Object obj, Object obj2) {
                                if (i4 != 0) {
                                    jbg jbgVar2 = jbgVar;
                                    Optional optional = (Optional) obj2;
                                    jbgVar2.b.i((alog) obj);
                                    if (optional.isPresent()) {
                                        Boolean bool2 = bool;
                                        SelfIdentityId W = lga.W(((sac) optional.get()).n());
                                        bool2.getClass();
                                        return jbgVar2.a(W, bool2.booleanValue());
                                    }
                                    return jbe.a;
                                }
                                jbg jbgVar3 = jbgVar;
                                Optional optional2 = (Optional) obj2;
                                jbgVar3.b.i((alog) obj);
                                if (optional2.isPresent()) {
                                    Boolean bool3 = bool;
                                    SelfIdentityId W2 = lga.W(((san) optional2.get()).n());
                                    bool3.getClass();
                                    return jbgVar3.a(W2, bool3.booleanValue());
                                }
                                return jbe.a;
                            }
                        }, jbgVar.a);
                    } else {
                        j = ansy.j(iksVar.f().a(), iksVar.a().a(), new akay() { // from class: jbb
                            @Override // defpackage.akay
                            public final Object a(Object obj, Object obj2) {
                                if (i != 0) {
                                    jbg jbgVar2 = jbgVar;
                                    Optional optional = (Optional) obj2;
                                    jbgVar2.b.i((alog) obj);
                                    if (optional.isPresent()) {
                                        Boolean bool2 = bool;
                                        SelfIdentityId W = lga.W(((sac) optional.get()).n());
                                        bool2.getClass();
                                        return jbgVar2.a(W, bool2.booleanValue());
                                    }
                                    return jbe.a;
                                }
                                jbg jbgVar3 = jbgVar;
                                Optional optional2 = (Optional) obj2;
                                jbgVar3.b.i((alog) obj);
                                if (optional2.isPresent()) {
                                    Boolean bool3 = bool;
                                    SelfIdentityId W2 = lga.W(((san) optional2.get()).n());
                                    bool3.getClass();
                                    return jbgVar3.a(W2, bool3.booleanValue());
                                }
                                return jbe.a;
                            }
                        }, jbgVar.a);
                    }
                    aohsVar2.C(j, jadVar.h);
                    E.bt.isPresent();
                    if (yig.b() && ((Boolean) ((utz) yig.ai.get()).e()).booleanValue()) {
                        iji ijiVar2 = (iji) E.bu.b();
                        E.K(new akfk((ansy) ijiVar2.c, new ikn(ijiVar2, i3), "MAGIC_COMPOSE_SETTINGS_DATASERVICE_KEY", 2), new ivy(E));
                    }
                    if (bundle2 != null) {
                        rrl rrlVar = (rrl) E.ca.a();
                        if (rrlVar.n == null) {
                            rrlVar.n = new lrf(bundle2);
                        }
                        E.H = bundle2.getString("saved_instance_state_clicked_suggestion_id");
                    } else {
                        bundle2 = null;
                    }
                    E.Q(new ivp(E, i3), new ilf(E, bundle2, 15, null));
                    ((rsr) E.cl.a()).C(E.A());
                    E.cB.g();
                    itb itbVar = E.bX;
                    itbVar.ay = new rre(E.ca);
                    itbVar.aM.ifPresent(new isb(1));
                    E.bX.x();
                    znp znpVar = (znp) E.W.b();
                    qiu.h(aktp.ah(new yar(znpVar, E.L, 19), znpVar.a));
                    E.cA.a(E.L).t();
                    if (E.aa.e()) {
                        rym rymVar = E.ac;
                        rymVar.c = E.L;
                        E.M.N().c(rymVar);
                    }
                    E.V.ifPresent(new ivn(6));
                    zsw zswVar = (zsw) E.M.G().e("banners2oFragment");
                    if (zswVar == null) {
                        ConversationIdType conversationIdType7 = E.L;
                        zsx zsxVar = zsx.CONVERSATION;
                        alwo alwoVar = ztc.a;
                        aozy createBuilder = zsy.a.createBuilder();
                        String a3 = conversationIdType7.a();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar = createBuilder.b;
                        zsy zsyVar = (zsy) apagVar;
                        a3.getClass();
                        zsyVar.b |= 1;
                        zsyVar.c = a3;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        zsy zsyVar2 = (zsy) createBuilder.b;
                        zsyVar2.d = zsxVar.d;
                        zsyVar2.b |= 2;
                        zsy zsyVar3 = (zsy) createBuilder.s();
                        zsw zswVar2 = new zsw();
                        apxh.e(zswVar2);
                        aklt.a(zswVar2, zsyVar3);
                        zswVar = zswVar2;
                    }
                    bd bdVar = new bd(E.M.G());
                    bdVar.v(R.id.banners_fragment, zswVar, "banners2oFragment");
                    bdVar.b();
                    E.bU = new ixa(E);
                    E.R(new ivp(E, 3), null);
                    E.bq();
                    if (((Boolean) ((utz) zxh.a.get()).e()).booleanValue()) {
                        zxg zxgVar = (zxg) E.M.G().e("ConversationBottomBarFragmentTag");
                        if (zxgVar == null) {
                            zxg zxgVar2 = new zxg();
                            apxh.e(zxgVar2);
                            E.bW = zxgVar2;
                        } else {
                            E.bW = zxgVar;
                        }
                        E.bW.a.c(new iww(E));
                        bd bdVar2 = new bd(E.M.G());
                        bdVar2.v(R.id.conversation_bottom_bar_fragment, E.bW, "ConversationBottomBarFragmentTag");
                        bdVar2.b();
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        Uri a;
        aksa f = this.c.f();
        try {
            aO(i, i2, intent);
            ixd E = E();
            if (i == 5001) {
                if (i2 == -1) {
                    Context x = E.M.x();
                    x.getClass();
                    Toast.makeText(x, R.string.calendar_event_added, 0).show();
                    String str = E.H;
                    E.H = null;
                    if (str != null) {
                        qiu.h(yyb.au());
                        aqbb.CONSUMED.getClass();
                        akul ag = aktp.ag(null);
                        ag.getClass();
                        ag.k(qiu.b(), andi.a);
                    }
                }
            } else {
                if (i == 132) {
                    if (i2 == -1) {
                        ifb ifbVar = E.cO;
                        MediaContentItem mediaContentItem = (MediaContentItem) intent.getParcelableExtra("gif_content_item");
                        mediaContentItem.getClass();
                        E.c(ifbVar.e(mediaContentItem, aauj.a(amqh.GIF, amqi.EXPANDED)));
                    } else {
                        i = 132;
                    }
                }
                if (i == 143) {
                    if (i2 == -1) {
                        Uri data = intent.getData();
                        if (data != null) {
                            E.cH.c(data, new aafo(E, 1));
                        }
                    } else {
                        i = 143;
                    }
                }
                if (i == 152 && i2 == -1) {
                    Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                    if (uri != null) {
                        rtb rtbVar = E.aD;
                        rtc a2 = rtd.a();
                        a2.c = intent.getType();
                        a2.d = uri;
                        a2.e = uri;
                        a2.k(ameb.MEDIA_EDITOR_ATTACH);
                        E.c(rtbVar.e(a2.a()));
                    }
                } else if (((Boolean) abdh.a.e()).booleanValue() && i == 501 && i2 == -1 && intent.getData() != null) {
                    Uri data2 = intent.getData();
                    if (((Boolean) ipe.g.e()).booleanValue()) {
                        a = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else {
                        a = rvt.a();
                    }
                    Uri V = aabr.V(data2, a);
                    rtb rtbVar2 = E.aD;
                    rtc a3 = rtd.a();
                    a3.c = "video/mp4";
                    a3.d = V;
                    a3.e = V;
                    a3.k(ameb.VIDEO_TRIMMER);
                    MessagePartData e = rtbVar2.e(a3.a());
                    if (((Boolean) ipe.g.e()).booleanValue()) {
                        E.R(new ivc(e, 18), null);
                    }
                    E.c(e);
                } else if (i == 1 && i2 == -1) {
                    E.ad();
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ixt, defpackage.aiuc, defpackage.cg
    public final void Y(Activity activity) {
        this.c.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public final void Z(Menu menu, MenuInflater menuInflater) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        BugleSearchView bugleSearchView;
        super.Z(menu, menuInflater);
        ixd E = E();
        if (!E.cB.e().isPresent()) {
            menuInflater.inflate(R.menu.conversation_menu, menu);
            rrl rrlVar = (rrl) E.ca.a();
            if (((Boolean) ktf.a.e()).booleanValue()) {
                menu.findItem(R.id.action_help_and_feedback).setVisible(false);
                menu.findItem(R.id.action_help).setVisible(true);
                menu.findItem(R.id.action_advanced_feedback).setVisible(true);
            }
            if (E.aU()) {
                menu.findItem(R.id.action_search_starred_messages).setVisible(true).setTitle(R.string.action_search_starred_messages);
            }
            if (((Boolean) wsm.a.e()).booleanValue()) {
                menu.findItem(R.id.action_show_subject_field).setVisible(((Boolean) E.G(new ivk(9), new ivk(10))).booleanValue());
            }
            if (rrlVar.r()) {
                menu.findItem(R.id.action_info_and_options).setVisible(true);
                menu.findItem(R.id.action_people_and_options).setVisible(false);
                menu.findItem(R.id.action_add_contact).setVisible(false);
                menu.findItem(R.id.action_block_and_report_spam).setVisible(true);
            } else {
                menu.findItem(R.id.action_info_and_options).setVisible(false);
                MenuItem findItem = menu.findItem(R.id.action_people_and_options);
                if (true != rrlVar.b.b()) {
                    i = R.string.action_people_and_options;
                } else {
                    i = R.string.action_people_and_options_group;
                }
                findItem.setTitle(i);
                findItem.setEnabled(rrlVar.d);
                if (((Boolean) ((utz) ymd.g.get()).e()).booleanValue() && !rrlVar.b.b()) {
                    menu.findItem(R.id.action_block_and_report_spam).setVisible(true);
                }
                ParticipantsTable.BindData a = rrlVar.e.a();
                if (a != null && TextUtils.isEmpty(a.N()) && !rxn.p(a) && ((rrl) E.ca.a()).p() && !a.A().a()) {
                    z = true;
                } else {
                    z = false;
                }
                menu.findItem(R.id.action_add_contact).setVisible(z);
            }
            tqc tqcVar = rrlVar.b.a;
            menu.findItem(R.id.action_archive).setVisible(!tqcVar.d());
            if (tqcVar != null && tqcVar.h()) {
                z2 = true;
            } else {
                z2 = false;
            }
            MenuItem findItem2 = menu.findItem(R.id.action_unarchive);
            if (tqcVar.d() && !z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            findItem2.setVisible(z3);
            boolean h = tqcVar.h();
            boolean z6 = !h;
            rrl rrlVar2 = (rrl) E.ca.a();
            TelephonyManager telephonyManager = (TelephonyManager) ((yjv) E.ai.e.b()).d.get();
            if (telephonyManager != null && telephonyManager.isVoiceCapable() && rrlVar2.e.d().isPresent() && !rrlVar2.e.h() && !h) {
                z4 = true;
            } else {
                z4 = false;
            }
            E.s = menu.findItem(R.id.action_call);
            E.s.setVisible(z4);
            menu.findItem(R.id.action_call).setVisible(z4);
            if (((Boolean) yvr.a.e()).booleanValue() && rrlVar.d) {
                E.aM(menu, z6);
            }
            E.u = menu.findItem(R.id.action_rbm_verification_badge);
            E.aL();
            if (E.at) {
                ((aakd) E.ad.b()).a(menu.addSubMenu(0, 0, 1000, "Debug"), true);
            }
            if (!E.aE.isEmpty()) {
                E.q = menu.findItem(R.id.action_search);
                E.br(E.q);
                MenuItem menuItem = E.q;
                if (menuItem != null && (bugleSearchView = (BugleSearchView) menuItem.getActionView()) != null) {
                    bugleSearchView.setMaxWidth(Integer.MAX_VALUE);
                    bugleSearchView.setQueryHint(E.M.z().getString(R.string.search_hint));
                    akvh akvhVar = new akvh(E.cU, new iwp(E, bugleSearchView));
                    MenuItem menuItem2 = E.q;
                    menuItem2.getClass();
                    menuItem2.setOnActionExpandListener(new iwq(E));
                    if (E.bP != null) {
                        E.q.expandActionView();
                        bugleSearchView.setOnQueryTextListener(akvhVar);
                        bugleSearchView.clearFocus();
                        bugleSearchView.setQuery(E.bP, false);
                        E.X();
                    } else {
                        E.aE.ifPresent(new isb(12));
                        E.X();
                    }
                }
            }
            E.r = menu.findItem(R.id.action_zero_state_search);
            E.br(E.r);
            menu.findItem(R.id.action_search).setVisible(false);
            menu.findItem(R.id.action_zero_state_search).setVisible(true);
            MenuItem findItem3 = menu.findItem(R.id.action_add_recipients);
            if (!E.cM.a) {
                menu.findItem(R.id.action_add_contact).setVisible(false);
                Intent s = E.s();
                if (s != null && s.getBooleanExtra("render_add_recipient_button", false)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                E.v = z5;
                if (!z5) {
                    findItem3.setShowAsAction(0);
                }
                findItem3.setVisible(!rrlVar.r());
            } else {
                E.v = false;
                findItem3.setVisible(false);
            }
            yuw.a(menu);
            izc izcVar = E.cJ;
            aluq listIterator = ((altg) izcVar.a).listIterator();
            while (listIterator.hasNext()) {
                ((jcg) listIterator.next()).b();
            }
        }
    }

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ixd E() {
        ixd ixdVar = this.a;
        if (ixdVar != null) {
            if (!this.ag) {
                return ixdVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0238, code lost:
    
        if (((java.lang.Boolean) defpackage.yvr.f.e()).booleanValue() != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0389 A[Catch: all -> 0x0a17, TryCatch #0 {all -> 0x0a17, blocks: (B:3:0x0008, B:5:0x0017, B:11:0x0023, B:14:0x0034, B:15:0x0030, B:18:0x004c, B:22:0x0057, B:25:0x0081, B:27:0x00a0, B:29:0x00a8, B:30:0x00ab, B:31:0x00b2, B:33:0x00c2, B:35:0x00ca, B:36:0x00cd, B:38:0x00e3, B:40:0x00f1, B:42:0x00f9, B:43:0x00fc, B:44:0x0107, B:45:0x0116, B:47:0x011c, B:51:0x0129, B:52:0x0130, B:54:0x0131, B:55:0x013d, B:56:0x0140, B:57:0x016d, B:58:0x0171, B:59:0x03b7, B:61:0x03c5, B:63:0x03cd, B:64:0x03d0, B:65:0x0442, B:67:0x0454, B:68:0x0457, B:70:0x0472, B:71:0x0475, B:72:0x03de, B:74:0x03ec, B:76:0x03f4, B:77:0x03f7, B:78:0x0404, B:80:0x0412, B:82:0x041a, B:83:0x041d, B:84:0x042b, B:86:0x0433, B:87:0x0436, B:88:0x0145, B:89:0x0159, B:90:0x01a2, B:91:0x01a9, B:92:0x01aa, B:94:0x01b2, B:95:0x01b5, B:97:0x01c7, B:99:0x01d5, B:102:0x01e2, B:104:0x01ea, B:105:0x01ed, B:107:0x01f9, B:109:0x0201, B:110:0x0205, B:115:0x023c, B:117:0x0240, B:119:0x024e, B:121:0x0269, B:124:0x028a, B:126:0x0290, B:128:0x029a, B:130:0x029e, B:131:0x02a1, B:133:0x02ae, B:134:0x02c9, B:136:0x02da, B:137:0x033f, B:139:0x035f, B:140:0x0362, B:142:0x02e9, B:144:0x02f7, B:145:0x0306, B:147:0x0314, B:148:0x0323, B:150:0x0331, B:153:0x0370, B:154:0x037b, B:156:0x0389, B:158:0x0391, B:159:0x0394, B:160:0x039f, B:161:0x0224, B:163:0x022c, B:165:0x0492, B:166:0x0499, B:169:0x049f, B:172:0x04c5, B:175:0x04e1, B:178:0x04eb, B:181:0x0509, B:184:0x0513, B:186:0x0523, B:187:0x0545, B:188:0x054c, B:191:0x0552, B:196:0x0596, B:197:0x05b9, B:199:0x05bf, B:201:0x05d7, B:204:0x05de, B:206:0x05fb, B:207:0x05e6, B:209:0x05ec, B:210:0x05f3, B:212:0x0610, B:214:0x0670, B:215:0x0673, B:220:0x067d, B:222:0x0683, B:223:0x06cb, B:226:0x06d5, B:229:0x06e5, B:232:0x06f7, B:234:0x0707, B:236:0x070d, B:237:0x0720, B:239:0x0730, B:241:0x0738, B:243:0x0748, B:244:0x0751, B:245:0x07cd, B:246:0x06f3, B:249:0x07f7, B:250:0x0808, B:252:0x080c, B:255:0x0834, B:257:0x0842, B:260:0x084c, B:263:0x085a, B:265:0x0868, B:266:0x088b, B:268:0x089b, B:269:0x08be, B:270:0x08f4, B:271:0x0917, B:274:0x0921, B:277:0x092f, B:279:0x093f, B:280:0x0962, B:282:0x0972, B:283:0x0995, B:284:0x09ca, B:285:0x09ec, B:286:0x09fe, B:288:0x0a04, B:291:0x0a10), top: B:2:0x0008, inners: #1 }] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean aC(android.view.MenuItem r24) {
        /*
            Method dump skipped, instructions count: 2622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuz.aC(android.view.MenuItem):boolean");
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.d == null) {
            this.d = new aklm(this, super.x());
        }
        return this.d;
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final aktr aW() {
        return this.c.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.c.e(aktrVar, z);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.c.b = aktrVar;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void aa() {
        aksa b = this.c.b();
        try {
            aQ();
            ixd E = E();
            E.cj = false;
            E.Q(null, new ivg(7));
            if (E.ca.g()) {
                E.ca.f();
            }
            Object obj = E.F;
            Activity q = E.q();
            if (((Boolean) utw.K.e()).booleanValue()) {
                try {
                    q.unregisterReceiver((BroadcastReceiver) obj);
                } catch (IllegalArgumentException e) {
                    jaf.a.r("Exception while un-registering receiver", e);
                }
            }
            Object obj2 = E.E;
            Activity q2 = E.q();
            try {
                if (DefaultSmsSubscriptionChangeReceiver.f()) {
                    q2.unregisterReceiver((BroadcastReceiver) obj2);
                }
            } catch (IllegalArgumentException e2) {
                DefaultSmsSubscriptionChangeReceiver.a.r("Exception while un-registering receiver", e2);
            }
            abcz abczVar = E.B;
            if (abczVar != null) {
                E.as.h(abczVar);
            }
            ev evVar = E.e;
            if (evVar != null) {
                evVar.dismiss();
                E.e = null;
            }
            if (yig.b()) {
                ((Optional) ((apxx) E.bv).a).ifPresent(new ivg(8));
            }
            if (((Boolean) E.by.b()).booleanValue()) {
                ((jbo) E.cC.a(jbo.class)).f = null;
            }
            ((wtt) E.bD.b()).d();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ac(boolean z) {
        E().R(null, new ivg(15));
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ad() {
        this.c.k();
        try {
            ba();
            ixd E = E();
            E.ap();
            E.aR();
            E.cg = false;
            E.R(new ivh(E, 10), new ivg(11));
            ((ubl) E.aB.b()).b(ruy.a);
            epw.a(E.q()).c(E.r());
            String[] strArr = {"Bugle.UI.ConversationActivity.Send.Duration.Sms", "Bugle.UI.ConversationActivity.Send.Duration.Mms.Text", "Bugle.UI.ConversationActivity.Send.Duration.Mms.Attachment", "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Text", "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Attachment", "Bugle.UI.ConversationActivity.Send.Duration.Cloud.Sync"};
            for (int i = 0; i < 6; i++) {
                E.P.h(strArr[i]);
            }
            alvw f = ixd.a.f();
            f.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) f;
            alvgVar.X(ydl.p, E.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onPause", 4953, "ConversationFragmentPeer.java")).q("ConversationFragment: Conversation.onPause");
            E.bO = -1L;
            if (E.aE.isPresent()) {
                E.N();
            }
            if (((Boolean) wsm.a.e()).booleanValue() && E.da != null) {
                E.aU.ifPresent(new ivg(12));
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[Catch: all -> 0x010f, TRY_LEAVE, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x000f, B:5:0x001d, B:8:0x0039, B:10:0x003d, B:15:0x0055, B:16:0x0089, B:19:0x00bd, B:21:0x00cc, B:22:0x00f7), top: B:2:0x000f }] */
    @Override // defpackage.aiuc, defpackage.cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ae(android.view.Menu r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuz.ae(android.view.Menu):void");
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void af() {
        aksa b = this.c.b();
        try {
            bb();
            ixd E = E();
            ((iqt) E.bi.b()).a(4);
            int i = 1;
            E.cj = true;
            alvw d = ixd.a.d();
            d.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) d;
            alvgVar.X(ydl.p, E.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onResume", 3840, "ConversationFragmentPeer.java")).q("ConversationFragment: DraftDataService : refresh onResume");
            if (E.bY == null && E.ck) {
                ((rsr) E.cl.a()).F();
            }
            E.Q(new ivc(E, 9), new ivc(E, 10));
            E.bY = null;
            E.ck = false;
            if (!E.aV()) {
                E.bH = false;
            }
            E.Q(new ivc(E, 11), new isb(17));
            if (!E.aV()) {
                E.bH = true;
            }
            if (!((Boolean) ijf.a.e()).booleanValue() && E.cB.S()) {
                E.cB.K();
                E.Q(new isb(18), new isb(19));
            }
            E.Q(null, new isb(20));
            E.ax();
            E.bX.n();
            E.R(new ivc(E, 12), new ivg(i));
            epw.a(E.q()).b(E.r(), new IntentFilter("conversation_self_id_change"));
            if (((Boolean) wsm.a.e()).booleanValue()) {
                E.da = new hlc();
                E.aU.ifPresent(new isb(16));
            }
            if (yig.b()) {
                alvw d2 = ixd.a.d();
                d2.X(alwp.a, "Bugle");
                alvg alvgVar2 = (alvg) d2;
                alvgVar2.X(ydl.p, E.L);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onResume", 3920, "ConversationFragmentPeer.java")).q("ConversationFragment: Updating Magic Compose visibility on conversation resume.");
                E.aI();
            }
            if (E.bO > 0) {
                long epochMilli = E.ab.f().toEpochMilli() - E.bO;
                alvw f = ixd.a.f();
                f.X(alwp.a, "Bugle");
                alvg alvgVar3 = (alvg) f;
                alvgVar3.X(ydl.p, E.L);
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onResume", 3929, "ConversationFragmentPeer.java")).s("ConversationFragment: Conversation load time (msec): %d", epochMilli);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.c.k();
        try {
            aktp.bH(this).a = view;
            E();
            hlc.X(this, E());
            bf(view, bundle);
            ((nhh) E().ba.b()).c();
            ((ViewStub) view.findViewById(R.id.conversation_statusbar_scrim_stub)).inflate();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ak(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        albo.U(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ak(bundle);
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.ixt
    protected final /* bridge */ /* synthetic */ aklw d() {
        return new akls(this, true);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.ixt, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        apya apyaVar = ((kql) aS).a.dA;
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        Activity activity = (Activity) ((kql) aS).el.e.b();
                        eoy eoyVar = (eoy) ((kql) aS).k.b();
                        xwr xwrVar = (xwr) ((kql) aS).a.pR.b();
                        ytj ytjVar = new ytj((anen) ((kql) aS).a.z.b(), (msk) ((kql) aS).a.dd.b(), (ytk) ((kql) aS).a.oj.b(), (qyn) ((kql) aS).ej.aj.b());
                        yjr yjrVar = (yjr) ((kql) aS).a.bO.b();
                        apwt a = apxv.a(((kql) aS).j);
                        xnv xnvVar = (xnv) ((kql) aS).a.bV.b();
                        kqh kqhVar = ((kql) aS).el;
                        uac Qm = kqhVar.b.Qm();
                        anen anenVar = (anen) kqhVar.b.ay.b();
                        krx krxVar = kqhVar.b.a;
                        try {
                            lxe lxeVar = new lxe(krxVar.a.Qm(), (anen) krxVar.a.z.b());
                            krv krvVar = kqhVar.b;
                            iql iqlVar = new iql(krvVar.z, krvVar.m, krvVar.bV, krvVar.rP, krvVar.rG, kqhVar.V.R, (byte[]) null);
                            vid vidVar = (vid) kqhVar.b.kO.b();
                            anen anenVar2 = (anen) kqhVar.b.m.b();
                            kqp kqpVar = kqhVar.V;
                            apya apyaVar2 = kqpVar.J;
                            apya apyaVar3 = kqpVar.Z;
                            krv krvVar2 = kqhVar.b;
                            ijw ijwVar = new ijw(Qm, anenVar, lxeVar, iqlVar, vidVar, anenVar2, apyaVar2, apyaVar3, krvVar2.lF, krvVar2.pH, kqpVar.U, kqpVar.M, krvVar2.dd, kqhVar.o, krvVar2.iL, krvVar2.kQ, kqpVar.L, kqpVar.aa);
                            apya apyaVar4 = ((kql) aS).el.e;
                            apya apyaVar5 = ((kql) aS).s;
                            apya apyaVar6 = ((kql) aS).bk;
                            apya apyaVar7 = ((kql) aS).bn;
                            krv krvVar3 = ((kql) aS).a;
                            nei neiVar = new nei(apyaVar4, apyaVar5, apyaVar6, apyaVar7, krvVar3.bB, krvVar3.yE, (byte[]) null, (byte[]) null, (byte[]) null);
                            iji c = ((kql) aS).el.c();
                            aair aairVar = (aair) ((kql) aS).a.a.cV.b();
                            Optional empty = Optional.empty();
                            apya apyaVar8 = ((kql) aS).bo;
                            apya apyaVar9 = ((kql) aS).bp;
                            apya apyaVar10 = ((kql) aS).ab;
                            apya apyaVar11 = ((kql) aS).c;
                            apya apyaVar12 = ((kql) aS).bq;
                            krv krvVar4 = ((kql) aS).a;
                            yyz yyzVar = new yyz(apyaVar8, apyaVar9, apyaVar10, apyaVar11, apyaVar12, krvVar4.a.cX, krvVar4.bU, ((kql) aS).br, krvVar4.gD, krvVar4.bV, krvVar4.yF, ((kql) aS).bs, ((kql) aS).v, null, null);
                            Optional optional = (Optional) ((kql) aS).bt.b();
                            mbl mblVar = (mbl) ((kql) aS).a.bB.b();
                            apwt a2 = apxv.a(((kql) aS).ej.al);
                            abbj abbjVar = (abbj) ((kql) aS).aR.b();
                            rss rssVar = (rss) ((kql) aS).q.b();
                            ydc ydcVar = (ydc) ((kql) aS).a.dU.b();
                            ydf ydfVar = (ydf) ((kql) aS).a.je.b();
                            abqa abqaVar = (abqa) ((kql) aS).a.wj.b();
                            ksi ksiVar = (ksi) ((kql) aS).a.ft.b();
                            apya apyaVar13 = ((kql) aS).ej.ag;
                            yai yaiVar = (yai) ((kql) aS).br.b();
                            krv krvVar5 = ((kql) aS).a;
                            mcp mcpVar = new mcp(krvVar5.eB, new itw(4), (Executor) krvVar5.m.b());
                            xbf xbfVar = (xbf) ((kql) aS).a.hA.b();
                            xbi xbiVar = (xbi) ((kql) aS).a.hC.b();
                            yio yioVar = (yio) ((kql) aS).a.oD.b();
                            krv krvVar6 = ((kql) aS).a;
                            apya apyaVar14 = krvVar6.oB;
                            qya qyaVar = (qya) krvVar6.jc.b();
                            apya apyaVar15 = ((kql) aS).el.k;
                            wfh wfhVar = (wfh) ((kql) aS).a.BD.b();
                            xyt xytVar = (xyt) ((kql) aS).a.gY.b();
                            wfh wfhVar2 = (wfh) ((kql) aS).a.ec.b();
                            rym rymVar = (rym) ((kql) aS).a.a.dj.b();
                            xzu xzuVar = (xzu) ((kql) aS).ej.j.b();
                            aohs aohsVar = (aohs) ((kql) aS).s.b();
                            mce mceVar = (mce) ((kql) aS).a.bX.b();
                            krv krvVar7 = ((kql) aS).a;
                            apya apyaVar16 = krvVar7.pH;
                            apya apyaVar17 = krvVar7.yJ;
                            qky qkyVar = (qky) krvVar7.a.cL.b();
                            yti ytiVar = (yti) ((kql) aS).a.oX.b();
                            apya apyaVar18 = ((kql) aS).bu;
                            rgo rgoVar = (rgo) ((kql) aS).ej.D.b();
                            apya apyaVar19 = ((kql) aS).a.gD;
                            abac abacVar = (abac) ((kql) aS).af.b();
                            ytk ytkVar = (ytk) ((kql) aS).a.oj.b();
                            apwt a3 = apxv.a(((kql) aS).a.fu);
                            Context context2 = (Context) ((kql) aS).a.n.b();
                            krv krvVar8 = ((kql) aS).a;
                            znj znjVar = new znj(context2, (Optional) ((apxx) krvVar8.aG).a, (byte[]) null);
                            aagg aaggVar = new aagg(((kql) aS).by, ((kql) aS).bB, new xcx((yyb) krvVar8.a.cW.b(), ((kql) aS).u(), new xda()), new aafz(((kql) aS).u()));
                            ifb ifbVar = (ifb) ((kql) aS).K.b();
                            apwt a4 = apxv.a(((kql) aS).bF);
                            abdc abdcVar = (abdc) ((kql) aS).a.a.cX.b();
                            yyt yytVar = (yyt) ((kql) aS).a.eS.b();
                            kqp kqpVar2 = ((kql) aS).ej;
                            apya apyaVar20 = kqpVar2.h;
                            apya apyaVar21 = kqpVar2.L;
                            krv krvVar9 = kqpVar2.a;
                            xwe xweVar = new xwe(apyaVar20, apyaVar21, krvVar9.dm, krvVar9.bV);
                            rsv rsvVar = (rsv) ((kql) aS).ej.z.b();
                            abbu abbuVar = (abbu) ((kql) aS).a.yF.b();
                            zfh zfhVar = (zfh) ((kql) aS).bG.b();
                            Optional empty2 = Optional.empty();
                            aant aantVar = (aant) ((kql) aS).a.a.bD.b();
                            akbo akboVar = (akbo) ((kql) aS).e.b();
                            wfh wfhVar3 = (wfh) ((kql) aS).a.a.m.b();
                            yjf yjfVar = (yjf) ((kql) aS).a.bU.b();
                            alor alorVar = altc.a;
                            krv krvVar10 = ((kql) aS).a;
                            Optional optional2 = (Optional) ((apxx) krvVar10.uF).a;
                            kor korVar = (kor) krvVar10.za.b();
                            aohs aohsVar2 = (aohs) ((kql) aS).el.c.b();
                            gpx gpxVar = (gpx) ((kql) aS).ej.am.b();
                            apya apyaVar22 = ((kql) aS).a.pP;
                            rix rixVar = (rix) ((kql) aS).ej.O.b();
                            lfl lflVar = (lfl) ((kql) aS).a.ot.b();
                            aksr aksrVar = (aksr) ((kql) aS).ej.d.b();
                            akmy s = ((kql) aS).s();
                            rtb rtbVar = (rtb) ((kql) aS).a.eb.b();
                            Optional optional3 = (Optional) ((apxx) ((kql) aS).aT).a;
                            Optional empty3 = Optional.empty();
                            altx altxVar = new altx(new vxi(((kql) aS).ej.d()));
                            lig q = ((kql) aS).q();
                            aqws aqwsVar = (aqws) ((kql) aS).el.l.b();
                            Optional optional4 = (Optional) ((apxx) ((kql) aS).a.Ck).a;
                            Optional empty4 = Optional.empty();
                            Optional empty5 = Optional.empty();
                            Optional empty6 = Optional.empty();
                            Optional empty7 = Optional.empty();
                            Optional empty8 = Optional.empty();
                            Optional empty9 = Optional.empty();
                            xjo H = ((ztu) ((apxq) ((aklj) ((kql) aS).el.f.b()).a).aS()).H();
                            H.getClass();
                            apya apyaVar23 = ((kql) aS).ej.ab;
                            msk mskVar = (msk) ((kql) aS).a.dd.b();
                            krv krvVar11 = ((kql) aS).a;
                            apya apyaVar24 = krvVar11.oO;
                            apya apyaVar25 = krvVar11.de;
                            apwt a5 = apxv.a(((kql) aS).bd);
                            apwt a6 = apxv.a(((kql) aS).aX);
                            apya apyaVar26 = ((kql) aS).bL;
                            yya e = ((kql) aS).e();
                            jbn jbnVar = new jbn(((kql) aS).a.pH, (eoy) ((kql) aS).k.b());
                            hwo m = ((kql) aS).m();
                            apya apyaVar27 = ((kql) aS).a.fm;
                            hgj hgjVar = new hgj(new iji((uac) ((kql) aS).b.b(), (miw) ((kql) aS).ej.v.b(), (enh) ((kql) aS).bM.b(), (byte[]) null), (byte[]) null);
                            mnd mndVar = mnd.RCS_GROUP_SELF_ONLY;
                            kqh kqhVar2 = ((kql) aS).el;
                            hgj hgjVar2 = new hgj(alor.m(mndVar, kqhVar2.p, mnd.RCS_GROUP_CREATED_TOO_LARGE, kqhVar2.q), (byte[]) null);
                            apya apyaVar28 = ((kql) aS).c;
                            gpx v = ((kql) aS).v();
                            lbi c2 = ((kql) aS).c();
                            kor korVar2 = (kor) ((kql) aS).l.b();
                            apya apyaVar29 = ((kql) aS).i;
                            apya apyaVar30 = ((kql) aS).a.aM;
                            apya apyaVar31 = ((kql) aS).bN;
                            Bundle a7 = ((kql) aS).a();
                            aozs aozsVar = (aozs) ((kql) aS).a.a.dt.b();
                            d.t(a7.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            iuy iuyVar = (iuy) aowt.f(a7, "TIKTOK_FRAGMENT_ARGUMENT", iuy.a, aozsVar);
                            iuyVar.getClass();
                            ajwt ajwtVar = (ajwt) ((kql) aS).ej.b.b();
                            apya apyaVar32 = ((kql) aS).a.bY;
                            izc izcVar = new izc(altg.a);
                            hmk iS = ((kql) aS).a.a.iS();
                            apya apyaVar33 = ((kql) aS).bO;
                            apya apyaVar34 = ((kql) aS).bP;
                            apya apyaVar35 = ((kql) aS).bQ;
                            apya apyaVar36 = ((kql) aS).bS;
                            apya apyaVar37 = ((kql) aS).ej.Y;
                            krv krvVar12 = ((kql) aS).a;
                            apya apyaVar38 = krvVar12.ih;
                            apya apyaVar39 = ((kql) aS).el.r;
                            krx krxVar2 = krvVar12.a;
                            apya apyaVar40 = krxVar2.dz;
                            apya apyaVar41 = ((kql) aS).bT;
                            apya apyaVar42 = krxVar2.dA;
                            apya apyaVar43 = ((kql) aS).v;
                            apya apyaVar44 = krvVar12.jC;
                            apya apyaVar45 = krxVar2.A;
                            Optional empty10 = Optional.empty();
                            Optional optional5 = (Optional) ((apxx) ((kql) aS).bU).a;
                            Optional optional6 = (Optional) ((apxx) ((kql) aS).bV).a;
                            Optional optional7 = (Optional) ((apxx) ((kql) aS).bW).a;
                            Optional empty11 = Optional.empty();
                            Optional optional8 = (Optional) ((apxx) ((kql) aS).bX).a;
                            Optional empty12 = Optional.empty();
                            apya apyaVar46 = ((kql) aS).bY;
                            apya apyaVar47 = ((kql) aS).w;
                            apya apyaVar48 = ((kql) aS).bE;
                            Optional empty13 = Optional.empty();
                            krv krvVar13 = ((kql) aS).a;
                            ixd ixdVar = new ixd(apyaVar, cgVar, activity, eoyVar, xwrVar, ytjVar, yjrVar, a, xnvVar, ijwVar, neiVar, c, aairVar, empty, yyzVar, optional, mblVar, a2, abbjVar, rssVar, ydcVar, ydfVar, abqaVar, ksiVar, apyaVar13, yaiVar, mcpVar, xbfVar, xbiVar, yioVar, apyaVar14, qyaVar, apyaVar15, wfhVar, xytVar, wfhVar2, rymVar, xzuVar, aohsVar, mceVar, apyaVar16, apyaVar17, qkyVar, ytiVar, apyaVar18, rgoVar, apyaVar19, abacVar, ytkVar, a3, znjVar, aaggVar, ifbVar, a4, abdcVar, yytVar, xweVar, rsvVar, abbuVar, zfhVar, empty2, aantVar, akboVar, wfhVar3, yjfVar, alorVar, optional2, korVar, aohsVar2, gpxVar, apyaVar22, rixVar, lflVar, aksrVar, s, rtbVar, optional3, empty3, altxVar, q, aqwsVar, optional4, empty4, empty5, empty6, empty7, empty8, empty9, H, apyaVar23, mskVar, apyaVar24, apyaVar25, a5, a6, apyaVar26, e, jbnVar, m, apyaVar27, hgjVar, hgjVar2, apyaVar28, v, c2, korVar2, apyaVar29, apyaVar30, apyaVar31, iuyVar, ajwtVar, apyaVar32, izcVar, iS, apyaVar33, apyaVar34, apyaVar35, apyaVar36, apyaVar37, apyaVar38, apyaVar39, apyaVar40, apyaVar41, apyaVar42, apyaVar43, apyaVar44, apyaVar45, empty10, optional5, optional6, optional7, empty11, optional8, empty12, apyaVar46, apyaVar47, apyaVar48, empty13, krvVar13.tV, krvVar13.eN, krvVar13.dq, krvVar13.dF, krvVar13.id, ((kql) aS).u, ((kql) aS).ca, krvVar13.a.dC, krvVar13.yE);
                            this.a = ixdVar;
                            ixdVar.df = this;
                            this.Z.c(new akli(this.c, this.e));
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                akqj.p();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        this.c.k();
        try {
            aP(bundle);
            ixd E = E();
            ((iqt) E.bi.b()).a(2);
            alvw g = ixd.a.g();
            g.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) g;
            alvgVar.X(ydl.p, E.L);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onCreate", 1791, "ConversationFragmentPeer.java")).q("ConversationFragment: onCreate begin");
            E.p = (iks) E.cC.a(iks.class);
            jbo jboVar = (jbo) E.cC.a(jbo.class);
            byte[] bArr = null;
            if (((Boolean) E.by.b()).booleanValue()) {
                jboVar.f = new qdq(E, null);
            }
            jbn jbnVar = E.aX;
            if (bundle == null) {
                mgv mgvVar = (mgv) jbnVar.a.b();
                mgvVar.e(mgv.u);
                mgvVar.e(mgv.v);
            }
            if (!E.aV()) {
                E.cF.d(bundle);
            }
            int i = 1;
            E.cj = true;
            E.M.am(true);
            E.co = false;
            E.bO = E.ab.f().toEpochMilli();
            E.cb = E.M.z().getColor(R.color.action_bar_background_color);
            Activity q = E.q();
            jaf jafVar = new jaf();
            if (((Boolean) utw.K.e()).booleanValue()) {
                egl.h(q, jafVar, new IntentFilter("com.lge.android.intent.action.DUAL_SIM_SWITCHING_DONE"));
            }
            E.F = jafVar;
            Activity q2 = E.q();
            DefaultSmsSubscriptionChangeReceiver defaultSmsSubscriptionChangeReceiver = new DefaultSmsSubscriptionChangeReceiver();
            if (DefaultSmsSubscriptionChangeReceiver.f()) {
                egl.h(q2, defaultSmsSubscriptionChangeReceiver, new IntentFilter("com.huawei.android.dsdscardmanager.SIM_CARD_NAME_SUB1_UPDATED_ACTION"));
                egl.h(q2, defaultSmsSubscriptionChangeReceiver, new IntentFilter("com.huawei.android.dsdscardmanager.SIM_CARD_NAME_SUB2_UPDATED_ACTION"));
            }
            E.E = defaultSmsSubscriptionChangeReceiver;
            E.B = new zqy(E, i, bArr);
            E.as.d(E.B);
            E.cu = abbu.a(E.M.fe());
            alvw g2 = ixd.a.g();
            g2.X(alwp.a, "Bugle");
            alvg alvgVar2 = (alvg) g2;
            alvgVar2.X(ydl.p, E.L);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onCreate", 1841, "ConversationFragmentPeer.java")).q("ConversationFragment: Registering FutureMixins");
            E.g = new ixd.c();
            E.h = new ixd.g();
            E.i = E.br.map(new ivk(i));
            E.j = new ixd.h();
            E.k = new ixd.f();
            E.l = new ixd.d();
            E.m = new ixd.a();
            E.n = new ixd.b();
            E.o = new lts(new lui(E, 1), new ioe(7));
            E.ay.b(E.g);
            E.ay.b(E.h);
            E.i.ifPresent(new ivh(E, 11));
            E.ay.b(E.j);
            E.ay.b(E.k);
            E.ay.b(E.l);
            E.ay.b(E.m);
            E.ay.b(E.n);
            E.ay.b(E.aZ);
            E.ay.b(((nhh) E.ba.b()).d);
            E.ay.b(E.o);
            ((igz) E.aL.b()).c(new ijk(12));
            if (((Optional) E.aK.b()).isPresent()) {
                E.M.N().c((enl) ((Optional) E.aK.b()).get());
            }
            aluq listIterator = ((altg) E.cJ.a).listIterator();
            while (listIterator.hasNext()) {
                ((jcg) listIterator.next()).d();
            }
            ((xcs) E.bg.b()).c();
            E.f = E.M.M(new sl(), new yjk(E, i));
            ((wtt) E.bD.b()).c((akgu) E.bC.b(), E.M.y());
            akrh e = aktp.e("ConversationFragment::initializeExpressiveStickers");
            try {
                if (((Boolean) utw.f.e()).booleanValue()) {
                    ((aark) E.bM.b()).b();
                }
                e.close();
                alvw g3 = ixd.a.g();
                g3.X(alwp.a, "Bugle");
                alvg alvgVar3 = (alvg) g3;
                alvgVar3.X(ydl.p, E.L);
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onCreate", 1889, "ConversationFragmentPeer.java")).q("ConversationFragment: onCreate complete");
                akqj.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new aklx.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void h() {
        aksa b = this.c.b();
        try {
            aT();
            ixd E = E();
            ((vrn) E.ae.a()).l(E.A());
            E.Q(null, new ivn(10));
            if (E.cw != null) {
                E.cr.getViewTreeObserver().removeOnGlobalLayoutListener(E.cw);
            }
            E.R(null, new ivp(E, 9));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public final void i() {
        aksa a = this.c.a();
        try {
            aV();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void j(Bundle bundle) {
        String str;
        this.c.k();
        try {
            bc(bundle);
            ixd E = E();
            E.cj = false;
            if (E.aE.isPresent() && (str = E.bP) != null) {
                bundle.putString("saved_instance_state_search_query_key", str);
            }
            E.Q(null, new ivp(bundle, 10));
            if (E.ca.g()) {
                rrl rrlVar = (rrl) E.ca.a();
                Context x = E.M.x();
                x.getClass();
                new lrf(Integer.valueOf(rrlVar.b(x)), rrlVar.m(), rrlVar.n()).n(bundle);
            }
            String str2 = E.H;
            if (str2 != null) {
                bundle.putString("saved_instance_state_clicked_suggestion_id", str2);
            }
            E.bL.a(bundle);
            aluq listIterator = ((altg) E.cJ.a).listIterator();
            while (listIterator.hasNext()) {
                ((jcg) listIterator.next()).e();
            }
            jad jadVar = E.bK;
            if (jadVar != null && jadVar.f) {
                bundle.putBoolean("saved_instance_state_active_sim_checker_key", true);
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void k() {
        this.c.k();
        try {
            bd();
            ixd E = E();
            ((iqt) E.bi.b()).a(3);
            itb itbVar = E.bX;
            itbVar.aq.f.p();
            itbVar.ar.X();
            E.Q(null, new ivg(0));
            View view = E.cq;
            if (view != null) {
                view.requestFocus();
            }
            if (((Boolean) utw.q.e()).booleanValue()) {
                Context x = E.M.x();
                x.getClass();
                if (lgb.E(x) == 3) {
                    E.Q(null, new ivc(E, 13));
                }
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void l() {
        this.c.k();
        try {
            be();
            ixd E = E();
            cj fe = E.M.fe();
            if (fe != null) {
                E.cq = fe.getCurrentFocus();
                if (fe.isFinishing() && E.bh()) {
                    E.Q(new ivc(E, 5), new ivc(E, 6));
                }
            }
            View view = E.M.Q;
            if (view != null) {
                View findViewById = view.findViewById(R.id.focus_sink);
                if (findViewById != null) {
                    findViewById.requestFocus();
                }
                E.R(new ivc(E, 7), new isb(15));
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ah.l(cls, akvzVar);
    }

    @Override // defpackage.aiuc, defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ixd E = E();
        Optional.ofNullable(E.bX.ao.C).ifPresent(new ile(20));
        E.R(null, new ivc(configuration, 14));
        E.aE();
        E.cI.d();
        MenuItem menuItem = E.r;
        if (menuItem != null && menuItem.isVisible()) {
            E.r.setShowAsAction(0);
            E.bo();
        }
    }

    @Override // defpackage.ixt, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
