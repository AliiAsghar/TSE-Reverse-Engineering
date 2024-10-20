package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alvf extends alvo implements alvw {
    /* JADX INFO: Access modifiers changed from: protected */
    public alvf(Level level) {
        super(level);
    }

    @Override // defpackage.alvo
    protected final alzs b() {
        return alzq.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alvo
    public final boolean c(alvs alvsVar) {
        alxa i = i();
        int b = i.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b) {
                break;
            }
            if (i.c(i2).a == "eye3tag") {
                if (i.d(alvm.a) == null && i.d(alvm.i) == null) {
                    n(alvm.i, alwk.SMALL);
                }
            } else {
                i2++;
            }
        }
        return super.c(alvsVar);
    }
}
