package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzx {
    public final List a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;

    public fzx(List list, Object obj, Object obj2, int i, int i2) {
        this.a = list;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = i2;
        if (i < 0 && i != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Position must be non-negative");
        }
        if (list.isEmpty() && (i > 0 || i2 > 0)) {
            throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
        }
        if (i2 < 0 && i2 != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fzx) {
            fzx fzxVar = (fzx) obj;
            if (d.F(this.a, fzxVar.a) && d.F(this.b, fzxVar.b) && d.F(this.c, fzxVar.c) && this.d == fzxVar.d && this.e == fzxVar.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public /* synthetic */ fzx(List list, Object obj, Object obj2) {
        this(list, obj, obj2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
