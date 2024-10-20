package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uzs implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uzs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        alog alogVar;
        dtq dtqVar;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                xyo a = uzv.D.a();
                a.H(String.format("Message ID of file transfers cancelled due to message deletion: %s", (alog) obj));
                a.q();
                return this.a;
            case 1:
                alog alogVar2 = (alog) obj;
                if (alogVar2.isEmpty()) {
                    return alsx.a;
                }
                Object obj2 = this.a;
                alpr alprVar = new alpr();
                alprVar.j(alogVar2);
                sxy d = MessagesTable.d();
                d.w("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId-subquery");
                d.e(new uzd(13));
                d.g(new uuy(alogVar2, 19));
                sxx b = d.b();
                sxy d2 = MessagesTable.d();
                d2.w("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId");
                d2.c(MessagesTable.c.a);
                d2.g(new uzn(b, alogVar2, 2, bArr));
                alprVar.j(d2.b().g());
                svo a2 = svq.a();
                a2.w("+DeleteMessageHandler#getMessageIdsWithReactions");
                a2.d(new uuy(alogVar2, 20));
                alprVar.j(a2.b().f());
                uzv uzvVar = (uzv) obj2;
                if (((Boolean) uzvVar.n.b()).booleanValue()) {
                    sup supVar = new sup(sur.a);
                    supVar.w("+DeleteMessageHandler#getMessageIdsOfEdits");
                    supVar.c((sul) sur.d.e);
                    supVar.d(new uuy(alogVar2, 18));
                    sun sunVar = (sun) supVar.b().m((agmh) sur.d.e);
                    try {
                        alob alobVar = new alob();
                        while (sunVar.moveToNext()) {
                            sunVar.e();
                            alobVar.h(sunVar.e());
                        }
                        alogVar = alobVar.g();
                        sunVar.close();
                    } catch (Throwable th) {
                        try {
                            sunVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    alogVar = alsx.a;
                }
                alprVar.j(alogVar);
                return ((rwd) uzvVar.h.b()).E(alprVar.g().g());
            case 2:
                aozy builder = ((aehp) obj).toBuilder();
                Object obj3 = this.a;
                obj3.getClass();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((aehp) builder.b).a().remove(obj3);
                return (aehp) builder.s();
            case 3:
                return (aehn) Map.EL.getOrDefault((java.util.Map) obj, this.a, aehn.a);
            case 4:
                return this.a;
            case 5:
                return this.a;
            case 6:
                alvi alviVar = vbq.a;
                return this.a;
            case 7:
                Object obj4 = this.a;
                aqfg aqfgVar = (aqfg) obj;
                synchronized (((vbq) obj4).k) {
                    dtqVar = ((vbq) obj4).l;
                    ((vbq) obj4).l = null;
                }
                if (dtqVar != null) {
                    alvw g = vbq.a.g();
                    g.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFuture", 636, "PhoneRegistrationProvider.java")).q("OTP is processed and pending OTP completer is completed.");
                    dtqVar.b(aqfgVar);
                } else {
                    alvw g2 = vbq.a.g();
                    g2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "completeAwaitingOtpFuture", 639, "PhoneRegistrationProvider.java")).q("OTP is processed successfully without awaiting completer.");
                }
                return true;
            case 8:
                alvi alviVar2 = vbq.a;
                return this.a;
            case 9:
                alvi alviVar3 = vbq.a;
                return this.a;
            case 10:
                alvi alviVar4 = vbq.a;
                aqfg aqfgVar2 = ((aqff) this.a).d;
                if (aqfgVar2 == null) {
                    return aqfg.a;
                }
                return aqfgVar2;
            case 11:
                Optional optional = (Optional) obj;
                alvi alviVar5 = vbq.a;
                if (optional.isPresent()) {
                    return ((vee) optional.get()).d.H();
                }
                return this.a;
            case 12:
                aqfg aqfgVar3 = ((aqer) this.a).d;
                if (aqfgVar3 == null) {
                    return aqfg.a;
                }
                return aqfgVar3;
            case 13:
                aqfg aqfgVar4 = (aqfg) obj;
                vcj.a.l("Completed ensuring Tachyon phone registration");
                ((vcj) this.a).i.set(false);
                return aqfgVar4;
            case 14:
                Stream stream = Collection.EL.stream((Set) obj);
                Object obj5 = this.a;
                Stream map = stream.map(new vbk(obj5, 15)).map(new vbi(11)).map(new vbk(obj5, 16));
                int i = alog.d;
                return (alog) map.collect(alls.a);
            case 15:
                return Optional.of(this.a);
            case 16:
                int i2 = vdr.c;
                aozy builder2 = ((vdw) obj).toBuilder();
                ((Long) this.a).longValue();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                ((vdw) builder2.b).b = 0L;
                return (vdw) builder2.s();
            case 17:
                aozy builder3 = ((vdw) obj).toBuilder();
                ((Long) this.a).longValue();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                ((vdw) builder3.b).b = 0L;
                return (vdw) builder3.s();
            case 18:
                aozy builder4 = ((vdv) obj).toBuilder();
                aozb w = aozb.w((byte[]) this.a);
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                ((vdv) builder4.b).c = w;
                return (vdv) builder4.s();
            case 19:
                aozy builder5 = ((vdv) obj).toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                Object obj6 = this.a;
                vdv vdvVar = (vdv) builder5.b;
                obj6.getClass();
                vdvVar.b = (String) obj6;
                return (vdv) builder5.s();
            default:
                long longValue = ((Long) obj).longValue();
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                vds vdsVar = (vds) aozyVar.b;
                vds vdsVar2 = vds.a;
                vdsVar.b = longValue;
                return (vds) aozyVar.s();
        }
    }
}
