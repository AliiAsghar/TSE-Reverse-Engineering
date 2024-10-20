package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahw extends aahz {
    private final SelectedConversation a;
    private final amfe b;

    public aahw(SelectedConversation selectedConversation, amfe amfeVar) {
        this.a = selectedConversation;
        if (amfeVar != null) {
            this.b = amfeVar;
            return;
        }
        throw new NullPointerException("Null origin");
    }

    @Override // defpackage.aahz
    public final SelectedConversation a() {
        return this.a;
    }

    @Override // defpackage.aahz
    public final amfe b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aahz) {
            aahz aahzVar = (aahz) obj;
            if (this.a.equals(aahzVar.a()) && this.b.equals(aahzVar.b())) {
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
        return "ConversationDeleteEvent{selectedConversation=" + this.a.toString() + ", origin=" + amfeVar.toString() + "}";
    }
}
