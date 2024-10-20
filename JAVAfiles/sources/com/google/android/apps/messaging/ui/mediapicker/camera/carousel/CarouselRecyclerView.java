package com.google.android.apps.messaging.ui.mediapicker.camera.carousel;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import defpackage.aaqk;
import defpackage.aawf;
import defpackage.aawg;
import defpackage.nj;
import defpackage.xyl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CarouselRecyclerView extends RecyclerView {
    public int ab;
    public int ac;
    private CarouselLayoutManager ad;
    private DecelerateInterpolator ae;
    private int af;

    public CarouselRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ab = -1;
        this.ac = -1;
        this.af = 0;
    }

    private final int aN(int i) {
        View aF = this.ad.aF(i);
        if (aF != null) {
            return (aF.getLeft() + (aF.getWidth() / 2)) - (getWidth() / 2);
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void W(int i) {
        if (i == 1) {
            this.ab = -1;
            this.ac = -1;
        }
    }

    public final int a(int i) {
        View aF = this.ad.aF(0);
        View aF2 = this.ad.aF(r1.at() - 1);
        if (aF != null && aF2 != null) {
            int fV = fV(aF);
            int fV2 = fV(aF2);
            if (i >= fV && i <= fV2) {
                return i - fV;
            }
        }
        return -1;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ae(int i) {
        if (i < 0) {
            return;
        }
        if (a(i) != -1) {
            this.ac = -1;
            am(aN(a(i)), 0);
            return;
        }
        this.ac = i;
        aawf aawfVar = new aawf(getContext(), 1.0f);
        aawfVar.g = i;
        aawfVar.f = this;
        this.ad.bj(aawfVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void an(int i, int i2, Interpolator interpolator) {
        if (xyl.n()) {
            super.scrollBy(i, i2);
        } else {
            aG(i, i2, interpolator);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ao(int i) {
        if (i < 0) {
            return;
        }
        if (a(i) != -1) {
            this.ab = -1;
            an(aN(a(i)), 0, this.ae);
            return;
        }
        this.ab = i;
        aawf aawfVar = new aawf(getContext(), 150.0f);
        aawfVar.g = i;
        aawfVar.f = this;
        this.ad.bj(aawfVar);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        this.ae = new DecelerateInterpolator();
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager();
        this.ad = carouselLayoutManager;
        aj(carouselLayoutManager);
        new nj(this.ad);
        new aawg().e(this);
        post(new aaqk(this, 17));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.af == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 4096 && i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        int i = this.af;
        int i2 = 1;
        if (true == z) {
            i2 = -1;
        }
        this.af = i + i2;
        super.setEnabled(z);
    }
}
