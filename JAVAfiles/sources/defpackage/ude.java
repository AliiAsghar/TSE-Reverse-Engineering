package defpackage;

import android.content.ContentValues;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ude {
    public final agni a;
    public final udf b;
    public final alhr c;
    public final agnw d;
    public final boolean e;
    public final AtomicInteger f;
    public final AtomicLong g;
    public final AtomicLong h;
    public final AtomicBoolean i;
    public final agoz j;
    private final alhr k;
    private final String l;
    private final ContentValues m;

    public ude() {
        throw null;
    }

    public static udd b() {
        udd uddVar = new udd();
        uddVar.d = new AtomicInteger(0);
        uddVar.b(false);
        uddVar.c = new ubz(2);
        uddVar.c(agni.a);
        uddVar.f = new AtomicLong(-1L);
        uddVar.e = new AtomicLong(-1L);
        uddVar.g = new AtomicBoolean(true);
        return uddVar;
    }

    public final ucn a() {
        ucn ucnVar = (ucn) this.k.get();
        if (ucnVar == null) {
            return ucn.a(null, null);
        }
        return ucnVar;
    }

    public final boolean equals(Object obj) {
        alhr alhrVar;
        String str;
        ContentValues contentValues;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ude) {
            ude udeVar = (ude) obj;
            if (this.a.equals(udeVar.a) && this.b.equals(udeVar.b) && ((alhrVar = this.c) != null ? alhrVar.equals(udeVar.c) : udeVar.c == null) && this.d.equals(udeVar.d) && this.e == udeVar.e && this.k.equals(udeVar.k) && this.f.equals(udeVar.f) && this.g.equals(udeVar.g) && this.h.equals(udeVar.h) && this.i.equals(udeVar.i) && ((str = this.l) != null ? str.equals(udeVar.l) : udeVar.l == null) && ((contentValues = this.m) != null ? contentValues.equals(udeVar.m) : udeVar.m == null)) {
                agoz agozVar = this.j;
                agoz agozVar2 = udeVar.j;
                if (agozVar != null ? agozVar.equals(agozVar2) : agozVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        alhr alhrVar = this.c;
        int i2 = 0;
        if (alhrVar == null) {
            hashCode = 0;
        } else {
            hashCode = alhrVar.hashCode();
        }
        int hashCode5 = ((((hashCode4 * 1000003) ^ hashCode) * 1000003) ^ this.d.hashCode()) * 1000003;
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode6 = (((((((((((hashCode5 ^ i) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        String str = this.l;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (hashCode6 ^ hashCode2) * 1000003;
        ContentValues contentValues = this.m;
        if (contentValues == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = contentValues.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        agoz agozVar = this.j;
        if (agozVar != null) {
            i2 = agozVar.hashCode();
        }
        return i4 ^ i2;
    }

    public final String toString() {
        agoz agozVar = this.j;
        ContentValues contentValues = this.m;
        AtomicBoolean atomicBoolean = this.i;
        AtomicLong atomicLong = this.h;
        AtomicLong atomicLong2 = this.g;
        AtomicInteger atomicInteger = this.f;
        alhr alhrVar = this.k;
        agnw agnwVar = this.d;
        alhr alhrVar2 = this.c;
        udf udfVar = this.b;
        return "MetaData{loggingTag=" + String.valueOf(this.a) + ", operationCategory=" + String.valueOf(udfVar) + ", canonicalSql=" + String.valueOf(alhrVar2) + ", database=" + String.valueOf(agnwVar) + ", exemptFromQueryPlanChecking=" + this.e + ", sqlAndArgs=" + String.valueOf(alhrVar) + ", resultCount=" + String.valueOf(atomicInteger) + ", threadTimeMillis=" + String.valueOf(atomicLong2) + ", elapsedTimeMillis=" + String.valueOf(atomicLong) + ", isInFlight=" + String.valueOf(atomicBoolean) + ", tableName=" + this.l + ", contentValuesForUpdate=" + String.valueOf(contentValues) + ", sourceQuery=" + String.valueOf(agozVar) + "}";
    }

    public ude(agni agniVar, udf udfVar, alhr alhrVar, agnw agnwVar, boolean z, alhr alhrVar2, AtomicInteger atomicInteger, AtomicLong atomicLong, AtomicLong atomicLong2, AtomicBoolean atomicBoolean, String str, ContentValues contentValues, agoz agozVar) {
        this.a = agniVar;
        this.b = udfVar;
        this.c = alhrVar;
        this.d = agnwVar;
        this.e = z;
        this.k = alhrVar2;
        this.f = atomicInteger;
        this.g = atomicLong;
        this.h = atomicLong2;
        this.i = atomicBoolean;
        this.l = str;
        this.m = contentValues;
        this.j = agozVar;
    }
}
