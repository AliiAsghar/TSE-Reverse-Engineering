package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.apps.messaging.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adve {
    public final Object a;
    public final Object b;
    public Object c;

    public adve(apwt apwtVar, anen anenVar) {
        this.b = apwtVar;
        this.a = anenVar;
    }

    public final void a(Object obj) {
        if (((adxq) ((ConcurrentHashMap) this.a).remove(obj)) != null) {
            ((HashMap) this.b).remove(null);
        }
    }

    public final synchronized algw b() {
        algw algwVar;
        DataInputStream dataInputStream;
        int readInt;
        algw algwVar2;
        if (this.c == null) {
            Object obj = this.b;
            if (!((File) obj).exists()) {
                Log.w("CacheStorage", "cache doesn't exist");
                algwVar = alfd.a;
            } else if (((File) obj).isFile() && ((File) obj).length() >= 4) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream((File) obj));
                    try {
                        readInt = dataInputStream.readInt();
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    Log.e("CacheStorage", "error reading cache: ".concat(e.toString()));
                }
                if (readInt != 1) {
                    Log.e("CacheStorage", a.bV(readInt, "invalid cache version: "));
                    dataInputStream.close();
                    ((File) obj).delete();
                    algwVar = alfd.a;
                } else {
                    int readInt2 = dataInputStream.readInt();
                    if (readInt2 <= 0) {
                        Log.e("CacheStorage", a.bV(readInt2, "invalid length: "));
                        algwVar2 = alfd.a;
                    } else {
                        byte[] bArr = new byte[readInt2];
                        dataInputStream.readFully(bArr);
                        accn accnVar = (accn) apag.parseFrom(accn.a, bArr, aozs.a());
                        if ((1 & accnVar.b) != 0) {
                            aovk aovkVar = accnVar.c;
                            if (aovkVar == null) {
                                aovkVar = aovk.a;
                            }
                            algwVar2 = algw.i(aovkVar);
                        } else {
                            Log.e("CacheStorage", "message wrapper is empty");
                            algwVar2 = alfd.a;
                        }
                    }
                    dataInputStream.close();
                    algwVar = algwVar2;
                }
            } else {
                Log.e("CacheStorage", "cache is corrupted");
                ((File) obj).delete();
                algwVar = alfd.a;
            }
            this.c = (aovk) algwVar.e();
        }
        return algw.h(this.c);
    }

    public final synchronized void c(aovk aovkVar) {
        this.c = null;
        if (!((File) this.a).exists() && !((File) this.a).mkdirs()) {
            Log.e("CacheStorage", "failed to create cache dir");
            return;
        }
        if (((File) this.b).exists() && ((File) this.b).isDirectory() && !((File) this.b).delete()) {
            Log.e("CacheStorage", "failed to delete cache dir collision");
            return;
        }
        aozy createBuilder = accn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        accn accnVar = (accn) createBuilder.b;
        aovkVar.getClass();
        accnVar.c = aovkVar;
        accnVar.b |= 1;
        byte[] byteArray = ((accn) createBuilder.s()).toByteArray();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream((File) this.b));
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(byteArray.length);
                dataOutputStream.write(byteArray);
                dataOutputStream.close();
                this.c = aovkVar;
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("CacheStorage", "failed to write cache: ".concat(e.toString()));
        }
    }

    public final akul d(aech aechVar) {
        Object obj = this.c;
        if (obj == null) {
            return aktp.ag(new aect("NOT_AVAILABLE", aecg.e, 4));
        }
        return akul.g(arro.I(arwi.e(arws.b), new adzx((adzw) ((ahjj) obj).a, aechVar, (arpe) null, 0)));
    }

    public final String e() {
        return ((ykw) this.b).f(f(), "auto");
    }

    public final String f() {
        if (this.c == null) {
            this.c = ((Resources) this.a).getString(R.string.current_country_pref_key);
        }
        return (String) this.c;
    }

    public adve(Context context, ykw ykwVar) {
        this.a = context.getResources();
        this.b = ykwVar;
    }

    public adve(File file) {
        this.c = null;
        this.a = file;
        this.b = new File(file, "gmscompliance.pb");
    }

    public adve() {
        this.a = new ConcurrentHashMap();
        this.b = new HashMap();
    }
}
