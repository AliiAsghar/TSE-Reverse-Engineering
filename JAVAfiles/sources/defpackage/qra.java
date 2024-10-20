package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qra {
    public static final alwo a = alwo.o("BugleConversation");
    static final uuf b = uuh.i(uuh.b, "log_destinations_from_telephony", true);
    public static final uuf c = uuh.i(uuh.b, "bug_182819110", false);
    public final anen d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final qqq h;
    public final armf i;

    public qra(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, qqq qqqVar) {
        this.e = armfVar;
        this.f = armfVar2;
        this.d = anenVar;
        this.g = armfVar4;
        this.h = qqqVar;
        this.i = armfVar3;
    }

    public static amqw a(qqo qqoVar) {
        String str;
        aozy createBuilder = amqw.a.createBuilder();
        uuf uufVar = c;
        if (((Boolean) uufVar.e()).booleanValue()) {
            str = qqoVar.b;
        } else {
            str = qqoVar.c;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amqw amqwVar = (amqw) apagVar;
        amqwVar.b |= 2;
        amqwVar.f = str;
        String str2 = qqoVar.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amqw amqwVar2 = (amqw) createBuilder.b;
        amqwVar2.b |= 1;
        amqwVar2.e = str2;
        qqp qqpVar = qqoVar.d;
        if (qqpVar != null) {
            aozy createBuilder2 = amqx.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amqx amqxVar = (amqx) createBuilder2.b;
            amqxVar.b |= 2;
            amqxVar.d = qqpVar.c;
            if (((Boolean) uufVar.e()).booleanValue() && qqpVar.a.isPresent()) {
                int i = ((yjt) qqpVar.a.get()).a;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amqx amqxVar2 = (amqx) createBuilder2.b;
                amqxVar2.b |= 1;
                amqxVar2.c = i;
            }
            amqx amqxVar3 = (amqx) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amqw amqwVar3 = (amqw) createBuilder.b;
            amqxVar3.getClass();
            amqwVar3.d = amqxVar3;
            amqwVar3.c = 3;
        }
        amqv amqvVar = qqoVar.e;
        if (amqvVar != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amqw amqwVar4 = (amqw) createBuilder.b;
            amqwVar4.d = amqvVar;
            amqwVar4.c = 5;
        }
        amqy amqyVar = qqoVar.f;
        if (amqyVar != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amqw amqwVar5 = (amqw) createBuilder.b;
            amqwVar5.d = amqyVar;
            amqwVar5.c = 4;
        }
        return (amqw) createBuilder.s();
    }

    public static amri b(qqo qqoVar) {
        aozy createBuilder = amri.a.createBuilder();
        qqp qqpVar = qqoVar.d;
        if (qqpVar == null) {
            return (amri) createBuilder.s();
        }
        boolean isPresent = qqpVar.b.isPresent();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amri amriVar = (amri) createBuilder.b;
        amriVar.b |= 1;
        amriVar.c = isPresent;
        Optional optional = qqpVar.a;
        if (optional.isPresent()) {
            int i = ((yjt) optional.get()).a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            long j = i;
            amri amriVar2 = (amri) createBuilder.b;
            amriVar2.b |= 2;
            amriVar2.d = j;
        }
        return (amri) createBuilder.s();
    }

    public static int c(rto rtoVar) {
        int G = rtoVar.G();
        if (G == 0) {
            return 2;
        }
        if (G != 1) {
            if (G != 2) {
                return 1;
            }
            return 4;
        }
        return 3;
    }
}
