package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijp extends mdy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijp(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
        armfVar.getClass();
        executor.getClass();
    }

    public static /* synthetic */ void e(ijp ijpVar, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        ijpVar.c(i, i2, i3, 1);
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ijo(ijn.a, 0);
    }

    public final void b(arqr arqrVar) {
        n(new ijm(arqrVar, 0));
    }

    public final void c(int i, int i2, int i3, int i4) {
        aozy createBuilder = amql.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amql amqlVar = (amql) apagVar;
        amqlVar.c = i - 1;
        int i5 = 1;
        amqlVar.b |= 1;
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
                                if (i2 == 7) {
                                    i5 = 8;
                                } else {
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
        amql amqlVar2 = (amql) apagVar2;
        amqlVar2.d = i5 - 1;
        amqlVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amql amqlVar3 = (amql) apagVar3;
        amqlVar3.e = i3 - 1;
        amqlVar3.b |= 4;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        amql amqlVar4 = (amql) createBuilder.b;
        amqlVar4.f = i4 - 1;
        amqlVar4.b |= 8;
        apag s = createBuilder.s();
        s.getClass();
        b(new gsh((amql) s, 12));
    }

    public final void d(int i, int i2) {
        b(new yne(i, i2, 1));
    }
}
