package defpackage;

import android.util.LruCache;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class whh implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ whh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v52, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.function.BiFunction, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        Object apply;
        Object apply2;
        int i = 4;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                xze xzeVar = whj.a;
                aozy builder = ((whc) obj).toBuilder();
                Object obj2 = this.a;
                obj2.getClass();
                Object obj3 = this.b;
                obj3.getClass();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                whc whcVar = (whc) builder.b;
                apbo apboVar = whcVar.m;
                if (!apboVar.b) {
                    whcVar.m = apboVar.a();
                }
                whcVar.m.put(obj2, obj3);
                return (whc) builder.s();
            case 1:
                xze xzeVar2 = whj.a;
                aozy builder2 = ((whc) obj).toBuilder();
                Object obj4 = this.b;
                obj4.getClass();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                whc whcVar2 = (whc) builder2.b;
                apbo apboVar2 = whcVar2.h;
                if (!apboVar2.b) {
                    whcVar2.h = apboVar2.a();
                }
                whcVar2.h.put(aduy.h("phone_number_record_for_sim_", (String) this.a), obj4);
                return (whc) builder2.s();
            case 2:
                xze xzeVar3 = whj.a;
                aozy builder3 = ((whc) obj).toBuilder();
                Object obj5 = this.a;
                obj5.getClass();
                Object obj6 = this.b;
                obj6.getClass();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                whc whcVar3 = (whc) builder3.b;
                apbo apboVar3 = whcVar3.t;
                if (!apboVar3.b) {
                    whcVar3.t = apboVar3.a();
                }
                new apaw(whcVar3.t, whc.v).put(obj5, obj6);
                return (whc) builder3.s();
            case 3:
                whc whcVar4 = (whc) obj;
                xze xzeVar4 = whj.a;
                aozy builder4 = whcVar4.toBuilder();
                Object obj7 = this.a;
                wgr wgrVar = wgr.a;
                obj7.getClass();
                apbo apboVar4 = whcVar4.g;
                if (apboVar4.containsKey(obj7)) {
                    wgrVar = (wgr) apboVar4.get(obj7);
                }
                wgr n = whj.n(wgrVar.toBuilder(), (wfy) this.b);
                obj7.getClass();
                n.getClass();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                whc whcVar5 = (whc) builder4.b;
                apbo apboVar5 = whcVar5.g;
                if (!apboVar5.b) {
                    whcVar5.g = apboVar5.a();
                }
                whcVar5.g.put(obj7, n);
                return (whc) builder4.s();
            case 4:
                xze xzeVar5 = whj.a;
                aozy builder5 = ((whc) obj).toBuilder();
                builder5.ab((String) this.a, (whl) this.b);
                return (whc) builder5.s();
            case 5:
                Stream filter = Collection.EL.stream(this.b).filter(new uhe(this.a, 20));
                int i2 = alog.d;
                alog alogVar = (alog) filter.collect(alls.a);
                if (Collection.EL.stream(alogVar).allMatch(new wjl(i))) {
                    return alsx.a;
                }
                return (alog) Collection.EL.stream(alogVar).map(new wga(10)).collect(alls.a);
            case 6:
                wjy wjyVar = (wjy) this.b;
                wjyVar.m(((adtn) wjyVar.d.b()).l(), 0L, false, gso.REPLACE, (amww) this.a);
                return null;
            case 7:
                ImsCapabilities imsCapabilities = (ImsCapabilities) obj;
                boolean isEmpty = imsCapabilities.j.isEmpty();
                Object obj8 = this.a;
                Object obj9 = this.b;
                if (isEmpty) {
                    ((wue) obj9).g.j((String) obj8, 3);
                    return Optional.empty();
                }
                String str = (String) imsCapabilities.j.get();
                xyo c = wue.a.c();
                c.z("RBM bot id for shortcode", str);
                c.q();
                wue wueVar = (wue) obj9;
                wueVar.g.c((String) obj8, str);
                return Optional.of(((psq) wueVar.f.b()).b(str));
            case 8:
                vqh vqhVar = (vqh) obj;
                if (vqhVar.b == 0) {
                    ?? r0 = this.b;
                    Object obj10 = this.a;
                    if (!wxz.e(r0) && !wxz.c(r0, ((xag) obj10).a)) {
                        vqg a = vqh.a(3, 10003);
                        a.b(1);
                        aozy createBuilder = amxb.a.createBuilder();
                        aozy createBuilder2 = amxc.a.createBuilder();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar = createBuilder2.b;
                        amxc amxcVar = (amxc) apagVar;
                        amxcVar.d = 1;
                        amxcVar.b = 4 | amxcVar.b;
                        amwx amwxVar = amwx.CHAT_API_EMPTY_CHAT_MESSAGE;
                        if (!apagVar.isMutable()) {
                            createBuilder2.u();
                        }
                        amxc amxcVar2 = (amxc) createBuilder2.b;
                        amxcVar2.e = amwxVar.x;
                        amxcVar2.b |= 8;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amxb amxbVar = (amxb) createBuilder.b;
                        amxc amxcVar3 = (amxc) createBuilder2.s();
                        amxcVar3.getClass();
                        amxbVar.c = amxcVar3;
                        amxbVar.b |= 1;
                        a.d = (amxb) createBuilder.s();
                        return a.a();
                    }
                    return vqhVar;
                }
                return vqhVar;
            case 9:
                Object obj11 = this.b;
                AtomicBoolean atomicBoolean = ((xcj) obj11).b;
                Object obj12 = this.a;
                if (!atomicBoolean.getAndSet(true)) {
                    akrh e = aktp.e("StartupHandlerImpl#onAppInteractiveAccountInternal");
                    try {
                        xci xciVar = (xci) akec.x(((xcj) obj11).d, xci.class, (ajwt) obj12);
                        xcj.a.l("Starting onAppInteractiveAccount tasks");
                        ((xcj) obj11).e((Set) ((apxx) xciVar.i()).a, xcg.APP_INTERACTIVE);
                        e.close();
                    } catch (Throwable th) {
                        try {
                            e.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return obj;
            case 10:
                anlt anltVar = (anlt) obj;
                ((LruCache) ((xdl) this.a).b.get()).put(this.b, anltVar);
                alwl alwlVar = (alwl) xdl.a.g();
                alwlVar.X(xfu.a, anltVar);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/capabilities/RcsContactsTachygramAdapter", "getOnlineStatus", 143, "RcsContactsTachygramAdapter.java")).q("Received online status response.");
                int i3 = vzo.a;
                int ordinal = anltVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                return psy.NOT_RCS;
                            }
                            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(anltVar))));
                        }
                        return psy.ONLINE;
                    }
                    return psy.OFFLINE;
                }
                return psy.UNKNOWN;
            case 11:
                ((xdl) this.a).f.g(new vxb(this.b, (pto) obj, 15, bArr));
                return null;
            case 12:
                pto ptoVar = (pto) obj;
                ((xdq) this.a).e.remove(this.b);
                return ptoVar;
            case 13:
                pto ptoVar2 = (pto) obj;
                ((xdq) this.a).k.e(this.b, 3);
                return ptoVar2;
            case 14:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    Object obj13 = this.a;
                    Object obj14 = this.b;
                    alwl alwlVar2 = (alwl) xep.a.i();
                    alwlVar2.X(ydl.I, obj13);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "needsGroupSync", 154, "TachygramDatabaseOperations.java")).q("Group sync needed");
                    ((xep) obj14).b.c("Bugle.Tachygram.NeedsGroupSync.Counts");
                }
                return bool;
            case 15:
                int ordinal2 = ((pwh) obj).ordinal();
                Object obj15 = this.b;
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            alwl alwlVar3 = (alwl) xfc.b.i();
                            alwlVar3.X(ydl.a, ((qgf) obj15).f);
                            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 317, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest failed, returning to Postmaster layer");
                        }
                    } else {
                        Object obj16 = this.a;
                        alvw m = xfc.b.m();
                        qgf qgfVar = (qgf) obj15;
                        m.X(ydl.a, qgfVar.f);
                        ((alwl) m.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 325, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is queued in Pwq after retryable failure.");
                        xfc xfcVar = (xfc) obj16;
                        ((wfh) xfcVar.c.b()).j(qgfVar, xfcVar.h(qgfVar));
                    }
                } else {
                    alvw m2 = xfc.b.m();
                    m2.X(ydl.a, ((qgf) obj15).f);
                    ((alwl) m2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessageNowWithoutUsingPwq", 311, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is sent successfully");
                }
                return null;
            case 16:
                qeg qegVar = (qeg) obj;
                ((xfk) this.a).e.j((qgf) this.b);
                return qegVar;
            case 17:
                qeg qegVar2 = (qeg) obj;
                ((xfk) this.a).e.j((qgf) this.b);
                return qegVar2;
            case 18:
                qeg qegVar3 = (qeg) obj;
                ((xfk) this.a).e.j((qgf) this.b);
                return qegVar3;
            case 19:
                Boolean bool2 = (Boolean) obj;
                aozy createBuilder3 = qgg.a.createBuilder();
                aozb aozbVar = ((qgf) this.b).j;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qgg qggVar = (qgg) createBuilder3.b;
                aozbVar.getClass();
                qggVar.b = 2 | qggVar.b;
                qggVar.d = aozbVar;
                aozy createBuilder4 = qeg.a.createBuilder();
                qef qefVar = qef.OK;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qeg qegVar4 = (qeg) createBuilder4.b;
                qegVar4.c = qefVar.f;
                qegVar4.b |= 1;
                qeg qegVar5 = (qeg) createBuilder4.s();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                Object obj17 = this.a;
                qgg qggVar2 = (qgg) createBuilder3.b;
                qegVar5.getClass();
                qggVar2.c = qegVar5;
                qggVar2.b |= 1;
                apct j = aotl.j(((anks) obj17).a);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qgg qggVar3 = (qgg) createBuilder3.b;
                j.getClass();
                qggVar3.e = j;
                qggVar3.b |= 4;
                amgu cL = yyb.cL();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qgg qggVar4 = (qgg) createBuilder3.b;
                cL.getClass();
                qggVar4.h = cL;
                qggVar4.b |= 32;
                boolean booleanValue = bool2.booleanValue();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qgg qggVar5 = (qgg) createBuilder3.b;
                qggVar5.b |= 8;
                qggVar5.f = booleanValue;
                return (qgg) createBuilder3.s();
            default:
                xgy xgyVar = (xgy) obj;
                alvi alviVar = xgw.a;
                aozy builder6 = xgyVar.toBuilder();
                aozy createBuilder5 = xgx.a.createBuilder();
                xgx xgxVar = xgyVar.c;
                if (xgxVar == null) {
                    xgxVar = xgx.a;
                }
                ?? r2 = this.a;
                ?? r3 = this.b;
                apply = r2.apply(xgxVar);
                apply2 = r3.apply(createBuilder5, Integer.valueOf(((Integer) apply).intValue() + 1));
                builder6.ag((xgx) ((aozy) apply2).s());
                return (xgy) builder6.s();
        }
    }

    public /* synthetic */ whh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
