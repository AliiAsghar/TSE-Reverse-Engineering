package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abk<T> implements aaj<T> {
    private final int a;

    public abk() {
        this((byte[]) null);
    }

    @Override // defpackage.zr
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final acq a(acg acgVar) {
        return new acw(this.a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof abk) && ((abk) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public abk(int i) {
        this.a = i;
    }

    public /* synthetic */ abk(byte[] bArr) {
        this(0);
    }
}
