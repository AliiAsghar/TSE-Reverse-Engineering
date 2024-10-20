package defpackage;

import android.content.Context;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yup {
    public final anen c;
    public final anen d;
    public final uvi e;
    private final alhr g;
    private final xnv h;
    public static final xze a = xze.g("Bugle", "VerifiedSmsKeyCryptor");
    private static final byte[] f = new byte[0];
    public static final uuf b = uuh.q(168221060);

    public yup(anen anenVar, anen anenVar2, Context context, xnv xnvVar, uvi uviVar) {
        this.c = anenVar;
        this.d = anenVar2;
        this.g = albo.D(new ylq(this, context, 4, null));
        this.h = xnvVar;
        this.e = uviVar;
    }

    public static /* synthetic */ ansm d(Context context) {
        try {
            xze xzeVar = a;
            xyo c = xzeVar.c();
            c.H("Initializing HybridConfig...");
            c.q();
            anrj.a();
            xyo c2 = xzeVar.c();
            c2.H("Constructing AndroidKeysetManager...");
            c2.q();
            ansl anslVar = new ansl();
            anslVar.c(context, "verified_sms_master_key", "verified_sms");
            anslVar.d = anro.a;
            anslVar.b("android-keystore://verified_sms");
            return anslVar.a();
        } catch (IOException | GeneralSecurityException e) {
            a.n("Error while initializing Tink's HybridConfig/AndroidKeysetManager", e);
            throw new yuo(e);
        }
    }

    public static KeyPair e(yum yumVar, ansm ansmVar) {
        byte[] H = yumVar.d.H();
        byte[] H2 = yumVar.c.H();
        try {
            anmu anmuVar = (anmu) ansmVar.a().h(anue.e, anmu.class);
            byte[] bArr = f;
            KeyPair keyPair = new KeyPair(aode.A(anmuVar.a(H, bArr)), aode.y(anmuVar.a(H2, bArr)));
            xyo c = a.c();
            c.H("Deserialized key pair:");
            c.x("private_size", keyPair.getPrivate().getEncoded().length);
            c.x("public_size", keyPair.getPublic().getEncoded().length);
            c.L("private_class", keyPair.getPrivate().getClass().getName());
            c.L("public_class", keyPair.getPublic().getClass().getName());
            c.q();
            return keyPair;
        } catch (GeneralSecurityException e) {
            xze xzeVar = a;
            xyo e2 = xzeVar.e();
            e2.H("Decryption failed, at rest information for key pair:");
            e2.x("private_encrypted_size", H2.length);
            e2.x("public_encrypted_size", H.length);
            e2.q();
            xyo e3 = xzeVar.e();
            e3.H("Error while decrypting/restoring VSMS key pair.");
            e3.r(e);
            throw new yun("Error while decrypting/restoring VSMS key pair.", e);
        }
    }

    public final /* synthetic */ yum a(KeyPair keyPair, ansm ansmVar) {
        try {
            anmv anmvVar = (anmv) ansmVar.a().c().h(anue.e, anmv.class);
            byte[] encoded = keyPair.getPrivate().getEncoded();
            byte[] bArr = f;
            byte[] a2 = anmvVar.a(encoded, bArr);
            byte[] a3 = anmvVar.a(keyPair.getPublic().getEncoded(), bArr);
            aozy createBuilder = yum.a.createBuilder();
            aozb w = aozb.w(a2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yum) createBuilder.b).c = w;
            aozb w2 = aozb.w(a3);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((yum) createBuilder.b).d = w2;
            apct b2 = apds.b(this.h.f().toEpochMilli());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            yum yumVar = (yum) createBuilder.b;
            b2.getClass();
            yumVar.e = b2;
            yumVar.b |= 1;
            return (yum) createBuilder.s();
        } catch (GeneralSecurityException e) {
            xyo b3 = a.b();
            b3.H("Error while encrypting VSMS key pair.");
            b3.r(e);
            throw new yun("Error while encrypting VSMS key pair.", e);
        }
    }

    public final akul b(List list) {
        xyo c = a.c();
        c.H("Decrypting VSMS key pairs...");
        c.x("number", list.size());
        c.q();
        return c().h(new yez(list, 17), this.c).f(Exception.class, new ytu(this, 7), this.d);
    }

    public final akul c() {
        return (akul) this.g.get();
    }
}
