package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqo implements ahlx {
    public final int a;
    public final float b;
    public final algw c;
    private final int d;

    public ahqo() {
        throw null;
    }

    public static final ahqn c() {
        ahqn ahqnVar = new ahqn(null);
        ahqnVar.b(10);
        ahqnVar.c(1.0f);
        ahqnVar.a = alfd.a;
        ahqnVar.b = 1;
        return ahqnVar;
    }

    @Override // defpackage.ahlx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ahlx
    public final boolean b() {
        if (this.d == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahqo)) {
            return false;
        }
        ahqo ahqoVar = (ahqo) obj;
        int i = this.d;
        int i2 = ahqoVar.d;
        if (i != 0) {
            if (i == i2 && this.a == ahqoVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(ahqoVar.b) && this.c.equals(ahqoVar.c)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        a.aS(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + ahly.a(this.d) + ", rateLimitPerSecond=" + this.a + ", samplingProbability=" + this.b + ", perEventConfigurationFlags=" + String.valueOf(this.c) + "}";
    }

    public ahqo(int i, int i2, float f, algw algwVar) {
        this.d = i;
        this.a = i2;
        this.b = f;
        this.c = algwVar;
    }
}
