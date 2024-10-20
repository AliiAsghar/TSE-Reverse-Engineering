package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class assq extends assl {
    private final InputStream a;
    private final String b;

    public assq(InputStream inputStream, String str) {
        this(inputStream, "application/octet-stream", str);
    }

    @Override // defpackage.asso
    public long a() {
        return -1L;
    }

    @Override // defpackage.asso
    public String e() {
        return null;
    }

    @Override // defpackage.assn
    public String f() {
        return this.b;
    }

    @Override // defpackage.asso
    public String g() {
        return assi.e;
    }

    @Override // defpackage.assn
    public void h(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = this.a.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        return;
                    }
                }
            } finally {
                this.a.close();
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    public InputStream i() {
        return this.a;
    }

    public assq(InputStream inputStream, String str, String str2) {
        super(str);
        if (inputStream != null) {
            this.a = inputStream;
            this.b = str2;
            return;
        }
        throw new IllegalArgumentException("Input stream may not be null");
    }
}
