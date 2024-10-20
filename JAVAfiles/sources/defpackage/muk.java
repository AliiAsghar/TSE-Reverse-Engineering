package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muk implements mje {
    public final ResolvedRecipient a;
    public final nfw b;

    public muk() {
        throw null;
    }

    @Override // defpackage.mje
    public final /* synthetic */ int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muk) {
            muk mukVar = (muk) obj;
            if (this.a.equals(mukVar.a) && this.b.equals(mukVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        nfw nfwVar = this.b;
        return "DefaultIncomingMessageProvenance{sender=" + this.a.toString() + ", receivingSelfIdentity=" + nfwVar.toString() + ", messageDetails=null}";
    }

    public muk(ResolvedRecipient resolvedRecipient, nfw nfwVar) {
        this.a = resolvedRecipient;
        this.b = nfwVar;
    }
}
