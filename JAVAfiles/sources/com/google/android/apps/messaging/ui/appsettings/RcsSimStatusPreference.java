package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.adiv;
import defpackage.ahnz;
import defpackage.gfx;
import defpackage.zky;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsSimStatusPreference extends Preference {
    public LinearLayout a;
    public final List b;
    private MaterialCardView c;
    private TextView d;
    private int e;
    private SpannableStringBuilder f;
    private LinearLayout g;

    public RcsSimStatusPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 8;
        this.b = new ArrayList();
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        super.a(gfxVar);
        LinearLayout linearLayout = (LinearLayout) gfxVar.D(R.id.rcs_sim_status_list);
        if (linearLayout != null) {
            this.a = linearLayout;
            if (!this.b.isEmpty() && this.a.getChildCount() == 0) {
                for (RcsSimStatusView rcsSimStatusView : this.b) {
                    o(rcsSimStatusView, rcsSimStatusView.E().b);
                }
                this.b.clear();
            }
        }
        TextView textView = (TextView) gfxVar.D(R.id.legal_banner_text);
        if (textView != null) {
            this.d = textView;
            ac(this.f);
        }
        MaterialCardView materialCardView = (MaterialCardView) gfxVar.D(R.id.legal_banner);
        if (materialCardView != null) {
            this.c = materialCardView;
            ad(this.e);
        }
    }

    public final void ab() {
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void ac(SpannableStringBuilder spannableStringBuilder) {
        this.f = spannableStringBuilder;
        TextView textView = this.d;
        if (textView != null && spannableStringBuilder != null) {
            textView.setText(spannableStringBuilder);
            ahnz.s(this.d);
        }
    }

    public final void ad(int i) {
        this.e = i;
        MaterialCardView materialCardView = this.c;
        if (materialCardView != null) {
            materialCardView.setVisibility(i);
        }
    }

    public final void ae(adiv adivVar, int i) {
        RcsSimStatusView l = l(adivVar);
        if (l != null) {
            zky E = l.E();
            E.v = i;
            E.f();
        }
    }

    public final LinearLayout k() {
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = this.a;
        if (linearLayout2 != null && linearLayout2.getParent() != null && (this.a.getParent() instanceof LinearLayout)) {
            this.g = (LinearLayout) this.a.getParent();
        }
        return this.g;
    }

    public final RcsSimStatusView l(adiv adivVar) {
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((RcsSimStatusView) this.a.getChildAt(i)).E().b.equals(adivVar)) {
                    return (RcsSimStatusView) this.a.getChildAt(i);
                }
            }
            return null;
        }
        return null;
    }

    public final void o(RcsSimStatusView rcsSimStatusView, adiv adivVar) {
        rcsSimStatusView.E().b = adivVar;
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            linearLayout.addView(rcsSimStatusView);
        } else {
            this.b.add(rcsSimStatusView);
        }
    }
}
