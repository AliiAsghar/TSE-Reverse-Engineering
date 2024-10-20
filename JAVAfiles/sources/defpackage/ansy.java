package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansy {
    public final Object a;
    public final Object b;

    public ansy(akmj akmjVar, anen anenVar) {
        this.b = akmjVar;
        this.a = anenVar;
    }

    private final ContentProviderClient F(Uri uri) {
        String authority = uri.getAuthority();
        akll akllVar = new akll(this, uri, 1);
        Object obj = null;
        try {
            Object obj2 = akllVar.get();
            e = null;
            obj = obj2;
        } catch (SecurityException e) {
            e = e;
        }
        if (obj != null) {
            return (ContentProviderClient) obj;
        }
        ProviderInfo resolveContentProvider = ((PackageManager) this.b).resolveContentProvider(authority, 786944);
        if (resolveContentProvider == null) {
            throw new akck(authority, e);
        }
        throw new akcn(resolveContentProvider, e);
    }

    public static void c(ansy ansyVar, ansy ansyVar2) {
        Object obj = ((asqe) ansyVar.a).a;
        long[] jArr = (long[]) obj;
        ansz.b(jArr, (long[]) ((asqe) ansyVar2.b).a, (long[]) ansyVar2.a);
        Object obj2 = ((asqe) ansyVar.a).b;
        asqe asqeVar = (asqe) ansyVar2.b;
        long[] jArr2 = (long[]) obj2;
        ansz.b(jArr2, (long[]) asqeVar.b, (long[]) asqeVar.c);
        Object obj3 = ((asqe) ansyVar.a).c;
        long[] jArr3 = (long[]) obj3;
        ansz.b(jArr3, (long[]) ((asqe) ansyVar2.b).c, (long[]) ansyVar2.a);
        asqe asqeVar2 = (asqe) ansyVar2.b;
        Object obj4 = asqeVar2.a;
        long[] jArr4 = (long[]) asqeVar2.b;
        ansz.b((long[]) ansyVar.b, (long[]) obj4, jArr4);
    }

    public static akfb j(akfb akfbVar, akfb akfbVar2, akay akayVar, Executor executor) {
        return new akfj(akfbVar, akfbVar2, new akfg(akayVar), executor);
    }

    public static boolean l(akfa akfaVar, akgd akgdVar, Instant instant) {
        if (akfaVar.f() && akfaVar.g() && akfaVar.d().isAfter(instant.minus(akgdVar.k))) {
            return true;
        }
        return false;
    }

    public static final andc m(akfb akfbVar, String str) {
        akrh e = aktp.e(str);
        try {
            andc a = akfbVar.a();
            e.a(a);
            e.close();
            return a;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String q(String[] strArr, Uri uri, String str, String str2) {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(Arrays.toString(strArr));
        sb.append(" FROM ");
        sb.append(uri.getAuthority());
        if (str != null) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        if (str2 != null) {
            sb.append(" ORDER BY ");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ajzz v(ajzw ajzwVar, ajwt ajwtVar) {
        try {
            int i = ajwtVar.a;
            apbo apboVar = ajzwVar.d;
            Integer valueOf = Integer.valueOf(i);
            if (apboVar.containsKey(valueOf)) {
                return (ajzz) apboVar.get(valueOf);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new ajzn(e);
        }
    }

    public static /* synthetic */ Set w(ajzw ajzwVar) {
        alpr alprVar = new alpr();
        Iterator it = DesugarCollections.unmodifiableMap(ajzwVar.d).values().iterator();
        while (it.hasNext()) {
            alprVar.c(ajwt.a(((ajzz) it.next()).c));
        }
        return alprVar.g();
    }

    public static /* synthetic */ ajza x(ajzz ajzzVar) {
        ajwt a = ajwt.a(ajzzVar.c);
        ajzb ajzbVar = ajzzVar.d;
        if (ajzbVar == null) {
            ajzbVar = ajzb.a;
        }
        int R = a.R(ajzzVar.e);
        if (R == 0) {
            R = 1;
        }
        return new ajza(a, ajzbVar, R);
    }

    public final ListenableFuture A(ajwt ajwtVar) {
        Object obj = this.b;
        return ancj.g(((ahiy) ((akkd) obj).c).y(), akto.d(new ahsi(obj, ajwtVar, 9, null)), andi.a);
    }

    public final ListenableFuture B(ajwt ajwtVar) {
        return aktp.Y(((ahiy) ((ansy) this.a).a).y(), new ajyn(ajwtVar, 5), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture C() {
        ansy ansyVar = (ansy) this.a;
        return aktp.Y(((ahiy) ansyVar.a).y(), new ajwz(13), ansyVar.b);
    }

    public final ListenableFuture D(ajwt ajwtVar) {
        return aktp.Y(((ahiy) ((ansy) this.a).a).y(), new ajyn(ajwtVar, 4), andi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture E(String str, akec akecVar) {
        apaa apaaVar = (apaa) ajzb.a.createBuilder();
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        ajzb ajzbVar = (ajzb) apaaVar.b;
        ajzbVar.b |= 256;
        ajzbVar.i = "pseudonymous";
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        ajzb ajzbVar2 = (ajzb) apaaVar.b;
        ajzbVar2.b |= 1;
        ajzbVar2.c = "pseudonymous";
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        ajzb ajzbVar3 = (ajzb) apaaVar.b;
        ajzbVar3.b |= 2;
        ajzbVar3.d = "UNHANDLED ACCOUNT TYPE ლ(ಠ益ಠლ)";
        if (!apaaVar.b.isMutable()) {
            apaaVar.u();
        }
        ajzb ajzbVar4 = (ajzb) apaaVar.b;
        ajzbVar4.b |= 16;
        ajzbVar4.e = "¯\\_(ツ)_/¯";
        return ancj.f(albo.bI(alog.r((ajzb) apaaVar.s())), akto.a(new abdo(str, akecVar, 19, null)), this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Enum a(Object obj) {
        Enum r0 = (Enum) this.b.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(String.valueOf(obj))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Object b(Enum r3) {
        Object obj = this.a.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(String.valueOf(r3))));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [anhp, java.lang.Object] */
    public final anhn d() {
        Object obj = this.a;
        obj.getClass();
        if (!aorw.a) {
            synchronized (aorw.b) {
                if (!aorw.a) {
                    atii.e((Context) obj);
                    aorw.a = true;
                }
            }
        }
        anho anhoVar = new anho(new anhr(aosf.g(), aosg.a));
        if (this.b.b()) {
            return new anht(anhoVar);
        }
        return anhoVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public final boolean e(String str) {
        boolean booleanValue = ((Boolean) ((armf) Map.EL.getOrDefault(this.a, str, new ahjy(9))).b()).booleanValue();
        ((atsg) this.b).g();
        return booleanValue;
    }

    public final andc f() {
        akmq akmqVar = ((akmj) this.b).a;
        return andc.b(new lff(new aidu(akmqVar, 14), 4), akmqVar.e);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eoz, java.lang.Object] */
    public final akku g(ajwt ajwtVar) {
        Object valueOf;
        eoy eoyVar = new eoy((eoz) this.a, new ems(this, ajwtVar));
        if (ajwtVar == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(ajwtVar.a);
        }
        return (akku) eoyVar.c("tt_activity_account_retained:".concat(valueOf.toString()), akku.class);
    }

    public final Object h(ajwt ajwtVar) {
        Object obj;
        akku g = g(ajwtVar);
        synchronized (g.c) {
            if (g.d == null) {
                ktk kc = ((akks) aovp.m(g.e.d(g.b), akks.class)).kc();
                kc.c = g.a;
                apzj.f(kc.c, eog.class);
                g.d = new kqi((krv) kc.b, (kqp) kc.a);
            }
            obj = g.d;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final ListenableFuture i(akft akftVar) {
        algk algkVar = akftVar.c;
        if (algkVar != null) {
            this.b.add(algkVar);
            ((ahiy) this.a).q(albo.bI(null), akftVar.b);
        }
        ListenableFuture listenableFuture = akftVar.a;
        listenableFuture.c(akto.j(new adub(this, algkVar, akftVar, 12, (char[]) null)), andi.a);
        return listenableFuture;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, aegu] */
    public final ListenableFuture k(final akfb akfbVar, final akgd akgdVar) {
        akrh e = aktp.e("getDataAsFuture");
        try {
            final Instant f = this.a.f();
            andc e2 = m(akfbVar, "First load").e(akto.e(new ancv() { // from class: akfh
                @Override // defpackage.ancv
                public final andc a(ahmn ahmnVar, Object obj) {
                    akfa akfaVar = (akfa) obj;
                    akgd akgdVar2 = akgdVar;
                    Instant instant = f;
                    boolean l = ansy.l(akfaVar, akgdVar2, instant);
                    akfb akfbVar2 = akfbVar;
                    if (l) {
                        return new andc(albo.bI(akfaVar.e()));
                    }
                    akrh e3 = aktp.e("getDataAsFuture fetch");
                    try {
                        ListenableFuture b = akfbVar2.b();
                        e3.b(b);
                        ansy ansyVar = ansy.this;
                        e3.close();
                        ((ahiy) ansyVar.b).q(b, akfbVar2.c());
                        return new andc(b).e(akto.e(new xsj(akfbVar2, 12)), andi.a).d(akto.g(new mkf(akgdVar2, instant, 4)), andi.a);
                    } catch (Throwable th) {
                        try {
                            e3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }), andi.a);
            e.a(e2);
            anee l = e2.d(new lfg(11), andi.a).l();
            e.close();
            return l;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Cursor n(Uri uri, String[] strArr, akcf akcfVar, alhr alhrVar) {
        strArr.getClass();
        ContentProviderClient F = F(uri);
        try {
            Cursor a = akcfVar.a(F);
            if (a != null) {
                return new akcg(a, F);
            }
            throw new akcl("Null returned from query: " + ((String) alhrVar.get()));
        } catch (akcl e) {
            e = e;
            F.release();
            throw new akch(e);
        } catch (RemoteException e2) {
            e = e2;
            F.release();
            throw new akch(e);
        } catch (Error e3) {
            F.release();
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            F.release();
            throw new akch(e);
        }
    }

    public final Cursor o(final Uri uri, final String[] strArr, final String str, final String[] strArr2, final String str2, final CancellationSignal cancellationSignal) {
        return n(uri, strArr, new akcf() { // from class: akcc
            @Override // defpackage.akcf
            public final Cursor a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            }
        }, new rka(strArr, uri, str, str2, 12));
    }

    public final Object p(Uri uri, akcm akcmVar) {
        ContentProviderClient F = F(uri);
        try {
            try {
                return akcmVar.a(F);
            } catch (OperationApplicationException | RemoteException | FileNotFoundException | RuntimeException e) {
                throw new akch(e);
            }
        } finally {
            F.release();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, anen] */
    public final ListenableFuture r(File file) {
        return this.a.submit(akto.k(new aidu(file, 11)));
    }

    public final alog s(final alpt alptVar, final alpt alptVar2, final boolean z) {
        boolean z2 = true;
        if ((alptVar != null || alptVar2 == null) && (alptVar == null || alptVar2 != null)) {
            z2 = false;
        }
        d.s(z2);
        alob alobVar = new alob();
        aluq listIterator = ((aohs) this.a).z().listIterator();
        while (listIterator.hasNext()) {
            File[] listFiles = new File((File) listIterator.next(), "accounts").listFiles(new FilenameFilter() { // from class: akab
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    File file2 = new File(file, str);
                    try {
                        Integer valueOf = Integer.valueOf(str);
                        if (valueOf.intValue() < 0) {
                            return false;
                        }
                        alpt alptVar3 = alpt.this;
                        if (alptVar3 != null && alptVar3.contains(valueOf)) {
                            return false;
                        }
                        alpt alptVar4 = alptVar;
                        if ((alptVar4 != null && !alptVar4.contains(valueOf)) || !file2.isDirectory()) {
                            return false;
                        }
                        if (z) {
                            if (!file2.canWrite()) {
                                return false;
                            }
                        }
                        return true;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
            });
            if (listFiles != null) {
                alobVar.i(listFiles);
            }
        }
        return alobVar.g();
    }

    public final alog t(boolean z) {
        return s(null, altg.a, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture u(alog alogVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            arrayList.add(((ansy) this.b).r((File) alogVar.get(i)));
        }
        return albo.bV(arrayList).a(new aidu(arrayList, 10), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final alor y() {
        Set<ajzi> set = (Set) this.b.b();
        alok alokVar = new alok();
        for (ajzi ajziVar : set) {
            d.t(!ajziVar.a.isEmpty(), "AccountProvider's account type cannot be an empty string.");
            alokVar.h(ajziVar.a, ajziVar.b);
        }
        return alokVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture z(List list) {
        return albo.bX(list).a(akto.k(new aidu(list, 9)), this.a);
    }

    public ansy(anhk anhkVar) {
        this.b = null;
        this.a = anhkVar;
    }

    public ansy(aodz aodzVar) {
        this.b = aodzVar;
        this.a = null;
    }

    public ansy(armf armfVar, Executor executor) {
        this.a = executor;
        this.b = armfVar;
    }

    public ansy(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ansy(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public ansy(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public ansy(ahiy ahiyVar) {
        this.b = DesugarCollections.synchronizedList(new ArrayList());
        this.a = ahiyVar;
    }

    public ansy(ansy ansyVar, byte[] bArr) {
        this.b = new asqe((asqe) ansyVar.b);
        this.a = Arrays.copyOf((long[]) ansyVar.a, 10);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set, java.lang.Object] */
    public ansy(Set set) {
        this.b = set;
        this.a = new boolean[256];
        for (int i = 0; i < 256; i++) {
            ((boolean[]) this.a)[i] = this.b.contains(Integer.valueOf(i));
        }
    }

    public ansy(alvz alvzVar, Object obj) {
        alvzVar.getClass();
        this.b = alvzVar;
        this.a = obj;
    }

    public ansy() {
        this(new asqe(), new long[10]);
    }

    public ansy(java.util.Map map, akyr akyrVar, aneo aneoVar) {
        map.getClass();
        akyrVar.getClass();
        aneoVar.getClass();
        this.b = akyrVar;
        this.a = map.keySet();
    }

    public ansy(ansy ansyVar) {
        this();
        c(this, ansyVar);
    }

    public ansy(alhm alhmVar, algw algwVar, aklj akljVar) {
        this.b = alhmVar;
        if (algwVar.f()) {
            albo.T(algwVar.b() instanceof re);
        }
        this.a = akljVar;
    }

    public ansy(char[] cArr) {
        this.b = new ConcurrentLinkedQueue();
        this.a = new AtomicLong();
    }
}
