package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzw extends apag implements apbu {
    public static final ajzw a;
    private static volatile apca e;
    public int b;
    public apbo d = apbo.a;
    private byte f = 2;
    public int c = 1;

    static {
        ajzw ajzwVar = new ajzw();
        a = ajzwVar;
        apag.registerDefaultInstance(ajzw.class, ajzwVar);
    }

    private ajzw() {
    }

    public final apbo a() {
        apbo apboVar = this.d;
        if (!apboVar.b) {
            this.d = apboVar.a();
        }
        return this.d;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001င\u0000\u0002в", new Object[]{"b", "c", "d", ajzv.a});
            case NEW_MUTABLE_INSTANCE:
                return new ajzw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (ajzw.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
