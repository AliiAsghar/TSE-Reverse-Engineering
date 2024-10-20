package defpackage;

import android.content.ComponentName;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jw {
    public final ComponentName a;
    public final long b;
    public final float c;

    public jw(ComponentName componentName, long j, float f) {
        this.a = componentName;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jw jwVar = (jw) obj;
        ComponentName componentName = this.a;
        if (componentName == null) {
            if (jwVar.a != null) {
                return false;
            }
        } else if (!componentName.equals(jwVar.a)) {
            return false;
        }
        if (this.b != jwVar.b) {
            return false;
        }
        if (Float.floatToIntBits(this.c) == Float.floatToIntBits(jwVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ComponentName componentName = this.a;
        if (componentName == null) {
            hashCode = 0;
        } else {
            hashCode = componentName.hashCode();
        }
        long j = this.b;
        return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + "]";
    }
}
