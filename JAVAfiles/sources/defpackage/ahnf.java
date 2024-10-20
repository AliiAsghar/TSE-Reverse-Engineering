package defpackage;

import android.content.Context;
import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahnf implements ahmw, ahlj {
    private final Context a;
    private final aneo b;
    private final armf c;
    private final armf d;
    private final Random e;
    private final armf f;
    private final ahlm g;

    public ahnf(Context context, aneo aneoVar, algw<Boolean> algwVar, armf<ahng> armfVar, armf<ahng> armfVar2, Random random, armf<algw<ahne>> armfVar3, ahlm ahlmVar) {
        this.a = context;
        this.b = aneoVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = random;
        this.f = armfVar3;
        this.g = ahlmVar;
    }

    private final int e(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        return this.e.nextInt(i2) + i;
    }

    private final void f(ahng ahngVar) {
        if (ahngVar.b) {
            algw algwVar = (algw) this.f.b();
            if (algwVar.f() && !((ahne) algwVar.b()).b()) {
                return;
            }
            albo.bK(new xpx(this, ahngVar, 12), e(ahngVar.d, ahngVar.e), TimeUnit.MILLISECONDS, this.b);
        }
    }

    public /* synthetic */ ListenableFuture a(ahng ahngVar) {
        Debug.startMethodTracingSampling(ahngVar.c, ahngVar.h, ahngVar.i);
        return this.b.schedule(new zth(17), e(ahngVar.f, ahngVar.g), TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ahmw
    public void as() {
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (bool.booleanValue()) {
            agqa.b(this.a, new agqd(this, 19));
        }
        this.g.a(this);
    }

    public /* synthetic */ void b() {
        agqa.b(this.a, new agqd(this, 18));
    }

    public /* synthetic */ void c() {
        f((ahng) this.c.b());
    }

    public /* synthetic */ void d() {
        f((ahng) this.d.b());
    }

    @Override // defpackage.ahlj
    public void j(ahka ahkaVar) {
        this.g.b(this);
        this.b.execute(new agqd(this, 20));
    }

    @Override // defpackage.ahlj
    public /* synthetic */ void i(ahka ahkaVar) {
    }
}
