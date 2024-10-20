package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwc implements aiuw {
    public ajur[] a;

    /* JADX WARN: Type inference failed for: r1v0, types: [aiwd, java.lang.Object] */
    @Override // defpackage.aiuw
    public final /* bridge */ /* synthetic */ Object a(aogy aogyVar) {
        List y = aogyVar.y(aogyVar.a.h((Uri) aogyVar.f));
        ajur[] ajurVarArr = this.a;
        if (ajurVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                ajurVarArr[i].y(y);
            }
        }
        return (OutputStream) y.get(0);
    }
}
