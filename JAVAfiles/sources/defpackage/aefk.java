package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefk {
    public final aefo a;
    public final alpt b;
    private final algw c = algw.h(null);

    /* JADX WARN: Type inference failed for: r0v0, types: [aefo, java.lang.Object] */
    public aefk(aday adayVar) {
        this.a = adayVar.a;
        this.b = ((alpr) adayVar.b).g();
    }

    public static algw a(Class cls) {
        try {
            return algw.i((aefp) cls.getDeclaredConstructor(null).newInstance(null));
        } catch (ReflectiveOperationException unused) {
            return alfd.a;
        }
    }

    static /* synthetic */ alor c() {
        abjr abjrVar = abjr.DO_NOTHING;
        abjr abjrVar2 = abjr.FILE_DELETION;
        abjr abjrVar3 = abjr.EXEC_SQL_FIX;
        abjr abjrVar4 = abjr.SEND_BROADCAST;
        abjr abjrVar5 = abjr.PROCESS_RESTART;
        abjr abjrVar6 = abjr.SHARED_PREFERENCES_DELETION;
        abjr abjrVar7 = abjr.COMPONENT_ENABLED_SETTING_FIX;
        abjr abjrVar8 = abjr.START_SERVICE;
        albo.v(abjrVar, aefz.class);
        albo.v(abjrVar2, aegc.class);
        albo.v(abjrVar3, aega.class);
        albo.v(abjrVar4, aege.class);
        albo.v(abjrVar5, aegd.class);
        albo.v(abjrVar6, aegf.class);
        albo.v(abjrVar7, aefy.class);
        albo.v(abjrVar8, aegg.class);
        return altc.a(8, new Object[]{abjrVar, aefz.class, abjrVar2, aegc.class, abjrVar3, aega.class, abjrVar4, aege.class, abjrVar5, aegd.class, abjrVar6, aegf.class, abjrVar7, aefy.class, abjrVar8, aegg.class});
    }

    public final alor b() {
        if (this.c.f()) {
            alok alokVar = new alok();
            alokVar.l(c());
            alokVar.l((Map) ((alhr) this.c.b()).get());
            return alokVar.b();
        }
        return c();
    }

    public final void d(Context context, abjr abjrVar, abjp abjpVar) {
        Log.e("AppDoctor", "Failed on fix: " + abjrVar.a());
        aozy createBuilder = abjq.a.createBuilder();
        String packageName = context.getPackageName();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        abjq abjqVar = (abjq) apagVar;
        packageName.getClass();
        abjqVar.b |= 1;
        abjqVar.c = packageName;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        abjq abjqVar2 = (abjq) createBuilder.b;
        abjqVar2.g = abjpVar.a();
        abjqVar2.b |= 16;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        abjq abjqVar3 = (abjq) createBuilder.b;
        abjqVar3.f = a.ao(6);
        abjqVar3.b |= 8;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aefo aefoVar = this.a;
        abjq abjqVar4 = (abjq) createBuilder.b;
        abjqVar4.e = abjrVar.a();
        abjqVar4.b |= 4;
        aefoVar.a((abjq) createBuilder.s());
    }

    public final void e(Context context, abkf abkfVar, abjp abjpVar) {
        abjr abjrVar;
        if (abkfVar != null) {
            abjrVar = abjr.b(abkfVar.b);
            if (abjrVar == null) {
                abjrVar = abjr.UNRECOGNIZED;
            }
        } else {
            abjrVar = abjr.UNSPECIFIED_FIX;
        }
        d(context, abjrVar, abjpVar);
    }

    public final void f(Context context, abjr abjrVar, abjp abjpVar) {
        aozy createBuilder = abjq.a.createBuilder();
        String packageName = context.getPackageName();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        abjq abjqVar = (abjq) apagVar;
        packageName.getClass();
        abjqVar.b |= 1;
        abjqVar.c = packageName;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        abjq abjqVar2 = (abjq) createBuilder.b;
        abjqVar2.g = abjpVar.a();
        abjqVar2.b |= 16;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        abjq abjqVar3 = (abjq) createBuilder.b;
        abjqVar3.f = a.ao(5);
        abjqVar3.b |= 8;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aefo aefoVar = this.a;
        abjq abjqVar4 = (abjq) createBuilder.b;
        abjqVar4.e = abjrVar.a();
        abjqVar4.b |= 4;
        aefoVar.a((abjq) createBuilder.s());
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final boolean g(Context context, abjp abjpVar) {
        List<abkf> list;
        abjr abjrVar;
        if (adcx.z(context)) {
            aeft aeftVar = new aeft();
            aeftVar.b = context;
            aeftVar.a = abjpVar;
            aeftVar.c = this.a;
            aefu a = aeftVar.a();
            try {
                aefm aefmVar = new aefm(context);
                try {
                    aday adayVar = new aday(new aoij(this, aefmVar, a, (byte[]) null));
                    alor b = b();
                    Bundle call = aefmVar.b.call("get_fixes", null, aefmVar.a());
                    if (call == null) {
                        Log.e("AppDoctorProviderClient", "Failed to get config from AppDoctorProvider.");
                        int i = alog.d;
                        list = alsx.a;
                    } else {
                        byte[] byteArray = call.getByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig");
                        if (byteArray == null) {
                            Log.e("AppDoctorProviderClient", "TeleDoctor Config empty");
                            int i2 = alog.d;
                            list = alsx.a;
                        } else {
                            try {
                                aozs aozsVar = aozs.a;
                                apcc apccVar = apcc.a;
                                list = ((abkg) apag.parseFrom(abkg.a, byteArray, aozs.a)).b;
                            } catch (apba e) {
                                Log.e("AppDoctorProviderClient", "Failed to parse TeleDoctorConfig.", e);
                                int i3 = alog.d;
                                list = alsx.a;
                            }
                        }
                    }
                    for (abkf abkfVar : list) {
                        abjr b2 = abjr.b(abkfVar.b);
                        if (b2 == null) {
                            b2 = abjr.UNRECOGNIZED;
                        }
                        if (!b.containsKey(b2)) {
                            Context context2 = a.b;
                            abjp abjpVar2 = a.a;
                            if (abkfVar != null) {
                                abjrVar = abjr.b(abkfVar.b);
                                if (abjrVar == null) {
                                    abjrVar = abjr.UNRECOGNIZED;
                                }
                            } else {
                                abjrVar = abjr.UNSPECIFIED_FIX;
                            }
                            f(context2, abjrVar, abjpVar2);
                        } else {
                            abjr b3 = abjr.b(abkfVar.b);
                            if (b3 == null) {
                                b3 = abjr.UNRECOGNIZED;
                            }
                            algw a2 = a((Class) b.get(b3));
                            if (!a2.f()) {
                                e(a.b, abkfVar, a.a);
                            } else {
                                String str = abkfVar.d;
                                abjr b4 = abjr.b(abkfVar.b);
                                if (b4 == null) {
                                    b4 = abjr.UNRECOGNIZED;
                                }
                                abjr abjrVar2 = b4;
                                abke abkeVar = abkfVar.c;
                                if (abkeVar == null) {
                                    abkeVar = abke.a;
                                }
                                adayVar.A(new aefs(str, abjrVar2, abkeVar, (aefp) a2.b(), aefs.a));
                            }
                        }
                    }
                    atkn K = adayVar.K(a);
                    try {
                        K.b.get();
                        boolean z = K.a;
                        aefmVar.close();
                        return z;
                    } catch (InterruptedException | RuntimeException | ExecutionException unused) {
                        e(context, abkf.a, abjpVar);
                        aefmVar.close();
                    }
                } finally {
                }
            } catch (RemoteException | RuntimeException unused2) {
                e(context, abkf.a, abjpVar);
            }
        }
        return false;
    }
}
