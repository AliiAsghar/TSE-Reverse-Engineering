package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tsy {
    private static final xze a = xze.g("BugleEtouffee", "ConversationDraftEncryptionUpdater");
    private final armf b;
    private final armf c;

    public tsy(armf armfVar, armf armfVar2) {
        this.b = armfVar;
        this.c = armfVar2;
    }

    public final void a(String str, boolean z) {
        if (ttd.a()) {
            if (!z && tte.h()) {
                aluq listIterator = ((rtz) this.b.b()).E(str).listIterator();
                while (listIterator.hasNext()) {
                    ConversationIdType conversationIdType = (ConversationIdType) listIterator.next();
                    xyo c = a.c();
                    c.H("Disable encryption on the conversation.");
                    c.b(conversationIdType);
                    c.q();
                    ((tsa) this.c.b()).j(conversationIdType, 0, uax.DEFAULT);
                }
                return;
            }
            snf e = sni.e();
            e.w("onEncryptionStatusUpdate");
            e.h(new tkg(str, 19));
            sna snaVar = (sna) e.b().n();
            try {
                if (snaVar.moveToFirst()) {
                    smr smrVar = (smr) snaVar.cK();
                    if (tte.h()) {
                        xyo c2 = a.c();
                        c2.H("Update encryption status.");
                        c2.b(smrVar.x());
                        c2.A("encryptionEnabled", z);
                        c2.q();
                    }
                    ((tsa) this.c.b()).j(smrVar.x(), z ? 1 : 0, uax.DEFAULT);
                }
                snaVar.close();
            } catch (Throwable th) {
                try {
                    snaVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
