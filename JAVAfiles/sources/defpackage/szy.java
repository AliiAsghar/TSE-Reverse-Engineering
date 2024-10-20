package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class szy extends agnx {
    public szy() {
        super("parent_disallowed_conversations", "$primary");
    }

    @Override // defpackage.agnx
    public final /* bridge */ /* synthetic */ aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new agpw(new tab());
        }
        return new aday(n, agpwVar);
    }

    public final void b(tab tabVar) {
        this.a = new agpw(tabVar);
    }
}
