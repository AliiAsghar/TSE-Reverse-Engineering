package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fid {
    public static final fid a = new fid(new esa[0]);
    public final int b;
    public final alog c;
    private int d;

    static {
        eul.M(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fid(esa... esaVarArr) {
        this.c = alog.p(esaVarArr);
        this.b = esaVarArr.length;
        int i = 0;
        while (i < ((alsx) this.c).c) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                alog alogVar = this.c;
                if (i3 < ((alsx) alogVar).c) {
                    if (((esa) alogVar.get(i)).equals(this.c.get(i3))) {
                        eub.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final int a(esa esaVar) {
        int indexOf = this.c.indexOf(esaVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final esa b(int i) {
        return (esa) this.c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fid fidVar = (fid) obj;
            if (this.b == fidVar.b && alzz.at(this.c, fidVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = this.c.hashCode();
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }
}
