package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahku {
    private final Level a;
    private final String b;
    private final String c;

    public ahku() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahku) {
            ahku ahkuVar = (ahku) obj;
            if (this.a.equals(ahkuVar.a) && this.b.equals(ahkuVar.b) && this.c.equals(ahkuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AbseilLogData{logLevel=" + this.a.toString() + ", logFormat=" + this.b + ", fileName=" + this.c + "}";
    }

    public ahku(Level level, String str, String str2) {
        this.a = level;
        if (str == null) {
            throw new NullPointerException("Null logFormat");
        }
        this.b = str;
        this.c = str2;
    }
}
