package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfk implements hfh {
    public final boolean a;
    public final int b;

    public hfk(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.hfh
    public final hbz a(hbl hblVar, hbb hbbVar, hfw hfwVar) {
        if (!hblVar.i) {
            hhw.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new hci(this);
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "EXCLUDE_INTERSECTIONS";
                        }
                    } else {
                        str = "INTERSECT";
                    }
                } else {
                    str = "SUBTRACT";
                }
            } else {
                str = "ADD";
            }
        } else {
            str = "MERGE";
        }
        return a.bW(str, "MergePaths{mode=", "}");
    }
}
