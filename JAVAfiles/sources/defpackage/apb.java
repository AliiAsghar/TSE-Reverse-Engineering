package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface apb {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements apb {
        private final float a = 120.0f;

        public a() {
            if (Float.compare(120.0f, brg.a) > 0) {
                return;
            }
            aju.c("Provided min size should be larger than zero.");
        }

        @Override // defpackage.apb
        public final List a(dqv dqvVar, int i, int i2) {
            return apf.a(i, Math.max((i + i2) / (dqvVar.eo(120.0f) + i2), 1), i2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                float f = ((a) obj).a;
                if (dqy.b(120.0f, 120.0f)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(120.0f);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b implements apb {
        private final int a = 3;

        @Override // defpackage.apb
        public final List a(dqv dqvVar, int i, int i2) {
            return apf.a(i, 3, i2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                int i = ((b) obj).a;
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return -3;
        }
    }

    List a(dqv dqvVar, int i, int i2);
}
