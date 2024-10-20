package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesa implements aesf {
    private final arqg a;

    public aesa() {
        this(null);
    }

    @Override // defpackage.aeze
    public final arqg a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aesa) && d.F(this.a, ((aesa) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(onClick=" + this.a + ")";
    }

    public /* synthetic */ aesa(byte[] bArr) {
        this.a = aepz.k;
    }
}
