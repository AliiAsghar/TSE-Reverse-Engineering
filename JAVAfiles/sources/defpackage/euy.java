package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euy implements Comparable {
    public long c;
    public long b = -9223372036854775807L;
    public final euf a = new euf();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        euy euyVar = (euy) obj;
        int compare = Long.compare(this.b, euyVar.b);
        if (compare != 0) {
            return compare;
        }
        return Long.compare(this.c, euyVar.c);
    }
}
