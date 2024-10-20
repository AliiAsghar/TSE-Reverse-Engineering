package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class enu {
    final enz c;
    boolean d;
    int e = -1;
    final /* synthetic */ env f;

    public enu(env envVar, enz enzVar) {
        this.f = envVar;
        this.c = enzVar;
    }

    public abstract boolean a();

    public boolean c(enm enmVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        if (z != this.d) {
            this.d = z;
            env envVar = this.f;
            if (true != z) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = envVar.c;
            envVar.c = i + i2;
            if (!envVar.d) {
                envVar.d = true;
                while (true) {
                    try {
                        int i3 = envVar.c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            if (i3 > 0) {
                                i2 = 0;
                                z2 = true;
                            } else {
                                i2 = 0;
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        if (i2 > 0 && i3 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            envVar.f();
                        } else if (z3) {
                            envVar.g();
                        }
                        i2 = i3;
                    } finally {
                        envVar.d = false;
                    }
                }
            }
            if (this.d) {
                this.f.c(this);
            }
        }
    }

    public void b() {
    }
}
