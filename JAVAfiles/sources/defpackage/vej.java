package defpackage;

import android.util.Pair;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vej implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ vej(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((vee) obj).h.H();
            case 1:
                ved b = ved.b(((vee) obj).i);
                if (b == null) {
                    return ved.UNRECOGNIZED;
                }
                return b;
            case 2:
                return null;
            case 3:
                return Long.valueOf(((vee) obj).e);
            case 4:
                return null;
            case 5:
                return ((vee) obj).f.H();
            case 6:
                aozy builder = ((vee) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apag apagVar = builder.b;
                ((vee) apagVar).r = 0;
                if (!apagVar.isMutable()) {
                    builder.u();
                }
                ((vee) builder.b).q = 0L;
                return (vee) builder.s();
            case 7:
                return null;
            case 8:
                vee veeVar = (vee) obj;
                if ((veeVar.b & 32) != 0) {
                    aqhz aqhzVar = veeVar.t;
                    if (aqhzVar == null) {
                        aqhzVar = aqhz.a;
                    }
                    return Optional.of(aqhzVar);
                }
                return Optional.empty();
            case 9:
                vee veeVar2 = (vee) obj;
                ved b2 = ved.b(veeVar2.i);
                if (b2 == null) {
                    b2 = ved.UNRECOGNIZED;
                }
                amkl m = vel.m(b2);
                vec b3 = vec.b(veeVar2.j);
                if (b3 == null) {
                    b3 = vec.UNRECOGNIZED;
                }
                return Pair.create(m, vel.l(b3));
            case 10:
                return ((vee) obj).c;
            case 11:
                return null;
            case 12:
                return (alpt) Collection.EL.stream((alog) obj).map(new vbi(15)).filter(new uzr(6)).map(new vbi(16)).collect(alls.b);
            case 13:
                return ((Optional) obj).flatMap(new vbi(17)).flatMap(new vbi(18));
            case 14:
                ver.m((aqwb) obj);
                return null;
            case 15:
                ver.m((vbd) obj);
                return null;
            case 16:
                return false;
            case 17:
                alvw g = vhi.a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "pullMessagesForPhone", 294, "TachyonReceiverManagerImpl.java")).q("End of pullMessagesForPhone");
                return null;
            case 18:
                return null;
            case 19:
                return ((alor) obj).keySet();
            default:
                return new gsw();
        }
    }
}
