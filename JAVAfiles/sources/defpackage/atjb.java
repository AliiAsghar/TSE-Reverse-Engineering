package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjb implements atje {
    public final atjf a;

    private atjb(atjf atjfVar) {
        this.a = atjfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static atje b(atjf atjfVar) {
        if (atjfVar instanceof atjf) {
            return atjfVar;
        }
        if (atjfVar == null) {
            return null;
        }
        return new atjb(atjfVar);
    }

    @Override // defpackage.atje
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        return this.a.a.c(atjaVar, charSequence.toString(), i);
    }
}
