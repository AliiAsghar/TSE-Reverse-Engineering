package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface atz {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b implements atz {
        private final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // defpackage.atz
        public final int a(dqv dqvVar, int i) {
            return dqvVar.eo(this.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return dqy.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }
    }

    int a(dqv dqvVar, int i);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements atz {
        public static final a a = new a();

        private a() {
        }

        @Override // defpackage.atz
        public final int a(dqv dqvVar, int i) {
            return i;
        }
    }
}
