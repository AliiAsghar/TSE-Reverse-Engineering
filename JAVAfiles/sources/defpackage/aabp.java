package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabp {
    private final Runnable A;
    public final aabz a;
    public final aacb b;
    public final aabe c;
    public final abbu d;
    public final rre e;
    public final aabo[] f;
    public final aabn g;
    public final aabk h;
    public final mcm i;
    public final abdc j;
    public final yjf k;
    public boolean o;
    public boolean p;
    public final abcz q;
    public final abcy r;
    private final da s;
    private final Context t;
    private final rre u;
    private final aabm v;
    private final yai w;
    private final armf x;
    private int y;
    public final Handler l = new Handler(Looper.getMainLooper());
    public boolean m = false;
    public boolean n = false;
    private boolean z = false;

    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    public aabp(aabl aablVar, zfm zfmVar, mcm mcmVar, mci mciVar, zhg zhgVar, abdc abdcVar, yjf yjfVar, yai yaiVar, xnv xnvVar, abbu abbuVar, armf armfVar, Context context, aabz aabzVar, aacb aacbVar, lex lexVar, da daVar, ydf ydfVar, xbe xbeVar, rrc rrcVar, rrc rrcVar2) {
        this.o = false;
        this.p = false;
        zqy zqyVar = new zqy(this, 2);
        this.q = zqyVar;
        int i = 1;
        aaxb aaxbVar = new aaxb(this, i);
        this.r = aaxbVar;
        this.A = new aafg(this, i);
        this.i = mcmVar;
        this.j = abdcVar;
        this.k = yjfVar;
        this.w = yaiVar;
        this.x = armfVar;
        this.d = abbuVar;
        this.t = context;
        this.a = aabzVar;
        this.b = aacbVar;
        this.s = daVar;
        rre rreVar = new rre(rrcVar);
        this.u = rreVar;
        rre rreVar2 = new rre(rrcVar2);
        this.e = rreVar2;
        this.o = abbuVar.m();
        this.p = aabzVar.aX();
        abdcVar.d(zqyVar);
        abdcVar.c(aaxbVar);
        Context context2 = (Context) zfmVar.a.b();
        context2.getClass();
        this.c = new aabe(context2, this, lexVar, abdcVar);
        aabm aabmVar = new aabm(this, aabzVar, aacbVar, daVar, mcmVar, mciVar, xnvVar, context);
        this.v = aabmVar;
        abdc abdcVar2 = (abdc) zhgVar.a.b();
        abdcVar2.getClass();
        aacbVar.getClass();
        context.getClass();
        this.g = new aabn(abdcVar2, this, aacbVar, context);
        ((riv) aablVar.a.b()).getClass();
        mci mciVar2 = (mci) aablVar.b.b();
        mcm mcmVar2 = (mcm) aablVar.c.b();
        abac abacVar = (abac) aablVar.d.b();
        zme zmeVar = (zme) aablVar.e.b();
        mho mhoVar = (mho) aablVar.f.b();
        mhoVar.getClass();
        xnv xnvVar2 = (xnv) aablVar.g.b();
        xnvVar2.getClass();
        zpt zptVar = (zpt) aablVar.h.b();
        zptVar.getClass();
        ifb ifbVar = (ifb) aablVar.i.b();
        ifb ifbVar2 = (ifb) aablVar.j.b();
        ifbVar2.getClass();
        abbu abbuVar2 = (abbu) aablVar.k.b();
        abbuVar2.getClass();
        ((tqx) aablVar.l.b()).getClass();
        aabzVar.getClass();
        aacbVar.getClass();
        daVar.getClass();
        aabk aabkVar = new aabk(mciVar2, mcmVar2, abacVar, zmeVar, mhoVar, xnvVar2, zptVar, ifbVar, ifbVar2, abbuVar2, this, aabzVar, aacbVar, daVar, ydfVar, xbeVar, rreVar2, rreVar, context);
        this.h = aabkVar;
        this.f = new aabo[]{aabkVar, aabmVar};
    }

    public static final String A(aaca aacaVar) {
        return String.valueOf(aacaVar.getClass().getCanonicalName()).concat("_savedstate_");
    }

    private final int E() {
        WindowInsets windowInsets;
        int i;
        String str;
        View p = this.b.p();
        if (p != null) {
            windowInsets = p.getRootWindowInsets();
        } else {
            windowInsets = null;
        }
        if (windowInsets != null) {
            i = windowInsets.getSystemWindowInsetBottom();
        } else {
            i = 0;
        }
        Context context = this.t;
        int a = this.j.a();
        if (a == -1) {
            abdc abdcVar = this.j;
            if (true != abdcVar.e.m()) {
                str = "last_ime_height";
            } else {
                str = "last_ime_height_landscape";
            }
            a = abdcVar.d.d(str, -1);
            if (a == -1) {
                a = context.getResources().getDimensionPixelSize(R.dimen.c2o_fragment_default_height);
            }
        }
        if (i >= a) {
            return i;
        }
        return Math.max(a + i, this.t.getResources().getDimensionPixelSize(R.dimen.c2o_ime_minimum_height));
    }

    public final void B(boolean z) {
        aabk aabkVar = this.h;
        if (aabkVar != null) {
            D(aabkVar, z, false);
        }
    }

    public final void C(boolean z) {
        D(this.v, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r2.s(r4) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(defpackage.aaca r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            rre r0 = r1.u
            boolean r0 = r0.g()
            if (r0 != 0) goto L9
            goto L24
        L9:
            boolean r0 = r2.y()
            if (r0 == r3) goto L24
            r1.a()
            if (r3 != 0) goto L1b
            boolean r4 = r2.s(r4)
            if (r4 == 0) goto L21
            goto L1e
        L1b:
            r2.v(r4)
        L1e:
            r2.w(r3)
        L21:
            r1.c()
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabp.D(aaca, boolean, boolean):void");
    }

    public final void a() {
        this.y++;
    }

    public final void b() {
        int z;
        this.a.X();
        if (x()) {
            z = E();
        } else {
            z = z();
        }
        t(z, 0L);
    }

    public final void c() {
        boolean z;
        if (this.y > 0) {
            z = true;
        } else {
            z = false;
        }
        xyl.k(z);
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            this.a.X();
        }
    }

    public final void d() {
        int z;
        if (x()) {
            z = E();
        } else {
            z = z();
        }
        if (t(z, 0L)) {
            this.a.X();
        }
    }

    public final void e(boolean z) {
        a();
        int i = 0;
        while (true) {
            aabo[] aaboVarArr = this.f;
            int length = aaboVarArr.length;
            if (i < 2) {
                aabo aaboVar = aaboVarArr[i];
                if (aaboVar != this.h) {
                    D(aaboVar, false, z);
                }
                i++;
            } else {
                c();
                this.c.a(false);
                g();
                f(true, z);
                return;
            }
        }
    }

    public final void f(boolean z, boolean z2) {
        long j;
        if (this.m) {
            this.a.ae();
            View p = this.b.p();
            if (p != null) {
                if (true != z2) {
                    j = 0;
                } else {
                    j = -1;
                }
                yai.l(p, 8, j, yai.b, akto.j(new hwm(this, z, 7, null)), new xuj(p, 1));
                this.h.f();
            }
        }
    }

    public final void g() {
        View q = this.b.q();
        if (this.n && q != null) {
            C(false);
            n(false);
            q.getContext();
            t(z(), -1L);
        }
    }

    public final void h(CharSequence charSequence) {
        PlainTextEditText v = ((zrb) this.b).v();
        int selectionStart = v.getSelectionStart();
        int selectionEnd = v.getSelectionEnd();
        v.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), charSequence);
        ((gpx) this.x.b()).x();
    }

    public final void i() {
        if (this.p && !this.a.aX()) {
            this.p = false;
            b();
        } else if (!this.p && this.a.aX()) {
            this.p = true;
            d();
        } else if (this.a.aX()) {
            if (!w() && !x()) {
                f(true, true);
            } else {
                t(z(), 0L);
            }
        }
        s();
    }

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        aabo[] aaboVarArr = this.f;
        int length = aaboVarArr.length;
        for (int i = 0; i < 2; i++) {
            aaboVarArr[i].q(bundle);
        }
        aabe aabeVar = this.c;
        aabeVar.c = bundle.getBoolean("is_ime_visible_before_pause", false);
        aabeVar.d = bundle.getBoolean("is_c2o_visible_before_pause", false);
        aabeVar.k = bundle.getBoolean("is_c2o_hidden_behind_ime", false);
        aabeVar.i = bundle.getBoolean("is_emoji_picker_visible_before_pause", false);
        aabeVar.j = bundle.getBoolean("is_emoji_picker_hidden_behind_ime", false);
    }

    public final void k() {
        this.b.S();
        ((ixd) this.a).as();
    }

    public final void l() {
        this.l.removeCallbacks(this.A);
    }

    public final void m(boolean z) {
        this.m = z;
        s();
    }

    public final void n(boolean z) {
        this.n = z;
        s();
    }

    public final void o() {
        this.h.r(false);
        g();
        this.c.b();
        List list = ((rsr) this.e.a()).u;
        amqh amqhVar = amqh.ALL;
        amqi amqiVar = amqi.COLLAPSED;
        list.size();
        this.i.d(amqhVar, amqiVar, amqf.UNKNOWN_OPENING_STATE, amqe.PLUS_BUTTON);
    }

    public final void p(int i, boolean z) {
        View p;
        if (!this.m && (p = this.b.p()) != null) {
            aabz aabzVar = this.a;
            int i2 = 20;
            ixd ixdVar = (ixd) aabzVar;
            ixdVar.Q(null, new ivh(aabzVar, i2));
            ixdVar.bS.addOnLayoutChangeListener(ixdVar.t());
            ixdVar.R(null, new ivp(aabzVar, 1));
            if (i == -1) {
                p.getContext();
                i = z();
            }
            if (z) {
                zom zomVar = new zom(this, i2);
                xuj xujVar = new xuj(p, 0);
                if (i != Integer.MIN_VALUE) {
                    xujVar.a(i);
                }
                yai.l(p, 0, -1L, yai.b, zomVar, xujVar);
            } else {
                p.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = p.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                }
                if (layoutParams.height != i) {
                    layoutParams.height = i;
                    p.requestLayout();
                }
                k();
            }
            this.h.g();
            m(true);
        }
    }

    public final void q() {
        View q = this.b.q();
        if (!this.n && q != null) {
            if (this.b.p() != null) {
                this.z = true;
                B(false);
            }
            C(true);
            n(true);
        }
    }

    public final void r(amqe amqeVar) {
        if (amqeVar == amqe.DRAFT_END_EMOJI_BUTTON && !this.m) {
            this.c.c();
            p(E(), false);
        }
        q();
        if (this.j.b) {
            this.c.a(false);
        }
        this.h.r(false);
        this.b.S();
        this.i.d(amqh.EMOJI, amqi.EXPANDED, amqf.UNKNOWN_OPENING_STATE, amqeVar);
    }

    final void s() {
        if ((this.o || this.p) && this.m && !this.n) {
            this.b.O(4);
        } else {
            this.b.O(1);
        }
    }

    public final boolean t(int i, long j) {
        ViewGroup.LayoutParams layoutParams;
        View p = this.b.p();
        if (p == null || !this.m || (layoutParams = p.getLayoutParams()) == null || layoutParams.height == i) {
            return false;
        }
        if (j == 0) {
            layoutParams.height = i;
            p.requestLayout();
            return true;
        }
        this.w.j(p, i, -1L);
        return true;
    }

    public final boolean u() {
        if (this.j.b) {
            this.c.a(true);
            if (this.n) {
                this.b.X();
            }
            this.b.S();
            this.a.ae();
            return true;
        }
        if (this.n) {
            aaal t = aabr.t(this.s);
            if (t != null && t.e()) {
                return true;
            }
            g();
            t(z(), -1L);
            if (!((Boolean) utw.g.e()).booleanValue()) {
                if (this.z) {
                    this.l.removeCallbacks(this.A);
                    B(true);
                    this.z = false;
                } else {
                    f(false, false);
                }
            } else {
                f(true, false);
            }
            this.b.S();
            return true;
        }
        if (!this.m) {
            return false;
        }
        f(true, true);
        return true;
    }

    public final boolean v() {
        int i = 0;
        while (true) {
            aabo[] aaboVarArr = this.f;
            int length = aaboVarArr.length;
            if (i >= 2) {
                return false;
            }
            if (aaboVarArr[i].l) {
                return true;
            }
            i++;
        }
    }

    public final boolean w() {
        aabk aabkVar = this.h;
        if (aabkVar != null) {
            return aabkVar.l;
        }
        return false;
    }

    public final boolean x() {
        return this.v.l;
    }

    public final void y(int i) {
        PlainTextEditText v;
        aabe aabeVar = this.c;
        aabp aabpVar = aabeVar.f;
        aacb aacbVar = aabpVar.b;
        aabz aabzVar = aabpVar.a;
        if (aacbVar != null && aabzVar != null) {
            if (i - 1 != 0) {
                v = ((zrb) aacbVar).c.o;
            } else {
                v = ((zrb) aacbVar).v();
            }
            aabeVar.e = i;
            if (v != null) {
                if (((Boolean) aabe.a.e()).booleanValue()) {
                    aabeVar.b.k(v.getContext(), v, true);
                } else {
                    aabeVar.b.j(v.getContext(), v);
                }
            }
        }
        aabp aabpVar2 = aabeVar.f;
        boolean z = aabpVar2.m;
        aabeVar.k = z;
        boolean z2 = aabpVar2.n;
        aabeVar.j = z2;
        if (!z && !z2) {
            return;
        }
        aabeVar.c();
        aabeVar.f.l.postDelayed(aabeVar.h, aabeVar.g.getResources().getInteger(R.integer.ime_appear_delay_ms));
    }

    final int z() {
        View findViewById;
        Object apply;
        int i;
        if (!this.d.m() && !this.p) {
            return E();
        }
        aabz aabzVar = this.a;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ixd ixdVar = (ixd) aabzVar;
        ixdVar.q().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels - ixdVar.cu;
        View view = ixdVar.bR;
        if (view != null) {
            Rect g = ixdVar.am.g(view);
            float f = displayMetrics.heightPixels;
            if (g.top > 0 && g.top < ((int) (f * 0.2f))) {
                i = g.top;
            } else if (g.top < 0 || ixdVar.M.z().getConfiguration().orientation == 2) {
                i = ixdVar.z;
                if (i == -1) {
                    View findViewById2 = ixdVar.q().findViewById(android.R.id.statusBarBackground);
                    if (findViewById2 != null) {
                        i = findViewById2.getMeasuredHeight();
                    } else {
                        i = 0;
                    }
                }
            }
            i2 -= i;
        }
        if ((ixdVar.av.m() || ixdVar.aX()) && (findViewById = ixdVar.q().findViewById(R.id.action_add_more_people)) != null && findViewById.getVisibility() == 0) {
            ivk ivkVar = new ivk(7);
            ivk ivkVar2 = new ivk(8);
            if (!ixdVar.aV()) {
                apply = ivkVar2.apply(ixdVar.bV);
            } else {
                ila w = ixdVar.w();
                w.getClass();
                apply = ivkVar.apply(w);
            }
            View view2 = (View) apply;
            if (view2 != null) {
                return i2 - view2.getHeight();
            }
            return i2;
        }
        return i2;
    }
}
