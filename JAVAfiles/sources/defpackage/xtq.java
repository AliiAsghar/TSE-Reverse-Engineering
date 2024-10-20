package defpackage;

import com.google.android.ims.provisioning.config.Configuration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtq {
    public final Configuration a;
    public final int b;

    public xtq(Configuration configuration, int i) {
        this.a = configuration;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtq)) {
            return false;
        }
        xtq xtqVar = (xtq) obj;
        if (d.F(this.a, xtqVar.a) && a.bA(this.b, xtqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "RegistrationInfo(configuration=" + this.a + ", subscriptionId=" + adix.a(this.b) + ")";
    }
}
