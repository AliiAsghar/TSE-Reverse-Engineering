package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.RatingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrf extends bw implements agrd {
    private final agre ag = new agre(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        agre agreVar = this.ag;
        agreVar.c = super.fe();
        agreVar.n = new akro(agreVar.c);
        Bundle bundle2 = ((cg) agreVar.a).m;
        String string = bundle2.getString("SiteId");
        int i = bundle2.getInt("RequestCode", -1);
        agreVar.e = (aorr) aetn.aZ(aorr.a, bundle2.getByteArray("Survey"));
        agreVar.f = (aocp) aetn.aZ(aocp.a, bundle2.getByteArray("SurveyPayload"));
        agreVar.d = (agri) bundle2.getParcelable("AnswerBeacon");
        agreVar.g = bundle2.getBoolean("BottomSheet");
        agreVar.h = bundle2.getBoolean("IsRatingBanner");
        int i2 = bundle2.getInt("hatsDisplayLogo", 0);
        bw bwVar = (bw) agreVar.a;
        if (bwVar.c) {
            bwVar.d.requestWindowFeature(1);
        }
        agreVar.d.c("sv");
        new ahiy(agreVar.e.h, agrk.a(agreVar.c)).d(agreVar.d);
        agrn.c().a().b();
        agreVar.b = layoutInflater.inflate(R.layout.hats_prompt_banner, viewGroup, false);
        agkx.m((ImageView) agreVar.b.findViewById(R.id.hats_lib_prompt_banner_logo), i2);
        View view = agreVar.b;
        agreVar.m = new ahuq((CardView) view, ((bw) agreVar.a).d, agreVar.n, agreVar.g);
        if (agreVar.h) {
            agre.e(view, ((aocl) agreVar.f.b.get(0)).c);
            View view2 = agreVar.b;
            View findViewById = view2.findViewById(R.id.prompt_banner_header);
            Resources resources = agreVar.c.getResources();
            findViewById.setPadding(0, 0, resources.getDimensionPixelSize(R.dimen.hats_lib_close_button_size) - resources.getDimensionPixelSize(R.dimen.hats_lib_prompt_banner_right_padding), 0);
            ((ImageButton) view2.findViewById(R.id.hats_lib_close_button)).setOnClickListener(new agrb(agreVar, 2));
            agkx.n(view2.findViewById(R.id.hats_lib_close_button_layout), view2.findViewById(R.id.hats_lib_close_button), R.dimen.hats_lib_close_button_top_right_padding, R.dimen.hats_lib_close_button_top_right_padding);
            agreVar.i = new agrp();
            agreVar.i.c();
            agreVar.d.e(0);
            RatingView ratingView = (RatingView) view2.findViewById(R.id.hats_lib_prompt_rating_view);
            ratingView.setVisibility(0);
            aocl aoclVar = (aocl) agreVar.f.b.get(0);
            aocn aocnVar = aoclVar.f;
            if (aocnVar == null) {
                aocnVar = aocn.a;
            }
            ratingView.b(aocnVar, aoclVar.g);
            ratingView.a = new agrc(agreVar, string, i, i2);
        } else {
            agre.e(view, agreVar.e.e);
            View view3 = agreVar.b;
            view3.findViewById(R.id.hats_lib_prompt_buttons).setVisibility(0);
            view3.findViewById(R.id.hats_lib_close_button_layout).setVisibility(8);
            Button button = (Button) view3.findViewById(R.id.hats_lib_prompt_no_thanks_button);
            Button button2 = (Button) view3.findViewById(R.id.hats_lib_prompt_take_survey_button);
            agreVar.c(button);
            agreVar.c(button2);
            view3.findViewById(R.id.hats_lib_prompt_no_thanks_wrapper).setOnTouchListener(new iiy(button, 5, null));
            view3.findViewById(R.id.hats_lib_prompt_take_survey_wrapper).setOnTouchListener(new iiy(button2, 6, null));
            button2.setOnClickListener(new agwh(agreVar, string, i, i2, 1));
            button.setOnClickListener(new agrb(agreVar, 0));
        }
        return agreVar.b;
    }

    @Override // defpackage.agrd
    public final /* bridge */ /* synthetic */ Activity a() {
        return super.fe();
    }

    @Override // defpackage.cg
    public final void aa() {
        if (!this.ag.k) {
            agrn.c().a().a();
        }
        super.aa();
    }

    @Override // defpackage.cg
    public final void ad() {
        super.ad();
        this.ag.l = false;
    }

    @Override // defpackage.cg
    public final void af() {
        this.ag.a();
        super.af();
    }

    @Override // defpackage.bw, defpackage.cg
    public final void k() {
        super.k();
        this.ag.a();
    }
}
