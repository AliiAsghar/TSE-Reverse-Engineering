package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeh implements OnReceiveContentListener {
    private final edi a;

    public eeh(edi ediVar) {
        this.a = ediVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        edi ediVar = this.a;
        ecv g = ecv.g(contentInfo);
        ecv a = ediVar.a(view, g);
        if (a == null) {
            return null;
        }
        if (a == g) {
            return contentInfo;
        }
        return a.f();
    }
}
