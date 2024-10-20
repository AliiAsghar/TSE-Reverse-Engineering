package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioManager;
import android.support.constraint.ConstraintLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.transition.TransitionManager;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import com.google.android.material.snackbar.Snackbar;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zri implements TextView.OnEditorActionListener, TextWatcher, CompoundButton.OnCheckedChangeListener, rsm, aacb, zwy, ino {
    public static final xze a = xze.g("Bugle", "ComposeMessageView");
    public ryg A;
    public ikl B;
    public Optional D;

    @Deprecated
    public rre F;
    public Boolean L;
    public final armf O;
    public final armf P;
    public final armf Q;
    public final armf R;
    public final armf S;
    public final armf T;
    public final armf U;
    public final armf V;
    public final armf W;
    public final armf X;
    public final armf Y;
    public final armf Z;
    private final armf aE;
    private final armf aF;
    private final armf aG;
    private final armf aH;
    private final armf aI;
    private final armf aJ;
    private final armf aK;
    private final armf aL;
    private final armf aM;
    private final armf aN;
    private final armf aO;
    private final armf aP;
    private final psw aQ;
    private final armf aR;
    private final View.OnLayoutChangeListener aS;
    private final ryg aT;
    public final armf aa;
    public final armf ab;
    public final armf ac;
    public final armf ad;
    public final armf ae;
    public final armf af;
    public final armf ag;
    public final armf ah;
    public final armf ai;
    public final armf aj;
    public final apwt ak;
    public final armf al;
    public final armf am;
    public final armf an;
    public final armf ao;
    public final armf ap;
    public final armf aq;
    public final ComposeMessageView ar;
    public final armf as;
    public final armf at;
    public final armf av;
    public zxp aw;
    private final armf az;
    public CheckBox b;
    public TextView c;
    public LinearLayout d;
    public AttachmentsContainer e;
    public zsh f;
    public zqu g;

    @Deprecated
    ConstraintLayout h;
    public ViewGroup i;
    public zxa j;
    public final Context k;
    public zqz l;
    public PlainTextEditText m;
    public PlainTextEditText n;
    public PlainTextEditText o;
    public EditText p;
    public TextView r;
    public TextView s;
    public View t;
    public AsyncImageView u;
    public View v;
    public ImageButton w;
    public xvy x;
    public rtj z;
    private long ay = 0;
    public Optional q = Optional.empty();
    private Optional aA = Optional.empty();
    private Optional aB = Optional.empty();
    public Optional C = Optional.empty();
    public boolean E = false;
    private boolean aC = false;
    private boolean aD = true;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public Optional K = Optional.empty();
    public boolean M = true;
    public ajwt N = null;
    public Optional au = Optional.empty();
    public final Runnable ax = new zom(this, 13, null);
    public final rrb y = new rrb();

    public zri(armf armfVar, ComposeMessageView composeMessageView, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, Context context, armf armfVar30, apwt apwtVar, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40, armf armfVar41, psw pswVar, ryg rygVar, armf armfVar42, armf armfVar43, armf armfVar44, armf armfVar45) {
        this.aR = armfVar;
        this.ar = composeMessageView;
        this.O = armfVar2;
        this.P = armfVar3;
        this.aE = armfVar4;
        this.Q = armfVar5;
        this.R = armfVar6;
        this.aF = armfVar7;
        this.aG = armfVar8;
        this.S = armfVar9;
        this.T = armfVar10;
        this.U = armfVar11;
        this.V = armfVar12;
        this.aH = armfVar13;
        this.W = armfVar14;
        this.X = armfVar15;
        this.Y = armfVar16;
        this.Z = armfVar17;
        this.aa = armfVar18;
        this.ab = armfVar19;
        this.ac = armfVar20;
        this.ad = armfVar21;
        this.ae = armfVar22;
        this.aI = armfVar23;
        this.af = armfVar24;
        this.aJ = armfVar25;
        this.ag = armfVar26;
        this.ah = armfVar27;
        this.aK = armfVar28;
        this.aj = armfVar29;
        this.k = context;
        this.aL = armfVar30;
        this.ak = apwtVar;
        this.al = armfVar31;
        this.az = armfVar32;
        this.aM = armfVar33;
        this.am = armfVar34;
        this.aN = armfVar35;
        this.an = armfVar36;
        this.ao = armfVar37;
        this.ap = armfVar38;
        this.aO = armfVar39;
        this.aP = armfVar40;
        this.ai = armfVar41;
        this.aQ = pswVar;
        this.aT = rygVar;
        this.as = armfVar42;
        this.at = armfVar43;
        this.aq = armfVar44;
        this.av = armfVar45;
        fyc fycVar = new fyc(this, 11);
        this.aS = fycVar;
        composeMessageView.addOnLayoutChangeListener(fycVar);
    }

    private final zgu ap() {
        Context context = this.k;
        if (context instanceof zgu) {
            return (zgu) context;
        }
        return null;
    }

    private final void aq() {
        long j = this.ay;
        if (j == 0) {
            j = aqmd.b();
            this.ay = j;
        }
        aiut.d(this.ax, j);
    }

    private final boolean ar() {
        if (this.t.getVisibility() == 0 && !this.E) {
            return true;
        }
        return false;
    }

    public final void A() {
        z();
        this.n.requestFocus();
    }

    public final void B(Drawable drawable) {
        if (drawable != null) {
            this.u.setBackground(drawable);
        }
    }

    @Override // defpackage.aacb
    public final void C(boolean z) {
        throw null;
    }

    public final void D(boolean z) {
        if (z == this.aC) {
            return;
        }
        this.aC = z;
        if (!z) {
            this.l.a(null);
        } else {
            S();
        }
    }

    public final void E() {
        T();
        V();
    }

    public final void F() {
        zxa zxaVar = this.j;
        if (zxaVar != null) {
            zxaVar.R(new zrf(14), new zrg(this, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G() {
        akrh e = aktp.e("ComposeMessageViewPeerDelegate#playSentSound");
        try {
            if (((ykw) this.R.b()).q(this.k.getString(R.string.send_sound_pref_key), this.k.getResources().getBoolean(R.bool.send_sound_pref_default)) && (this.az.b() == null || ((AudioManager) this.az.b()).getRingerMode() != 0)) {
                ((ygo) this.aE.b()).a(this.k);
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
    public final void H() {
        CheckBox checkBox;
        int d;
        Drawable drawable;
        if (this.c != null && (checkBox = this.b) != null) {
            if (checkBox.isChecked()) {
                d = ahnz.d(this.c, R.attr.colorActiveComposeIcon);
                drawable = this.k.getDrawable(R.drawable.quantum_ic_check_circle_grey600_24);
            } else {
                d = ahnz.d(this.c, R.attr.colorInactiveComposeIcon);
                drawable = this.k.getDrawable(R.drawable.quantum_ic_check_circle_outline_blank_grey600_24);
            }
            this.c.setTextColor(d);
            this.b.setButtonDrawable(yfo.i(this.k, drawable, d));
        }
    }

    @Override // defpackage.aacb
    public final void I(boolean z) {
        throw null;
    }

    public final void J() {
        xvy xvyVar = this.x;
        if (xvyVar != null) {
            xvyVar.d(new zrf(13));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void K() {
        this.n.requestFocus();
    }

    public final void L() {
        ((Optional) this.aK.b()).ifPresent(new zrg(this, 0));
        ((Optional) this.aK.b()).ifPresent(new zrg(this, 7));
        ((Optional) this.aK.b()).ifPresent(new zrg(this, 10));
    }

    public final void M(int i) {
        LayerDrawable layerDrawable = (LayerDrawable) this.i.getBackground();
        ((GradientDrawable) layerDrawable.getDrawable(1)).setColor(i);
        layerDrawable.getDrawable(0).setAlpha(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(boolean z) {
        CheckBox checkBox = this.b;
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    @Override // defpackage.aacb
    public final void O(int i) {
        throw null;
    }

    public final void P(boolean z) {
        LinearLayout linearLayout;
        if (this.v.getVisibility() != 0 && Y()) {
            this.v.setVisibility(0);
            if (g().y() && (linearLayout = this.d) != null && linearLayout.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
            if (z && this.o.requestFocus() && xwr.h(this.k)) {
                this.ar.getHandler().postDelayed(new zom(this, 12, null), 500L);
            }
        }
    }

    public final void Q(SelfIdentityId selfIdentityId, int i) {
        ((rsr) this.y.a()).R(selfIdentityId, i);
    }

    @Deprecated
    public final void R(String str) {
        if (!aj()) {
            a.q(str.concat(": couldn't convert draft: keeping as prior type"));
        }
    }

    @Override // defpackage.aacb
    public final void S() {
        zxa zxaVar = this.j;
        if (zxaVar != null) {
            zxaVar.R(new zrg(this, 6), new zrg(this, 8));
        }
    }

    public final void T() {
        U(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(Integer num) {
        int e;
        if (this.I) {
            return;
        }
        if (num != null && num.intValue() > 0) {
            this.aB = Optional.of(num);
            xyo a2 = a.a();
            a2.H("Compose");
            a2.z("numberOfParticipantsExcludeSelf", num);
            a2.q();
        }
        rsr rsrVar = (rsr) this.y.a();
        if (rsrVar.g) {
            try {
                if (((trz) this.an.b()).i()) {
                    boolean equals = amfg.CONVERSATION_TYPE_GROUP_RCS.equals(rsrVar.x());
                    e = ((vqu) this.aF.b()).e(equals);
                    if (rsrVar.i) {
                        if (equals && this.aB.isPresent()) {
                            trz trzVar = (trz) this.an.b();
                            ((Integer) this.aB.get()).intValue();
                            e = trzVar.x(e);
                        } else {
                            e = ((trz) this.an.b()).a(e);
                        }
                    }
                } else {
                    e = ((vqu) this.aF.b()).e(!this.j.bc());
                    if (rsrVar.i) {
                        e = ((trz) this.an.b()).a(e);
                    }
                }
                this.n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(e)});
            } catch (ajny e2) {
                a.r("exception getting max RCS text length", e2);
            }
        } else if (!this.I) {
            xbe g = g();
            this.n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(g.f())});
            this.o.setFilters(new InputFilter[]{new InputFilter.LengthFilter(g.e())});
            if (g.y()) {
                this.w.setContentDescription(this.k.getString(R.string.delete_subject_and_reset_message_priority_content_description));
            } else {
                this.w.setContentDescription(this.k.getString(R.string.delete_subject_content_description));
            }
        }
        this.au = DesugarArrays.stream(this.n.getFilters()).filter(new ytt(12)).map(new zkf(7)).map(new zkf(8)).min(Comparator.CC.naturalOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void V() {
        boolean z;
        String c;
        String c2;
        View.AccessibilityDelegate b;
        View.AccessibilityDelegate accessibilityDelegate;
        String str;
        boolean z2;
        String format;
        akrh e = aktp.e("ComposeMessageViewPeer#updateVisualsOnDraftChanged");
        try {
            CharSequence j = j();
            rsr rsrVar = (rsr) this.y.a();
            String b2 = rsrVar.b();
            String c3 = rsrVar.c();
            if (!TextUtils.equals(j, b2)) {
                rsrVar.Q(j.toString());
            }
            CharSequence k = k();
            if (!TextUtils.equals(k, c3)) {
                rsrVar.P(k.toString());
            }
            boolean Z = Z();
            if (Z != rsrVar.m) {
                rsrVar.m = Z;
            }
            if (ad()) {
                P(false);
            } else if (rsrVar.g && this.v.getVisibility() == 0) {
                A();
            }
            int k2 = rsrVar.G.k();
            int i = ((AtomicInteger) rsrVar.G.e).get();
            if (rsrVar.ae() && (k2 > 1 || i <= 10)) {
                Locale b3 = yhx.b(this.k);
                if (k2 > 1) {
                    format = String.format(b3, "%d / %d", Integer.valueOf(i), Integer.valueOf(k2));
                } else {
                    format = String.format(b3, "%d", Integer.valueOf(i));
                }
                this.r.setText(format);
                this.r.setVisibility(0);
                if (this.u.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
                    marginLayoutParams.topMargin = this.k.getResources().getDimensionPixelSize(R.dimen.compose_message_send_button_margin_top);
                    this.u.setLayoutParams(marginLayoutParams);
                }
            } else {
                this.r.setVisibility(8);
                if (this.u.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
                    marginLayoutParams2.topMargin = 0;
                    this.u.setLayoutParams(marginLayoutParams2);
                }
            }
            boolean ar = ar();
            zqz zqzVar = this.l;
            int m = rsrVar.m();
            boolean j2 = zqzVar.b.j();
            boolean m2 = zqzVar.b.m();
            String str2 = "";
            if (!j2 && m2) {
                zqzVar.b.i(false);
                if (zqzVar.b.k() && !((okf) zqzVar.i.b()).a()) {
                    zqzVar.b.h(false);
                    zqzVar.b.g(m);
                    z = false;
                } else {
                    zri zriVar = ((zrb) zqzVar.b).c;
                    rti f = zriVar.f();
                    if (f != null) {
                        int dimensionPixelSize = zriVar.ar.getResources().getDimensionPixelSize(R.dimen.conversation_compose_sim_selector_size);
                        ufs c4 = ((xwx) zriVar.Q.b()).c(f.c, dimensionPixelSize, dimensionPixelSize, 0, true);
                        Drawable background = zriVar.u.getBackground();
                        zriVar.u.d(c4);
                        zriVar.B(background);
                    }
                    zqzVar.b.h(true);
                    z = false;
                }
            } else {
                zqzVar.b.g(m);
                if (rsr.p(m) != 3) {
                    zqzVar.b.i(true);
                    zra zraVar = zqzVar.b;
                    zqx zqxVar = zqzVar.c;
                    if (m != 10 && m != 11) {
                        if (m != 20) {
                            c = "";
                        } else {
                            c = zqxVar.c(R.string.mms_text);
                        }
                    } else {
                        c = zqxVar.c(R.string.sms_text);
                    }
                    ((zrb) zraVar).c.s.setText(c);
                } else {
                    zqzVar.b.i(false);
                }
                zri zriVar2 = ((zrb) zqzVar.b).c;
                TextView textView = zriVar2.s;
                int[][] iArr = {new int[]{-16842910}, StateSet.WILD_CARD};
                Context context = zriVar2.k;
                textView.setTextColor(new ColorStateList(iArr, new int[]{context.getColor(R.color.c2o_send_button_disabled_color_m2), zpt.h(context)}));
                z = false;
                zqzVar.b.h(false);
            }
            zri zriVar3 = ((zrb) zqzVar.b).c;
            if (zriVar3.H) {
                zsh zshVar = zriVar3.f;
                if (((okf) zshVar.i.b()).a()) {
                    z2 = zshVar.a.E().m();
                } else if (zshVar.a.E().c.f() != null) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                zshVar.j = z2;
                zriVar3.f.b();
            }
            zra zraVar2 = zqzVar.b;
            if (j2 || m2) {
                z = true;
            }
            zri zriVar4 = ((zrb) zraVar2).c;
            zriVar4.u.setEnabled(z);
            zriVar4.s.setEnabled(z);
            zqz zqzVar2 = this.l;
            if (zqzVar2.b.l()) {
                str = zqzVar2.c.d(R.string.sim_selector_button_content_description_with_selection, albo.ag(zqzVar2.b.e()));
                accessibilityDelegate = zqzVar2.c.a();
            } else {
                int m3 = rsrVar.m();
                zqx zqxVar2 = zqzVar2.c;
                if (m3 != 10) {
                    if (m3 != 20) {
                        uac uacVar = zqxVar2.e;
                        c2 = zqxVar2.c(R.string.send_button_content_description);
                        if (m3 == 40 && ttd.f()) {
                            c2 = ((Context) uacVar.a).getString(R.string.send_encrypted_button_content_description);
                        }
                    } else {
                        c2 = zqxVar2.c(R.string.send_button_mms_content_description);
                    }
                } else {
                    c2 = zqxVar2.c(R.string.send_button_sms_content_description);
                }
                zqx zqxVar3 = zqzVar2.c;
                if (((Boolean) ((utz) zqx.a.get()).e()).booleanValue() && ((Boolean) wsm.a.e()).booleanValue()) {
                    zqxVar3.d.isPresent();
                }
                if (m3 == 30) {
                    b = zqxVar3.a();
                } else {
                    b = zqxVar3.b();
                }
                String str3 = c2;
                accessibilityDelegate = b;
                str = str3;
            }
            ((zrb) zqzVar2.b).c.u.setContentDescription(str);
            ((zrb) zqzVar2.b).c.u.setAccessibilityDelegate(accessibilityDelegate);
            zqz zqzVar3 = this.l;
            if (!TextUtils.isEmpty(rsrVar.k)) {
                zqzVar3.b.f("");
            } else if (!rsrVar.r.isEmpty()) {
                zqzVar3.b.f(zqzVar3.c.c(R.string.compose_message_view_hint_text_with_attachment));
            } else {
                String e2 = zqzVar3.b.e();
                int m4 = rsrVar.m();
                if (e2 == null) {
                    zqx zqxVar4 = zqzVar3.c;
                    boolean c5 = abbv.c(zqxVar4.b);
                    if (m4 != 10) {
                        if (m4 != 11) {
                            if (m4 != 20) {
                                if (c5) {
                                    str2 = zqxVar4.c(R.string.compose_message_view_small_screen_hint_text_v2);
                                } else {
                                    str2 = zqxVar4.c(R.string.compose_message_view_hint_text_v2);
                                }
                            }
                        } else if (c5) {
                            str2 = zqxVar4.c(R.string.compose_message_view_sms_mms_small_screen_hint_text);
                        } else {
                            str2 = zqxVar4.c(R.string.compose_message_view_sms_broadcast_hint_text);
                        }
                    }
                    if (c5) {
                        str2 = zqxVar4.c(R.string.compose_message_view_sms_mms_small_screen_hint_text);
                    } else {
                        str2 = zqxVar4.c(R.string.compose_message_view_sms_mms_hint_text);
                    }
                } else {
                    zqx zqxVar5 = zqzVar3.c;
                    boolean c6 = abbv.c(zqxVar5.b);
                    if (m4 != 10 && m4 != 11 && m4 != 20) {
                        if (m4 == 30 || m4 == 40) {
                            if (c6) {
                                str2 = zqxVar5.c(R.string.compose_message_view_small_screen_hint_text_v2);
                            } else {
                                str2 = zqxVar5.d(R.string.compose_message_view_hint_text_multi_sim_rcs_v2, e2);
                            }
                        }
                    } else if (c6) {
                        str2 = zqxVar5.c(R.string.compose_message_view_sms_mms_small_screen_hint_text);
                    } else {
                        str2 = zqxVar5.d(R.string.compose_message_view_hint_text_multi_sim_sms_mms, e2);
                    }
                }
                zqzVar3.b.f(str2);
                if (m4 != 30 && m4 != 40) {
                    if (m4 != 10 && m4 != 20 && m4 != 11) {
                        zqzVar3.f.b(new IllegalStateException("Draft message is of unknown type"));
                    }
                    if (zqzVar3.g.isEmpty()) {
                        zqzVar3.g = Optional.of(zqzVar3.e.f());
                    }
                }
                if (zqzVar3.g.isPresent() && !zqzVar3.h) {
                    zrs zrsVar = zqzVar3.j;
                    aktp.ah(new yar(zrsVar, Duration.between(zqzVar3.g.get(), zqzVar3.e.f()), 18, null), zrsVar.a).k(qiu.b(), zrsVar.b);
                    zqzVar3.h = true;
                }
            }
            M(aabr.aF(this.h, rsrVar.m()));
            boolean ar2 = ar();
            if (ar != ar2 && ((Boolean) wsm.a.e()).booleanValue()) {
                if (ar2) {
                    ((ksi) this.aj.b()).a();
                } else {
                    x();
                }
            }
            zxa zxaVar = this.j;
            if (zxaVar != null) {
                ((ixd) zxaVar).bn();
            }
            e.close();
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W() {
        rti f = f();
        if (f != null) {
            Q(f.b, f.a);
        }
    }

    @Override // defpackage.aacb
    public final void X() {
        throw null;
    }

    public final boolean Y() {
        if (!((rsr) this.y.a()).g) {
            if (!((abbu) this.ad.b()).m() || c() < this.ar.getTop()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z() {
        CheckBox checkBox = this.b;
        if (checkBox != null) {
            return checkBox.isChecked();
        }
        return false;
    }

    @Override // defpackage.ino
    public final void a(ins insVar) {
        this.l.a(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aa() {
        if (this.y.g() && uvl.m((rsr) this.y.a())) {
            return true;
        }
        return false;
    }

    public final boolean ab() {
        if (((Boolean) wsm.a.e()).booleanValue() && i().isPresent()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ac() {
        if (TextUtils.getTrimmedLength(k()) > 0) {
            return true;
        }
        return false;
    }

    public final boolean ad() {
        if (!TextUtils.isEmpty(k()) || Z()) {
            return true;
        }
        if (this.G && !((rsr) this.y.a()).g) {
            return true;
        }
        return false;
    }

    public final boolean ae() {
        if (((Boolean) utw.p.e()).booleanValue() && ((Boolean) utw.ag.e()).booleanValue() && ((Optional) this.aN.b()).isPresent()) {
            return true;
        }
        return false;
    }

    public final boolean af() {
        return this.q.isPresent();
    }

    public final boolean ag() {
        int a2;
        if (((okf) this.aR.b()).a()) {
            rtj rtjVar = this.z;
            if (rtjVar == null || rtjVar.a.size() <= 1) {
                return false;
            }
            return true;
        }
        if (ae()) {
            a2 = this.A.a();
        } else {
            a2 = ((rrl) this.F.a()).a();
        }
        if (a2 <= 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.rsm
    public final void ah() {
        ((ixd) this.j).av.k(R.string.attachment_load_failed_dialog_message);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x02f0 A[Catch: all -> 0x0366, TRY_LEAVE, TryCatch #5 {all -> 0x0366, blocks: (B:58:0x029a, B:61:0x02ac, B:63:0x02b1, B:66:0x02c3, B:68:0x02c8, B:71:0x02eb, B:73:0x02f0, B:76:0x0304, B:78:0x0309, B:81:0x031b, B:99:0x032e, B:98:0x032b, B:110:0x033a, B:109:0x0337, B:125:0x02e9, B:124:0x02e6, B:136:0x0346, B:135:0x0343, B:148:0x0365, B:147:0x0362, B:142:0x035c, B:130:0x033d, B:80:0x030f, B:119:0x02e0, B:104:0x0331, B:92:0x0325, B:60:0x02a0, B:65:0x02b7, B:112:0x02d6, B:75:0x02f6), top: B:57:0x029a, inners: #0, #1, #2, #3, #4, #6, #7, #8, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x034d  */
    @Override // defpackage.rsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ai(defpackage.rsr r18, int r19) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zri.ai(rsr, int):void");
    }

    @Deprecated
    public final boolean aj() {
        try {
            boolean z = false;
            if (((rsr) this.y.a()).ac() && this.aD) {
                z = true;
            }
            a.l("isRcsSendingEnabled in compose view: " + z);
            return ((rsr) this.y.a()).ag(z);
        } finally {
            T();
            V();
        }
    }

    @Deprecated
    public final boolean ak(rsr rsrVar) {
        Optional n;
        boolean z;
        boolean z2;
        rrl rrlVar = (rrl) this.F.a();
        boolean z3 = this.aD;
        if (!rrlVar.b.d() && !rrlVar.r()) {
            ParticipantsTable.BindData a2 = rrlVar.e.a();
            if (a2 != null && !vcp.k(a2)) {
                if (this.aQ.a()) {
                    n = Optional.of(this.aT.n(((msk) this.aP.b()).q(a2)));
                } else {
                    n = ((vqu) this.aF.b()).n(a2);
                }
                if (n.isPresent() && ((psv) n.get()).i()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean f = ((nct) this.aJ.b()).f(rsrVar.y());
                if (rsrVar.ah(z) && !f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.aD = z2;
                xyo a3 = a.a();
                a3.A("isRcsDisabledForPreUpRecipient", f);
                a3.A("isRcsDraftSupported", this.aD);
                a3.q();
                if (z3 != this.aD) {
                    return true;
                }
            }
            return false;
        }
        this.aD = true;
        if (!z3) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final void am(final boolean z, boolean z2, final int i) {
        msh q;
        boolean z3;
        akrh e = aktp.e("ComposeMessageViewPeerDelegate::processOutgoingMessageInternal");
        try {
            final atok ba = yyb.ba();
            if (i == 1) {
                ((xcs) this.ap.b()).g(xcr.SEND_BUTTON_LEGACY, ba.b);
                ((xcs) this.ap.b()).e(xcr.SEND_BUTTON_ACCURATE, ba.b);
                ((xcs) this.ap.b()).e(xcr.NOTIFICATION, ba.b);
            }
            rsr rsrVar = (rsr) this.y.a();
            if (!ae()) {
                rsrVar.O(this.K);
            }
            xze xzeVar = a;
            xzeVar.o(hht.c(rsrVar.d, "UI initiated outgoing message processing in conversation "));
            if (rsrVar.Y()) {
                xzeVar.q("Message can't be sent or scheduled: still checking draft");
            } else if (this.j.bf()) {
                final long epochMilli = ((xnv) this.U.b()).f().toEpochMilli();
                final long a2 = ((xnv) this.U.b()).a();
                if (i - 1 != 0) {
                    this.aA = i();
                } else {
                    ((mho) this.aH.b()).ag(rsrVar.o());
                }
                y();
                W();
                String charSequence = j().toString();
                String charSequence2 = k().toString();
                boolean Z = Z();
                rsrVar.Q(charSequence);
                rsrVar.P(charSequence2);
                rsrVar.m = Z;
                ParticipantsTable.BindData a3 = ((rrl) this.F.a()).e.a();
                if (a3 == null) {
                    q = null;
                } else {
                    q = ((msk) this.aP.b()).q(a3);
                }
                if (((Boolean) new mst(3).get()).booleanValue()) {
                    z3 = ((Boolean) Optional.ofNullable(q).map(new zkf(5)).orElse(false)).booleanValue();
                } else {
                    z3 = ((yjr) this.aI.b()).z(((rrl) this.F.a()).n());
                }
                rsrVar.j = z3;
                ((uac) this.aM.b()).x(ba, null, 36, Optional.of(asgt.BUGLE_SENDING_INTERNAL_STATUS_VERIFYING_MESSAGE));
                rsrVar.E(z, z2, this.j.a(), new rsk() { // from class: zre
                    @Override // defpackage.rsk
                    public final void a(rsr rsrVar2, rsq rsqVar) {
                        zri zriVar = zri.this;
                        zriVar.y.e(rsrVar2);
                        boolean z4 = z;
                        boolean z5 = false;
                        switch (rsqVar) {
                            case PASSED:
                                zriVar.an(epochMilli, a2, i, ba);
                                return;
                            case HAS_PENDING_ATTACHMENTS:
                                ((abbu) zriVar.ad.b()).k(R.string.cant_send_message_while_loading_attachments);
                                return;
                            case NO_SELF_PHONE_NUMBER_IN_GROUP_MMS:
                                zriVar.j.aq(true);
                                return;
                            case MESSAGE_OVER_LIMIT:
                                d.s(z4);
                                zriVar.j.aO(rsrVar2, true, false);
                                return;
                            case VIDEO_ATTACHMENT_LIMIT_EXCEEDED:
                                d.s(z4);
                                zriVar.j.aO(rsrVar2, true, true);
                                return;
                            case SIM_NOT_READY:
                                ((abbu) zriVar.ad.b()).k(R.string.cant_send_message_without_active_subscription);
                                return;
                            case NEED_TO_CONFIRM_SMS_ENCODING:
                                zriVar.j.P();
                                return;
                            case RCS_DISABLED:
                                ((abbu) zriVar.ad.b()).k(R.string.cant_send_rcs_message_when_rcs_disabled_v2);
                                return;
                            case MMS_WHEN_MASS_SMS:
                                ((abbu) zriVar.ad.b()).k(R.string.cant_send_group_mms_message_when_group_mms_is_disabled);
                                return;
                            case SIM_CANT_SEND_MMS:
                                int b = ((yjy) zriVar.V.b()).b();
                                int q2 = ((rsr) zriVar.y.a()).q();
                                if (b != q2) {
                                    z5 = true;
                                }
                                d.s(z5);
                                abbj.a(zriVar.j.q(), ((yjy) zriVar.V.b()).h(q2).t(), ((yjy) zriVar.V.b()).h(b).t(), true);
                                return;
                            case MMS_DISABLED:
                                ((abbu) zriVar.ad.b()).h(R.string.mms_failure_outgoing_disabled);
                                return;
                            case EXCEEDS_SMS_MESSAGE_LENGTH_TO_EMERGENCY_NUMBER:
                                zriVar.j.aP();
                                return;
                            case IS_REPLY_WITHOUT_RCS:
                                Snackbar p = Snackbar.p(zriVar.n, R.string.error_text_draft_is_reply_without_rcs_v2, 0);
                                p.t(android.R.string.ok, new ili(6));
                                p.i();
                                return;
                            case IS_REPLY_TO_MISSING_MESSAGE:
                                Snackbar p2 = Snackbar.p(zriVar.n, R.string.error_text_draft_is_reply_to_missing_message, 0);
                                p2.t(android.R.string.ok, new ili(7));
                                p2.i();
                                return;
                            default:
                                xyo b2 = zri.a.b();
                                b2.z("Unhandled precondition", rsqVar);
                                b2.q();
                                return;
                        }
                    }
                }, this.y);
                d.s(!charSequence.equals("assert-on-send"));
            } else {
                ((abco) this.aL.b()).a();
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Deprecated
    public final void an(long j, long j2, int i, atok atokVar) {
        atok atokVar2;
        if (atokVar == null) {
            armf armfVar = this.ap;
            atokVar2 = yyb.ba();
            ((xcs) armfVar.b()).g(xcr.SEND_BUTTON_LEGACY, atokVar2.b);
            ((xcs) this.ap.b()).e(xcr.SEND_BUTTON_ACCURATE, atokVar2.b);
            ((xcs) this.ap.b()).e(xcr.NOTIFICATION, atokVar2.b);
        } else {
            atokVar2 = atokVar;
        }
        rsr rsrVar = (rsr) this.y.a();
        this.e.E();
        int o = zop.o(rsrVar);
        this.e.E();
        int p = zop.p(rsrVar);
        this.j.R(new zle(16), null);
        MessageCoreData u = rsrVar.u(j);
        if (u.cb()) {
            u.bJ(atokVar2);
            G();
            if (((zxy) this.O.b()).t()) {
                this.C.ifPresent(new zle(17));
            }
            Optional map = rsrVar.o.map(new rum(j, 12));
            if (((Boolean) vof.a.e()).booleanValue() && !u.aD().isEmpty()) {
                if (this.N != null) {
                    aozy createBuilder = voe.a.createBuilder();
                    aozy createBuilder2 = vod.a.createBuilder();
                    int i2 = this.N.a;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    vod vodVar = (vod) createBuilder2.b;
                    vodVar.b |= 1;
                    vodVar.c = i2;
                    vod vodVar2 = (vod) createBuilder2.s();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    voe voeVar = (voe) createBuilder.b;
                    vodVar2.getClass();
                    voeVar.c = vodVar2;
                    voeVar.b = 101;
                    ((MessageData) u).o = (voe) createBuilder.s();
                } else {
                    throw new IllegalStateException("Sign-in is required for Google Photos usage");
                }
            }
            if (i - 1 != 0) {
                if (this.aA.isPresent() && af()) {
                    zxa zxaVar = this.j;
                    zxaVar.bv(u);
                    this.aA = Optional.empty();
                    t();
                } else {
                    throw new IllegalStateException("Cannot schedule message with empty scheduled time.");
                }
            } else {
                mho mhoVar = (mho) this.aH.b();
                rsrVar.x();
                mhoVar.ap(u);
                this.j.bw(u, j2, false, map, Optional.of(Boolean.valueOf(rsrVar.p)));
            }
            J();
            A();
            if (!((ykw) this.R.b()).q("save_original_media_toast_msg_showed", false)) {
                if (o + p > 0) {
                    String string = this.k.getResources().getString(R.string.app_name);
                    Resources resources = this.k.getResources();
                    if (o > 0 && p > 0) {
                        ((abbu) this.ad.b()).l(resources.getString(R.string.original_media_saved_info, resources.getQuantityString(R.plurals.original_image_plural_info, o, Integer.valueOf(o)), resources.getQuantityString(R.plurals.original_video_plural_info, p, Integer.valueOf(p)), string));
                    } else if (o > 0) {
                        ((abbu) this.ad.b()).l(resources.getQuantityString(R.plurals.original_images_only_saved_info, o, Integer.valueOf(o), string));
                    } else {
                        ((abbu) this.ad.b()).l(resources.getQuantityString(R.plurals.original_videos_only_saved_info, p, Integer.valueOf(p), string));
                    }
                }
                ((ykw) this.R.b()).h("save_original_media_toast_msg_showed", true);
            }
            if (!aj()) {
                a.q("cannot set draft RCS status");
            }
        }
    }

    public final void ao() {
        jar bk;
        String str;
        rti f = f();
        zxa zxaVar = this.j;
        if (zxaVar != null && ag() && (bk = zxaVar.bk()) != null) {
            if (f == null) {
                str = null;
            } else {
                str = f.d;
            }
            bk.f = str;
            if (bk.g) {
                bk.k.E();
                wsm.a();
            }
            int i = bk.o;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0 && i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        bk.c();
                        return;
                    }
                    return;
                }
                bk.b(true);
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.ino
    public final void b(ins insVar) {
        this.l.a(insVar);
    }

    @Override // defpackage.rsm
    public final void bp(rsr rsrVar) {
        this.y.e(rsrVar);
        this.j.aO(rsrVar, false, false);
    }

    public final int c() {
        int i = 0;
        if (this.y.g() && uvl.m((rsr) this.y.a())) {
            i = this.e.E().d;
        }
        if (ad()) {
            return i + this.v.getMeasuredHeight();
        }
        return i;
    }

    public final SelfIdentityId d() {
        return ((rsr) this.y.a()).s();
    }

    public final rre e() {
        return new rre(this.y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rti f() {
        SelfIdentityId s = ((rsr) this.y.a()).s();
        if (ae()) {
            rtj rtjVar = this.z;
            if (rtjVar != null) {
                return rtjVar.a(s, this.A);
            }
            return null;
        }
        rre rreVar = this.F;
        if (rreVar != null) {
            rreVar.a();
            return ((rrl) this.F.a()).k(s);
        }
        return null;
    }

    public final xbe g() {
        rrb rrbVar = this.y;
        int i = -1;
        if (rrbVar != null && rrbVar.g()) {
            i = ((rsr) this.y.a()).q();
        }
        return ((xbf) this.T.b()).a(i);
    }

    public final zrb h() {
        return this.ar.E();
    }

    public final Optional i() {
        return this.q.flatMap(new zkf(9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence j() {
        return this.n.getText();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence k() {
        return this.o.getText();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zri.l(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):java.lang.String");
    }

    public final void m() {
        if (xwr.h(this.k)) {
            int size = ((rsr) this.y.a()).r.size() + ((rsr) this.y.a()).t.size();
            xwr.i(this.ar, this.k.getResources().getQuantityString(R.plurals.attachment_changed_accessibility_announcement, size, Integer.valueOf(size)));
        }
    }

    public final void n(boolean z) {
        String string;
        Resources resources = this.k.getResources();
        if (z) {
            string = resources.getString(R.string.mediapicker_gallery_item_selected_content_description);
        } else {
            string = resources.getString(R.string.mediapicker_gallery_item_unselected_content_description);
        }
        xwr.i(this.ar, string);
    }

    @Override // defpackage.zwy
    public final View o(int i) {
        throw null;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        zgu ap = ap();
        if (ap != null && ap.isDestroyed()) {
            a.p("got onTextChanged after onDestroy");
        } else {
            H();
            V();
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        if (i == 4) {
            if (true != ab()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            am(true, true, i2);
            return true;
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        zqo zqoVar;
        rrb rrbVar = this.y;
        zgu ap = ap();
        if (rrbVar.g()) {
            if (ap != null && ap.isDestroyed()) {
                a.p("got onTextChanged after onDestroy");
                return;
            }
            aiut.f(this.ax);
            if (charSequence.length() > 0 && i2 != i3) {
                zxa zxaVar = this.j;
                alvw f = ixd.a.f();
                f.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) f;
                ixd ixdVar = (ixd) zxaVar;
                alvgVar.X(ydl.p, ixdVar.L);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onStartTyping", 5310, "ConversationFragmentPeer.java")).q("ConversationFragment: User started typing.");
                if (ixdVar.cn == 0) {
                    ixdVar.cn = aqmd.a();
                }
                ixdVar.az(1);
                long epochMilli = ixdVar.ab.f().toEpochMilli();
                if (epochMilli - ixdVar.cm >= ixdVar.cn) {
                    alvw f2 = ixd.a.f();
                    f2.X(alwp.a, "Bugle");
                    alvg alvgVar2 = (alvg) f2;
                    alvgVar2.X(ydl.p, ixdVar.L);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onStartTyping", 5320, "ConversationFragmentPeer.java")).q("ConversationFragment: Attempting to send a typing indicator.");
                    ixdVar.aw(1, Instant.ofEpochMilli(epochMilli));
                    ixdVar.cm = epochMilli;
                } else {
                    alvw f3 = ixd.a.f();
                    f3.X(alwp.a, "Bugle");
                    alvg alvgVar3 = (alvg) f3;
                    alvgVar3.X(ydl.p, ixdVar.L);
                    ((alvg) alvgVar3.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onStartTyping", 5328, "ConversationFragmentPeer.java")).J("ConversationFragment: Not sending typing indicator because max frequency is %d the typing time is %d & the last sent indicator was at %d", Long.valueOf(ixdVar.cn), Long.valueOf(epochMilli), Long.valueOf(ixdVar.cm));
                }
                if (ixdVar.ba() && !ixdVar.bI) {
                    ixdVar.bI = true;
                    ((ibi) ixdVar.bf.b()).a(2);
                }
                this.J = false;
                aq();
            }
            if (charSequence.length() > 0 || i2 != i3) {
                V();
            }
            if (charSequence.length() > 0) {
                zqu zquVar = this.g;
                PlainTextEditText v = zquVar.c.E().v();
                if (v.getWidth() != 0 && (zqoVar = zquVar.h) != null && zqoVar.d.getVisibility() == 0 && v.getPaint().measureText(v.getText(), 0, v.getText().length()) >= v.getWidth() * ((Float) zqu.a.e()).floatValue() && zquVar.o) {
                    zquVar.l.m(R.id.compress_info_image_view, zquVar.d.getVisibility());
                    TransitionManager.beginDelayedTransition(zquVar.a(), zquVar.m);
                    zquVar.l.b(zquVar.a());
                }
                if (yig.b() && ((zxy) this.O.b()).q()) {
                    zqu zquVar2 = this.g;
                    if (zquVar2.e != null && zquVar2.b.isPresent()) {
                        int i4 = ((jcf) zquVar2.b.get()).i();
                        int c = ((jcf) zquVar2.b.get()).c();
                        Object tag = zquVar2.e.getTag(c);
                        if (tag == null || ((Integer) tag).intValue() != i4) {
                            zquVar2.e.setTag(c, Integer.valueOf(i4));
                            zquVar2.b(zquVar2.e, i4, ((jcf) zquVar2.b.get()).h());
                        }
                    }
                }
                if (this.n.getMaxLines() == 1) {
                    this.n.setMaxLines(this.ar.getResources().getInteger(R.integer.compose_message_view_max_lines));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(j())) {
                if (yig.b() && ((zxy) this.O.b()).q()) {
                    zxa zxaVar2 = this.j;
                    if (zxaVar2 != null) {
                        zxaVar2.R(new zrf(17), new zle(13));
                    }
                    if (((Boolean) yig.ao.e()).booleanValue() || !((opm) this.av.b()).a()) {
                        zqu zquVar3 = this.g;
                        if (zquVar3.e != null && zquVar3.b.isPresent()) {
                            int f4 = ((jcf) zquVar3.b.get()).f();
                            int c2 = ((jcf) zquVar3.b.get()).c();
                            Object tag2 = zquVar3.e.getTag(c2);
                            if (tag2 == null || ((Integer) tag2).intValue() != f4) {
                                zquVar3.e.setTag(c2, Integer.valueOf(f4));
                                zquVar3.b(zquVar3.e, f4, ((jcf) zquVar3.b.get()).e());
                            }
                        }
                    }
                }
                if (i2 > i3 && i3 == 0) {
                    if (this.J) {
                        this.J = false;
                    } else {
                        aq();
                    }
                }
                this.g.c();
                this.n.setMaxLines(1);
            }
        }
    }

    @Override // defpackage.aacb
    public final View p() {
        throw null;
    }

    @Override // defpackage.aacb
    public final View q() {
        throw null;
    }

    public final void r(rsr rsrVar) {
        this.y.c(rsrVar);
        rsrVar.C(h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(zxa zxaVar) {
        this.j = zxaVar;
        zop E = this.e.E();
        E.f = zxaVar;
        E.n = ((ydf) E.u.b()).a(-1, zxaVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        v(new zmi(this, 20));
    }

    @Override // defpackage.aacb
    public final MessagePartCoreData u(MessagePartCoreData messagePartCoreData) {
        throw null;
    }

    public final void v(Consumer consumer) {
        if (!af()) {
            throw new IllegalStateException("Cannot execute function with a missing ScheduledSendDraftViewController. Is a module missing?");
        }
        consumer.q((lyv) this.q.get());
    }

    public final void w() {
        zqu zquVar = this.g;
        if (!((Boolean) yig.ah.e()).booleanValue()) {
            zquVar.d();
        }
        if (zquVar.e != null) {
            zquVar.k.m(R.id.magic_button, 8);
            if (zquVar.e.getVisibility() == 0) {
                zquVar.e.setVisibility(8);
            }
        }
    }

    public final void x() {
        this.q.ifPresent(new zrf(10));
    }

    public final void y() {
        jar bk;
        akrh e = aktp.e("ComposeMessageViewPeerDelegate::hideSimPicker");
        try {
            zxa zxaVar = this.j;
            if (zxaVar != null && ag() && (bk = zxaVar.bk()) != null) {
                bk.c();
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

    public final void z() {
        this.v.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.rsm
    public final void al(rsr rsrVar) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
