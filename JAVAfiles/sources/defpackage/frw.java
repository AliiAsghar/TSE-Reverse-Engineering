package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frw extends frf implements Comparable {
    public static final /* synthetic */ int j = 0;
    public long i;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        frw frwVar = (frw) obj;
        if (eR() != frwVar.eR()) {
            if (!eR()) {
                return -1;
            }
            return 1;
        }
        long j2 = this.f - frwVar.f;
        if (j2 == 0) {
            j2 = this.i - frwVar.i;
            if (j2 == 0) {
                return 0;
            }
        }
        if (j2 <= 0) {
            return -1;
        }
        return 1;
    }
}
