package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aozb implements Iterable<Byte>, Serializable {
    public static final aozb b = new aoyz(apay.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    public static aozb A(InputStream inputStream) {
        aozb y;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                y = null;
            } else {
                y = y(bArr, 0, i2);
            }
            if (y == null) {
                return v(arrayList);
            }
            arrayList.add(y);
            i = Math.min(i + i, 8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(a.bV(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a.bU(i2, i, "Index > length: ", ", "));
        }
    }

    private static aozb c(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (aozb) it.next();
            }
            int i2 = i >>> 1;
            return c(it, i2).u(c(it, i - i2));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static int s(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(a.bU(i2, i, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(a.bU(i3, i2, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(a.cb(i, "Beginning index: ", " < 0"));
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static aozb v(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return b;
        }
        return c(iterable.iterator(), size);
    }

    public static aozb w(byte[] bArr) {
        return y(bArr, 0, bArr.length);
    }

    public static aozb x(String str, Charset charset) {
        return new aoyz(str.getBytes(charset));
    }

    public static aozb y(byte[] bArr, int i, int i2) {
        s(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new aoyz(bArr2);
    }

    public static aozb z(String str) {
        return new aoyz(str.getBytes(apay.a));
    }

    public final aozb B(int i) {
        return k(i, d());
    }

    public final String C(Charset charset) {
        if (d() == 0) {
            return "";
        }
        return n(charset);
    }

    public final String D() {
        return C(apay.a);
    }

    @Deprecated
    public final void F(byte[] bArr, int i, int i2, int i3) {
        s(i, i + i3, d());
        s(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            e(bArr, i, i2, i3);
        }
    }

    public final boolean G() {
        if (d() == 0) {
            return true;
        }
        return false;
    }

    public final byte[] H() {
        int d = d();
        if (d == 0) {
            return apay.b;
        }
        byte[] bArr = new byte[d];
        e(bArr, 0, 0, d);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int d = d();
            i = i(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int i(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int j(int i, int i2, int i3);

    public abstract aozb k(int i, int i2);

    public abstract aozg l();

    public abstract InputStream m();

    protected abstract String n(Charset charset);

    public abstract ByteBuffer o();

    public abstract void p(aoyt aoytVar);

    public abstract void q(OutputStream outputStream);

    public abstract boolean r();

    @Override // java.lang.Iterable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public aoyx iterator() {
        return new aoyu(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(d());
        if (d() <= 50) {
            concat = aovp.k(this);
        } else {
            concat = aovp.k(k(0, 47)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, concat);
    }

    public final aozb u(aozb aozbVar) {
        apci apciVar;
        if (Integer.MAX_VALUE - d() >= aozbVar.d()) {
            int[] iArr = apci.a;
            if (aozbVar.d() != 0) {
                if (d() != 0) {
                    int d = d() + aozbVar.d();
                    if (d < 128) {
                        return apci.g(this, aozbVar);
                    }
                    if (this instanceof apci) {
                        apci apciVar2 = (apci) this;
                        if (apciVar2.f.d() + aozbVar.d() < 128) {
                            apciVar = new apci(apciVar2.e, apci.g(apciVar2.f, aozbVar));
                            return apciVar;
                        }
                        if (apciVar2.e.f() > apciVar2.f.f() && apciVar2.g > aozbVar.f()) {
                            return new apci(apciVar2.e, new apci(apciVar2.f, aozbVar));
                        }
                    }
                    if (d >= apci.c(Math.max(f(), aozbVar.f()) + 1)) {
                        apciVar = new apci(this, aozbVar);
                        return apciVar;
                    }
                    ArrayDeque arrayDeque = new ArrayDeque();
                    aovn.f(this, arrayDeque);
                    aovn.f(aozbVar, arrayDeque);
                    aozb aozbVar2 = (aozb) arrayDeque.pop();
                    while (!arrayDeque.isEmpty()) {
                        aozbVar2 = new apci((aozb) arrayDeque.pop(), aozbVar2);
                    }
                    return aozbVar2;
                }
                return aozbVar;
            }
            return this;
        }
        throw new IllegalArgumentException("ByteString would be too long: " + d() + "+" + aozbVar.d());
    }
}
