package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.provisioning.singleregistration.SingleRegistrationVendorImsService;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mle implements BiFunction {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ mle(int i) {
        this.b = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.b) {
            case 0:
                return BiFunction$CC.$default$andThen(this, function);
            case 1:
                return BiFunction$CC.$default$andThen(this, function);
            case 2:
                return BiFunction$CC.$default$andThen(this, function);
            case 3:
                return BiFunction$CC.$default$andThen(this, function);
            case 4:
                return BiFunction$CC.$default$andThen(this, function);
            case 5:
                return BiFunction$CC.$default$andThen(this, function);
            case 6:
                return BiFunction$CC.$default$andThen(this, function);
            case 7:
                return BiFunction$CC.$default$andThen(this, function);
            case 8:
                return BiFunction$CC.$default$andThen(this, function);
            case 9:
                return BiFunction$CC.$default$andThen(this, function);
            case 10:
                return BiFunction$CC.$default$andThen(this, function);
            case 11:
                return BiFunction$CC.$default$andThen(this, function);
            case 12:
                return BiFunction$CC.$default$andThen(this, function);
            case 13:
                return BiFunction$CC.$default$andThen(this, function);
            case 14:
                return BiFunction$CC.$default$andThen(this, function);
            case 15:
                return BiFunction$CC.$default$andThen(this, function);
            case 16:
                return BiFunction$CC.$default$andThen(this, function);
            default:
                throw null;
        }
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        boolean z;
        switch (this.b) {
            case 0:
                return ((mld) obj).x((alog) obj2);
            case 1:
                return ((mld) obj).y((alog) obj2);
            case 2:
                return new Pair((String) obj, (akul) obj2);
            case 3:
                return new RcsMessagingService((Context) obj, (ajoa) obj2);
            case 4:
                return new SingleRegistrationVendorImsService((Context) obj, (ajoa) obj2);
            case 5:
                return new RcsEngineLifecycleService((Context) obj, (ajoa) obj2);
            case 6:
                return new RcsEngineLifecycleServiceV2((Context) obj, (ajoa) obj2);
            case 7:
                aozy aozyVar = (aozy) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                xgx xgxVar = (xgx) aozyVar.b;
                xgx xgxVar2 = xgx.a;
                xgxVar.h = intValue;
                return aozyVar;
            case 8:
                aozy aozyVar2 = (aozy) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                xgx xgxVar3 = (xgx) aozyVar2.b;
                xgx xgxVar4 = xgx.a;
                xgxVar3.d = intValue2;
                return aozyVar2;
            case 9:
                aozy aozyVar3 = (aozy) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                xgx xgxVar5 = (xgx) aozyVar3.b;
                xgx xgxVar6 = xgx.a;
                xgxVar5.f = intValue3;
                return aozyVar3;
            case 10:
                aozy aozyVar4 = (aozy) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                xgx xgxVar7 = (xgx) aozyVar4.b;
                xgx xgxVar8 = xgx.a;
                xgxVar7.i = intValue4;
                return aozyVar4;
            case 11:
                aozy aozyVar5 = (aozy) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                xgx xgxVar9 = (xgx) aozyVar5.b;
                xgx xgxVar10 = xgx.a;
                xgxVar9.g = intValue5;
                return aozyVar5;
            case 12:
                aozy aozyVar6 = (aozy) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                xgx xgxVar11 = (xgx) aozyVar6.b;
                xgx xgxVar12 = xgx.a;
                xgxVar11.e = intValue6;
                return aozyVar6;
            case 13:
                return null;
            case 14:
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) obj2).longValue();
                long j = longValue + longValue2;
                long j2 = longValue2 ^ longValue;
                long j3 = longValue ^ j;
                boolean z2 = true;
                if (j2 < 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (j3 < 0) {
                    z2 = false;
                }
                if (z | z2) {
                    return Long.valueOf(j);
                }
                throw new ArithmeticException();
            case 15:
                return Long.valueOf(Math.max(((Long) obj).longValue(), ((Long) obj2).longValue()));
            case 16:
                ((Integer) obj).intValue();
                alvi alviVar = aidd.a;
                if (((Optional) obj2).isPresent()) {
                    return Optional.empty();
                }
                return Optional.of(agxw.j());
            default:
                throw null;
        }
    }
}
