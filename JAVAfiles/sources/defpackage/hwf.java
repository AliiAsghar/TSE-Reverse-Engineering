package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwf implements hwg {
    private final /* synthetic */ int a;

    public hwf(int i) {
        this.a = i;
    }

    @Override // defpackage.hwg
    public final hls a(hkz hkzVar, hwa hwaVar, hwi hwiVar, Context context) {
        if (this.a != 0) {
            return new akmt(hkzVar, hwaVar, hwiVar, context);
        }
        return new hls(hkzVar, hwaVar, hwiVar, context);
    }
}
