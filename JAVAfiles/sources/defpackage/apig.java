package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apig extends apag implements apbu {
    public static final apig a;
    private static volatile apca g;
    public int b;
    public int c;
    public apbo e = apbo.a;
    public apbo f = apbo.a;
    public String d = "";

    static {
        apig apigVar = new apig();
        a = apigVar;
        apag.registerDefaultInstance(apig.class, apigVar);
    }

    private apig() {
    }

    public final apbo a() {
        apbo apboVar = this.f;
        if (!apboVar.b) {
            this.f = apboVar.a();
        }
        return this.f;
    }

    public final apbo b() {
        apbo apboVar = this.e;
        if (!apboVar.b) {
            this.e = apboVar.a();
        }
        return this.e;
    }

    public final boolean c(String str) {
        return this.f.containsKey(str);
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0002\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u00032\u00042", new Object[]{"b", "c", aphl.j, "d", "e", apif.a, "f", apid.a});
            case NEW_MUTABLE_INSTANCE:
                return new apig();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apig.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
