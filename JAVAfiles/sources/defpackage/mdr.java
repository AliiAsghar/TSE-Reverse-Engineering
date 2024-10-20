package defpackage;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdr implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ mdr(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                int i = mdt.d;
                apct apctVar = ((mdn) obj).m;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                return aotl.l(apctVar);
            case 1:
                return true;
            case 2:
                return Long.valueOf(((mdn) obj).j);
            case 3:
                return Long.valueOf(((mdn) obj).d);
            case 4:
                return Long.valueOf(((mdn) obj).i);
            case 5:
                return Long.valueOf(((mdn) obj).f);
            case 6:
                return Long.valueOf(((mdn) obj).h);
            case 7:
                return Long.valueOf(((mdn) obj).g);
            case 8:
                return true;
            case 9:
                return ((mdn) obj).k;
            case 10:
                return uvl.a((Map) obj);
            case 11:
                return (String) ((Optional) obj).orElse("NO_REFERRER");
            case 12:
                if (((Long) obj).longValue() < mfo.f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                xze xzeVar = mfo.a;
                return aotl.j(((Instant) obj).truncatedTo(ChronoUnit.DAYS));
            case 14:
                mfo.a.m("Failed to upload firstHomeScreenVisitDay: ".concat(String.valueOf(((Exception) obj).getMessage())));
                return apct.a;
            case 15:
                return ((yfb) obj).d();
            case 16:
                alhr alhrVar = mic.h;
                aozy createBuilder = amim.a.createBuilder();
                long longValue = ((Long) obj).longValue();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amim amimVar = (amim) createBuilder.b;
                amimVar.b |= 1;
                amimVar.c = longValue;
                return (amim) createBuilder.s();
            case 17:
                alwo alwoVar = mkt.a;
                return mks.SUCCEEDED;
            case 18:
                Stream flatMap = Collection.EL.stream((List) obj).flatMap(new mfk(20));
                int i2 = alog.d;
                return (alog) flatMap.collect(alls.a);
            case 19:
                alwo alwoVar2 = mmg.a;
                if (((Integer) obj).intValue() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                alwo alwoVar3 = mmg.a;
                if (((Integer) obj).intValue() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
