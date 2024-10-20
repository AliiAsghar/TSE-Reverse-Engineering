package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class unl implements unx {
    @Override // defpackage.unx
    public /* synthetic */ unf a() {
        throw null;
    }

    @Override // defpackage.unx
    public /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.unx
    public final /* synthetic */ boolean h(apbt apbtVar) {
        return true;
    }

    @Override // defpackage.unx
    public final /* synthetic */ boolean i(byte[] bArr) {
        return upb.f(this, bArr);
    }

    public abstract akul j(alog alogVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.unx
    public final akul q(uns unsVar, alog alogVar) {
        apca e = e();
        alob alobVar = new alob();
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            upr uprVar = (upr) alogVar.get(i);
            try {
                alobVar.h(e.d(uprVar.s()));
            } catch (apba unused) {
                xyo b = D.b();
                b.H("InvalidProtocolBufferException for WorkQueue item of type ");
                b.H(unsVar.a().toString());
                b.q();
                upw upwVar = new upw();
                upwVar.f("MultiItemWorkHandler#processPendingWorkItemRaw");
                upwVar.b(new uje(uprVar, 16));
                upwVar.d();
            }
        }
        return j(alobVar.g());
    }

    @Override // defpackage.unx
    public final /* synthetic */ String r() {
        return null;
    }

    @Override // defpackage.unx
    public final /* synthetic */ void g() {
    }
}
