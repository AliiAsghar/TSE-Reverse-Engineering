package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpa extends agnx {
    public xpa() {
        super("file_transfer", "$primary");
    }

    @Override // defpackage.agnx
    public final /* bridge */ /* synthetic */ aday a() {
        agny n = this.b.n();
        agpw agpwVar = this.a;
        if (agpwVar == null) {
            agpwVar = new agpw(new xpe());
        }
        return new aday(n, agpwVar);
    }

    public final void b(xpe xpeVar) {
        this.a = new agpw(xpeVar);
    }
}
