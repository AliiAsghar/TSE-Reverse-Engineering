package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljn extends mdy {
    public final armf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljn(armf armfVar, itw itwVar, Executor executor, armf armfVar2) {
        super(armfVar, itwVar, executor);
        armfVar.getClass();
        executor.getClass();
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public static /* synthetic */ void d(ljn ljnVar, int i, int i2, int i3, int i4) {
        aozy createBuilder = amwd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        apag apagVar = createBuilder.b;
        amwd amwdVar = (amwd) apagVar;
        amwdVar.c = i - 1;
        int i5 = 1;
        amwdVar.b |= 1;
        if (i2 == 0) {
            i5 = 15;
        } else if (i2 == 1) {
            i5 = 2;
        } else {
            int i6 = 3;
            if (i2 != 2) {
                if (i2 == 3) {
                    i5 = 4;
                } else {
                    i6 = 5;
                    if (i2 != 4) {
                        int i7 = 6;
                        if (i2 != 5) {
                            i6 = 7;
                            if (i2 != 6) {
                                i7 = 8;
                                if (i2 != 7) {
                                    i6 = 9;
                                    if (i2 != 8) {
                                        i7 = 10;
                                        if (i2 != 9) {
                                            if (i2 >= 10 && i2 < 20) {
                                                i5 = 11;
                                            } else if (i2 >= 20 && i2 < 50) {
                                                i5 = 12;
                                            } else if (i2 >= 50 && i2 < 100) {
                                                i5 = 13;
                                            } else if (i2 >= 100) {
                                                i5 = 14;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                }
            }
            i5 = i6;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amwd amwdVar2 = (amwd) apagVar2;
        amwdVar2.d = i5 - 1;
        amwdVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        amwd amwdVar3 = (amwd) createBuilder.b;
        amwdVar3.b |= 4;
        amwdVar3.e = i3;
        apag s = createBuilder.s();
        s.getClass();
        ljnVar.e(new kju((amwd) s, 20));
    }

    private final void e(arqr arqrVar) {
        n(new ijm(arqrVar, 7));
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ijo(ljm.a, 3);
    }

    public final void b(int i) {
        d(this, 8, 0, i, 2);
    }

    public final void c(int i, amwf amwfVar) {
        aozy createBuilder = amwe.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amwe amweVar = (amwe) apagVar;
        amweVar.d = i - 1;
        amweVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amwe amweVar2 = (amwe) createBuilder.b;
        amweVar2.c = amwfVar.e;
        amweVar2.b |= 1;
        apag s = createBuilder.s();
        s.getClass();
        e(new lnn((amwe) s, 1));
    }
}
