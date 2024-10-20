package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bru {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a extends bru {
        public final cfq.b a;
        public final cfq.b b;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (d.F(this.a, aVar.a) && d.F(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((defpackage.a.v(false) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            return "Default(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
        }

        public /* synthetic */ a(byte[] bArr) {
            int i = cfq.a;
            cfq.b bVar = cfq.a.m;
            this.a = bVar;
            this.b = bVar;
        }
    }
}
