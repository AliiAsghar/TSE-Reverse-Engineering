package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqh {
    public final gon a;
    public final gqz b;
    private final efo c;
    private final Configuration d;
    private final float e;

    public gqh(gon gonVar, gqz gqzVar, efo efoVar, Configuration configuration, float f) {
        this.a = gonVar;
        this.b = gqzVar;
        this.c = efoVar;
        this.d = configuration;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqh)) {
            return false;
        }
        gqh gqhVar = (gqh) obj;
        if (d.F(this.a, gqhVar.a) && d.F(this.b, gqhVar.b) && d.F(this.c, gqhVar.c) && d.F(this.d, gqhVar.d) && Float.compare(this.e, gqhVar.e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "ParentContainerInfo(windowBounds=" + this.a + ", windowLayoutInfo=" + this.b + ", windowInsets=" + this.c + ", configuration=" + this.d + ", density=" + this.e + ')';
    }
}
