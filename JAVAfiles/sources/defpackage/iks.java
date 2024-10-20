package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iks extends eor {
    public final ConversationIdType a;
    private final arml b;
    private final arml c;
    private final arml d;
    private final arml e;
    private final arml f;

    public iks(eog eogVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        eogVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.a = ruy.b((String) eogVar.a("conversation_id"));
        this.b = armd.a(new gqx(armfVar, this, 12));
        this.c = armd.a(new gqx(armfVar, this, 13));
        this.d = armd.a(new gqx(armfVar2, this, 14));
        this.e = armd.a(new ifa(armfVar3, 9));
        this.f = armd.a(new gqx(armfVar4, this, 15));
    }

    public final ikr a() {
        return (ikr) this.b.a();
    }

    public final ikr b() {
        return (ikr) this.c.a();
    }

    public final ikr c() {
        return (ikr) this.d.a();
    }

    public final ikr e() {
        return (ikr) this.f.a();
    }

    public final ikr f() {
        return (ikr) this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eor
    public final void gi() {
        if (this.b.b()) {
            a().c();
        }
        if (this.c.b()) {
            b().c();
        }
        if (this.d.b()) {
            c().c();
        }
        if (this.e.b()) {
            f().c();
        }
        if (this.f.b()) {
            e().c();
        }
    }
}
