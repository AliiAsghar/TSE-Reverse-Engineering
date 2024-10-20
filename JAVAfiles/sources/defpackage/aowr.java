package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aowr extends apag implements apbu {
    public static final aowr a;
    private static volatile apca am;
    public int A;
    public int C;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public aowm R;
    public apup U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public aowo ag;
    public aown ah;
    public aowe aj;
    public aovy ak;
    public aovu al;
    public int b;
    public int c;
    public apup f;
    public apup i;
    public aowp o;
    public apuo p;
    public aono q;
    public double r;
    public aowm v;
    public int w;
    public int z;
    public String d = "";
    public String e = "";
    public apax g = apag.emptyProtobufList();
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public apax n = emptyProtobufList();
    public String s = "";
    public String t = "";
    public apax u = emptyProtobufList();
    public apax x = emptyProtobufList();
    public String y = "";
    public apax B = emptyProtobufList();
    public String D = "";
    public String E = "";
    public apax S = emptyProtobufList();
    public apax T = emptyProtobufList();
    public apax ai = emptyProtobufList();

    static {
        aowr aowrVar = new aowr();
        a = aowrVar;
        apag.registerDefaultInstance(aowr.class, aowrVar);
    }

    private aowr() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000=\u0000\u0002\u0001O=\u0000\b\u0000\u0001Ȉ\u0002Ȉ\u0005Ț\u0007Ȉ\bȈ\tȈ\n\u001b\u000bဉ\u0002\fဉ\u0003\rဉ\u0004\u000e\u0000\u000fȈ\u0010Ȉ\u0015ဉ\u0005\u0016င\u0006\u0018Ȉ\u0019\f\u001a\f\u001b\u001b\u001cင\u0007\u001dȈ\u001eȈ\u001fဉ\u0000 ဉ\u0001!ဇ\b\"ဇ\t#ဇ\n$ဇ\u000b&ဇ\f'ဇ\r(ဇ\u000e)ဇ\u000f*ဇ\u0010+ဇ\u0011,ဇ\u0012-ဇ\u0013.ဉ\u0014/\u001b1\u001b2Ȉ3Ȉ4ဉ\u00155\u001b6\u001b7ဇ\u00168ဇ\u00179ဇ\u0018:ဇ\u0019;ဇ\u001a<ဇ\u001b>ဇ\u001d?ဇ\u001e@ဇ\u001fAဇ Bဇ!Cဉ\"Fဉ#G\u001bHဉ$Nဉ*Oဉ+", new Object[]{"b", "c", "d", "e", "g", "j", "k", "l", "n", aowf.class, "o", "p", "q", "r", "s", "t", "v", "w", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, aowg.class, "C", "D", "E", "f", "i", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P", "Q", "R", "S", aowm.class, "T", aowm.class, "h", "m", "U", "u", aowv.class, "x", aowc.class, "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", aowq.class, "aj", "ak", "al"});
            case NEW_MUTABLE_INSTANCE:
                return new aowr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = am;
                if (apcaVar == null) {
                    synchronized (aowr.class) {
                        apcaVar = am;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            am = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
