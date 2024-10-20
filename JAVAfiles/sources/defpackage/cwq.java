package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwq {
    public static final View a(cwo cwoVar) {
        if (!cwoVar.A().z) {
            csg.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) cxq.a(cwp.e(cwoVar));
    }
}
