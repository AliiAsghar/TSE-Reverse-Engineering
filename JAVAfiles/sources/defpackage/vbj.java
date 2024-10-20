package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vbj implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ vbj(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i;
        int i2 = 8;
        boolean z = false;
        switch (this.a) {
            case 0:
                xze xzeVar = vbm.a;
                if (true != ((Boolean) obj).booleanValue()) {
                    i = 3;
                } else {
                    i = 4;
                }
                return new vbb(i, true);
            case 1:
                Optional ofNullable = Optional.ofNullable((String) obj);
                aozy createBuilder = aqfn.a.createBuilder();
                asku askuVar = asku.DEVICE_ID;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aqfn) createBuilder.b).b = askuVar.a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aqfn) createBuilder.b).d = "Bugle";
                if (ofNullable.isEmpty()) {
                    vax.a.o("Tachyon Anonymous registration Id is not available");
                } else {
                    String str = (String) ofNullable.get();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqfn) createBuilder.b).c = str;
                }
                return (aqfn) createBuilder.s();
            case 2:
                return Boolean.valueOf(((qry) obj).d());
            case 3:
                aqet aqetVar = (aqet) obj;
                if (aqetVar != null) {
                    if ((aqetVar.b & 8) != 0) {
                        aqfz aqfzVar = aqetVar.f;
                        if (aqfzVar == null) {
                            aqfzVar = aqfz.a;
                        }
                        vbq.w(aqfzVar);
                    }
                    if ((aqetVar.b & 2) != 0) {
                        return aqetVar;
                    }
                    throw new IllegalArgumentException("Tachyon phone register response has no auth token");
                }
                throw new IllegalArgumentException("Tachyon phone register response was null");
            case 4:
                ved vedVar = (ved) obj;
                alvi alviVar = vbq.a;
                if (vedVar == ved.REGISTERED_WITH_PREKEYS) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                ved vedVar2 = (ved) obj;
                alvi alviVar2 = vbq.a;
                if (vedVar2 == ved.REGISTERED_WITH_PREKEYS || vedVar2 == ved.REGISTERED_WITHOUT_PREKEYS) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                return ((Optional) obj).flatMap(new vbi(i2));
            case 7:
                return ((Optional) obj).flatMap(new vbi(i2));
            case 8:
                byte[] bArr = (byte[]) obj;
                if (bArr != null && bArr.length != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return null;
            case 10:
                xze xzeVar2 = vcj.a;
                return null;
            case 11:
                xze xzeVar3 = vcj.a;
                return null;
            case 12:
                vcj.a.r("Failed to ensure Tachyon registration", (aqwb) obj);
                return null;
            case 13:
                xze xzeVar4 = vcj.a;
                return null;
            case 14:
                vcj.a.r("Failed to ensure Tachyon registration", (aqwb) obj);
                return null;
            case 15:
                return new gsw();
            case 16:
                vcm.a.n("Failed to verify", (Exception) obj);
                return new gsu();
            case 17:
                vdv vdvVar = (vdv) obj;
                byte[] H = vdvVar.f.H();
                byte[] H2 = vdvVar.e.H();
                if (H != null && H2 != null && H.length > 0 && H2.length > 0) {
                    alvw d = vcs.a.d();
                    d.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 110, "CryptoHelper.java")).q("Returning stored KeyPair");
                    try {
                        return Optional.of(new asmb(atow.l(H2), new atoi(H)));
                    } catch (atjt e) {
                        alvw h = vcs.a.h();
                        h.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 'u', "CryptoHelper.java")).q("Cannot find valid Curve25519 key pair");
                        return Optional.empty();
                    }
                }
                alvw i3 = vcs.a.i();
                i3.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 121, "CryptoHelper.java")).q("Missing stored KeyPair");
                return Optional.empty();
            case 18:
                byte[][] bArr2 = (byte[][]) obj;
                try {
                    return Optional.of(new asmb(atow.l(bArr2[0]), new atoi(bArr2[1])));
                } catch (atjt e2) {
                    alvw h2 = vcs.a.h();
                    h2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) ((alvg) h2).g(e2)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPhoneKeyPair", (char) 155, "CryptoHelper.java")).q("Cannot find valid Curve25519 key pair");
                    return Optional.empty();
                }
            case 19:
                vee veeVar = (vee) obj;
                return new byte[][]{veeVar.f.H(), veeVar.g.H()};
            default:
                return Long.valueOf(((vdw) obj).c);
        }
    }
}
