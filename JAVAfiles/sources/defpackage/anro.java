package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anro {
    public static final anxg a;
    private static final byte[] b;

    static {
        byte[] bArr = new byte[0];
        b = bArr;
        a = a(anws.NIST_P256, anwu.SHA256, anwe.UNCOMPRESSED, annn.a, anxp.TINK, bArr);
        a(anws.NIST_P256, anwu.SHA256, anwe.COMPRESSED, annn.a, anxp.RAW, bArr);
        a(anws.NIST_P256, anwu.SHA256, anwe.UNCOMPRESSED, annn.b, anxp.TINK, bArr);
    }

    @Deprecated
    static anxg a(anws anwsVar, anwu anwuVar, anwe anweVar, anxg anxgVar, anxp anxpVar, byte[] bArr) {
        aozy createBuilder = anwk.a.createBuilder();
        aozy createBuilder2 = anwo.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((anwo) createBuilder2.b).b = anwsVar.a();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((anwo) createBuilder2.b).c = anwuVar.a();
        aozb w = aozb.w(bArr);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((anwo) createBuilder2.b).d = w;
        anwo anwoVar = (anwo) createBuilder2.s();
        aozy createBuilder3 = anwj.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        anwj anwjVar = (anwj) createBuilder3.b;
        anxgVar.getClass();
        anwjVar.c = anxgVar;
        anwjVar.b |= 1;
        anwj anwjVar2 = (anwj) createBuilder3.s();
        aozy createBuilder4 = anwl.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        apag apagVar = createBuilder4.b;
        anwl anwlVar = (anwl) apagVar;
        anwoVar.getClass();
        anwlVar.c = anwoVar;
        anwlVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder4.u();
        }
        apag apagVar2 = createBuilder4.b;
        anwl anwlVar2 = (anwl) apagVar2;
        anwjVar2.getClass();
        anwlVar2.d = anwjVar2;
        anwlVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder4.u();
        }
        ((anwl) createBuilder4.b).e = anweVar.a();
        anwl anwlVar3 = (anwl) createBuilder4.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anwk anwkVar = (anwk) createBuilder.b;
        anwlVar3.getClass();
        anwkVar.c = anwlVar3;
        anwkVar.b |= 1;
        anwk anwkVar2 = (anwk) createBuilder.s();
        aozy createBuilder5 = anxg.a.createBuilder();
        antv antvVar = anqs.a;
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        apag apagVar3 = createBuilder5.b;
        ((anxg) apagVar3).b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
        if (!apagVar3.isMutable()) {
            createBuilder5.u();
        }
        ((anxg) createBuilder5.b).d = anxpVar.a();
        aozb byteString = anwkVar2.toByteString();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        ((anxg) createBuilder5.b).c = byteString;
        return (anxg) createBuilder5.s();
    }
}
