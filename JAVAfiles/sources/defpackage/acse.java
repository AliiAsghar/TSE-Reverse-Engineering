package defpackage;

import android.content.Context;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acse implements acug {
    protected final Context a;
    protected final acrz b;

    public acse(Context context, acrz acrzVar) {
        this.a = context;
        this.b = acrzVar;
    }

    protected abstract String a();

    @Override // defpackage.acug
    public void c(acrt acrtVar) {
        String a = a();
        advr.c("HTTP file transfer failed for pendingTransferKey %s, fileTransferError %s", a, acrtVar);
        ((acry) this.b).f.remove(a);
        if (acrt.d.equals(acrtVar)) {
            ((RcsEngineImpl) ((acry) this.b).i.a).onReconfigurationRequested();
        }
    }
}
