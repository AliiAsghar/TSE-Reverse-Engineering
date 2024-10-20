package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xoe {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final xnv c;
    public final odp d;
    private final anen e;
    private final xot f;

    public xoe(anen anenVar, armf armfVar, xot xotVar, xnv xnvVar, odp odpVar) {
        this.e = anenVar;
        this.b = armfVar;
        this.f = xotVar;
        this.c = xnvVar;
        this.d = odpVar;
    }

    private final akul c(String str, Optional optional) {
        return this.f.c(str, Optional.empty()).h(new way(this, str, optional, 14), this.e);
    }

    public final akul a(String str) {
        return c(str, Optional.of(10007));
    }

    public final akul b(String str) {
        return c(str, Optional.empty());
    }
}
