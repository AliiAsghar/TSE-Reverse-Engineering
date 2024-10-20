package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class assg {
    private static final ByteArrayBuffer a = i(assi.f, ": ");
    private static final ByteArrayBuffer b = i(assi.f, VCardBuilder.VCARD_END_OF_LINE);
    private static final ByteArrayBuffer c = i(assi.f, "--");
    private final String d;
    private final Charset e;
    private final String f;
    private final List<asse> g;
    private final assh h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: assg$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[assh.values().length];
            a = iArr;
            try {
                iArr[assh.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[assh.BROWSER_COMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public assg(String str, String str2) {
        this(str, null, str2);
    }

    private static ByteArrayBuffer i(Charset charset, String str) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(encode.remaining());
        byteArrayBuffer.append(encode.array(), encode.position(), encode.remaining());
        return byteArrayBuffer;
    }

    private void j(assh asshVar, OutputStream outputStream, boolean z) {
        ByteArrayBuffer i = i(this.e, b());
        for (asse asseVar : this.g) {
            l(c, outputStream);
            l(i, outputStream);
            l(b, outputStream);
            assf b2 = asseVar.b();
            int i2 = AnonymousClass1.a[asshVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    o(asseVar.b().d(assi.c), this.e, outputStream);
                    if (asseVar.c().f() != null) {
                        o(asseVar.b().d(assi.a), this.e, outputStream);
                    }
                }
            } else {
                Iterator<assj> it = b2.iterator();
                while (it.hasNext()) {
                    n(it.next(), outputStream);
                }
            }
            ByteArrayBuffer byteArrayBuffer = b;
            l(byteArrayBuffer, outputStream);
            if (z) {
                asseVar.c().h(outputStream);
            }
            l(byteArrayBuffer, outputStream);
        }
        ByteArrayBuffer byteArrayBuffer2 = c;
        l(byteArrayBuffer2, outputStream);
        l(i, outputStream);
        l(byteArrayBuffer2, outputStream);
        l(b, outputStream);
    }

    private static void k(String str, OutputStream outputStream) {
        l(i(assi.f, str), outputStream);
    }

    private static void l(ByteArrayBuffer byteArrayBuffer, OutputStream outputStream) {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }

    private static void m(String str, Charset charset, OutputStream outputStream) {
        l(i(charset, str), outputStream);
    }

    private static void n(assj assjVar, OutputStream outputStream) {
        k(assjVar.b(), outputStream);
        l(a, outputStream);
        k(assjVar.a(), outputStream);
        l(b, outputStream);
    }

    private static void o(assj assjVar, Charset charset, OutputStream outputStream) {
        m(assjVar.b(), charset, outputStream);
        l(a, outputStream);
        m(assjVar.a(), charset, outputStream);
        l(b, outputStream);
    }

    public long a() {
        Iterator<asse> it = this.g.iterator();
        long j = 0;
        while (it.hasNext()) {
            long a2 = it.next().c().a();
            if (a2 >= 0) {
                j += a2;
            } else {
                return -1L;
            }
        }
        try {
            j(this.h, new ByteArrayOutputStream(), false);
            return j + r0.toByteArray().length;
        } catch (IOException unused) {
            return -1L;
        }
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.d;
    }

    public Charset d() {
        return this.e;
    }

    public List<asse> e() {
        return this.g;
    }

    public assh f() {
        return this.h;
    }

    public void g(asse asseVar) {
        if (asseVar == null) {
            return;
        }
        this.g.add(asseVar);
    }

    public void h(OutputStream outputStream) {
        j(this.h, outputStream, true);
    }

    public assg(String str, Charset charset, String str2) {
        this(str, charset, str2, assh.STRICT);
    }

    public assg(String str, Charset charset, String str2, assh asshVar) {
        if (str == null) {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        }
        if (str2 != null) {
            this.d = str;
            this.e = charset == null ? assi.f : charset;
            this.f = str2;
            this.g = new ArrayList();
            this.h = asshVar;
            return;
        }
        throw new IllegalArgumentException("Multipart boundary may not be null");
    }
}
