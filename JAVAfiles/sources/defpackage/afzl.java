package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzl extends arrp implements arqr {
    final /* synthetic */ czj a;
    final /* synthetic */ dqv b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzl(czj czjVar, dqv dqvVar, float f) {
        super(1);
        this.a = czjVar;
        this.b = dqvVar;
        this.c = f;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i;
        long j = ((dri) obj).a;
        afzd afzdVar = (afzd) this.a.a;
        if (afzdVar != null) {
            if (((int) (j & 4294967295L)) == this.b.eo(this.c)) {
                i = 2;
            } else {
                i = 1;
            }
            afzdVar.setImportantForAccessibility(i);
        }
        return arnb.a;
    }
}
