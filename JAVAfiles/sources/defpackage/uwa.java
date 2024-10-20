package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uwa implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uwa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [vgq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v60, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v67, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, wul] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul c;
        akul c2;
        int i = 9;
        int i2 = 5;
        int i3 = 15;
        int i4 = 12;
        int i5 = 6;
        int i6 = 2;
        int i7 = 0;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    return ((uwc) this.a).a().h(new uhw(i3), andi.a);
                }
                return aktp.ag(false);
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    uwc uwcVar = (uwc) this.a;
                    uwcVar.c();
                    return uwcVar.a().h(new uhw(14), uwcVar.c);
                }
                return aktp.ag(false);
            case 2:
                alog alogVar = (alog) obj;
                Object obj2 = this.a;
                akul ag = aktp.ag(null);
                uwc uwcVar2 = (uwc) obj2;
                akul akulVar = ag;
                for (tqg tqgVar : uwcVar2.f.keySet()) {
                    Stream filter = Collection.EL.stream(alogVar).filter(new rhq(uwcVar2.k, tqgVar, i5, bArr));
                    int i8 = alog.d;
                    akulVar = akulVar.i(new ukk(obj2, (Object) tqgVar, filter.collect(alls.a), 5, (byte[]) null), uwcVar2.c);
                }
                return akulVar.h(new uvz(obj2, alogVar, i7), uwcVar2.c);
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    uwc uwcVar3 = (uwc) this.a;
                    uwcVar3.c();
                    return uwcVar3.a();
                }
                return aktp.ag(null);
            case 4:
                ((uyj) this.a).a.q("This account no longer exists or disabled");
                return aktp.ag(Optional.empty());
            case 5:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    Object obj3 = this.a;
                    uyj uyjVar = (uyj) obj3;
                    return ((uyl) uyjVar.b.get()).b().h(new uyi(i7), uyjVar.f).i(new twe(obj3, optional, i3), uyjVar.f);
                }
                return aktp.ag(upm.d());
            case 6:
                return ((ifq) ((uyj) this.a).c.get()).a();
            case 7:
                return ((uyl) ((uyj) this.a).b.get()).d();
            case 8:
                return ((ifq) ((uyn) this.a).b.b()).a();
            case 9:
                if (!((Boolean) obj).booleanValue()) {
                    return aktp.ag(null);
                }
                vco vcoVar = (vco) this.a;
                return vcoVar.b.j(new uyi(i2)).h(new uyi(i5), vcoVar.a);
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    return aktp.ag(null);
                }
                vco vcoVar2 = (vco) this.a;
                return vcoVar2.b.j(new uyi(i)).h(new uyi(10), vcoVar2.a);
            case 11:
                return ((uzv) this.a).j((alog) obj);
            case 12:
                alpt alptVar = (alpt) Collection.EL.stream(((uzu) obj).a()).filter(new uzr(i6)).map(new uzd(i4)).collect(alls.b);
                alptVar.getClass();
                twk twkVar = ((uzv) this.a).p;
                if (((okg) twkVar.c.b()).a()) {
                    Set aE = aqjn.aE(aqjn.aq(twkVar.a(twj.b(alptVar)), twkVar.a(twj.a(alptVar))));
                    if (aE.isEmpty()) {
                        akul ag2 = aktp.ag(false);
                        ag2.getClass();
                        return ag2;
                    }
                    xyo c3 = twk.a.c();
                    c3.H("Deleting etouffee data for messages.");
                    c3.x("size", aE.size());
                    c3.q();
                    c2 = qjh.c(twkVar.d, arpj.a, arwf.a, new qsk(twkVar, aE, (arpe) null, 17));
                    return c2;
                }
                alog h = twj.b(alptVar).h();
                alog h2 = twj.a(alptVar).h();
                h.getClass();
                h2.getClass();
                Set aE2 = aqjn.aE(aqjn.aq(h, h2));
                if (aE2.isEmpty()) {
                    akul ag3 = aktp.ag(false);
                    ag3.getClass();
                    return ag3;
                }
                xyo c4 = twk.a.c();
                c4.H("Deleting etouffee data for messages.");
                c4.x("size", aE2.size());
                c4.q();
                c = qjh.c(twkVar.d, arpj.a, arwf.a, new qsk(twkVar, aE2, (arpe) null, 18, (byte[]) null));
                return c;
            case 13:
                Optional optional2 = (Optional) obj;
                uuf uufVar = vag.a;
                optional2.getClass();
                return (ListenableFuture) optional2.map(this.a).orElse(aktp.ag(true));
            case 14:
                StringBuilder sb = new StringBuilder("Section: mobile_configuration_retriever_flags_psd\n");
                aluq listIterator = ((alor) obj).entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Object obj4 = this.a;
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    sb.append("sim_loggable_guid: ");
                    sb.append(str2);
                    sb.append("\nRcsOnboardingFlags:\n");
                    vav vavVar = (vav) obj4;
                    alor a = ((vau) vavVar.a.b()).a(str);
                    StringBuilder sb2 = new StringBuilder();
                    aluq listIterator2 = a.entrySet().listIterator();
                    while (listIterator2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) listIterator2.next();
                        sb2.append(String.format("       %s: %s\n", entry2.getKey(), entry2.getValue()));
                    }
                    sb.append(sb2.toString());
                    sb.append("RcsUpiPolicyFlags:\n");
                    alor b = ((vau) vavVar.a.b()).b(str);
                    StringBuilder sb3 = new StringBuilder();
                    aluq listIterator3 = b.entrySet().listIterator();
                    while (listIterator3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) listIterator3.next();
                        sb3.append(String.format("       %s: %s\n", entry3.getKey(), entry3.getValue()));
                    }
                    sb.append(sb3.toString());
                }
                return aktp.ag(sb.toString());
            case 15:
                return this.a.e((aqeo) obj);
            case 16:
                aqeo aqeoVar = (aqeo) obj;
                vax.a.l("Received Tachyon registration");
                if (aqeoVar != null) {
                    Object obj5 = this.a;
                    if ((aqeoVar.b & 4) != 0) {
                        aqfz aqfzVar = aqeoVar.e;
                        if (aqfzVar == null) {
                            aqfzVar = aqfz.a;
                        }
                        vax.w(aqfzVar);
                    }
                    if ((aqeoVar.b & 2) != 0) {
                        aqfg aqfgVar = aqeoVar.d;
                        if (aqfgVar == null) {
                            aqfgVar = aqfg.a;
                        }
                        return ((vby) obj5).v(aqfgVar).i(new twe(obj5, aqeoVar, 18), ((vax) obj5).o).h(new uzs(aqfgVar, i2), andi.a);
                    }
                    vax.a.m("Tachyon anonymous register response has no auth token");
                    throw new IllegalArgumentException("Tachyon anonymous register response has no auth token");
                }
                vax.a.m("Tachyon anonymous register response was null");
                throw new IllegalArgumentException("Tachyon anonymous register response was null");
            case 17:
                vbq vbqVar = (vbq) this.a;
                if (((adjc) vbqVar.j.b()).v(vbqVar.h.a)) {
                    alvw g = vbq.a.g();
                    g.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRcsAvailability", 276, "PhoneRegistrationProvider.java")).q("Phone number to register is provisioned for RCS");
                    return aktp.ag(null);
                }
                alvw i9 = vbq.a.i();
                i9.X(alwp.a, "BugleNetwork");
                alvg alvgVar = (alvg) i9;
                alvgVar.Z(alwk.MEDIUM);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkRcsAvailability", 280, "PhoneRegistrationProvider.java")).q("Phone number to register is not provisioned for RCS");
                return aktp.af(new aqwb(Status.k.withDescription("Phone number to register is not provisioned for RCS")));
            case 18:
                aqes aqesVar = (aqes) obj;
                Object obj6 = this.a;
                vbq vbqVar2 = (vbq) obj6;
                vel m = vbqVar2.m();
                aqdp aqdpVar = aqesVar.f;
                if (aqdpVar == null) {
                    aqdpVar = aqdp.a;
                }
                String str3 = aqdpVar.b;
                int i10 = 8;
                return vbqVar2.m().b().i(new ukk(obj6, str3, (Object) m, i5), vbqVar2.o).i(new vbl(m, str3, i10, bArr), vbqVar2.o).h(new uzs(aqesVar, i10), andi.a);
            case 19:
                return this.a.e((aqet) obj);
            default:
                aqet aqetVar = (aqet) obj;
                boolean z = aqetVar.d;
                Object obj7 = this.a;
                if (z) {
                    return ((vbq) obj7).m().g().h(new uzs(aqetVar, i5), andi.a);
                }
                vbq vbqVar3 = (vbq) obj7;
                return vbqVar3.m().b.j(new mdq(vbqVar3.q.f().toEpochMilli(), i4)).h(new vej(i6), andi.a).h(new uzs(aqetVar, i), andi.a);
        }
    }
}
