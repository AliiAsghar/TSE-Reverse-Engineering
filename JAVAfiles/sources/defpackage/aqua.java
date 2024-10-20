package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqua extends aqtp {
    public aquz b(Map map) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("policy", c());
        aj.f("priority", 5);
        aj.h("available", true);
        return aj.toString();
    }
}
