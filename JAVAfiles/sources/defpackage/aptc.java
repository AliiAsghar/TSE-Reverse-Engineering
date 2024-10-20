package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aptc {
    public final byte a;
    public final byte b;

    public aptc(int i) {
        this.a = (byte) (i & 224);
        this.b = (byte) (i & 31);
    }

    public final int a() {
        return (this.a >> 5) & 7;
    }
}
