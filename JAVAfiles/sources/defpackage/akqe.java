package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class akqe extends akpn {
    private final akrl a;

    public akqe(String str, akry akryVar, akrl akrlVar, akru akruVar) {
        super(str, akryVar, akruVar);
        d.s(akrlVar.d);
        this.a = akrlVar;
    }

    @Override // defpackage.akry
    public final akrl i() {
        return akrl.e(this.a, l());
    }

    @Override // defpackage.akry
    public akri j(aktp aktpVar) {
        return akrl.j(aktpVar, i());
    }

    public akqe(String str, UUID uuid, akrl akrlVar, akru akruVar) {
        super(str, uuid, akruVar);
        d.s(akrlVar.d);
        this.a = akrlVar;
    }
}
