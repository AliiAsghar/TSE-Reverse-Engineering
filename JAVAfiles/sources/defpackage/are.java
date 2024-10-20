package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class are {
    public final cbh a = new cbh(new a[16]);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
            if (i < 0) {
                aju.c("negative start index");
            }
            if (i2 >= i) {
                return;
            }
            aju.c("end index greater than start");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            return "Interval(start=" + this.a + ", end=" + this.b + ')';
        }
    }

    public final a a(int i, int i2) {
        a aVar = new a(i, i2);
        this.a.n(aVar);
        return aVar;
    }

    public final void b(a aVar) {
        this.a.m(aVar);
    }

    public final boolean c() {
        if (this.a.b != 0) {
            return true;
        }
        return false;
    }
}
