package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amnr extends apag implements apbu {
    public static final amnr a;
    private static volatile apca i;
    public int b;
    public anat c;
    public anat e;
    public amod f;
    public amnz g;
    public amns h;
    private anat j;
    private byte k = 2;
    public apax d = emptyProtobufList();

    static {
        amnr amnrVar = new amnr();
        a = amnrVar;
        apag.registerDefaultInstance(amnr.class, amnrVar);
    }

    private amnr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new Object[]{"b", "c", "d", amoe.class, "e", "f", "g", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new amnr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amnr.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
