package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alst extends albv implements Serializable, algy {
    public static final alst a = new alst(almn.a, alml.a);
    private static final long serialVersionUID = 0;
    public final almp b;
    public final almp c;

    public alst(almp almpVar, almp almpVar2) {
        this.b = almpVar;
        this.c = almpVar2;
        if (almpVar.compareTo(almpVar2) <= 0 && almpVar != alml.a && almpVar2 != almn.a) {
        } else {
            throw new IllegalArgumentException("Invalid range: ".concat(j(almpVar, almpVar2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static alst d(Comparable comparable, Comparable comparable2) {
        return new alst(new almo(comparable), new almm(comparable2));
    }

    public static alst e(Comparable comparable, Comparable comparable2) {
        return new alst(new almo(comparable), new almo(comparable2));
    }

    private static String j(almp almpVar, almp almpVar2) {
        StringBuilder sb = new StringBuilder(16);
        almpVar.c(sb);
        sb.append("..");
        almpVar2.d(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alst) {
            alst alstVar = (alst) obj;
            if (this.b.equals(alstVar.b) && this.c.equals(alstVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final alst f(alst alstVar) {
        almp almpVar;
        almp almpVar2;
        boolean z;
        int compareTo = this.b.compareTo(alstVar.b);
        int compareTo2 = this.c.compareTo(alstVar.c);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return alstVar;
        }
        if (compareTo >= 0) {
            almpVar = this.b;
        } else {
            almpVar = alstVar.b;
        }
        if (compareTo2 <= 0) {
            almpVar2 = this.c;
        } else {
            almpVar2 = alstVar.c;
        }
        if (almpVar.compareTo(almpVar2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.Q(z, "intersection is undefined for disconnected ranges %s and %s", this, alstVar);
        return new alst(almpVar, almpVar2);
    }

    @Override // defpackage.algy
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean a(Comparable comparable) {
        comparable.getClass();
        if (this.b.e(comparable) && !this.c.e(comparable)) {
            return true;
        }
        return false;
    }

    public final boolean h(alst alstVar) {
        if (this.b.compareTo(alstVar.c) <= 0 && alstVar.b.compareTo(this.c) <= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final boolean i() {
        return this.b.equals(this.c);
    }

    Object readResolve() {
        alst alstVar = a;
        if (equals(alstVar)) {
            return alstVar;
        }
        return this;
    }

    public final String toString() {
        return j(this.b, this.c);
    }
}
