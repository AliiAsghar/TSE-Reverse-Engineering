package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import j$.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajwr {
    public final int a;
    final SparseArray b = new SparseArray();
    final List c = new ArrayList();
    final /* synthetic */ SpannedGridLayoutManager d;
    private final int[] e;
    private final od f;

    public ajwr(SpannedGridLayoutManager spannedGridLayoutManager, od odVar, int i) {
        this.d = spannedGridLayoutManager;
        this.e = new int[spannedGridLayoutManager.n.a];
        this.f = odVar;
        this.a = i;
    }

    private final void g(int i, int i2) {
        if (this.c.size() < i + 1) {
            this.c.add(Integer.valueOf(i2));
        }
    }

    private final void h() {
        ajws ajwsVar;
        int size = this.c.size();
        int size2 = this.b.size();
        g(size, size2);
        int i = size2;
        int i2 = 0;
        while (i < this.a) {
            int a = this.f.a(i);
            if (a != -1) {
                ajwsVar = (ajws) Map.EL.getOrDefault(this.d.m.e, Integer.valueOf(a), new ajws(2, 1));
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 < this.d.at()) {
                        View aF = this.d.aF(i3);
                        if (i == SpannedGridLayoutManager.bt(aF)) {
                            ajwp ajwpVar = (ajwp) aF.getLayoutParams();
                            ajwsVar = new ajws(ajwpVar.a, ajwpVar.b);
                            break;
                        }
                        i3++;
                    } else {
                        ajwsVar = ajws.a;
                        break;
                    }
                }
            }
            SpannedGridLayoutManager spannedGridLayoutManager = this.d;
            int i4 = ajwsVar.b;
            int i5 = spannedGridLayoutManager.n.a;
            if (i4 > i5) {
                ajwsVar.b = i5;
                i4 = i5;
            }
            if (i4 + i2 > i5) {
                size++;
                g(size, size2);
                i2 = 0;
            }
            while (this.e[i2] > size) {
                i2++;
                if (ajwsVar.b + i2 > this.d.n.a) {
                    size++;
                    g(size, size2);
                    i2 = 0;
                }
            }
            this.b.put(i, new ajwo(size, ajwsVar.c, i2, ajwsVar.b));
            int i6 = ajwsVar.c + size;
            for (int i7 = 0; i7 < ajwsVar.b; i7++) {
                this.e[i2 + i7] = i6;
            }
            if (ajwsVar.c > 1) {
                for (int i8 = 1; i8 < ajwsVar.c; i8++) {
                    g(size + i8, size2);
                }
            }
            i2 += ajwsVar.b;
            i++;
            int i9 = this.e[0];
            for (int i10 = 1; i10 < this.d.n.a; i10++) {
                if (i9 != this.e[i10]) {
                    break;
                }
            }
            return;
        }
    }

    private final void i(int i) {
        while (i >= this.c.size()) {
            SparseArray sparseArray = this.b;
            if (sparseArray.size() < this.a) {
                h();
            } else {
                return;
            }
        }
    }

    public final int a(int i) {
        if (i >= this.c.size()) {
            i(i);
        }
        if (this.c.isEmpty()) {
            return 0;
        }
        return ((Integer) this.c.get(i)).intValue();
    }

    public final int b(int i) {
        int i2;
        int c = c(i);
        if (f(c)) {
            i2 = a(c);
        } else {
            i2 = this.a;
        }
        return i2 - 1;
    }

    public final int c(int i) {
        int i2 = i + 1;
        int a = a(i);
        while (f(i2) && a(i2) == a) {
            i2++;
        }
        return i2;
    }

    public final int d(int i) {
        if (i < this.a) {
            return e(i).a;
        }
        return -1;
    }

    public final ajwo e(int i) {
        if (i < this.a) {
            if (i >= this.b.size()) {
                while (i >= this.b.size()) {
                    h();
                }
            }
            return (ajwo) this.b.get(i);
        }
        throw new IndexOutOfBoundsException(String.format(Locale.US, "index: %d out of range.", Integer.valueOf(i)));
    }

    public final boolean f(int i) {
        if (i >= this.c.size()) {
            i(i);
        }
        if (i >= 0 && i < this.c.size()) {
            return true;
        }
        return false;
    }
}
