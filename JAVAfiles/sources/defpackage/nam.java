package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nam implements mjb {
    public final mjb a;
    public final long b;

    public nam(mjb mjbVar, long j) {
        this.a = mjbVar;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        mjb mjbVar = (mjb) obj;
        mjbVar.getClass();
        if (mjbVar instanceof nam) {
            return this.a.compareTo(((nam) mjbVar).a);
        }
        throw new InvalidParameterException("wrong PagingKey type, excepted a VersionedPagingKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nam)) {
            return false;
        }
        nam namVar = (nam) obj;
        if (d.F(this.a, namVar.a) && this.b == namVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.A(this.b);
    }

    public final String toString() {
        return "VersionedPagingKey(innerKey=" + this.a + ", version=" + this.b + ")";
    }
}
