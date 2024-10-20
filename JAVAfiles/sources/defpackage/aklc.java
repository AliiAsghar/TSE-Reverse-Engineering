package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aklc extends aklb implements akkg, aklg {
    public aksr v;
    public armf w;

    static {
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.akkg
    public final long A() {
        long startElapsedRealtime;
        startElapsedRealtime = Process.getStartElapsedRealtime();
        return startElapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        boolean isIsolated;
        ApplicationInfo applicationInfo;
        ClassLoader classLoader;
        isIsolated = Process.isIsolated();
        if (isIsolated) {
            super.attachBaseContext(context);
            return;
        }
        super.attachBaseContext(context);
        Log.i("MultiDex", "Installing application");
        if (!az.b) {
            IOException e = null;
            try {
                try {
                    applicationInfo = getApplicationInfo();
                } catch (RuntimeException e2) {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
                    applicationInfo = null;
                }
                if (applicationInfo == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                File file = new File(applicationInfo.sourceDir);
                File file2 = new File(applicationInfo.dataDir);
                synchronized (az.a) {
                    if (!az.a.contains(file)) {
                        az.a.add(file);
                        Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                        try {
                            classLoader = getClassLoader();
                        } catch (RuntimeException e3) {
                            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e3);
                        }
                        if (!(classLoader instanceof BaseDexClassLoader)) {
                            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                            classLoader = null;
                        }
                        if (classLoader != null) {
                            try {
                                File file3 = new File(getFilesDir(), "secondary-dexes");
                                if (file3.isDirectory()) {
                                    Log.i("MultiDex", "Clearing old secondary dex dir (" + file3.getPath() + ").");
                                    File[] listFiles = file3.listFiles();
                                    if (listFiles == null) {
                                        Log.w("MultiDex", "Failed to list secondary dex dir content (" + file3.getPath() + ").");
                                    } else {
                                        for (File file4 : listFiles) {
                                            Log.i("MultiDex", "Trying to delete old file " + file4.getPath() + " of size " + file4.length());
                                            if (!file4.delete()) {
                                                Log.w("MultiDex", "Failed to delete old file ".concat(String.valueOf(file4.getPath())));
                                            } else {
                                                Log.i("MultiDex", "Deleted old file ".concat(String.valueOf(file4.getPath())));
                                            }
                                        }
                                        if (!file3.delete()) {
                                            Log.w("MultiDex", "Failed to delete secondary dex dir ".concat(String.valueOf(file3.getPath())));
                                        } else {
                                            Log.i("MultiDex", "Deleted old secondary dex dir ".concat(String.valueOf(file3.getPath())));
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                            }
                            File file5 = new File(file2, "code_cache");
                            try {
                                az.c(file5);
                            } catch (IOException unused) {
                                file5 = new File(getFilesDir(), "code_cache");
                                az.c(file5);
                            }
                            File file6 = new File(file5, "secondary-dexes");
                            az.c(file6);
                            bb bbVar = new bb(file, file6);
                            try {
                                try {
                                    az.b(classLoader, file6, bbVar.a(this, false));
                                } catch (IOException e4) {
                                    Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e4);
                                    az.b(classLoader, file6, bbVar.a(this, true));
                                }
                                try {
                                } catch (IOException e5) {
                                    e = e5;
                                }
                                if (e != null) {
                                    throw e;
                                }
                            } finally {
                                try {
                                    bbVar.close();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    }
                }
                Log.i("MultiDex", "install done");
                return;
            } catch (Exception e6) {
                Log.e("MultiDex", "MultiDex installation failure", e6);
                throw new RuntimeException("MultiDex installation failed (" + e6.getMessage() + ").");
            }
        }
        Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r0.startsWith(":privileged_process") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r7 = this;
            java.lang.Boolean r0 = defpackage.aiep.b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L7e
            boolean r0 = defpackage.cok$$ExternalSyntheticApiModelOutline0.m152m()
            if (r0 == 0) goto Lf
        Lc:
            r0 = r2
            goto L78
        Lf:
            java.lang.String r0 = defpackage.aiep.a
            r3 = -1
            if (r0 == 0) goto L15
            goto L32
        L15:
            java.lang.String r0 = defpackage.aiep.a(r7)
            if (r0 != 0) goto L1d
            r0 = 0
            goto L32
        L1d:
            r4 = 58
            int r4 = r0.indexOf(r4)
            if (r4 != r3) goto L2a
            java.lang.String r0 = ""
            defpackage.aiep.a = r0
            goto L30
        L2a:
            java.lang.String r0 = r0.substring(r4)
            defpackage.aiep.a = r0
        L30:
            java.lang.String r0 = defpackage.aiep.a
        L32:
            if (r0 != 0) goto L36
        L34:
            r0 = r1
            goto L78
        L36:
            int r4 = r0.hashCode()
            r5 = 3
            r6 = 2
            switch(r4) {
                case -737791795: goto L5e;
                case -733923188: goto L54;
                case 1771111950: goto L4a;
                case 1892872565: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L67
        L40:
            java.lang.String r4 = ":leakcanary"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L67
            r3 = r5
            goto L67
        L4a:
            java.lang.String r4 = ":train"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L67
            r3 = r2
            goto L67
        L54:
            java.lang.String r4 = ":learning_bg"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L67
            r3 = r1
            goto L67
        L5e:
            java.lang.String r4 = ":primes_lifeboat"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L67
            r3 = r6
        L67:
            if (r3 == 0) goto Lc
            if (r3 == r2) goto Lc
            if (r3 == r6) goto Lc
            if (r3 == r5) goto Lc
            java.lang.String r3 = ":privileged_process"
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L34
            goto Lc
        L78:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.aiep.b = r0
        L7e:
            java.lang.Boolean r0 = defpackage.aiep.b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L87
            return r2
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklc.e():boolean");
    }

    @Override // android.app.Application
    public void onCreate() {
        akrh e;
        if (e()) {
            if (!akqj.u()) {
                long s = akec.s();
                long r = akec.r(s);
                aktr c = aktr.c();
                if (c.f()) {
                    akrc e2 = this.v.e(r, s * 1000000);
                    try {
                        akqj.q();
                        e = aktp.e("Application.onCreate");
                        try {
                            ((aodz) this.w.b()).E();
                            super.onCreate();
                            e.close();
                            e2.close();
                            return;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            e2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                aksa a = c.a();
                try {
                    e = aktp.e("Application creation");
                    try {
                        akrh e3 = aktp.e("Application.onCreate");
                        try {
                            ((aodz) this.w.b()).E();
                            super.onCreate();
                            e3.close();
                            e.close();
                            a.close();
                            return;
                        } finally {
                        }
                    } finally {
                        try {
                            e.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        a.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            ((aodz) this.w.b()).E();
            super.onCreate();
            return;
        }
        super.onCreate();
    }
}
