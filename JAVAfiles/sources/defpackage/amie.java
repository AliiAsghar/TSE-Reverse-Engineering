package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amie extends apag implements apbu {
    private static volatile apca S;
    public static final amie a;
    public float A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k = "";
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    static {
        amie amieVar = new amie();
        a = amieVar;
        apag.registerDefaultInstance(amie.class, amieVar);
    }

    private amie() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001)\u0000\u0002\u0001*)\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဈ\u0007\tဇ\b\nဇ\u0019\u000bဇ\t\fဇ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0010ဇ\u000e\u0011ဇ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013\u0016ဇ\u0014\u0017ဇ\u001a\u0018ဇ\u001b\u001aဇ\u0016\u001b᠌\u0017\u001cခ\u0018\u001dဇ!\u001eဇ\"\u001fဇ# ᠌$!᠌%\"ဇ&#᠌'$ဇ\u001c%ဇ\u001d&ဇ\u001e'ဇ\u001f(ဇ )ဇ(*ဇ)", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", VCardConstants.PARAM_ENCODING_B, "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "C", "D", "y", "z", amid.a, "A", "J", "K", "L", "M", amhj.u, VCardConstants.PROPERTY_N, amid.b, "O", "P", amsa.r, "E", "F", "G", "H", "I", "Q", "R"});
            case NEW_MUTABLE_INSTANCE:
                return new amie();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = S;
                if (apcaVar == null) {
                    synchronized (amie.class) {
                        apcaVar = S;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            S = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
