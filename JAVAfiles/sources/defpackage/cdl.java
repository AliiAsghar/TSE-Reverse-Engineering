package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdl {
    public int a;

    public cdl() {
        this((char[]) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int hashCode = hashCode();
        arro.i(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        return sb.toString();
    }

    public cdl(byte[] bArr) {
        this.a = 0;
    }

    public /* synthetic */ cdl(char[] cArr) {
        this((byte[]) null);
    }
}
