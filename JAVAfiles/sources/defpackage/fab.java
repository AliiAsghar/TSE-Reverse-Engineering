package defpackage;

import android.media.MediaFormat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fab implements fke, fkp, fba {
    private fke a;
    private fkp b;
    private fke c;
    private fkp d;

    @Override // defpackage.fkp
    public final void a(long j, float[] fArr) {
        fkp fkpVar = this.d;
        if (fkpVar != null) {
            fkpVar.a(j, fArr);
        }
        fkp fkpVar2 = this.b;
        if (fkpVar2 != null) {
            fkpVar2.a(j, fArr);
        }
    }

    @Override // defpackage.fkp
    public final void b() {
        fkp fkpVar = this.d;
        if (fkpVar != null) {
            fkpVar.b();
        }
        fkp fkpVar2 = this.b;
        if (fkpVar2 != null) {
            fkpVar2.b();
        }
    }

    @Override // defpackage.fke
    public final void c(long j, long j2, eqn eqnVar, MediaFormat mediaFormat) {
        fke fkeVar = this.c;
        if (fkeVar != null) {
            fkeVar.c(j, j2, eqnVar, mediaFormat);
        }
        fke fkeVar2 = this.a;
        if (fkeVar2 != null) {
            fkeVar2.c(j, j2, eqnVar, mediaFormat);
        }
    }

    @Override // defpackage.fba
    public final void p(int i, Object obj) {
        throw null;
    }
}
