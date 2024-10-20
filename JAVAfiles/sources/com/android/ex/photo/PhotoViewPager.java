package com.android.ex.photo;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import defpackage.gvf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PhotoViewPager extends ViewPager {
    private int m;

    public PhotoViewPager(Context context) {
        super(context);
        u();
    }

    private final void u() {
        gvf gvfVar = new gvf(null);
        gvf gvfVar2 = this.l;
        this.l = gvfVar;
        setChildrenDrawingOrderEnabled(true);
        this.k = 2;
        this.j = 2;
        if (gvfVar2 == null) {
            f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 3
            r2 = 1
            if (r0 == r1) goto Ld
            if (r0 != r2) goto L10
            r0 = r2
        Ld:
            r1 = -1
            r5.m = r1
        L10:
            r1 = 0
            if (r0 == 0) goto L31
            r3 = 6
            if (r0 == r3) goto L17
            goto L40
        L17:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.m
            if (r3 != r4) goto L40
            if (r0 != 0) goto L26
            goto L27
        L26:
            r2 = r1
        L27:
            r6.getX(r2)
            int r0 = r6.getPointerId(r2)
            r5.m = r0
            goto L40
        L31:
            r6.getX()
            r6.getRawX()
            r6.getRawY()
            int r0 = r6.getPointerId(r1)
            r5.m = r0
        L40:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.PhotoViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u();
    }
}
