package com.google.android.libraries.compose.ui.rendering.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aefw;
import defpackage.afzg;
import defpackage.armd;
import defpackage.arml;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class RendererContainer extends FrameLayout {
    public View.OnTouchListener a;
    public Integer b;
    private final arml c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RendererContainer(Context context) {
        super(context);
        context.getClass();
        this.c = armd.a(new afzg(this, 19));
    }

    private final void c(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    public final View a() {
        Object a = this.c.a();
        a.getClass();
        return (View) a;
    }

    public final void b(int i, boolean z) {
        if (z) {
            setTranslationY(getMeasuredHeight() - i);
            c(i);
            this.b = Integer.valueOf(i);
            animate().translationY(brg.a).withEndAction(new aefw(this, 9)).start();
            return;
        }
        if (this.b == null) {
            c(i);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.a;
        if ((onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RendererContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.c = armd.a(new afzg(this, 19));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RendererContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.c = armd.a(new afzg(this, 19));
    }
}
