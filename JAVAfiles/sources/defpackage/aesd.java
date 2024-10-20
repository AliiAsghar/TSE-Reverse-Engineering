package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesd implements aesf {
    private final arqg a;

    public aesd() {
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
        if ((obj instanceof aesd) && d.F(this.a, ((aesd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(onClick=" + this.a + ")";
    }

    public /* synthetic */ aesd(byte[] bArr) {
        this.a = aepz.l;
    }
}
