package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajxh implements ajxj {
    private final cj a;
    private rw b;
    private rw c;
    private final aklj d;

    public ajxh(cj cjVar, aklj akljVar) {
        this.a = cjVar;
        this.d = akljVar;
    }

    @Override // defpackage.ajxj
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.ajxj
    public final rw b() {
        return this.c;
    }

    @Override // defpackage.ajxj
    public final rw c() {
        return this.b;
    }

    @Override // defpackage.ajxj
    public final void d(rv rvVar, rv rvVar2) {
        this.b = this.a.gQ(new sl(), rvVar);
        this.c = this.a.gQ(new sl(), rvVar2);
    }

    @Override // defpackage.ajxj
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ajxj
    public final boolean f() {
        return this.a.isChangingConfigurations();
    }

    @Override // defpackage.ajxj
    public final boolean g() {
        return this.a.isFinishing();
    }

    @Override // defpackage.ajxj
    public final boolean h() {
        return this.d.a().ab();
    }
}
