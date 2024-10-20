package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xgu implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ xgu(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                xgy xgyVar = (xgy) obj;
                alvi alviVar = xgw.a;
                aozy builder = xgyVar.toBuilder();
                aozy createBuilder = xgx.a.createBuilder();
                xgx xgxVar = xgyVar.c;
                if (xgxVar == null) {
                    xgxVar = xgx.a;
                }
                int i = xgxVar.c + 1;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((xgx) createBuilder.b).c = i;
                builder.ag((xgx) createBuilder.s());
                return (xgy) builder.s();
            case 1:
                alvi alviVar2 = xgw.a;
                aozy builder2 = ((xgy) obj).toBuilder();
                aozy createBuilder2 = xgx.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((xgx) createBuilder2.b).b = false;
                xgx xgxVar2 = (xgx) createBuilder2.s();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                xgy xgyVar2 = (xgy) builder2.b;
                xgxVar2.getClass();
                xgyVar2.c = xgxVar2;
                xgyVar2.b |= 1;
                return (xgy) builder2.s();
            case 2:
                return upm.e();
            case 3:
                return upm.b();
            case 4:
                return uvl.a((Map) obj);
            case 5:
                utz utzVar = xjw.a;
                return null;
            case 6:
                xju xjuVar = (xju) obj;
                utz utzVar2 = xjw.a;
                if ((xjuVar.b & 8) != 0) {
                    apct apctVar = xjuVar.f;
                    if (apctVar == null) {
                        apctVar = apct.a;
                    }
                    return aotl.l(apctVar);
                }
                return xjw.c;
            case 7:
                utz utzVar3 = xjw.a;
                aozy builder3 = ((xju) obj).toBuilder();
                apct j = aotl.j(xjw.d);
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                xju xjuVar2 = (xju) builder3.b;
                j.getClass();
                xjuVar2.e = j;
                xjuVar2.b |= 4;
                apct j2 = aotl.j(xjw.c);
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                xju xjuVar3 = (xju) builder3.b;
                j2.getClass();
                xjuVar3.d = j2;
                xjuVar3.b |= 2;
                return (xju) builder3.s();
            case 8:
                utz utzVar4 = xjw.a;
                return null;
            case 9:
                return Boolean.valueOf(((xju) obj).c);
            case 10:
                utz utzVar5 = xjw.a;
                return null;
            case 11:
                utz utzVar6 = xjw.a;
                aozy builder4 = ((xju) obj).toBuilder();
                boolean booleanValue = ((Boolean) ((utz) wzp.a.get()).e()).booleanValue();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                xju xjuVar4 = (xju) builder4.b;
                xjuVar4.b |= 16;
                xjuVar4.g = booleanValue;
                return (xju) builder4.s();
            case 12:
                xju xjuVar5 = (xju) obj;
                utz utzVar7 = xjw.a;
                if ((xjuVar5.b & 4) != 0) {
                    apct apctVar2 = xjuVar5.e;
                    if (apctVar2 == null) {
                        apctVar2 = apct.a;
                    }
                    return aotl.l(apctVar2);
                }
                return xjw.d;
            case 13:
                xju xjuVar6 = (xju) obj;
                utz utzVar8 = xjw.a;
                if ((xjuVar6.b & 2) != 0) {
                    apct apctVar3 = xjuVar6.d;
                    if (apctVar3 == null) {
                        apctVar3 = apct.a;
                    }
                    return aotl.l(apctVar3);
                }
                return xjw.c;
            case 14:
                utz utzVar9 = xjw.a;
                return null;
            case 15:
                return new gsw();
            case 16:
                return Optional.of((UUID) obj);
            case 17:
                Stream filter = Collection.EL.stream((List) obj).filter(new wjl(15));
                int i2 = alog.d;
                return (alog) filter.collect(alls.a);
            case 18:
                xjo xjoVar = new xjo();
                xjoVar.b((String) obj);
                return xjoVar.a();
            case 19:
                xjo xjoVar2 = new xjo();
                xjoVar2.b((String) obj);
                return xjoVar2.a();
            default:
                alvw i3 = xql.a.i();
                i3.X(alwp.a, "BugleFileTransfer");
                ((alvg) ((alvg) ((alvg) i3).g((IOException) obj)).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 385, "FileDownloadCompletedHandler.java")).q("Unable to complete the incoming file transfer.");
                return upm.d();
        }
    }
}
