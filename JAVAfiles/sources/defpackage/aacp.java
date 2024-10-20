package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacp {
    public xvy A;
    public akul B;
    public final iyh C;
    public wyp D;
    private final Optional E;
    private final ydc F;
    private final Optional G;
    private final zpt H;
    private final mho I;
    private final trz J;
    private final armf K;
    private final armf L;
    private final Context M;
    private final xvy N;
    private boolean O;
    private boolean P;
    private final boolean Q;
    private CharSequence R;
    private final armf S;
    private final Optional T;
    private final xnv U;
    private final Optional V;
    private final lrf W;
    public final abbj a;
    public final qyh b;
    public final anen c;
    public final xca d;
    public final apwt e;
    public final armf f;
    public final armf g;
    public final ConversationMessageView h;
    public rry i;
    public final ViewGroup j;
    public final TextView k;
    public final TextView l;
    public final xvy m;
    public final Optional n;
    public TextView o;
    public TextView p;
    public boolean q;
    public aaco r;
    public boolean s;
    public ListenableFuture t;
    public final AtomicReference u = new AtomicReference();
    public CharSequence v;
    public List w;
    public boolean x;
    public zxp y;
    public final armf z;

    public aacp(Context context, Optional optional, ydc ydcVar, Optional optional2, ytk ytkVar, abbj abbjVar, qyh qyhVar, anen anenVar, zpt zptVar, iyh iyhVar, mho mhoVar, xca xcaVar, trz trzVar, apwt apwtVar, armf armfVar, lrf lrfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, Optional optional3, xnv xnvVar, Optional optional4, ConversationMessageView conversationMessageView, ViewGroup viewGroup, xvy xvyVar, xvy xvyVar2, rry rryVar) {
        int i = alog.d;
        this.w = alsx.a;
        this.x = false;
        this.B = null;
        this.M = context;
        this.E = optional;
        this.F = ydcVar;
        this.G = optional2;
        this.a = abbjVar;
        this.b = qyhVar;
        this.c = anenVar;
        this.H = zptVar;
        this.C = iyhVar;
        this.I = mhoVar;
        this.d = xcaVar;
        this.J = trzVar;
        this.e = apwtVar;
        this.K = armfVar;
        this.W = lrfVar;
        this.f = armfVar2;
        this.L = armfVar3;
        this.g = armfVar4;
        this.z = armfVar6;
        this.h = conversationMessageView;
        this.j = viewGroup;
        this.N = xvyVar;
        this.S = armfVar5;
        this.i = rryVar;
        this.T = optional3;
        this.U = xnvVar;
        this.V = optional4;
        this.Q = ytkVar.d();
        TextView textView = (TextView) viewGroup.findViewById(R.id.message_text);
        this.k = textView;
        textView.setOnClickListener(conversationMessageView);
        this.l = (TextView) viewGroup.findViewById(R.id.urgent_indicator);
        this.m = new xvy(viewGroup, R.id.message_subject_view_stub, R.id.subject_container, new kyn(this, 2));
        if (xvyVar2 != null) {
            this.n = ((Optional) ((apxx) armfVar3).a).map(new zkf(13));
        } else {
            this.n = Optional.empty();
        }
    }

    public final int a() {
        return c().getColor(R.color.google_yellow400);
    }

    public final int b() {
        return c().getColor(R.color.gm3_ref_palette_neutral10);
    }

    public final Context c() {
        return this.h.getContext();
    }

    public final void d() {
        xvy xvyVar;
        LinearLayout.LayoutParams layoutParams;
        if (((Optional) this.e.b()).isPresent() && this.T.isPresent() && (xvyVar = this.A) != null && ((AppCompatImageView) xvyVar.b()).getVisibility() != 8) {
            float a = ((zxq) ((Optional) this.e.b()).get()).a();
            float applyDimension = TypedValue.applyDimension(1, ((Integer) aaci.d.e()).intValue(), this.h.getResources().getDisplayMetrics());
            xvy xvyVar2 = this.A;
            if (xvyVar2 == null) {
                layoutParams = null;
            } else {
                layoutParams = (LinearLayout.LayoutParams) ((AppCompatImageView) xvyVar2.b()).getLayoutParams();
            }
            if (layoutParams != null) {
                int i = (int) (applyDimension * a);
                layoutParams.width = i;
                layoutParams.height = i;
                xvy xvyVar3 = this.A;
                if (xvyVar3 != null) {
                    ((AppCompatImageView) xvyVar3.b()).setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final void e(int i) {
        this.j.setVisibility(i);
    }

    public final void f() {
        float dimension = this.h.getResources().getDimension(R.dimen.conversation_message_text_size);
        if (this.F.e() && !TextUtils.isEmpty(this.R) && this.F.f(this.R)) {
            dimension = TypedValue.applyDimension(1, ((Integer) aaci.d.e()).intValue(), this.h.getResources().getDisplayMetrics());
        }
        if (((Optional) this.e.b()).isPresent()) {
            dimension *= ((zxq) ((Optional) this.e.b()).get()).a();
        }
        if (this.k.getTextSize() != dimension) {
            this.k.setTextSize(0, dimension);
        }
    }

    public final void g() {
        if (!this.m.i()) {
            return;
        }
        ((Optional) this.K.b()).ifPresent(new aacm(this, 0));
    }

    public final void h() {
        this.k.setVisibility(8);
        xvy xvyVar = this.A;
        if (xvyVar != null) {
            ((AppCompatImageView) xvyVar.b()).setVisibility(0);
        }
        d();
    }

    public final void i() {
        xvy xvyVar = this.A;
        if (xvyVar != null) {
            ((AppCompatImageView) xvyVar.b()).setVisibility(8);
        }
        f();
        this.k.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.CharSequence, java.lang.Object] */
    public final void j(String str, String str2) {
        akul g;
        akul ag;
        byte[] bArr = null;
        if (!TextUtils.isEmpty(str) && !this.i.at()) {
            this.R = this.b.d(str, str2, null, b(), a());
            if (!TextUtils.equals(this.h.t, str2) || !TextUtils.equals(this.v, this.R) || ((((Boolean) ((utz) xww.a.get()).e()).booleanValue() && (!this.w.equals(this.i.l) || this.h.isSelected() != this.x)) || this.i.z().a())) {
                this.h.t = str2;
                this.k.setText(this.R);
                rry rryVar = this.i;
                SpannableStringBuilder append = new SpannableStringBuilder().append(this.k.getText());
                for (SpanWatcher spanWatcher : (SpanWatcher[]) append.getSpans(0, append.length(), SpanWatcher.class)) {
                    append.removeSpan(spanWatcher);
                }
                wyp wypVar = new wyp(this, rryVar, append, this.E, this.G, this.d, this.I);
                this.D = wypVar;
                if (((Optional) wypVar.g).isEmpty()) {
                    g = aktp.ag(null);
                } else {
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(wypVar.c);
                    ahjj ahjjVar = new ahjj(wypVar);
                    if (((Boolean) ((utz) xww.a.get()).e()).booleanValue()) {
                        aack aackVar = ((aacp) wypVar.e).h.s;
                        if (((Boolean) ((utz) xww.a.get()).e()).booleanValue()) {
                            itb itbVar = (itb) aackVar;
                            if (!((Optional) ((apxx) itbVar.T).a).isEmpty()) {
                                if (itbVar.e == null) {
                                    itbVar.e = new akbj(new ikm(aackVar, 2), andi.a);
                                }
                                ag = akul.g(itbVar.e.c());
                                g = ag.h(new xpm(wypVar, valueOf, 18), ((aacp) wypVar.e).c).i(new yui(wypVar, ahjjVar, 6, bArr), ((aacp) wypVar.e).c);
                            }
                        }
                        ag = aktp.ag(false);
                        g = ag.h(new xpm(wypVar, valueOf, 18), ((aacp) wypVar.e).c).i(new yui(wypVar, ahjjVar, 6, bArr), ((aacp) wypVar.e).c);
                    } else {
                        uza uzaVar = (uza) ((Optional) wypVar.g).get();
                        ((aacp) wypVar.e).c();
                        g = akul.g(uzaVar.b(valueOf, ahjjVar));
                    }
                }
                yuq yuqVar = new yuq(this, str2, 7, bArr);
                this.u.set(yuqVar);
                this.t = g.i(new yui(this, yuqVar, 5), this.c);
            }
            if (this.i.aC() && this.F.f(this.R)) {
                this.k.setGravity(8388613);
            } else {
                this.k.setGravity(8388611);
            }
            if (!Float.valueOf(Settings.Global.getFloat(this.M.getContentResolver(), "animator_duration_scale", 1.0f)).equals(Float.valueOf(brg.a)) && this.T.isPresent()) {
                if (this.T.isPresent() && this.F.b(this.k.getText().toString()) == amgm.EMOJI_STATUS_SINGLE_EMOJI_ONLY) {
                    xvy xvyVar = new xvy(this.h, R.id.message_animated_emoji_view_stub, R.id.message_animated_emoji_view);
                    this.A = xvyVar;
                    if (((AppCompatImageView) xvyVar.b()) != null) {
                        h();
                        String charSequence = this.k.getText().toString();
                        TextView textView = this.k;
                        new zqh(charSequence, textView.getTypeface(), textView.getTextSize(), textView.getCurrentTextColor());
                        aadh aadhVar = (aadh) this.T.get();
                        this.k.getText().toString();
                        if ((!this.i.aC() || this.U.f().toEpochMilli() - this.i.k() > ((Integer) aaci.e.e()).intValue()) && this.i.au()) {
                            this.i.b.U();
                        }
                        aadhVar.a();
                        this.V.ifPresent(new aacm(this, 3));
                        return;
                    }
                    i();
                    return;
                }
                i();
                return;
            }
            i();
            return;
        }
        xyl.f(this.i.at());
        this.k.setVisibility(8);
        this.k.setText((CharSequence) null);
        this.s = false;
    }

    public final void k() {
        boolean z;
        boolean z2;
        boolean e;
        boolean z3;
        boolean z4;
        int i;
        GradientDrawable o;
        int i2;
        boolean z5;
        String l;
        ivq ivqVar;
        Resources resources = this.j.getResources();
        boolean au = this.i.au();
        Optional optional = this.i.k;
        if (optional != null && optional.isPresent() && ((ssi) this.i.k.get()).s()) {
            z = true;
        } else {
            z = false;
        }
        if (this.Q && this.i.z().a() && this.i.z() != tqr.VERIFICATION_VERIFIED) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Boolean) this.S.b()).booleanValue()) {
            e = ((itb) this.h.s).at;
        } else {
            e = this.W.e();
        }
        if (e && !z && ((!((Boolean) utw.w.e()).booleanValue() || !this.i.aL()) && !z2 && this.i.k.isPresent())) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.q = z3;
        rry rryVar = this.i;
        if (rryVar != null && rryVar.r != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.P = z4;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.message_padding_same_author);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.conversation_message_contact_icon_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.message_text_left_right_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.message_text_top_padding);
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.message_text_bottom_padding);
        zpt zptVar = this.H;
        ConversationMessageView conversationMessageView = this.h;
        int[] t = zptVar.t(conversationMessageView.getContext(), conversationMessageView.isSelected(), au, this.i.c());
        Iterator it = this.i.e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((MessagePartCoreData) it.next()).aQ()) {
                    if (this.h.E()) {
                        zpt zptVar2 = this.H;
                        boolean z6 = this.h.z();
                        boolean z7 = this.q;
                        boolean z8 = this.P;
                        i = R.dimen.message_text_bottom_padding;
                        o = zptVar2.o(t, au, true, z6, z7, z8);
                    } else {
                        i = R.dimen.message_text_bottom_padding;
                        dimensionPixelOffset3 = 0;
                        dimensionPixelSize = 0;
                        i2 = 0;
                        dimensionPixelSize2 = 0;
                        o = null;
                    }
                }
            } else {
                i = R.dimen.message_text_bottom_padding;
                if (this.F.f(this.k.getText())) {
                    o = null;
                } else {
                    zpt zptVar3 = this.H;
                    ConversationMessageView conversationMessageView2 = this.h;
                    o = zptVar3.o(t, au, conversationMessageView2.A(), conversationMessageView2.z(), this.q, this.P);
                }
                dimensionPixelSize = 0;
            }
        }
        i2 = dimensionPixelOffset2;
        this.j.setBackground(o);
        this.j.setMinimumHeight(dimensionPixelSize2);
        ((LinearLayout.LayoutParams) this.j.getLayoutParams()).topMargin = dimensionPixelSize;
        boolean au2 = this.i.au();
        if (this.q) {
            Resources resources2 = this.h.getResources();
            int dimensionPixelOffset4 = resources2.getDimensionPixelOffset(R.dimen.message_text_left_right_padding);
            int dimensionPixelOffset5 = resources2.getDimensionPixelOffset(R.dimen.message_text_top_padding);
            int dimensionPixelOffset6 = resources2.getDimensionPixelOffset(i);
            this.j.setPadding(0, dimensionPixelOffset5, 0, 0);
            this.l.setPadding(dimensionPixelOffset4, 0, dimensionPixelOffset4, 0);
            this.m.d(new ivb(dimensionPixelOffset4, 7));
            this.k.setPadding(dimensionPixelOffset4, 0, dimensionPixelOffset4, dimensionPixelOffset6);
            float[] fArr = (float[]) this.H.s(au2, false, this.h.z(), false, false).clone();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            if (this.O && this.h.p) {
                z5 = true;
            } else {
                z5 = false;
            }
            ((ConversationMessageLinkPreviewView) this.N.b()).c(this.i, fArr, au2, z5);
            this.O = false;
            ConversationMessageLinkPreviewView conversationMessageLinkPreviewView = (ConversationMessageLinkPreviewView) this.N.b();
            ConversationMessageView conversationMessageView3 = this.h;
            conversationMessageLinkPreviewView.b(conversationMessageView3, conversationMessageView3);
            if (yyb.d() && ((zhi) this.f.b()).a(this.i)) {
                zhi zhiVar = (zhi) this.f.b();
                rry rryVar2 = this.i;
                if (!yyb.e(rryVar2) || rryVar2.k.isEmpty() || (l = ((ssi) rryVar2.k.get()).l()) == null || l.isEmpty()) {
                    ivqVar = null;
                } else {
                    ivqVar = new ivq(zhiVar, l, rryVar2, 7, (char[]) null);
                }
                if (ivqVar != null) {
                    ((ConversationMessageLinkPreviewView) this.N.b()).s = ivqVar;
                }
            }
        } else {
            this.O = true;
            xvy xvyVar = this.N;
            if (xvyVar.i()) {
                ((ConversationMessageLinkPreviewView) xvyVar.b()).c(null, null, au2, this.O);
            }
        }
        if (!this.q) {
            this.h.g.c(false, true);
        }
        this.l.setPadding(0, 0, 0, 0);
        this.m.d(new aabj(5));
        this.k.setPadding(0, 0, 0, 0);
        this.j.setPadding(dimensionPixelOffset, i2, dimensionPixelOffset, dimensionPixelOffset3);
        zpr zprVar = new zpr();
        zprVar.b(this.i.au());
        zprVar.f(this.i.f());
        zprVar.d(false);
        zprVar.c(this.h.isSelected());
        zprVar.e(this.i.c());
        int i3 = this.H.q(this.h.getContext(), zprVar.a()).a;
        this.k.setTextColor(i3);
        this.k.setLinkTextColor(i3);
        if (this.J.h()) {
            TextView textView = this.k;
            textView.setTypeface(textView.getTypeface(), 0);
        }
        if (((Boolean) wsm.a.e()).booleanValue() && this.i.aJ()) {
            TextView textView2 = this.k;
            textView2.setTypeface(textView2.getTypeface(), 2);
        } else if (this.J.n() && this.i.ar()) {
            TextView textView3 = this.k;
            textView3.setTypeface(textView3.getTypeface(), 2);
        }
        if (this.l.getVisibility() == 0) {
            this.l.setTextColor(i3);
        }
        if (this.m.i()) {
            this.p.setTextColor(i3);
            this.o.setTextColor(i3);
        }
    }

    public final boolean l(View view) {
        if (view == this.k) {
            return true;
        }
        return false;
    }
}
