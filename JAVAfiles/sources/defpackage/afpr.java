package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afpr extends PopupWindow implements afpp {
    public final Activity a;
    public final FrameLayout b;
    public View c;
    public final ValueAnimator d;
    public final ValueAnimator e;
    public arqr f;
    public final arqr g;
    private final CardView h;
    private final View i;
    private afpn j;
    private final arml k;
    private final arml l;
    private final arml m;
    private final arml n;
    private final arml o;
    private int p;
    private final arml q;
    private final arml r;
    private final arml s;
    private final arml t;
    private final arml u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpr(Activity activity) {
        super(activity);
        activity.getClass();
        this.a = activity;
        this.k = armd.a(new afoo(this, 12));
        this.l = armd.a(new afoo(this, 14));
        this.m = armd.a(new afoo(this, 17));
        this.n = armd.a(new afoo(this, 11));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(k());
        ofFloat.addUpdateListener(new ztg(this, 7));
        this.d = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, brg.a);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setDuration(k());
        ofFloat2.addUpdateListener(new ztg(this, 8));
        this.e = ofFloat2;
        this.o = armd.a(new afoo(this, 20));
        this.g = new afmo(this, 5);
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(null);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.emoji_variant_menu, (ViewGroup) null);
        setContentView(inflate);
        inflate.setOnClickListener(new acah(this, 14));
        CardView cardView = (CardView) inflate.findViewById(R.id.panel);
        this.h = cardView;
        this.i = inflate.findViewById(R.id.descender);
        this.b = (FrameLayout) inflate.findViewById(R.id.emoji_set_view_container);
        setAnimationStyle(R.style.VariantMenuAnimation);
        cardView.addOnLayoutChangeListener(new fyc(this, 16));
        setOnDismissListener(new afpq(this, 0));
        this.q = armd.b(1, new afoo(this, 18));
        this.r = armd.b(1, new afoo(this, 19));
        this.s = armd.b(1, new afoo(this, 16));
        this.t = armd.b(1, new afoo(this, 15));
        this.u = armd.b(1, new afoo(this, 13));
    }

    private final int h() {
        return ((Number) this.k.a()).intValue();
    }

    private final int i() {
        return ((Number) this.m.a()).intValue();
    }

    private final int j() {
        return ((Number) this.o.a()).intValue();
    }

    private final long k() {
        return ((Number) this.n.a()).longValue();
    }

    private final void l(afpn afpnVar, int i) {
        int j = i - j();
        afpnVar.f.d(afpn.a[2], Integer.valueOf(j));
    }

    @Override // defpackage.afpp
    public final void a() {
        dismiss();
    }

    @Override // defpackage.afpp
    public final void b(afnb afnbVar, View view, afnx afnxVar, arqr arqrVar) {
        afpn afpnVar;
        afnxVar.getClass();
        if (afnbVar instanceof afmz) {
            afpnVar = (afpn) this.q.a();
            afpnVar.d(afnbVar);
        } else if (afnbVar instanceof afna) {
            afpnVar = (afpn) this.r.a();
            afpnVar.d(afnbVar);
        } else if (afnbVar instanceof afmy) {
            afpnVar = (afpn) this.s.a();
            afpnVar.d(afnbVar);
        } else if (afnbVar instanceof afmx) {
            afpnVar = (afpn) this.t.a();
            afpnVar.d(afnbVar);
        } else if (afnbVar instanceof afmu) {
            afpnVar = (afpn) this.u.a();
            afpnVar.d(afnbVar);
        } else {
            throw new armm();
        }
        afpnVar.d.d(afpn.a[0], afnxVar);
        l(afpnVar, afwv.w(view).y);
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.b.getChildAt(i).setVisibility(8);
        }
        this.j = afpnVar;
        afpnVar.setVisibility(0);
        afpnVar.requestFocus();
        this.c = view;
        showAsDropDown(view, 0, 0, 48);
        d();
        if (g()) {
            e();
        }
        this.d.cancel();
        this.e.cancel();
        this.d.start();
        getContentView().requestFocus();
        this.f = arqrVar;
    }

    public final int c() {
        return ((Number) this.l.a()).intValue();
    }

    public final void d() {
        View view = this.c;
        if (view == null) {
            return;
        }
        Point w = afwv.w(view);
        int i = w.x;
        this.p = ((w.y - j()) + view.getHeight()) - h();
        View view2 = this.i;
        view2.setTranslationX(i);
        view2.setTranslationY(this.p);
        view2.getLayoutParams().width = view.getWidth();
        view2.requestLayout();
    }

    public final void e() {
        View view = this.c;
        if (view == null) {
            return;
        }
        Point w = afwv.w(view);
        int width = w.x + (view.getWidth() / 2);
        int width2 = this.h.getWidth() / 2;
        int i = i();
        Context context = view.getContext();
        context.getClass();
        int u = arrn.u(width - width2, i, (afzv.c(context).x - this.h.getWidth()) - i());
        afpn afpnVar = this.j;
        if (afpnVar != null) {
            l(afpnVar, w.y);
        }
        int j = ((((w.y - j()) + view.getHeight()) - this.i.getHeight()) + i()) - this.h.getHeight();
        this.h.setTranslationX(u);
        this.h.setTranslationY(j);
    }

    public final void f(float f) {
        float f2 = 1.0f - f;
        View view = this.i;
        view.setTranslationY(this.p - (h() * f2));
        view.setAlpha(f);
        View contentView = getContentView();
        contentView.setTranslationY(f2 * h());
        contentView.setAlpha(f);
    }

    public final boolean g() {
        if (this.c != null && this.j != null && this.h.getHeight() > 0 && this.i.getHeight() > 0) {
            return true;
        }
        return false;
    }
}
