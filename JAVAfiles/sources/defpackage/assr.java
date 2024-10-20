package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class assr extends assl {
    private final byte[] a;
    private final Charset b;

    public assr(String str) {
        this(str, "text/plain", null);
    }

    public static assr j(String str) {
        return l(str, null, null);
    }

    public static assr k(String str, Charset charset) {
        return l(str, null, charset);
    }

    public static assr l(String str, String str2, Charset charset) {
        try {
            return new assr(str, str2, charset);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(a.cc(charset, "Charset ", " is not supported"), e);
        }
    }

    @Override // defpackage.asso
    public long a() {
        return this.a.length;
    }

    @Override // defpackage.asso
    public String e() {
        return this.b.name();
    }

    @Override // defpackage.assn
    public String f() {
        return null;
    }

    @Override // defpackage.asso
    public String g() {
        return assi.d;
    }

    @Override // defpackage.assn
    public void h(OutputStream outputStream) {
        if (outputStream != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    public Reader i() {
        return new InputStreamReader(new ByteArrayInputStream(this.a), this.b);
    }

    public assr(String str, String str2, Charset charset) {
        super(str2);
        if (str != null) {
            charset = charset == null ? Charset.forName("US-ASCII") : charset;
            this.a = str.getBytes(charset.name());
            this.b = charset;
            return;
        }
        throw new IllegalArgumentException("Text may not be null");
    }

    public assr(String str, Charset charset) {
        this(str, "text/plain", charset);
    }
}
