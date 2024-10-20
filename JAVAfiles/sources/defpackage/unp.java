package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class unp implements unx {
    @Override // defpackage.unx
    public /* synthetic */ unf a() {
        return upb.g();
    }

    protected abstract akul d(uns unsVar, apbt apbtVar);

    @Override // defpackage.unx
    public /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.unx
    public /* synthetic */ boolean h(apbt apbtVar) {
        return true;
    }

    @Override // defpackage.unx
    public final /* synthetic */ boolean i(byte[] bArr) {
        return upb.f(this, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, apbt] */
    @Override // defpackage.unx
    public final akul q(uns unsVar, alog alogVar) {
        boolean z = true;
        if (alogVar.size() != 1) {
            z = false;
        }
        albo.T(z);
        try {
            return d(unsVar, e().d(((upr) alogVar.get(0)).s()));
        } catch (apba unused) {
            xyo b = D.b();
            b.H("InvalidProtocolBufferException for WorkQueue item of type ");
            b.H(unsVar.a().toString());
            b.q();
            upw upwVar = new upw();
            upwVar.f("SingleItemWorkHandler#processPendingWorkItemRaw");
            upwVar.b(new uje(alogVar, 17));
            upwVar.d();
            return aktp.ag(upm.d());
        }
    }

    @Override // defpackage.unx
    public /* synthetic */ String r() {
        return null;
    }

    @Override // defpackage.unx
    public final /* synthetic */ void g() {
    }
}
