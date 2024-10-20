package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bae extends arrp implements arqg<Boolean> {
    final /* synthetic */ bac a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bae(bac bacVar) {
        super(0);
        this.a = bacVar;
    }

    @Override // defpackage.arqg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean a() {
        dhv dhvVar;
        bac bacVar = this.a;
        dhv dhvVar2 = bacVar.b;
        diy a = bacVar.a();
        if (a != null) {
            dhvVar = a.a.a;
        } else {
            dhvVar = null;
        }
        return Boolean.valueOf(d.F(dhvVar2, dhvVar));
    }
}
