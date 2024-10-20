package defpackage;

import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aedb extends adcx implements Closeable {
    public final List a;
    public final List b;
    public final aozb c;
    public final aeeq d;
    private final Closeable e;

    public aedb() {
        this(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (aeac aeacVar : this.a) {
        }
        Closeable closeable = this.e;
        if (closeable != null) {
            closeable.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aedb)) {
            return false;
        }
        aedb aedbVar = (aedb) obj;
        if (d.F(this.a, aedbVar.a) && d.F(this.d, aedbVar.d) && d.F(this.b, aedbVar.b) && d.F(this.e, aedbVar.e) && d.F(this.c, aedbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aeeq aeeqVar = this.d;
        int i = 0;
        if (aeeqVar == null) {
            hashCode = 0;
        } else {
            hashCode = aeeqVar.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.b.hashCode()) * 31;
        Closeable closeable = this.e;
        if (closeable != null) {
            i = closeable.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.c.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aedb(List list, aeeq aeeqVar, List list2, Closeable closeable, aozb aozbVar) {
        super(null, null);
        aozbVar.getClass();
        this.a = list;
        this.d = aeeqVar;
        this.b = list2;
        this.e = closeable;
        this.c = aozbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ aedb(byte[] r7) {
        /*
            r6 = this;
            arnv r3 = defpackage.arnv.a
            r4 = 0
            aozb r5 = defpackage.aozb.b
            r2 = 0
            r0 = r6
            r1 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedb.<init>(byte[]):void");
    }
}
