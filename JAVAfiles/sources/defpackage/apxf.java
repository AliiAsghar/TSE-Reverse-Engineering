package defpackage;

import android.app.Activity;
import defpackage.apxd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxf implements apxq {
    private final Activity a;
    private final Object b = new Object();
    private volatile kqk c;

    public apxf(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.apxq
    public final /* bridge */ /* synthetic */ Object aS() {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    if (this.c == null) {
                        Object lastNonConfigurationInstance = this.a.getLastNonConfigurationInstance();
                        if (lastNonConfigurationInstance != null) {
                            this.c = (kqk) lastNonConfigurationInstance;
                        } else {
                            ngu SD = ((apxd.a) aovp.l(this.a, apxd.a.class)).SD();
                            SD.b = new apxk(null);
                            this.c = SD.c();
                        }
                    }
                    this.c = this.c;
                }
            }
        }
        return this.c;
    }
}
