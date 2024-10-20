package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asxq extends asxn {
    private final asxt b;
    private final asxl c;
    private final byte[] d;
    private final byte[] e;

    public asxq(asxt asxtVar, asxl asxlVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.b = asxtVar;
        this.c = asxlVar;
        this.d = atow.O(bArr2);
        this.e = atow.O(bArr);
    }

    public static asxq a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof asxq) {
            return (asxq) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            asxt a = asxt.a(dataInputStream2.readInt());
            asxl a2 = asxl.a(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[a.v];
            dataInputStream2.readFully(bArr2);
            return new asxq(a, a2, bArr2, bArr);
        }
        if (obj instanceof byte[]) {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                asxq a3 = a(dataInputStream);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        atow.aO(this.b.u, byteArrayOutputStream);
        atow.aO(this.c.q, byteArrayOutputStream);
        atow.aM(this.d, byteArrayOutputStream);
        atow.aM(this.e, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        asxq asxqVar = (asxq) obj;
        if (!this.b.equals(asxqVar.b) || !this.c.equals(asxqVar.c) || !Arrays.equals(this.d, asxqVar.d)) {
            return false;
        }
        return Arrays.equals(this.e, asxqVar.e);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + atow.M(this.d)) * 31) + atow.M(this.e);
    }

    @Override // defpackage.asxn, defpackage.atdc
    public final byte[] s() {
        return b();
    }
}
