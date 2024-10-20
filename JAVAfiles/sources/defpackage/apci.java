package defpackage;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apci extends aozb {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d;
    public final aozb e;
    public final aozb f;
    public final int g;
    private final int h;

    public apci(aozb aozbVar, aozb aozbVar2) {
        this.e = aozbVar;
        this.f = aozbVar2;
        int d = aozbVar.d();
        this.h = d;
        this.d = d + aozbVar2.d();
        this.g = Math.max(aozbVar.f(), aozbVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static aozb g(aozb aozbVar, aozb aozbVar2) {
        int d = aozbVar.d();
        int d2 = aozbVar2.d();
        byte[] bArr = new byte[d + d2];
        aozbVar.F(bArr, 0, 0, d);
        aozbVar2.F(bArr, 0, d, d2);
        return new aoyz(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.aozb
    public final byte a(int i) {
        E(i, this.d);
        return b(i);
    }

    @Override // defpackage.aozb
    public final byte b(int i) {
        int i2 = this.h;
        if (i < i2) {
            return this.e.b(i);
        }
        return this.f.b(i - i2);
    }

    @Override // defpackage.aozb
    public final int d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aozb
    public final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            this.e.e(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f.e(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.e.e(bArr, i, i2, i6);
            this.f.e(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.aozb
    public final boolean equals(Object obj) {
        boolean g;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aozb)) {
            return false;
        }
        aozb aozbVar = (aozb) obj;
        if (this.d != aozbVar.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        int i = this.c;
        int i2 = aozbVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        apcg apcgVar = new apcg(this);
        aoyy next = apcgVar.next();
        apcg apcgVar2 = new apcg(aozbVar);
        aoyy next2 = apcgVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int d = next.d() - i3;
            int d2 = next2.d() - i4;
            int min = Math.min(d, d2);
            if (i3 == 0) {
                g = next.g(next2, i4, min);
            } else {
                g = next2.g(next, i3, min);
            }
            if (!g) {
                return false;
            }
            i5 += min;
            int i6 = this.d;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == d) {
                i3 = 0;
                next = apcgVar.next();
            } else {
                i3 += min;
                next = next;
            }
            if (min == d2) {
                next2 = apcgVar2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aozb
    public final int f() {
        return this.g;
    }

    @Override // defpackage.aozb
    public final boolean h() {
        if (this.d >= c(this.g)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aozb
    public final int i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.i(this.e.i(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.aozb, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new apcf(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aozb
    public final int j(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            return this.e.j(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.j(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.j(this.e.j(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.aozb
    public final aozb k(int i, int i2) {
        int s = s(i, i2, this.d);
        if (s == 0) {
            return aozb.b;
        }
        if (s == this.d) {
            return this;
        }
        int i3 = this.h;
        if (i2 <= i3) {
            return this.e.k(i, i2);
        }
        int i4 = i2 - i3;
        if (i >= i3) {
            return this.f.k(i - i3, i4);
        }
        return new apci(this.e.B(i), this.f.k(0, i4));
    }

    @Override // defpackage.aozb
    public final aozg l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        apcg apcgVar = new apcg(this);
        while (apcgVar.hasNext()) {
            arrayList.add(apcgVar.next().o());
        }
        int i = aozg.e;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i2 |= 1;
            } else if (byteBuffer.isDirect()) {
                i2 |= 2;
            } else {
                i2 |= 4;
            }
        }
        if (i2 == 2) {
            return new aozd(arrayList, i3);
        }
        return aozg.J(new apbb(arrayList));
    }

    @Override // defpackage.aozb
    public final InputStream m() {
        return new apch(this);
    }

    @Override // defpackage.aozb
    protected final String n(Charset charset) {
        return new String(H(), charset);
    }

    @Override // defpackage.aozb
    public final ByteBuffer o() {
        return ByteBuffer.wrap(H()).asReadOnlyBuffer();
    }

    @Override // defpackage.aozb
    public final void p(aoyt aoytVar) {
        this.e.p(aoytVar);
        this.f.p(aoytVar);
    }

    @Override // defpackage.aozb
    public final void q(OutputStream outputStream) {
        throw null;
    }

    @Override // defpackage.aozb
    public final boolean r() {
        aozb aozbVar = this.e;
        aozb aozbVar2 = this.f;
        if (aozbVar2.j(aozbVar.j(0, 0, this.h), 0, aozbVar2.d()) != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.aozb
    /* renamed from: t */
    public final aoyx iterator() {
        return new apcf(this);
    }

    Object writeReplace() {
        return new aoyz(H());
    }
}
