package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbu extends ajbn {
    private final apqp c;

    public ajbu(apqp apqpVar) {
        this.c = apqpVar;
        this.b = 5;
    }

    @Override // defpackage.ajbn
    public final cg a(Integer num, int i) {
        ajbw ajbwVar = new ajbw();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putByteArray("Completion", this.c.toByteArray());
        ajbwVar.ak(bundle);
        return ajbwVar;
    }
}
