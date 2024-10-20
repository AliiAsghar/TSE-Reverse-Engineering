package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apeq extends apag implements apbu {
    private static volatile apca Q;
    public static final apeq a;
    public int A;
    public int B;
    public int C;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean O;
    public boolean P;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String D = "";
    public String M = "";
    public String N = "";

    static {
        apeq apeqVar = new apeq();
        a = apeqVar;
        apag.registerDefaultInstance(apeq.class, apeqVar);
    }

    private apeq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004'\u0000\u0002\u0001+'\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\nဇ\t\u000bဇ\n\fဇ\u000b\rင\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဇ\u0011\u0013င\u0012\u0014င\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u0017ဇ\u0016\u0018ဇ\u0017\u0019င\u0018\u001aင\u0019\u001bင\u001a\u001fဈ\u001e ဇ\u001f!ဇ \"ဇ!#ဇ\"$ဇ#%ဇ$&ဇ%'ဇ&(ဈ')ဈ(*ဇ)+ဇ*", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P"});
            case NEW_MUTABLE_INSTANCE:
                return new apeq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = Q;
                if (apcaVar == null) {
                    synchronized (apeq.class) {
                        apcaVar = Q;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            Q = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
