package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advl implements XmlSerializer {
    private static final String[] b = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public Writer a;
    private int d;
    private OutputStream e;
    private CharsetEncoder f;
    private boolean i;
    private final char[] c = new char[8192];
    private final ByteBuffer g = ByteBuffer.allocate(8192);
    private boolean h = false;
    private int j = 0;
    private boolean k = true;

    private final void a(char c) {
        int i = this.d;
        if (i >= 8191) {
            flush();
            i = this.d;
        }
        this.c[i] = c;
        this.d = i + 1;
    }

    private final void b(String str) {
        c(str, 0, str.length());
    }

    private final void c(String str, int i, int i2) {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                c(str, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.d;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.d;
        }
        str.getChars(i, i + i2, this.c, i6);
        this.d = i6 + i2;
    }

    private final void d(char[] cArr, int i, int i2) {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                d(cArr, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.d;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.d;
        }
        System.arraycopy(cArr, i, this.c, i6, i2);
        this.d = i6 + i2;
    }

    private final void e(int i) {
        int i2 = i * 4;
        if (i2 > 62) {
            i2 = 62;
        }
        c("                                                              ", 0, i2);
    }

    private final void f(String str) {
        String str2;
        int length = str.length();
        String[] strArr = b;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < '@' && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    c(str, i2, i - i2);
                }
                b(str2);
                i2 = i3;
            }
            i = i3;
        }
        if (i2 < i) {
            c(str, i2, i - i2);
        }
    }

    private final void g() {
        int position = this.g.position();
        if (position > 0) {
            this.g.flip();
            this.e.write(this.g.array(), 0, position);
            this.g.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) {
        a(' ');
        if (!TextUtils.isEmpty(str)) {
            b(str);
            a(':');
        }
        b(str2);
        b("=\"");
        f(str3);
        a('\"');
        this.k = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() {
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) {
        int i = this.j - 1;
        this.j = i;
        if (this.i) {
            b(" />\n");
        } else {
            if (this.h && this.k) {
                e(i);
            }
            b("</");
            if (!TextUtils.isEmpty(str)) {
                b(str);
                a(':');
            }
            b(str2);
            b(">\n");
        }
        this.k = true;
        this.i = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() {
        int i = this.d;
        if (i > 0) {
            if (this.e != null) {
                CharBuffer wrap = CharBuffer.wrap(this.c, 0, i);
                CoderResult encode = this.f.encode(wrap, this.g, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        g();
                        encode = this.f.encode(wrap, this.g, true);
                    } else {
                        g();
                        this.e.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.a.write(this.c, 0, i);
            this.a.flush();
            this.d = 0;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.h = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.a = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) {
        String str2;
        if (true != bool.booleanValue()) {
            str2 = "no";
        } else {
            str2 = "yes";
        }
        b("<?xml version='1.0' encoding='utf-8' standalone='" + str2 + "' ?>\n");
        this.k = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) {
        if (this.i) {
            b(">\n");
        }
        if (this.h) {
            e(this.j);
        }
        this.j++;
        a('<');
        if (!TextUtils.isEmpty(str)) {
            b(str);
            a(':');
        }
        b(str2);
        this.i = true;
        this.k = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) {
        boolean z = false;
        if (this.i) {
            b(">");
            this.i = false;
        }
        f(str);
        if (this.h) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == '\n') {
                z = true;
            }
            this.k = z;
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                this.f = Charset.forName(str).newEncoder();
                this.e = outputStream;
                return;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) {
        String str;
        if (this.i) {
            b(">");
            this.i = false;
        }
        int i3 = i2 + i;
        String[] strArr = b;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < '@' && (str = strArr[c]) != null) {
                if (i4 < i) {
                    d(cArr, i4, i - i4);
                }
                i4 = i + 1;
                b(str);
            }
            i++;
        }
        if (i4 < i) {
            d(cArr, i4, i - i4);
        }
        if (this.h) {
            this.k = cArr[i3 + (-1)] == '\n';
        }
        return this;
    }
}
