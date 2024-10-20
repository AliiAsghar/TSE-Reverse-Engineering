package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcy {
    public final a a;
    public final a b;
    public final boolean c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final dqh a;
        public final int b;
        public final long c;

        public a(dqh dqhVar, int i, long j) {
            this.a = dqhVar;
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.a.hashCode() * 31) + this.b) * 31) + defpackage.a.A(this.c);
        }

        public final String toString() {
            return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
        }
    }

    public bcy(a aVar, a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public static /* synthetic */ bcy a(bcy bcyVar, a aVar, a aVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            aVar = bcyVar.a;
        }
        if ((i & 2) != 0) {
            aVar2 = bcyVar.b;
        }
        return new bcy(aVar, aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcy)) {
            return false;
        }
        bcy bcyVar = (bcy) obj;
        if (d.F(this.a, bcyVar.a) && d.F(this.b, bcyVar.b) && this.c == bcyVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + defpackage.a.v(this.c);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
