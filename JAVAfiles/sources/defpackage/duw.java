package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class duw implements Cloneable {
    private final char[] a;
    protected long b = -1;
    protected long c = Long.MAX_VALUE;
    protected duv d;
    private int e;

    public duw(char[] cArr) {
        this.a = cArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duw)) {
            return false;
        }
        duw duwVar = (duw) obj;
        if (this.b != duwVar.b || this.c != duwVar.c) {
            return false;
        }
        int i = duwVar.e;
        if (!Arrays.equals(this.a, duwVar.a)) {
            return false;
        }
        return Objects.equals(this.d, duwVar.d);
    }

    @Override // 
    public duw g() {
        try {
            return (duw) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.a) * 31;
        long j = this.b;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        long j4 = j3 ^ (j3 >>> 32);
        duv duvVar = this.d;
        if (duvVar != null) {
            i = duvVar.hashCode();
        } else {
            i = 0;
        }
        return (((((hashCode + ((int) j2)) * 31) + ((int) j4)) * 31) + i) * 31;
    }

    public float t() {
        if (this instanceof duy) {
            return ((duy) this).t();
        }
        return Float.NaN;
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j <= j2 && j2 != Long.MAX_VALUE) {
            return w() + " (" + this.b + " : " + this.c + ") <<" + new String(this.a).substring((int) j, ((int) j2) + 1) + ">>";
        }
        return getClass() + " (INVALID, " + this.b + "-" + this.c + ")";
    }

    public int u() {
        if (this instanceof duy) {
            return ((duy) this).u();
        }
        return 0;
    }

    public final String v() {
        String str = new String(this.a);
        if (str.length() <= 0) {
            return "";
        }
        long j = this.c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        int i = (int) this.b;
        return str.substring(i, i + 1);
    }

    public final String w() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public final void x(long j) {
        if (this.c == Long.MAX_VALUE) {
            this.c = j;
            duv duvVar = this.d;
            if (duvVar != null) {
                duvVar.q(this);
            }
        }
    }

    public final boolean y() {
        char[] cArr = this.a;
        if (cArr != null && cArr.length > 0) {
            return true;
        }
        return false;
    }

    public final void z() {
        this.b = 0L;
    }
}
