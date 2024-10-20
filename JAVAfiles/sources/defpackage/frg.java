package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class frg extends ewm implements frc {
    private frc e;
    private long f;

    @Override // defpackage.frc
    public final int a() {
        frc frcVar = this.e;
        dzg.g(frcVar);
        return frcVar.a();
    }

    @Override // defpackage.frc
    public final int b(long j) {
        frc frcVar = this.e;
        dzg.g(frcVar);
        return frcVar.b(j - this.f);
    }

    @Override // defpackage.frc
    public final long c(int i) {
        frc frcVar = this.e;
        dzg.g(frcVar);
        return frcVar.c(i) + this.f;
    }

    @Override // defpackage.frc
    public final List e(long j) {
        frc frcVar = this.e;
        dzg.g(frcVar);
        return frcVar.e(j - this.f);
    }

    @Override // defpackage.ewm, defpackage.ewf
    public final void eO() {
        super.eO();
        this.e = null;
    }

    public final void i(long j, frc frcVar, long j2) {
        this.b = j;
        this.e = frcVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
