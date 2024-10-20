package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egr implements ecx {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public egr(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.ecx
    public final float a() {
        float a;
        if (this.b != 0) {
            if (((RecyclerView) this.a).m.ah()) {
                return -((RecyclerView) this.a).I;
            }
            if (!((RecyclerView) this.a).m.ag()) {
                return brg.a;
            }
            a = ((RecyclerView) this.a).H;
        } else {
            a = ((NestedScrollView) this.a).a();
        }
        return -a;
    }

    @Override // defpackage.ecx
    public final void b() {
        if (this.b != 0) {
            ((RecyclerView) this.a).as();
        } else {
            ((NestedScrollView) this.a).a.abortAnimation();
        }
    }

    @Override // defpackage.ecx
    public final boolean c(float f) {
        int i;
        int i2;
        if (this.b != 0) {
            if (((RecyclerView) this.a).m.ah()) {
                i2 = (int) f;
                i = 0;
            } else if (((RecyclerView) this.a).m.ag()) {
                i = (int) f;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0) {
                if (i2 == 0) {
                    return false;
                }
                i = 0;
            }
            ((RecyclerView) this.a).as();
            return ((RecyclerView) this.a).aw(i, i2, 0, Integer.MAX_VALUE);
        }
        if (f == brg.a) {
            return false;
        }
        b();
        ((NestedScrollView) this.a).d((int) f);
        return true;
    }
}
