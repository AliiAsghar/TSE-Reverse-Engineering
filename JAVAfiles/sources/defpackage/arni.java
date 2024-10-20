package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arni extends arnj implements RandomAccess {
    private final arnj a;
    private final int b;
    private final int c;

    public arni(arnj arnjVar, int i, int i2) {
        this.a = arnjVar;
        this.b = i;
        a.P(i, i2, arnjVar.a());
        this.c = i2 - i;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.c;
    }

    @Override // defpackage.arnj, java.util.List
    public final Object get(int i) {
        a.N(i, this.c);
        return this.a.get(this.b + i);
    }
}
