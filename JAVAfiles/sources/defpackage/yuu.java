package defpackage;

import j$.util.Collection;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuu {
    public static final xze a = xze.g("Bugle", "VerifiedSmsKeyService");
    private static final byte[] e = {48, -127, -74, 2, 1, 0, 48, 16, 6, 7, 42, -122, 72, -50, 61, 2, 1, 6, 5, 43, -127, 4, 0, 34, 4, -127, -98, 48, -127, -101, 2, 1, 1, 4, 48, 94, -119, 32, -42, 62, 69, 120, 86, -86, 12, Byte.MAX_VALUE, -35, 103, 40, 74, 50, -34, 71, -63, -29, 117, -111, 107, 23, -86, -34, -114, 45, -26, 86, -90, 102, -48, 112, -41, -105, -7, 62, 111, -4, -53, -63, 93, -24, 21, -61, 30, -8, -95, 100, 3, 98, 0, 4, -71, 82, -67, 93, -44, 97, -46, -118, -1, 52, -92, 50, -103, 81, 14, 98, 101, 85, -110, -54, 2, 30, -20, 103, -84, 4, 106, 13, -66, -59, 119, -123, 87, 47, 52, 105, Byte.MIN_VALUE, 21, -23, 16, 29, -98, -106, 109, -95, -116, -125, -118, 117, 84, 123, 94, -26, -43, -108, -91, -93, -29, -85, -119, 103, -83, 71, -69, 27, 23, -10, 5, -66, 112, -109, -78, 84, 41, 68, -50, -115, -57, 119, 49, 41, 70, 106, 40, -81, -42, -40, 27, -16, -73, -83, 64, 38, 81, 0, 50};
    private static final byte[] f = {48, 118, 48, 16, 6, 7, 42, -122, 72, -50, 61, 2, 1, 6, 5, 43, -127, 4, 0, 34, 3, 98, 0, 4, -71, 82, -67, 93, -44, 97, -46, -118, -1, 52, -92, 50, -103, 81, 14, 98, 101, 85, -110, -54, 2, 30, -20, 103, -84, 4, 106, 13, -66, -59, 119, -123, 87, 47, 52, 105, Byte.MIN_VALUE, 21, -23, 16, 29, -98, -106, 109, -95, -116, -125, -118, 117, 84, 123, 94, -26, -43, -108, -91, -93, -29, -85, -119, 103, -83, 71, -69, 27, 23, -10, 5, -66, 112, -109, -78, 84, 41, 68, -50, -115, -57, 119, 49, 41, 70, 106, 40, -81, -42, -40, 27, -16, -73, -83, 64, 38, 81, 0, 50};
    public final yul b;
    public final yup c;
    public final anen d;
    private final alhr g = albo.D(new xyn(16));

    public yuu(yul yulVar, yup yupVar, anen anenVar) {
        this.b = yulVar;
        this.c = yupVar;
        this.d = anenVar;
    }

    public static yus a(KeyPair keyPair, yum yumVar) {
        apct apctVar;
        aozb w = aozb.w(keyPair.getPublic().getEncoded());
        if ((yumVar.b & 1) != 0) {
            apctVar = yumVar.e;
            if (apctVar == null) {
                apctVar = apct.a;
            }
        } else {
            apctVar = apds.b;
        }
        return new yus(w, apctVar);
    }

    public static /* synthetic */ KeyPair g() {
        try {
            xze xzeVar = a;
            xzeVar.o("Generating keys...");
            KeyPair x = aode.x(ansx.b);
            xyo c = xzeVar.c();
            c.H("Key pair info");
            c.x("private_size", x.getPrivate().getEncoded().length);
            c.x("public_size", x.getPublic().getEncoded().length);
            c.L("private_class", x.getPrivate().getClass().getName());
            c.L("public_class", x.getPublic().getClass().getName());
            c.q();
            return x;
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e2) {
            xyo b = a.b();
            b.H("Error while generating key pair.");
            b.r(e2);
            throw new RuntimeException("Error while generating new key pair.", e2);
        }
    }

    public final akul b(String str) {
        xyo c = a.c();
        c.H("Reading VSMS key pairs");
        c.L("imsi", str);
        c.q();
        return this.b.e().i(new yui(this, str, 2), this.d);
    }

    public final akul c() {
        return this.b.e().i(new ytu(this, 9), this.d);
    }

    public final akul d() {
        return this.b.e();
    }

    public final akul e(msh mshVar) {
        try {
            return f(mshVar, new KeyPair(aode.A(f), aode.y(e)), yua.RCS);
        } catch (GeneralSecurityException e2) {
            throw new alia("can't create fake keys", e2);
        }
    }

    public final akul f(msh mshVar, KeyPair keyPair, yua yuaVar) {
        xyo c = yup.a.c();
        c.H("Encrypting VSMS key pair...");
        c.q();
        yup yupVar = this.c;
        return yupVar.c().h(new xpm(yupVar, keyPair, 16, null), yupVar.c).f(Exception.class, new ytu(yupVar, 7), yupVar.d).i(new xrd(this, mshVar, yuaVar, 8, (char[]) null), this.d);
    }

    public final List h(ECPrivateKey eCPrivateKey, Collection collection, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ECPublicKey A = aode.A(((aozb) it.next()).H());
                arrayList.addAll((Collection) Collection.EL.stream(albo.aK(eCPrivateKey, alog.r(A), str)).map(new yug(5)).map(new yur(aozb.w(albo.aI(eCPrivateKey, A)), 1)).collect(alls.a));
            }
            return arrayList;
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("Problem calculating shared secret for the given keys.", e2);
        }
    }
}
