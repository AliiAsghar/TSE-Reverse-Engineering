package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class evb implements evg {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private evl d;

    /* JADX INFO: Access modifiers changed from: protected */
    public evb(boolean z) {
        this.a = z;
    }

    @Override // defpackage.evg
    public /* synthetic */ Map e() {
        return Collections.emptyMap();
    }

    @Override // defpackage.evg
    public final void f(ewc ewcVar) {
        dzg.g(ewcVar);
        if (!this.b.contains(ewcVar)) {
            this.b.add(ewcVar);
            this.c++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(int i) {
        evl evlVar = this.d;
        int i2 = eul.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((ewc) this.b.get(i3)).a(evlVar, this.a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        evl evlVar = this.d;
        int i = eul.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((ewc) this.b.get(i2)).b(evlVar, this.a);
        }
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(evl evlVar) {
        this.d = evlVar;
        for (int i = 0; i < this.c; i++) {
            ((ewc) this.b.get(i)).d(evlVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        for (int i = 0; i < this.c; i++) {
            ((ewc) this.b.get(i)).c();
        }
    }
}
