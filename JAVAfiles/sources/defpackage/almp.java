package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class almp implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public almp(Comparable comparable) {
        this.b = comparable;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(almp almpVar) {
        if (almpVar != almn.a) {
            if (almpVar == alml.a) {
                return -1;
            }
            int c = alst.c(this.b, almpVar.b);
            if (c != 0) {
                return c;
            }
            return Boolean.compare(this instanceof almm, almpVar instanceof almm);
        }
        return 1;
    }

    public Comparable b() {
        return this.b;
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof almp) {
            try {
                if (compareTo((almp) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
