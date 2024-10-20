package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asis extends apag implements apbu {
    public static final asis a;
    private static volatile apca l;
    public int b;
    public long c;
    public asiq e;
    public apct g;
    public aozn h;
    public int i;
    public asir j;
    public String d = "";
    public apax f = emptyProtobufList();
    public apax k = emptyProtobufList();

    static {
        asis asisVar = new asis();
        a = asisVar;
        apag.registerDefaultInstance(asis.class, asisVar);
    }

    private asis() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0002\u0000\u0001စ\u0000\u0002ဈ\u0001\u0004ဉ\u0004\u0005င\u0006\u0006ဉ\u0007\u0007\u001b\b\u001b\nဉ\u0002\u000bဉ\u0005", new Object[]{"b", "c", "d", "g", "i", "j", "k", asix.class, "f", asip.class, "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new asis();
            case NEW_BUILDER:
                return new aozy((byte[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (asis.class) {
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
