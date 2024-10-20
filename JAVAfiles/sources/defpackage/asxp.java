package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asxp extends asxn {
    private static asxo c;
    private static asxo[] d;
    public asxq b;
    private final byte[] e;
    private final asxt f;
    private final asxl g;
    private final int h;
    private final byte[] i;
    private final Map j;
    private final int k;
    private final assy l;
    private final int m;

    static {
        asxo asxoVar = new asxo(1);
        c = asxoVar;
        asxo[] asxoVarArr = new asxo[129];
        d = asxoVarArr;
        asxoVarArr[1] = asxoVar;
        int i = 2;
        while (true) {
            asxo[] asxoVarArr2 = d;
            int length = asxoVarArr2.length;
            if (i < 129) {
                asxoVarArr2[i] = new asxo(i);
                i++;
            } else {
                return;
            }
        }
    }

    public asxp(asxt asxtVar, asxl asxlVar, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f = asxtVar;
        this.g = asxlVar;
        this.m = i;
        this.e = atow.O(bArr);
        this.h = i2;
        this.i = atow.O(bArr2);
        this.k = 1 << (asxtVar.w + 1);
        this.j = new WeakHashMap();
        int i3 = asxi.a;
        this.l = asxi.a(asxtVar.x, asxtVar.v);
    }

    public static asxp a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof asxp) {
            return (asxp) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                asxt a = asxt.a(dataInputStream2.readInt());
                asxl a2 = asxl.a(dataInputStream2.readInt());
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                int readInt = dataInputStream2.readInt();
                int readInt2 = dataInputStream2.readInt();
                int readInt3 = dataInputStream2.readInt();
                if (readInt3 >= 0) {
                    if (readInt3 <= dataInputStream2.available()) {
                        byte[] bArr2 = new byte[readInt3];
                        dataInputStream2.readFully(bArr2);
                        return new asxp(a, a2, readInt, bArr, readInt2, bArr2);
                    }
                    throw new IOException("secret length exceeded " + dataInputStream2.available());
                }
                throw new IllegalStateException("secret length less than zero");
            }
            throw new IllegalStateException("expected version 0 lms private key");
        }
        if (obj instanceof byte[]) {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                asxp a3 = a(dataInputStream);
                dataInputStream.close();
                return a3;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return a(atow.A((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
    }

    private final byte[] e(int i) {
        int i2 = 1 << this.f.w;
        if (i >= i2) {
            atow.aI(d(), this.l);
            atow.aK(i, this.l);
            atow.aJ((short) -32126, this.l);
            asxl asxlVar = this.g;
            byte[] d2 = d();
            byte[] O = atow.O(this.i);
            assy b = asxi.b(asxlVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            atow.aM(d2, byteArrayOutputStream);
            int i3 = i - i2;
            atow.aO(i3, byteArrayOutputStream);
            byteArrayOutputStream.write(-128);
            byteArrayOutputStream.write(-128);
            atow.aN(22, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            b.e(byteArray, 0, byteArray.length);
            assy b2 = asxi.b(asxlVar);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            atow.aM(d2, byteArrayOutputStream2);
            atow.aO(i3, byteArrayOutputStream2);
            atow.aN(b2.b() + 23, byteArrayOutputStream2);
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            assy b3 = asxi.b(asxlVar);
            int i4 = 1 << asxlVar.s;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = asxlVar.t;
                if (i5 < i7) {
                    int i8 = i7 - 1;
                    if (byteArray2.length - 23 >= b3.b()) {
                        b3.e(d2, 0, d2.length);
                        b3.d((byte) (i3 >> 24));
                        b3.d((byte) (i3 >>> 16));
                        b3.d((byte) (i3 >>> 8));
                        b3.d((byte) i3);
                        b3.d((byte) (i6 >>> 8));
                        b3.d((byte) i6);
                        b3.d((byte) -1);
                        b3.e(O, 0, O.length);
                        b3.a(byteArray2, 23);
                        if (i5 < i8) {
                            i6++;
                        }
                        short s = (short) i5;
                        byteArray2[20] = (byte) (s >>> 8);
                        byteArray2[21] = (byte) s;
                        for (int i9 = 0; i9 < i4 - 1; i9++) {
                            byteArray2[22] = (byte) i9;
                            b2.e(byteArray2, 0, byteArray2.length);
                            b2.a(byteArray2, 23);
                        }
                        b.e(byteArray2, 23, asxlVar.r);
                        i5++;
                    } else {
                        throw new IllegalArgumentException("target length is less than digest size.");
                    }
                } else {
                    byte[] bArr = new byte[b.b()];
                    b.a(bArr, 0);
                    atow.aI(bArr, this.l);
                    assy assyVar = this.l;
                    byte[] bArr2 = new byte[assyVar.b()];
                    assyVar.a(bArr2, 0);
                    return bArr2;
                }
            }
        } else {
            int i10 = i + i;
            byte[] c2 = c(i10);
            byte[] c3 = c(i10 + 1);
            atow.aI(d(), this.l);
            atow.aK(i, this.l);
            atow.aJ((short) -31869, this.l);
            atow.aI(c2, this.l);
            atow.aI(c3, this.l);
            assy assyVar2 = this.l;
            byte[] bArr3 = new byte[assyVar2.b()];
            assyVar2.a(bArr3, 0);
            return bArr3;
        }
    }

    private final byte[] f(asxo asxoVar) {
        synchronized (this.j) {
            byte[] bArr = (byte[]) this.j.get(asxoVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] e = e(asxoVar.a);
            this.j.put(asxoVar, e);
            return e;
        }
    }

    public final asxq b() {
        asxq asxqVar;
        synchronized (this) {
            if (this.b == null) {
                this.b = new asxq(this.f, this.g, f(c), this.e);
            }
            asxqVar = this.b;
        }
        return asxqVar;
    }

    final byte[] c(int i) {
        asxo asxoVar;
        if (i < this.k) {
            asxo[] asxoVarArr = d;
            int length = asxoVarArr.length;
            if (i < 129) {
                asxoVar = asxoVarArr[i];
            } else {
                asxoVar = new asxo(i);
            }
            return f(asxoVar);
        }
        return e(i);
    }

    public final byte[] d() {
        return atow.O(this.e);
    }

    public final boolean equals(Object obj) {
        asxq asxqVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        asxp asxpVar = (asxp) obj;
        if (this.m != asxpVar.m || this.h != asxpVar.h || !Arrays.equals(this.e, asxpVar.e)) {
            return false;
        }
        asxt asxtVar = this.f;
        if (asxtVar == null ? asxpVar.f != null : !asxtVar.equals(asxpVar.f)) {
            return false;
        }
        asxl asxlVar = this.g;
        if (asxlVar == null ? asxpVar.g != null : !asxlVar.equals(asxpVar.g)) {
            return false;
        }
        if (!Arrays.equals(this.i, asxpVar.i)) {
            return false;
        }
        asxq asxqVar2 = this.b;
        if (asxqVar2 == null || (asxqVar = asxpVar.b) == null) {
            return true;
        }
        return asxqVar2.equals(asxqVar);
    }

    public final int hashCode() {
        int i;
        int i2;
        int M = (this.m * 31) + atow.M(this.e);
        asxt asxtVar = this.f;
        int i3 = 0;
        if (asxtVar != null) {
            i = asxtVar.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((M * 31) + i) * 31;
        asxl asxlVar = this.g;
        if (asxlVar != null) {
            i2 = asxlVar.hashCode();
        } else {
            i2 = 0;
        }
        int M2 = (((((i4 + i2) * 31) + this.h) * 31) + atow.M(this.i)) * 31;
        asxq asxqVar = this.b;
        if (asxqVar != null) {
            i3 = asxqVar.hashCode();
        }
        return M2 + i3;
    }

    @Override // defpackage.asxn, defpackage.atdc
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        atow.aO(0, byteArrayOutputStream);
        atow.aO(this.f.u, byteArrayOutputStream);
        atow.aO(this.g.q, byteArrayOutputStream);
        atow.aM(this.e, byteArrayOutputStream);
        atow.aO(this.m, byteArrayOutputStream);
        atow.aO(this.h, byteArrayOutputStream);
        atow.aO(this.i.length, byteArrayOutputStream);
        atow.aM(this.i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
