package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class abqi extends abqg {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public abqi(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.abqg
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = a();
                this.b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
