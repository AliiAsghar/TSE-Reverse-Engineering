package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvt implements akvs {
    private final /* synthetic */ int a;

    public akvt(int i) {
        this.a = i;
    }

    @Override // defpackage.akvs
    public final eu a(Context context) {
        if (this.a != 0) {
            return new eu(context);
        }
        return new ajgi(context);
    }
}
