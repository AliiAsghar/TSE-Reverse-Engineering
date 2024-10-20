package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqu extends arrp implements arqr<cqv, Boolean> {
    final /* synthetic */ arsb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqu(arsb arsbVar) {
        super(1);
        this.a = arsbVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        arsb arsbVar = this.a;
        cqv cqvVar = (cqv) obj;
        if (arsbVar.a == null && cqvVar.c) {
            arsbVar.a = cqvVar;
        }
        return true;
    }
}
