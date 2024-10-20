package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kok extends koq {
    private final kop a;

    public kok(kop kopVar) {
        this.a = kopVar;
    }

    @Override // defpackage.koq
    public final kop a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof koq) {
            return this.a.equals(((koq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TakeBugReportRequestEvent{eventData=" + this.a.toString() + "}";
    }
}
