package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkj implements Comparable {
    public final int a;

    public mkj() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        mkj mkjVar = (mkj) obj;
        if (mkjVar instanceof mkj) {
            return Integer.compare(this.a, mkjVar.a);
        }
        throw new InvalidParameterException("wrong PagingKey type, expected an OffsetPagingKey");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof mkj) && this.a == ((mkj) obj).a) {
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

    public mkj(int i) {
        this.a = i;
    }
}
