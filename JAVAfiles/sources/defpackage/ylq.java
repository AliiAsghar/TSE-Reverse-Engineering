package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import j$.util.Optional;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ylq implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ylq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v101, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v106, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v135, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, aegu] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        Object apply;
        Object apply2;
        aovh aovhVar;
        Object i;
        switch (this.c) {
            case 0:
                return aktp.ai(this.b, ((ylr) this.a).c);
            case 1:
                xru xruVar = (xru) this.a;
                rwd rwdVar = (rwd) xruVar.c.b();
                xss xssVar = (xss) this.b;
                rve rveVar = xssVar.a;
                Optional ofNullable = Optional.ofNullable(rwdVar.r(rveVar));
                if (ofNullable.isEmpty()) {
                    alwl alwlVar = (alwl) xru.a.i();
                    alwlVar.X(ydl.f, rveVar);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "verifyMessageWithAttachment", 235, "FileUploadCallbackHandler.java")).q("Upload callback is called, however message was already deleted from the DB. Ignoring.");
                } else {
                    xpf.a(((MessageCoreData) ofNullable.get()).B()).getClass();
                }
                if (ofNullable.isEmpty()) {
                    return Optional.empty();
                }
                xpd xpdVar = new xpd();
                xpdVar.aj("updateFileTransferTable");
                xpdVar.f(new xol(ofNullable, 7));
                xpdVar.c(xssVar.d);
                xpdVar.a().e();
                if (((MessageCoreData) ofNullable.get()).j() != 12) {
                    ((MessageCoreData) ofNullable.get()).bI(4);
                    ((rwd) xruVar.c.b()).N((MessageCoreData) ofNullable.get());
                    return ofNullable;
                }
                return ofNullable;
            case 2:
                rxq rxqVar = (rxq) ((ypr) this.a).b.b();
                String str = (String) this.b;
                ParticipantsTable.BindData a = rxqVar.a(str);
                if (a == null || yyb.G(a.m()).c()) {
                    return false;
                }
                tbb f = ParticipantsTable.f();
                f.aj("markParticipantAsAllowlisted");
                f.u(new ypj().a());
                f.t(false);
                return Boolean.valueOf(f.d(str));
            case 3:
                rtz rtzVar = (rtz) ((ypr) this.b).c.b();
                sng sngVar = new sng();
                sngVar.aj("updateConversationSpamDismissStatus");
                sngVar.U(true);
                return Boolean.valueOf(rtzVar.ah((ConversationIdType) this.a, sngVar));
            case 4:
                return aktp.ai(new ytr(this.a, 3), ((yup) this.b).c);
            case 5:
                thp thpVar = new thp();
                Object obj = this.b;
                apply = new zvp(obj, 16).apply(new tht());
                thpVar.a = new agpw((tht) apply);
                thpVar.d();
                thy thyVar = new thy();
                apply2 = new zvp(obj, 17).apply(new tic());
                thyVar.a = new agpw((tic) apply2);
                thyVar.d();
                Iterator it = ((Set) ((aalt) this.a).ah.b()).iterator();
                while (it.hasNext()) {
                    ((tsy) it.next()).a((String) obj, false);
                }
                return true;
            case 6:
                return new aboc((aboj) this.a, (String) this.b);
            case 7:
                return new aboe((aboj) this.a, (String) this.b);
            case 8:
                return new abrc((Context) this.a, abws.b, null, abrb.a);
            case 9:
                return new abxg((Context) this.a, (acak) ((afxz) this.b).c.get());
            case 10:
                return new abxd((Context) this.a, (acak) ((afxz) this.b).c.get());
            case 11:
                algw algwVar = (algw) this.b;
                if (algwVar.f()) {
                    Object obj2 = this.a;
                    GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) algwVar.b();
                    long j = abzx.a;
                    abzz abzzVar = (abzz) obj2;
                    apct b = apds.b(abzzVar.b.f().toEpochMilli() + abzx.a);
                    if (gmsDeviceComplianceResponse.b) {
                        aovhVar = aovh.DO_NOT_ENFORCE;
                    } else {
                        aovhVar = aovh.ENFORCE;
                    }
                    aozy createBuilder = aovk.a.createBuilder();
                    aozy createBuilder2 = aovj.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    aovj aovjVar = (aovj) apagVar;
                    aovjVar.d = aovhVar.d;
                    aovjVar.b |= 2;
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    aovj aovjVar2 = (aovj) createBuilder2.b;
                    b.getClass();
                    aovjVar2.f = b;
                    aovjVar2.b |= 8;
                    aozb byteString = ((aovj) createBuilder2.s()).toByteString();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aovk aovkVar = (aovk) createBuilder.b;
                    aovkVar.b = 1 | aovkVar.b;
                    aovkVar.c = byteString;
                    return abzzVar.b((aovk) createBuilder.s());
                }
                return albo.bI(alfd.a);
            case 12:
                Context context = (Context) this.a;
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                if (!albo.ah(string) && !"0".equals(string)) {
                    return accx.a(string, context.getPackageName(), this.b);
                }
                return alfd.a;
            case 13:
                Object obj3 = this.a;
                synchronized (this.b) {
                    String c = ahlv.c();
                    String h = hht.h(c, ".trace");
                    File file = new File(((Context) obj3).getFilesDir(), a.cp(c, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "<init>", 117, "CpuProfilingService.java")).q("Could not create directory");
                        i = alfd.a;
                    } else {
                        File file2 = new File(file, h);
                        file2.deleteOnExit();
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } catch (RuntimeException e) {
                            ((alvg) ((alvg) ((alvg) ahkh.a.d()).g(e)).h("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", (char) 368, "CpuProfilingService.java")).q("Exception when clearing trace file.");
                        }
                        i = algw.i(file2);
                    }
                }
                return i;
            case 14:
                int i2 = ahqt.g;
                return ((ahmn) this.a).a(((ahqo) this.b.b()).b);
            case 15:
                return (ahtx) ((algw) this.b.get()).c(ahta.c((Context) ((ajqe) this.a).d));
            case 16:
                return ((amcn) ((ahiy) this.a).b).j(((aozb) this.b).H());
            case 17:
                abno abnoVar = (abno) this.a;
                Set set = (Set) ((ahus) this.b).a.a.get(new algx(abnoVar.j, abnoVar.i));
                if (set != null) {
                    return set;
                }
                return altg.a;
            case 18:
                Set set2 = (Set) ((ahus) this.b).a.e.get(((abno) this.a).j);
                if (set2 != null) {
                    return set2;
                }
                return altg.a;
            case 19:
                Object obj4 = this.b;
                try {
                    return Integer.valueOf(((PackageManager) ((arrt) this.a).b).getPackageInfo((String) obj4, 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("PhenotypeResourceReader", "Failed to find version of package ".concat(String.valueOf(obj4)));
                    return null;
                }
            default:
                return (aovd) aovd.g(new wci(4), apsd.q((aqrs) this.a.get(), this.b));
        }
    }

    public /* synthetic */ ylq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
