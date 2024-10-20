package com.google.android.apps.messaging.ui.conversation.message;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.xou;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationMessageBubbleView extends LinearLayout {
    public ObjectAnimator a;
    public int b;
    public ViewGroup c;
    public final xou d;
    private int e;
    private boolean f;

    public ConversationMessageBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new xou((byte[]) null, (char[]) null);
    }

    public final int a(DisplayMetrics displayMetrics) {
        if (this.f) {
            return Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        return 0;
    }

    public final DisplayMetrics b() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public final void c(boolean z, boolean z2) {
        boolean z3 = this.f;
        this.f = z;
        if (z3 != z && z2) {
            this.c.setMinimumWidth(a(b()));
        }
    }

    public final void d(boolean z) {
        int a;
        ViewGroup viewGroup = this.c;
        if (z && !this.f) {
            a = (int) getResources().getDimension(R.dimen.snippet_minimum_width);
        } else {
            a = a(b());
        }
        viewGroup.setMinimumWidth(a);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ViewGroup) findViewById(R.id.message_text_and_info);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.e == 0 && measuredWidth != 0) {
            this.e = measuredWidth;
        }
        this.c.getLayoutParams().width = -2;
        this.c.requestLayout();
    }

    public void setMorphWidth(int i) {
        requestLayout();
    }
}
