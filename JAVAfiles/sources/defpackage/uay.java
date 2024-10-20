package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uay extends arpw implements arqw {
    int a;
    final /* synthetic */ armf b;
    final /* synthetic */ armf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uay(armf armfVar, armf armfVar2, arpe arpeVar) {
        super(3, arpeVar);
        this.b = armfVar;
        this.c = armfVar2;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        uay uayVar = new uay(this.b, this.c, (arpe) obj3);
        uayVar.d = (uba) obj;
        return uayVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ConversationIdType b = ruy.b(((uba) this.d).b);
            xyo a = uaz.a.a();
            a.H("Running TombstoneManagerOnRcsGroupE2eeStatusChangeHandler");
            a.b(b);
            a.q();
            if (!((ubl) this.b.b()).c(b)) {
                tzn tznVar = (tzn) this.c.b();
                ((tzr) tznVar.j.b()).a(8);
                tzc tzcVar = (tzc) tznVar.h.b();
                xyo c = tzc.a.c();
                c.H("onEncryptionStatusChanged");
                c.z("conversationId", b);
                c.q();
                akul d = ((uie) tzcVar.c.b()).d("GroupProtocolChangeTombstoneManager#onEncryptionStatusChanged", new ryv(tzcVar, b, 8, null));
                d.getClass();
                this.a = 1;
                if (arro.F(d, this) == arplVar) {
                    return arplVar;
                }
            } else {
                xyo a2 = uaz.a.a();
                a2.H("Skipping call to tombstone manager as conversation is already focused");
                a2.b(b);
                a2.q();
            }
        }
        return upm.b();
    }
}
