package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gch {
    public gaz b;
    public gaz c;
    public gaz d;

    public gch() {
        gay gayVar = gay.b;
        this.b = gayVar;
        this.c = gayVar;
        this.d = gayVar;
    }

    public abstract void a(gbb gbbVar, gaz gazVar);

    public final void b(gbb gbbVar, gaz gazVar) {
        gbbVar.getClass();
        int ordinal = gbbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!d.F(this.d, gazVar)) {
                        this.d = gazVar;
                    } else {
                        return;
                    }
                }
            } else if (!d.F(this.c, gazVar)) {
                this.c = gazVar;
            } else {
                return;
            }
        } else if (!d.F(this.b, gazVar)) {
            this.b = gazVar;
        } else {
            return;
        }
        a(gbbVar, gazVar);
    }
}
