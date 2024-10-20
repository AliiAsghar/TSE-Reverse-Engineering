package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwt {
    public static final /* synthetic */ artm[] a;
    public final Activity b;
    public final agak c;
    public final arqg d;
    public final afvz e;
    public final boolean f;
    public boolean h;
    public boolean i;
    public final arsn j;
    public final aday k;
    private final boolean l;
    private final arml n;
    private final arml o;
    private final arml p;
    private final arml q;
    private final arml r;
    private final arml s;
    private final arml t;
    private final arsn u;
    private final arsn v;
    public final afwp g = new afwp(this, 0);
    private final aflc w = new aflc(this, 2);
    private final TextView.OnEditorActionListener m = new ild(this, 2);

    static {
        arrr arrrVar = new arrr(afwt.class, "startIconState", "getStartIconState()Lcom/google/android/libraries/compose/proxy/ui/search/SearchController$StartIconState;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar, new arrr(afwt.class, "endIconState", "getEndIconState()Lcom/google/android/libraries/compose/proxy/ui/search/SearchController$EndIconState;", 0), new arrr(afwt.class, "activeScreen", "getActiveScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0)};
    }

    public afwt(Activity activity, agak agakVar, aday adayVar, aday adayVar2, arqg arqgVar, afvz afvzVar, boolean z, boolean z2) {
        this.b = activity;
        this.c = agakVar;
        this.k = adayVar2;
        this.d = arqgVar;
        this.e = afvzVar;
        this.f = z;
        this.l = z2;
        armd.a(new afzu(adayVar, this, 1));
        this.n = armd.a(new afpw(this, 20));
        this.o = armd.a(new afpw(this, 15));
        this.p = armd.a(new afww(this, 1));
        this.q = armd.a(new afpw(this, 16));
        this.r = armd.a(new afpw(this, 19));
        this.s = armd.a(new afpw(this, 17));
        armd.a(new afpw(this, 14));
        this.t = armd.a(new afpw(this, 18));
        this.u = new afwq(afwo.a, this);
        this.v = new afwr(afwn.a, this);
        i(a());
        h(p());
        this.j = new afws(this);
    }

    public static /* synthetic */ void m(afwt afwtVar) {
        afwtVar.g(afwtVar.b());
    }

    public static /* synthetic */ void n(afwt afwtVar, CharSequence charSequence, boolean z, int i) {
        afwo afwoVar;
        afwn afwnVar;
        if ((i & 1) != 0) {
            charSequence = ((EditText) afwtVar.e.g).getText();
        }
        if ((i & 2) != 0) {
            z = ((EditText) afwtVar.e.g).hasFocus();
        }
        if (charSequence.length() <= 0 && !z) {
            afwoVar = afwo.a;
        } else {
            afwoVar = afwo.b;
        }
        artm[] artmVarArr = a;
        afwtVar.u.d(artmVarArr[0], afwoVar);
        if (charSequence.length() > 0) {
            afwnVar = afwn.b;
        } else {
            afwnVar = afwn.a;
        }
        afwtVar.v.d(artmVarArr[1], afwnVar);
    }

    private final afwn p() {
        return (afwn) this.v.c(a[1]);
    }

    public final afwo a() {
        return (afwo) this.u.c(a[0]);
    }

    public final agem b() {
        return (agem) this.j.c(a[2]);
    }

    public final void c() {
        if (!this.i) {
            afvz afvzVar = this.e;
            ilc ilcVar = new ilc(this, 5);
            EditText editText = (EditText) afvzVar.g;
            editText.setOnFocusChangeListener(ilcVar);
            editText.addTextChangedListener(this.w);
            editText.setOnEditorActionListener(this.m);
            this.i = true;
            i(afwo.a);
        }
    }

    public final void d(boolean z) {
        Object obj = this.e.g;
        if (z) {
            ((EditText) obj).clearFocus();
        }
        ((EditText) obj).getText().clear();
    }

    public final void e() {
        ((afwk) this.k.b).e();
        ((EditText) this.e.g).getText().clear();
        this.c.e((View) this.e.g, true);
        o();
    }

    public final void f() {
        Object obj = this.e.l;
        if (((View) obj).getVisibility() == 0) {
            ((RecyclerView) obj).startAnimation((Animation) this.t.a());
        }
    }

    public final void g(agem agemVar) {
        if (agemVar != null && (agemVar instanceof agep)) {
        }
        if (((View) this.e.h).getVisibility() == 0) {
            ((View) this.e.f).setVisibility(0);
            ((View) this.e.g).setVisibility(8);
            ((View) this.e.e).setVisibility(8);
        } else {
            ((ViewGroup) this.e.f).setVisibility(4);
        }
        ((View) this.e.d).setVisibility(8);
        if (this.l && this.i) {
            l();
        }
    }

    public final void h(afwn afwnVar) {
        int i;
        Object obj = this.e.e;
        int ordinal = afwnVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                appCompatImageView.setImageDrawable((Drawable) this.s.a());
                appCompatImageView.setOnClickListener(new acah(this, 17));
                i = 0;
            } else {
                throw new armm();
            }
        } else {
            i = 8;
        }
        ((View) obj).setVisibility(i);
    }

    public final void i(afwo afwoVar) {
        Drawable drawable;
        Object obj = this.e.d;
        int ordinal = afwoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (afwv.A((View) obj)) {
                    drawable = (Drawable) this.r.a();
                } else {
                    drawable = (Drawable) this.q.a();
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                appCompatImageView.setImageDrawable(drawable);
                appCompatImageView.setContentDescription((String) this.o.a());
                appCompatImageView.setOnClickListener(new acah(this, 15));
                return;
            }
            throw new armm();
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) obj;
        appCompatImageView2.setImageDrawable((Drawable) this.p.a());
        appCompatImageView2.setContentDescription((String) this.n.a());
        appCompatImageView2.setOnClickListener(new acah(this, 16));
    }

    public final void j(String str) {
        if (this.c.d() == agaq.a) {
            this.c.e((View) this.e.g, true);
        }
        k(str);
        ((afwk) this.k.b).e();
        f();
    }

    public final void k(String str) {
        EditText editText = (EditText) this.e.g;
        editText.setText(str.concat(" "));
        editText.setSelection(editText.length());
    }

    public final void l() {
        EditText editText = (EditText) this.e.g;
        editText.setOnFocusChangeListener(null);
        editText.removeTextChangedListener(this.w);
        editText.setOnEditorActionListener(null);
        this.i = false;
    }

    public final void o() {
        agem b = b();
        if (b != null) {
            if (b instanceof agep) {
                return;
            }
            throw new IllegalStateException(a.cc(b, "Active screen ", " is not searchable"));
        }
    }
}
