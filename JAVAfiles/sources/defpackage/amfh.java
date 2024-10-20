package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amfh extends apag implements apbu {
    private static volatile apca G;
    public static final amfh a;
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean F;
    public int b;
    public Object d;
    public int e;
    public int f;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public int s;
    public int t;
    public long u;
    public int v;
    public int w;
    public int x;
    public amie y;
    public boolean z;
    public int c = 0;
    public int g = -1;
    public int h = -1;
    public apao E = emptyIntList();

    static {
        amfh amfhVar = new amfh();
        a = amfhVar;
        apag.registerDefaultInstance(amfh.class, amfhVar);
    }

    private amfh() {
        emptyIntList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = ameh.n;
                return newMessageInfo(a, "\u0001\u001f\u0001\u0001\u0001$\u001f\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0006ဇ\u0005\t᠌\b\n᠌\t\u000b᠌\n\fင\u000b\r᠌\f\u000eင\r\u000f᠌\u000e\u0010င\u000f\u0011ဂ\u0010\u0012င\u0011\u0013င\u0012\u0014ဃ\u0013\u0015᠌\u0014\u0017င\u0016\u0018᠌\u0017\u0019ဉ\u0018\u001aဇ\u0019\u001b᠌\u001a\u001c\u083f\u0000\u001d\u083f\u0000\u001e\u083f\u0000\u001f᠌\u001b ᠌\u001c!᠌\u001d\"ࠞ$ဇ\u001e", new Object[]{"d", "c", "b", "e", amff.b, "f", ameh.t, "g", "h", "i", "j", amff.a, "k", ameh.u, "l", ameh.p, "m", "n", ameh.q, "o", "p", amfz.i, "q", "r", "s", "t", "u", "v", amgp.h, "w", "x", ameh.s, "y", "z", "A", amff.f, ameh.r, amff.d, amff.c, VCardConstants.PARAM_ENCODING_B, ameh.o, "C", apamVar, "D", apamVar, "E", amfz.k, "F"});
            case NEW_MUTABLE_INSTANCE:
                return new amfh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = G;
                if (apcaVar == null) {
                    synchronized (amfh.class) {
                        apcaVar = G;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            G = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
