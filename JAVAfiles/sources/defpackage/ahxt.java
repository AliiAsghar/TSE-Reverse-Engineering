package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahxt implements aciq {
    private final /* synthetic */ int a;

    public /* synthetic */ ahxt(int i) {
        this.a = i;
    }

    @Override // defpackage.aciq
    public final acir a(Object obj) {
        if (this.a != 0) {
            Bundle bundle = (Bundle) obj;
            if (abpn.d(bundle)) {
                return actx.s(null);
            }
            return actx.s(bundle);
        }
        acit acitVar = new acit();
        acitVar.b(new aibp(Uri.parse(((aowd) obj).b)));
        return (acir) acitVar.a;
    }
}
