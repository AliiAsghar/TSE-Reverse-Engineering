package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goc extends gvf {
    final /* synthetic */ ViewPager2 a;

    public goc(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.gvf
    public final void g(int i) {
        this.a.clearFocus();
        if (this.a.hasFocus()) {
            this.a.e.requestFocus(2);
        }
    }
}
