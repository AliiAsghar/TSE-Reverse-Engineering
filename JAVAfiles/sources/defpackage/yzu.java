package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzu implements yzs {
    private final String a;
    private final arqg b;
    private final arml c;

    public yzu(String str, arqg arqgVar) {
        str.getClass();
        this.a = str;
        this.b = arqgVar;
        this.c = armd.b(3, arqgVar);
    }

    @Override // defpackage.yzs
    public final yzt a() {
        return (yzt) this.c.a();
    }

    @Override // defpackage.yzs
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzu)) {
            return false;
        }
        yzu yzuVar = (yzu) obj;
        if (d.F(this.a, yzuVar.a) && d.F(this.b, yzuVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazyContactUiData(id=" + this.a + ", initializer=" + this.b + ")";
    }
}
