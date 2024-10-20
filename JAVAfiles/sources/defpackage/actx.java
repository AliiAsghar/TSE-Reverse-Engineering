package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class actx {
    private static Object A(acir acirVar) {
        if (acirVar.l()) {
            return acirVar.h();
        }
        if (acirVar.j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(acirVar.g());
    }

    private static void B(acir acirVar, acix acixVar) {
        acirVar.p(aciu.b, acixVar);
        acirVar.o(aciu.b, acixVar);
        acirVar.m(aciu.b, acixVar);
    }

    public static synchronized void a(Context context) {
        synchronized (actx.class) {
            if (adwy.a != null) {
                return;
            }
            adwy.a = new adwy(context);
        }
    }

    public static int b(long j) {
        int i = (int) j;
        if (i != 100) {
            if (i != 101) {
                switch (i) {
                    case 0:
                        return 2;
                    case 1:
                        return 5;
                    case 2:
                        return 6;
                    case 3:
                        return 7;
                    case 4:
                        return 8;
                    case 5:
                        return 9;
                    case 6:
                        return 10;
                    case 7:
                        return 11;
                    case 8:
                        return 12;
                    case 9:
                        return 13;
                    case 10:
                        return 14;
                    case 11:
                        return 15;
                    case 12:
                        return 16;
                    case 13:
                        return 17;
                    case 14:
                        return 18;
                    default:
                        switch (i) {
                            case 16:
                                return 19;
                            case 17:
                                return 20;
                            case 18:
                                return 21;
                            default:
                                switch (i) {
                                    case 50:
                                        return 23;
                                    case 51:
                                        return 24;
                                    case 52:
                                        return 25;
                                    case 53:
                                        return 26;
                                    case 54:
                                        return 27;
                                    case 55:
                                        return 28;
                                    case 56:
                                        return 29;
                                    case 57:
                                        return 30;
                                    case 58:
                                        return 22;
                                    case 59:
                                        return 31;
                                    case 60:
                                        return 32;
                                    case 61:
                                        return 33;
                                    case 62:
                                        return 34;
                                    case 63:
                                        return 35;
                                    case 64:
                                        return 36;
                                    default:
                                        return 1;
                                }
                        }
                }
            }
            return 4;
        }
        return 3;
    }

    public static final Optional c(SQLiteDatabase sQLiteDatabase, alhr alhrVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Object obj = alhrVar.get();
            sQLiteDatabase.setTransactionSuccessful();
            return Optional.ofNullable(obj);
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static final void d(SQLiteDatabase sQLiteDatabase, Runnable runnable) {
        sQLiteDatabase.beginTransaction();
        try {
            runnable.run();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Deprecated
    public static boolean e() {
        if (!((Boolean) aczv.s().a.a.a()).booleanValue() && !((Boolean) acpq.E().b().a()).booleanValue()) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean f() {
        if (!((Boolean) aczv.s().r().a()).booleanValue() && !((Boolean) acpq.E().x().a()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static acop g(byte[] bArr) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        newPullParser.nextTag();
        return acop.a(newPullParser);
    }

    public static acop h(Optional optional, acop acopVar, yjr yjrVar) {
        if (optional.isEmpty()) {
            advr.c("Setting initial conference information", new Object[0]);
            acopVar.e();
            return acopVar;
        }
        advr.c("Updating conference information", new Object[0]);
        acpl acplVar = acopVar.d;
        if (acplVar != null) {
            advr.c("%d users in update", Integer.valueOf(acplVar.size()));
        } else {
            advr.c("No user in update", new Object[0]);
        }
        acop acopVar2 = (acop) optional.get();
        if (TextUtils.isEmpty(acopVar.g)) {
            advr.q("Invalid conference info. Entity is empty.", new Object[0]);
        } else if (acopVar.h == acpg.NONE) {
            advr.q("Invalid conference info. State is none.", new Object[0]);
        } else if (acopVar.h == acpg.FULL && ((acopVar.d.isEmpty() && acopVar.d.a == acpg.NONE) || !acopVar.d.b() || acopVar.a.isEmpty())) {
            advr.q("A full conference document MUST at least include the conference description and users child elements.", new Object[0]);
        } else {
            int i = acopVar.i;
            acpg acpgVar = acopVar.h;
            if (acpgVar == acpg.PARTIAL) {
                int i2 = acopVar2.i;
                if (i == i2) {
                    advr.q("Version identical, skipping conference info update!", new Object[0]);
                } else if (i >= i2) {
                    if (i - i2 > 1) {
                        throw new acoo(a.cl(i, i2, "Cannot update from ", " to ", ". Missing previous update information!"));
                    }
                } else {
                    throw new acoo(a.cl(i, i2, "Cannot update from ", " to ", ". Version of conference info update must not be smaller!"));
                }
            }
            acopVar2.i = i;
            int ordinal = acpgVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2) {
                    advr.q("Unexpected conference info state %s", acopVar.h);
                } else {
                    if (acopVar.a.isPresent()) {
                        if (acopVar2.a.isPresent()) {
                            Object obj = acopVar2.a.get();
                            acom acomVar = (acom) acopVar.a.get();
                            if (!TextUtils.isEmpty(acomVar.a)) {
                                ((acom) obj).a = acomVar.a;
                            }
                            if (acomVar.b.isPresent()) {
                                acom acomVar2 = (acom) obj;
                                acomVar2.a(acomVar);
                                acomVar2.b = acomVar.b;
                                acomVar2.c = acomVar.c;
                            }
                            if (!TextUtils.isEmpty(acomVar.d)) {
                                ((acom) obj).d = acomVar.d;
                            }
                            if (!TextUtils.isEmpty(acomVar.e)) {
                                ((acom) obj).e = acomVar.e;
                            }
                            if (!acomVar.f.isEmpty() && !acomVar.f.a.equals(acpg.NONE)) {
                                ((acom) obj).f = acomVar.f;
                            }
                            if (!acomVar.g.isEmpty() && !acomVar.g.a.equals(acpg.NONE)) {
                                ((acom) obj).g = acomVar.g;
                            }
                            int i3 = acomVar.h;
                            if (i3 > 0) {
                                ((acom) obj).h = i3;
                            }
                            if (!acomVar.i.isEmpty()) {
                                ((acom) obj).i = acomVar.i;
                            }
                        } else {
                            acopVar2.a = acopVar.a;
                            acopVar2.a.get();
                        }
                    }
                    if (acopVar.b.isPresent()) {
                        acopVar2.b = acopVar.b;
                    }
                    if (acopVar.c.isPresent()) {
                        acopVar2.c = acopVar.c;
                    }
                    if (acopVar2.e.isEmpty() && acopVar2.e.a == acpg.NONE) {
                        acopVar2.e = acopVar.e;
                    }
                    if (acopVar2.f.isEmpty() && acopVar2.f.a == acpg.NONE) {
                        acopVar2.f = acopVar.f;
                    }
                    if (!acopVar.d.isEmpty()) {
                        acopVar2.f(acopVar, yjrVar);
                    }
                }
            } else {
                acopVar2.b = acopVar.b;
                acopVar2.c = acopVar.c;
                acopVar.a.ifPresent(new aauv(acopVar2, 20));
                acopVar2.a = acopVar.a;
                acopVar2.e = acopVar.e;
                acopVar2.f = acopVar.f;
                acopVar2.f(acopVar, yjrVar);
            }
        }
        return (acop) optional.get();
    }

    public static acop i(Optional optional, String str, byte[] bArr, yjr yjrVar) {
        if (j(str, bArr)) {
            return h(optional, g(bArr), yjrVar);
        }
        throw new IOException("Invalid conference information");
    }

    public static boolean j(String str, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            if ("application/conference-info+xml".equalsIgnoreCase(str)) {
                return true;
            }
            advr.q("Content-Type not matching: %s, expecting: %s", str, "application/conference-info+xml");
            return false;
        }
        advr.q("No content in notification", new Object[0]);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static int k() {
        String str = (String) aczg.a().a.c.a();
        if ("INFO".equals(str)) {
            return 1;
        }
        if ("VERBOSE".equals(str)) {
            return 2;
        }
        return 0;
    }

    public static final Map l(ContentResolver contentResolver, String[] strArr, acmi acmiVar) {
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(acme.b);
        try {
            if (acquireUnstableContentProviderClient != null) {
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(acme.b, null, null, strArr, null);
                    try {
                        if (query != null) {
                            Map a = acmiVar.a(query.getCount());
                            while (query.moveToNext()) {
                                a.put(query.getString(0), query.getString(1));
                            }
                            if (query.isAfterLast()) {
                                query.close();
                                return a;
                            }
                            throw new acmj("Cursor read incomplete (ContentProvider dead?)");
                        }
                        throw new acmj("ContentProvider query returned null cursor");
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RemoteException e) {
                    throw new acmj(e);
                }
            }
            throw new acmj("Unable to acquire ContentProviderClient");
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public static int m(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public static void n(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static Status o(int i) {
        String str;
        switch (i) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                str = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                str = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                str = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                str = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                str = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            case 4011:
            default:
                str = abgj.f(i);
                break;
            case 4012:
                str = "MIGRATION_NOT_CANCELLABLE";
                break;
            case 4013:
                str = "NO_MIGRATION_FOUND_TO_CANCEL";
                break;
            case 4014:
                str = "FEATURE_DISABLED";
                break;
            case 4015:
                str = "WIFI_CONNECTION_FAILED";
                break;
        }
        return new Status(i, str);
    }

    public static final abri p(abrg abrgVar, Uri uri, int i) {
        abhb.a(uri, "uri must not be null");
        if (i != 0) {
            i = 1;
        }
        d.t(true, "invalid filter type");
        acla aclaVar = new acla(abrgVar, uri, i);
        abrgVar.b(aclaVar);
        return aclaVar;
    }

    @Deprecated
    public static acir q(Executor executor, Callable callable) {
        d.aC(executor, "Executor must not be null");
        aciv acivVar = new aciv();
        executor.execute(new acaj(acivVar, callable, 11));
        return acivVar;
    }

    public static acir r(Exception exc) {
        aciv acivVar = new aciv();
        acivVar.t(exc);
        return acivVar;
    }

    public static acir s(Object obj) {
        aciv acivVar = new aciv();
        acivVar.u(obj);
        return acivVar;
    }

    public static acir t(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((acir) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            aciv acivVar = new aciv();
            aciy aciyVar = new aciy(collection.size(), acivVar);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                B((acir) it2.next(), aciyVar);
            }
            return acivVar;
        }
        return s(null);
    }

    public static Object u(acir acirVar) {
        abhg.f();
        abhg.e();
        if (acirVar.k()) {
            return A(acirVar);
        }
        aciw aciwVar = new aciw();
        B(acirVar, aciwVar);
        aciwVar.a.await();
        return A(acirVar);
    }

    public static Object v(acir acirVar, long j, TimeUnit timeUnit) {
        abhg.f();
        abhg.e();
        d.aC(timeUnit, "TimeUnit must not be null");
        if (acirVar.k()) {
            return A(acirVar);
        }
        aciw aciwVar = new aciw();
        B(acirVar, aciwVar);
        if (aciwVar.a.await(j, timeUnit)) {
            return A(acirVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public static ackf w(acak acakVar) {
        ackf ackfVar = new ackf();
        for (acmb acmbVar : ((acmc) acakVar.b).b) {
            ?? r3 = acakVar.a;
            String str = acmbVar.c;
            acma acmaVar = acmbVar.d;
            if (acmaVar == null) {
                acmaVar = acma.a;
            }
            z(r3, ackfVar, str, acmaVar);
        }
        return ackfVar;
    }

    public static acak x(ackf ackfVar) {
        ArrayList arrayList = new ArrayList();
        aozy createBuilder = acmc.a.createBuilder();
        TreeSet treeSet = new TreeSet(ackfVar.f());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object d = ackfVar.d(str);
            aozy createBuilder2 = acmb.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            acmb acmbVar = (acmb) createBuilder2.b;
            str.getClass();
            acmbVar.b |= 1;
            acmbVar.c = str;
            acma y = y(arrayList, d);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            acmb acmbVar2 = (acmb) createBuilder2.b;
            y.getClass();
            acmbVar2.d = y;
            acmbVar2.b |= 2;
            arrayList2.add((acmb) createBuilder2.s());
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        acmc acmcVar = (acmc) createBuilder.b;
        apax apaxVar = acmcVar.b;
        if (!apaxVar.c()) {
            acmcVar.b = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(arrayList2, acmcVar.b);
        return new acak((acmc) createBuilder.s(), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0493 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.acma y(java.util.List r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actx.y(java.util.List, java.lang.Object):acma");
    }

    private static void z(List list, ackf ackfVar, String str, acma acmaVar) {
        int i;
        int m;
        int m2;
        int m3;
        int m4 = m(acmaVar.c);
        int i2 = 1;
        if (m4 == 0) {
            m4 = 1;
        }
        if (m4 != 14) {
            aclz aclzVar = acmaVar.d;
            if (aclzVar == null) {
                aclzVar = aclz.a;
            }
            if (m4 == 1) {
                ackfVar.j(str, aclzVar.c.H());
                return;
            }
            int i3 = 0;
            if (m4 == 11) {
                ackfVar.a.put(str, (String[]) aclzVar.m.toArray(new String[0]));
                return;
            }
            if (m4 == 12) {
                Object[] array = aclzVar.n.toArray();
                int length = array.length;
                long[] jArr = new long[length];
                while (i3 < length) {
                    Object obj = array[i3];
                    obj.getClass();
                    jArr[i3] = ((Number) obj).longValue();
                    i3++;
                }
                ackfVar.a.put(str, jArr);
                return;
            }
            if (m4 == 15) {
                Object[] array2 = aclzVar.o.toArray();
                int length2 = array2.length;
                float[] fArr = new float[length2];
                while (i3 < length2) {
                    Object obj2 = array2[i3];
                    obj2.getClass();
                    fArr[i3] = ((Number) obj2).floatValue();
                    i3++;
                }
                ackfVar.a.put(str, fArr);
                return;
            }
            if (m4 == 2) {
                ackfVar.n(str, aclzVar.d);
                return;
            }
            if (m4 == 3) {
                ackfVar.a.put(str, Double.valueOf(aclzVar.e));
                return;
            }
            if (m4 == 4) {
                ackfVar.a.put(str, Float.valueOf(aclzVar.f));
                return;
            }
            if (m4 == 5) {
                ackfVar.m(str, aclzVar.g);
                return;
            }
            if (m4 == 6) {
                ackfVar.l(str, aclzVar.h);
                return;
            }
            if (m4 == 7) {
                ackfVar.i(str, (byte) aclzVar.i);
                return;
            }
            if (m4 == 8) {
                ackfVar.h(str, aclzVar.j);
                return;
            }
            if (m4 == 13) {
                ackfVar.g(str, (Asset) list.get((int) aclzVar.p));
                return;
            }
            if (m4 == 9) {
                ackf ackfVar2 = new ackf();
                for (acmb acmbVar : aclzVar.k) {
                    String str2 = acmbVar.c;
                    acma acmaVar2 = acmbVar.d;
                    if (acmaVar2 == null) {
                        acmaVar2 = acma.a;
                    }
                    z(list, ackfVar2, str2, acmaVar2);
                }
                ackfVar.a.put(str, ackfVar2);
                return;
            }
            if (m4 == 10) {
                do {
                    int i4 = 14;
                    for (acma acmaVar3 : aclzVar.l) {
                        if (i4 == 14) {
                            i = acmaVar3.c;
                            int m5 = m(i);
                            if ((m5 == 0 || m5 != 9) && (((m = m(i)) == 0 || m != 2) && ((m2 = m(i)) == 0 || m2 != 6))) {
                                m3 = m(i);
                                if (m3 == 0) {
                                    break;
                                }
                            } else {
                                i4 = m(i);
                                if (i4 == 0) {
                                    i4 = 1;
                                }
                            }
                        } else {
                            int m6 = m(acmaVar3.c);
                            if (m6 == 0) {
                                m6 = 1;
                            }
                            if (m6 != i4) {
                                String num = Integer.toString(i4);
                                int m7 = m(acmaVar3.c);
                                if (m7 != 0) {
                                    i2 = m7;
                                }
                                throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + str + " contains items of type " + num + " and " + Integer.toString(i2));
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList(aclzVar.l.size());
                    for (acma acmaVar4 : aclzVar.l) {
                        int m8 = m(acmaVar4.c);
                        if (m8 != 0 && m8 == 14) {
                            arrayList.add(null);
                        } else if (i4 == 9) {
                            ackf ackfVar3 = new ackf();
                            aclz aclzVar2 = acmaVar4.d;
                            if (aclzVar2 == null) {
                                aclzVar2 = aclz.a;
                            }
                            for (acmb acmbVar2 : aclzVar2.k) {
                                String str3 = acmbVar2.c;
                                acma acmaVar5 = acmbVar2.d;
                                if (acmaVar5 == null) {
                                    acmaVar5 = acma.a;
                                }
                                z(list, ackfVar3, str3, acmaVar5);
                            }
                            arrayList.add(ackfVar3);
                        } else if (i4 == 2) {
                            aclz aclzVar3 = acmaVar4.d;
                            if (aclzVar3 == null) {
                                aclzVar3 = aclz.a;
                            }
                            arrayList.add(aclzVar3.d);
                        } else if (i4 == 6) {
                            aclz aclzVar4 = acmaVar4.d;
                            if (aclzVar4 == null) {
                                aclzVar4 = aclz.a;
                            }
                            arrayList.add(Integer.valueOf(aclzVar4.h));
                        } else {
                            throw new IllegalArgumentException("Unexpected typeOfArrayList: ".concat(Integer.toString(i4)));
                        }
                    }
                    if (i4 == 14) {
                        ackfVar.o(str, arrayList);
                        return;
                    }
                    if (i4 == 9) {
                        ackfVar.k(str, arrayList);
                        return;
                    } else if (i4 == 2) {
                        ackfVar.o(str, arrayList);
                        return;
                    } else {
                        if (i4 == 6) {
                            ackfVar.a.put(str, arrayList);
                            return;
                        }
                        throw new IllegalStateException("Unexpected typeOfArrayList: ".concat(Integer.toString(i4)));
                    }
                } while (m3 == 14);
                int m9 = m(i);
                if (m9 != 0) {
                    i2 = m9;
                }
                throw new IllegalArgumentException(a.cg(str, Integer.toString(i2), "Unexpected TypedValue type: ", " for key "));
            }
            throw new RuntimeException("populateBundle: unexpected type ".concat(Integer.toString(m4)));
        }
        ackfVar.n(str, null);
    }
}
