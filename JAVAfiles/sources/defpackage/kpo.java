package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpo {
    public static final alwo a = alwo.o("Bugle");
    public final Class b;
    public final Optional c;
    private final anen d;
    private final Optional e;

    public kpo(Class cls, anen anenVar, Optional optional, Optional optional2) {
        this.b = cls;
        this.d = anenVar;
        this.c = optional;
        this.e = optional2;
    }

    public final akul a() {
        if (this.c.isEmpty()) {
            return aktp.ag(Optional.empty());
        }
        this.e.isPresent();
        albo.U(false, "the isEnabledFn should be present when the feature is compiled in");
        return ((kpn) this.e.get()).a().h(new itk(this, 6), this.d).e(Exception.class, new itk(this, 7), this.d);
    }
}
