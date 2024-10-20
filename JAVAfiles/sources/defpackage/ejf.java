package defpackage;

import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejf {
    public Object a;
    public final /* synthetic */ Object b;

    public ejf(Object obj) {
        this.b = obj;
    }

    public final void a(int i, int i2, int i3, int i4) {
        ((CardView) this.b).d.set(i, i2, i3, i4);
        super/*android.widget.FrameLayout*/.setPadding(i + ((CardView) this.b).c.left, i2 + ((CardView) this.b).c.top, i3 + ((CardView) this.b).c.right, i4 + ((CardView) this.b).c.bottom);
    }

    public final boolean b() {
        return ((CardView) this.b).b;
    }

    public final boolean c() {
        return ((CardView) this.b).a;
    }
}
