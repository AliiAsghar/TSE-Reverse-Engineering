package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.vcard.VCardConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ahop {
    public ahop() {
    }

    public static int a(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            i2 = 5;
                            if (i != 5) {
                                return 0;
                            }
                        }
                    }
                }
            }
            return i2;
        }
        return 6;
    }

    public static void b(Context context) {
        try {
            tc tcVar = new tc();
            tcVar.c.k(Color.parseColor("#eeeeee"));
            tcVar.b().b(context, Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (ActivityNotFoundException unused) {
            throw new aicr();
        }
    }

    public static aozy c(aicm aicmVar, int i) {
        return d(aicmVar, 2, i);
    }

    public static aozy d(aicm aicmVar, int i, int i2) {
        boolean z;
        if (aicmVar.c != 0) {
            aozy createBuilder = anah.a.createBuilder();
            aozy createBuilder2 = amzw.a.createBuilder();
            String str = aicmVar.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            amzw amzwVar = (amzw) apagVar;
            str.getClass();
            amzwVar.b |= 1;
            amzwVar.c = str;
            int i3 = aicmVar.b;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            amzw amzwVar2 = (amzw) createBuilder2.b;
            int i4 = 2;
            amzwVar2.b |= 2;
            amzwVar2.d = i3;
            amzw amzwVar3 = (amzw) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            anah anahVar = (anah) apagVar2;
            amzwVar3.getClass();
            anahVar.e = amzwVar3;
            anahVar.b |= 4;
            if (i != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            anah anahVar2 = (anah) apagVar3;
            anahVar2.b |= 16777216;
            anahVar2.j = z;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            anah anahVar3 = (anah) apagVar4;
            anahVar3.n = i - 1;
            anahVar3.b |= Integer.MIN_VALUE;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            apag apagVar5 = createBuilder.b;
            anah anahVar4 = (anah) apagVar5;
            anahVar4.l = 1;
            anahVar4.b |= 536870912;
            if (!apagVar5.isMutable()) {
                createBuilder.u();
            }
            if (i2 != 3) {
                i4 = 3;
            }
            apag apagVar6 = createBuilder.b;
            anah anahVar5 = (anah) apagVar6;
            anahVar5.o = i4 - 1;
            anahVar5.c |= 1;
            if (!apagVar6.isMutable()) {
                createBuilder.u();
            }
            apag apagVar7 = createBuilder.b;
            anah anahVar6 = (anah) apagVar7;
            anahVar6.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
            anahVar6.k = "4.1.0";
            if (!apagVar7.isMutable()) {
                createBuilder.u();
            }
            anah anahVar7 = (anah) createBuilder.b;
            anahVar7.c |= 8;
            anahVar7.p = false;
            return createBuilder;
        }
        throw null;
    }

    public static String e(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length != 0 && packageInfo.signatures[0] != null) {
                return h(packageInfo.signatures[0]);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(String str) {
        char c;
        if (str == null) {
            return 13;
        }
        switch (str.hashCode()) {
            case -1698126997:
                if (str.equals("REQUEST_DENIED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1125000185:
                if (str.equals("INVALID_REQUEST")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -813482689:
                if (str.equals("ZERO_RESULTS")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2524:
                if (str.equals("OK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1023286998:
                if (str.equals("NOT_FOUND")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1831775833:
                if (str.equals("OVER_QUERY_LIMIT")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return 0;
        }
        if (c != 2) {
            if (c != 3) {
                if (c != 4) {
                    if (c != 5) {
                        return 13;
                    }
                    return 9013;
                }
                return 9012;
            }
            return 9011;
        }
        return 9010;
    }

    public static String g(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    private static String h(Signature signature) {
        try {
            return amcn.h.j(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", e);
            return null;
        }
    }

    public /* synthetic */ ahop(byte[] bArr) {
    }

    public ahop(armf armfVar) {
        armfVar.getClass();
    }
}
