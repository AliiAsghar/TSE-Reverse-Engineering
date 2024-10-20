package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxn {
    public final Map a;
    private final Optional b;

    public akxn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akxn) {
            akxn akxnVar = (akxn) obj;
            if (this.a.equals(akxnVar.a) && this.b.equals(akxnVar.b)) {
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
        return "ArgumentsWrapper{paramValues=" + this.a.toString() + ", requestMetadata=" + optional.toString() + "}";
    }

    public akxn(Map map, Optional optional) {
        if (map == null) {
            throw new NullPointerException("Null paramValues");
        }
        this.a = map;
        this.b = optional;
    }
}
