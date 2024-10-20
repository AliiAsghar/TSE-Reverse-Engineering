package defpackage;

import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeer extends adcx implements Closeable {
    public final List a;
    public final arqr b;
    private final Closeable c;

    public aeer(List list, arqr arqrVar, Closeable closeable) {
        super(null, null);
        this.a = list;
        this.b = arqrVar;
        this.c = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeer)) {
            return false;
        }
        aeer aeerVar = (aeer) obj;
        if (d.F(this.a, aeerVar.a) && d.F(this.b, aeerVar.b) && d.F(this.c, aeerVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        arqr arqrVar = this.b;
        if (arqrVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqrVar.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }
}
