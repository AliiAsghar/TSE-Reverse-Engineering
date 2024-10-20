package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yah implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public yah(View view, Runnable runnable, int i) {
        this.c = i;
        this.a = view;
        this.b = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.c;
        if (i9 != 0) {
            if (i9 != 1) {
                ((arzk) this.b).c(this.a);
                return;
            } else {
                if (((ixd) this.b).ca.g() && view.getWidth() != 0) {
                    this.a.removeOnLayoutChangeListener(this);
                    ((ixd) this.b).aG();
                    return;
                }
                return;
            }
        }
        this.a.removeOnLayoutChangeListener(this);
        xzw.a.post(new wnc(this.a, this.b, 17, null));
    }

    public /* synthetic */ yah(arzu arzuVar, View view, int i) {
        this.c = i;
        this.b = arzuVar;
        this.a = view;
    }

    public yah(ixd ixdVar, View view, int i) {
        this.c = i;
        this.a = view;
        this.b = ixdVar;
    }
}
