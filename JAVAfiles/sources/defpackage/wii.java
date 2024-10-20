package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.EnsureConnectivityStabilizedAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wii implements yao {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wii(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.yao
    public final void w() {
        amhx amhxVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (((aark) this.a).e()) {
                        ((aark) this.a).d();
                        return;
                    }
                    Object obj = this.a;
                    aark aarkVar = (aark) obj;
                    aktp.aj(new aarj(obj, 0), aarkVar.c).h(new aald(obj, 5), aarkVar.c).k(qiu.b(), aarkVar.d);
                    return;
                }
                ((zxf) this.a).a();
                qze qzeVar = ((zxf) this.a).j;
                xyt xytVar = (xyt) qzeVar.a.b();
                xytVar.getClass();
                mbl mblVar = (mbl) qzeVar.b.b();
                mblVar.getClass();
                ThrottledAction ensureConnectivityStabilizedAction = new EnsureConnectivityStabilizedAction(xytVar, mblVar);
                long j = ThrottledAction.r;
                ensureConnectivityStabilizedAction.G().d(ensureConnectivityStabilizedAction, 114, j, j, true);
                return;
            }
            xyo d = min.a.d();
            Object obj2 = this.a;
            min minVar = (min) obj2;
            d.A("Network connectivity updated", ((yaq) minVar.b.a()).n());
            d.q();
            synchronized (obj2) {
                if (!((min) obj2).c(((min) obj2).c)) {
                    amhxVar = ((min) obj2).d(2, ((min) obj2).c);
                } else if (((min) obj2).e != 4) {
                    amhxVar = ((min) obj2).d(3, ((min) obj2).c);
                } else {
                    amhxVar = null;
                }
            }
            if (amhxVar != null) {
                minVar.b(amhxVar);
                return;
            }
            return;
        }
        ((wiv) this.a).k();
    }

    public /* synthetic */ wii(wiv wivVar, int i) {
        this.b = i;
        this.a = wivVar;
    }
}
