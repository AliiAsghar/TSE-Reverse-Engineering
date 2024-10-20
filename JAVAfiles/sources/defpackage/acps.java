package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acps implements acpp {
    final Object a;
    final String b;

    public acps(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    @Override // defpackage.acpp
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.acpp
    public final String b() {
        return this.b;
    }

    public final String toString() {
        return String.format(Locale.US, "%s=%s", this.b, this.a);
    }
}
