package androidx.work;

import android.content.Context;
import defpackage.gks;
import defpackage.grz;
import defpackage.gsb;
import defpackage.gsy;
import defpackage.gtm;
import defpackage.gvd;
import defpackage.gvf;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements gks<gtm> {
    private static final String a = gsy.b("WrkMgrInitializer");

    @Override // defpackage.gks
    public final /* synthetic */ Object a(Context context) {
        gsy.a().c(a, "Initializing WorkManager with default configuration.");
        gsb gsbVar = new gsb(new grz());
        context.getClass();
        gvd.n(context, gsbVar);
        return gvf.ar(context);
    }

    @Override // defpackage.gks
    public final List b() {
        return Collections.emptyList();
    }
}
