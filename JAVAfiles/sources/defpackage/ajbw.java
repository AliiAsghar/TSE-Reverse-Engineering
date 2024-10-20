package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbw extends aizv {
    private LinearLayout d;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Spanned fromHtml;
        this.d = (LinearLayout) layoutInflater.inflate(R.layout.survey_thank_you_fragment, viewGroup, false);
        int i = this.m.getInt("DisplayLogoResId", 0);
        aizj.c((ImageView) this.d.findViewById(R.id.survey_prompt_banner_logo), Integer.valueOf(i));
        TextView textView = (TextView) this.d.findViewById(R.id.survey_question_text);
        fromHtml = Html.fromHtml(this.b.c, 0);
        textView.setText(fromHtml);
        textView.setContentDescription(fromHtml.toString());
        textView.announceForAccessibility(textView.getContentDescription());
        String e = aizr.e(this.b.e);
        if (!TextUtils.isEmpty(e)) {
            TextView textView2 = (TextView) this.d.findViewById(R.id.survey_follow_up_url);
            ahnz ahnzVar = aizp.c;
            if (aqqc.a.get().a(y()) && i == 0 && (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMarginStart(z().getDimensionPixelOffset(R.dimen.survey_thank_you_url_start_margin_state_no_icon));
            }
            String str = this.b.d;
            if (TextUtils.isEmpty(str)) {
                str = z().getString(R.string.survey_thank_you_followup_message);
            }
            textView2.setContentDescription(str);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ajbv(this, e), 0, str.length(), 0);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(spannableString);
            if (aizr.i(x())) {
                textView2.setClickable(false);
                textView2.setLongClickable(false);
            }
            textView2.setOnTouchListener(new nhn(4));
            textView2.setVisibility(0);
        }
        return this.d;
    }

    @Override // defpackage.aizv
    public final apqz e() {
        return null;
    }

    @Override // defpackage.aizv
    public final void o() {
        if (this.d != null) {
            int i = 0;
            while (i < this.d.getChildCount()) {
                View childAt = this.d.getChildAt(i);
                childAt.setAlpha(brg.a);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.aizv
    public final void p() {
        d().aO();
        d().q(true, this);
        if (TextUtils.isEmpty(aizr.e(this.b.e)) && d() != null) {
            ahnz ahnzVar = aizp.c;
            if (aizp.b(aqpt.a.get().a(aizp.b))) {
                d().o();
            }
            d().e();
        }
    }

    @Override // defpackage.aizv
    public final void q(String str) {
    }
}
