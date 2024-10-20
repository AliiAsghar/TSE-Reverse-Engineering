package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajkl extends ejr {
    private final int a;

    public ajkl(int i) {
        this.a = i;
    }

    @Override // defpackage.ejr
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = ajkm.y;
        float[] fArr = ((ajkm) obj).w;
        if (fArr != null) {
            return fArr[this.a];
        }
        return brg.a;
    }

    @Override // defpackage.ejr
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        ajkm ajkmVar = (ajkm) obj;
        int i = ajkm.y;
        float[] fArr = ajkmVar.w;
        if (fArr != null) {
            fArr[this.a] = f;
            ajkmVar.invalidateSelf();
        }
    }
}
