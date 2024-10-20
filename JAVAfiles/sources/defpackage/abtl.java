package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abtl {
    public final Feature[] b;
    public final boolean c;
    public final int d;

    @Deprecated
    public abtl() {
        this.b = null;
        this.c = false;
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(abqu abquVar, acit acitVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abtl(Feature[] featureArr, boolean z, int i) {
        this.b = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }
}
