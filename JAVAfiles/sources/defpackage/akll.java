package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akll implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ akll(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r2v2, types: [alhr, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Boolean.valueOf(((amac) this.b).d().contains(this.a));
                }
                ?? r0 = this.b;
                long j = akto.a;
                akry h = akqj.h(akqj.b(), r0);
                try {
                    return this.a.get();
                } finally {
                }
            } else {
                Object obj = this.a;
                int i2 = Build.VERSION.SDK_INT;
                Object obj2 = ((ansy) obj).a;
                if (i2 >= 30) {
                    akri r = aktp.r(akal.a);
                    if (r.b()) {
                        obj2 = ((Context) obj2).createAttributionContext((String) r.a());
                    }
                }
                return ((Context) obj2).getContentResolver().acquireUnstableContentProviderClient((Uri) this.b);
            }
        } else {
            return ((LayoutInflater) this.b).cloneInContext((Context) this.a);
        }
    }

    public /* synthetic */ akll(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
