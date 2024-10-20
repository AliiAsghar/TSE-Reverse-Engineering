package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoky extends aqvh {
    final /* synthetic */ aokz a;
    private aqut b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoky(aokz aokzVar, apsd apsdVar) {
        super(apsdVar);
        this.a = aokzVar;
    }

    @Override // defpackage.aqvh, defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        Status.Code code = status.getCode();
        if (!code.equals(Status.Code.UNAUTHENTICATED) && !code.equals(Status.Code.PERMISSION_DENIED)) {
            aqut aqutVar2 = this.b;
            if (aqutVar2 != null) {
                this.j.c(aqutVar2);
                this.b = null;
            }
            this.j.a(status, aqutVar);
            return;
        }
        aokz aokzVar = this.a;
        synchronized (aokzVar.a) {
            aokzVar.c = aokzVar.d.a(aokzVar.e, aokzVar.f.e(aokf.a, true));
            Iterator it = aokzVar.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.aqvh, defpackage.apsd
    public final void c(aqut aqutVar) {
        this.b = aqutVar;
    }

    @Override // defpackage.aqvh, defpackage.apsd
    public final void d(Object obj) {
        aqut aqutVar = this.b;
        if (aqutVar != null) {
            this.j.c(aqutVar);
            this.b = null;
        }
        this.j.d(obj);
    }
}
