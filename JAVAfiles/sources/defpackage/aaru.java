package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaru implements aapk {
    final /* synthetic */ aarm a;

    public aaru(aarm aarmVar) {
        this.a = aarmVar;
    }

    @Override // defpackage.aapk
    public final void i(amqe amqeVar) {
        aarm aarmVar = this.a;
        aarmVar.a = true;
        ((ahmv) aarmVar.f.b()).b(this.a.k);
        ((mdc) this.a.e.b()).d(amqh.EXTERNAL, amqi.EXPANDED, amqeVar, amqf.UNKNOWN_OPENING_STATE, 0, Duration.ofMillis(0L));
    }

    @Override // defpackage.aapk
    public final boolean n(amqe amqeVar, AttachmentQueueState attachmentQueueState) {
        return false;
    }

    @Override // defpackage.aapk
    public final void p(Intent intent) {
        aajq aajqVar = this.a.t;
        if (aajqVar != null) {
            aajqVar.d(intent);
        }
    }

    @Override // defpackage.aapk
    public final void j(ajwt ajwtVar, amqe amqeVar, AttachmentQueueState attachmentQueueState) {
    }
}
