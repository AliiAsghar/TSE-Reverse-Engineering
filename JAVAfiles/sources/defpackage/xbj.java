package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xbj implements xat {
    public final /* synthetic */ Bundle a;
    private final /* synthetic */ int b;

    public /* synthetic */ xbj(Bundle bundle, int i) {
        this.b = i;
        this.a = bundle;
    }

    @Override // defpackage.xat
    public final void a(String str, Object obj, int i) {
        if (this.b != 0) {
            xbe.z(this.a, i, str, obj);
        } else {
            xbe.z(this.a, i, str, obj);
        }
    }

    public xbj(Bundle bundle, int i, byte[] bArr) {
        this.b = i;
        this.a = bundle;
    }
}
