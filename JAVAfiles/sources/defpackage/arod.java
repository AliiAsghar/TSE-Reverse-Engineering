package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arod extends arnj implements RandomAccess {
    public final List a;
    public int b;
    public int c;

    public arod(List list) {
        this.a = list;
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
