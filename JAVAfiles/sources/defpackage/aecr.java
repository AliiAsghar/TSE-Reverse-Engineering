package defpackage;

import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aecr extends adcx implements Closeable {
    public final List a;
    public final arqr b;
    public final List c;
    public final Closeable d;
    public final aozb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aecr(List list, arqr arqrVar, List list2, Closeable closeable, aozb aozbVar) {
        super(null, null);
        list2.getClass();
        this.a = list;
        this.b = arqrVar;
        this.c = list2;
        this.d = closeable;
        this.e = aozbVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aecr)) {
            return false;
        }
        aecr aecrVar = (aecr) obj;
        if (d.F(this.a, aecrVar.a) && d.F(this.b, aecrVar.b) && d.F(this.c, aecrVar.c) && d.F(this.d, aecrVar.d) && d.F(this.e, aecrVar.e)) {
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
        return ((((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }
}
