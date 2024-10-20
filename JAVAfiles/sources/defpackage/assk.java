package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class assk implements HttpEntity {
    private static final char[] a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final assg b;
    private final Header c;
    private long d;
    private volatile boolean e;

    public assk() {
        this(assh.STRICT, null, null);
    }

    protected String a() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            char[] cArr = a;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb.toString();
    }

    protected String b(String str, Charset charset) {
        StringBuilder sb = new StringBuilder("multipart/form-data; boundary=");
        sb.append(str);
        if (charset != null) {
            sb.append("; charset=");
            sb.append(charset.name());
        }
        return sb.toString();
    }

    public void c(asse asseVar) {
        this.b.g(asseVar);
        this.e = true;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() {
        if (!isStreaming()) {
        } else {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    public void d(String str, assn assnVar) {
        c(new asse(str, assnVar));
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return null;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        if (this.e) {
            this.d = this.b.a();
            this.e = false;
        }
        return this.d;
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.c;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        if (!isRepeatable()) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        Iterator<asse> it = this.b.e().iterator();
        while (it.hasNext()) {
            if (it.next().c().a() < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        if (!isRepeatable()) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        this.b.h(outputStream);
    }

    public assk(assh asshVar) {
        this(asshVar, null, null);
    }

    public assk(assh asshVar, String str, Charset charset) {
        str = str == null ? a() : str;
        this.b = new assg("form-data", charset, str, asshVar == null ? assh.STRICT : asshVar);
        this.c = new BasicHeader(assi.a, b(str, charset));
        this.e = true;
    }
}
