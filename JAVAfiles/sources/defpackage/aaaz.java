package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaaz extends PopupWindow implements aaax {
    public final Context a;
    public final aaak b;
    public final LayoutInflater c;
    public final List d;
    public aaay e;
    public GridLayoutManager f;
    public View g;
    public View h;
    public View i;
    public View j;
    public int k;
    public int l;
    public FrameLayout.LayoutParams m;
    public ahjj n;

    public aaaz(Context context, aaak aaakVar) {
        super(context);
        this.d = new ArrayList();
        this.a = context;
        this.b = aaakVar;
        this.c = LayoutInflater.from(context);
    }

    public final void a() {
        boolean z;
        Point Z = aabr.Z(this.j);
        int i = Z.x;
        int d = ((Z.y - abbu.d(this.a)) + this.j.getHeight()) - this.h.getHeight();
        this.h.setTranslationX(i);
        this.h.setTranslationY(d);
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.j.getWidth();
        }
        Point Z2 = aabr.Z(this.j);
        int width = Z2.x + (this.j.getWidth() / 2);
        int width2 = this.i.getWidth() / 2;
        int i2 = this.l;
        int width3 = (abbv.b(this.a).x - this.i.getWidth()) - this.l;
        if (width3 >= i2) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int i3 = width - width2;
        if (i3 > width3) {
            i2 = width3;
        } else if (i3 >= i2) {
            i2 = i3;
        }
        int d2 = (((Z2.y - abbu.d(this.a)) + this.j.getHeight()) - this.h.getHeight()) - this.i.getHeight();
        this.i.setTranslationX(i2);
        this.i.setTranslationY(d2);
    }

    public final boolean b() {
        int height = this.i.getHeight();
        int height2 = this.h.getHeight();
        if (this.j != null && height > 0 && height2 > 0) {
            return true;
        }
        return false;
    }
}
