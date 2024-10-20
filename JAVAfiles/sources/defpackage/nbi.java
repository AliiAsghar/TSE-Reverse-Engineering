package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbi extends nbk {
    private final MessageId a;
    private final nbg b;
    private final atok c;
    private final int e = 7;
    private final nbh d = nbh.a;

    public nbi(MessageId messageId, nbg nbgVar, atok atokVar) {
        this.a = messageId;
        this.b = nbgVar;
        this.c = atokVar;
    }

    @Override // defpackage.nbk
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.nbk
    public final nbg b() {
        return this.b;
    }

    @Override // defpackage.nbk
    public final nbh c() {
        return this.d;
    }

    @Override // defpackage.nbk
    public final atok d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbi)) {
            return false;
        }
        nbi nbiVar = (nbi) obj;
        if (!d.F(this.a, nbiVar.a) || !d.F(this.b, nbiVar.b)) {
            return false;
        }
        int i = nbiVar.e;
        if (d.F(this.c, nbiVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        a.bm(7);
        return (((hashCode * 31) + 7) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionAddInfo(reactedMessageId=" + this.a + ", reaction=" + this.b + ", surface=" + ((Object) wch.l()) + ", traceId=" + this.c + ")";
    }
}
