package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzz implements mjb {
    public final int a;

    public mzz() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        mjb mjbVar = (mjb) obj;
        if (mjbVar instanceof mzz) {
            return Integer.compare(this.a, ((mzz) mjbVar).a);
        }
        throw new InvalidParameterException("wrong PagingKey type, expected PositionalPagingKey");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof mzz) && this.a == ((mzz) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "OffsetPagingKey{offset=" + this.a + "}";
    }

    public mzz(int i) {
        this.a = i;
    }
}
