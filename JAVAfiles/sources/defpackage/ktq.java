package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktq extends ktt {
    private final ksq a;

    public ktq(ksq ksqVar) {
        this.a = ksqVar;
    }

    @Override // defpackage.ktt
    public final ksq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktt) {
            return this.a.equals(((ktt) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FeedbackDataDetailRequestedEvent{feedbackData=" + this.a.toString() + "}";
    }
}
