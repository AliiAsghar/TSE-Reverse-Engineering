package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public hqs(Context context) {
        this.a = context;
        this.b = "image_manager_disk_cache";
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [arzx, java.lang.Object] */
    public final void a(Object obj) {
        Object obj2;
        if (((gwq) this.a).e(obj)) {
            obj2 = new gwi(((gwq) this.a).d());
        } else {
            obj2 = gwh.a;
        }
        this.b.c(obj2);
    }

    public hqs(gwq gwqVar, arzu arzuVar) {
        this.a = gwqVar;
        this.b = arzuVar;
    }
}
