package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class artc implements Iterable, arse {
    public final long a;
    public final long b;
    private final long c = 1;

    public artc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean a() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof artc)) {
            return false;
        }
        if (a() && ((artc) obj).a()) {
            return true;
        }
        artc artcVar = (artc) obj;
        if (this.a != artcVar.a || this.b != artcVar.b) {
            return false;
        }
        long j = artcVar.c;
        return true;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        long j = this.a;
        long j2 = this.b;
        return (int) (((((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31) + 1);
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new aroc(this.a, this.b);
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
