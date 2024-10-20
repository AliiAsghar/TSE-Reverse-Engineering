package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gi implements Cloneable {
    private static final alvi c = alvi.m("android/support/v7/mms/pdu/EncodedStringValue");
    public final int a;
    public byte[] b;

    public gi(int i, aozb aozbVar) {
        this(i, aozbVar.H());
    }

    public static gi[] f(String[] strArr) {
        int length = strArr.length;
        if (length > 0) {
            gi[] giVarArr = new gi[length];
            for (int i = 0; i < length; i++) {
                giVarArr[i] = new gi(strArr[i]);
            }
            return giVarArr;
        }
        return null;
    }

    public final int a() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public final String b() {
        int i = this.a;
        if (i != 0) {
            try {
                return new String(this.b, gg.a(i));
            } catch (UnsupportedEncodingException e) {
                alvw d = c.d();
                d.X(alwp.a, "PduParser");
                ((alvg) ((alvg) ((alvg) d).g(e)).h("android/support/v7/mms/pdu/EncodedStringValue", "getString", (char) 152, "EncodedStringValue.java")).q("EncodedStringValue: Unsupported encoding at getString");
                try {
                    return new String(this.b, "iso-8859-1");
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return new String(this.b);
    }

    public final void c(byte[] bArr) {
        if (bArr != null) {
            if (this.b == null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                this.b = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, length);
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.b);
                byteArrayOutputStream.write(bArr);
                this.b = byteArrayOutputStream.toByteArray();
                return;
            } catch (IOException e) {
                throw new NullPointerException("appendTextString: failed when write a new Text-string ".concat(e.toString()));
            }
        }
        throw new NullPointerException("Text-string is null.");
    }

    public final Object clone() {
        byte[] bArr = this.b;
        try {
            return new gi(this.a, Arrays.copyOf(bArr, bArr.length));
        } catch (Exception e) {
            alvw d = c.d();
            d.X(alwp.a, "PduParser");
            ((alvg) ((alvg) ((alvg) d).g(e)).h("android/support/v7/mms/pdu/EncodedStringValue", "clone", 204, "EncodedStringValue.java")).t("EncodedStringValue: failed to clone an EncodedStringValue: %s", this);
            throw new CloneNotSupportedException(e.getMessage());
        }
    }

    public final void d(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        throw new NullPointerException("EncodedStringValue: Text-string is null.");
    }

    public final byte[] e() {
        return (byte[]) this.b.clone();
    }

    public gi(int i, String str) {
        if (str != null) {
            this.a = i;
            try {
                this.b = str.getBytes(gg.a(i));
                return;
            } catch (UnsupportedEncodingException e) {
                alvw h = c.h();
                h.X(alwp.a, "PduParser");
                ((alvg) ((alvg) ((alvg) h).g(e)).h("android/support/v7/mms/pdu/EncodedStringValue", "<init>", 99, "EncodedStringValue.java")).r("EncodedStringValue: Input encoding %d must be supported.", i);
                this.b = str.getBytes();
                return;
            }
        }
        throw new NullPointerException("EncodedStringValue: Text-string is null");
    }

    public gi(int i, byte[] bArr) {
        if (bArr != null) {
            this.a = i;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        throw new NullPointerException("EncodedStringValue: Text-string is null.");
    }

    public gi(String str) {
        this(106, str);
    }

    public gi(byte[] bArr) {
        this(106, bArr);
    }
}
