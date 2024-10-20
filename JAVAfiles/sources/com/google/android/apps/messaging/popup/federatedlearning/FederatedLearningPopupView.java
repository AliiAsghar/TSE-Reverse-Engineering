package com.google.android.apps.messaging.popup.federatedlearning;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.aksr;
import defpackage.ksm;
import defpackage.lqz;
import defpackage.lzv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FederatedLearningPopupView extends lqz {
    public lzv a;
    public ksm b;
    public aksr c;

    public FederatedLearningPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFinishInflate() {
        /*
            r12 = this;
            super.onFinishInflate()
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131428107(0x7f0b030b, float:1.847785E38)
            android.view.View r1 = r12.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r2 = r12.getContext()
            java.lang.String r2 = defpackage.yyb.bs(r2)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r2
            r5 = 2132018729(0x7f140629, float:1.9675773E38)
            java.lang.String r0 = r0.getString(r5, r4)
            utz r4 = defpackage.yig.B
            java.lang.Object r4 = r4.e()
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            utz r4 = defpackage.yig.A
            java.lang.Object r4 = r4.e()
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L47
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto L58
        L47:
            android.content.Context r4 = r12.getContext()
            ivq r11 = new ivq
            r9 = 3
            r10 = 0
            r5 = r11
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            android.text.SpannableStringBuilder r0 = defpackage.aabr.ae(r4, r0, r2, r11)
        L58:
            r1.setText(r0)
            defpackage.ahnz.s(r1)
            defpackage.ahnz.t(r1)
            r0 = 2131428105(0x7f0b0309, float:1.8477845E38)
            android.view.View r0 = r12.findViewById(r0)
            aksr r1 = r12.c
            ili r2 = new ili
            r4 = 4
            r2.<init>(r4)
            akwb r4 = new akwb
            java.lang.String r5 = "FederatedLearningPopupView#positiveButton.onClick"
            r4.<init>(r1, r5, r2, r3)
            r0.setOnClickListener(r4)
            r0 = 2131428104(0x7f0b0308, float:1.8477843E38)
            android.view.View r0 = r12.findViewById(r0)
            aksr r1 = r12.c
            ili r2 = new ili
            r4 = 5
            r2.<init>(r4)
            akwb r4 = new akwb
            java.lang.String r5 = "FederatedLearningPopupView#negativeButton.onClick"
            r4.<init>(r1, r5, r2, r3)
            r0.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.popup.federatedlearning.FederatedLearningPopupView.onFinishInflate():void");
    }
}
