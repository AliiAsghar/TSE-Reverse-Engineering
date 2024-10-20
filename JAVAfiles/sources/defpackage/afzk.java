package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzk {
    static final /* synthetic */ artm[] a;
    public final aflj b;
    public final afzh c;
    public final afkr d;
    public final afys e;
    public final aflb f;
    public final arsn g;

    static {
        arrr arrrVar = new arrr(afzk.class, "textControl", "getTextControl()Lcom/google/android/libraries/compose/ui/composable/text/HugoDraftTextUiData$TextControl;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    public afzk() {
        this(null, 7);
    }

    public final void a(afzi afziVar) {
        this.g.d(a[0], afziVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afzk)) {
            return false;
        }
        afzk afzkVar = (afzk) obj;
        if (d.F(this.b, afzkVar.b) && d.F(this.c, afzkVar.c) && d.F(this.d, afzkVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        aflj afljVar = this.b;
        int i = 0;
        if (afljVar == null) {
            hashCode = 0;
        } else {
            hashCode = afljVar.hashCode();
        }
        afzh afzhVar = this.c;
        if (afzhVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = afzhVar.hashCode();
        }
        int i2 = hashCode * 31;
        afkr afkrVar = this.d;
        if (afkrVar != null) {
            i = afkrVar.hashCode();
        }
        return ((i2 + hashCode2) * 31) + i;
    }

    public final String toString() {
        return "HugoDraftTextUiData(textChangeListener=" + this.b + ", contentInsertionListener=" + this.c + ", emojiUsageListener=" + this.d + ")";
    }

    public afzk(aflj afljVar, afzh afzhVar, afkr afkrVar) {
        this.b = afljVar;
        this.c = afzhVar;
        this.d = afkrVar;
        afys afysVar = new afys();
        this.e = afysVar;
        this.f = afysVar;
        this.g = new afzj(this);
    }

    public /* synthetic */ afzk(aflj afljVar, int i) {
        this(1 == (i & 1) ? null : afljVar, null, null);
    }
}
