package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oo {
    private static final List s = Collections.emptyList();
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    int g;
    public oo h;
    public oo i;
    int j;
    List k;
    List l;
    od m;
    boolean n;
    public int o;
    public int p;
    RecyclerView q;
    no r;
    private int t;

    public oo(View view) {
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.t = 0;
        this.m = null;
        this.n = false;
        this.o = 0;
        this.p = -1;
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final boolean A() {
        if ((this.j & 128) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B() {
        if ((this.j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final FrameLayout C() {
        return (FrameLayout) this.a;
    }

    public final int a() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.fU(this);
    }

    public final int b() {
        RecyclerView recyclerView;
        no noVar;
        int fU;
        if (this.r == null || (recyclerView = this.q) == null || (noVar = recyclerView.l) == null || (fU = recyclerView.fU(this)) == -1) {
            return -1;
        }
        return noVar.gL(this.r, this, fU);
    }

    public final void e(Object obj) {
        if (obj == null) {
            f(1024);
            return;
        }
        if ((1024 & this.j) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = DesugarCollections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void f(int i) {
        this.j = i | this.j;
    }

    public final void g() {
        this.d = -1;
        this.g = -1;
    }

    public final int ge() {
        int i = this.g;
        if (i == -1) {
            return this.c;
        }
        return i;
    }

    public final List gf() {
        List list;
        if ((this.j & 1024) == 0 && (list = this.k) != null && list.size() != 0) {
            return this.l;
        }
        return s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.j &= -33;
    }

    public final void j() {
        this.j &= -257;
    }

    public final void k(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        if (this.a.getLayoutParams() != null) {
            ((nx) this.a.getLayoutParams()).e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        int i = RecyclerView.aa;
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.t = 0;
        this.h = null;
        this.i = null;
        h();
        this.o = 0;
        this.p = -1;
        RecyclerView.y(this);
    }

    public final void m(int i, int i2) {
        this.j = (i & i2) | (this.j & (~i2));
    }

    public final void n(boolean z) {
        int i;
        int i2;
        if (z) {
            i = this.t - 1;
        } else {
            i = this.t + 1;
        }
        this.t = i;
        if (i < 0) {
            this.t = 0;
            int i3 = RecyclerView.aa;
            toString();
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else {
            if (!z && i == 1) {
                i2 = this.j | 16;
            } else if (z && i == 0) {
                i2 = this.j & (-17);
            }
            this.j = i2;
        }
        int i4 = RecyclerView.aa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(od odVar, boolean z) {
        this.m = odVar;
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        this.m.o(this);
    }

    public final boolean q(int i) {
        if ((i & this.j) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        if (this.a.getParent() != null && this.a.getParent() != this.q) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if ((this.j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (w()) {
            sb.append(" scrap ");
            if (true != this.n) {
                str = "[attachedScrap]";
            } else {
                str = "[changeScrap]";
            }
            sb.append(str);
        }
        if (t()) {
            sb.append(" invalid");
        }
        if (!s()) {
            sb.append(" unbound");
        }
        if (z()) {
            sb.append(" update");
        }
        if (v()) {
            sb.append(" removed");
        }
        if (A()) {
            sb.append(" ignored");
        }
        if (x()) {
            sb.append(" tmpDetached");
        }
        if (!u()) {
            sb.append(" not recyclable(" + this.t + ")");
        }
        if ((this.j & 512) != 0 || t()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        if ((this.j & 16) == 0) {
            View view = this.a;
            int[] iArr = eek.a;
            if (!view.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean v() {
        if ((this.j & 8) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        if (this.m != null) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if ((this.j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if ((this.j & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z() {
        if ((this.j & 2) != 0) {
            return true;
        }
        return false;
    }

    public oo(View view, byte[] bArr) {
        this(view);
    }
}
