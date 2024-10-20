package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import defpackage.ajir;
import defpackage.ajvl;
import defpackage.ajwh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BottomScrollView extends ScrollView {
    public ajwh a;
    private int b;
    private boolean c;
    private final Runnable d;

    public BottomScrollView(Context context) {
        super(context);
        this.c = false;
        this.d = new ajir(this, 12);
    }

    public final void a() {
        if (this.a != null) {
            if (getScrollY() >= this.b) {
                ((ajvl) this.a).a.n(true);
            } else if (!this.c) {
                this.c = true;
                ((ajvl) this.a).a.n(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.b = Math.max(0, ((childAt.getMeasuredHeight() - i4) + i2) - getPaddingBottom());
        }
        if (i4 - i2 > 0) {
            post(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i4 != i2) {
            a();
        }
    }

    public BottomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.d = new ajir(this, 12);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.d = new ajir(this, 12);
    }
}
