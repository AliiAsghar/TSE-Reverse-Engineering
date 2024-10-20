package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egy {
    public final egx a;
    public final egw b;
    public final boolean c;

    public egy(egx egxVar, egw egwVar) {
        this.a = egxVar;
        this.b = egwVar;
        this.c = egxVar != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof egy) {
            egy egyVar = (egy) obj;
            if (this.c == egyVar.c && d.F(this.a, egyVar.a) && d.F(this.b, egyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), this.a, this.b);
    }

    public egy() {
        this(null, null);
    }
}
