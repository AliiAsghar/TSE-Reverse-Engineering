package com.google.android.apps.messaging.ui.mediaviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaViewPager extends ViewPager {
    private static final xze n = xze.g("Bugle", "MediaViewPager");
    public final boolean m;

    public MediaViewPager(Context context) {
        super(context);
        this.m = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                n.n("ViewPager threw IllegalArgumentException", e);
                return false;
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.m) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                n.n("ViewPager threw IllegalArgumentException", e);
                return false;
            }
        }
        return false;
    }

    public MediaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
    }
}
