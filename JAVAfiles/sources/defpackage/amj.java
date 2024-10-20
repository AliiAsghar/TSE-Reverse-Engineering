package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface amj {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements amj {
        private final float a = brg.a;
        private final float b = brg.a;
        private final float c = brg.a;
        private final float d = brg.a;

        @Override // defpackage.amj
        public final float a() {
            return brg.a;
        }

        @Override // defpackage.amj
        public final float b(drk drkVar) {
            return brg.a;
        }

        @Override // defpackage.amj
        public final float c(drk drkVar) {
            return brg.a;
        }

        @Override // defpackage.amj
        public final float d() {
            return brg.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            float f = aVar.a;
            if (dqy.b(brg.a, brg.a)) {
                float f2 = aVar.b;
                if (dqy.b(brg.a, brg.a)) {
                    float f3 = aVar.c;
                    if (dqy.b(brg.a, brg.a)) {
                        float f4 = aVar.d;
                        if (dqy.b(brg.a, brg.a)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((Float.floatToIntBits(brg.a) * 31) + Float.floatToIntBits(brg.a)) * 31) + Float.floatToIntBits(brg.a)) * 31) + Float.floatToIntBits(brg.a);
        }

        public final String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) dqy.a(brg.a)) + ", top=" + ((Object) dqy.a(brg.a)) + ", right=" + ((Object) dqy.a(brg.a)) + ", bottom=" + ((Object) dqy.a(brg.a)) + ')';
        }
    }

    float a();

    float b(drk drkVar);

    float c(drk drkVar);

    float d();
}
