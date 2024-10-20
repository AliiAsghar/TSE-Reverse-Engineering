package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aacc extends aade {
    private final rry a;

    public aacc(rry rryVar) {
        this.a = rryVar;
    }

    @Override // defpackage.aade
    public final rry a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aade) {
            return this.a.equals(((aade) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CheckOptionsClickEvent{conversationMessageData=" + this.a.toString() + "}";
    }
}
