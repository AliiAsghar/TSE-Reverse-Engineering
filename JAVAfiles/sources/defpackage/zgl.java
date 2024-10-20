package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgl implements ViewTreeObserver.OnGlobalLayoutListener {
    public final abdc a;
    private int b = -1;
    private final abbu c;
    private final Activity d;
    private final View e;
    private final boolean f;
    private final zgk g;
    private final zgk h;

    public zgl(abdc abdcVar, abbu abbuVar, Activity activity, View view, boolean z) {
        this.a = abdcVar;
        this.c = abbuVar;
        this.d = activity;
        this.e = view;
        this.f = z;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.c2o_ime_minimum_height);
        this.g = new zgk(this, dimensionPixelSize);
        this.h = new zgk(this, dimensionPixelSize);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int height;
        if (this.d.getWindow().getAttributes().softInputMode != 48) {
            if (!yhx.d(this.d, this.f)) {
                Rect rect = new Rect();
                Point point = new Point();
                this.e.getWindowVisibleDisplayFrame(rect);
                this.d.getWindowManager().getDefaultDisplay().getSize(point);
                if (rect.height() > point.y) {
                    height = -1;
                } else {
                    height = rect.height();
                }
                if (height != -1 && height != this.b) {
                    if (this.c.m()) {
                        this.h.a(height);
                    } else {
                        this.g.a(height);
                    }
                    this.b = height;
                    return;
                }
                return;
            }
            this.a.f(false);
        }
    }
}
