package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rew {
    public final msh a;
    public final ParticipantsTable.BindData b;

    public rew() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rew) {
            rew rewVar = (rew) obj;
            if (this.a.equals(rewVar.a) && this.b.equals(rewVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ParticipantsTable.BindData bindData = this.b;
        return "SenderInfo{messagingIdentity=" + String.valueOf(this.a) + ", rawSender=" + bindData.toString() + "}";
    }

    public rew(msh mshVar, ParticipantsTable.BindData bindData) {
        this.a = mshVar;
        if (bindData == null) {
            throw new NullPointerException("Null rawSender");
        }
        this.b = bindData;
    }
}
