package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosk {
    public final byte[] a;

    public aosk() {
        throw null;
    }

    public final String toString() {
        int length = this.a.length;
        StringBuilder sb = new StringBuilder(a.cq(length, " :: [ "));
        aosj aosjVar = new aosj(this);
        while (length > 0) {
            sb.append(Integer.toHexString(aosjVar.b()));
            sb.append(", ");
            length--;
        }
        sb.setLength(sb.length() - 2);
        sb.append(" ]");
        return sb.toString();
    }

    public aosk(byte[] bArr) {
        this.a = bArr;
    }
}
