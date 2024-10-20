package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvm {
    public alog a;
    public int b;
    private final eyy c;
    private final fwa d;
    private boolean e;

    /* JADX WARN: Type inference failed for: r0v2, types: [eyy, java.lang.Object] */
    public fvm(hka hkaVar) {
        this.a = (alog) hkaVar.d;
        this.c = hkaVar.c;
        this.d = (fwa) hkaVar.e;
        this.b = hkaVar.a;
        this.e = hkaVar.b;
    }

    public final hka a() {
        boolean z;
        alog alogVar = this.a;
        int i = this.b;
        if (this.e && i == 0) {
            z = true;
        } else {
            z = false;
        }
        return new hka(alogVar, this.c, this.d, i, z);
    }

    public fvm(atkn atknVar, atkn... atknVarArr) {
        alob alobVar = new alob();
        alobVar.h(atknVar);
        alobVar.i(atknVarArr);
        alog g = alobVar.g();
        d.t(!g.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
        this.a = alog.n(g);
        this.c = eyy.a;
        this.d = fwa.a;
    }
}
