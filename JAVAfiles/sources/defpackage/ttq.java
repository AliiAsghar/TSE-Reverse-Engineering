package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttq implements wyn {
    public static final alwo a = alwo.o("BugleConversation");
    public final xaf b;

    @Deprecated
    public final RcsProfileService c;
    public final ttz d;
    public final anen e;

    @Deprecated
    public final vbu f;
    public final adae g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final iji k;
    private final pvz l;
    private final msk m;
    private final anen n;

    public ttq(xaf xafVar, RcsProfileService rcsProfileService, iji ijiVar, ttz ttzVar, pvz pvzVar, msk mskVar, vbu vbuVar, adae adaeVar, armf armfVar, armf armfVar2, armf armfVar3, anen anenVar, anen anenVar2) {
        this.b = xafVar;
        this.c = rcsProfileService;
        this.f = vbuVar;
        this.k = ijiVar;
        this.d = ttzVar;
        this.l = pvzVar;
        this.m = mskVar;
        this.g = adaeVar;
        this.h = armfVar;
        this.i = armfVar2;
        this.j = armfVar3;
        this.e = anenVar;
        this.n = anenVar2;
    }

    @Override // defpackage.wyn
    public final boolean a(MessageCoreData messageCoreData) {
        return this.b.a(messageCoreData);
    }

    @Override // defpackage.wyn
    public final akul b(final MessageCoreData messageCoreData, aoia aoiaVar) {
        d.t(messageCoreData.cn(), "Location information message should not be encrypted");
        final LocationInformation c = xaf.c(messageCoreData);
        if (c != null) {
            final alog y = this.m.y(aoiaVar);
            return aktp.aj(new ancr() { // from class: ttp
                @Override // defpackage.ancr
                public final ListenableFuture a() {
                    byte[] a2;
                    akul c2;
                    qei qeiVar;
                    LocationInformation locationInformation = c;
                    ttq ttqVar = ttq.this;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    rve E = messageCoreData2.E();
                    apwq V = messageCoreData2.V();
                    String str = "";
                    if (!messageCoreData2.cn()) {
                        xaf xafVar = ttqVar.b;
                        rve E2 = messageCoreData2.E();
                        if (((okg) xafVar.i.b()).a()) {
                            Optional j = ((adje) xafVar.g.b()).j(((adae) xafVar.h.b()).d(messageCoreData2.w().d));
                            if (j.isEmpty()) {
                                ((alwl) ((alwl) xaf.a.h()).h("com/google/android/apps/messaging/shared/sms/UnencryptedLocationConverter", "getLocalPublicUserEntity", 179, "UnencryptedLocationConverter.java")).q("Rcs Configuration is null, setting localUserEntity in UnencryptedLocationConverter to empty.");
                            } else {
                                str = ((Configuration) j.get()).c().l;
                            }
                        } else if (xafVar.b.getRcsConfig() == null) {
                            ((alwl) ((alwl) xaf.a.h()).h("com/google/android/apps/messaging/shared/sms/UnencryptedLocationConverter", "getLocalUserPublicEntityLegacy", 194, "UnencryptedLocationConverter.java")).q("Rcs Configuration is null, setting localUserEntity in UnencryptedLocationConverter to empty.");
                        } else {
                            xafVar.b.getRcsConfig().getClass();
                            str = xafVar.b.getRcsConfig().c().l;
                        }
                        return aktp.ag(new ChatMessage(ChatMessage.Type.LOCATION, xafVar.f.a(str, locationInformation), rve.e(E2)));
                    }
                    if (((okg) ttqVar.j.b()).a()) {
                        qeiVar = messageCoreData2.w();
                        Optional j2 = ((adje) ttqVar.h.b()).j(((adae) ttqVar.i.b()).d(qeiVar.d));
                        if (j2.isEmpty()) {
                            ((alwl) ((alwl) ttq.a.h()).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedLocationConverter", "getLocalPublicUserEntity", 196, "EncryptedLocationConverter.java")).q("Rcs Configuration is null, setting localUserEntity in EncryptedLocationConverter to empty.");
                        } else {
                            str = ((Configuration) j2.get()).c().l;
                        }
                        a2 = ttqVar.g.a(str, locationInformation);
                        c2 = aktp.ag(qeiVar.d);
                    } else {
                        if (ttqVar.c.getRcsConfig() == null) {
                            ((alwl) ((alwl) ttq.a.h()).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EncryptedLocationConverter", "getLocalPublicUserEntityLegacy", 211, "EncryptedLocationConverter.java")).q("Rcs Configuration is null, setting localUserEntity in EncryptedLocationConverter to empty.");
                        } else {
                            ttqVar.c.getRcsConfig().getClass();
                            str = ttqVar.c.getRcsConfig().c().l;
                        }
                        a2 = ttqVar.g.a(str, locationInformation);
                        c2 = ttqVar.f.c();
                        qeiVar = null;
                    }
                    byte[] bArr = a2;
                    qei qeiVar2 = qeiVar;
                    alog alogVar = y;
                    iji ijiVar = ttqVar.k;
                    ijiVar.getClass();
                    return c2.i(new tsz(ijiVar, 4), ttqVar.e).i(new vki(ttqVar, bArr, qeiVar2, E, alogVar, V, 1), ttqVar.e);
                }
            }, this.e).h(new rgh(19), this.n).e(IllegalStateException.class, new rgh(20), this.n);
        }
        throw new IllegalArgumentException("The messages has no location information attachment");
    }
}
