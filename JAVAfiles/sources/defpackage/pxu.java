package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxu implements pxp {
    private static final alwo a = alwo.o("BugleFileTransfer");
    private final armf b;
    private final armf c;
    private final armf d;
    private final nej e;

    public pxu(armf armfVar, armf armfVar2, nej nejVar, armf armfVar3) {
        this.b = armfVar;
        this.c = armfVar2;
        this.e = nejVar;
        this.d = armfVar3;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [armf, java.lang.Object] */
    @Override // defpackage.pxp
    public final pxo a() {
        String str;
        int aD = a.aD(((Long) this.d.b()).intValue());
        if (aD == 0 || aD == 1) {
            aD = 2;
        }
        alwl alwlVar = (alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/authentication/RcsHttpAuthControllerFactory", "createForType", 61, "RcsHttpAuthControllerFactory.java");
        if (aD != 1) {
            if (aD != 2) {
                if (aD != 3) {
                    if (aD != 4) {
                        if (aD != 5) {
                            str = "AUTHENTICATION_TYPE_TACHYON_TOKEN";
                        } else {
                            str = "AUTHENTICATION_TYPE_GBA";
                        }
                    } else {
                        str = "AUTHENTICATION_TYPE_DIGEST";
                    }
                } else {
                    str = "AUTHENTICATION_TYPE_BASIC";
                }
            } else {
                str = "AUTHENTICATION_TYPE_NO_AUTH";
            }
        } else {
            str = "AUTHENTICATION_TYPE_UNKNOWN";
        }
        alwlVar.t("Creating controller for %s", str);
        int i = aD - 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException(String.format("Unexpected Auth type value received: %s", Integer.valueOf(i)));
                    }
                    throw new UnsupportedOperationException();
                }
                nej nejVar = this.e;
                adje adjeVar = (adje) nejVar.b.b();
                adjeVar.getClass();
                ((pxl) nejVar.a.b()).getClass();
                hgj hgjVar = (hgj) nejVar.c.b();
                hgjVar.getClass();
                return new pxm(adjeVar, hgjVar);
            }
            return (pxo) this.c.b();
        }
        return (pxo) this.b.b();
    }
}
