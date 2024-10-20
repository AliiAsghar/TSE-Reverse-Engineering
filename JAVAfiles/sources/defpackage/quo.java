package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class quo extends qwm {
    private final ParticipantsTable.BindData a;
    private final Optional b;

    public quo(ParticipantsTable.BindData bindData, Optional optional) {
        if (bindData != null) {
            this.a = bindData;
            this.b = optional;
            return;
        }
        throw new NullPointerException("Null selfParticipant");
    }

    @Override // defpackage.qwm
    public final ParticipantsTable.BindData a() {
        return this.a;
    }

    @Override // defpackage.qwm
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qwm) {
            qwm qwmVar = (qwm) obj;
            if (this.a.equals(qwmVar.a()) && this.b.equals(qwmVar.b())) {
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
        return "Subscription{selfParticipant=" + this.a.toString() + ", messagingIdentity=" + optional.toString() + "}";
    }
}
