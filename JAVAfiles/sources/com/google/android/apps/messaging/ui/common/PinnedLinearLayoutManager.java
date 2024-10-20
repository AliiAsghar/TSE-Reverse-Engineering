package com.google.android.apps.messaging.ui.common;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import defpackage.od;
import defpackage.ol;
import defpackage.zqg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PinnedLinearLayoutManager extends LinearLayoutManager {
    public int a;

    public PinnedLinearLayoutManager() {
        super.s(false);
        super.af(true);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final void ar(RecyclerView recyclerView, int i) {
        zqg zqgVar = new zqg(recyclerView.getContext());
        zqgVar.g = i;
        bj(zqgVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final void o(od odVar, ol olVar) {
        int top;
        int bottom;
        int az;
        int i;
        int i2;
        super.o(odVar, olVar);
        int min = Math.min(this.a, at());
        if (min > 0) {
            int aC = (this.G - aC()) - az();
            if (this.m) {
                top = aF(at() - 1).getTop();
                bottom = aF(0).getBottom();
            } else {
                top = aF(0).getTop();
                bottom = aF(at() - 1).getBottom();
            }
            if (aC > bottom - top) {
                if (this.m ^ this.o) {
                    az = aC();
                } else {
                    az = this.G - az();
                }
                for (int i3 = 0; i3 < min; i3++) {
                    View aF = aF(this.o ? i3 : (at() - i3) - 1);
                    int height = aF.getHeight();
                    if (aF.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aF.getLayoutParams();
                        i2 = marginLayoutParams.topMargin;
                        i = marginLayoutParams.bottomMargin;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    Rect rect = new Rect();
                    aL(aF, rect);
                    if (this.m ^ this.o) {
                        int i4 = az + rect.top + i2;
                        aF.setTop(i4);
                        int i5 = i4 + height;
                        aF.setBottom(i5);
                        az = i5 + rect.bottom + i;
                    } else {
                        int i6 = az - (rect.bottom + i);
                        aF.setBottom(i6);
                        int i7 = i6 - height;
                        aF.setTop(i7);
                        az = i7 - (rect.top + i2);
                    }
                }
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.nw
    public final boolean v() {
        return true;
    }
}
