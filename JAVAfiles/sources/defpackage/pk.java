package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pk extends nx {
    public pn a;
    public boolean b;

    public pk(int i, int i2) {
        super(i, i2);
    }

    public final int d() {
        pn pnVar = this.a;
        if (pnVar == null) {
            return -1;
        }
        return pnVar.e;
    }

    public pk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public pk(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public pk(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
