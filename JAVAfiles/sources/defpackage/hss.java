package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hss implements hse {
    public static final hni a = new hni("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, hni.a);
    private final hgi b;

    public hss(hgi hgiVar) {
        this.b = hgiVar;
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ kkc b(Object obj, int i, int i2, hnj hnjVar) {
        hgi hgiVar = this.b;
        hrv hrvVar = (hrv) obj;
        if (hgiVar != null) {
            hrv hrvVar2 = (hrv) hgiVar.f(hrvVar, 0, 0);
            if (hrvVar2 == null) {
                this.b.g(hrvVar, 0, 0, hrvVar);
            } else {
                hrvVar = hrvVar2;
            }
        }
        return new kkc(hrvVar, new hob(hrvVar, ((Integer) hnjVar.b(a)).intValue()));
    }

    public hss() {
        this(null);
    }
}
