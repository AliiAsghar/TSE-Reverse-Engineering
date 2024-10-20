package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvn {
    public final Object a;
    public final int b;
    public int c;

    public rvn(Object obj, int i) {
        this.c = 1;
        this.a = obj;
        this.b = i;
    }

    public rvn(int i) {
        this(null, 2);
        this.c = i;
    }

    public rvn() {
        this(null, 1);
    }

    public rvn(byte[] bArr) {
        this(null, 1);
        this.c = 2;
    }
}
