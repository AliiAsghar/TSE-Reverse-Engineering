package com.google.android.apps.messaging.popup.spam;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.armf;
import defpackage.lra;
import defpackage.lrb;
import defpackage.utz;
import defpackage.uuh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpamPopupView extends lra {
    public static final utz a = uuh.h(uuh.b, "spam_promo_popup_learn_more_url", "https://support.google.com/messages?p=spamdetection");
    static final utz b = uuh.h(uuh.b, "spam_promo_popup_learn_more_help_and_feedback_topic", "spamdetection");
    public armf c;
    public armf d;
    public lrb e;

    public SpamPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) == false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFinishInflate() {
        /*
            r11 = this;
            super.onFinishInflate()
            android.content.Context r0 = r11.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131429654(0x7f0b0916, float:1.8480987E38)
            android.view.View r1 = r11.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r2 = r11.getContext()
            java.lang.String r2 = defpackage.yyb.bs(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r4 = 2132021610(0x7f14116a, float:1.9681616E38)
            java.lang.String r0 = r0.getString(r4, r3)
            utz r3 = com.google.android.apps.messaging.popup.spam.SpamPopupView.b
            java.lang.Object r3 = r3.e()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            utz r3 = com.google.android.apps.messaging.popup.spam.SpamPopupView.a
            java.lang.Object r3 = r3.e()
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L47
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L58
        L47:
            android.content.Context r3 = r11.getContext()
            ivq r10 = new ivq
            r8 = 4
            r9 = 0
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            android.text.SpannableStringBuilder r0 = defpackage.aabr.ae(r3, r0, r2, r10)
        L58:
            r1.setText(r0)
            defpackage.ahnz.s(r1)
            defpackage.ahnz.t(r1)
            r0 = 2131427792(0x7f0b01d0, float:1.847721E38)
            android.view.View r0 = r11.findViewById(r0)
            klx r1 = new klx
            r2 = 19
            r1.<init>(r11, r2)
            r0.setOnClickListener(r1)
            r0 = 2131427791(0x7f0b01cf, float:1.8477208E38)
            android.view.View r0 = r11.findViewById(r0)
            klx r1 = new klx
            r2 = 20
            r1.<init>(r11, r2)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.popup.spam.SpamPopupView.onFinishInflate():void");
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), (int) (getResources().getDisplayMetrics().heightPixels * 0.5d)), Integer.MIN_VALUE));
    }
}
