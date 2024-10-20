package com.google.android.libraries.performance.primes.metrics.crash;

import android.os.StrictMode;
import android.util.Pair;
import defpackage.ahkh;
import defpackage.ahnn;
import defpackage.ahnq;
import defpackage.ahnu;
import defpackage.algw;
import defpackage.alha;
import defpackage.alvg;
import defpackage.aozg;
import defpackage.aozs;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apax;
import defpackage.apcc;
import defpackage.apmz;
import defpackage.apna;
import defpackage.armf;
import defpackage.asjg;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class NativeCrashHandlerImpl {
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean c;
    private final algw d;
    private final armf e;

    public NativeCrashHandlerImpl(algw algwVar, armf armfVar) {
        this.d = algwVar;
        this.e = armfVar;
    }

    private static native Pair<ByteBuffer, Thread> awaitSignal();

    private static native boolean initializeSignalHandler(boolean z);

    private static native void unblockSignalHandler();

    public final synchronized void a(ahnn ahnnVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        Thread thread = new Thread(new ahnu(this, ahnnVar, 0), "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    public final /* synthetic */ void b(ahnn ahnnVar) {
        aozy aozyVar;
        if (!((Boolean) ((alha) this.d).a.b()).booleanValue()) {
            this.b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler(false)) {
                ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 76, "NativeCrashHandlerImpl.java")).q("unable to initialize signal handler");
                return;
            }
            try {
                this.a.countDown();
                Pair<ByteBuffer, Thread> awaitSignal = awaitSignal();
                apna apnaVar = null;
                if (awaitSignal != null) {
                    try {
                        aozyVar = apna.a.createBuilder();
                        aozg K = aozg.K((ByteBuffer) awaitSignal.first);
                        aozs aozsVar = aozs.a;
                        apcc apccVar = apcc.a;
                        aozyVar.k(K, aozs.a);
                    } catch (Throwable unused) {
                        aozyVar = null;
                    }
                    try {
                        Thread thread = (Thread) awaitSignal.second;
                        if (aozyVar != null && thread != null) {
                            String name = thread.getName();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            apna apnaVar2 = (apna) aozyVar.b;
                            apna apnaVar3 = apna.a;
                            name.getClass();
                            apnaVar2.b |= 32;
                            apnaVar2.d = name;
                            long id = thread.getId();
                            if (!aozyVar.b.isMutable()) {
                                aozyVar.u();
                            }
                            apna apnaVar4 = (apna) aozyVar.b;
                            apnaVar4.b |= 16;
                            apnaVar4.c = id;
                            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                                aozy createBuilder = apmz.a.createBuilder();
                                String className = stackTraceElement.getClassName();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                apmz apmzVar = (apmz) createBuilder.b;
                                className.getClass();
                                apmzVar.b |= 1;
                                apmzVar.c = className;
                                String methodName = stackTraceElement.getMethodName();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                apmz apmzVar2 = (apmz) createBuilder.b;
                                methodName.getClass();
                                apmzVar2.b |= 2;
                                apmzVar2.d = methodName;
                                int lineNumber = stackTraceElement.getLineNumber();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                apmz apmzVar3 = (apmz) createBuilder.b;
                                apmzVar3.b |= 8;
                                apmzVar3.f = lineNumber;
                                String fileName = stackTraceElement.getFileName();
                                if (fileName != null) {
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apmz apmzVar4 = (apmz) createBuilder.b;
                                    apmzVar4.b |= 4;
                                    apmzVar4.e = fileName;
                                }
                                if (!aozyVar.b.isMutable()) {
                                    aozyVar.u();
                                }
                                apna apnaVar5 = (apna) aozyVar.b;
                                apmz apmzVar5 = (apmz) createBuilder.s();
                                apmzVar5.getClass();
                                apax apaxVar = apnaVar5.e;
                                if (!apaxVar.c()) {
                                    apnaVar5.e = apag.mutableCopy(apaxVar);
                                }
                                apnaVar5.e.add(apmzVar5);
                            }
                        }
                    } catch (Throwable th) {
                        ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(th)).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 'o', "NativeCrashHandlerImpl.java")).q("unable to populate java stack frames");
                    }
                } else {
                    aozyVar = null;
                }
                if (((Boolean) this.e.b()).booleanValue()) {
                    Thread.getAllStackTraces();
                }
                if (aozyVar != null) {
                    apnaVar = (apna) aozyVar.s();
                }
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                aozy a = ((ahnq) ahnnVar).f.a(((ahnq) ahnnVar).a);
                if (!a.b.isMutable()) {
                    a.u();
                }
                asjg asjgVar = (asjg) a.b;
                asjg asjgVar2 = asjg.a;
                asjgVar.g = 5;
                asjgVar.b |= 16;
                if (apnaVar != null) {
                    if (!a.b.isMutable()) {
                        a.u();
                    }
                    asjg asjgVar3 = (asjg) a.b;
                    asjgVar3.j = apnaVar;
                    asjgVar3.b |= 512;
                }
                ((ahnq) ahnnVar).l((asjg) a.s());
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 'H', "NativeCrashHandlerImpl.java")).q("unable to load native_crash_handler_jni");
        }
    }
}
