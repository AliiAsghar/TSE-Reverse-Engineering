package defpackage;

import com.google.android.apps.messaging.rcsprovisioning.singleregistration.SingleRegistrationCapabilityReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mhp implements ancs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mhp(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i;
        switch (this.c) {
            case 0:
                return ((mie) ((mic) this.b).F.b()).a(this.a);
            case 1:
                return ((lta) ((SingleRegistrationCapabilityReceiver) this.b).e.b()).a(this.a, aphg.TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE_INTENT);
            case 2:
                return ((mui) this.b).g.d((alog) obj, this.a, false);
            case 3:
                return ((mui) this.b).g.d((alog) obj, this.a, true);
            case 4:
                return ((mui) ((mzs) this.b).a).g.e((nae) obj, 0, this.a);
            case 5:
                adms admsVar = (adms) this.b;
                Optional D = admsVar.l.a((qvo) obj).D();
                int i2 = this.a;
                Optional E = admsVar.E(i2);
                if (D.isEmpty()) {
                    return admsVar.F(18, i2, false);
                }
                if (E.isEmpty()) {
                    return admsVar.F(18, i2, true);
                }
                if (!((String) D.get()).equals(E.get())) {
                    return admsVar.F(19, i2, true);
                }
                return aktp.ag(null);
            case 6:
                aozy createBuilder = ajzw.a.createBuilder();
                int i3 = this.a;
                if (i3 == -1) {
                    i = 1;
                } else {
                    i = i3 + 1;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.b;
                ajzw ajzwVar = (ajzw) createBuilder.b;
                ajzwVar.b = 1 | ajzwVar.b;
                ajzwVar.c = i;
                return ((ahmn) obj2).g(albo.bI((ajzw) createBuilder.s()));
            default:
                return ((akbj) this.b).d(this.a);
        }
    }
}
