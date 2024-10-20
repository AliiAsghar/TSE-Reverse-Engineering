package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoyw extends aoyz {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    public aoyw(byte[] bArr, int i, int i2) {
        super(bArr);
        s(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.aoyz, defpackage.aozb
    public final byte a(int i) {
        E(i, this.e);
        return this.a[this.d + i];
    }

    @Override // defpackage.aoyz, defpackage.aozb
    public final byte b(int i) {
        return this.a[this.d + i];
    }

    @Override // defpackage.aoyz
    protected final int c() {
        return this.d;
    }

    @Override // defpackage.aoyz, defpackage.aozb
    public final int d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoyz, defpackage.aozb
    public final void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.d + i, bArr, i2, i3);
    }

    Object writeReplace() {
        return new aoyz(H());
    }
}
