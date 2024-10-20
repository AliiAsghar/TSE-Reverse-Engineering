package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advp {
    public final String a;

    public advp(String str) {
        this.a = str;
    }

    public static advp a(String str) {
        return new advp(String.format("%s:[%s]", str, UUID.randomUUID().toString().substring(0, 13)));
    }

    public final advp b(String str) {
        return new advp(this.a + ">" + str);
    }

    public final String toString() {
        return this.a;
    }

    public advp(String str, Object... objArr) {
        this(String.format(str, objArr));
    }
}
