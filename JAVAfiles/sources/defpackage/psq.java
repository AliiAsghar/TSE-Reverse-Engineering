package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psq {
    private static final xze a = xze.g("BugleDataModel", "ChatEndpointFactory");
    private final yjr b;

    public psq(yjr yjrVar) {
        this.b = yjrVar;
    }

    private final String f(String str) {
        return this.b.r(str, true);
    }

    public final qei a(String str, boolean z) {
        if (z) {
            return d(str);
        }
        xze xzeVar = xca.a;
        if (msx.g(str)) {
            return b(str);
        }
        try {
            String f = f(str);
            aozy createBuilder = qei.a.createBuilder();
            qeh qehVar = qeh.PHONE;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            qei qeiVar = (qei) apagVar;
            qeiVar.c = qehVar.e;
            qeiVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            qei qeiVar2 = (qei) createBuilder.b;
            f.getClass();
            qeiVar2.b |= 2;
            qeiVar2.d = f;
            return (qei) createBuilder.s();
        } catch (IllegalArgumentException e) {
            throw psr.a(str, e);
        }
    }

    public final qei b(String str) {
        xze xzeVar = xca.a;
        if (msx.g(str)) {
            aozy createBuilder = qei.a.createBuilder();
            qeh qehVar = qeh.BOT;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            qei qeiVar = (qei) apagVar;
            qeiVar.c = qehVar.e;
            qeiVar.b = 1 | qeiVar.b;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            qei qeiVar2 = (qei) createBuilder.b;
            str.getClass();
            qeiVar2.b |= 2;
            qeiVar2.d = str;
            return (qei) createBuilder.s();
        }
        throw new psr(String.format("%s is not a valid bot id.", str));
    }

    public final qei c(String str) {
        if (this.b.A(str)) {
            aozy createBuilder = qei.a.createBuilder();
            qeh qehVar = qeh.PHONE;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            qei qeiVar = (qei) apagVar;
            qeiVar.c = qehVar.e;
            qeiVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            qei qeiVar2 = (qei) createBuilder.b;
            str.getClass();
            qeiVar2.b |= 2;
            qeiVar2.d = str;
            return (qei) createBuilder.s();
        }
        throw psr.a(str, new IllegalArgumentException("Provided endpoint is not a valid E164 number"));
    }

    public final qei d(String str) {
        if (!str.isEmpty()) {
            aozy createBuilder = qei.a.createBuilder();
            qeh qehVar = qeh.GROUP;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            qei qeiVar = (qei) apagVar;
            qeiVar.c = qehVar.e;
            qeiVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            qei qeiVar2 = (qei) createBuilder.b;
            str.getClass();
            qeiVar2.b |= 2;
            qeiVar2.d = str;
            return (qei) createBuilder.s();
        }
        throw new psr("Group endpoint must have a conference URI");
    }

    public final qei e(msh mshVar, String str) {
        if (mshVar.e().isPresent()) {
            qei qeiVar = (qei) mshVar.e().get();
            qeh qehVar = qeh.PHONE;
            qeh b = qeh.b(qeiVar.c);
            if (b == null) {
                b = qeh.UNKNOWN_TYPE;
            }
            if (qehVar.equals(b)) {
                return qeiVar;
            }
        }
        try {
            f(str);
        } catch (IllegalArgumentException unused) {
            xyo e = a.e();
            e.H("Creating ChatEndpoint with non E164 format");
            e.j(str);
            e.q();
        }
        aozy createBuilder = qei.a.createBuilder();
        qeh qehVar2 = qeh.PHONE;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qei qeiVar2 = (qei) apagVar;
        qeiVar2.c = qehVar2.e;
        qeiVar2.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qei qeiVar3 = (qei) createBuilder.b;
        str.getClass();
        qeiVar3.b |= 2;
        qeiVar3.d = str;
        return (qei) createBuilder.s();
    }
}
