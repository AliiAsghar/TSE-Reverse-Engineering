package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqb extends adpw {
    private final Context i;
    private final acoc j;

    public adqb(adew adewVar, adqg adqgVar, adqa adqaVar, adwe adweVar, Context context, acoc acocVar) {
        super(adewVar, adqgVar, adqaVar, adweVar);
        this.i = context;
        this.j = acocVar;
    }

    private final void u(int i) {
        aozy createBuilder = aphe.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aphe apheVar = (aphe) apagVar;
        apheVar.e = 1;
        apheVar.b = 1 | apheVar.b;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aphe apheVar2 = (aphe) createBuilder.b;
        apheVar2.d = Integer.valueOf(i - 1);
        apheVar2.c = 2;
        aphe apheVar3 = (aphe) createBuilder.s();
        acoc acocVar = this.j;
        Context context = this.i;
        aozy createBuilder2 = apkr.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apkr apkrVar = (apkr) createBuilder2.b;
        apheVar3.getClass();
        apkrVar.d = apheVar3;
        apkrVar.c = 14;
        acocVar.i(context, createBuilder2, apkj.UNEXPECTED_EVENT);
    }

    @Override // defpackage.adpw
    public final void s(String str, long j, String str2) {
        u(3);
    }

    @Override // defpackage.adpw
    public final void t(String str) {
        u(2);
    }

    @Override // defpackage.adou
    public final void m() {
    }

    @Override // defpackage.adou
    public final void n() {
    }
}
