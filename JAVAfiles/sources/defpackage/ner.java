package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ner implements qru {
    final /* synthetic */ nes a;

    public ner(nes nesVar) {
        this.a = nesVar;
    }

    @Override // defpackage.qru
    public final void a(qrw qrwVar, Map map) {
        if (qrwVar == qrw.RCS) {
            Optional e = this.a.b.e();
            if (!e.isEmpty() && map.containsKey(e.get())) {
                alwl alwlVar = (alwl) nes.a.g();
                alwlVar.X(ydl.C, this.a.d());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier$RcsChangeListener", "onBatchCapabilitiesUpdate", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities updated in batch update.");
                nes nesVar = this.a;
                nesVar.f.y(new mqr(18), "ProviderRcsCapabilitiesSupplier::onBatchCapabilitiesUpdate");
            }
        }
    }

    @Override // defpackage.qru
    public final void b(qrw qrwVar, qei qeiVar) {
        if (qrwVar == qrw.RCS && qeiVar.equals((qei) this.a.b.e().orElse(null))) {
            alwl alwlVar = (alwl) nes.a.g();
            alwlVar.X(ydl.C, this.a.d());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier$RcsChangeListener", "onCapabilitiesUpdate", 181, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities Updated.");
            nes nesVar = this.a;
            nesVar.f.y(new mqr(19), "ProviderRcsCapabilitiesSupplier::onRcsCapabilitiesUpdate");
        }
    }
}
