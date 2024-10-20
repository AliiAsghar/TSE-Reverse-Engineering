package defpackage;

import android.content.Context;
import android.telephony.ims.RcsContactUceCapability;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnc {
    static final acyz a;
    static final acyz b;
    public static final /* synthetic */ int c = 0;
    private static final alog d;
    private final Context e;
    private final acoc f;

    static {
        int i = alog.d;
        d = alsx.a;
        a = acyy.b("enable_tuple_info_logging_for_request_availability_api");
        b = acyy.b("enable_tuple_info_logging_for_request_capability_api");
    }

    public acnc(Context context, acoc acocVar) {
        this.e = context;
        this.f = acocVar;
    }

    private final void d(apgv apgvVar) {
        this.f.h(this.e, apgvVar);
    }

    public final void a(long j, int i, int i2, long j2) {
        aozy createBuilder = aphd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aphd aphdVar = (aphd) apagVar;
        aphdVar.b |= 2;
        aphdVar.d = i2;
        if (j2 > 0) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            aphd aphdVar2 = (aphd) createBuilder.b;
            aphdVar2.b |= 4;
            aphdVar2.e = j2;
        }
        aozy createBuilder2 = apgv.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        apgv apgvVar = (apgv) apagVar2;
        apgvVar.b |= 1;
        apgvVar.e = j;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        apgv apgvVar2 = (apgv) apagVar3;
        apgvVar2.f = i - 1;
        apgvVar2.b |= 2;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar4 = createBuilder2.b;
        apgv apgvVar3 = (apgv) apagVar4;
        apgvVar3.g = 3;
        apgvVar3.b |= 4;
        if (!apagVar4.isMutable()) {
            createBuilder2.u();
        }
        apgv apgvVar4 = (apgv) createBuilder2.b;
        aphd aphdVar3 = (aphd) createBuilder.s();
        aphdVar3.getClass();
        apgvVar4.d = aphdVar3;
        apgvVar4.c = 3;
        d((apgv) createBuilder2.s());
    }

    public final void b(long j, int i) {
        aozy createBuilder = apgv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apgv apgvVar = (apgv) apagVar;
        apgvVar.b |= 1;
        apgvVar.e = j;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apgv apgvVar2 = (apgv) apagVar2;
        apgvVar2.f = i - 1;
        apgvVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apgv apgvVar3 = (apgv) createBuilder.b;
        apgvVar3.g = 1;
        apgvVar3.b |= 4;
        d((apgv) createBuilder.s());
    }

    public final void c(long j, int i, List list) {
        boolean z;
        int i2;
        Iterable iterable;
        if ((i == 2 && ((Boolean) b.a()).booleanValue()) || (i == 3 && ((Boolean) a.a()).booleanValue())) {
            z = true;
        } else {
            z = false;
        }
        RcsContactUceCapability rcsContactUceCapability = (RcsContactUceCapability) list.get(0);
        rcsContactUceCapability.getClass();
        if (rcsContactUceCapability.getSourceType() == 1) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        aozy createBuilder = apgv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apgv apgvVar = (apgv) apagVar;
        apgvVar.b |= 1;
        apgvVar.e = j;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apgv apgvVar2 = (apgv) apagVar2;
        apgvVar2.f = i - 1;
        apgvVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apgv apgvVar3 = (apgv) createBuilder.b;
        apgvVar3.g = 2;
        apgvVar3.b |= 4;
        aozy createBuilder2 = aphd.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aphd aphdVar = (aphd) createBuilder2.b;
        aphdVar.c = i2 - 1;
        aphdVar.b |= 1;
        if (z) {
            iterable = (List) Collection.EL.stream(rcsContactUceCapability.getCapabilityTuples()).map(new aand(15)).collect(Collectors.toList());
        } else {
            iterable = d;
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aphd aphdVar2 = (aphd) createBuilder2.b;
        apax apaxVar = aphdVar2.f;
        if (!apaxVar.c()) {
            aphdVar2.f = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, aphdVar2.f);
        aphd aphdVar3 = (aphd) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgv apgvVar4 = (apgv) createBuilder.b;
        aphdVar3.getClass();
        apgvVar4.d = aphdVar3;
        apgvVar4.c = 3;
        d((apgv) createBuilder.s());
    }
}
