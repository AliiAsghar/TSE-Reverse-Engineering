package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gni extends ecl {
    final /* synthetic */ ViewPager a;

    public gni(ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean j() {
        gnd gndVar = this.a.b;
        if (gndVar != null && gndVar.j() > 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ecl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        gnd gndVar;
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(j());
        if (accessibilityEvent.getEventType() == 4096 && (gndVar = this.a.b) != null) {
            accessibilityEvent.setItemCount(gndVar.j());
            accessibilityEvent.setFromIndex(this.a.c);
            accessibilityEvent.setToIndex(this.a.c);
        }
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        super.c(view, efxVar);
        efxVar.q("androidx.viewpager.widget.ViewPager");
        efxVar.M(j());
        if (this.a.canScrollHorizontally(1)) {
            efxVar.g(4096);
        }
        if (this.a.canScrollHorizontally(-1)) {
            efxVar.g(8192);
        }
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.a.canScrollHorizontally(-1)) {
                return false;
            }
            this.a.j(r2.c - 1);
            return true;
        }
        if (!this.a.canScrollHorizontally(1)) {
            return false;
        }
        ViewPager viewPager = this.a;
        viewPager.j(viewPager.c + 1);
        return true;
    }
}
