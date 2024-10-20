package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uxc extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxc(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, anen] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, uns] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                aozy aozyVar = (aozy) obj;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                uwz uwzVar = (uwz) aozyVar.b;
                uwz uwzVar2 = uwz.a;
                uwzVar.b |= 512;
                uwzVar.l = true;
                apct k = aoue.k((Instant) this.a);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                uwz uwzVar3 = (uwz) aozyVar.b;
                uwzVar3.m = k;
                uwzVar3.b |= 1024;
                return arnb.a;
            case 1:
                aozy aozyVar2 = (aozy) obj;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                uwz uwzVar4 = (uwz) aozyVar2.b;
                uwz uwzVar5 = uwz.a;
                uwzVar4.b |= 128;
                uwzVar4.j = true;
                apct k2 = aoue.k((Instant) this.a);
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                uwz uwzVar6 = (uwz) aozyVar2.b;
                uwzVar6.k = k2;
                uwzVar6.b |= 256;
                return arnb.a;
            case 2:
                return ((msk) ((vbf) this.a).b.b()).r(((adit) obj).a);
            case 3:
                aozy aozyVar3 = (aozy) obj;
                Instant f = ((vwd) this.a).e.f();
                f.getClass();
                apct k3 = aoue.k(f);
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                vwe vweVar = (vwe) aozyVar3.b;
                vwe vweVar2 = vwe.a;
                vweVar.d = k3;
                vweVar.b |= 2;
                return arnb.a;
            case 4:
                ((MessageCoreData) obj).getClass();
                return Boolean.valueOf(!this.a.b());
            case 5:
                wie wieVar = (wie) obj;
                wieVar.getClass();
                aozy builder = wieVar.toBuilder();
                String str = adom.n(this.a).a;
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((wie) builder.b).a().remove(str);
                apag s = builder.s();
                s.getClass();
                return (wie) s;
            case 6:
                wjc wjcVar = (wjc) obj;
                wjcVar.getClass();
                aozy builder2 = wjcVar.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                Object obj2 = this.a;
                wjc wjcVar2 = (wjc) builder2.b;
                wjcVar2.e = ((wiz) obj2).e;
                wjcVar2.b |= 2;
                apag s2 = builder2.s();
                s2.getClass();
                return (wjc) s2;
            case 7:
                aozy builder3 = ((wjc) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                Object obj3 = this.a;
                wjc wjcVar3 = (wjc) builder3.b;
                wjcVar3.e = ((wiz) obj3).e;
                wjcVar3.b |= 2;
                return (wjc) builder3.s();
            case 8:
                xbz xbzVar = (xbz) obj;
                xbzVar.getClass();
                this.a.aE();
                xbzVar.c();
                return arnb.a;
            case 9:
                wur wurVar = (wur) this.a;
                Void r6 = (Void) obj;
                wurVar.c.remove(wurVar.a);
                return r6;
            case 10:
                alor alorVar = (alor) obj;
                ((wur) this.a).c.putAll(alorVar);
                ((wur) this.a).b.set(true);
                return alorVar;
            case 11:
                wur wurVar2 = (wur) this.a;
                String str2 = wurVar2.a;
                apbt apbtVar = (apbt) obj;
                str2.getClass();
                apbtVar.getClass();
                wurVar2.c.put(str2, apbtVar);
                return apbtVar;
            case 12:
                wur wurVar3 = (wur) this.a;
                String str3 = wurVar3.a;
                apbt apbtVar2 = (apbt) obj;
                str3.getClass();
                apbtVar2.getClass();
                wurVar3.c.put(str3, apbtVar2);
                return arnb.a;
            case 13:
                wur wurVar4 = (wur) this.a;
                String str4 = wurVar4.a;
                apbt apbtVar3 = (apbt) obj;
                str4.getClass();
                apbtVar3.getClass();
                wurVar4.c.put(str4, apbtVar3);
                return apbtVar3;
            case 14:
                String str5 = (String) obj;
                str5.getClass();
                zap zapVar = (zap) this.a;
                aiwl aiwlVar = new aiwl((wus) zapVar.e);
                aiwlVar.l(str5);
                wus f2 = aiwlVar.f();
                wva wvaVar = new wva(zapVar.f, zapVar.d, zapVar.b, f2);
                if (f2.f) {
                    a.bE((AtomicReference) zapVar.a, new wut(null));
                    Object obj4 = ((AtomicReference) zapVar.a).get();
                    obj4.getClass();
                    return new wur(wvaVar, f2, (wut) obj4);
                }
                return wvaVar;
            case 15:
                ((alwl) ((alwl) wva.a.i()).g((apba) obj)).q("Failed to get the previous data to migrate. The previous data is ignored.");
                return ((wva) this.a).g;
            case 16:
                return aktp.ag(((wva) this.a).q());
            case 17:
                List<tla> list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.getClass();
                Object obj5 = this.a;
                for (tla tlaVar : list) {
                    try {
                        byte[] k4 = tlaVar.k();
                        if (k4 != null) {
                            String h = tlaVar.h();
                            if (h == null) {
                                h = "";
                            }
                            linkedHashMap.put(h, ((wva) obj5).p(k4));
                        }
                    } catch (apba unused) {
                    }
                }
                return alzz.bc(linkedHashMap);
            case 18:
                Optional optional = (Optional) obj;
                optional.getClass();
                return ((wva) this.a).o(optional);
            case 19:
                return (apbt) ((Optional) obj).orElse(((wva) this.a).g);
            default:
                apbt apbtVar4 = (apbt) obj;
                if (((wva) this.a).u(apbtVar4)) {
                    try {
                        apbt apbtVar5 = (apbt) ((wva) this.a).i.a().orElse(((wva) this.a).g);
                        if (!((wva) this.a).u(apbtVar5)) {
                            ((wva) this.a).i.c();
                        }
                        return apbtVar5;
                    } catch (apba e) {
                        ((alwl) ((alwl) wva.a.i()).g(e)).q("Failed to get the previous data to migrate. The previous data is ignored.");
                        return apbtVar4;
                    }
                }
                return apbtVar4;
        }
    }
}
