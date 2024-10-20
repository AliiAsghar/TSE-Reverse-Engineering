package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aruq implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public aruq(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.a, this.b);
        compile.getClass();
        return new arus(compile);
    }
}
