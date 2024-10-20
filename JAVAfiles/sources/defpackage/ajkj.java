package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajkj implements ajkq {
    final /* synthetic */ ajkm a;

    public ajkj(ajkm ajkmVar) {
        this.a = ajkmVar;
    }

    @Override // defpackage.ajkq
    public final ajkg a(ajkg ajkgVar) {
        if (ajkgVar instanceof ajko) {
            return ajkgVar;
        }
        return new ajke(-this.a.t(), ajkgVar);
    }
}
