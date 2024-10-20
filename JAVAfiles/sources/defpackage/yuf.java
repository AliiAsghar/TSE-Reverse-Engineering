package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuf extends apag implements apbu {
    public static final yuf a;
    private static volatile apca l;
    public int b;
    public apbo c = apbo.a;
    public apbo d;
    public apbo e;
    public long f;
    public long g;
    public boolean h;
    public apct i;
    public yty j;
    public long k;

    static {
        yuf yufVar = new yuf();
        a = yufVar;
        apag.registerDefaultInstance(yuf.class, yufVar);
    }

    private yuf() {
        apbo apboVar = apbo.a;
        this.d = apboVar;
        this.e = apboVar;
    }

    public final boolean a(String str) {
        str.getClass();
        return this.d.containsKey(str);
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0003\u0000\u0000\u00012\u00022\u00032\u0004\u0002\u0006\u0002\u0007\u0007\bဉ\u0000\tဉ\u0001\n\u0002", new Object[]{"b", "c", yud.a, "d", yuc.a, "e", yue.a, "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new yuf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (yuf.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
