package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gob extends gvf {
    final /* synthetic */ ViewPager2 a;

    public gob(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.gvf
    public final void bT(int i) {
        if (i == 0) {
            this.a.f();
        }
    }

    @Override // defpackage.gvf
    public final void g(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.b != i) {
            viewPager2.b = i;
            ((goi) viewPager2.j).j();
        }
    }
}
