package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.rcs.client.profile.RcsProfileService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xaf implements wyn {
    public static final alwo a = alwo.o("BugleConversation");
    public final RcsProfileService b;
    public final ajsg c;
    public final pwa d;
    public final xnv e;
    public final adae f;
    public final armf g;
    public final armf h;
    public final armf i;

    @Deprecated
    private final vbu j;
    private final anen k;

    public xaf(RcsProfileService rcsProfileService, ajsg ajsgVar, vbu vbuVar, pwa pwaVar, xnv xnvVar, adae adaeVar, armf armfVar, armf armfVar2, armf armfVar3, anen anenVar) {
        this.b = rcsProfileService;
        this.c = ajsgVar;
        this.j = vbuVar;
        this.d = pwaVar;
        this.e = xnvVar;
        this.f = adaeVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.k = anenVar;
    }

    public static LocationInformation c(MessageCoreData messageCoreData) {
        MessagePartCoreData G = messageCoreData.G();
        if (G == null) {
            return null;
        }
        return G.J();
    }

    @Override // defpackage.wyn
    public final boolean a(MessageCoreData messageCoreData) {
        if (c(messageCoreData) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wyn
    public final akul b(MessageCoreData messageCoreData, aoia aoiaVar) {
        akul c;
        LocationInformation c2 = c(messageCoreData);
        if (c2 != null) {
            if (((okg) this.i.b()).a()) {
                c = aktp.ag(messageCoreData.w().d);
            } else {
                c = this.j.c();
            }
            return c.i(new vwx(this, messageCoreData, c2, 7), this.k);
        }
        throw new IllegalArgumentException("The messages has no location information attachment");
    }
}
