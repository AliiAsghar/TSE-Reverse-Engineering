package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jae extends jal {
    private final rti a;

    public jae(rti rtiVar) {
        if (rtiVar != null) {
            this.a = rtiVar;
            return;
        }
        throw new NullPointerException("Null sim");
    }

    @Override // defpackage.jal
    public final rti a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jal) {
            return this.a.equals(((jal) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SimPickedEvent{sim=" + this.a.toString() + "}";
    }
}
