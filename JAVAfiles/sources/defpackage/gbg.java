package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbg extends dyh {
    public static final gbg a;
    public final gbb b;
    public final List c;
    public final int d;
    public final int e;
    public final gba f;
    public final gba g;

    static {
        List y = aqjn.y(gec.a);
        gay gayVar = gay.b;
        gay gayVar2 = gay.a;
        a = new gbg(gbb.REFRESH, y, 0, 0, new gba(gayVar, gayVar2, gayVar2));
    }

    public gbg(gbb gbbVar, List list, int i, int i2, gba gbaVar) {
        super(null);
        this.b = gbbVar;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = gbaVar;
        this.g = null;
        if (gbbVar != gbb.APPEND && i < 0) {
            throw new IllegalArgumentException("Prepend insert defining placeholdersBefore must be > 0, but was " + i);
        }
        if (gbbVar != gbb.PREPEND && i2 < 0) {
            throw new IllegalArgumentException("Append insert defining placeholdersAfter must be > 0, but was " + i2);
        }
        if (gbbVar == gbb.REFRESH && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b7 -> B:10:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0071 -> B:11:0x008e). Please report as a decompilation issue!!! */
    @Override // defpackage.dyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arqv r18, defpackage.arpe r19) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbg.d(arqv, arpe):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbg)) {
            return false;
        }
        gbg gbgVar = (gbg) obj;
        if (this.b != gbgVar.b || !d.F(this.c, gbgVar.c) || this.d != gbgVar.d || this.e != gbgVar.e || !d.F(this.f, gbgVar.f)) {
            return false;
        }
        gba gbaVar = gbgVar.g;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31;
    }

    public final String toString() {
        String str;
        Object obj;
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((gec) it.next()).c.size();
        }
        int i2 = this.d;
        String str2 = "none";
        if (i2 == -1) {
            str = "none";
        } else {
            str = String.valueOf(i2);
        }
        int i3 = this.e;
        if (i3 != -1) {
            str2 = String.valueOf(i3);
        }
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.b);
        sb.append(", with ");
        sb.append(i);
        sb.append(" items (\n                    |   first item: ");
        gec gecVar = (gec) aqjn.Z(this.c);
        Object obj2 = null;
        if (gecVar != null) {
            obj = aqjn.Z(gecVar.c);
        } else {
            obj = null;
        }
        sb.append(obj);
        sb.append("\n                    |   last item: ");
        gec gecVar2 = (gec) aqjn.ad(this.c);
        if (gecVar2 != null) {
            obj2 = aqjn.ad(gecVar2.c);
        }
        sb.append(obj2);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(str);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(str2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.f);
        sb.append("\n                    ");
        return arsd.s(sb.toString().concat("|)"));
    }
}
