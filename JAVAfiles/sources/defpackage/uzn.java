package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uzn implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ uzn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r15v47, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean h;
        Integer valueOf;
        boolean z;
        aozb w;
        akul c;
        Integer valueOf2;
        Integer valueOf3;
        int i = 4;
        switch (this.c) {
            case 0:
                syc sycVar = (syc) obj;
                sycVar.f((ConversationIdType) this.a);
                sycVar.i(this.b.B());
                return sycVar;
            case 1:
                syc sycVar2 = (syc) obj;
                sycVar2.f((ConversationIdType) this.b);
                sycVar2.m(this.a);
                return sycVar2;
            case 2:
                syc sycVar3 = (syc) obj;
                sycVar3.t(this.b);
                sycVar3.o(this.a);
                return sycVar3;
            case 3:
                tht thtVar = (tht) obj;
                thtVar.U(new agmf("remote_user_id_info_table.remote_user_id", 3, tht.X(this.b), false));
                thtVar.U(new agmd("remote_user_id_info_table.guaranteed_fresh_as_of_timestamp", 7, Long.valueOf(uzz.k((Instant) this.a))));
                return thtVar;
            case 4:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                vrj vrjVar = (vrj) this.b;
                adwl a = vrjVar.j.a(intValue);
                boolean equals = Objects.equals(a, adwl.SINGLE_REG);
                Object obj2 = this.a;
                String str = (String) obj2;
                boolean j = vrjVar.j(str, a);
                if (aczv.x() && aczv.W()) {
                    alvw g = vrj.a.g();
                    g.X(alwp.a, "BugleRcsProvisioning");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "isConfigServerUrlAvailable", 897, "RcsAvailabilityUpdaterLocal.java")).t("Checking isConfigServerUrlAvailable with simId: %s, ", advq.SIM_ID.c(obj2));
                    h = ((adnv) vrjVar.f.b()).d(str).filter(new addf(18)).isPresent();
                } else {
                    alvw g2 = vrj.a.g();
                    g2.X(alwp.a, "BugleRcsProvisioning");
                    ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "isConfigServerUrlAvailable", 902, "RcsAvailabilityUpdaterLocal.java")).I("Checking isConfigServerUrlAvailable without simId because either of the following flag are false, amber_full_launch: %s, useMobileConfigurationRetrieverForFlags: %s", aczv.x(), aczv.W());
                    h = ((adnv) vrjVar.f.b()).h();
                }
                if (!j) {
                    if (!vrjVar.l.s(intValue)) {
                        return amwt.DISABLED_SIM_ABSENT;
                    }
                    if (!equals && !h) {
                        return amwt.DISABLED_VIA_GSERVICES;
                    }
                }
                if (vrjVar.i(str)) {
                    return amwt.CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING;
                }
                if (j && vrjVar.k(str)) {
                    return amwt.DISABLED_VIA_RCS_CONFIG_CHAT_AUTH;
                }
                alvw g3 = vrj.a.g();
                g3.X(alwp.a, "BugleRcsProvisioning");
                ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "getRcsAvailablityForSubId", 619, "RcsAvailabilityUpdaterLocal.java")).K("RcsAvailability: Subscription Id: %s, simId: %s, sipConnectionType: %s, isRcsAvailable: %s", num, advq.SIM_ID.c(obj2), a.name(), Boolean.valueOf(j));
                if (j) {
                    return amwt.AVAILABLE;
                }
                return amwt.CARRIER_SETUP_PENDING;
            case 5:
                snh snhVar = (snh) obj;
                snhVar.U(new agmd("conversations._id", 2, Long.valueOf(ruy.a(((xwa) this.b).a))));
                ?? r0 = this.a;
                snhVar.V((snh[]) r0.toArray(new snh[r0.size()]));
                int[] iArr = {3};
                valueOf = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf.intValue();
                if (intValue2 < 10006) {
                    agnc.t("join_state", intValue2);
                }
                snhVar.U(new agmf("conversations.join_state", 4, snh.Y(iArr), true));
                return snhVar;
            case 6:
                Object obj3 = this.a;
                smr smrVar = (smr) obj;
                alwo alwoVar = vtq.a;
                alur it = ((alog) obj3).iterator();
                boolean z2 = true;
                while (it.hasNext()) {
                    Object obj4 = this.b;
                    amlz amlzVar = (amlz) it.next();
                    int ordinal = amlzVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (albo.ah(smrVar.W())) {
                                    aozy aozyVar = (aozy) obj4;
                                    aozyVar.aJ(amlz.RCS_GROUP_SELF_MSISDN);
                                    if (!aozyVar.b.isMutable()) {
                                        aozyVar.u();
                                    }
                                    ammb ammbVar = (ammb) aozyVar.b;
                                    ammb ammbVar2 = ammb.a;
                                    ammbVar.i = 2;
                                    ammbVar.b |= 8;
                                    z = false;
                                } else {
                                    ((aozy) obj4).aK(amlz.RCS_GROUP_SELF_MSISDN);
                                    z = true;
                                }
                            } else {
                                throw new IllegalStateException(String.format("Unknown RcsGroupIdentifier (%s) when checking is RCS group identifiers Telephony data migration successful.", amlzVar.name()));
                            }
                        } else if (albo.ah(smrVar.U())) {
                            aozy aozyVar2 = (aozy) obj4;
                            aozyVar2.aJ(amlz.RCS_CONFERENCE_URI);
                            if (!aozyVar2.b.isMutable()) {
                                aozyVar2.u();
                            }
                            ammb ammbVar3 = (ammb) aozyVar2.b;
                            ammb ammbVar4 = ammb.a;
                            ammbVar3.j = 5;
                            ammbVar3.b |= 16;
                            z = false;
                        } else {
                            ((aozy) obj4).aK(amlz.RCS_CONFERENCE_URI);
                            z = true;
                        }
                    } else if (albo.ah(smrVar.V())) {
                        aozy aozyVar3 = (aozy) obj4;
                        aozyVar3.aJ(amlz.RCS_GROUP_ID);
                        if (!aozyVar3.b.isMutable()) {
                            aozyVar3.u();
                        }
                        ammb ammbVar5 = (ammb) aozyVar3.b;
                        ammb ammbVar6 = ammb.a;
                        ammbVar5.h = 2;
                        ammbVar5.b |= 4;
                        z = false;
                    } else {
                        ((aozy) obj4).aK(amlz.RCS_GROUP_ID);
                        z = true;
                    }
                    alwl alwlVar = (alwl) vtq.a.i();
                    alwlVar.X(ydl.o, smrVar.x().toString());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationActuator", "isRcsGroupIdentifierValidAfterDatabaseUpdate", 459, "RcsGroupIdentifiersTelephonyMigrationActuator.java")).E("RCS group identifier: %s valid after migration: %b.", amlzVar.name(), z);
                    z2 &= z;
                }
                return Boolean.valueOf(z2);
            case 7:
                return xbv.a((UUID) obj, (Instant) this.b, (Instant) this.a);
            case 8:
                int i2 = xbw.c;
                return xbv.a((UUID) obj, (Instant) ((AtomicReference) this.b).get(), (Instant) ((AtomicReference) this.a).get());
            case 9:
                alwo alwoVar2 = xdn.a;
                return ((nej) obj).e((qei) this.a, (pto) this.b);
            case 10:
                aozy createBuilder = qfm.a.createBuilder();
                qei a2 = ((psq) ((xew) this.b).b.b()).a(((aqfn) obj).c, false);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj5 = this.a;
                qfm qfmVar = (qfm) createBuilder.b;
                a2.getClass();
                qfmVar.c = a2;
                qfmVar.b |= 1;
                apct j2 = aotl.j((Instant) obj5);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qfm qfmVar2 = (qfm) createBuilder.b;
                j2.getClass();
                qfmVar2.d = j2;
                qfmVar2.b |= 2;
                return (qfm) createBuilder.s();
            case 11:
                String str2 = (String) obj;
                Object obj6 = this.b;
                int i3 = ((wye) obj6).q;
                xja xjaVar = (xja) this.a;
                return xjaVar.F.a(str2, i3, new rfj(xjaVar, (Object) str2, obj6, i));
            case 12:
                return ((msk) ((xja) this.a).y.b()).t((String) obj, ((wye) this.b).q);
            case 13:
                aozy aozyVar4 = (aozy) obj;
                w = aozb.w(ByteBuffer.allocate(16).putLong(r0.getMostSignificantBits()).putLong(((UUID) this.a).getLeastSignificantBits()).array());
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                ?? r1 = this.b;
                amvq amvqVar = (amvq) aozyVar4.b;
                amvq amvqVar2 = amvq.a;
                amvqVar.b |= 1;
                amvqVar.e = w;
                aozyVar4.aM(r1);
                return aozyVar4;
            case 14:
                obj.getClass();
                c = qjh.c(((wyj) this.b).c, arpj.a, arwf.a, new uog((arqr) this.a, obj, (arpe) null, 17));
                return c;
            case 15:
                tbu tbuVar = (tbu) obj;
                int i4 = xnh.a;
                tbuVar.e((ConversationIdType) this.b);
                alob alobVar = new alob();
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    alobVar.h(String.valueOf(rvc.a((MessageIdType) it2.next())));
                }
                tbuVar.U(new agmf("parts.message_id", 3, tbu.X(alobVar.g()), true));
                return tbuVar;
            case 16:
                xpe xpeVar = (xpe) obj;
                alwo alwoVar3 = xot.a;
                xpeVar.c((String) this.a);
                xpeVar.d((xpg) this.b);
                return xpeVar;
            case 17:
                Object obj7 = this.a;
                swv swvVar = (swv) obj;
                uuf uufVar = ypr.a;
                if (obj7 != null) {
                    swvVar.c((MessageIdType) obj7);
                }
                Object obj8 = this.b;
                if (obj8 != null) {
                    swvVar.b((ConversationIdType) obj8);
                }
                amzp[] amzpVarArr = {amzp.SPAM, amzp.NOT_SPAM};
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue3 = valueOf2.intValue();
                if (intValue3 < 58030) {
                    agnc.t("outcome", intValue3);
                }
                swvVar.U(new agmf("message_spam.outcome", 3, swv.X((Iterable) DesugarArrays.stream(amzpVarArr).map(new sho(11)).collect(Collectors.toCollection(new swm(4)))), true));
                return swvVar;
            case 18:
                swv swvVar2 = (swv) obj;
                uuf uufVar2 = ypr.a;
                swvVar2.b((ConversationIdType) this.b);
                valueOf3 = Integer.valueOf(a.bp().c());
                int intValue4 = valueOf3.intValue();
                if (intValue4 < 59460) {
                    agnc.t("action_type", intValue4);
                }
                swvVar2.U(new agoi("message_spam.action_type", 1, Integer.valueOf(((apzk) this.a).a())));
                return swvVar2;
            case 19:
                String str3 = (String) obj;
                xyo c2 = ytw.a.c();
                c2.H("Reading data to rotate keys for");
                c2.w("phone", str3, 2);
                c2.q();
                yub yubVar = yub.a;
                str3.getClass();
                apbo apboVar = ((yuf) this.a).e;
                if (apboVar.containsKey(str3)) {
                    yubVar = (yub) apboVar.get(str3);
                }
                yub yubVar2 = yubVar;
                Object obj9 = this.b;
                ytw ytwVar = (ytw) obj9;
                if (Math.abs(ytwVar.l.f().toEpochMilli() - yubVar2.c) < ((Long) utw.V.e()).longValue()) {
                    ytw.a.o("Skipping key rotation for requested key. Key rotation interval has not been satisfied.");
                    return aktp.ag(false);
                }
                return ytwVar.d.a().h(new yez(str3, 14), ytwVar.j).i(new xrd(obj9, yubVar2, str3, 7, (short[]) null), ytwVar.j);
            default:
                alnr alnrVar = yul.a;
                aozy builder = ((yuf) obj).toBuilder();
                builder.al((String) this.b, (String) this.a);
                return builder;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ uzn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
