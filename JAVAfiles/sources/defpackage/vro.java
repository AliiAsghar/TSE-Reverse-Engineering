package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vro implements vrl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vro(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.vrl
    public final void am(vrm vrmVar) {
        AutoCloseable e;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    boolean booleanValue = ((Boolean) ((utz) wkk.c.get()).e()).booleanValue();
                    Object obj = this.a;
                    if (booleanValue) {
                        try {
                            e = ((wkk) obj).l.b("RcsProvisioningTriggerImpl#onRcsAvailabilityUpdate");
                        } catch (IllegalStateException unused) {
                            aktp.d();
                            e = aktp.e("RcsProvisioningTriggerImpl#onRcsAvailabilityUpdate");
                        }
                        try {
                            ((wkk) obj).t(vrmVar);
                            e.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                e.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    ((wkk) obj).t(vrmVar);
                    return;
                }
                ((wiv) this.a).k();
                return;
            }
            ikc ikcVar = (ikc) this.a;
            xyo a = ikcVar.b.a();
            a.H("onrcsavailabilityupdate");
            amwt amwtVar = vrmVar.a;
            a.z("availability", amwtVar);
            a.q();
            if (amwtVar == amwt.AVAILABLE) {
                ikcVar.f();
                return;
            } else {
                ikcVar.g();
                return;
            }
        }
        ((advd) this.a).b(vrmVar);
    }
}
