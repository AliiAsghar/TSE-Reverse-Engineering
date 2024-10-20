package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qno {
    public qno(byte[] bArr) {
    }

    public static final akcx a() {
        akct a = akcx.a(qnp.class);
        gry gryVar = gry.EXPONENTIAL;
        Object e = qlb.g.e();
        e.getClass();
        a.f(gryVar, new akcv(((Number) e).longValue(), TimeUnit.MILLISECONDS));
        a.e(new akcw("CONTACTS_CHANGE_OBSERVER", 4));
        gsd gsdVar = new gsd();
        Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        uri.getClass();
        gsdVar.b(uri, false);
        a.b(gsdVar.a());
        return a.a();
    }

    public static /* synthetic */ unf b() {
        une a = unf.a();
        Object e = qlb.f.e();
        e.getClass();
        a.d(((Number) e).intValue());
        a.g(gry.EXPONENTIAL);
        Object e2 = qlb.g.e();
        e2.getClass();
        a.h(((Number) e2).longValue());
        return a.a();
    }

    public static /* synthetic */ Object c(Object obj) {
        qlo qloVar = (qlo) obj;
        aozy builder = qloVar.toBuilder();
        qln qlnVar = qloVar.d;
        if (qlnVar == null) {
            qlnVar = qln.a;
        }
        aozy builder2 = qlnVar.toBuilder();
        if (!builder2.b.isMutable()) {
            builder2.u();
        }
        ((qln) builder2.b).c = a.ak(5);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        qlo qloVar2 = (qlo) builder.b;
        qln qlnVar2 = (qln) builder2.s();
        qlnVar2.getClass();
        qloVar2.d = qlnVar2;
        qloVar2.b |= 1;
        return (qlo) builder.s();
    }

    public static /* synthetic */ Object d(Object obj) {
        qlo qloVar = (qlo) obj;
        aozy builder = qloVar.toBuilder();
        qln qlnVar = qloVar.d;
        if (qlnVar == null) {
            qlnVar = qln.a;
        }
        aozy builder2 = qlnVar.toBuilder();
        if (!builder2.b.isMutable()) {
            builder2.u();
        }
        ((qln) builder2.b).c = a.ak(4);
        if (!builder.b.isMutable()) {
            builder.u();
        }
        qlo qloVar2 = (qlo) builder.b;
        qln qlnVar2 = (qln) builder2.s();
        qlnVar2.getClass();
        qloVar2.d = qlnVar2;
        qloVar2.b |= 1;
        return (qlo) builder.s();
    }

    public static Uri e(int i) {
        if (i - 1 != 0) {
            Uri uri = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
            uri.getClass();
            return uri;
        }
        Uri uri2 = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        uri2.getClass();
        return uri2;
    }

    public static String[] f(int i, boolean z) {
        if (i - 1 != 0) {
            return qmj.e;
        }
        if (z) {
            return qmj.c;
        }
        return qmj.d;
    }

    public static final qoo g(qlr qlrVar) {
        qlrVar.getClass();
        aozy createBuilder = qoo.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((qoo) apagVar).c = qlrVar.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        long j = qlrVar.b;
        apag apagVar2 = createBuilder.b;
        ((qoo) apagVar2).d = j;
        String str = qlrVar.c;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ((qoo) apagVar3).e = str;
        String str2 = qlrVar.d;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        ((qoo) apagVar4).f = str2;
        String str3 = qlrVar.e;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        ((qoo) apagVar5).g = str3;
        String str4 = qlrVar.f;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        apag apagVar6 = createBuilder.b;
        ((qoo) apagVar6).h = str4;
        long j2 = qlrVar.g;
        if (!apagVar6.isMutable()) {
            createBuilder.u();
        }
        apag apagVar7 = createBuilder.b;
        ((qoo) apagVar7).i = j2;
        int i = qlrVar.m;
        if (!apagVar7.isMutable()) {
            createBuilder.u();
        }
        ((qoo) createBuilder.b).n = i;
        apct b = apds.b(qlrVar.t.toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qoo qooVar = (qoo) createBuilder.b;
        b.getClass();
        qooVar.s = b;
        qooVar.b |= 256;
        Collection<qml> collection = qlrVar.u;
        ArrayList arrayList = new ArrayList(aqjn.J(collection, 10));
        for (qml qmlVar : collection) {
            aozy createBuilder2 = qon.a.createBuilder();
            createBuilder2.getClass();
            long j3 = qmlVar.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar8 = createBuilder2.b;
            qon qonVar = (qon) apagVar8;
            qonVar.b |= 1;
            qonVar.c = j3;
            String str5 = qmlVar.b;
            if (!apagVar8.isMutable()) {
                createBuilder2.u();
            }
            qon qonVar2 = (qon) createBuilder2.b;
            qonVar2.b |= 2;
            qonVar2.d = str5;
            apag s = createBuilder2.s();
            s.getClass();
            arrayList.add((qon) s);
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qoo qooVar2 = (qoo) createBuilder.b;
        apax apaxVar = qooVar2.t;
        if (!apaxVar.c()) {
            qooVar2.t = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(arrayList, qooVar2.t);
        String str6 = qlrVar.j;
        if (str6 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar3 = (qoo) createBuilder.b;
            qooVar3.b |= 4;
            qooVar3.l = str6;
        }
        String str7 = qlrVar.l;
        if (str7 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar4 = (qoo) createBuilder.b;
            qooVar4.b |= 512;
            qooVar4.u = str7;
        }
        String str8 = qlrVar.h;
        if (str8 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar5 = (qoo) createBuilder.b;
            qooVar5.b |= 1;
            qooVar5.j = str8;
        }
        String str9 = qlrVar.i;
        if (str9 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar6 = (qoo) createBuilder.b;
            qooVar6.b |= 2;
            qooVar6.k = str9;
        }
        String str10 = qlrVar.k;
        if (str10 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar7 = (qoo) createBuilder.b;
            qooVar7.b |= 8;
            qooVar7.m = str10;
        }
        String str11 = qlrVar.r;
        if (str11 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar8 = (qoo) createBuilder.b;
            qooVar8.b |= 64;
            qooVar8.q = str11;
        }
        String str12 = qlrVar.s;
        if (str12 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar9 = (qoo) createBuilder.b;
            qooVar9.b |= 128;
            qooVar9.r = str12;
        }
        Uri uri = qlrVar.o;
        if (uri != null) {
            String uri2 = uri.toString();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar10 = (qoo) createBuilder.b;
            uri2.getClass();
            qooVar10.b |= 16;
            qooVar10.o = uri2;
        }
        Uri uri3 = qlrVar.p;
        if (uri3 != null) {
            String uri4 = uri3.toString();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar11 = (qoo) createBuilder.b;
            uri4.getClass();
            qooVar11.b |= 32;
            qooVar11.p = uri4;
        }
        Integer num = qlrVar.q;
        if (num != null) {
            int intValue = num.intValue();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qoo qooVar12 = (qoo) createBuilder.b;
            qooVar12.b |= 1024;
            qooVar12.v = intValue;
        }
        apag s2 = createBuilder.s();
        s2.getClass();
        return (qoo) s2;
    }

    public static final Instant h(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Instant instant = ((qlr) it.next()).t;
                while (it.hasNext()) {
                    Instant instant2 = ((qlr) it.next()).t;
                    if (instant.compareTo(instant2) > 0) {
                        instant = instant2;
                    }
                }
                return instant;
            }
            throw new NoSuchElementException();
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final boolean i(qlr qlrVar) {
        qlrVar.getClass();
        if (qlrVar.j != null) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ qgn j(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (qgn) s;
    }

    public static boolean k() {
        return anfi.a("bugle.store_message_persistence_id_in_telephony_sms", "bugle");
    }

    public qno() {
        new AtomicBoolean(false);
    }
}
