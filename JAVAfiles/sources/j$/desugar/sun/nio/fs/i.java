package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0067i;
import j$.nio.file.C;
import j$.nio.file.K;
import j$.nio.file.Path;
import j$.nio.file.attribute.H;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class i extends AbstractC0067i {
    private final String a;
    private final String b;
    private final m c;

    public i(m mVar, String str, String str2) {
        this.c = mVar;
        this.a = str;
        this.b = str2;
    }

    @Override // j$.nio.file.AbstractC0067i
    public final boolean B() {
        return false;
    }

    @Override // j$.nio.file.AbstractC0067i
    public final K C() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC0067i
    public final j$.nio.file.spi.d D() {
        return this.c;
    }

    @Override // j$.nio.file.AbstractC0067i
    public final Set E() {
        return g.c(new Object[]{"basic"});
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC0067i
    public final Iterable i() {
        throw new UnsupportedOperationException("");
    }

    @Override // j$.nio.file.AbstractC0067i
    public final boolean isOpen() {
        return true;
    }

    @Override // j$.nio.file.AbstractC0067i
    public final Path o(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new o(this, str, this.a, this.b);
    }

    @Override // j$.nio.file.AbstractC0067i
    public final C r(String str) {
        int i = 0;
        int indexOf = str.indexOf(58);
        if (indexOf > 0 && indexOf != str.length()) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (substring.equalsIgnoreCase("glob")) {
                substring2 = g.e(substring2);
            } else if (!substring.equalsIgnoreCase("regex")) {
                throw new UnsupportedOperationException("Syntax '" + substring + "' not recognized");
            }
            return new h(i, Pattern.compile(substring2));
        }
        throw new IllegalArgumentException(String.format("Requested <syntax>:<pattern> spliterator(':') position(%d) is out of bound in %s", Integer.valueOf(indexOf), str));
    }

    @Override // j$.nio.file.AbstractC0067i
    public final Iterable s() {
        return g.b(new Object[]{new o(this, "/", this.a, this.b)});
    }

    @Override // j$.nio.file.AbstractC0067i
    public final String v() {
        return "/";
    }

    @Override // j$.nio.file.AbstractC0067i
    public final H z() {
        throw new UnsupportedOperationException();
    }
}
