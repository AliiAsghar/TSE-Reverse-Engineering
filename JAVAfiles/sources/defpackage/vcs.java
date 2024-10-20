package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import org.whispersystems.curve25519.Curve25519;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcs {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/common/CryptoHelper");
    public final armf b;
    public final armf c;
    public final anen d;
    private final armf e;
    private final Object f = new Object();
    private final Map g = new HashMap();

    public vcs(armf armfVar, armf armfVar2, armf armfVar3, anen anenVar) {
        new HashMap();
        this.e = armfVar;
        this.b = armfVar2;
        this.d = anenVar;
        this.c = armfVar3;
    }

    public static byte[] c(aqeq aqeqVar) {
        byte[] g = g(0);
        byte[] g2 = g(0);
        aqep aqepVar = aqeqVar.h;
        if (aqepVar == null) {
            aqepVar = aqep.a;
        }
        if ((aqepVar.b & 4) != 0) {
            aqep aqepVar2 = aqeqVar.h;
            if (aqepVar2 == null) {
                aqepVar2 = aqep.a;
            }
            aqfu aqfuVar = aqepVar2.i;
            if (aqfuVar == null) {
                aqfuVar = aqfu.a;
            }
            g = g(aqfuVar.b);
            aqep aqepVar3 = aqeqVar.h;
            if (aqepVar3 == null) {
                aqepVar3 = aqep.a;
            }
            aqfu aqfuVar2 = aqepVar3.i;
            if (aqfuVar2 == null) {
                aqfuVar2 = aqfu.a;
            }
            g2 = d(aqfuVar2.c.H());
        }
        aqfn aqfnVar = aqeqVar.d;
        if (aqfnVar == null) {
            aqfnVar = aqfn.a;
        }
        byte[] d = d(aqfnVar.d.getBytes("UTF-8"));
        aqfn aqfnVar2 = aqeqVar.d;
        if (aqfnVar2 == null) {
            aqfnVar2 = aqfn.a;
        }
        byte[] g3 = g(aqfnVar2.b);
        aqfn aqfnVar3 = aqeqVar.d;
        if (aqfnVar3 == null) {
            aqfnVar3 = aqfn.a;
        }
        byte[] d2 = d(aqfnVar3.c.getBytes("UTF-8"));
        aqep aqepVar4 = aqeqVar.h;
        if (aqepVar4 == null) {
            aqepVar4 = aqep.a;
        }
        byte[] d3 = d(aqepVar4.f.getBytes("UTF-8"));
        aqep aqepVar5 = aqeqVar.h;
        if (aqepVar5 == null) {
            aqepVar5 = aqep.a;
        }
        byte[] d4 = d(aqepVar5.g.H());
        aqep aqepVar6 = aqeqVar.h;
        if (aqepVar6 == null) {
            aqepVar6 = aqep.a;
        }
        return albo.cE(d, g3, d2, d3, d4, d(aqepVar6.h.getBytes("UTF-8")), g, g2, e(aqeqVar.e));
    }

    public static byte[] d(byte[] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            return ByteBuffer.allocate(length + 4).order(ByteOrder.LITTLE_ENDIAN).putInt(length).put(bArr).array();
        }
        return new byte[]{0, 0, 0, 0};
    }

    public static byte[] e(long j) {
        return ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN).putInt(8).putLong(j).array();
    }

    public static byte[] f(byte[] bArr, asmb asmbVar) {
        try {
            byte[] calculateSignature = Curve25519.getInstance(Curve25519.BEST).calculateSignature((byte[]) ((atoi) asmbVar.b).a, bArr);
            calculateSignature.getClass();
            if (xyp.c()) {
                if (!Curve25519.getInstance(Curve25519.BEST).verifySignature(((atju) asmbVar.a).a, bArr, calculateSignature)) {
                    throw new IllegalStateException("unable to verify signature locally");
                }
            }
            return calculateSignature;
        } catch (atjt e) {
            alvw h = a.h();
            h.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "signBytes", (char) 343, "CryptoHelper.java")).q("failed to signBytes");
            throw new IllegalStateException("Failed to sign", e);
        }
    }

    private static byte[] g(int i) {
        return ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putInt(4).putInt(i).array();
    }

    public final akul a(String str) {
        return b(str).h(new vbj(18), andi.a);
    }

    public final akul b(String str) {
        akul akulVar;
        synchronized (this.f) {
            akulVar = (akul) this.g.get(str);
            if (akulVar == null) {
                vel D = ((wyp) this.e.b()).D(str);
                akulVar = D.b().i(new vbn(D, 20), andi.a);
            }
            this.g.put(str, akulVar);
        }
        return akulVar;
    }
}
