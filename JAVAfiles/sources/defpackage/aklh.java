package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aklh extends eno {
    private akpr d;

    public aklh(cj cjVar) {
        super(cjVar);
    }

    @Override // defpackage.eno
    public final void e(enf enfVar) {
        eno.g("getObserverCount");
        if (this.b.e > 0) {
            akpr akprVar = this.d;
            int ordinal = enfVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    akrl akrlVar = akrk.a;
                                    akrlVar.getClass();
                                    akprVar.o("Lifecycle.Destroyed", akrlVar);
                                } else {
                                    Objects.toString(enfVar);
                                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(enfVar.toString()));
                                }
                            } else {
                                akrl akrlVar2 = akrk.a;
                                akrlVar2.getClass();
                                akprVar.o("Lifecycle.Stopped", akrlVar2);
                            }
                        } else {
                            akrl akrlVar3 = akrk.a;
                            akrlVar3.getClass();
                            akprVar.o("Lifecycle.Paused", akrlVar3);
                        }
                    } else {
                        akrl akrlVar4 = akrk.a;
                        akrlVar4.getClass();
                        akprVar.o("Lifecycle.Resumed", akrlVar4);
                    }
                } else {
                    akrl akrlVar5 = akrk.a;
                    akrlVar5.getClass();
                    akprVar.o("Lifecycle.Started", akrlVar5);
                }
            } else if (akprVar.e == null) {
                akrl akrlVar6 = akrk.a;
                akrlVar6.getClass();
                akprVar.o("Lifecycle.Created", akrlVar6);
                akprVar.d = true;
            }
            try {
                super.e(enfVar);
                return;
            } finally {
                this.d.m(enfVar);
            }
        }
        super.e(enfVar);
    }

    public final void h(akpr akprVar) {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Activity was already created");
        this.d = akprVar;
    }
}
