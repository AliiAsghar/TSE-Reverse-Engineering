package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdq {
    public final boolean a;
    public final arqg b;
    public final ViewGroup c;
    public final Consumer d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public afzr k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    private final arqg o;
    private final boolean p;

    public agdq(boolean z, arqg arqgVar, ViewGroup viewGroup, Consumer consumer, int i, boolean z2, boolean z3, boolean z4, boolean z5, afzr afzrVar, boolean z6, boolean z7) {
        this.a = z;
        this.o = null;
        this.b = arqgVar;
        this.c = viewGroup;
        this.d = consumer;
        this.e = i;
        this.f = z2;
        this.p = false;
        this.g = z3;
        this.h = z4;
        this.i = false;
        this.j = z5;
        this.k = afzrVar;
        this.l = false;
        this.m = z6;
        this.n = z7;
    }

    public final int a() {
        return ((Number) this.b.a()).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdq)) {
            return false;
        }
        agdq agdqVar = (agdq) obj;
        if (this.a != agdqVar.a) {
            return false;
        }
        arqg arqgVar = agdqVar.o;
        if (!d.F(null, null) || !d.F(this.b, agdqVar.b) || !d.F(this.c, agdqVar.c) || !d.F(this.d, agdqVar.d) || this.e != agdqVar.e || this.f != agdqVar.f) {
            return false;
        }
        boolean z = agdqVar.p;
        if (this.g != agdqVar.g || this.h != agdqVar.h) {
            return false;
        }
        boolean z2 = agdqVar.i;
        if (this.j != agdqVar.j || !d.F(this.k, agdqVar.k)) {
            return false;
        }
        boolean z3 = agdqVar.l;
        if (this.m == agdqVar.m && this.n == agdqVar.n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int v = (((((a.v(this.a) * 961) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        afzr afzrVar = this.k;
        if (afzrVar == null) {
            hashCode = 0;
        } else {
            hashCode = afzrVar.hashCode();
        }
        boolean z = this.j;
        boolean z2 = this.h;
        boolean z3 = this.g;
        boolean z4 = this.f;
        return (((((((((((((((((((((v * 31) + this.e) * 31) + a.v(z4)) * 31) + a.v(false)) * 31) + a.v(z3)) * 31) + a.v(z2)) * 31) + a.v(false)) * 31) + a.v(z)) * 31) + hashCode) * 31) + a.v(false)) * 31) + a.v(this.m)) * 31) + a.v(this.n);
    }

    public final String toString() {
        return "RenderingStrategy(inSeparateWindow=" + this.a + ", minHeightProvider=null, maxHeightProvider=" + this.b + ", anchor=" + this.c + ", heightListener=" + this.d + ", elevationOnScrollPx=" + this.e + ", commitFragmentTransactionsImmediately=" + this.f + ", neverAllowStateLoss=false, ignoreComposeLayoutWithoutVisibleHeight=" + this.g + ", reattachRendererContainerOnRecreate=" + this.h + ", overrideScreenConfigurationOnScreenOpen=false, reopenOpenScreenOnRestore=" + this.j + ", colors=" + this.k + ", closeKeyboardAndInputOnClose=false, checkIfProxyActiveScreenHasChanged=" + this.m + ", detachScreensOnRestore=" + this.n + ")";
    }

    public /* synthetic */ agdq(arqg arqgVar, ViewGroup viewGroup, Consumer consumer, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2) {
        this(1 == (i2 & 1), arqgVar, viewGroup, consumer, (i2 & 32) != 0 ? viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.renderer_elevation_default_value) : i, (!((i2 & 64) == 0)) | z, ((i2 & 256) == 0) & z2, (!((i2 & 512) == 0)) | z3, (!((i2 & 2048) == 0)) | z4, null, ((i2 & 16384) == 0) & z5, ((i2 & 32768) == 0) & z6);
    }
}
