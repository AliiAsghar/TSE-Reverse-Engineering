package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwl extends arrp implements arqg<arnb> {
    final /* synthetic */ bwk a;
    final /* synthetic */ cay b;
    final /* synthetic */ caa c;
    final /* synthetic */ byi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwl(bwk bwkVar, cay cayVar, caa caaVar, byi byiVar) {
        super(0);
        this.a = bwkVar;
        this.b = cayVar;
        this.c = caaVar;
        this.d = byiVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        bwk bwkVar = this.a;
        caz cazVar = bwkVar.x;
        cay cayVar = this.b;
        caa caaVar = this.c;
        byi byiVar = this.d;
        cay cayVar2 = cazVar.a;
        try {
            cazVar.a = cayVar;
            caa caaVar2 = bwkVar.r;
            int[] iArr = bwkVar.g;
            tx txVar = bwkVar.A;
            bwkVar.g = null;
            bwkVar.A = null;
            try {
                bwkVar.r = caaVar;
                boolean z = cazVar.d;
                try {
                    cazVar.d = false;
                    bwk.aj(bwkVar, byiVar.a, byiVar.g, byiVar.b);
                    cazVar.a = cayVar2;
                    return arnb.a;
                } finally {
                    cazVar.d = z;
                }
            } finally {
                bwkVar.r = caaVar2;
                bwkVar.g = iArr;
                bwkVar.A = txVar;
            }
        } catch (Throwable th) {
            cazVar.a = cayVar2;
            throw th;
        }
    }
}
