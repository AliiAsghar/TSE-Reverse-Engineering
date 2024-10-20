package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class armw implements Comparable<armw> {
    public final long a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(armw armwVar) {
        return d.x(Long.MIN_VALUE ^ this.a, armwVar.a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof armw) && this.a == ((armw) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j >= 0) {
            arro.i(10);
            String l = Long.toString(j, 10);
            l.getClass();
            return l;
        }
        long j2 = (j >>> 1) / 10;
        long j3 = j2 + j2;
        long j4 = j - (j3 * 10);
        if (j4 >= 10) {
            j4 -= 10;
            j3++;
        }
        arro.i(10);
        String l2 = Long.toString(j3, 10);
        l2.getClass();
        arro.i(10);
        String l3 = Long.toString(j4, 10);
        l3.getClass();
        return l2.concat(l3);
    }
}
