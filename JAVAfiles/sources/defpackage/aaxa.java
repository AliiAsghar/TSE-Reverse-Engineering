package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.button.MaterialButton;
import defpackage.apxm;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxa extends aawm implements akkh, apxq, akkf, aklk, akrw, akwc {
    private boolean ag;
    private aaxd d;
    private Context e;
    public final eno a = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public aaxa() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aaxd.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            aaxd E = E();
            E.B.isPresent();
            Bundle bundle2 = E.A.m;
            if (bundle2 != null) {
                E.M = bundle2.getBoolean("show_direct_send_viewer");
                E.N = E.A.m.getBoolean("show_direct_send_button");
            }
            if (E.M) {
                inflate = layoutInflater.inflate(R.layout.direct_send_viewer_fragment, viewGroup, false);
            } else {
                inflate = layoutInflater.inflate(R.layout.media_viewer_fragment, viewGroup, false);
            }
            if (inflate == null) {
                aajv.o(this, E());
            }
            akqj.p();
            return inflate;
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
        return this.a;
    }

    @Override // defpackage.aawm, defpackage.aiuc, defpackage.cg
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
        if (this.e == null) {
            this.e = new aklm(this, super.x());
        }
        return this.e;
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        View view2;
        int i;
        int i2;
        aawo g;
        this.c.k();
        try {
            aktp.bH(this).a = view;
            E();
            aajv.o(this, E());
            bf(view, bundle);
            aaxd E = E();
            cj fe = E.A.fe();
            Guideline guideline = (Guideline) view.findViewById(R.id.screen_start_guideline);
            guideline.getClass();
            Guideline guideline2 = (Guideline) view.findViewById(R.id.screen_top_guideline);
            guideline2.getClass();
            Guideline guideline3 = (Guideline) view.findViewById(R.id.screen_end_guideline);
            guideline3.getClass();
            Guideline guideline4 = (Guideline) view.findViewById(R.id.screen_bottom_guideline);
            guideline4.getClass();
            E.ab = new zxy(fe, guideline, guideline2, guideline3, guideline4);
            E.ab.a();
            E.o = (ViewGroup) view.findViewById(R.id.media_viewer_root);
            E.p = (TextView) view.findViewById(R.id.media_viewer_title);
            E.q = (TextView) view.findViewById(R.id.media_viewer_subtitle);
            E.r = (TextView) view.findViewById(R.id.primary_button);
            E.s = (LinearLayout) view.findViewById(R.id.secondary_button_container);
            E.t = (ImageView) view.findViewById(R.id.media_viewer_close_button);
            E.u = (TextView) view.findViewById(R.id.media_viewer_duration_text);
            E.v = E.a().findViewById(R.id.media_edit_button);
            aaou aaouVar = E.c;
            ArrayList arrayList = new ArrayList();
            if (!E.M && (view2 = E.A.Q) != null) {
                arrayList.add(E.a());
                arrayList.add(view2.findViewById(R.id.primary_button));
                arrayList.add(view2.findViewById(R.id.secondary_button_container));
                arrayList.add(view2.findViewById(R.id.media_viewer_duration_text));
            }
            aaouVar.b.put(E, arrayList);
            if (E.M) {
                E.y = (TextView) view.findViewById(R.id.media_viewer_caption);
                E.z = (MaterialButton) view.findViewById(R.id.primary_button);
                view.findViewById(R.id.direct_send_done_button).setOnClickListener(new aaxc(E, 6));
            }
            Bundle bundle2 = E.A.m;
            byte[] bArr = null;
            int i3 = 0;
            int i4 = 1;
            if (bundle2 != null) {
                Uri uri = (Uri) bundle2.getParcelable("photos");
                String string = bundle2.getString("content_type");
                E.D = (Uri) bundle2.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                bundle2.getInt("media_editor_type");
                int s = aaxd.s(bundle2);
                E.L = new aaxi(s);
                Uri uri2 = E.D;
                if (uri2 != null && !uri2.equals(Uri.EMPTY) && uri == null) {
                    E.Y = new akrq(0, 0, 1);
                    aaxm aaxmVar = new aaxm();
                    aaxmVar.c(E.D);
                    aaxmVar.b(string);
                    E.E = aaxmVar.a();
                    E.u(s);
                    Uri uri3 = E.D;
                    if (E.M) {
                        albo.T(true);
                        g = aawo.o();
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri3);
                        bundle3.putString("content_type", string);
                        bundle3.putInt("starting_view_state", 0);
                        bundle3.putBoolean("show_direct_send_viewer", true);
                        g.ak(bundle3);
                    } else {
                        g = aawt.g(uri3, string, 1);
                    }
                    g.a.c(new aaxf(E, g));
                    bd bdVar = new bd(E.A.G());
                    bdVar.z(R.id.media_container, g);
                    bdVar.b();
                    E.F = g;
                    E.L.a();
                    E.d(0);
                } else {
                    E.x = new aawu(E.A.G(), E.B);
                    E.w = new xvy(E.o, R.id.media_viewer_pager_stub, R.id.media_viewer_pager, new kyn(E, 7));
                    E.J = true;
                    ((MediaViewPager) E.w.b()).setAlpha(brg.a);
                    ((MediaViewPager) E.w.b()).animate().alpha(1.0f).setDuration(E.A.z().getInteger(android.R.integer.config_longAnimTime));
                    gh.z(string);
                    E.K = E.j.f().toEpochMilli();
                    if (uri != null) {
                        E.af.C(new aaxn(E.Z, uri, 0), E.S);
                    } else if (bundle2.containsKey("media_viewer_items")) {
                        E.C = bundle2.getInt("media_viewer_position");
                        E.af.C(E.ad.o(bundle2.getParcelableArrayList("media_viewer_items")), E.S);
                    } else {
                        String string2 = bundle2.getString("conversation_id");
                        bundle2.getString("participant_look_up_id");
                        E.C = bundle2.getInt("media_viewer_position");
                        bundle2.getBoolean("has_star_filter");
                        aohs aohsVar = E.af;
                        ruy.b(string2);
                        aohsVar.C(null, E.S);
                    }
                }
                E.p.setText(E.ag.z(bundle2.getString("media_viewer_title")));
                E.q.setText(bundle2.getString("media_viewer_subtitle"));
                E.l = (MediaViewerButton) bundle2.getParcelable("primary_button");
                E.m = bundle2.getParcelableArrayList("secondary_button_list");
                E.n = (MediaViewerButton) bundle2.getParcelable("close_button");
                if (E.M && E.y != null) {
                    E.G = bundle2.getString("text_caption");
                    E.y.setText(E.G);
                    E.O = bundle2.getBoolean("use_encrypted_icon");
                }
            }
            E.m(E.l);
            int i5 = 3;
            if (E.M) {
                albo.T(true);
                MaterialButton materialButton = (MaterialButton) E.A.L().findViewById(R.id.primary_button_icon);
                boolean z = E.N;
                boolean z2 = E.O;
                if (z) {
                    if (z2) {
                        i = R.drawable.ic_e2ee_send_icon;
                    } else {
                        i = R.drawable.quantum_gm_ic_send_vd_theme_24;
                    }
                } else {
                    i = R.drawable.quantum_gm_ic_check_vd_theme_24;
                }
                materialButton.c(i);
                aaxa aaxaVar = E.A;
                boolean z3 = E.N;
                boolean z4 = E.O;
                if (z3) {
                    if (z4) {
                        i2 = R.string.camera_send_encrypted_media_description;
                    } else {
                        i2 = R.string.camera_send_media_description;
                    }
                } else {
                    i2 = R.string.camera_attach_media_to_draft_description;
                }
                materialButton.setContentDescription(aaxaVar.S(i2));
                if (E.N) {
                    materialButton.setOnClickListener(new aaxc(E, i5));
                } else {
                    materialButton.setOnClickListener(new aaxc(E, 4));
                }
            }
            E.o(E.m);
            if (E.M && E.F != null) {
                yai yaiVar = E.g;
                aaxa aaxaVar2 = E.A;
                yaiVar.i(aaxaVar2.Q, aaxaVar2.a, new aaxu(E, i4));
            }
            MediaViewerButton mediaViewerButton = E.n;
            if (mediaViewerButton != null) {
                E.l(E.t, mediaViewerButton);
                E.ae.s(E.t, E.n.d());
            }
            if (E.M) {
                ad adVar = (ad) E.y.getLayoutParams();
                if (adVar != null) {
                    E.P = adVar.bottomMargin;
                }
                E.I.e((ConstraintLayout) E.o);
                E.Q = E.A.z().getDimensionPixelSize(R.dimen.direct_send_viewer_margin);
                afmd afmdVar = E.X;
                zqy zqyVar = new zqy(E, i5, bArr);
                afmdVar.a.add(zqyVar);
                ((abdc) afmdVar.b).d(zqyVar);
                afmd afmdVar2 = E.X;
                aaxb aaxbVar = new aaxb(E, i3);
                afmdVar2.c.add(aaxbVar);
                ((abdc) afmdVar2.b).c(aaxbVar);
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

    @Override // defpackage.aawm
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.aawm, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.d == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof aaxa) {
                            aaxa aaxaVar = (aaxa) cgVar;
                            aohs aohsVar = (aohs) ((kqm) aS).bh.aG.b();
                            aohs aohsVar2 = (aohs) ((kqm) aS).r.b();
                            akbo akboVar = (akbo) ((kqm) aS).o.b();
                            anen anenVar = (anen) ((kqm) aS).a.z.b();
                            atsg atsgVar = (atsg) ((kqm) aS).a.bT.b();
                            zrs zrsVar = new zrs(anenVar, atsgVar, (xnv) ((kqm) aS).a.bV.b(), (znj) ((kqm) aS).a.fd.b());
                            qoq qoqVar = (qoq) ((kqm) aS).a.si.b();
                            apya apyaVar = ((kqm) aS).bh.f;
                            gpx QN = ((kqm) aS).a.QN();
                            yai yaiVar = (yai) ((kqm) aS).a.a.ey.b();
                            krv krvVar = ((kqm) aS).a;
                            mei meiVar = new mei(krvVar.eB, new itw(5), (Executor) krvVar.m.b());
                            krv krvVar2 = ((kqm) aS).a;
                            meg megVar = new meg(krvVar2.eB, new itw(5), (Executor) krvVar2.m.b());
                            mee ac = ((kqm) aS).a.ac();
                            krv krvVar3 = ((kqm) aS).a;
                            med medVar = new med(krvVar3.eB, new itw(5), (Executor) krvVar3.m.b());
                            krv krvVar4 = ((kqm) aS).a;
                            mea meaVar = new mea(krvVar4.eB, new itw(5), (Executor) krvVar4.m.b());
                            krv krvVar5 = ((kqm) aS).a;
                            apya apyaVar2 = krvVar5.bB;
                            xnv xnvVar = (xnv) krvVar5.bV.b();
                            aqws aqwsVar = (aqws) ((kqm) aS).bh.k.b();
                            Optional empty = Optional.empty();
                            Optional empty2 = Optional.empty();
                            krv krvVar6 = ((kqm) aS).a;
                            try {
                                this.d = new aaxd(aaxaVar, aohsVar, aohsVar2, akboVar, zrsVar, qoqVar, apyaVar, QN, yaiVar, meiVar, megVar, ac, medVar, meaVar, apyaVar2, xnvVar, aqwsVar, empty, empty2, krvVar6.de, krvVar6.a.iS(), (wfh) ((kqm) aS).a.ec.b(), (abdc) ((kqm) aS).a.a.cX.b(), (afmd) ((kqm) aS).aJ.b(), new zoh((anen) ((kqm) aS).a.z.b(), (aquq) ((kqm) aS).a.xy.b(), (Context) ((kqm) aS).a.n.b()), new znp((Context) ((kqm) aS).a.n.b()), new pjg(((kqm) aS).a.a.a.bN));
                                this.Z.c(new akli(this.c, this.a));
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
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aaxd.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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
        boolean z;
        this.c.k();
        try {
            aP(bundle);
            aaxd E = E();
            abax abaxVar = E.b;
            abaxVar.a.fe().getClass();
            abaxVar.b = abaxVar.a.fe().getWindow();
            if (bundle != null) {
                abaxVar.d = bundle.getBoolean("state_translucent_navigation_flag");
                abaxVar.e = bundle.getBoolean("state_had_light_navigation_bar_flag");
                abaxVar.c = bundle.getInt("state_previous_navigation_bar_color");
            } else {
                boolean z2 = true;
                if ((abaxVar.b.getAttributes().flags & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) == 134217728) {
                    z = true;
                } else {
                    z = false;
                }
                abaxVar.d = z;
                abaxVar.c = abaxVar.b.getNavigationBarColor();
                if ((abaxVar.b.getDecorView().getSystemUiVisibility() & 16) == 0) {
                    z2 = false;
                }
                abaxVar.e = z2;
            }
            E.d.b(E.V);
            E.d.b(E.U);
            E.d.b(E.T);
            E.d.b(E.W);
            if (bundle != null) {
                aaou aaouVar = E.c;
                aaouVar.a = (aaov) new eoy(aaouVar.a()).a(aaov.class);
                aaov aaovVar = aaouVar.a;
                aaovVar.b = bundle.getBoolean("STATE_FULLSCREEN");
                aaovVar.b();
                aaov aaovVar2 = aaouVar.a;
                aaovVar2.a = bundle.getBoolean("STATE_ENABLED");
                aaovVar2.b();
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

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new apxm.a(aD, this));
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
        this.c.k();
        try {
            bc(bundle);
            aaxd E = E();
            abax abaxVar = E.b;
            bundle.putBoolean("state_translucent_navigation_flag", abaxVar.d);
            bundle.putBoolean("state_had_light_navigation_bar_flag", abaxVar.e);
            bundle.putInt("state_previous_navigation_bar_color", abaxVar.c);
            aaou aaouVar = E.c;
            bundle.putBoolean("STATE_FULLSCREEN", aaouVar.a.b);
            bundle.putBoolean("STATE_ENABLED", aaouVar.a.a);
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
            aaxd E = E();
            if (E.L == null) {
                E.L = new aaxi(aaxd.s(E.A.m));
            }
            E.L.b = E.j.f().toEpochMilli();
            if (!E.J) {
                E.e();
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r6 > r11) goto L12;
     */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r13 = this;
            akqf r0 = r13.c
            r0.k()
            r13.be()     // Catch: java.lang.Throwable -> L77
            aaxd r0 = r13.E()     // Catch: java.lang.Throwable -> L77
            aaxi r1 = r0.L     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L73
            xnv r2 = r0.j     // Catch: java.lang.Throwable -> L77
            j$.time.Instant r2 = r2.f()     // Catch: java.lang.Throwable -> L77
            long r2 = r2.toEpochMilli()     // Catch: java.lang.Throwable -> L77
            r1.c = r2     // Catch: java.lang.Throwable -> L77
            meg r1 = r0.h     // Catch: java.lang.Throwable -> L77
            amsg r2 = r0.b()     // Catch: java.lang.Throwable -> L77
            aaxi r3 = r0.L     // Catch: java.lang.Throwable -> L77
            int r4 = r3.a     // Catch: java.lang.Throwable -> L77
            pjz r5 = r0.R     // Catch: java.lang.Throwable -> L77
            pjg r5 = (defpackage.pjg) r5     // Catch: java.lang.Throwable -> L77
            armf r5 = r5.a     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L77
            ansy r5 = (defpackage.ansy) r5     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = "bugle.enable_fix_for_get_usage_duration"
            boolean r5 = r5.e(r6)     // Catch: java.lang.Throwable -> L77
            long r6 = r3.b     // Catch: java.lang.Throwable -> L77
            r8 = -1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r9 = 0
            if (r8 == 0) goto L4e
            if (r5 == 0) goto L52
            long r11 = r3.c     // Catch: java.lang.Throwable -> L77
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 == 0) goto L52
            int r5 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r5 <= 0) goto L52
        L4e:
            long r6 = r3.c     // Catch: java.lang.Throwable -> L77
            r3.b = r6     // Catch: java.lang.Throwable -> L77
        L52:
            long r11 = r3.c     // Catch: java.lang.Throwable -> L77
            long r11 = r11 - r6
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            int r5 = (int) r11     // Catch: java.lang.Throwable -> L77
            r6 = 0
            if (r3 < 0) goto L5f
            if (r5 < 0) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = r6
        L60:
            defpackage.d.s(r3)     // Catch: java.lang.Throwable -> L77
            aaxi r3 = r0.L     // Catch: java.lang.Throwable -> L77
            int r3 = r3.e     // Catch: java.lang.Throwable -> L77
            mef r7 = new mef     // Catch: java.lang.Throwable -> L77
            r7.<init>()     // Catch: java.lang.Throwable -> L77
            r1.n(r7)     // Catch: java.lang.Throwable -> L77
            aaxi r0 = r0.L     // Catch: java.lang.Throwable -> L77
            r0.a = r6     // Catch: java.lang.Throwable -> L77
        L73:
            defpackage.akqj.p()
            return
        L77:
            r0 = move-exception
            defpackage.akqj.p()     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r1 = move-exception
            r0.addSuppressed(r1)
        L80:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxa.l():void");
    }

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ah.l(cls, akvzVar);
    }

    @Override // defpackage.aiuc, defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zxy zxyVar = E().ab;
        if (zxyVar != null) {
            zxyVar.a();
        }
    }

    @Override // defpackage.akkh
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final aaxd E() {
        aaxd aaxdVar = this.d;
        if (aaxdVar != null) {
            if (!this.ag) {
                return aaxdVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.aawm, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
