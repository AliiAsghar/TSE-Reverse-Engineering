package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqq {
    public final api a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final List g;
    public int h;
    private List i;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a {
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class b implements apr {
        public static final b a = new b();

        private b() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class c {
        public final int a;
        public final List b;

        public c(int i, List list) {
            this.a = i;
            this.b = list;
        }
    }

    public aqq(api apiVar) {
        this.a = apiVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.i = arnv.a;
    }

    public final int a(int i) {
        if (b() <= 0) {
            return 0;
        }
        if (i >= b()) {
            aju.c("ItemIndex > total count");
        }
        return i / this.h;
    }

    public final int b() {
        return this.a.b.b;
    }

    public final c c(int i) {
        List list;
        int i2 = this.h;
        int i3 = i * i2;
        int s = arrn.s(i2, b() - i3);
        int size = this.i.size();
        int r = arrn.r(s, 0);
        if (r == size) {
            list = this.i;
        } else {
            ArrayList arrayList = new ArrayList(r);
            for (int i4 = 0; i4 < r; i4++) {
                arrayList.add(new apc());
            }
            this.i = arrayList;
            list = arrayList;
        }
        return new c(i3, list);
    }
}
