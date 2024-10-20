package defpackage;

import java.util.Collection;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aomw extends alxy {
    private final Collection a;

    public aomw(String str, Collection collection) {
        super(str);
        this.a = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alww
    public final void b(alwv alwvVar) {
        alur it = ((alog) this.a).iterator();
        while (it.hasNext()) {
            alww alwwVar = (alww) it.next();
            if (alwvVar.S() || alwwVar.c(alwvVar.m())) {
                alwwVar.b(alwvVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alww
    public final boolean c(Level level) {
        alur it = ((alog) this.a).iterator();
        while (it.hasNext()) {
            if (((alww) it.next()).c(level)) {
                return true;
            }
        }
        return false;
    }
}
