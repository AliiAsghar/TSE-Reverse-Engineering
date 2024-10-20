package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajfi {
    public final float a;
    public int b;
    public final List c;
    public final int d;
    public final int e;

    public ajfi(float f, List list, int i, int i2) {
        this.a = f;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = i;
        this.e = i2;
        while (i <= i2) {
            if (((ajfh) list.get(i)).f == brg.a) {
                this.b++;
            }
            i++;
        }
    }

    public final ajfh a() {
        return (ajfh) this.c.get(this.d);
    }

    public final ajfh b() {
        return (ajfh) this.c.get(0);
    }

    public final ajfh c() {
        return (ajfh) this.c.get(this.e);
    }

    public final ajfh d() {
        return (ajfh) this.c.get(this.c.size() - 1);
    }
}
