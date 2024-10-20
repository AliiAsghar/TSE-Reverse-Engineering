package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aode {
    public static aode a;
    public static aode b;

    public aode() {
    }

    public static ECPublicKey A(byte[] bArr) {
        return (ECPublicKey) ((KeyFactory) aobo.g.a("EC")).generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static ECPublicKey B(aobi aobiVar, aobk aobkVar, byte[] bArr) {
        return D(E(aobiVar), aobkVar, bArr);
    }

    public static ECPublicKey C(aobi aobiVar, byte[] bArr, byte[] bArr2) {
        ECParameterSpec E = E(aobiVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        ansx.f(eCPoint, E.getCurve());
        return (ECPublicKey) ((KeyFactory) aobo.g.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, E));
    }

    public static ECPublicKey D(ECParameterSpec eCParameterSpec, aobk aobkVar, byte[] bArr) {
        return (ECPublicKey) ((KeyFactory) aobo.g.a("EC")).generatePublic(new ECPublicKeySpec(F(eCParameterSpec.getCurve(), aobkVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec E(aobi aobiVar) {
        int ordinal = aobiVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return ansx.c;
                }
                throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(String.valueOf(aobiVar))));
            }
            return ansx.b;
        }
        return ansx.a;
    }

    public static ECPoint F(EllipticCurve ellipticCurve, aobk aobkVar, byte[] bArr) {
        int v = v(ellipticCurve);
        int ordinal = aobkVar.ordinal();
        boolean z = false;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    int i = v + v;
                    int length = bArr.length;
                    if (length == i) {
                        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, v)), new BigInteger(1, Arrays.copyOfRange(bArr, v, length)));
                        ansx.f(eCPoint, ellipticCurve);
                        return eCPoint;
                    }
                    throw new GeneralSecurityException("invalid point size");
                }
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(aobkVar))));
            }
            int i2 = v + 1;
            BigInteger d = ansx.d(ellipticCurve);
            int length2 = bArr.length;
            if (length2 == i2) {
                byte b2 = bArr[0];
                if (b2 != 2) {
                    if (b2 == 3) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(d) < 0) {
                    return new ECPoint(bigInteger, as(bigInteger, z, ellipticCurve));
                }
                throw new GeneralSecurityException("x is out of range");
            }
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        int length3 = bArr.length;
        if (length3 == v + v + 1) {
            if (bArr[0] == 4) {
                int i3 = v + 1;
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i3)), new BigInteger(1, Arrays.copyOfRange(bArr, i3, length3)));
                ansx.f(eCPoint2, ellipticCurve);
                return eCPoint2;
            }
            throw new GeneralSecurityException("invalid point format");
        }
        throw new GeneralSecurityException("invalid point size");
    }

    public static void G(ECPublicKey eCPublicKey) {
        ansx.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static void H(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            if (ansx.g(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static boolean I(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int length = bArr.length;
        if (length < 8 || bArr[0] != 48) {
            return false;
        }
        int i6 = bArr[1] & 255;
        if (i6 == 129) {
            i6 = bArr[2] & 255;
            if (i6 < 128) {
                return false;
            }
            i = 2;
        } else {
            if (i6 == 128 || i6 > 129) {
                return false;
            }
            i = 1;
        }
        if (i6 != (length - 1) - i || bArr[i + 1] != 2 || (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) >= length || i2 == 0) {
            return false;
        }
        byte b2 = bArr[i3];
        if ((b2 & 255) >= 128) {
            return false;
        }
        if ((i2 > 1 && b2 == 0 && (bArr[i + 4] & 255) < 128) || bArr[i4] != 2) {
            return false;
        }
        int i7 = bArr[i5] & 255;
        if (i4 + 2 + i7 != length || i7 == 0) {
            return false;
        }
        byte b3 = bArr[i + 5 + i2];
        if ((b3 & 255) >= 128) {
            return false;
        }
        if (i7 > 1 && b3 == 0 && (bArr[i + 6 + i2] & 255) < 128) {
            return false;
        }
        return true;
    }

    public static byte[] J(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        H(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        ansx.f(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) aobo.g.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) aobo.e.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(ansx.d(curve)) < 0) {
                as(bigInteger, true, curve);
                return generateSecret;
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] K(aobi aobiVar, aobk aobkVar, ECPoint eCPoint) {
        return L(E(aobiVar).getCurve(), aobkVar, eCPoint);
    }

    public static byte[] L(EllipticCurve ellipticCurve, aobk aobkVar, ECPoint eCPoint) {
        ansx.f(eCPoint, ellipticCurve);
        int v = v(ellipticCurve);
        int ordinal = aobkVar.ordinal();
        if (ordinal != 0) {
            byte b2 = 2;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    int i = v + v;
                    byte[] bArr = new byte[i];
                    byte[] w = anme.w(eCPoint.getAffineX());
                    int length = w.length;
                    if (length > v) {
                        w = Arrays.copyOfRange(w, length - v, length);
                    }
                    byte[] w2 = anme.w(eCPoint.getAffineY());
                    int length2 = w2.length;
                    if (length2 > v) {
                        w2 = Arrays.copyOfRange(w2, length2 - v, length2);
                    }
                    int length3 = w2.length;
                    System.arraycopy(w2, 0, bArr, i - length3, length3);
                    int length4 = w.length;
                    System.arraycopy(w, 0, bArr, v - length4, length4);
                    return bArr;
                }
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(aobkVar))));
            }
            int i2 = v + 1;
            byte[] bArr2 = new byte[i2];
            byte[] w3 = anme.w(eCPoint.getAffineX());
            int length5 = w3.length;
            System.arraycopy(w3, 0, bArr2, i2 - length5, length5);
            if (true == eCPoint.getAffineY().testBit(0)) {
                b2 = 3;
            }
            bArr2[0] = b2;
            return bArr2;
        }
        int i3 = v + 1;
        int i4 = v + v + 1;
        byte[] bArr3 = new byte[i4];
        byte[] w4 = anme.w(eCPoint.getAffineX());
        byte[] w5 = anme.w(eCPoint.getAffineY());
        int length6 = w5.length;
        System.arraycopy(w5, 0, bArr3, i4 - length6, length6);
        int length7 = w4.length;
        System.arraycopy(w4, 0, bArr3, i3 - length7, length7);
        bArr3[0] = 4;
        return bArr3;
    }

    public static byte[] M(byte[] bArr) {
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length || bArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2 = length - 1;
        }
        if ((bArr[i2] & 128) == 128) {
            i = 1;
        }
        int i3 = length - i2;
        byte[] bArr2 = new byte[i3 + i];
        System.arraycopy(bArr, i2, bArr2, i, i3);
        return bArr2;
    }

    public static final void N(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i >= 0 && byteBuffer2.remaining() >= i && byteBuffer3.remaining() >= i && byteBuffer.remaining() >= i) {
            for (int i2 = 0; i2 < i; i2++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static byte[] O(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < bArr.length) {
                int length = bArr[i].length;
                if (i2 <= Integer.MAX_VALUE - length) {
                    i2 += length;
                    i++;
                } else {
                    throw new GeneralSecurityException("exceeded size limit");
                }
            } else {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (byte[] bArr3 : bArr) {
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length2);
                    i3 += length2;
                }
                return bArr2;
            }
        }
    }

    public static final byte[] P(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return Q(bArr, 0, bArr2, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] Q(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr.length - i2 >= i && bArr2.length - i2 >= 0) {
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final anzj R(anzg anzgVar, BigInteger bigInteger, Integer num) {
        aocj a2;
        if (bigInteger != null) {
            int i = anzgVar.f;
            int bitLength = bigInteger.bitLength();
            if (bitLength == i) {
                if (anzgVar.j() && num == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!anzgVar.j() && num != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                anzf anzfVar = anzgVar.h;
                if (anzfVar == anzf.d) {
                    a2 = antr.a;
                } else if (anzfVar != anzf.c && anzfVar != anzf.b) {
                    if (anzfVar == anzf.a) {
                        a2 = antr.b(num.intValue());
                    } else {
                        throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(String.valueOf(anzfVar))));
                    }
                } else {
                    a2 = antr.a(num.intValue());
                }
                return new anzj(anzgVar, bigInteger, a2, num);
            }
            throw new GeneralSecurityException(a.bU(i, bitLength, "Got modulus size ", ", but parameters requires modulus size "));
        }
        throw new GeneralSecurityException("Cannot build without modulus");
    }

    public static final anzb S(anyz anyzVar, BigInteger bigInteger, Integer num) {
        aocj a2;
        if (bigInteger != null) {
            int i = anyzVar.f;
            int bitLength = bigInteger.bitLength();
            if (bitLength == i) {
                if (anyzVar.j() && num == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!anyzVar.j() && num != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                anyy anyyVar = anyzVar.h;
                if (anyyVar == anyy.d) {
                    a2 = antr.a;
                } else if (anyyVar != anyy.c && anyyVar != anyy.b) {
                    if (anyyVar == anyy.a) {
                        a2 = antr.b(num.intValue());
                    } else {
                        throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(String.valueOf(anyyVar))));
                    }
                } else {
                    a2 = antr.a(num.intValue());
                }
                return new anzb(anyzVar, bigInteger, a2, num);
            }
            throw new GeneralSecurityException(a.bU(i, bitLength, "Got modulus size ", ", but parameters requires modulus size "));
        }
        throw new GeneralSecurityException("Cannot build without modulus");
    }

    public static final anyk T(anyi anyiVar, ECPoint eCPoint, Integer num) {
        aocj a2;
        if (eCPoint != null) {
            ansx.f(eCPoint, anyiVar.f.e.getCurve());
            if (anyiVar.j() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!anyiVar.j() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            anyh anyhVar = anyiVar.h;
            if (anyhVar == anyh.d) {
                a2 = antr.a;
            } else if (anyhVar != anyh.c && anyhVar != anyh.b) {
                if (anyhVar == anyh.a) {
                    a2 = antr.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(anyhVar.e));
                }
            } else {
                a2 = antr.a(num.intValue());
            }
            return new anyk(anyiVar, eCPoint, a2, num);
        }
        throw new GeneralSecurityException("Cannot build without public point");
    }

    public static aqwo U(Context context, alpt alptVar, Executor executor) {
        return new aqwo(new aomf(context, 1), context.getPackageManager(), alptVar, executor);
    }

    @Deprecated
    public static aqww V(Context context, alpt alptVar) {
        return new aokn(context.getPackageManager(), alptVar, abqq.c(context));
    }

    public static void W(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (!au(b3) && (((b2 << 28) + (b3 + 112)) >> 30) == 0 && !au(b4) && !au(b5)) {
            int at = ((b2 & 7) << 18) | (at(b3) << 12) | (at(b4) << 6) | at(b5);
            cArr[i] = (char) ((at >>> 10) + 55232);
            cArr[i + 1] = (char) ((at & 1023) + 56320);
            return;
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    public static void X(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    public static void Y(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!au(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!au(b4)) {
                cArr[i] = (char) (((b2 & 15) << 12) | (at(b3) << 6) | at(b4));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    public static void Z(byte b2, byte b3, char[] cArr, int i) {
        if (b2 >= -62) {
            if (!au(b3)) {
                cArr[i] = (char) (((b2 & 31) << 6) | at(b3));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
    }

    public static int a(int i) {
        return i - 2;
    }

    public static boolean aa(byte b2) {
        if (b2 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean ab(byte b2) {
        if (b2 < -16) {
            return true;
        }
        return false;
    }

    public static boolean ac(byte b2) {
        if (b2 < -32) {
            return true;
        }
        return false;
    }

    public static aoen ad(String str, String str2) {
        return aoen.d(new aojk(str, str2), aojk.class);
    }

    public static aoen ae(String str, aojl aojlVar) {
        aoem c = aoen.c(aojk.class);
        c.b(new aoev(Context.class, 1, 0));
        c.c = new aojo(str, aojlVar, 1);
        return c.a();
    }

    public static SharedPreferences af(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static String ag(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String ah(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String ai(Bundle bundle) {
        String string = bundle.getString("from");
        if (string != null && string.startsWith("/topics/")) {
            return string;
        }
        return null;
    }

    public static void aj(String str, Bundle bundle) {
        String str2;
        String str3;
        try {
            aodi.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String ag = ag(bundle);
            if (ag != null) {
                bundle2.putString("_nmn", ag);
            }
            String ah = ah(bundle);
            if (!TextUtils.isEmpty(ah)) {
                bundle2.putString(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, ah);
            }
            String string2 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string2)) {
                bundle2.putString("message_channel", string2);
            }
            String ai = ai(bundle);
            if (ai != null) {
                bundle2.putString("_nt", ai);
            }
            String string3 = bundle.getString("google.c.a.ts");
            if (string3 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string3));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str2 = bundle.getString("google.c.a.udt");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str2));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            if (true != aojh.o(bundle)) {
                str3 = GroupManagementRequest.DATA_TAG;
            } else {
                str3 = "display";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str3);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2.toString());
            }
            aodp aodpVar = (aodp) aodi.b().d(aodp.class);
            if (aodpVar != null) {
                aodpVar.a();
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean ak(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static boolean al(Intent intent) {
        if (intent != null && !ak(intent)) {
            return am(intent.getExtras());
        }
        return false;
    }

    public static boolean am(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static final void an(dyu dyuVar, aoin aoinVar) {
        if (aoinVar != null) {
            try {
                acir acirVar = aoinVar.c;
                abhg.m(acirVar);
                Bitmap bitmap = (Bitmap) actx.v(acirVar, 5L, TimeUnit.SECONDS);
                dyuVar.m(bitmap);
                dyn dynVar = new dyn();
                dynVar.e(bitmap);
                dynVar.d(null);
                dyuVar.t(dynVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                aoinVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(e.getCause()))));
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                aoinVar.close();
            }
        }
    }

    public static int ao(int i) {
        return i - 1;
    }

    public static void ap(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void aq(Object obj) {
        obj.getClass();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Set, java.lang.Object] */
    public static void ar(List list) {
        Set<asqe> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                aoen aoenVar = (aoen) it.next();
                asqe asqeVar = new asqe(aoenVar);
                for (aofg aofgVar : aoenVar.b) {
                    aoeu aoeuVar = new aoeu(aofgVar, !aoenVar.f());
                    if (!hashMap.containsKey(aoeuVar)) {
                        hashMap.put(aoeuVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(aoeuVar);
                    if (!set2.isEmpty() && !aoeuVar.a) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", aofgVar));
                    }
                    set2.add(asqeVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (asqe asqeVar2 : (Set) it2.next()) {
                        for (aoev aoevVar : ((aoen) asqeVar2.a).c) {
                            if (aoevVar.a() && (set = (Set) hashMap.get(new aoeu(aoevVar.a, aoevVar.b()))) != null) {
                                for (asqe asqeVar3 : set) {
                                    asqeVar2.b.add(asqeVar3);
                                    asqeVar3.c.add(asqeVar2);
                                }
                            }
                        }
                    }
                }
                HashSet<asqe> hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (asqe asqeVar4 : hashSet) {
                    if (asqeVar4.k()) {
                        hashSet2.add(asqeVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    asqe asqeVar5 = (asqe) hashSet2.iterator().next();
                    hashSet2.remove(asqeVar5);
                    i++;
                    for (asqe asqeVar6 : asqeVar5.b) {
                        asqeVar6.c.remove(asqeVar5);
                        if (asqeVar6.k()) {
                            hashSet2.add(asqeVar6);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (asqe asqeVar7 : hashSet) {
                    if (!asqeVar7.k() && !asqeVar7.b.isEmpty()) {
                        arrayList.add(asqeVar7.a);
                    }
                }
                throw new aoew(arrayList);
            }
        }
    }

    private static BigInteger as(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger d = ansx.d(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(d);
        if (d.signum() == 1) {
            BigInteger mod2 = mod.mod(d);
            if (mod2.equals(BigInteger.ZERO)) {
                bigInteger3 = BigInteger.ZERO;
            } else {
                if (d.testBit(0) && d.testBit(1)) {
                    bigInteger2 = mod2.modPow(d.add(BigInteger.ONE).shiftRight(2), d);
                } else {
                    bigInteger2 = null;
                    if (d.testBit(0) && !d.testBit(1)) {
                        BigInteger bigInteger4 = BigInteger.ONE;
                        BigInteger shiftRight = d.subtract(BigInteger.ONE).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(d);
                            if (!mod3.equals(BigInteger.ZERO)) {
                                BigInteger modPow = mod3.modPow(shiftRight, d);
                                if (modPow.add(BigInteger.ONE).equals(d)) {
                                    BigInteger shiftRight2 = d.add(BigInteger.ONE).shiftRight(1);
                                    BigInteger bigInteger5 = BigInteger.ONE;
                                    BigInteger bigInteger6 = bigInteger4;
                                    for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                        BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                        BigInteger mod4 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(d).multiply(mod3)).mod(d);
                                        BigInteger mod5 = multiply.add(multiply).mod(d);
                                        if (shiftRight2.testBit(bitLength)) {
                                            BigInteger mod6 = mod4.multiply(bigInteger4).add(mod5.multiply(mod3)).mod(d);
                                            bigInteger5 = bigInteger4.multiply(mod5).add(mod4).mod(d);
                                            bigInteger6 = mod6;
                                        } else {
                                            bigInteger6 = mod4;
                                            bigInteger5 = mod5;
                                        }
                                    }
                                    bigInteger2 = bigInteger6;
                                } else if (modPow.equals(BigInteger.ONE)) {
                                    bigInteger4 = bigInteger4.add(BigInteger.ONE);
                                    i++;
                                    if (i == 128 && !d.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                bigInteger3 = bigInteger4;
                                break;
                            }
                        }
                    }
                }
                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(d).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
                bigInteger3 = bigInteger2;
            }
            if (z != bigInteger3.testBit(0)) {
                return d.subtract(bigInteger3).mod(d);
            }
            return bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    private static int at(byte b2) {
        return b2 & 63;
    }

    private static boolean au(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = -1;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue >= 0) {
                i = i + intValue + 1;
                if (i >= 0) {
                    arrayList.add(Integer.valueOf(i));
                } else {
                    throw new IllegalArgumentException("Encountered integer overflow");
                }
            } else {
                throw new IllegalArgumentException("Encountered negative delta");
            }
        }
        return arrayList;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i;
            copyOf[31] = (byte) (i | 64);
            byte[][] bArr3 = ansr.a;
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i2 = 0; i2 < 7; i2++) {
                    if (MessageDigest.isEqual(ansr.a[i2], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(t(ansr.a[i2])));
                    }
                }
                long[] l = ansz.l(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i3 = 10;
                System.arraycopy(l, 0, jArr2, 0, 10);
                int i4 = 0;
                int i5 = 32;
                while (i4 < i5) {
                    int i6 = copyOf[31 - i4] & 255;
                    int i7 = 0;
                    while (i7 < 8) {
                        int i8 = (i6 >> (7 - i7)) & 1;
                        ansr.b(jArr4, jArr2, i8);
                        ansr.b(jArr5, jArr3, i8);
                        byte[] bArr4 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        int i9 = i6;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i10 = i4;
                        long[] jArr13 = new long[19];
                        int i11 = i7;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr9;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        ansz.j(jArr4, jArr4, jArr5);
                        ansz.i(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        ansz.j(jArr2, jArr2, jArr3);
                        ansz.i(jArr3, copyOf4, jArr3);
                        ansz.c(jArr14, jArr2, jArr5);
                        ansz.c(jArr15, jArr4, jArr3);
                        ansz.f(jArr14);
                        ansz.e(jArr14);
                        ansz.f(jArr15);
                        ansz.e(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        ansz.j(jArr14, jArr14, jArr15);
                        ansz.i(jArr15, copyOf4, jArr15);
                        ansz.h(jArr18, jArr14);
                        ansz.h(jArr17, jArr15);
                        ansz.c(jArr15, jArr17, l);
                        ansz.f(jArr15);
                        ansz.e(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        ansz.h(jArr12, jArr4);
                        ansz.h(jArr13, jArr5);
                        ansz.c(jArr8, jArr12, jArr13);
                        ansz.f(jArr8);
                        ansz.e(jArr8);
                        ansz.i(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        ansz.g(jArr10, jArr13, 121665L);
                        ansz.e(jArr10);
                        ansz.j(jArr10, jArr10, jArr12);
                        ansz.c(jArr16, jArr13, jArr10);
                        ansz.f(jArr16);
                        ansz.e(jArr16);
                        ansr.b(jArr8, jArr6, i8);
                        ansr.b(jArr16, jArr7, i8);
                        i7 = i11 + 1;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        i6 = i9;
                        jArr = jArr11;
                        i4 = i10;
                        jArr6 = jArr19;
                        jArr5 = jArr16;
                        copyOf = bArr4;
                        long[] jArr20 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr20;
                        long[] jArr21 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr21;
                    }
                    i4++;
                    copyOf = copyOf;
                    i5 = 32;
                    i3 = 10;
                }
                long[] jArr22 = jArr;
                int i12 = i3;
                long[] jArr23 = new long[i12];
                ansz.a(jArr23, jArr5);
                ansz.b(jArr22, jArr4, jArr23);
                long[] jArr24 = new long[i12];
                long[] jArr25 = new long[i12];
                long[] jArr26 = new long[11];
                long[] jArr27 = new long[11];
                long[] jArr28 = new long[11];
                ansz.b(jArr24, l, jArr22);
                ansz.j(jArr25, l, jArr22);
                long[] jArr29 = new long[i12];
                jArr29[0] = 486662;
                ansz.j(jArr27, jArr25, jArr29);
                ansz.b(jArr27, jArr27, jArr3);
                ansz.j(jArr27, jArr27, jArr2);
                ansz.b(jArr27, jArr27, jArr24);
                ansz.b(jArr27, jArr27, jArr2);
                ansz.g(jArr26, jArr27, 4L);
                ansz.e(jArr26);
                ansz.b(jArr27, jArr24, jArr3);
                ansz.i(jArr27, jArr27, jArr3);
                ansz.b(jArr28, jArr25, jArr2);
                ansz.j(jArr27, jArr27, jArr28);
                ansz.h(jArr27, jArr27);
                if (MessageDigest.isEqual(ansz.k(jArr26), ansz.k(jArr27))) {
                    return ansz.k(jArr22);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(t(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] d() {
        byte[] b2 = anud.b(32);
        b2[0] = (byte) (b2[0] | 7);
        int i = b2[31] & 63;
        b2[31] = (byte) i;
        b2[31] = (byte) (i | 128);
        return b2;
    }

    public static byte[] e(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return c(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static final void f(aoen aoenVar, List list) {
        list.add(aoenVar);
    }

    public static final void g(ComponentRegistrar componentRegistrar, List list) {
        list.add(new aoes(componentRegistrar, 0));
    }

    public static ComponentRegistrar h(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new aoez(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new aoez(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new aoez(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new aoez(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new aoez(String.format("Could not instantiate %s", str), e4);
        }
    }

    public static aohf i(aoeo aoeoVar, Class cls) {
        return aoeoVar.a(new aofg(aoff.class, cls));
    }

    public static Object j(aoeo aoeoVar, aofg aofgVar) {
        aohf a2 = aoeoVar.a(aofgVar);
        if (a2 == null) {
            return null;
        }
        return a2.a();
    }

    public static Object k(aoeo aoeoVar, Class cls) {
        return j(aoeoVar, new aofg(aoff.class, cls));
    }

    public static Set l(aoeo aoeoVar, Class cls) {
        aofg aofgVar = new aofg(aoff.class, cls);
        aofi aofiVar = (aofi) aoeoVar;
        if (aofiVar.a.contains(aofgVar)) {
            return (Set) aofiVar.b.c(aofgVar).a();
        }
        throw new aoex(String.format("Attempting to request an undeclared dependency Set<%s>.", aofgVar));
    }

    public static aodv m(Status status, String str) {
        abhg.m(status);
        String str2 = status.g;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        switch (status.f) {
            case 17510:
                return new aodx(str);
            case 17511:
                return new aody(str);
            case 17512:
            default:
                return new aodv(str);
            case 17513:
                return new aodw(str);
            case 17514:
                return new aodu(str);
        }
    }

    public static String n(aobr aobrVar) {
        int ordinal = aobrVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return "SHA-512";
                        }
                        throw new GeneralSecurityException("Unsupported hash ".concat(aobrVar.toString()));
                    }
                    return "SHA-384";
                }
                return "SHA-256";
            }
            return "SHA-224";
        }
        return "SHA-1";
    }

    public static String o(aobr aobrVar) {
        aoci.d(aobrVar);
        return aobrVar.toString().concat("withECDSA");
    }

    public static void p(ByteBuffer byteBuffer, long j) {
        if (j >= 0 && j < 4294967296L) {
            byteBuffer.putInt((int) j);
            return;
        }
        throw new GeneralSecurityException("Index out of range");
    }

    public static boolean q() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static byte[] r(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, byte[] bArr4, int i) {
        return s(str, O(bArr, bArr2), bArr3, bArr4, i);
    }

    public static byte[] s(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Mac mac = (Mac) aobo.b.a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr2 != null && bArr2.length != 0) {
                mac.init(new SecretKeySpec(bArr2, str));
            } else {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            }
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
            byte[] bArr5 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update(bArr3);
                mac.update((byte) i2);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr5, 0, bArr4, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    public static String t(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static byte[] u(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i] = (byte) ((digit * 16) + digit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static int v(EllipticCurve ellipticCurve) {
        return (ansx.d(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair w(aobi aobiVar) {
        return x(E(aobiVar));
    }

    public static KeyPair x(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) aobo.f.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECPrivateKey y(byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) aobo.g.a("EC")).generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static ECPrivateKey z(aobi aobiVar, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) aobo.g.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), E(aobiVar)));
    }

    public aode(Object obj) {
        obj.getClass();
    }
}
