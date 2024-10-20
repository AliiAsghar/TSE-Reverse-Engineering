package defpackage;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cme extends clz {
    private final List b;
    private final long a = 9205357640488583168L;
    private final List c = null;

    public cme(List list) {
        this.b = list;
    }

    @Override // defpackage.clz
    public final Shader b(long j) {
        List list = this.b;
        long a = cju.a(j);
        cki.c(list);
        return new SweepGradient(Float.intBitsToFloat((int) (a >> 32)), Float.intBitsToFloat((int) (4294967295L & a)), cki.a(list), (float[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cme)) {
            return false;
        }
        cme cmeVar = (cme) obj;
        long j = cmeVar.a;
        if (!a.bB(9205357640488583168L, 9205357640488583168L) || !d.F(this.b, cmeVar.b)) {
            return false;
        }
        List list = cmeVar.c;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((a.A(9205357640488583168L) * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.b + ", stops=null)";
    }
}
