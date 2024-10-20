package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class koc extends knj {
    private final armf g;
    private final wyt h;
    private final armf i;
    private final wzy j;

    public koc(kni kniVar, armf armfVar, wyt wytVar, armf armfVar2, wzy wzyVar) {
        super(kniVar, "ThreadId and SessionId Sanity Check");
        this.g = armfVar;
        this.h = wytVar;
        this.i = armfVar2;
        this.j = wzyVar;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [wzy, java.lang.Object] */
    @Override // defpackage.knj
    public final knk a() {
        Optional of;
        Optional of2;
        Optional of3;
        long d;
        this.f.j("Checking Thread Ids");
        ArrayList arrayList = new ArrayList();
        kod kodVar = new kod(this.f, this.h, this.g, this.i);
        boolean z = false;
        byte b = 0;
        int i = 1;
        if (!((Boolean) qpf.a.e()).booleanValue()) {
            kodVar.d = true;
            snf e = sni.e();
            e.w("ThreadIdVerifierTask#verify");
            e.e(new koa(2));
            sna snaVar = (sna) e.b().n();
            while (snaVar.moveToNext()) {
                try {
                    kodVar.a.i();
                    if (snaVar.c() == 2) {
                        long s = snaVar.s();
                        if (s == -1) {
                            knl h = kodVar.e.h();
                            h.z("GroupRCS conversation", snaVar.W());
                            h.y("has sessionId invalid", -1L);
                            h.q();
                        } else {
                            d = ((vqm) kodVar.c.b()).a(s);
                        }
                    } else {
                        d = kodVar.a.d(new HashSet(((rtz) kodVar.b.b()).K(snaVar.C())));
                    }
                    xhv L = snaVar.L();
                    if (!xhv.b(d).equals(L)) {
                        kodVar.d = false;
                        knl h2 = kodVar.e.h();
                        h2.y("Mismatch conversations table threadId, telephony", d);
                        h2.z("vs conversations table", L);
                        h2.z("conversation name", snaVar.W());
                        h2.x("conversation type", snaVar.c());
                        h2.q();
                    }
                } finally {
                }
            }
            snaVar.close();
            if (kodVar.d) {
                kodVar.e.j("All threads match between Messages and Telephony");
            }
        }
        if (kodVar.d) {
            of = Optional.empty();
        } else {
            of = Optional.of("There are conversation threadId mismatches");
        }
        of.ifPresent(new ixj(arrayList, 18));
        kob kobVar = new kob(this.f, 1);
        kobVar.a = true;
        snf e2 = sni.e();
        e2.w("SessionIdVerifierTask#verify");
        e2.e(new koa(i));
        e2.h(new koa(b == true ? 1 : 0));
        sna snaVar2 = (sna) e2.b().n();
        while (snaVar2.moveToNext()) {
            try {
                long s2 = snaVar2.s();
                Object obj = kobVar.b;
                Long valueOf = Long.valueOf(s2);
                List list = (List) ((HashMap) obj).get(valueOf);
                String W = snaVar2.W();
                if (W != null) {
                    if (list != null) {
                        list.add(new kor(snaVar2.C(), W));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new kor(snaVar2.C(), W));
                        ((HashMap) kobVar.b).put(valueOf, arrayList2);
                    }
                }
            } finally {
            }
        }
        for (Long l : ((HashMap) kobVar.b).keySet()) {
            List<kor> list2 = (List) ((HashMap) kobVar.b).get(l);
            if (list2.size() > 1) {
                kobVar.a = false;
                knl h3 = kobVar.c.h();
                h3.z("Duplicate session id", l);
                h3.u(" for conversations:");
                h3.q();
                for (kor korVar : list2) {
                    knl h4 = kobVar.c.h();
                    h4.z("conversation id", korVar.b);
                    h4.z("name", korVar.a);
                    h4.q();
                }
            }
        }
        snaVar2.close();
        if (kobVar.a) {
            kobVar.c.j("All session ids are unique across all conversations");
        }
        if (kobVar.a) {
            of2 = Optional.empty();
        } else {
            of2 = Optional.of("There are session id duplicates");
        }
        of2.ifPresent(new ixj(arrayList, 18));
        kob kobVar2 = new kob(this.f, this.j, 0);
        int al = kobVar2.b.al();
        sxy d2 = MessagesTable.d();
        d2.w("telephonyDbVerifierTaskVerify");
        int i2 = d2.b().i();
        if (al == i2) {
            z = true;
        }
        kobVar2.a = z;
        if (z) {
            kobVar2.c.j("The message counts are the same between Messages and Telephony");
        } else {
            knl h5 = kobVar2.c.h();
            h5.x("telephonyMessageCount", al);
            h5.x("bugleMessageCount", i2);
            h5.q();
        }
        if (kobVar2.a) {
            of3 = Optional.empty();
        } else {
            of3 = Optional.of("The message counts are different between Messages and Telephony");
        }
        of3.ifPresent(new ixj(arrayList, 18));
        if (!arrayList.isEmpty()) {
            return new knk(4, arrayList);
        }
        return knk.a;
    }
}
