package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class asxr implements atdc {
    private final int a;
    private final asxm b;
    private final asxt c;
    private final byte[][] d;

    public asxr(int i, asxm asxmVar, asxt asxtVar, byte[][] bArr) {
        this.a = i;
        this.b = asxmVar;
        this.c = asxtVar;
        this.d = bArr;
    }

    public static asxr a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof asxr) {
            return (asxr) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int readInt = dataInputStream2.readInt();
            asxm a = asxm.a(obj);
            asxt a2 = asxt.a(dataInputStream2.readInt());
            int i = a2.w;
            byte[][] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr2 = new byte[a2.v];
                bArr[i2] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new asxr(readInt, a, a2, bArr);
        }
        if (obj instanceof byte[]) {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    asxr a3 = a(dataInputStream);
                    dataInputStream.close();
                    return a3;
                } catch (Throwable th) {
                    th = th;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
            }
        } else {
            if (obj instanceof InputStream) {
                return a(atow.A((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        asxr asxrVar = (asxr) obj;
        if (this.a != asxrVar.a) {
            return false;
        }
        asxm asxmVar = this.b;
        if (asxmVar == null ? asxrVar.b != null : !asxmVar.equals(asxrVar.b)) {
            return false;
        }
        asxt asxtVar = this.c;
        if (asxtVar == null ? asxrVar.c != null : !asxtVar.equals(asxrVar.c)) {
            return false;
        }
        return Arrays.deepEquals(this.d, asxrVar.d);
    }

    public final int hashCode() {
        int i;
        asxm asxmVar = this.b;
        int i2 = 0;
        if (asxmVar != null) {
            i = asxmVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = this.a;
        asxt asxtVar = this.c;
        if (asxtVar != null) {
            i2 = asxtVar.hashCode();
        }
        return (((((i3 * 31) + i) * 31) + i2) * 31) + Arrays.deepHashCode(this.d);
    }

    @Override // defpackage.atdc
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        atow.aO(this.a, byteArrayOutputStream);
        atow.aM(this.b.s(), byteArrayOutputStream);
        atow.aO(this.c.u, byteArrayOutputStream);
        try {
            for (byte[] bArr : this.d) {
                byteArrayOutputStream.write(bArr);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
