package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjj {
    public final anji a;
    public final anjn b;
    public final anjf c;
    public final alpt d;

    public anjj(anji anjiVar, anjn anjnVar, anjf anjfVar, alpt alptVar) {
        this.a = anjiVar;
        this.b = anjnVar;
        this.c = anjfVar;
        this.d = alptVar;
        if (!alptVar.isEmpty()) {
            if (anjnVar.b.a(anjfVar)) {
                aluq listIterator = alptVar.listIterator();
                listIterator.getClass();
                while (listIterator.hasNext()) {
                    anjl anjlVar = (anjl) listIterator.next();
                    anjq anjqVar = this.b.b;
                    anjk anjkVar = anjlVar.b;
                    int ordinal = anjqVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                anjkVar.getClass();
                                if (anjk.b != anjkVar && anjk.c != anjkVar) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            anjkVar.getClass();
                            if (anjk.b != anjkVar) {
                                throw new IllegalStateException("Check failed.");
                            }
                        }
                    } else {
                        anjkVar.getClass();
                        if (anjk.a != anjkVar) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anjj)) {
            return false;
        }
        anjj anjjVar = (anjj) obj;
        if (d.F(this.a, anjjVar.a) && d.F(this.b, anjjVar.b) && d.F(this.c, anjjVar.c) && d.F(this.d, anjjVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GroupInfo(id=" + this.a + ", properties=" + this.b + ", features=" + this.c + ", members=" + this.d + ")";
    }
}
