package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akv implements and {
    private final float a = brg.a;
    private final float b = brg.a;
    private final float c = brg.a;
    private final float d = brg.a;

    @Override // defpackage.and
    public final int a(dqv dqvVar) {
        return dqvVar.eo(brg.a);
    }

    @Override // defpackage.and
    public final int b(dqv dqvVar, drk drkVar) {
        return dqvVar.eo(brg.a);
    }

    @Override // defpackage.and
    public final int c(dqv dqvVar, drk drkVar) {
        return dqvVar.eo(brg.a);
    }

    @Override // defpackage.and
    public final int d(dqv dqvVar) {
        return dqvVar.eo(brg.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akv)) {
            return false;
        }
        akv akvVar = (akv) obj;
        float f = akvVar.a;
        if (dqy.b(brg.a, brg.a)) {
            float f2 = akvVar.b;
            if (dqy.b(brg.a, brg.a)) {
                float f3 = akvVar.c;
                if (dqy.b(brg.a, brg.a)) {
                    float f4 = akvVar.d;
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
        return "Insets(left=" + ((Object) dqy.a(brg.a)) + ", top=" + ((Object) dqy.a(brg.a)) + ", right=" + ((Object) dqy.a(brg.a)) + ", bottom=" + ((Object) dqy.a(brg.a)) + ')';
    }
}
