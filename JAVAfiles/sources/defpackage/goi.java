package defpackage;

import android.R;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goi extends gvf {
    public final /* synthetic */ ViewPager2 a;
    public nq b;
    private final egi c = new gog(this, 1);
    private final egi d = new gog(this, 0);

    public goi(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    public final void i(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.g) {
            viewPager2.i(i);
        }
    }

    public final void j() {
        int b;
        int i;
        ViewPager2 viewPager2 = this.a;
        int i2 = R.id.accessibilityActionPageLeft;
        eek.l(viewPager2, R.id.accessibilityActionPageLeft);
        eek.l(viewPager2, R.id.accessibilityActionPageRight);
        eek.l(viewPager2, R.id.accessibilityActionPageUp);
        eek.l(viewPager2, R.id.accessibilityActionPageDown);
        if (this.a.c() != null && (b = this.a.c().b()) != 0) {
            ViewPager2 viewPager22 = this.a;
            if (viewPager22.g) {
                int i3 = b - 1;
                if (viewPager22.a() == 0) {
                    boolean g = this.a.g();
                    if (true != g) {
                        i = 16908361;
                    } else {
                        i = 16908360;
                    }
                    if (true == g) {
                        i2 = 16908361;
                    }
                    if (this.a.b < i3) {
                        eek.u(viewPager2, new efw(i, (CharSequence) null), this.c);
                    }
                    if (this.a.b > 0) {
                        eek.u(viewPager2, new efw(i2, (CharSequence) null), this.d);
                        return;
                    }
                    return;
                }
                if (this.a.b < i3) {
                    eek.u(viewPager2, new efw(R.id.accessibilityActionPageDown, (CharSequence) null), this.c);
                }
                if (this.a.b > 0) {
                    eek.u(viewPager2, new efw(R.id.accessibilityActionPageUp, (CharSequence) null), this.d);
                }
            }
        }
    }

    @Override // defpackage.gvf
    public final boolean k(int i) {
        if (i != 8192 && i != 4096) {
            return false;
        }
        return true;
    }
}
