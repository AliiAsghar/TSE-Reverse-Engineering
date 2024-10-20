package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aoyz extends aoyy {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public aoyz(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.aozb
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.aozb
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.aozb
    public int d() {
        return this.a.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aozb
    public void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.aozb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aozb) || d() != ((aozb) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (obj instanceof aoyz) {
            aoyz aoyzVar = (aoyz) obj;
            int i = this.c;
            int i2 = aoyzVar.c;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return g(aoyzVar, 0, d());
        }
        return obj.equals(this);
    }

    @Override // defpackage.aoyy
    public final boolean g(aozb aozbVar, int i, int i2) {
        if (i2 <= aozbVar.d()) {
            int i3 = i + i2;
            if (i3 <= aozbVar.d()) {
                if (aozbVar instanceof aoyz) {
                    aoyz aoyzVar = (aoyz) aozbVar;
                    byte[] bArr = this.a;
                    byte[] bArr2 = aoyzVar.a;
                    int c = c() + i2;
                    int c2 = c();
                    int c3 = aoyzVar.c() + i;
                    while (c2 < c) {
                        if (bArr[c2] != bArr2[c3]) {
                            return false;
                        }
                        c2++;
                        c3++;
                    }
                    return true;
                }
                return aozbVar.k(i, i3).equals(k(0, i2));
            }
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + aozbVar.d());
        }
        throw new IllegalArgumentException("Length too large: " + i2 + d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aozb
    public final int i(int i, int i2, int i3) {
        return apay.a(i, this.a, c() + i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aozb
    public final int j(int i, int i2, int i3) {
        int c = c() + i2;
        int i4 = apdd.a;
        return aowt.l(i, this.a, c, i3 + c);
    }

    @Override // defpackage.aozb
    public final aozb k(int i, int i2) {
        int s = s(i, i2, d());
        if (s == 0) {
            return aozb.b;
        }
        return new aoyw(this.a, c() + i, s);
    }

    @Override // defpackage.aozb
    public final aozg l() {
        return aozg.P(this.a, c(), d());
    }

    @Override // defpackage.aozb
    public final InputStream m() {
        return new ByteArrayInputStream(this.a, c(), d());
    }

    @Override // defpackage.aozb
    protected final String n(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.aozb
    public final ByteBuffer o() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.aozb
    public final void p(aoyt aoytVar) {
        aoytVar.a(this.a, c(), d());
    }

    @Override // defpackage.aozb
    public final void q(OutputStream outputStream) {
        outputStream.write(H());
    }

    @Override // defpackage.aozb
    public final boolean r() {
        int c = c();
        return apdd.g(this.a, c, d() + c);
    }
}
