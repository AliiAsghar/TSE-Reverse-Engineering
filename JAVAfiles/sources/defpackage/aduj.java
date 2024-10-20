package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduj implements Comparable {
    public final long a;
    public final adpe b;

    public aduj(adpe adpeVar) {
        this.b = adpeVar;
        this.a = System.currentTimeMillis() + (adpeVar.j * 1000);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j;
        aduj adujVar = (aduj) obj;
        if (adujVar == null) {
            j = 1;
        } else {
            j = this.a - adujVar.a;
        }
        return (int) j;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aduj) && this.b.equals(((aduj) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
