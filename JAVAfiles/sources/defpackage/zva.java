package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zva implements akbp<Void, Boolean> {
    final /* synthetic */ zuz a;

    public zva(zuz zuzVar) {
        this.a = zuzVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        ndq ndqVar;
        ResolvedRecipient resolvedRecipient = this.a.f;
        if (resolvedRecipient != null) {
            ndqVar = resolvedRecipient.z();
        } else {
            ndqVar = null;
        }
        Objects.toString(ndqVar);
        throw new IllegalStateException("Failed to update Norm UI status for a participant with ID ".concat(String.valueOf(ndqVar)), th);
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ndq ndqVar;
        xyo c = zuz.a.c();
        c.H("The banner was shown and the user informed.");
        ResolvedRecipient resolvedRecipient = this.a.f;
        if (resolvedRecipient != null) {
            ndqVar = resolvedRecipient.z();
        } else {
            ndqVar = null;
        }
        c.z("participantId", ndqVar);
        c.q();
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
