package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwo extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public gwo(arpe arpeVar) {
        super(3, arpeVar);
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gwo gwoVar = new gwo((arpe) obj3);
        gwoVar.c = (asaj) obj;
        gwoVar.b = (Object[]) obj2;
        return gwoVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [asaj, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        gvf gvfVar;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ?? r7 = this.c;
            gvf[] gvfVarArr = (gvf[]) this.b;
            int length = gvfVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    gvfVar = gvfVarArr[i2];
                    if (!d.F(gvfVar, gwh.a)) {
                        break;
                    }
                    i2++;
                } else {
                    gvfVar = null;
                    break;
                }
            }
            if (gvfVar == null) {
                gvfVar = gwh.a;
            }
            this.a = 1;
            if (r7.fv(gvfVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }
}
