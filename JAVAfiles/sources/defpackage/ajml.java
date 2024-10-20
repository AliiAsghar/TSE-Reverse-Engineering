package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajml implements gnj {
    public int a;
    public int b;
    private final WeakReference c;

    public ajml(TabLayout tabLayout) {
        this.c = new WeakReference(tabLayout);
    }

    @Override // defpackage.gnj
    public final void a(int i) {
        this.a = this.b;
        this.b = i;
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null) {
            tabLayout.F = this.b;
        }
    }

    @Override // defpackage.gnj
    public final void b(int i) {
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null && tabLayout.a() != i && i < tabLayout.b()) {
            int i2 = this.b;
            boolean z = true;
            if (i2 != 0 && (i2 != 2 || this.a != 0)) {
                z = false;
            }
            tabLayout.m(tabLayout.d(i), z);
        }
    }

    @Override // defpackage.gnj
    public final void c(int i, float f) {
        boolean z;
        boolean z2;
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null) {
            int i2 = this.b;
            if (i2 == 2 && this.a != 1) {
                z = false;
            } else {
                z = true;
            }
            if (i2 == 2 && this.a == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            tabLayout.o(i, f, z, z2, false);
        }
    }
}
