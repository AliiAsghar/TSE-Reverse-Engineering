package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mme implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ mme(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        aozy createBuilder;
        int i = 5;
        boolean z = false;
        switch (this.a) {
            case 0:
                alwo alwoVar = mmg.a;
                return ((Optional) obj).map(new mlm(i));
            case 1:
                return Boolean.valueOf(((upm) obj).a);
            case 2:
                alhr alhrVar = mmw.a;
                if (((Integer) obj).intValue() == 3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((Optional) obj).map(new mmv(18));
            case 4:
                Stream map = Collection.EL.stream((alog) obj).map(new mmv(20));
                int i2 = alog.d;
                return (alog) map.collect(alls.a);
            case 5:
                return null;
            case 6:
                return (miz) Collection.EL.stream((alog) obj).filter(new mmd(12)).findFirst().orElse(null);
            case 7:
                return (alor) Collection.EL.stream((alog) obj).collect(alls.a(new mtm(4), new mtm(i)));
            case 8:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return Optional.empty();
                }
                myw a = myx.a();
                a.b(((xog) optional.get()).a);
                a.d(((xog) optional.get()).b);
                a.c(((xog) optional.get()).a());
                return Optional.of(a.a());
            case 9:
                int i3 = nbq.c;
                return null;
            case 10:
                alwo alwoVar2 = DefaultRecipient.a;
                if (((Boolean) obj).booleanValue()) {
                    return nec.c;
                }
                return nec.b;
            case 11:
                alwo alwoVar3 = DefaultRecipient.a;
                return (psv) ((Optional) obj).orElse(null);
            case 12:
                return Boolean.valueOf(((nfb) obj).e);
            case 13:
                psv psvVar = (psv) obj;
                alwo alwoVar4 = DefaultRecipient.a;
                if (psvVar != null && psvVar.h()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                if (((Integer) obj).intValue() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                Optional optional2 = (Optional) obj;
                if (optional2 == null) {
                    return lga.Z(ney.a);
                }
                return lga.Z((psv) optional2.orElse(ney.a));
            case 16:
                alvw d = ngv.a.d();
                d.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 330, "LevelTrackingMediaRecorder.java")).q("start tracking sound level interrupted");
                return null;
            case 17:
                return upm.b();
            case 18:
                return upm.b();
            case 19:
                pse pseVar = (pse) obj;
                if ((pseVar.b & 1) != 0) {
                    psg psgVar = pseVar.c;
                    if (psgVar == null) {
                        psgVar = psg.a;
                    }
                    if (!psgVar.b.isEmpty()) {
                        psg psgVar2 = pseVar.c;
                        if (psgVar2 == null) {
                            psgVar2 = psg.a;
                        }
                        return Optional.of(psgVar2.b);
                    }
                }
                return Optional.empty();
            default:
                pse pseVar2 = (pse) obj;
                if ((pseVar2.b & 1) != 0) {
                    psg psgVar3 = pseVar2.c;
                    if (psgVar3 == null) {
                        psgVar3 = psg.a;
                    }
                    createBuilder = psgVar3.toBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    psg.a((psg) createBuilder.b);
                } else {
                    createBuilder = psg.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    psg.a((psg) createBuilder.b);
                }
                aozy builder = pseVar2.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                pse pseVar3 = (pse) builder.b;
                psg psgVar4 = (psg) createBuilder.s();
                psgVar4.getClass();
                pseVar3.c = psgVar4;
                pseVar3.b |= 1;
                return (pse) builder.s();
        }
    }
}
