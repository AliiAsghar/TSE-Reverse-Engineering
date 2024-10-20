package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazb extends aayy {
    public mho a;
    private TextView ag;
    private TextView ah;
    private TextView ai;
    private View aj;
    private View ak;
    public mbl b;
    public vqu c;
    public lzv d;
    private TextView e;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.rcs_promo_fragment, viewGroup, false);
        this.a.aS(21);
        boolean E = this.c.E();
        this.e = (TextView) inflate.findViewById(R.id.rcs_promo_negative_button);
        this.ag = (TextView) inflate.findViewById(R.id.rcs_promo_positive_button);
        this.ah = (TextView) inflate.findViewById(R.id.boew_promo_learn_more_button);
        this.ai = (TextView) inflate.findViewById(R.id.promo_text);
        this.aj = inflate.findViewById(R.id.boew_promo_space);
        this.ak = inflate.findViewById(R.id.boew_promo_share_pii_text);
        if (E) {
            this.e.setVisibility(8);
            this.aj.setVisibility(8);
            this.ah.setVisibility(8);
            this.ak.setVisibility(8);
            this.ai.setText(R.string.rcs_terms_and_conditions_promo_text_v2);
            this.ag.setOnClickListener(new aaxc(this, 10));
        } else {
            this.e.setVisibility(0);
            this.aj.setVisibility(0);
            this.ah.setVisibility(0);
            this.ak.setVisibility(0);
            TextView textView = this.ah;
            textView.setPaintFlags(8 | textView.getPaintFlags());
            this.e.setOnClickListener(new aaxc(this, 11));
            this.ag.setOnClickListener(new aaxc(this, 12));
            this.ah.setOnClickListener(new aaxc(this, 13));
        }
        return inflate;
    }
}
