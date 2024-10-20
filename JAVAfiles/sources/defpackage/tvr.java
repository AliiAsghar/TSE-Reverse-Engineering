package defpackage;

import android.text.TextUtils;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Iterator$EL;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvr {
    public static final xze a = xze.g("BugleEtouffee", "RemoteDeviceLoader");
    public final xnv b;
    public final armf c;
    public final armf d;
    public final vcb e;
    private final agnq f;
    private final tyx g;
    private final armf h;
    private final anen i;
    private final mbl j;
    private final armf k;
    private final armf l;
    private final armf m;

    public tvr(xnv xnvVar, agnq agnqVar, tyx tyxVar, armf armfVar, anen anenVar, armf armfVar2, armf armfVar3, vcb vcbVar, mbl mblVar, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.f = agnqVar;
        this.g = tyxVar;
        this.h = armfVar;
        this.i = anenVar;
        this.b = xnvVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = vcbVar;
        this.j = mblVar;
        this.k = armfVar4;
        this.l = armfVar5;
        this.m = armfVar6;
    }

    private static Iterable h(Iterable iterable, Iterable iterable2) {
        if (iterable != null) {
            alob alobVar = new alob();
            Iterator$EL.forEachRemaining(iterable.iterator(), new ter(alobVar, 13));
            return alobVar.g();
        }
        return iterable2;
    }

    public final akul a(qei qeiVar, Collection collection, amkd amkdVar) {
        Stream map = Collection.EL.stream(collection).map(new tvq(0));
        int i = alog.d;
        return c(qeiVar, collection, (alog) map.collect(alls.a), amkdVar);
    }

    @Deprecated
    public final akul b(Iterable iterable, Iterable iterable2, amkd amkdVar) {
        return c(null, iterable, iterable2, amkdVar);
    }

    public final akul c(qei qeiVar, Iterable iterable, final Iterable iterable2, final amkd amkdVar) {
        akul ag;
        if (((ojy) this.m.b()).a()) {
            qeiVar.getClass();
        }
        aiut.b();
        xyo a2 = a.a();
        a2.H("Start to get Registration ID from Tachyon");
        a2.z("normalizedDestination", yyb.bh(TextUtils.join(", ", iterable2)));
        a2.q();
        final Instant f = this.b.f();
        akrh e = aktp.e("RemoteDeviceLoader#downloadRegistrationIdsFromTachyon");
        byte[] bArr = null;
        int i = 2;
        if (qeiVar != null) {
            try {
                if (((okg) this.k.b()).a()) {
                    qdq qdqVar = (qdq) this.h.b();
                    apwt a3 = apxv.a(((kru) qdqVar.a).a.lY);
                    krv krvVar = ((kru) qdqVar.a).a;
                    tyv tyvVar = new tyv(qeiVar, a3, krvVar.wH, (arwe) krvVar.bQ.b());
                    Iterable h = h(iterable, iterable2);
                    h.getClass();
                    String str = tyvVar.a.d;
                    if (str != null && !arsd.M(str)) {
                        qdq qdqVar2 = (qdq) tyvVar.b.b();
                        String str2 = tyvVar.a.d;
                        str2.getClass();
                        ag = qjh.c(tyvVar.c, arpj.a, arwf.a, new tyi(tyvVar, qdqVar2.q(str2, aqjn.ak(h)), (arpe) null, 2));
                    } else {
                        ag = aktp.ag(new tyy(2, "", altc.a, 0));
                        ag.getClass();
                    }
                    akul f2 = ag.h(new algk() { // from class: tvo
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.algk
                        public final Object apply(Object obj) {
                            final boolean z;
                            boolean z2;
                            tyy tyyVar = (tyy) obj;
                            int i2 = tyyVar.d;
                            amkd amkdVar2 = amkdVar;
                            tvr tvrVar = tvr.this;
                            if (i2 == 2) {
                                ((iji) tvrVar.d.b()).o(amkdVar2, -2, null);
                                return new gsu();
                            }
                            if (i2 == 3) {
                                ((iji) tvrVar.d.b()).o(amkdVar2, tyyVar.c, tyyVar.a);
                                return new gsu();
                            }
                            Iterable<String> iterable3 = iterable2;
                            alor alorVar = tyyVar.b;
                            String str3 = tyyVar.a;
                            for (final String str4 : iterable3) {
                                int i3 = alog.d;
                                final alog<aqga> alogVar = (alog) alorVar.getOrDefault(str4, alsx.a);
                                aozy createBuilder = amkf.a.createBuilder();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                apag apagVar = createBuilder.b;
                                amkf amkfVar = (amkf) apagVar;
                                amkfVar.c = amkdVar2.m;
                                amkfVar.b |= 1;
                                if (!apagVar.isMutable()) {
                                    createBuilder.u();
                                }
                                amkf amkfVar2 = (amkf) createBuilder.b;
                                amkfVar2.b |= 8;
                                amkfVar2.h = str3;
                                for (aqga aqgaVar : alogVar) {
                                    aozy createBuilder2 = amke.a.createBuilder();
                                    String C = aqgaVar.c.C(StandardCharsets.US_ASCII);
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    amke amkeVar = (amke) createBuilder2.b;
                                    amkeVar.b |= 1;
                                    amkeVar.c = C;
                                    if (aqgaVar.d.size() > 0 && aqgaVar.d.contains(Integer.valueOf(vbe.ETOUFFEE.g))) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    amke amkeVar2 = (amke) createBuilder2.b;
                                    amkeVar2.b |= 2;
                                    amkeVar2.d = z2;
                                    amke amkeVar3 = (amke) createBuilder2.s();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    amkf amkfVar3 = (amkf) createBuilder.b;
                                    amkeVar3.getClass();
                                    apax apaxVar = amkfVar3.e;
                                    if (!apaxVar.c()) {
                                        amkfVar3.e = apag.mutableCopy(apaxVar);
                                    }
                                    amkfVar3.e.add(amkeVar3);
                                }
                                final alog c = tvrVar.e.c(str4);
                                alur it = c.iterator();
                                while (it.hasNext()) {
                                    sec secVar = (sec) it.next();
                                    aozy createBuilder3 = amke.a.createBuilder();
                                    boolean j = secVar.j();
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    amke amkeVar4 = (amke) createBuilder3.b;
                                    amkeVar4.b |= 2;
                                    amkeVar4.d = j;
                                    String i4 = secVar.i();
                                    if (i4 != null) {
                                        if (!createBuilder3.b.isMutable()) {
                                            createBuilder3.u();
                                        }
                                        amke amkeVar5 = (amke) createBuilder3.b;
                                        amkeVar5.b |= 1;
                                        amkeVar5.c = i4;
                                    }
                                    amke amkeVar6 = (amke) createBuilder3.s();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    amkf amkfVar4 = (amkf) createBuilder.b;
                                    amkeVar6.getClass();
                                    apax apaxVar2 = amkfVar4.d;
                                    if (!apaxVar2.c()) {
                                        amkfVar4.d = apag.mutableCopy(apaxVar2);
                                    }
                                    amkfVar4.d.add(amkeVar6);
                                }
                                final Instant instant = f;
                                final vcb vcbVar = tvrVar.e;
                                if (amkdVar2 == amkd.RECEIVED_PLAINTEXT_DELIVERY_RECEIPT) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean booleanValue = ((Boolean) vcbVar.b.c("RemoteInstanceDatabaseOperations#saveToRemoteInstances", new alhr() { // from class: vca
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.alhr
                                    public final Object get() {
                                        boolean z3;
                                        ArrayList arrayList = new ArrayList();
                                        alur it2 = ((alog) c).iterator();
                                        while (it2.hasNext()) {
                                            sec secVar2 = (sec) it2.next();
                                            xyo a4 = vcb.a.a();
                                            a4.H("Existing RemoteInstance from database");
                                            a4.A("hasEncryption", secVar2.j());
                                            a4.A("hasGroupEncryption", secVar2.k());
                                            a4.y("updatedAtHash", secVar2.f());
                                            a4.A("isUpdatedAtHashValid", secVar2.l());
                                            a4.q();
                                            if (secVar2.l()) {
                                                arrayList.add(Long.valueOf(secVar2.f()));
                                            }
                                        }
                                        Instant instant2 = instant;
                                        List<aqga> list = alogVar;
                                        String str5 = str4;
                                        vcb vcbVar2 = vcb.this;
                                        if (!arrayList.isEmpty()) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (aqga aqgaVar2 : list) {
                                                xyo a5 = vcb.a.a();
                                                a5.H("RegistrationInfo from backend");
                                                a5.A("hasEncryption", vcb.l(aqgaVar2));
                                                a5.A("hasGroupEncryption", vcb.m(aqgaVar2));
                                                a5.y("updatedAtHash", aqgaVar2.g);
                                                a5.q();
                                                arrayList2.add(Long.valueOf(aqgaVar2.g));
                                            }
                                            Collections.sort(arrayList);
                                            Collections.sort(arrayList2);
                                            if (arrayList.equals(arrayList2)) {
                                                vcb.a.o("UpdatedAtHash has not changed. Only update RPC timestamps in RemoteInstances.");
                                                Instant f3 = vcbVar2.c.f();
                                                thi thiVar = new thi();
                                                thiVar.aj("setRpcTimestamps-remoteregistrations");
                                                thiVar.c(instant2);
                                                thiVar.f(f3);
                                                thiVar.g(vcb.a(str5));
                                                thiVar.a().e();
                                                tmc c2 = thu.c();
                                                c2.h(str5);
                                                c2.f(instant2);
                                                c2.g(f3);
                                                c2.e().l();
                                                z3 = false;
                                                return Boolean.valueOf(z3);
                                            }
                                        }
                                        vcb.a.l("Updating RemoteInstance table");
                                        tmc c3 = thu.c();
                                        c3.h(str5);
                                        c3.g(vcbVar2.c.f());
                                        c3.f(instant2);
                                        c3.e().l();
                                        thy thyVar = new thy();
                                        thyVar.f("saveToRemoteInstancesTableInTransaction");
                                        tic ticVar = new tic();
                                        ticVar.b(str5);
                                        thyVar.a = new agpw(ticVar);
                                        thyVar.d();
                                        z3 = true;
                                        if (list != null && !list.isEmpty()) {
                                            Optional.empty();
                                            for (aqga aqgaVar3 : list) {
                                                boolean z4 = z;
                                                xyo c4 = vcb.a.c();
                                                c4.H("Received RegistrationInfo from backend");
                                                c4.A("hasEncryption", vcb.l(aqgaVar3));
                                                c4.A("forceDisabled", z4);
                                                c4.q();
                                                Optional empty = Optional.empty();
                                                if ((aqgaVar3.b & 1) != 0) {
                                                    aqfu aqfuVar = aqgaVar3.f;
                                                    if (aqfuVar == null) {
                                                        aqfuVar = aqfu.a;
                                                    }
                                                    empty = Optional.of(aqfuVar.c);
                                                }
                                                Optional optional = empty;
                                                String C2 = aqgaVar3.c.C(StandardCharsets.US_ASCII);
                                                vtk vtkVar = new vtk();
                                                if (!z4) {
                                                    if (vcb.l(aqgaVar3)) {
                                                        vtkVar.e(vbe.ETOUFFEE);
                                                    }
                                                    if (vcb.m(aqgaVar3)) {
                                                        vtkVar.e(vbe.ETOUFFEE_GROUPS);
                                                    }
                                                }
                                                if (aqgaVar3.d.size() > 0 && aqgaVar3.d.contains(Integer.valueOf(vbe.MMS_GROUP_UPGRADE_METRICS_COLLECTION.g))) {
                                                    vtkVar.e(vbe.MMS_GROUP_UPGRADE_METRICS_COLLECTION);
                                                }
                                                if (aqgaVar3.d.size() > 0 && aqgaVar3.d.contains(Integer.valueOf(vbe.MULTI_DEVICE.g))) {
                                                    vtkVar.e(vbe.MULTI_DEVICE);
                                                }
                                                vcbVar2.f(str5, C2, vtkVar.d(), optional, Long.valueOf(aqgaVar3.g), instant2);
                                            }
                                        } else {
                                            vcb.a.l("RPC returned no RegistrationInfo");
                                        }
                                        return Boolean.valueOf(z3);
                                    }
                                })).booleanValue();
                                maq maqVar = (maq) tvrVar.c.b();
                                amfq amfqVar = (amfq) amfr.a.createBuilder();
                                amfp amfpVar = amfp.BUGLE_E2EE_LOOKUP_REGISTERED;
                                if (!amfqVar.b.isMutable()) {
                                    amfqVar.u();
                                }
                                amfr amfrVar = (amfr) amfqVar.b;
                                amfrVar.i = amfpVar.dg;
                                amfrVar.b |= 1;
                                boolean z3 = !booleanValue;
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                amkf amkfVar5 = (amkf) createBuilder.b;
                                amkfVar5.b |= 2;
                                amkfVar5.f = z3;
                                if (!amfqVar.b.isMutable()) {
                                    amfqVar.u();
                                }
                                amfr amfrVar2 = (amfr) amfqVar.b;
                                amkf amkfVar6 = (amkf) createBuilder.s();
                                amkfVar6.getClass();
                                amfrVar2.Q = amkfVar6;
                                amfrVar2.c |= 1048576;
                                maqVar.j(amfqVar);
                            }
                            return new gsw();
                        }
                    }, this.i).f(Throwable.class, new tsm(this, amkdVar, 19, bArr), this.i);
                    e.b(f2);
                    e.close();
                    return f2;
                }
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        tyx tyxVar = this.g;
        Iterable h2 = h(iterable, iterable2);
        HashSet hashSet = new HashSet();
        Iterator it = h2.iterator();
        while (it.hasNext()) {
            hashSet.add((String) it.next());
        }
        ag = ((tyw) tyxVar).b.c().i(new twe(tyxVar, hashSet, i), ((tyw) tyxVar).e);
        akul f22 = ag.h(new algk() { // from class: tvo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                final boolean z;
                boolean z2;
                tyy tyyVar = (tyy) obj;
                int i2 = tyyVar.d;
                amkd amkdVar2 = amkdVar;
                tvr tvrVar = tvr.this;
                if (i2 == 2) {
                    ((iji) tvrVar.d.b()).o(amkdVar2, -2, null);
                    return new gsu();
                }
                if (i2 == 3) {
                    ((iji) tvrVar.d.b()).o(amkdVar2, tyyVar.c, tyyVar.a);
                    return new gsu();
                }
                Iterable<String> iterable3 = iterable2;
                alor alorVar = tyyVar.b;
                String str3 = tyyVar.a;
                for (final String str4 : iterable3) {
                    int i3 = alog.d;
                    final List alogVar = (alog) alorVar.getOrDefault(str4, alsx.a);
                    aozy createBuilder = amkf.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    amkf amkfVar = (amkf) apagVar;
                    amkfVar.c = amkdVar2.m;
                    amkfVar.b |= 1;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    amkf amkfVar2 = (amkf) createBuilder.b;
                    amkfVar2.b |= 8;
                    amkfVar2.h = str3;
                    for (aqga aqgaVar : alogVar) {
                        aozy createBuilder2 = amke.a.createBuilder();
                        String C = aqgaVar.c.C(StandardCharsets.US_ASCII);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amke amkeVar = (amke) createBuilder2.b;
                        amkeVar.b |= 1;
                        amkeVar.c = C;
                        if (aqgaVar.d.size() > 0 && aqgaVar.d.contains(Integer.valueOf(vbe.ETOUFFEE.g))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amke amkeVar2 = (amke) createBuilder2.b;
                        amkeVar2.b |= 2;
                        amkeVar2.d = z2;
                        amke amkeVar3 = (amke) createBuilder2.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amkf amkfVar3 = (amkf) createBuilder.b;
                        amkeVar3.getClass();
                        apax apaxVar = amkfVar3.e;
                        if (!apaxVar.c()) {
                            amkfVar3.e = apag.mutableCopy(apaxVar);
                        }
                        amkfVar3.e.add(amkeVar3);
                    }
                    final List c = tvrVar.e.c(str4);
                    alur it2 = c.iterator();
                    while (it2.hasNext()) {
                        sec secVar = (sec) it2.next();
                        aozy createBuilder3 = amke.a.createBuilder();
                        boolean j = secVar.j();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        amke amkeVar4 = (amke) createBuilder3.b;
                        amkeVar4.b |= 2;
                        amkeVar4.d = j;
                        String i4 = secVar.i();
                        if (i4 != null) {
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            amke amkeVar5 = (amke) createBuilder3.b;
                            amkeVar5.b |= 1;
                            amkeVar5.c = i4;
                        }
                        amke amkeVar6 = (amke) createBuilder3.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amkf amkfVar4 = (amkf) createBuilder.b;
                        amkeVar6.getClass();
                        apax apaxVar2 = amkfVar4.d;
                        if (!apaxVar2.c()) {
                            amkfVar4.d = apag.mutableCopy(apaxVar2);
                        }
                        amkfVar4.d.add(amkeVar6);
                    }
                    final Instant instant = f;
                    final vcb vcbVar = tvrVar.e;
                    if (amkdVar2 == amkd.RECEIVED_PLAINTEXT_DELIVERY_RECEIPT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean booleanValue = ((Boolean) vcbVar.b.c("RemoteInstanceDatabaseOperations#saveToRemoteInstances", new alhr() { // from class: vca
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.alhr
                        public final Object get() {
                            boolean z3;
                            ArrayList arrayList = new ArrayList();
                            alur it22 = ((alog) c).iterator();
                            while (it22.hasNext()) {
                                sec secVar2 = (sec) it22.next();
                                xyo a4 = vcb.a.a();
                                a4.H("Existing RemoteInstance from database");
                                a4.A("hasEncryption", secVar2.j());
                                a4.A("hasGroupEncryption", secVar2.k());
                                a4.y("updatedAtHash", secVar2.f());
                                a4.A("isUpdatedAtHashValid", secVar2.l());
                                a4.q();
                                if (secVar2.l()) {
                                    arrayList.add(Long.valueOf(secVar2.f()));
                                }
                            }
                            Instant instant2 = instant;
                            List<aqga> list = alogVar;
                            String str5 = str4;
                            vcb vcbVar2 = vcb.this;
                            if (!arrayList.isEmpty()) {
                                ArrayList arrayList2 = new ArrayList();
                                for (aqga aqgaVar2 : list) {
                                    xyo a5 = vcb.a.a();
                                    a5.H("RegistrationInfo from backend");
                                    a5.A("hasEncryption", vcb.l(aqgaVar2));
                                    a5.A("hasGroupEncryption", vcb.m(aqgaVar2));
                                    a5.y("updatedAtHash", aqgaVar2.g);
                                    a5.q();
                                    arrayList2.add(Long.valueOf(aqgaVar2.g));
                                }
                                Collections.sort(arrayList);
                                Collections.sort(arrayList2);
                                if (arrayList.equals(arrayList2)) {
                                    vcb.a.o("UpdatedAtHash has not changed. Only update RPC timestamps in RemoteInstances.");
                                    Instant f3 = vcbVar2.c.f();
                                    thi thiVar = new thi();
                                    thiVar.aj("setRpcTimestamps-remoteregistrations");
                                    thiVar.c(instant2);
                                    thiVar.f(f3);
                                    thiVar.g(vcb.a(str5));
                                    thiVar.a().e();
                                    tmc c2 = thu.c();
                                    c2.h(str5);
                                    c2.f(instant2);
                                    c2.g(f3);
                                    c2.e().l();
                                    z3 = false;
                                    return Boolean.valueOf(z3);
                                }
                            }
                            vcb.a.l("Updating RemoteInstance table");
                            tmc c3 = thu.c();
                            c3.h(str5);
                            c3.g(vcbVar2.c.f());
                            c3.f(instant2);
                            c3.e().l();
                            thy thyVar = new thy();
                            thyVar.f("saveToRemoteInstancesTableInTransaction");
                            tic ticVar = new tic();
                            ticVar.b(str5);
                            thyVar.a = new agpw(ticVar);
                            thyVar.d();
                            z3 = true;
                            if (list != null && !list.isEmpty()) {
                                Optional.empty();
                                for (aqga aqgaVar3 : list) {
                                    boolean z4 = z;
                                    xyo c4 = vcb.a.c();
                                    c4.H("Received RegistrationInfo from backend");
                                    c4.A("hasEncryption", vcb.l(aqgaVar3));
                                    c4.A("forceDisabled", z4);
                                    c4.q();
                                    Optional empty = Optional.empty();
                                    if ((aqgaVar3.b & 1) != 0) {
                                        aqfu aqfuVar = aqgaVar3.f;
                                        if (aqfuVar == null) {
                                            aqfuVar = aqfu.a;
                                        }
                                        empty = Optional.of(aqfuVar.c);
                                    }
                                    Optional optional = empty;
                                    String C2 = aqgaVar3.c.C(StandardCharsets.US_ASCII);
                                    vtk vtkVar = new vtk();
                                    if (!z4) {
                                        if (vcb.l(aqgaVar3)) {
                                            vtkVar.e(vbe.ETOUFFEE);
                                        }
                                        if (vcb.m(aqgaVar3)) {
                                            vtkVar.e(vbe.ETOUFFEE_GROUPS);
                                        }
                                    }
                                    if (aqgaVar3.d.size() > 0 && aqgaVar3.d.contains(Integer.valueOf(vbe.MMS_GROUP_UPGRADE_METRICS_COLLECTION.g))) {
                                        vtkVar.e(vbe.MMS_GROUP_UPGRADE_METRICS_COLLECTION);
                                    }
                                    if (aqgaVar3.d.size() > 0 && aqgaVar3.d.contains(Integer.valueOf(vbe.MULTI_DEVICE.g))) {
                                        vtkVar.e(vbe.MULTI_DEVICE);
                                    }
                                    vcbVar2.f(str5, C2, vtkVar.d(), optional, Long.valueOf(aqgaVar3.g), instant2);
                                }
                            } else {
                                vcb.a.l("RPC returned no RegistrationInfo");
                            }
                            return Boolean.valueOf(z3);
                        }
                    })).booleanValue();
                    maq maqVar = (maq) tvrVar.c.b();
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.BUGLE_E2EE_LOOKUP_REGISTERED;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    boolean z3 = !booleanValue;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amkf amkfVar5 = (amkf) createBuilder.b;
                    amkfVar5.b |= 2;
                    amkfVar5.f = z3;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amkf amkfVar6 = (amkf) createBuilder.s();
                    amkfVar6.getClass();
                    amfrVar2.Q = amkfVar6;
                    amfrVar2.c |= 1048576;
                    maqVar.j(amfqVar);
                }
                return new gsw();
            }
        }, this.i).f(Throwable.class, new tsm(this, amkdVar, 19, bArr), this.i);
        e.b(f22);
        e.close();
        return f22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final altk d(alog alogVar, boolean z) {
        aiut.b();
        alob alobVar = new alob();
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            String h = ((msh) alogVar.get(i)).h(((oot) this.l.b()).a());
            if (!TextUtils.isEmpty(h)) {
                alobVar.h(h);
            }
        }
        alog g = alobVar.g();
        if (g.isEmpty()) {
            this.j.e("Bugle.Rcs.PhoneNumber.Invalid.Counts", 3);
        }
        alog b = this.e.b(g);
        alpu alpuVar = new alpu();
        int i2 = ((alsx) b).c;
        for (int i3 = 0; i3 < i2; i3++) {
            sec secVar = (sec) b.get(i3);
            if (secVar.j() && (!z || secVar.k())) {
                String i4 = secVar.i();
                if (!TextUtils.isEmpty(i4)) {
                    alpuVar.b(secVar.g(), i4);
                }
            }
        }
        alpx a2 = alpuVar.a();
        boolean isEmpty = b.isEmpty();
        boolean x = a2.x();
        if (isEmpty) {
            this.j.e("Bugle.Etouffee.RemoteDevice.Status", wch.G(1));
        } else if (x) {
            this.j.e("Bugle.Etouffee.RemoteDevice.Status", wch.G(2));
        }
        return a2;
    }

    public final void e(qei qeiVar, qei qeiVar2, String str, boolean z, amkd amkdVar) {
        xyo c = a.c();
        c.H("Disabling Etouffee");
        c.L("normalizedDestination", str);
        c.A("forGroup", z);
        c.q();
        if (z) {
            thi thiVar = new thi();
            thiVar.aj("setHasNoGroupEncryption");
            thiVar.e(false);
            thiVar.g(vcb.a(str));
            thiVar.a().e();
        } else {
            vcb vcbVar = this.e;
            thi thiVar2 = new thi();
            thiVar2.aj("setHasNoEncryption");
            thiVar2.d(false);
            thiVar2.e(false);
            thiVar2.g(vcb.a(str));
            thiVar2.a().e();
            vcbVar.g(str, false);
        }
        this.j.c("Bugle.Etouffee.DisableEtouffeeUntilRefresh.Counts");
        aktp.aj(new tvp(this, qeiVar, qeiVar2, str, amkdVar, 0), this.i).k(qjc.a(new ydv(new swb(18), new swb(19), 0)), andi.a);
    }

    public final void f(qei qeiVar, String str, String str2, aozb aozbVar, Instant instant) {
        a.o("Replacing existing encryptable registration ID");
        this.f.e("RemoteDeviceLoader#setEncryptableRegistrationId", new qnh(this, qeiVar, str, instant, aozbVar, str2, 2));
    }

    public final boolean g(String str) {
        return Collection.EL.stream(this.e.c(str)).anyMatch(new trt(3));
    }
}
