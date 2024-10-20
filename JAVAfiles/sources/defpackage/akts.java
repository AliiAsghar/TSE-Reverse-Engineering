package defpackage;

import android.util.SparseArray;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akts {
    public final String a;
    public final UUID b;
    public final aktq c;
    public final SparseArray d;
    public final int e;

    public akts() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akts) {
            akts aktsVar = (akts) obj;
            if (this.a.equals(aktsVar.a) && this.b.equals(aktsVar.b) && this.c.equals(aktsVar.c) && this.d.equals(aktsVar.d) && this.e == aktsVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        SparseArray sparseArray = this.d;
        aktq aktqVar = this.c;
        return "TraceSnapshot{name=" + this.a + ", rootTraceId=" + String.valueOf(this.b) + ", record=" + String.valueOf(aktqVar) + ", spanExtrasSparseArray=" + String.valueOf(sparseArray) + ", numUnfinishedSpans=" + this.e + "}";
    }

    public akts(String str, UUID uuid, aktq aktqVar, SparseArray sparseArray, int i) {
        this.a = str;
        this.b = uuid;
        this.c = aktqVar;
        this.d = sparseArray;
        this.e = i;
    }
}
