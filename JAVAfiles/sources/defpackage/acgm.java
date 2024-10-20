package defpackage;

import android.util.Log;
import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acgm implements acik {
    public final /* synthetic */ acgp a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ acgo d;
    public final /* synthetic */ long e;
    private final /* synthetic */ int f;

    public /* synthetic */ acgm(acgp acgpVar, int i, Executor executor, acgo acgoVar, long j, int i2) {
        this.f = i2;
        this.a = acgpVar;
        this.b = i;
        this.c = executor;
        this.d = acgoVar;
        this.e = j;
    }

    @Override // defpackage.acik
    public final void a(acir acirVar) {
        int i;
        boolean z = true;
        if (this.f != 0) {
            boolean l = acirVar.l();
            long j = this.e;
            acgo acgoVar = this.d;
            Executor executor = this.c;
            int i2 = this.b;
            acgp acgpVar = this.a;
            if (!l) {
                if (!acgpVar.c.get() || i2 <= 1) {
                    z = false;
                }
                acirVar.g();
                if (z) {
                    Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + acgpVar.b + " failed, retrying");
                    acgpVar.e(executor, acgoVar, i2, j);
                    return;
                }
                Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + acgpVar.b + " failed");
                acgoVar.a(false);
                return;
            }
            acgpVar.b((Configurations) acirVar.h());
            String str = ((Configurations) acirVar.h()).a;
            if (str != null && !str.isEmpty()) {
                acgpVar.a.b(str).n(executor, new acgm(acgpVar, i2, executor, acgoVar, j, 0));
                return;
            } else {
                acgoVar.a(true);
                return;
            }
        }
        boolean l2 = acirVar.l();
        if (!l2) {
            acirVar.g();
        }
        acgo acgoVar2 = this.d;
        if (!l2 && (i = this.b) > 1) {
            long j2 = this.e;
            Executor executor2 = this.c;
            acgp acgpVar2 = this.a;
            Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + acgpVar2.b + " failed, retrying");
            acgpVar2.e(executor2, acgoVar2, i, j2);
            return;
        }
        acgoVar2.a(l2);
    }
}
