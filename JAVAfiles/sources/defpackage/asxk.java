package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asxk extends asxn {
    public final int b;
    public final asxq c;

    public asxk(int i, asxq asxqVar) {
        super(false);
        this.b = i;
        this.c = asxqVar;
    }

    public static asxk a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof asxk) {
            return (asxk) obj;
        }
        if (obj instanceof DataInputStream) {
            return new asxk(((DataInputStream) obj).readInt(), asxq.a(obj));
        }
        if (obj instanceof byte[]) {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                asxk a = a(dataInputStream);
                dataInputStream.close();
                return a;
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
        asxk asxkVar = (asxk) obj;
        if (this.b != asxkVar.b) {
            return false;
        }
        return this.c.equals(asxkVar.c);
    }

    public final int hashCode() {
        return (this.b * 31) + this.c.hashCode();
    }

    @Override // defpackage.asxn, defpackage.atdc
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        atow.aO(this.b, byteArrayOutputStream);
        atow.aM(this.c.b(), byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
