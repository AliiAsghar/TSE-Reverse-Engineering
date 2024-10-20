package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzp implements ncq {
    public final Object a;
    public final Object b;
    private final arwe c;
    private final /* synthetic */ int d;

    public kzp(arwe arweVar, ConversationId conversationId, ncq ncqVar, int i) {
        this.d = i;
        this.c = arweVar;
        this.a = conversationId;
        this.b = ncqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, java.lang.Object] */
    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        int i = this.d;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return this.a.l().a(ncpVar);
                    }
                    return this.b.a(ncpVar);
                }
                return yyb.aK(this.b.a(ncpVar), this.a.a(ncpVar));
            }
            return ((yyt) this.b).w(new kzq(ncpVar, i2), "GroupUpgradeCounterSupplier::register", "GroupUpgradeCounterSupplier::callback", "GroupUpgradeCounterSupplier::unregister");
        }
        yga a = ((ncq) this.b.get()).a(ncpVar);
        a.getClass();
        return a;
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul c;
        akul c2;
        akul c3;
        akul c4;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        c4 = qjh.c(this.c, arpj.a, arwf.a, new lgp(this, (arpe) null, 16, (byte[]) null));
                        return c4;
                    }
                    c3 = qjh.c(this.c, arpj.a, arwf.a, new lgp(this, (arpe) null, 15));
                    return c3;
                }
                c2 = qjh.c(this.c, arpj.a, arwf.a, new jks(this, (arpe) null, 13, (byte[]) null));
                return c2;
            }
            return qjh.a(arrn.I(this.c, null, null, new kbl(this, (arpe) null, 17), 3));
        }
        c = qjh.c(this.c, arpj.a, arwf.a, new jks(this, (arpe) null, 9));
        return c;
    }

    @Override // defpackage.ncq
    public final /* synthetic */ Object c() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new UnsupportedOperationException();
                    }
                    throw new UnsupportedOperationException();
                }
                throw new armn("An operation is not implemented: Can't be implemented until BugleConversationPropertiesSupplier#getBlocking");
            }
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    public kzp(arwe arweVar, PenpalBotConversationId penpalBotConversationId, BugleConversation bugleConversation, int i) {
        this.d = i;
        this.c = arweVar;
        this.b = penpalBotConversationId;
        this.a = bugleConversation;
    }

    public kzp(arwe arweVar, wfh wfhVar, kwx kwxVar, int i) {
        this.d = i;
        arweVar.getClass();
        wfhVar.getClass();
        this.c = arweVar;
        this.a = kwxVar;
        this.b = wfhVar.Y(new qds(1));
    }

    public kzp(arwe arweVar, nfx nfxVar, int i) {
        this.d = i;
        arweVar.getClass();
        nfxVar.getClass();
        this.c = arweVar;
        this.a = nfxVar;
        alhr D = albo.D(new ezp(this, 17));
        D.getClass();
        this.b = D;
    }

    public kzp(arwe arweVar, ncq ncqVar, ncq ncqVar2, int i) {
        this.d = i;
        arweVar.getClass();
        ncqVar.getClass();
        ncqVar2.getClass();
        this.c = arweVar;
        this.b = ncqVar;
        this.a = ncqVar2;
    }
}
