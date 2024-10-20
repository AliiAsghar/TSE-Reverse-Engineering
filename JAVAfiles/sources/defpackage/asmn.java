package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asmn extends Reader {
    private final asqw a;
    private final Charset b;
    private boolean c;
    private Reader d;

    public asmn(asqw asqwVar, Charset charset) {
        asqwVar.getClass();
        charset.getClass();
        this.a = asqwVar;
        this.b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = true;
        Reader reader = this.d;
        if (reader != null) {
            reader.close();
        } else {
            this.a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        cArr.getClass();
        if (!this.c) {
            Reader reader = this.d;
            if (reader == null) {
                asqw asqwVar = this.a;
                Charset charset = this.b;
                InputStream k = asqwVar.k();
                byte[] bArr = asmt.a;
                asqwVar.getClass();
                charset.getClass();
                int g = asqwVar.g(asmt.d);
                if (g != -1) {
                    if (g != 0) {
                        if (g != 1) {
                            if (g != 2) {
                                if (g != 3) {
                                    if (g == 4) {
                                        Charset charset2 = arul.a;
                                        charset = arul.c;
                                        if (charset == null) {
                                            charset = Charset.forName("UTF-32LE");
                                            charset.getClass();
                                            arul.c = charset;
                                        }
                                    } else {
                                        throw new AssertionError();
                                    }
                                } else {
                                    Charset charset3 = arul.a;
                                    charset = arul.d;
                                    if (charset == null) {
                                        charset = Charset.forName("UTF-32BE");
                                        charset.getClass();
                                        arul.d = charset;
                                    }
                                }
                            } else {
                                charset = StandardCharsets.UTF_16LE;
                                charset.getClass();
                            }
                        } else {
                            charset = StandardCharsets.UTF_16BE;
                            charset.getClass();
                        }
                    } else {
                        charset = StandardCharsets.UTF_8;
                        charset.getClass();
                    }
                }
                InputStreamReader inputStreamReader = new InputStreamReader(k, charset);
                this.d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
        throw new IOException("Stream closed");
    }
}
