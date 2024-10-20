package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anpc {
    public static final antv a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    private static final aocj e;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        e = b2;
        a = new antv(anox.class, anub.class, new anoy(0));
        b = new antv(b2, anub.class, new anoz(0));
        c = new antv(anou.class, anua.class, new anpa(0));
        d = new antv(b2, anua.class, new anpb(0));
    }

    public static anox a(anxo anxoVar, anxp anxpVar) {
        anov anovVar;
        anow anowVar;
        aozy createBuilder = anxg.a.createBuilder();
        anxg anxgVar = anxoVar.d;
        if (anxgVar == null) {
            anxgVar = anxg.a;
        }
        String str = anxgVar.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        str.getClass();
        ((anxg) apagVar).b = str;
        anxg anxgVar2 = anxoVar.d;
        if (anxgVar2 == null) {
            anxgVar2 = anxg.a;
        }
        aozb aozbVar = anxgVar2.c;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        aozbVar.getClass();
        ((anxg) apagVar2).c = aozbVar;
        anxp anxpVar2 = anxp.RAW;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ((anxg) createBuilder.b).d = anxpVar2.a();
        anme o = anme.o(((anxg) createBuilder.s()).toByteArray());
        boolean z = o instanceof anoe;
        if (z) {
            anovVar = anov.a;
        } else if (o instanceof anom) {
            anovVar = anov.c;
        } else if (o instanceof anpm) {
            anovVar = anov.b;
        } else if (o instanceof annu) {
            anovVar = anov.d;
        } else if (o instanceof annz) {
            anovVar = anov.e;
        } else if (o instanceof anoi) {
            anovVar = anov.f;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(o.toString()));
        }
        int ordinal = anxpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                anowVar = anow.b;
            } else {
                throw new GeneralSecurityException(hht.i(anxpVar, "Unable to parse OutputPrefixType: "));
            }
        } else {
            anowVar = anow.a;
        }
        String str2 = anxoVar.c;
        if (str2 != null) {
            if (!o.j()) {
                if ((anovVar.equals(anov.a) && z) || ((anovVar.equals(anov.c) && (o instanceof anom)) || ((anovVar.equals(anov.b) && (o instanceof anpm)) || ((anovVar.equals(anov.d) && (o instanceof annu)) || ((anovVar.equals(anov.e) && (o instanceof annz)) || (anovVar.equals(anov.f) && (o instanceof anoi))))))) {
                    return new anox(anowVar, str2, anovVar, o);
                }
                throw new GeneralSecurityException("Cannot use parsing strategy " + anovVar.g + " when new keys are picked according to " + o.toString() + ".");
            }
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }

    public static anxo b(anox anoxVar) {
        byte[] p = anme.p(anoxVar.g);
        try {
            aozs aozsVar = aozs.a;
            apcc apccVar = apcc.a;
            anxg anxgVar = (anxg) apag.parseFrom(anxg.a, p, aozs.a);
            aozy createBuilder = anxo.a.createBuilder();
            String str = anoxVar.f;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((anxo) apagVar).c = str;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            anxo anxoVar = (anxo) createBuilder.b;
            anxgVar.getClass();
            anxoVar.d = anxgVar;
            anxoVar.b |= 1;
            return (anxo) createBuilder.s();
        } catch (apba e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static anxp c(anow anowVar) {
        if (anow.a.equals(anowVar)) {
            return anxp.TINK;
        }
        if (anow.b.equals(anowVar)) {
            return anxp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(anowVar.c));
    }
}
