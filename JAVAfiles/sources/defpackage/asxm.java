package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class asxm implements atdc {
    private final asxl a;
    private final byte[] b;
    private final byte[] c;

    public asxm(asxl asxlVar, byte[] bArr, byte[] bArr2) {
        this.a = asxlVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public static asxm a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof asxm) {
            return (asxm) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            asxl a = asxl.a(dataInputStream2.readInt());
            byte[] bArr = new byte[a.r];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[a.t * a.r];
            dataInputStream2.readFully(bArr2);
            return new asxm(a, bArr, bArr2);
        }
        if (obj instanceof byte[]) {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                asxm a2 = a(dataInputStream);
                dataInputStream.close();
                return a2;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        asxm asxmVar = (asxm) obj;
        asxl asxlVar = this.a;
        if (asxlVar == null ? asxmVar.a != null : !asxlVar.equals(asxmVar.a)) {
            return false;
        }
        if (!Arrays.equals(this.b, asxmVar.b)) {
            return false;
        }
        return Arrays.equals(this.c, asxmVar.c);
    }

    public final int hashCode() {
        int i;
        asxl asxlVar = this.a;
        if (asxlVar != null) {
            i = asxlVar.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    @Override // defpackage.atdc
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        atow.aO(this.a.q, byteArrayOutputStream);
        atow.aM(this.b, byteArrayOutputStream);
        atow.aM(this.c, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
