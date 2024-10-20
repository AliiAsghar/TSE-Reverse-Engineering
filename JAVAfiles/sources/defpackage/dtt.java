package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtt extends dtp {
    final /* synthetic */ dtu c;

    public dtt(dtu dtuVar) {
        this.c = dtuVar;
    }

    @Override // defpackage.dtp
    protected final String b() {
        dtq dtqVar = (dtq) this.c.a.get();
        if (dtqVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + dtqVar.a + "]";
    }
}
