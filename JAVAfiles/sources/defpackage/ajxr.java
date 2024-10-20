package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajxr implements ajxs {
    private final cj a;
    private rw b;
    private rw c;
    private final aklj d;

    public ajxr(cj cjVar, aklj akljVar) {
        this.a = cjVar;
        this.d = akljVar;
    }

    @Override // defpackage.ajxs
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.ajxs
    public final rw b() {
        return this.c;
    }

    @Override // defpackage.ajxs
    public final rw c() {
        return this.b;
    }

    @Override // defpackage.ajxs
    public final void d(rv rvVar, rv rvVar2) {
        this.b = this.a.gQ(new sl(), rvVar);
        this.c = this.a.gQ(new sl(), rvVar2);
    }

    @Override // defpackage.ajxs
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ajxs
    public final boolean f() {
        return this.a.isFinishing();
    }

    @Override // defpackage.ajxs
    public final boolean g() {
        return this.d.a().ab();
    }
}
