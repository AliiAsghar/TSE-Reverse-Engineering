package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ascs implements ascp {
    private final /* synthetic */ int b;

    public ascs(int i) {
        this.b = i;
    }

    @Override // defpackage.ascp
    public final asai a(ascv ascvVar) {
        if (this.b != 0) {
            return new aghw(ascm.a, 9);
        }
        return new asaa(new akgp(ascvVar, (arpe) null, 5));
    }

    public final String toString() {
        if (this.b != 0) {
            return "SharingStarted.Eagerly";
        }
        return "SharingStarted.Lazily";
    }
}
