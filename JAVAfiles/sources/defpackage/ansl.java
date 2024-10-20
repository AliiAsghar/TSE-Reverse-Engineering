package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import javax.crypto.KeyGenerator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansl {
    public ahmn e;
    public Context a = null;
    public String b = null;
    public String c = null;
    private String g = null;
    private anmr h = null;
    public ahmn f = null;
    public anxg d = null;

    private final anmr d() {
        boolean z;
        Object obj = ansm.a;
        ansp anspVar = new ansp();
        try {
            String str = this.g;
            synchronized (ansp.a) {
                String e = aoci.e(str);
                if (!anme.y().containsAlias(e)) {
                    KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(e, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(build);
                    keyGenerator.generateKey();
                    z = true;
                } else {
                    z = false;
                }
            }
            try {
                return anspVar.a(this.g);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (z) {
                    Log.w(ansm.b, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.g), e2);
            }
        } catch (GeneralSecurityException | ProviderException e3) {
            Log.w(ansm.b, "cannot use Android Keystore, it'll be disabled", e3);
            return null;
        }
    }

    private final ahmn e(byte[] bArr) {
        try {
            this.h = new ansp().a(this.g);
            try {
                byte[] bArr2 = new byte[0];
                ahmn H = ahmn.H(bArr);
                anmr anmrVar = this.h;
                try {
                    Object obj = H.a;
                    aozs aozsVar = aozs.a;
                    apcc apccVar = apcc.a;
                    anwt anwtVar = (anwt) apag.parseFrom(anwt.a, (InputStream) obj, aozs.a);
                    if (anwtVar != null && anwtVar.c.d() != 0) {
                        try {
                            anxi anxiVar = (anxi) apag.parseFrom(anxi.a, anmrVar.a(anwtVar.c.H(), bArr2), aozs.a);
                            annb.e(anxiVar);
                            return ahmn.G(annb.b(anxiVar));
                        } catch (apba unused) {
                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                        }
                    }
                    throw new GeneralSecurityException("empty keyset");
                } finally {
                    ((InputStream) H.a).close();
                }
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return f(bArr);
                } catch (IOException unused2) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                ahmn f = f(bArr);
                Log.w(ansm.b, "cannot use Android Keystore, it'll be disabled", e2);
                return f;
            } catch (IOException unused3) {
                throw e2;
            }
        }
    }

    private static final ahmn f(byte[] bArr) {
        return ahmn.G(anme.C(ahmn.H(bArr)));
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, java.lang.Object] */
    public final synchronized ansm a() {
        SharedPreferences sharedPreferences;
        byte[] u;
        ansm ansmVar;
        int i;
        SharedPreferences.Editor edit;
        int i2;
        Integer num;
        if (this.b != null) {
            anxg anxgVar = this.d;
            if (anxgVar != null && this.f == null) {
                this.f = new ahmn(anme.o(anxgVar.toByteArray()), null);
            }
            synchronized (ansm.a) {
                Context context = this.a;
                String str = this.b;
                String str2 = this.c;
                if (str != null) {
                    Context applicationContext = context.getApplicationContext();
                    int i3 = 0;
                    if (str2 == null) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                    } else {
                        sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                    }
                    try {
                        String string = sharedPreferences.getString(str, null);
                        if (string == null) {
                            u = null;
                        } else {
                            u = aode.u(string);
                        }
                        if (u == null) {
                            if (this.g != null) {
                                this.h = d();
                            }
                            ahmn ahmnVar = this.f;
                            if (ahmnVar != null) {
                                Object obj = ahmnVar.a;
                                if (obj == null) {
                                    obj = anme.o(ahmnVar.u().toByteArray());
                                }
                                hwo hwoVar = new hwo();
                                anmy anmyVar = new anmy((anme) obj);
                                anmyVar.c = anmz.a;
                                hwo hwoVar2 = anmyVar.e;
                                if (hwoVar2 != null) {
                                    hwoVar2.f();
                                }
                                anmyVar.a = true;
                                if (anmyVar.e == null) {
                                    hwoVar.f();
                                    anmyVar.e = hwoVar;
                                    hwoVar.b.add(anmyVar);
                                    if (!hwoVar.a) {
                                        hwoVar.a = true;
                                        aozy createBuilder = anxi.a.createBuilder();
                                        ArrayList arrayList = new ArrayList(hwoVar.b.size());
                                        ?? r8 = hwoVar.b;
                                        int i4 = 0;
                                        while (i4 < r8.size() - 1) {
                                            int i5 = i4 + 1;
                                            if (((anmy) r8.get(i4)).c == anmz.a && ((anmy) r8.get(i5)).c != anmz.a) {
                                                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                                            }
                                            i4 = i5;
                                        }
                                        HashSet hashSet = new HashSet();
                                        Integer num2 = null;
                                        for (anmy anmyVar2 : hwoVar.b) {
                                            anmx anmxVar = anmyVar2.b;
                                            anmz anmzVar = anmyVar2.c;
                                            if (anmzVar != null) {
                                                if (anmzVar == anmz.a) {
                                                    i2 = i3;
                                                    while (true) {
                                                        if (i2 != 0 && !hashSet.contains(Integer.valueOf(i2))) {
                                                            break;
                                                        }
                                                        SecureRandom secureRandom = new SecureRandom();
                                                        byte[] bArr = new byte[4];
                                                        int i6 = i3;
                                                        while (i6 == 0) {
                                                            secureRandom.nextBytes(bArr);
                                                            i6 = ((bArr[2] & 255) << 8) | ((bArr[i3] & 255) << 24) | ((bArr[1] & 255) << 16) | (bArr[3] & 255);
                                                            i3 = 0;
                                                        }
                                                        i2 = i6;
                                                    }
                                                } else {
                                                    i2 = 0;
                                                }
                                                Integer valueOf = Integer.valueOf(i2);
                                                if (!hashSet.contains(valueOf)) {
                                                    hashSet.add(valueOf);
                                                    anme anmeVar = anmyVar2.d;
                                                    if (true != anmyVar2.f.j()) {
                                                        num = null;
                                                    } else {
                                                        num = valueOf;
                                                    }
                                                    anme b = antk.a.b(anmyVar2.f, num);
                                                    anmx anmxVar2 = anmyVar2.b;
                                                    anna annaVar = new anna(b, anmxVar2, i2, anmyVar2.a);
                                                    createBuilder.aU(annb.g(b, anmxVar2, i2));
                                                    if (anmyVar2.a) {
                                                        if (num2 == null) {
                                                            if (anmyVar2.b == anmx.a) {
                                                                num2 = valueOf;
                                                            } else {
                                                                throw new GeneralSecurityException("Primary key is not enabled");
                                                            }
                                                        } else {
                                                            throw new GeneralSecurityException("Two primaries were set");
                                                        }
                                                    }
                                                    arrayList.add(annaVar);
                                                    i3 = 0;
                                                } else {
                                                    throw new GeneralSecurityException(a.cb(i2, "Id ", " is used twice in the keyset"));
                                                }
                                            } else {
                                                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                                            }
                                        }
                                        if (num2 != null) {
                                            int intValue = num2.intValue();
                                            if (!createBuilder.b.isMutable()) {
                                                createBuilder.u();
                                            }
                                            ((anxi) createBuilder.b).b = intValue;
                                            anxi anxiVar = (anxi) createBuilder.s();
                                            annb.e(anxiVar);
                                            annb annbVar = new annb(anxiVar, arrayList, (anth) hwoVar.c);
                                            Context context2 = this.a;
                                            String str3 = this.b;
                                            String str4 = this.c;
                                            if (str3 != null) {
                                                Context applicationContext2 = context2.getApplicationContext();
                                                if (str4 == null) {
                                                    edit = PreferenceManager.getDefaultSharedPreferences(applicationContext2).edit();
                                                    i = 0;
                                                } else {
                                                    i = 0;
                                                    edit = applicationContext2.getSharedPreferences(str4, 0).edit();
                                                }
                                                anmr anmrVar = this.h;
                                                try {
                                                    if (anmrVar != null) {
                                                        anxi anxiVar2 = annbVar.a;
                                                        byte[] b2 = anmrVar.b(anxiVar2.toByteArray(), new byte[i]);
                                                        aozy createBuilder2 = anwt.a.createBuilder();
                                                        aozb w = aozb.w(b2);
                                                        if (!createBuilder2.b.isMutable()) {
                                                            createBuilder2.u();
                                                        }
                                                        ((anwt) createBuilder2.b).c = w;
                                                        anxk a = annl.a(anxiVar2);
                                                        if (!createBuilder2.b.isMutable()) {
                                                            createBuilder2.u();
                                                        }
                                                        anwt anwtVar = (anwt) createBuilder2.b;
                                                        a.getClass();
                                                        anwtVar.d = a;
                                                        anwtVar.b = 1 | anwtVar.b;
                                                        if (!edit.putString(str3, aode.t(((anwt) createBuilder2.s()).toByteArray())).commit()) {
                                                            throw new IOException("Failed to write to SharedPreferences");
                                                        }
                                                    } else if (!edit.putString(str3, aode.t(annbVar.a.toByteArray())).commit()) {
                                                        throw new IOException("Failed to write to SharedPreferences");
                                                    }
                                                    this.e = ahmn.G(annbVar);
                                                } catch (IOException e) {
                                                    throw new GeneralSecurityException(e);
                                                }
                                            } else {
                                                throw new IllegalArgumentException("keysetName cannot be null");
                                            }
                                        } else {
                                            throw new GeneralSecurityException("No primary was set");
                                        }
                                    } else {
                                        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
                                    }
                                } else {
                                    throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
                                }
                            } else {
                                throw new GeneralSecurityException("cannot read or generate keyset");
                            }
                        } else if (this.g != null) {
                            this.e = e(u);
                        } else {
                            this.e = f(u);
                        }
                        ansmVar = new ansm(this);
                    } catch (ClassCastException | IllegalArgumentException unused) {
                        throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        return ansmVar;
    }

    public final void b(String str) {
        if (str.startsWith("android-keystore://")) {
            this.g = str;
            return;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public final void c(Context context, String str, String str2) {
        if (context != null) {
            this.a = context;
            this.b = str;
            this.c = str2;
            return;
        }
        throw new IllegalArgumentException("need an Android context");
    }
}
