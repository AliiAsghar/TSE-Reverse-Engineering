package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class akr {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a extends akr {
        private final cfq.b a;

        public a(cfq.b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.akr
        public final int a(int i, drk drkVar) {
            return this.a.a(0, i, drkVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && d.F(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b extends akr {
        private final cfq.c a;

        public b(cfq.c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.akr
        public final int a(int i, drk drkVar) {
            return this.a.a(0, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && d.F(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.a + ')';
        }
    }

    public abstract int a(int i, drk drkVar);
}
