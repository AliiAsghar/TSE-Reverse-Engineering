package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambw implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;
    private final String c;

    public ambw(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    private Object readResolve() {
        return new ambx(this.a, this.b, this.c);
    }
}
