package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aidi {
    public final aidj a;
    public final Optional b;

    public aidi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aidi) {
            aidi aidiVar = (aidi) obj;
            if (this.a.equals(aidiVar.a) && this.b.equals(aidiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "EventRecord{eventVector=" + String.valueOf(this.a) + ", aggregateValue=" + String.valueOf(optional) + "}";
    }

    public aidi(aidj aidjVar, Optional optional) {
        this.a = aidjVar;
        this.b = optional;
    }
}
