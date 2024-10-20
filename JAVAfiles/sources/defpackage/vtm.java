package defpackage;

import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtm {
    public final long a;

    public vtm(long j) {
        this.a = j;
    }

    public static vtm b() {
        return new vtk(0L).a();
    }

    public final vtk a() {
        return new vtk(this.a);
    }

    public final alog c() {
        Stream filter = DesugarArrays.stream(vtl.values()).filter(new uhe(this, 15));
        int i = alog.d;
        return (alog) filter.collect(alls.a);
    }

    public final boolean d(vtl vtlVar) {
        if ((this.a & vtlVar.e) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtm) || this.a != ((vtm) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a));
    }
}
