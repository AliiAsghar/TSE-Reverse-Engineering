package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqc {
    final Object a;
    public List b;
    hqc c;
    hqc d;

    public hqc(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int a = a();
        if (a > 0) {
            return this.b.remove(a - 1);
        }
        return null;
    }

    hqc() {
        this(null);
    }
}
