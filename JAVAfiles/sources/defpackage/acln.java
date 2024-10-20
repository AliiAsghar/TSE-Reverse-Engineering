package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acln implements abrm {
    public final int a;
    private final Status b;
    private final /* synthetic */ int c;

    public acln(Status status, int i, int i2) {
        this.c = i2;
        this.b = status;
        this.a = i;
    }

    @Override // defpackage.abrm
    public final Status a() {
        if (this.c != 0) {
            return this.b;
        }
        return this.b;
    }
}
