package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.android.vcard.VCardConfig;
import j$.util.Optional;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aehl {
    public static final alvi a = alvi.m("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule");

    public static Optional a(Context context) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return Optional.empty();
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = packageManager.getPackageInfo(packageName, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS).signingInfo;
                signatureArr = signingInfo.getSigningCertificateHistory();
            } else {
                signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
                if (signatureArr.length > 1) {
                    ((alvg) ((alvg) a.h()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "getAndroidCert", 129, "RpcModule.java")).q("Client not signed with exactly one certificate are forbidden.");
                    return Optional.empty();
                }
            }
            if (signatureArr != null && signatureArr.length != 0) {
                return Optional.of(d.al(MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray())));
            }
            ((alvg) ((alvg) a.h()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "getAndroidCert", 134, "RpcModule.java")).q("Error reading signatures for packages");
            return Optional.empty();
        } catch (PackageManager.NameNotFoundException e) {
            ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "getAndroidCert", (char) 141, "RpcModule.java")).q("Error getting package info: ");
            return Optional.empty();
        } catch (NoSuchAlgorithmException e2) {
            ((alvg) ((alvg) ((alvg) a.h()).g(e2)).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "getAndroidCert", (char) 144, "RpcModule.java")).q("Error getting messageDigest: ");
            return Optional.empty();
        }
    }
}
