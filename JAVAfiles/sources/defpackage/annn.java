package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class annn {
    public static final anxg a = a(16);
    public static final anxg b;

    static {
        a(32);
        c(16);
        c(32);
        b = b(16, 16, anwu.SHA256);
        b(32, 32, anwu.SHA256);
        aozy createBuilder = anxg.a.createBuilder();
        antv antvVar = anok.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((anxg) apagVar).b = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
        anxp anxpVar = anxp.TINK;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((anxg) createBuilder.b).d = anxpVar.a();
        aozy createBuilder2 = anxg.a.createBuilder();
        antv antvVar2 = anpk.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        ((anxg) apagVar2).b = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        anxp anxpVar2 = anxp.TINK;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        ((anxg) createBuilder2.b).d = anxpVar2.a();
    }

    public static anxg a(int i) {
        aozy createBuilder = anvx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvx) createBuilder.b).b = i;
        anvx anvxVar = (anvx) createBuilder.s();
        aozy createBuilder2 = anxg.a.createBuilder();
        aozb byteString = anvxVar.toByteString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((anxg) createBuilder2.b).c = byteString;
        antv antvVar = anoc.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        ((anxg) apagVar).b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        anxp anxpVar = anxp.TINK;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        ((anxg) createBuilder2.b).d = anxpVar.a();
        return (anxg) createBuilder2.s();
    }

    public static anxg b(int i, int i2, anwu anwuVar) {
        aozy createBuilder = anvo.a.createBuilder();
        aozy createBuilder2 = anvp.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((anvp) createBuilder2.b).b = 16;
        anvp anvpVar = (anvp) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        anvo anvoVar = (anvo) apagVar;
        anvpVar.getClass();
        anvoVar.c = anvpVar;
        anvoVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((anvo) createBuilder.b).d = i;
        anvo anvoVar2 = (anvo) createBuilder.s();
        aozy createBuilder3 = anww.a.createBuilder();
        aozy createBuilder4 = anwx.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anwx) createBuilder4.b).b = anwuVar.a();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        ((anwx) createBuilder4.b).c = i2;
        anwx anwxVar = (anwx) createBuilder4.s();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar2 = createBuilder3.b;
        anww anwwVar = (anww) apagVar2;
        anwxVar.getClass();
        anwwVar.c = anwxVar;
        anwwVar.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder3.u();
        }
        ((anww) createBuilder3.b).d = 32;
        anww anwwVar2 = (anww) createBuilder3.s();
        aozy createBuilder5 = anvj.a.createBuilder();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        apag apagVar3 = createBuilder5.b;
        anvj anvjVar = (anvj) apagVar3;
        anvoVar2.getClass();
        anvjVar.c = anvoVar2;
        anvjVar.b |= 1;
        if (!apagVar3.isMutable()) {
            createBuilder5.u();
        }
        anvj anvjVar2 = (anvj) createBuilder5.b;
        anwwVar2.getClass();
        anvjVar2.d = anwwVar2;
        anvjVar2.b |= 2;
        anvj anvjVar3 = (anvj) createBuilder5.s();
        aozy createBuilder6 = anxg.a.createBuilder();
        aozb byteString = anvjVar3.toByteString();
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        ((anxg) createBuilder6.b).c = byteString;
        antv antvVar = annr.a;
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        apag apagVar4 = createBuilder6.b;
        ((anxg) apagVar4).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        anxp anxpVar = anxp.TINK;
        if (!apagVar4.isMutable()) {
            createBuilder6.u();
        }
        ((anxg) createBuilder6.b).d = anxpVar.a();
        return (anxg) createBuilder6.s();
    }

    public static void c(int i) {
        aozy createBuilder = anvr.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anvr) createBuilder.b).d = i;
        aozy createBuilder2 = anvs.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((anvs) createBuilder2.b).b = 16;
        anvs anvsVar = (anvs) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anvr anvrVar = (anvr) createBuilder.b;
        anvsVar.getClass();
        anvrVar.c = anvsVar;
        anvrVar.b |= 1;
        anvr anvrVar2 = (anvr) createBuilder.s();
        aozy createBuilder3 = anxg.a.createBuilder();
        aozb byteString = anvrVar2.toByteString();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        ((anxg) createBuilder3.b).c = byteString;
        antv antvVar = annx.a;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar = createBuilder3.b;
        ((anxg) apagVar).b = "type.googleapis.com/google.crypto.tink.AesEaxKey";
        anxp anxpVar = anxp.TINK;
        if (!apagVar.isMutable()) {
            createBuilder3.u();
        }
        ((anxg) createBuilder3.b).d = anxpVar.a();
    }
}
