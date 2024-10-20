package defpackage;

import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adho extends adhm {
    final /* synthetic */ adhw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adho(adhw adhwVar) {
        super(adhwVar);
        this.c = adhwVar;
    }

    @Override // defpackage.adhm, defpackage.acyi, defpackage.acyh
    public final String a() {
        return "ReregisteringState";
    }

    @Override // defpackage.adhm
    protected final void h(aioo aiooVar) {
        aikb aikbVar = this.c.r.a;
        if (!Objects.isNull(aikbVar)) {
            this.c.D = g(aiooVar);
            i(aikbVar, aiooVar);
            adhw adhwVar = this.c;
            adhwVar.w(adhwVar.ab);
            return;
        }
        throw new aild("Null SipStack");
    }
}
