package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afjx extends arpw implements arqr {
    final /* synthetic */ afjy a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjx(afjy afjyVar, int i, arpe arpeVar) {
        super(1, arpeVar);
        this.a = afjyVar;
        this.b = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new afjx(this.a, this.b, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        akyr akyrVar = afjt.a;
        agrk agrkVar = new agrk((short[]) null);
        agrkVar.x("\n      SELECT `value`, `context`, `time`, `search_term`\n      FROM `usages`\n      WHERE `type` = ?\n      ORDER BY `_ROWID_` DESC LIMIT ?\n      ");
        agrkVar.z(this.a.f);
        agrkVar.y(Long.valueOf(this.b));
        agrk J = agrkVar.J();
        afjy afjyVar = this.a;
        return new asae(new hmp(afjyVar, J, (arpe) null, afjyVar, 5));
    }
}
