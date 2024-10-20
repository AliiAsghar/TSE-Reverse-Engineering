package com.google.android.apps.messaging.ui.conversation.suggestions.tooltip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aagr;
import defpackage.abbs;
import defpackage.ahnz;
import defpackage.alsx;
import defpackage.d;
import defpackage.xzb;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationSuggestionsBugleTooltipView extends aagr {
    public View a;
    private TextView b;
    private TextView c;

    public ConversationSuggestionsBugleTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(CharSequence charSequence, List list) {
        boolean z;
        TextView textView = this.c;
        if (textView != null && charSequence != null) {
            int currentTextColor = textView.getCurrentTextColor();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(charSequence.toString()));
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            alsx alsxVar = (alsx) list;
            if (uRLSpanArr.length == alsxVar.c) {
                z = true;
            } else {
                z = false;
            }
            d.s(z);
            for (int i = 0; i < uRLSpanArr.length && i < alsxVar.c; i++) {
                URLSpan uRLSpan = uRLSpanArr[i];
                View.OnClickListener onClickListener = (View.OnClickListener) list.get(i);
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                spannableStringBuilder.setSpan(new abbs(onClickListener), spanStart, spanEnd, spanFlags);
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), spanStart, spanEnd, spanFlags);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(currentTextColor), spanStart, spanEnd, spanFlags);
                spannableStringBuilder.removeSpan(uRLSpan);
            }
            textView.setText(spannableStringBuilder);
            ahnz.s(textView);
            ahnz.t(textView);
        }
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            xzb.g("Bugle", "BugleTooltip: Title view is empty, cannot set the title text");
        } else {
            this.b.setText(str);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.tooltip_title);
        this.c = (TextView) findViewById(R.id.tooltip_content);
        this.a = findViewById(R.id.tooltip_dismiss_button);
        Drawable background = getBackground();
        if (background == null) {
            background = getContext().getDrawable(R.drawable.tooltip_light);
        }
        if (background != null) {
            background.setAutoMirrored(true);
        }
        setBackground(background);
    }
}
