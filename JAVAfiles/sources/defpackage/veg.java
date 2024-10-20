package defpackage;

import android.util.Base64;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class veg implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ veg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [armf, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                aozy builder = ((vee) obj).toBuilder();
                aozb w = aozb.w((byte[]) this.a);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((vee) builder.b).d = w;
                return (vee) builder.s();
            case 1:
                aozy builder2 = ((vee) obj).toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                ((vee) builder2.b).c = (String) this.a;
                return (vee) builder2.s();
            case 2:
                aozy builder3 = ((vee) obj).toBuilder();
                aozb w2 = aozb.w((byte[]) this.a);
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                ((vee) builder3.b).h = w2;
                return (vee) builder3.s();
            case 3:
                aozy builder4 = ((vee) obj).toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                Object obj2 = this.a;
                vee veeVar = (vee) builder4.b;
                obj2.getClass();
                veeVar.p = (String) obj2;
                return (vee) builder4.s();
            case 4:
                byte[] bArr = (byte[]) obj;
                Object obj3 = this.a;
                if (bArr != null && bArr.length != 0) {
                    aozy createBuilder = aqfu.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqfu) createBuilder.b).b = a.an(3);
                    aozb w3 = aozb.w(bArr);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqfu) createBuilder.b).c = w3;
                    return Base64.encodeToString(((aqfu) createBuilder.s()).toByteArray(), 0);
                }
                return obj3;
            case 5:
                aqfk aqfkVar = (aqfk) obj;
                if (aqfkVar == null) {
                    return this.a;
                }
                return Base64.encodeToString(aqfkVar.toByteArray(), 0);
            case 6:
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null && bArr2.length != 0) {
                    return Base64.encodeToString(bArr2, 0);
                }
                return this.a;
            case 7:
                vee veeVar2 = (vee) obj;
                ((AtomicReference) this.a).set(veeVar2);
                aozy builder5 = veeVar2.toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                apag apagVar = builder5.b;
                ((vee) apagVar).h = vee.a.h;
                if (!apagVar.isMutable()) {
                    builder5.u();
                }
                apag apagVar2 = builder5.b;
                ((vee) apagVar2).d = vee.a.d;
                ved vedVar = ved.NOT_REGISTERED;
                if (!apagVar2.isMutable()) {
                    builder5.u();
                }
                ((vee) builder5.b).i = vedVar.a();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                ((vee) builder5.b).k = 0;
                return (vee) builder5.s();
            case 8:
                Stream map = Collection.EL.stream((alog) obj).map(new vbk(this.a, 19));
                int i = alog.d;
                return (alog) map.collect(alls.a);
            case 9:
                return ((wyp) this.a).B((alog) obj);
            case 10:
                Stream filter = Collection.EL.stream((alog) obj).filter(new uhe(this.a, 8));
                int i2 = alog.d;
                return (alog) filter.collect(alls.a);
            case 11:
                List list = (List) obj;
                aozy builder6 = ((apag) this.a).toBuilder();
                if (!builder6.b.isMutable()) {
                    builder6.u();
                }
                ((anfr) builder6.b).r = anfr.emptyProtobufList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    builder6.aQ((ango) it.next());
                }
                return (anfr) builder6.s();
            case 12:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    ahmv ahmvVar = (ahmv) this.a;
                    if (((trz) ahmvVar.h.b()).i() || ((trz) ahmvVar.h.b()).k()) {
                        return new ven(optional, ((ttj) ahmvVar.g.b()).b(((qei) optional.get()).d));
                    }
                }
                return new ven(optional, aktp.ag(false));
            case 13:
                ver verVar = (ver) this.a;
                aqfn aqfnVar = verVar.a;
                ver.n(verVar.c, (aqdu) obj, aqfnVar);
                return null;
            case 14:
                int i3 = ver.e;
                return this.a;
            case 15:
                int i4 = ver.e;
                xzb.p("BugleNetwork", (Exception) obj, "setDittoLastPushTimeMillis did not complete successfully");
                return this.a;
            case 16:
                Boolean bool = (Boolean) obj;
                Object obj4 = this.a;
                if (bool != null && bool.booleanValue()) {
                    vfi.a.o("Internet connectivity check passed");
                    ((vfi) obj4).d.set(true);
                    return true;
                }
                vfi.a.q("Internet connectivity check failed");
                ((vfi) obj4).d.set(false);
                return false;
            case 17:
                vfi.a.o("Received EchoResponse");
                ((vfi) this.a).e.set(Status.Code.OK.value());
                return aqdn.a;
            case 18:
                Status.Code a = vch.a((Throwable) obj);
                xyo e = vfi.a.e();
                e.H("Tachyon connectivity check failed.");
                e.z("ErrorCode", a);
                e.q();
                ((vfi) this.a).e.set(a.value());
                return aqdn.a;
            case 19:
                aozy aozyVar = (aozy) obj;
                aozy aozyVar2 = (aozy) this.a;
                aqhz aqhzVar = ((aqep) aozyVar2.b).l;
                if (aqhzVar == null) {
                    aqhzVar = aqhz.a;
                }
                apao apaoVar = aqhzVar.b;
                aqhz aqhzVar2 = ((aqep) aozyVar.b).l;
                if (aqhzVar2 == null) {
                    aqhzVar2 = aqhz.a;
                }
                boolean d = vfl.d(apaoVar, aqhzVar2.b, aqhz.class.getName());
                aqfj aqfjVar = ((aqep) aozyVar2.b).m;
                if (aqfjVar == null) {
                    aqfjVar = aqfj.a;
                }
                apax apaxVar = aqfjVar.b;
                aqfj aqfjVar2 = ((aqep) aozyVar.b).m;
                if (aqfjVar2 == null) {
                    aqfjVar2 = aqfj.a;
                }
                boolean d2 = d | vfl.d(apaxVar, aqfjVar2.b, aqfj.class.getName());
                aqfk aqfkVar2 = ((aqep) aozyVar2.b).n;
                if (aqfkVar2 == null) {
                    aqfkVar2 = aqfk.b;
                }
                apao apaoVar2 = aqfkVar2.c;
                aqfk aqfkVar3 = ((aqep) aozyVar.b).n;
                if (aqfkVar3 == null) {
                    aqfkVar3 = aqfk.b;
                }
                if (!(vfl.d(apaoVar2, aqfkVar3.c, aqfk.class.getName()) | d2)) {
                    return aozyVar;
                }
                throw new IllegalStateException("Decorator removed metadata.");
            default:
                alvw g = vfv.c.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) ((alvg) g).g((Exception) obj)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 320, "BindHandlerImpl.java")).t("%s BindHandler: Pull message failed", akec.aD(((vfv) this.a).E));
                return null;
        }
    }
}
