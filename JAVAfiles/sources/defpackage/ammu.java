package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ammu extends apag implements apbu {
    public static final ammu a;
    private static volatile apca i;
    public int b;
    public int c;
    public int f;
    public double h;
    public apax d = apag.emptyProtobufList();
    public String e = "";
    public String g = "";

    static {
        ammu ammuVar = new ammu();
        a = ammuVar;
        apag.registerDefaultInstance(ammu.class, ammuVar);
    }

    private ammu() {
    }

    public final void a() {
        apax apaxVar = this.d;
        if (!apaxVar.c()) {
            this.d = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\u000b\u0006\u0000\u0001\u0000\u0003\u001a\u0005ဈ\u0004\u0006᠌\u0005\tဈ\b\n᠌\u0001\u000bက\t", new Object[]{"b", "d", "e", "f", apwb.j, "g", "c", apwb.k, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ammu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (ammu.class) {
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
