package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmt {
    public static volatile aqvw a;
    private static volatile aqux b;
    private static volatile aqux c;

    public static aqux a() {
        aqux aquxVar = b;
        if (aquxVar == null) {
            synchronized (abmt.class) {
                aquxVar = b;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", "Handshake");
                    a2.b();
                    abna abnaVar = abna.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(abnaVar);
                    a2.d = new arkw(abnb.a);
                    aquxVar = a2.a();
                    b = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux b() {
        aqux aquxVar = c;
        if (aquxVar == null) {
            synchronized (abmt.class) {
                aquxVar = c;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", "RestoreCustomD2DItem");
                    a2.b();
                    abni abniVar = abni.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(abniVar);
                    a2.d = new arkw(abnj.a);
                    aquxVar = a2.a();
                    c = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static final /* synthetic */ abnd c(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (abnd) s;
    }

    public static final void d(aozb aozbVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        abnd abndVar = (abnd) aozyVar.b;
        abnd abndVar2 = abnd.a;
        abndVar.b |= 1;
        abndVar.e = aozbVar;
    }

    public static int e(int i) {
        int[] G = a.G();
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = G[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static String f(File file, String str) {
        int i = acch.a;
        return new File(file, str).getPath();
    }

    public static File i(Context context) {
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    public static KeyPair j() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static File k(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                str2 = "com.google.InstanceId_" + adqg.m(str.getBytes("UTF-8")) + ".properties";
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        abmt abmtVar = accg.a;
        return new File(f(i(context), str2));
    }

    private static final KeyPair l(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("InstanceID", "Invalid key stored ".concat(e.toString()));
                throw new acbo(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new acbo(e2);
        }
    }

    private static final void m(Context context, String str, acbn acbnVar) {
        try {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Writing key to properties file");
            }
            File k = k(context, str);
            k.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", acbnVar.b());
            properties.setProperty("pri", acbnVar.a());
            properties.setProperty("cre", String.valueOf(acbnVar.b));
            FileOutputStream fileOutputStream = new FileOutputStream(k);
            try {
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            Log.w("InstanceID", "Failed to write key: ".concat(e.toString()));
        }
    }

    private static final acbn n(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("pub");
            String property2 = properties.getProperty("pri");
            if (property != null && property2 != null) {
                KeyPair l = l(property, property2);
                try {
                    String property3 = properties.getProperty("cre");
                    if (property3 != null) {
                        acbn acbnVar = new acbn(l, Long.parseLong(property3));
                        fileInputStream.close();
                        return acbnVar;
                    }
                    throw new acbo(new NullPointerException("cre"));
                } catch (NumberFormatException e) {
                    throw new acbo(e);
                }
            }
            fileInputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static final acbn o(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(adqg.n(str, "|P|"), null);
        String string2 = sharedPreferences.getString(adqg.n(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair l = l(string, string2);
        String string3 = sharedPreferences.getString(adqg.n(str, "cre"), null);
        long j = 0;
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
        }
        return new acbn(l, j);
    }

    private static final void p(Context context, String str, acbn acbnVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (acbnVar.equals(o(sharedPreferences, str))) {
                return;
            }
        } catch (acbo unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(adqg.n(str, "|P|"), acbnVar.b());
        edit.putString(adqg.n(str, "|K|"), acbnVar.a());
        edit.putString(adqg.n(str, "cre"), String.valueOf(acbnVar.b));
        edit.commit();
    }

    public final acbn g(Context context, String str) {
        acbn acbnVar = new acbn(j(), System.currentTimeMillis());
        try {
            acbn h = h(context, str);
            if (h != null) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", "Loaded key after generating new one, using loaded one");
                }
                return h;
            }
        } catch (acbo unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Generated new key");
        }
        m(context, str, acbnVar);
        p(context, str, acbnVar);
        return acbnVar;
    }

    public final acbn h(Context context, String str) {
        acbn n;
        try {
            File k = k(context, str);
            if (!k.exists()) {
                n = null;
            } else {
                try {
                    n = n(k);
                } catch (IOException e) {
                    if (Log.isLoggable("InstanceID", 3)) {
                        Log.d("InstanceID", "Failed to read key from file, retrying: ".concat(e.toString()));
                    }
                    try {
                        n = n(k);
                    } catch (IOException e2) {
                        Log.w("InstanceID", "IID file exists, but failed to read from it: ".concat(e2.toString()));
                        throw new acbo(e2);
                    }
                }
            }
        } catch (acbo e3) {
            e = e3;
        }
        if (n != null) {
            p(context, str, n);
            return n;
        }
        e = null;
        try {
            acbn o = o(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (o != null) {
                m(context, str, o);
                return o;
            }
        } catch (acbo e4) {
            e = e4;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }
}
