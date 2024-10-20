package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akhh implements alhf {
    public final /* synthetic */ akhj a;
    public final /* synthetic */ aodz b;
    private final /* synthetic */ int c;

    public /* synthetic */ akhh(akhj akhjVar, aodz aodzVar, int i) {
        this.c = i;
        this.a = akhjVar;
        this.b = aodzVar;
    }

    @Override // defpackage.alhf
    public final void a(Object obj) {
        if (this.c != 0) {
            aodz aodzVar = this.b;
            this.a.b(aodzVar, (ListenableFuture) obj);
        } else {
            aodz aodzVar2 = this.b;
            this.a.b(aodzVar2, (ListenableFuture) obj);
        }
    }
}
