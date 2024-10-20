package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.RcsPromoView;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class aayo implements lqv {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final Context f;
    public final anen g;
    public final wjr h;
    private final armf i;
    private final anen j;
    private final odb k;
    private xvy l;
    private lqx m;

    public aayo(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, Context context, anen anenVar, anen anenVar2, wjr wjrVar, odb odbVar) {
        this.a = armfVar;
        this.b = armfVar2;
        this.i = armfVar3;
        this.c = armfVar4;
        this.d = armfVar5;
        this.e = armfVar6;
        this.f = context;
        this.g = anenVar;
        this.j = anenVar2;
        this.h = wjrVar;
        this.k = odbVar;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    @Override // defpackage.lqv
    public final akul b() {
        if (this.k.a()) {
            return aktp.ag(false);
        }
        return aktp.ai(new aaze(this, 1), this.j);
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        this.l = new xvy(viewGroup, R.id.conversation_list_rcs_promo_container_stub, R.id.conversation_list_rcs_promo_container);
        this.m = lqxVar;
    }

    @Override // defpackage.lqv
    public final void d() {
        this.l.e();
        this.m.b();
    }

    public final boolean e() {
        return ((ykw) this.e.b()).q("boew_promo_complete", false);
    }

    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        String string;
        RcsPromoView rcsPromoView = (RcsPromoView) this.l.b();
        rcsPromoView.h = this;
        if (e() && ((vqu) this.b.b()).E()) {
            rcsPromoView.d.setVisibility(8);
            rcsPromoView.e.setText(R.string.conversation_list_terms_and_conditions_promo_title);
            rcsPromoView.f.setText(R.string.conversation_list_terms_and_conditions_promo_subtitle_v2);
            rcsPromoView.c.setText(R.string.conversation_list_tnc_promo_button_positive);
        } else {
            ykb k = ((yjy) this.i.b()).k();
            rcsPromoView.d.setVisibility(0);
            rcsPromoView.e.setText(R.string.conversation_list_rcs_promo_title);
            Resources resources = rcsPromoView.getResources();
            if (rcsPromoView.a.e() > 1) {
                Resources resources2 = rcsPromoView.getResources();
                int d = k.d() + 1;
                String t = k.t();
                ImageView imageView = rcsPromoView.g;
                if (imageView != null) {
                    imageView.setImageBitmap(k.f(rcsPromoView.getContext()));
                    ((LinearLayout.LayoutParams) rcsPromoView.g.getLayoutParams()).height = resources2.getDimensionPixelSize(R.dimen.conversation_list_rcs_promo_sim_icon_size);
                }
                string = resources2.getString(R.string.conversation_list_rcs_promo_subtitle_multi_sim_v2, t, Integer.valueOf(d));
            } else {
                string = resources.getString(R.string.conversation_list_rcs_promo_subtitle);
            }
            rcsPromoView.f.setText(string);
            rcsPromoView.c.setText(R.string.conversation_list_rcs_promo_button_positive);
            rcsPromoView.d.setText(R.string.conversation_list_rcs_promo_button_negative);
            rcsPromoView.g.setImageResource(R.drawable.ic_blue_typing_indicator);
        }
        rcsPromoView.setVisibility(0);
        qjb.a(new aaxu(this, 3), this.g);
        return true;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 3;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
