package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahv extends aahy {
    private final alog a;
    private final amfe b;

    public aahv(alog alogVar, amfe amfeVar) {
        if (alogVar != null) {
            this.a = alogVar;
            if (amfeVar != null) {
                this.b = amfeVar;
                return;
            }
            throw new NullPointerException("Null origin");
        }
        throw new NullPointerException("Null conversationIds");
    }

    @Override // defpackage.aahy
    public final alog a() {
        return this.a;
    }

    @Override // defpackage.aahy
    public final amfe b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aahy) {
            aahy aahyVar = (aahy) obj;
            if (alzz.at(this.a, aahyVar.a()) && this.b.equals(aahyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        amfe amfeVar = this.b;
        return "ConversationArchiveEvent{conversationIds=" + this.a.toString() + ", origin=" + amfeVar.toString() + "}";
    }
}
