package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihz {
    public static final alog a;
    public final aihy b;
    public final apip c;
    public final List d;
    public final Optional e;
    public final Optional f;
    public final long g;

    static {
        int i = alog.d;
        a = alsx.a;
    }

    public aihz() {
        throw null;
    }

    public final boolean a() {
        return this.e.isPresent();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aihz) {
            aihz aihzVar = (aihz) obj;
            if (this.b.equals(aihzVar.b) && this.c.equals(aihzVar.c) && this.d.equals(aihzVar.d) && this.e.equals(aihzVar.e) && this.f.equals(aihzVar.f) && this.g == aihzVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        long j = this.g;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        List list = this.d;
        apip apipVar = this.c;
        return "LoggableResponse{query=" + String.valueOf(this.b) + ", result=" + apipVar.toString() + ", resolvedTargets=" + list.toString() + ", failureType=" + optional2.toString() + ", clientExceptionType=" + String.valueOf(optional) + ", responseTimeMillis=" + this.g + "}";
    }

    public aihz(aihy aihyVar, apip apipVar, List list, Optional optional, Optional optional2, long j) {
        this.b = aihyVar;
        if (apipVar == null) {
            throw new NullPointerException("Null result");
        }
        this.c = apipVar;
        if (list != null) {
            this.d = list;
            this.e = optional;
            if (optional2 != null) {
                this.f = optional2;
                this.g = j;
                return;
            }
            throw new NullPointerException("Null clientExceptionType");
        }
        throw new NullPointerException("Null resolvedTargets");
    }
}
