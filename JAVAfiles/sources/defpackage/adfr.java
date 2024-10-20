package defpackage;

import android.content.Context;
import android.telephony.ims.ImsRegistrationAttributes;
import j$.util.Collection;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfr {
    private final Context a;
    private final acoc b;

    public adfr(Context context, acoc acocVar) {
        this.a = context;
        this.b = acocVar;
    }

    public static final int c(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return 1;
        }
        return 3;
    }

    public final void a(apgu apguVar) {
        aozy createBuilder = apgv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apgv apgvVar = (apgv) apagVar;
        apgvVar.f = 6;
        apgvVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apgv apgvVar2 = (apgv) apagVar2;
        apgvVar2.g = 2;
        apgvVar2.b |= 4;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        Context context = this.a;
        acoc acocVar = this.b;
        apgv apgvVar3 = (apgv) createBuilder.b;
        apguVar.getClass();
        apgvVar3.d = apguVar;
        apgvVar3.c = 8;
        acocVar.h(context, (apgv) createBuilder.s());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ImsRegistrationAttributes imsRegistrationAttributes, boolean z) {
        Set featureTags;
        int transportType;
        int i;
        aozy createBuilder = apgk.a.createBuilder();
        featureTags = imsRegistrationAttributes.getFeatureTags();
        Collection.EL.stream(featureTags).forEach(new acsa(createBuilder, 18));
        transportType = imsRegistrationAttributes.getTransportType();
        int c = c(transportType);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgk apgkVar = (apgk) createBuilder.b;
        apgkVar.d = c - 1;
        apgkVar.b |= 1;
        int registrationTechnology = imsRegistrationAttributes.getRegistrationTechnology();
        int i2 = 3;
        if (registrationTechnology != 0) {
            if (registrationTechnology != 1) {
                i = 1;
            } else {
                i = 3;
            }
        } else {
            i = 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgk apgkVar2 = (apgk) createBuilder.b;
        apgkVar2.e = i - 1;
        apgkVar2.b |= 2;
        aozy createBuilder2 = apgu.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        if (true == z) {
            i2 = 2;
        }
        apag apagVar = createBuilder2.b;
        apgu apguVar = (apgu) apagVar;
        apguVar.c = i2 - 1;
        apguVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apgu apguVar2 = (apgu) createBuilder2.b;
        apgk apgkVar3 = (apgk) createBuilder.s();
        apgkVar3.getClass();
        apguVar2.d = apgkVar3;
        apguVar2.b |= 2;
        a((apgu) createBuilder2.s());
    }
}
